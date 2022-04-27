package problems

import munit.FunSuite

class P40_ChampernownesConstantTest extends FunSuite:

  test("champernownesConstant") {
    assertEquals(champernownesConstant(12), 1)
  }

  test("champernownesConstantMulti") {
    assertEquals(champernownesConstantMulti(Seq(1, 10, 100, 1000, 10000, 100000, 1000000)), 210)
  }
