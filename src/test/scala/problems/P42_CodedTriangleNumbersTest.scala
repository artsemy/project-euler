package problems

import munit.FunSuite
import res.FromFileData._

class P42_CodedTriangleNumbersTest extends FunSuite:

  val words: Seq[String] = p42Words

  test("countTriangleWords") {
    assertEquals(countTriangleWords(words), 162)
  }
