package problems

import munit.FunSuite

class P26_ReciprocalCyclesTest extends FunSuite:

  test("reciprocalCycles 11") {
    assertEquals(longestReciprocalCycle(11), 7)
  }

  test("reciprocalCycles 47") {
    assertEquals(longestReciprocalCycle(47), 29)
  }

  test("reciprocalCycles 1000") {
    assertEquals(longestReciprocalCycle(1000), 983)
  }
