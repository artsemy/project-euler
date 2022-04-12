package problems

import munit.FunSuite
import problems.P25_1000DigitFibonacciNumber._

class P25_1000DigitFibonacciNumberTest extends FunSuite :

  test("fibIndex with 3 digits") {
    assertEquals(fibIndex(3), 12)
  }

  test("fibIndex with 1000 digits") {
    assertEquals(fibIndex(1000), 4782)
  }