package problems

import problems.P02_EvenFibonacciNumbers.countSum
import munit.FunSuite

class P02_EvenFibonacciNumbersTest extends FunSuite:

  test("even fibonacci numbers less than 4 million") {
    val s = countSum(4000000)
    assertEquals(s, 4613732)
  }
