package problems

import munit.FunSuite

class P03_LargestPrimeFactorTest extends FunSuite:

  test("largest prime factor 2") {
    assertEquals(largestPrimeFactor(2), 2L)
  }

  test("largest prime factor 13195") {
    assertEquals(largestPrimeFactor(13195), 29L)
  }

  test("largest prime factor 600851475143") {
    assertEquals(largestPrimeFactor(600851475143), 6857L)
  }
