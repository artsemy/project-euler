package problems2

import munit.FunSuite

class P104_PandigitalFibonacciEndsTest extends FunSuite:

  test("pandigitalFibonacciEnds".ignore) { // 25min
    assertEquals(pandigitalFibonacciEnds(), BigInt(329468))
  }
