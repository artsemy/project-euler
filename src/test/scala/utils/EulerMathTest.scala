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

  test("isPalindrome 1321 not") {
    assertEquals(isPalindrome(1321), false)
  }

  test("isPalindrome 12321") {
    assertEquals(isPalindrome("12321"), true)
  }

  test("isPalindrome 1321 not") {
    assertEquals(isPalindrome("1321"), false)
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

  test("stringToDigitSeq 123456") {
    assertEquals(stringToDigitSeq("123456"), Seq(1, 2, 3, 4, 5, 6))
  }

  test("bigIntToDigitSeq 123456") {
    assertEquals(bigIntToDigitSeq(BigInt(123456)), Seq(1, 2, 3, 4, 5, 6))
  }

  test("digitSeqToBigInt 123") {
    assertEquals(digitSeqToBigInt(Seq(1, 2, 3)), BigInt(123))
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

  test("powFrom 2 5-elem") {
    assertEquals(powFrom(2).take(5), LazyList[BigInt](1, 2, 4, 8, 16))
  }

  test("isPandigital 1,2,3,4,5,6,7,8,9") {
    assertEquals(isPandigital(Seq(123, 456, 789), 9), true)
  }

  test("isPandigital 2,2,3,4,5,6,7,8,9 no") {
    assertEquals(isPandigital(Seq(223, 456, 789), 9), false)
  }

  test("isPandigital 1,4,0,6,3,5,7,2,8,9 with 0") {
    assertEquals(isPandigital(Seq(1,4,0,6,3,5,7,2,8,9), 9, 0), true)
  }

  test("isTriangularNumber 36") {
    assertEquals(isTriangularNumber(36), true)
  }

  test("isTriangularNumber 38 no") {
    assertEquals(isTriangularNumber(38), false)
  }

  test("wordValue emptyString") {
    assertEquals(wordValue(""), 0)
  }

  test("wordValue A") {
    assertEquals(wordValue("A"), 1)
  }

  test("wordValue COLIN") {
    assertEquals(wordValue("COLIN"), 53)
  }

  test("pentagonalFrom") {
    assertEquals(pentagonalFrom().take(4), LazyList[BigInt](1, 5, 12, 22))
  }

  test("isPentagonal") {
    assertEquals(isPentagonal(22), true)
  }

  test("isPentagonal no") {
    assertEquals(isPentagonal(23), false)
  }

  test("hexagonalFrom") {
    assertEquals(hexagonalFrom().take(4), LazyList[BigInt](1, 6, 15, 28))
  }

  test("isHexagonal") {
    assertEquals(isHexagonal(120), true)
  }

  test("isHexagonal no") {
    assertEquals(isHexagonal(121), false)
  }

  test("minNDigitNumber 1 - 1") {
    assertEquals(minNDigitNumber(1), BigInt(1))
  }

  test("minNDigitNumber 3 - 100") {
    assertEquals(minNDigitNumber(3), BigInt(100))
  }
  
  test("maxNDigitNumber 1 - 9") {
    assertEquals(maxNDigitNumber(1), BigInt(9))
  }

  test("maxNDigitNumber 3 - 999") {
    assertEquals(maxNDigitNumber(3), BigInt(999))
  }

  test("numberLength 12345") {
    assertEquals(numberLength(12345), 5)
  }

  test("numberLength 1") {
    assertEquals(numberLength(1), 1)
  }

  test("concatNumbers 123 456") {
    assertEquals(concatNumbers(123, 456), BigInt(123456))
  }

  test("triangularFrom") {
    assertEquals(triangularFrom().take(3), LazyList[BigInt](1, 3, 6))
  }

  test("squareFrom") {
    assertEquals(squareFrom().take(3), LazyList[BigInt](1, 4, 9))
  }

  test("squareFrom v2") {
    assertEquals(squareFromV2().take(3), LazyList[BigInt](1, 4, 9))
  }

  test("squareFrom v3") {
    assertEquals(squareFromV3().take(3), LazyList[BigInt](1, 4, 9))
  }

  test("heptagonalFrom") {
    assertEquals(heptagonalFrom().take(3), LazyList[BigInt](1, 7, 18))
  }

  test("octagonalFrom") {
    assertEquals(octagonalFrom().take(3), LazyList[BigInt](1, 8, 21))
  }

  test("gcd 5, 7") {
    assertEquals(gcd(5, 7), BigInt(1))
  }

  test("gcd 7, 5") {
    assertEquals(gcd(7, 5), BigInt(1))
  }

  test("gcd 2, 4") {
    assertEquals(gcd(2, 4), BigInt(2))
  }