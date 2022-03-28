package problems

import problems.P06_SumSquareDifference.countDifference
import munit.FunSuite

class P06_SumSquareDifferenceTest extends FunSuite:

  test("difference of square sum and sum of squares of 1 numbers") {
    assertEquals(countDifference(1), 0)
  }

  test("difference of square sum and sum of squares of 10 numbers") {
    assertEquals(countDifference(10), 2640)
  }

  test("difference of square sum and sum of squares of 100 numbers") {
    assertEquals(countDifference(100), 25164150)
  }
