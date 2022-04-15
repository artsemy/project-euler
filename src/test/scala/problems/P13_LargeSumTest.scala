package problems

import munit.FunSuite
import res.FromFileData.p13LongNumbers

class P13_LargeSumTest extends FunSuite :

  val numbers: List[String] = p13LongNumbers

  test("large sum") {
    assertEquals(longNumbersSumFirstDigits(numbers), "5537376230")
  }
