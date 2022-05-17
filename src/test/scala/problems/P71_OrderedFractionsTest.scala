package problems

import munit.FunSuite

class P71_OrderedFractionsTest extends FunSuite:

  test("orderedFractionsNum 8"){
    assertEquals(orderedFractionsNum(3, 7, 8), 2)
  }

  test("orderedFractionsNum 1000000"){
    assertEquals(orderedFractionsNum(3, 7, 1000000), 428570)
  }
