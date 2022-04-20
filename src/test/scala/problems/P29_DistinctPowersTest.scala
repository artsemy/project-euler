package problems

import munit.FunSuite

class P29_DistinctPowersTest extends FunSuite:

  test("distinctPowers a <= 5, b <= 5") {
    assertEquals(distinctPowers(5, 5), 15)
  }

  test("distinctPowers a <= 100, b <= 100") {
    assertEquals(distinctPowers(100, 100), 9183)
  }
