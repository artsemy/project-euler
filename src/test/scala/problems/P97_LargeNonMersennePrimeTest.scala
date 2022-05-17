package problems

import munit.FunSuite

class P97_LargeNonMersennePrimeTest extends FunSuite:

  test("largeNonMersennePrimeLastDigits 10") {
    assertEquals(largeNonMersennePrimeLastDigits(10), BigInt("8739992577"))
  }
