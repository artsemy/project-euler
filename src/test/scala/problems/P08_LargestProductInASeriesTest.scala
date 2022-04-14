package problems

import munit.FunSuite
import res.FromFileData.p08NumberFromFile

class P08_LargestProductInASeriesTest extends FunSuite:

  val number: String = p08NumberFromFile

  test("4 adjacent digits product") {
    assertEquals(largestProductInASeries(number, 4), 5832L)
  }

  test("13 adjacent digits product") {
    assertEquals(largestProductInASeries(number, 13), 23514624000L)
  }
