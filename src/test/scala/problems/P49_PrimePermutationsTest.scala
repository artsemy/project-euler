package problems

import munit.FunSuite

class P49_PrimePermutationsTest extends FunSuite:

  test("primePermutationsLine") {
    assertEquals(primePermutationsLine(), "296962999629")
  }

  test("getPrimePermutations") {
    import utils.EulerMath.getPrimes
    assertEquals(getPrimePermutations(1487, getPrimes(10000).toSet), Seq(4817, 8147))
  }