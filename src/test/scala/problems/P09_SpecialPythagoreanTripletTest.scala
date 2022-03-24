package problems

import problems.P09_SpecialPythagoreanTriplet.product
import munit.FunSuite

class P09_SpecialPythagoreanTripletTest extends FunSuite:

  test("triplet of sum 12") {
    val act = product(12)
    assertEquals(act, 60)
  }

  test("triplet of sum 1000") {
    val act = product(1000)
    assertEquals(act, 31875000)
  }
