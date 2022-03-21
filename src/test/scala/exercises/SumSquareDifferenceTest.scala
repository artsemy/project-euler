package exercises

import exercises.SumSquareDifference.countDifference
import munit.FunSuite

class SumSquareDifferenceTest extends FunSuite:

  test("difference of square sum and sum of squares of 10 numbers") {
    val s10 = countDifference(10)
    assertEquals(s10, 2640)
  }

  test("difference of square sum and sum of squares of 100 numbers") {
    val s10 = countDifference(100)
    assertEquals(s10, 25164150)
  }
