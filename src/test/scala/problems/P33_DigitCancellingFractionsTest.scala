package problems

import munit.FunSuite

class P33_DigitCancellingFractionsTest extends FunSuite :

  test("digitCancellingFractions") {
    assertEquals(digitCancellingFractions(), 100)
  }

  test("isSpecialPair 49/98") {
    assertEquals(isSpecialPair((49, 98)), true)
  }

  test("isSpecialPair 59/95") {
    assertEquals(isSpecialPair((59, 95)), false)
  }

  test("simplifyPairsProduct 1/2, 2/4") {
    assertEquals(simplifyPairsProduct(Seq((1, 2), (2, 4))), (1, 4))
  }

  test("simplifyPairsProduct 1/3, 5/7") {
    assertEquals(simplifyPairsProduct(Seq((1, 3), (5, 7))), (5, 21))
  }
