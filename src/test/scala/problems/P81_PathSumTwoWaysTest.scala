package problems

import munit.FunSuite
import res.FromFileData.p81Matrix

class P81_PathSumTwoWaysTest extends FunSuite:

  val matr: Seq[Seq[Int]] = p81Matrix
  val testMatr = Seq(
    Seq(131, 673, 234, 103, 18),
    Seq(201, 96, 342, 965, 150),
    Seq(630, 803,746, 422, 111),
    Seq(537, 699, 497, 121, 956),
    Seq(805, 732, 524, 37, 331))

  test("path sum two ways small") {
    assertEquals(pathSumTwoWays(testMatr), 2427)
  }

  test("path sum two ways") {
    assertEquals(pathSumTwoWays(matr), 427337)
  }
