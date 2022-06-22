package problems

import munit.FunSuite
import res.FromFileData.p89Roman

class P89_RomanNumeralsTest extends FunSuite:

  val numbers: Seq[String] = p89Roman

  test("count saved characters") {
    assertEquals(countSavedCharacters(numbers), 743)
  }
