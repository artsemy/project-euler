package problems

import munit.FunSuite
import problems.P22_NamesScores._
import res.NameData._

class P22_NamesScoresTest extends FunSuite:

  test("stringScore A") {
    assertEquals(stringScore("A"), 1)
  }

  test("stringScore COLIN") {
    assertEquals(stringScore("COLIN"), 53)
  }

  test("sortedStringsScoresSum (BB, AA)") {
    assertEquals(sortedStringsScoresSum(Seq("BB", "AA")), 10)
  }

  test("sortedStringsScoresSum names") {
    assertEquals(sortedStringsScoresSum(getNamesFromFile), 871198282)
  }