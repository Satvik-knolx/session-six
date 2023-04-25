
package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.funsuite.AnyFunSuite

class CompanyImplTest extends AnyFunSuite {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  val knoldus: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val swiggy: Company = Company("Swiggy","swiggy@gmail.com","Mumbai")

  test("To check that company created does not exists") {
    assert(companyImpl.createCompany(knoldus).isEmpty)
  }
  test("To check that company created exists") {
    assert(companyImpl.createCompany(swiggy).contains("Swiggy"))
  }
}