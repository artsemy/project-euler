package problems

import munit.FunSuite
import problems.P12_HighlyDivisibleTriangularNumber._

class P12_HighlyDivisibleTriangularNumberTest extends FunSuite:

  test("all dividers of 1") {
    assertEquals(getAllDividers(1), Seq(1))
  }

  test("all dividers of 28") {
    assertEquals(getAllDividers(28), Seq(1, 2, 4, 7, 14, 28))
  }

  test("is not triangular 27") {
    assertEquals(isTriangular(27), false)
  }

  test("is triangular 1") {
    assertEquals(isTriangular(1), true)
  }

  test("is triangular 28") {
    assertEquals(isTriangular(1), true)
  }

  test("is triangular 5050") {
    assertEquals(isTriangular(5050), true)
  }

  test("prime dividers 2") {
    assertEquals(primeDividers(2), Map(2 -> 1))
  }

  test("prime dividers 28") {
    assertEquals(primeDividers(28), Map(2 -> 2, 7 -> 1))
  }

  test("prime dividers 504") {
    assertEquals(primeDividers(504), Map(2 -> 3, 3 -> 2, 7 -> 1))
  }

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
