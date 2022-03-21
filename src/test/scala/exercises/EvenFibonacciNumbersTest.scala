package exercises

import exercises.EvenFibonacciNumbers.countSum
import munit.FunSuite

class EvenFibonacciNumbersTest extends FunSuite:

  test("even fibonacci numbers less than 4 million") {
    val s = countSum(4000000)
    assertEquals(s, 4613732)
  }
