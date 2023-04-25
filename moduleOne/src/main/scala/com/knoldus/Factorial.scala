
package com.knoldus

import com.typesafe.scalalogging.Logger

class Factorial {
  val loggerObject: Logger = Logger(getClass)
    def findFactorial(element: Int,value:Int): Int = {
      if (element <= 0) {
        loggerObject.info("Value must be greater than zero in order to find factorial")
        0
      } else if (element == 1) {
        loggerObject.info(s"Factorial value is: $value")
        value
      } else {
        findFactorial(element - 1,value * element)
      }
  }

}
