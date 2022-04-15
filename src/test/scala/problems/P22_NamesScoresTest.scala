package problems

import munit.FunSuite
import res.FromFileData._

class P22_NamesScoresTest extends FunSuite:

  test("stringScore A") {
    assertEquals(nameStringScore("A"), 1)
  }

  test("stringScore COLIN") {
    assertEquals(nameStringScore("COLIN"), 53)
  }

  test("sortedStringsScoresSum (BB, AA)") {
    assertEquals(sortedNamesStringsScoresSum(Seq("BB", "AA")), 10)
  }

  test("sortedStringsScoresSum names") {
    assertEquals(sortedNamesStringsScoresSum(p22NamesFromFile), 871198282)
  }