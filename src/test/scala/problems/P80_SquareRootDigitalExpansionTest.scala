package problems

import munit.FunSuite

import java.math.RoundingMode

class P80_SquareRootDigitalExpansionTest extends FunSuite :

  test("digits sum of all sqrt 1 to 100") {
    assertEquals(squareRootDigitsSum(100, 100), 40886)
  }

  test("digits sum sqrt(2)") {
    import java.math.MathContext
    import java.math.BigDecimal
    assertEquals(decimalDigitsSum(BigDecimal(2).sqrt(MathContext(100, RoundingMode.DOWN))), 475)
  }
