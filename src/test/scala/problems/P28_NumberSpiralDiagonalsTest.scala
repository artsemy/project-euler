package problems

import munit.FunSuite

class P28_NumberSpiralDiagonalsTest extends FunSuite:

  test("numberSpiralDiagonals 5 ") {
    assertEquals(numberSpiralDiagonals(5), 101)
  }

  test("numberSpiralDiagonals 1001") {
    assertEquals(numberSpiralDiagonals(1001), 669171001)
  }
