
package com.knoldus.validator
import com.knoldus.models.User
import org.scalatest.funsuite.AnyFunSuite

class UserValidatorTest extends AnyFunSuite {
  val userValidatorObject = new UserValidator
  private val age = 25
  test("if company name already exists"){
    assert(userValidatorObject.userIsValid(User("Satvik", "Gupta", age, "knoldus@gmail.com", "Knoldus")))
  }
  test("if company name doesn't exists"){
    assert(!userValidatorObject.userIsValid(User("Satvik", "Gupta", age, "knoldus@gmail.com", "NashTech")))
  }
  test("if email is invalid"){
    assert(!userValidatorObject.userIsValid(User("Satvik", "Gupta", age, "knoldus.com", "Knoldus")))
  }

}
