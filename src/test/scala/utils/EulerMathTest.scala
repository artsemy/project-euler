package utils

import munit.FunSuite
import utils.EulerMath._

class EulerMathTest extends FunSuite :

  test("isPrime 7") {
    assertEquals(isPrime(7), true)
  }

  test("isPrime 6") {
    assertEquals(isPrime(6), false)
  }

  test("isPalindrome 123321") {
    assertEquals(isPalindrome(123321), true)
  }

  test("isPalindrome 12321") {
    assertEquals(isPalindrome(12321), true)
  }

  test("isPalindrome 1321") {
    assertEquals(isPalindrome(1321), false)
  }

  test("isEven 4") {
    assertEquals(isEven(4), true)
  }

  test("isEven 3") {
    assertEquals(isEven(3), false)
  }

  test("get primes not bigger than 1") {
    assertEquals(getPrimes(1), Seq())
  }

  test("get primes not bigger than 2") {
    assertEquals(getPrimes(2), Seq(2))
  }

  test("get primes not bigger than 10") {
    assertEquals(getPrimes(10), Seq(2, 3, 5, 7))
  }

  test("get prime dividers seq 1") {
    assertEquals(getPrimeDividersSeq(1), Seq())
  }

  test("get prime dividers seq 2") {
    assertEquals(getPrimeDividersSeq(2), Seq(2L))
  }

  test("get prime dividers seq 24") {
    assertEquals(getPrimeDividersSeq(24), Seq(2L, 2L, 2L, 3L))
  }

  test("all combinations (1, 2, 3) SORTED") {
    assertEquals(getAllCombinations(Seq(1, 2, 3)),
      Seq(Seq(), Seq(1), Seq(2), Seq(3), Seq(1, 2), Seq(1, 3), Seq(2, 3), Seq(1, 2, 3)))
  }

  test("get all dividers 0") {
    assertEquals(getAllDividers(0), Seq())
  }

  test("get all dividers 1") {
    assertEquals(getAllDividers(1).map(_.toInt), Seq(1))
  }

  test("get all dividers 5") {
    assertEquals(getAllDividers(5).map(_.toInt), Seq(1, 5))
  }

  test("get all dividers 10") {
    assertEquals(getAllDividers(10).map(_.toInt), Seq(1, 2, 5, 10))
  }

  test("get all dividers 24") {
    assertEquals(getAllDividers(24).map(_.toInt), Seq(1, 2, 3, 4, 6, 8, 12, 24))
  }

  test("compare get all dividers") {
    assertEquals(getAllDividers(2162160).length, 320)
  }

  test("isPerfectNumber 28") {
    assertEquals(isPerfectNumber(28), true)
  }

  test("isDeficientNumber 13") {
    assertEquals(isDeficientNumber(13), true)
  }

  test("isAbundantNumber 12") {
    assertEquals(isAbundantNumber(12), true)
  }

  test("fact 3") {
    assertEquals(fact(3), BigInt(6))
  }

  test("fact 10") {
    assertEquals(fact(10), BigInt(3628800))
  }

  test("fibFrom 5 elems") {
    assertEquals(fibFrom().take(5), LazyList[BigInt](0, 1, 1, 2, 3))
  }
