package problems

import munit.FunSuite
import res.FromFileData._

class P22_NamesScoresTest extends FunSuite:

  test("sortedStringsScoresSum (BB, AA)") {
    assertEquals(sortedNamesStringsScoresSum(Seq("BB", "AA")), 10)
  }

  test("sortedStringsScoresSum names") {
    assertEquals(sortedNamesStringsScoresSum(p22NamesFromFile), 871198282)
  }