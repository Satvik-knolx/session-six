
package com.knoldus.validator

import com.typesafe.scalalogging.Logger

import scala.io.StdIn.readLine
import scala.util.{Success, Try, Failure}

class EmailValidator {
  val logger: Logger = Logger(getClass)
  def emailIdIsValid(emailId: String): Boolean = {
    val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$" .r
    emailId match {
      case emailRegex() =>
        logger.info("Email is valid.")
        true
      case _ =>
        logger.info("Email is invalid.")
        false
    }
  }
}

object EmailValidator extends App {
  private val emailValidatorObj = new EmailValidator
  private val emailID = readLine("Email-Id: ")
  Try {
    emailValidatorObj.emailIdIsValid(emailID)
  } match {
    case Success(value) =>
      if (value) {
        emailValidatorObj.logger.info("Email is valid")
      } else {
        emailValidatorObj.logger.warn("Email is invalid")
      }
    case Failure(exception) => emailValidatorObj.logger.error("Exception Occurred: " + exception.getMessage)
  }
}

