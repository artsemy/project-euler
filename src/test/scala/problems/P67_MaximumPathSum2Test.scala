package problems

import munit.FunSuite
import res.FromFileData._

class P67_MaximumPathSum2Test extends FunSuite:

  val matr: List[List[Int]] = p67TriangleNumbers.reverse

  test("maximumPathSum2") {
    assertEquals(maxPathSum2(matr), 7273)
  }
