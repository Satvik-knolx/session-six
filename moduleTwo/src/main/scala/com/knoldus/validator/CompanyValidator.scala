
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl

class CompanyValidator {

  private val companyReadDto = new CompanyReadDto
  private val emailValidator = new EmailValidator
  def companyIsValid(company: Company): Boolean = {
    if (companyReadDto.getCompanyByName(company.name).isEmpty) {
      emailValidator.emailIdIsValid(company.emailId)
    }else {
      false
    }
  }
}
