package problems

import munit.FunSuite

class P39_IntegerRightTrianglesTest extends FunSuite:

  test("integerRightTriangle") {
    assertEquals(integerRightTriangles(1000), 840)
  }