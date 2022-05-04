package problems

import munit.FunSuite

class P50_ConsecutivePrimeSumTest extends FunSuite:

  test("consecutivePrimeSum < 100") {
    assertEquals(consecutivePrimeSum(100), 41)
  }

  test("consecutivePrimeSum < 1000") {
    assertEquals(consecutivePrimeSum(1000), 953)
  }

  test("consecutivePrimeSum < 1000000") {
    assertEquals(consecutivePrimeSum(1000000), 997651)
  }
