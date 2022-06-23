package problems2

import munit.FunSuite

class P112_BouncyNumbersTest extends FunSuite:

  test("increasing number 1234") {
    assertEquals(isIncreasingNumber(1234), true)
  }

  test("decreasing number 4321") {
    assertEquals(isDecreasingNumber(4321), true)
  }

  test("number proportion 99") {
    assertEquals(numberOfProportion(99), 1587000)
  }
