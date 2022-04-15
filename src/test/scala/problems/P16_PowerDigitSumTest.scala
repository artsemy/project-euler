package problems

import munit.FunSuite

class P16_PowerDigitSumTest extends FunSuite:

  test("power digit sum 2^0") {
    assertEquals(pDigitSum(2, 0), 1)
  }

  test("power digit sum 2^15") {
    assertEquals(pDigitSum(2, 15), 26)
  }

  test("power digit sum 2^1000") {
    assertEquals(pDigitSum(2, 1000), 1366)
  }

