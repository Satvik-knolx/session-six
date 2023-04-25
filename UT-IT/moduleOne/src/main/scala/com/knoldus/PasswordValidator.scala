
package com.knoldus


import com.typesafe.scalalogging.Logger

import scala.io.StdIn.readLine
import scala.util.{Failure, Success, Try}

class PasswordValidator {

  val loggerObject: Logger = Logger(getClass)
  def passwordChecker(userName: String, userEmail: String, userPassword: String): Boolean = {
    if (userPassword.isEmpty) throw new Exception("Password is required")
    val validSmallCase = "[a-z]+".r.findFirstIn(userPassword).isDefined
    val validUpperCase = "[A-Z]+".r.findFirstIn(userPassword).isDefined
    val validAlphaNumeric = "[0-9]+".r.findFirstIn(userPassword).isDefined
    val includeCharacter = "[%@#&$]+".r.findFirstIn(userPassword).isDefined
    val avoidUserName = !userPassword.toLowerCase.startsWith(userName.toLowerCase)
    val passwordLength = userPassword.length >= 8
    if (validSmallCase && validUpperCase && validAlphaNumeric && includeCharacter && avoidUserName && passwordLength) {
      true
    } else {
      false
    }
  }
}
object PasswordValidator extends App {
  private val passwordValidatorObject = new PasswordValidator
  Try {
    passwordValidatorObject.passwordChecker(
      userName = readLine("Enter Name: "),
      userEmail = readLine("Enter Email ID: "),
      userPassword = readLine("Enter Password: ")
    )} match {
    case Success(value) =>  {
      if(value) {
        passwordValidatorObject.loggerObject.info("Strong Password")
      } else {
        passwordValidatorObject.loggerObject.warn("Weak Password")
      }
    }
    case Failure(exception) => passwordValidatorObject.loggerObject.error("Exception Occurred: " + exception.getMessage)
  }
}

