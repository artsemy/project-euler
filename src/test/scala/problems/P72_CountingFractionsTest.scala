package problems

import munit.FunSuite

class P72_CountingFractionsTest extends FunSuite:

  test("counting fractions 8") {
    assertEquals(countingFractions(8), BigInt(21))
  }

  test("counting fractions 7") {
    assertEquals(countingFractions(7), BigInt(17))
  }

  test("counting fractions 1000000") { // too slow -> 3,5 min
    assertEquals(countingFractions(10), BigInt("303963552391"))
  }

  test("fi 8") {
    assertEquals(fi(8, Set(2, 3, 5, 7)), BigInt(4))
  }

  test("counting fractions 1000000 v2") { // too slow -> 3,5 min
    assertEquals(countingFractions(10), BigInt("303963552391"))
  }
