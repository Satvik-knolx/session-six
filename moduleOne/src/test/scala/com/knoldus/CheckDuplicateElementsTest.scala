
package com.knoldus


import org.scalatest.funsuite.AnyFunSuite

class CheckDuplicateElementsTest extends AnyFunSuite {
  val checkDuplicateObj = new CheckDuplicateElements
  val elementOne = 1
  val elementTwo = 2
  val elementThree = 3
  val elementFour = 4
  val elementFive = 5

  val distinctList: List[Int] = List(elementOne, elementTwo, elementThree, elementFour, elementFive)
  val duplicateList: List[Int] = List(elementOne, elementTwo, elementThree, elementTwo, elementThree, elementFour, elementFive)

  test("if list contains distinct elements it should return true") {
    assert(checkDuplicateObj.checkDuplicateElements(distinctList))
  }

  test ("if list contains duplicate elements it should return false") {
    assert(!checkDuplicateObj.checkDuplicateElements(duplicateList))
  }

  test("if list contains duplicate values") {
    assert(!checkDuplicateObj.checkDuplicateElements(List.empty))
  }
}
