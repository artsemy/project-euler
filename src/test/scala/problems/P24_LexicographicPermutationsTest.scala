package problems

import munit.FunSuite

class P24_LexicographicPermutationsTest extends FunSuite :

  test("permutation 3 of 0 to 2") {
    assertEquals(digitsPermutation(Seq(0, 1, 2), 3), Seq(1, 0, 2))
  }

  test("permutation 15 of 0 to 3") {
    assertEquals(digitsPermutation(Seq(0, 1, 2, 3), 15), Seq(2, 1, 0, 3))
  }

  test("permutation 1000000 of 0 to 9") {
    assertEquals(digitsPermutation(Seq(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), 1000000), Seq(2, 7, 8, 3, 9, 1, 5, 4, 6, 0))
  }
