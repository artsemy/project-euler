package problems

import munit.FunSuite

class P76_CountingSummationsTest extends FunSuite:

  test("counting summations 5") {
    assertEquals(countingSummations(2), BigInt(1))
  }

  test("counting summations 5 v2") {
    assertEquals(countingSummationsV2(100), BigInt(12))
  }

  test("counting summations 100") {
    assertEquals(countingSummations(100), BigInt(-1))
  }
