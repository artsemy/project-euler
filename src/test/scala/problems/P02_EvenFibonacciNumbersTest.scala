package problems

import munit.FunSuite

class P02_EvenFibonacciNumbersTest extends FunSuite:

  test("even fibonacci numbers less than 2 - v1") {
    assertEquals(countSumV1(2), 0)
  }

  test("even fibonacci numbers less than 100 - v1") {
    assertEquals(countSumV1(100), 44)
  }

  test("even fibonacci numbers less than 4 million - v1") {
    assertEquals(countSumV1(4000000), 4613732)
  }

  test("even fibonacci numbers less than 2 - v2") {
    assertEquals(countSumV2(2), 0)
  }

  test("even fibonacci numbers less than 100 - v2") {
    assertEquals(countSumV2(100), 44)
  }

  test("even fibonacci numbers less than 4 million - v2") {
    assertEquals(countSumV2(4000000), 4613732)
  }
