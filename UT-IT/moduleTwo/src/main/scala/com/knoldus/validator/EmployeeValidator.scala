
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {
  val companyReadDtoObject = new CompanyReadDto
  val emailValidatorObject = new EmailValidator

  def employeeIsValid(employee: Employee): Boolean = {
    if (companyReadDtoObject.getCompanyByName(employee.companyName).isDefined && emailValidatorObject.emailIdIsValid(employee.emailId)) {
      true
    } else {
      false
    }
  }
}
