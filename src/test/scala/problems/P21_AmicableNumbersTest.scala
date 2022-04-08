package problems

import munit.FunSuite
import problems.P21_AmicableNumbers._

class P21_AmicableNumbersTest extends FunSuite:

  test("is amicable number 5") {
    assertEquals(isAmicableNumber(5), false)
  }

  test("is amicable number 220") {
    assertEquals(isAmicableNumber(220), true)
  }

  test("is amicable number 284") {
    assertEquals(isAmicableNumber(284), true)
  }

  test("amicable number set under 100") {
    assertEquals(amicableNumbersSeq(100), Seq())
  }

  test("amicable number set under 300") {
    assertEquals(amicableNumbersSeq(300), Seq(220, 284))
  }

  test("amicable number sum under 300") {
    assertEquals(amicableNumbersSum(300), 504)
  }

  test("amicable number sum under 10000") {
    assertEquals(amicableNumbersSum(10000), 31626)
  }
