package problems

import munit.FunSuite

class P51_PrimeDigitReplacementsTest extends FunSuite:

  test("primeDigitReplacementMin 7") {
    assertEquals(primeDigitReplacementsMin(7), 56003)
  }

  test("primeDigitReplacementMin 8") {
    assertEquals(primeDigitReplacementsMin(8), 121313)
  }

  test("hasSameDigits 2448") {
    assertEquals(hasSameDigits(2448), true)
  }

  test("hasSameDigits 2480 no") {
    assertEquals(hasSameDigits(248), false)
  }

  test("primeCompanions 56003") {
    val set = Set(56003, 56113, 56333, 56443, 56663, 56773, 56993)
    assertEquals(primeCompanionsSameLength(56003, set), set)
  }
