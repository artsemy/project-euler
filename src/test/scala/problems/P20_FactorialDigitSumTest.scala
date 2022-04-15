package problems

import munit.FunSuite

class P20_FactorialDigitSumTest extends FunSuite:

  test("factorDigitSum 10") {
    assertEquals(factorDigitSum(10), 27)
  }

  test("factorDigitSum 100") {
    assertEquals(factorDigitSum(100), 648)
  }
