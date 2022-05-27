package problems

import munit.FunSuite

class P92_SquareDigitChainsTest extends FunSuite:

  test("squaredigit count up to 10000000") {
    assertEquals(squareDigitChainsCount(10000000), 8581146)
  }

  test("last number in chain") {
    assertEquals(lastNumberInChain(44), 1)
    assertEquals(lastNumberInChain(85), 89)
  }
