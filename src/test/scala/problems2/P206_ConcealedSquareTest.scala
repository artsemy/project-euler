package problems2

import munit.FunSuite

class P206_ConcealedSquareTest extends FunSuite:

  test("concealedSquare") { // long 1.5 min
    assertEquals(concealedSquare(), BigInt("1389019170"))
  }

  test("is masked") {
    assertEquals(isMasked(BigInt("1122334455667788990")), true)
  }

  test("is masked no") {
    assertEquals(isMasked(BigInt("2122334455667788990")), false)
  }