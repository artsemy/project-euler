package problems

import munit.FunSuite

class P12_HighlyDivisibleTriangularNumberTest extends FunSuite:

  test("highly divisible triangular number 0") {
    assertEquals(highlyDivisibleTriangularNumber(0), 1L)
  }

  test("highly divisible triangular number 5") {
    assertEquals(highlyDivisibleTriangularNumber(5), 28L)
  }

  test("highly divisible triangular number 319") { //next: 17907120 - 480div - 1.5min
    assertEquals(highlyDivisibleTriangularNumber(319), 2162160L)
  }

  test("highly divisible triangular number 500") { // 13.5 min
    assertEquals(highlyDivisibleTriangularNumber(500), 76576500L)
  }
