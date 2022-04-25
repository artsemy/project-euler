package problems

import munit.FunSuite

class P34_DigitFactorialsTest extends FunSuite:

  test("digitsFactorialSum") {
    assertEquals(digitFactorialsSum(), 40730)
  }
