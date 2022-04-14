package problems

import munit.FunSuite
import res.FromFileData._

class P11_LargestProductInAGridTest extends FunSuite:

  val grid: List[List[Int]] = p11GridFromFile

  test("greatest product of four adjacent numbers in the same direction") {
    assertEquals(largestProductInAGrid(grid, 4), 70600674)
  }
