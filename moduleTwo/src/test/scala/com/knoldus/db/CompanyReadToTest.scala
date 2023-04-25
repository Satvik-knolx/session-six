
package com.knoldus.db

import com.knoldus.models.Company
import org.scalatest.funsuite.AnyFunSuite

class CompanyReadToTest extends AnyFunSuite {
  val companyReadToObject = new CompanyReadDto

  test("To check if the company is present in the database") {
    val result = Some(Company("Knoldus", "knoldus@gmail.com", "Noida"))
    assert(companyReadToObject.getCompanyByName("Knoldus") == result)
  }
  test("To check if the company is not present in the database") {
    assert(companyReadToObject.getCompanyByName("Swiggy").isEmpty)
  }
}