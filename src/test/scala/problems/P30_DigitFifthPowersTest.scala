package problems

import munit.FunSuite

class P30_DigitFifthPowersTest extends FunSuite:

  test("digitsAmountBorder 9^4") {
    assertEquals(digitsAmountBorder(4), 5)
  }

  test("digitsAmountBorder 9^5") {
    assertEquals(digitsAmountBorder(5), 6)
  }

  test("digitPowers 4") {
    assertEquals(digitFifthPowers(4), 19316)
  }

  test("digitPowers 5") {
    assertEquals(digitFifthPowers(5), 443839)
  }
