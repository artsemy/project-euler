package problems

import problems.P04_LargestPalindromeProduct.largest
import munit.FunSuite

class P04_LargestPalindromeProductTest extends FunSuite:

  test("largest palindrome of product 2-digit numbers") {
    val p = largest(2)
    assertEquals(p, 9009)
  }

  test("largest palindrome of product 3-digit numbers") {
    val p = largest(3)
    assertEquals(p, 906609)
  }
