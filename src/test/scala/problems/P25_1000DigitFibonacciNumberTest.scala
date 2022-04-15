package problems

import munit.FunSuite

class P25_1000DigitFibonacciNumberTest extends FunSuite :

  test("fibIndex with 3 digits") {
    assertEquals(fibDigitLengthIndex(3), 12)
  }

  test("fibIndex with 1000 digits") {
    assertEquals(fibDigitLengthIndex(1000), 4782)
  }