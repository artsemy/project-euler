package problems

import munit.FunSuite

class P62_CubicPermutationsTest extends FunSuite:

  test("cubicPermutationMin 3") {
    assertEquals(cubicPermutationsMin(3), BigInt(41063625))
  }

  test("cubicPermutationMin 5") {
    assertEquals(cubicPermutationsMin(5), BigInt("127035954683"))
  }