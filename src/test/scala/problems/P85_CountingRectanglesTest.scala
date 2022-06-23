package problems

import munit.FunSuite

class P85_CountingRectanglesTest extends FunSuite:

  test("count rect 2x3") {
    assertEquals(countRectangles(2, 3), 18)
  }

  test("count rect v2 3x4") {
    assertEquals(countRectanglesV2(3, 4), 60)
  }

  test("find nearest") {
    assertEquals(findAreaWithNumberOfRectangles(2000000), 2772)
  }
