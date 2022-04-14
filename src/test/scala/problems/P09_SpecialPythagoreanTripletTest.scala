package problems

import munit.FunSuite

class P09_SpecialPythagoreanTripletTest extends FunSuite:

  test("triplet of sum 12") {
    assertEquals(specialPythagoreanTripletProduct(12), 60)
  }

  test("triplet of sum 1000") {
    assertEquals(specialPythagoreanTripletProduct(1000), 31875000)
  }
