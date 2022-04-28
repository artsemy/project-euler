package problems

import munit.FunSuite

class P43_SubStringDivisibilityTest extends FunSuite:

  test("subStringDivisibilitySum") {
    assertEquals(subStringDivisibilitySum(), 16695334890L)
  }

  test("subStringDivisibilitySum v2") {
    assertEquals(subStringDivisibilitySumV2(), 16695334890L)
  }
