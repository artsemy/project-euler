package problems

import munit.FunSuite

class P04_LargestPalindromeProductTest extends FunSuite:

  test("largest palindrome of product 1-digit numbers") {
    assertEquals(largest(1), BigInt(9))
  }

  test("largest palindrome of product 2-digit numbers") {
    assertEquals(largest(2), BigInt(9009))
  }

  test("largest palindrome of product 3-digit numbers") {
    assertEquals(largest(3), BigInt(906609))
  }

  test("largest palindrome of product 1-digit numbers v2") {
    assertEquals(largestV2(1), BigInt(9))
  }

  test("largest palindrome of product 2-digit numbers v2") {
    assertEquals(largestV2(2), BigInt(9009))
  }

  test("largest palindrome of product 3-digit numbers v2") {
    assertEquals(largestV2(3), BigInt(906609))
  }
