package problems

import problems.P07_NthPrime.findPrime
import munit.FunSuite

class P07_NthPrimeTest extends FunSuite:

  test("find 6th prime") {
    val pr = findPrime(6)
    assertEquals(pr, 13)
  }

  test("find 10001th prime") {
    val pr = findPrime(10001)
    assertEquals(pr, 104743)
  }
