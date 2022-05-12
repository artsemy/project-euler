package problems

import munit.FunSuite

class P65_ConvergentsOfETest extends FunSuite :

  test("convergents of e") {
    assertEquals(convergentsOfE().take(6), LazyList[(BigInt, BigInt)]((0, 0), (2, 1), (3, 1), (8, 3), (11, 4), (19, 7)))
  }

  test("sumOfDigitsNumeratorOfConvergentOfE 10") {
    assertEquals(sumOfDigitsNumeratorOfConvergentOfE(10), 17)
  }

  test("sumOfDigitsNumeratorOfConvergentOfE 100") {
    assertEquals(sumOfDigitsNumeratorOfConvergentOfE(100), 272)
  }
