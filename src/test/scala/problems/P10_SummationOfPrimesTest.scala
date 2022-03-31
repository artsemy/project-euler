package problems

import P10_SummationOfPrimes._
import munit.FunSuite

class P10_SummationOfPrimesTest extends FunSuite:

  test("primes lower than 10") {
    assertEquals(primes(10), List(2, 3, 5, 7))
  }

  test("sum of primes lower than 4") {
    assertEquals(sum(4), 5L)
  }

  test("sum of primes lower than 10") {
    assertEquals(sum(10), 17L)
  }

  test("sum of primes lower than 2000000") {
    assertEquals(sum(2000000), 142913828922L)
  }
