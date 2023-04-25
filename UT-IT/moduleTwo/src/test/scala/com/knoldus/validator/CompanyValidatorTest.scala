
package com.knoldus.validator
import com.knoldus.models.Company

import org.scalatest.funsuite.AnyFunSuite

class CompanyValidatorTest extends AnyFunSuite{
  val companyValidatorObject = new CompanyValidator
  test("if company already exist in company database it should return false"){
    val input = companyValidatorObject.companyIsValid(Company("Knoldus","knoldus@gmail.com","Noida"))
    assert(!input)
  }
  test("if company doesn't exist in company database and email is invalid it should return false"){
    val input = companyValidatorObject.companyIsValid(Company("Google","knoldus.com","Noida"))
    assert(!input)
  }
  test("if company doesn't exist in company database and email is valid it should return false"){
    val input = companyValidatorObject.companyIsValid(Company("Google","google@gmail.com","Noida"))
    assert(input)
  }
}
