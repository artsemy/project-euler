package problems

import problems.P05_SmallestMultiple.findMultiple
import munit.FunSuite

class P05_SmallestMultipleTest extends FunSuite:

  test("minimal multiple 1 to 10 numbers") {
    val mult = findMultiple(10)
    assertEquals(mult, 2520)
  }

  test("minimal multiple 1 to 20 numbers") {
    val mult = findMultiple(20)
    assertEquals(mult, 232792560)
  }
