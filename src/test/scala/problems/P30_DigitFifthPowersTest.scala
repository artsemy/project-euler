package problems

import munit.FunSuite

class P30_DigitFifthPowersTest extends FunSuite:

  test("digitsAmountBorder 9^4") {
    assertEquals(digitsAmountBorder(4), 5)
  }

  test("digitsAmountBorder 9^5") {
    assertEquals(digitsAmountBorder(5), 6)
  }

  test("digitPowers 3") {
    assertEquals(digitFifthPowers(3), 1301)
  }

  test("digitPowers 4") {
    assertEquals(digitFifthPowers(4), 19316)
  }

  test("digitPowers 5") {
    assertEquals(digitFifthPowers(5), 443839)
  }

  test("digitPowers 3 v2") {
    assertEquals(digitFifthPowersV2(3), 1301)
  }

  test("digitPowers 4 v2") {
    assertEquals(digitFifthPowersV2(4), 19316)
  }

  test("digitPowers 5 v2") {
    assertEquals(digitFifthPowersV2(5), 443839)
  }

  test("checkDigitsPowersSum ^3 153") {
    assertEquals(checkDigitsPowersSum(Seq((1, 1), (3, 27), (5, 125))), 153)
  }

  test("checkDigitsPowersSum ^4 2562") {
    assertEquals(checkDigitsPowersSum(Seq((2, 16), (5, 625), (5, 625), (6, 1296))), 0)
  }