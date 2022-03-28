package problems

import munit.FunSuite
import problems.P14_LongestCollatzSequence._

class P14_LongestCollatzSequenceTest extends FunSuite:

  test("longest over 10") {
    val act = longest(10)
    assertEquals(act, 9)
  }

  test("longest over 1000000") {
    val act = longest(1000000)
    assertEquals(act, 837799)
  }
