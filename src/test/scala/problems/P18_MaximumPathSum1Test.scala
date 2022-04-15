package problems

import munit.FunSuite
import res.FromFileData.p18Triangle

class P18_MaximumPathSum1Test extends FunSuite :

  val input0 = List(List(5))
  val input1: List[List[Int]] = List(List(3), List(7, 4), List(2, 4, 6), List(8, 5, 9, 3)).reverse
  val input2: List[List[Int]] = p18Triangle.reverse

  test("max path 1 elem matrix") {
    assertEquals(maxPathSum1(input0), 5)
  }

  test("max path 10 elem matrix") {
    assertEquals(maxPathSum1(input1), 23)
  }

  test("max path 136 elem matrix") {
    assertEquals(maxPathSum1(input2), 1074)
  }
  