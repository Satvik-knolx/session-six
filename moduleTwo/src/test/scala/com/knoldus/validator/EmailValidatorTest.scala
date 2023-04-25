
package com.knoldus.validator

import com.typesafe.scalalogging.Logger
import org.scalatest.funsuite.AnyFunSuite

class EmailValidatorTest extends AnyFunSuite {
  val emailValidatorObject = new EmailValidator
  val logger: Logger = Logger(getClass)

  test("if email is invalid it should return false"){
    assert(!emailValidatorObject.emailIdIsValid("abc.com"))
  }
  test("if email is valid it should return true"){
    assert(emailValidatorObject.emailIdIsValid("example@email.com"))
  }

}
