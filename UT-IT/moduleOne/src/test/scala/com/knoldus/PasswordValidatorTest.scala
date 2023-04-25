
package com.knoldus


import org.scalatest.funsuite.AnyFunSuite

class PasswordValidatorTest extends AnyFunSuite {
  val passwordValidatorObj = new PasswordValidator
  test("should return true as password contains Uppercase, lowercase, alphanumeric, symbols and doesn't contains username in password") {
    assert(passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "Password123#"))
  }
  test("should return false as password doesn't contains Uppercase") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "password123#"))
  }
  test("should return false as password doesn't contains lowercase") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "PASSWORD123#"))
  }
  test("should return false as password doesn't contains alphanumeric") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "password#"))
  }
  test("should return false as password doesn't contains symbols") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "password1234"))
  }
  test("should return false as password contains username in password") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "Satvik123#"))
  }
  test("should return false as password length is les than eight characters") {
    assert(!passwordValidatorObj.passwordChecker("Satvik", "satvik@knoldus.com", "Pass12#"))
  }
}
