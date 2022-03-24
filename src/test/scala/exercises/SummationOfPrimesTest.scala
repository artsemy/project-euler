package exercises

import SummationOfPrimes._
import munit.FunSuite

class SummationOfPrimesTest extends FunSuite:

  test("sum of primes lower than 10") {
    val s = sum(10)
    assertEquals(s, 17L)
  }

  test("sum of primes lower than 2000000") { // 1 min +-
    val s = sum(2000000)
    assertEquals(s, 142913828922L)
  }
