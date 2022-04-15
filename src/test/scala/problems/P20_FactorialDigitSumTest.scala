package problems

import munit.FunSuite

class P20_FactorialDigitSumTest extends FunSuite:

//  test("multiplyDigitSeq 1 * 1") {
//    assertEquals(multiplyDigitSeq(1, Seq(1)), Seq(1))
//  }
//
//  test("multiplyDigitSeq 22 * 123") {
//    assertEquals(multiplyDigitSeq(22, Seq(1,2,3)), Seq(2, 7, 0, 6))
//  }
//
//  test("multiplyDigitSeq 99 * 99") {
//    assertEquals(multiplyDigitSeq(99, Seq(9,9)), Seq(9, 8, 0, 1))
//  }
//
//  test("factDigitSeq 10") {
//    assertEquals(factDigitSeq(10), Seq(3,6,2,8,8,0,0))
//  }

  test("factorDigitSum 10") {
    assertEquals(factorDigitSum(10), 27)
  }

  test("factorDigitSum 100") {
    assertEquals(factorDigitSum(100), 648)
  }
