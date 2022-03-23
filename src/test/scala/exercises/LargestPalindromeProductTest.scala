package exercises

import exercises.LargestPalindromeProduct.largest
import munit.FunSuite

class LargestPalindromeProductTest extends FunSuite:

  test("largest palindrome of product 2-digit numbers") {
    val p = largest(2)
    assertEquals(p, 9009)
  }

  test("largest palindrome of product 3-digit numbers") {
    val p = largest(3)
    assertEquals(p, 906609)
  }
