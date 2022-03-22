package exercises

import exercises.LargestPrimeFactor.largestPrime
import munit.FunSuite

class LargestPrimeFactorTest extends FunSuite:

  test("largest prime factor 13195") {
    val p = largestPrime(13195)
    assertEquals(p, 29L)
  }

  test("largest prime factor 600851475143") {
    val p = largestPrime(600851475143L)
    assertEquals(p, 6857L)
  }
