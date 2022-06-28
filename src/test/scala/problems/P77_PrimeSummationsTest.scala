package problems

import munit.FunSuite

class P77_PrimeSummationsTest extends FunSuite:

  test("prime summations 5") {
    assertEquals(primeSummations(5), 10)
  }

  test("prime summations 5000") {
    assertEquals(primeSummations(5000), 71)
  }
