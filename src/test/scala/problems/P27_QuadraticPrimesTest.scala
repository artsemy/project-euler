package problems

import munit.FunSuite

class P27_QuadraticPrimesTest extends FunSuite:

  test("quadraticPrimesCoeffProduct 45") {
    assertEquals(quadraticPrimesCoeffProduct(41, 41), -41)
  }

  test("quadraticPrimesCoeffProduct 1000") {
    assertEquals(quadraticPrimesCoeffProduct(1000, 1000), -59231)
  }