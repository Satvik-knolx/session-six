
package com.knoldus.validator

import com.knoldus.models.Employee
import org.scalatest.funsuite.AnyFunSuite

class EmployeeValidatorTest extends AnyFunSuite {
  val employeeValidatorObject = new EmployeeValidator
  private val age = 25
  private val salary = 18000
  test("if company name already exists") {
    assert(employeeValidatorObject.employeeIsValid(Employee("Satvik", "Gupta", age, salary, "Intern", "Knoldus", "knoldus@gmail.com")))
  }
  test("if company name exists but invalid email") {
    assert(!employeeValidatorObject.employeeIsValid(Employee("Satvik", "Gupta", age, salary, "Intern", "Knoldus", "knoldus.com")))
  }
  test("if company name doesn't exists") {
    assert(!employeeValidatorObject.employeeIsValid(Employee("Satvik", "Gupta", age, salary, "Intern", "Nash tech", "knoldus@gmail.com")))
  }

}
