package problems

import munit.FunSuite

class P53_CombinatoricSelectionsTest extends FunSuite:

  test("combinatoricSelectionAmount") {
    assertEquals(combinatoricSelectionsAmount(), 4075)
  }
