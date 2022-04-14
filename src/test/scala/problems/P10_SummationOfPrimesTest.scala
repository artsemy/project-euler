package problems

import munit.FunSuite

class P10_SummationOfPrimesTest extends FunSuite:

  test("sum of primes lower than 4") {
    assertEquals(sumOfPrimes(4), 5L)
  }

  test("sum of primes lower than 10") {
    assertEquals(sumOfPrimes(10), 17L)
  }

  test("sum of primes lower than 2000000") {
    assertEquals(sumOfPrimes(2000000), 142913828922L)
  }
