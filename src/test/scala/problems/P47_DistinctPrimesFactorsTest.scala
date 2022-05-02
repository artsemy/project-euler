package problems

import munit.FunSuite

class P47_DistinctPrimesFactorsTest extends FunSuite:

  test("distinctPrimesFactorsFirst 2 - 2") {
    assertEquals(distinctPrimesFactorsFirst(2, 2), 14)
  }

  test("distinctPrimesFactorsFirst 3 - 3") {
    assertEquals(distinctPrimesFactorsFirst(3, 3), 644)
  }

  test("distinctPrimesFactorsFirst 4 - 4") {
    assertEquals(distinctPrimesFactorsFirst(4, 4), 134043)
  }
