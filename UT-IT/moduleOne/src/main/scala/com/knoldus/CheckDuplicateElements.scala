
package com.knoldus

import com.typesafe.scalalogging.Logger
import scala.util.{Try, Success, Failure}

class CheckDuplicateElements {

  private val loggerObj: Logger = Logger(getClass)

  def checkDuplicateElements[T](list: List[T]): Boolean = {

    val duplicateElements = list.distinct
    val result = duplicateElements == list
    if (list.isEmpty) {
      loggerObj.info("List is empty.")
      false
    }else if (result) {
      loggerObj.info("List does not contains duplicate elements.")
      true
    }else {
      loggerObj.info("list contains duplicate elements.")
      false
    }
  }
}