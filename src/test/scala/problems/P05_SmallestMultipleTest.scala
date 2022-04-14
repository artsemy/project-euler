package problems

import munit.FunSuite

class P05_SmallestMultipleTest extends FunSuite:

  test("minimal multiple 1 to 1 numbers") {
    assertEquals(findMultiple(1), 1)
  }

  test("minimal multiple 1 to 10 numbers") {
    assertEquals(findMultiple(10), 2520)
  }

  test("minimal multiple 1 to 20 numbers") {
    assertEquals(findMultiple(20), 232792560)
  }

  test("minimal multiple 1 to 1 numbers v2") {
    assertEquals(findMultipleV2(1), 1)
  }

  test("minimal multiple 1 to 10 numbers v2") {
    assertEquals(findMultipleV2(10), 2520)
  }

  test("minimal multiple 1 to 20 numbers v2") {
    assertEquals(findMultipleV2(20), 232792560)
  }
