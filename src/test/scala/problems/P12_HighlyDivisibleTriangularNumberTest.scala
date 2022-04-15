package problems

import munit.FunSuite

class P12_HighlyDivisibleTriangularNumberTest extends FunSuite:

  test("highly divisible triangular number 0") {
    assertEquals(highlyDivisibleTriangularNumber(0), 1L)
  }

  test("highly divisible triangular number 5") {
    assertEquals(highlyDivisibleTriangularNumber(5), 28L)
  }

  test("highly divisible triangular number 319") {
    assertEquals(highlyDivisibleTriangularNumber(319), 2162160L)
  }

  test("highly divisible triangular number 500") {
    assertEquals(highlyDivisibleTriangularNumber(500), 76576500L)
  }
