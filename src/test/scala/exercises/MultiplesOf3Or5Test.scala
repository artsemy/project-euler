package exercises

import exercises.MultiplesOf3Or5.countSum
import munit.FunSuite

class MultiplesOf3Or5Test extends FunSuite:

  test("sum of the multiples of 3 or 5 below 10") {
    val s10 = countSum(10)
    assertEquals(s10, 23)
  }

  test("sum of the multiples of 3 or 5 below 1000") {
    val s1000 = countSum(1000)
    assertEquals(s1000, 233168)
  }


