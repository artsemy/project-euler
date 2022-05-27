package problems

import munit.FunSuite

class P76_CountingSummationsTest extends FunSuite:

  test("counting summations 5") {
    assertEquals(countingSummations(7), BigInt(6))
  }

  test("counting summations 100") {
    assertEquals(countingSummations(100), BigInt(-1))
  }
