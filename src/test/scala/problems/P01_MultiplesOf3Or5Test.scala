package problems

import problems.P01_MultiplesOf3Or5._
import munit.FunSuite

class P01_MultiplesOf3Or5Test extends FunSuite :

  test("sum of the multiples of 3 or 5 below 1 - v1") {
    assertEquals(countSumV1(1, 3, 5), 0)
  }

  test("sum of the multiples of 3 or 5 below 10 - v1") {
    assertEquals(countSumV1(10, 3, 5), 23)
  }

  test("sum of the multiples of 3 or 5 below 1000 - v1") {
    assertEquals(countSumV1(1000, 3, 5), 233168)
  }

  test("sum of the multiples of 3 or 5 below 1 - v2") {
    assertEquals(countSumV2(1, 3, 5), 0)
  }

  test("sum of the multiples of 3 or 5 below 10 - v2") {
    assertEquals(countSumV2(10, 3, 5), 23)
  }

  test("sum of the multiples of 3 or 5 below 1000 - v2") {
    assertEquals(countSumV2(1000, 3, 5), 233168)
  }
