
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.request.CompanyImpl
import com.typesafe.scalalogging.Logger

import scala.reflect.internal.NoPhase.assignsFields.&&

class UserValidator {
  val emailValidatorObject = new EmailValidator
  private val companyReadDtoObject = new CompanyReadDto
  def userIsValid(user: User): Boolean = {
    if (companyReadDtoObject.getCompanyByName(user.companyName).isDefined && emailValidatorObject.emailIdIsValid(user.emailId)) {
      true
    }else {
      false
    }
  }
}
