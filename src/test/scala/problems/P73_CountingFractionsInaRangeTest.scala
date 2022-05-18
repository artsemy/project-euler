package problems

import munit.FunSuite

class P73_CountingFractionsInaRangeTest extends FunSuite:

  test("countingFractionsInaRange 8") {
    assertEquals(countingFractionsInaRange(8), BigInt(3))
  }

  test("countingFractionsInaRange 12000") { // 20 sec
    assertEquals(countingFractionsInaRange(12000), BigInt(7295372))
  }
