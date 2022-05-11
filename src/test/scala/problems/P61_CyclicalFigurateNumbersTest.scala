package problems

import munit.FunSuite

class P61_CyclicalFigurateNumbersTest extends FunSuite:

  test("cyclicalFigurateNumbersSum 3".ignore) {
    assertEquals(cyclicalFigurateNumbersSum(3), 19291)
  }

  test("cyclicalFigurateNumbersSum 6") {
    assertEquals(cyclicalFigurateNumbersSum(6), 28684)
  }
