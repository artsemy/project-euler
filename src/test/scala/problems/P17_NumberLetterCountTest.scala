package problems

import munit.FunSuite
import problems.P17_NumberLetterCount._

class P17_NumberLetterCountTest extends FunSuite:

  test("1 to 1 number into words sum letters") {
    assertEquals(count(1), 3)
  }

  test("1 to 5 number into words sum letters") {
    assertEquals(count(5), 19)
  }

  test("1 to 1000 number into words sum letters") {
    assertEquals(count(1000), 21124)
  }
