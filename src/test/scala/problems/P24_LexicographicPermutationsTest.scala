package problems

import munit.FunSuite
import problems.P24_LexicographicPermutations._

class P24_LexicographicPermutationsTest extends FunSuite:

  test("permutation v1 15 of 0 to 3") {
    assertEquals(permutation(Seq(0,1,2,3), 15), Seq(2,1,0,3))
  }

  test("permutation v2 15 of 0 to 3") {
    assertEquals(permutationV2(Seq(0,1,2,3), 15), Seq(2,1,0,3))
  }

  test("permutation v1 1000000 of 0 to 9") {
    assertEquals(permutation(Seq(0,1,2,3,4,5,6,7,8,9), 1000000), Seq(2, 7, 8, 3, 9, 1, 5, 4, 6, 0))
  }

  test("permutation v2 1000000 of 0 to 9") {
    assertEquals(permutationV2(Seq(0,1,2,3,4,5,6,7,8,9), 1000000), Seq(2, 7, 8, 3, 9, 1, 5, 4, 6, 0))
  }
