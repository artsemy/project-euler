package problems

import munit.FunSuite

class P14_LongestCollatzSequenceTest extends FunSuite:

  test("longest over 10") {
    assertEquals(longestCollatzSeq(10), 9)
  }

  test("longest over 1000000") {
    assertEquals(longestCollatzSeq(1000000), 837799)
  }
