package problems

import munit.FunSuite
import res.FromFileData.p99ExpPairs

class P99_LargestExponentialTest extends FunSuite:

  val pairs = p99ExpPairs

  test("largest exponential 2^7 3^11") {
    assertEquals(compareExponents((2, 11), (3, 7)), -1)
  }

  test("largest exponential 632382^518061 519432^525806") {
    assertEquals(compareExponents((632382, 518061), (519432, 525806)), 1)
  }

  test("largest in seq index") {
    assertEquals(largestExponential(pairs), 709)
  }

  test("largest in seq index v2") {
    assertEquals(largestExponentialV2(pairs), 709)
  }
