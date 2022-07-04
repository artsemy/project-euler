package problems2

import munit.FunSuite

class P145_ReversibleNumbersBelowBillionTest extends FunSuite:

  test("is reversed 36") {
    assertEquals(isReversed(36), true)
  }

  test("reversible below 1 bill".ignore) { // 8 min
    assertEquals(reversibleNumbersBelowBillion(1000000000), 608720)
  }

  test("reversible below 1000") {
    assertEquals(reversibleNumbersBelowBillion(1000), 120)
  }
