package problems

import munit.FunSuite

class P37_TruncatablePrimesTest extends FunSuite:

  test("truncatablePrimesSum") {
    assertEquals(truncatablePrimesSum(), 748317)
  }

  test("isTruncatable 739397") {
    assertEquals(isFullTruncatable(739397), true)
  }

  test("isRightTruncatable 7333") {
    assertEquals(isRightTruncable(7333), true)
  }

  test("isLeftTruncatable 997") {
    assertEquals(isLeftTruncable(997), true)
  }
