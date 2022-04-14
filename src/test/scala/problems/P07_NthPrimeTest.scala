package problems

import munit.FunSuite

class P07_NthPrimeTest extends FunSuite:

  test("for fun") {
    import utils.EulerMath._
    val index = 100 // change
    val a = 1.25
    val border = (index * Math.log(index) * a).ceil.toInt
    assertEquals((6 to index).map(findPrime), getPrimes(border).slice(5, index).toIndexedSeq)
  }

  test("find 6th prime") {
    assertEquals(findPrime(6), 13)
  }

  test("find 10001th prime") {
    assertEquals(findPrime(10001), 104743)
  }
