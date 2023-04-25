
package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.funsuite.AnyFunSuite

class UserImplTest extends AnyFunSuite {

  val companyReadDto = new CompanyReadDto
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)
  val age = 24
  val firstUser: User = User("Satvik", "Gupta", age, "Satvik@knoldus.com.com", "Knoldus")
  val secondUser: User = User("Pradyuman", "Singh", age, "Pradyuman@swiggy.com", "Swiggy")

  test("To check that user created exists") {
    assert(userImpl.createUser(firstUser).contains("Satvik@knoldus.com.com"))
  }
  test("To check that employee created does not exists") {
    assert(userImpl.createUser(secondUser).isEmpty)
  }
}