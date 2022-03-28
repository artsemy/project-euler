package problems

import problems.P04_LargestPalindromeProduct.largest
import munit.FunSuite

class P04_LargestPalindromeProductTest extends FunSuite:

  test("largest palindrome of product 1-digit numbers") {
    assertEquals(largest(1), 9)
  }

  test("largest palindrome of product 2-digit numbers") {
    assertEquals(largest(2), 9009)
  }

  test("largest palindrome of product 3-digit numbers") {
    assertEquals(largest(3), 906609)
  }
