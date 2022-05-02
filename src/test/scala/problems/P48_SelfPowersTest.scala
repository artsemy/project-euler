package problems

import munit.FunSuite

class P48_SelfPowersTest extends FunSuite:

  test("selfPowersSum 10") {
    assertEquals(selfPowersSum(10), "0405071317")
  }

  test("selfPowersSum 1000") {
    assertEquals(selfPowersSum(1000), "9110846700")
  }
