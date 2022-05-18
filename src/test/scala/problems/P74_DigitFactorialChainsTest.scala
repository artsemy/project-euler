package problems

import munit.FunSuite

class P74_DigitFactorialChainsTest extends FunSuite:

  test("digit factorial chains 1M - 60") {
    assertEquals(digitFactorialChains(1000000, 60), 402)
  }
