package problems

import munit.FunSuite

class P69_TotientMaximumTest extends FunSuite:

  test("totient maximum 10") {
    assertEquals(totientMaximum(10), 6)
  }

  test("totient maximum 1000000") {
    assertEquals(totientMaximum(1000000), 510510)
  }
