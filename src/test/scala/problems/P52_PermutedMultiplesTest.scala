package problems

import munit.FunSuite

class P52_PermutedMultiplesTest extends FunSuite:

  test("permutedMultiples") {
    assertEquals(permutedMultiples(), 142857)
  }

  test("isPermutation") {
    assertEquals(isPermutation(123, 321), true)
  }

  test("isPermutation no") {
    assertEquals(isPermutation(123, 3211), false)
  }
