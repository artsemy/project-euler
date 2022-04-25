package problems

import munit.FunSuite

class P36_DoubleBasePalindromeTest extends FunSuite:

  test("doubleBasePalindrome") {
    assertEquals(doubleBasePalindrome(1000000), 872187)
  }
