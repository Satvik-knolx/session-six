
package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplTest extends AnyFunSuite {

  val companyReadDto = new CompanyReadDto
  val employeeValidator = new EmployeeValidator
  val employeeImpl = new EmployeeImpl(employeeValidator)
  val age = 24
  val salary = 18000
  val firstEmployee: Employee = Employee("Satvik ","Gupta",age,salary,"Intern","Knoldus","Satvik@knoldus.com")
  val secondEmployee: Employee = Employee("Pradyuman","Singh",age,salary,"Intern","Swiggy","Pradyuman@swiggy.com")

  test("To check that employee created exists") {
    assert(employeeImpl.createEmployee(firstEmployee).contains("Satvik@knoldus.com"))
  }
  test("To check that employee created does not exists") {
    assert(employeeImpl.createEmployee(secondEmployee).isEmpty)
  }
}