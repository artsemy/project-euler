package problems

import munit.FunSuite

class P70_TotientPermutationTest extends FunSuite:

  test("totient permutation 10^7") {
    assertEquals(totientPermutation(10000000), 8319823)
  }
