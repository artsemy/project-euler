package problems

import munit.FunSuite

class P60_PrimePairSetsTest extends FunSuite:

  test("primePairSetSum 4".ignore) {
    assertEquals(primePairSetsSum(4), 792)
  }

  test("primePairSetSum 5") {
    assertEquals(primePairSetsSum(5), 26033)
  }
