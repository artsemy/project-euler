package problems

import munit.FunSuite

class P41_PandigitalPrimeTest extends FunSuite:

  test("maxPandigitalPrime") {
    assertEquals(maxPandigitalPrime(), 7652413)
  }
