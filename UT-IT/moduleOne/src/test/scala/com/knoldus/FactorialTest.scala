
package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite {
  val factorial = new Factorial
  val oneElement: Int = 1
  val negativeElement: Int = -2
  val factorialElement: Int = 5

  test("for negative value result factorial should print a message") {
    assert(factorial.findFactorial(negativeElement,0) == 0)
  }
  test("if element value is zero result well be 1") {
    assert(factorial.findFactorial(oneElement,1) == 1)
  }
  test("for positive value result of factorial will print ") {
    assert(factorial.findFactorial(factorialElement,1) == 120)
  }
}
