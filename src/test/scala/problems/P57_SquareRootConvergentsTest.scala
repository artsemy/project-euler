package problems

import munit.FunSuite

class P57_SquareRootConvergentsTest extends FunSuite:

  test("squareRootConvergents 9") {
    assertEquals(squareRootConvergents(9), 1)
  }

  test("squareRootConvergents 1000") {
    assertEquals(squareRootConvergents(1000), 153)
  }

  test("expansions 4") {
    assertEquals(expansions().take(1), LazyList[(BigInt, BigInt)]((BigInt(3), BigInt(2))))
  }

  test("isNumeratorLonger (123, 321)") {
    assertEquals(isNumeratorLonger(BigInt(123), BigInt(321)), false)
  }

  test("isNumeratorLonger (123, 6321)") {
    assertEquals(isNumeratorLonger(BigInt(123), BigInt(6321)), false)
  }

  test("isNumeratorLonger (1123, 321)") {
    assertEquals(isNumeratorLonger(BigInt(1123), BigInt(321)), true)
  }
