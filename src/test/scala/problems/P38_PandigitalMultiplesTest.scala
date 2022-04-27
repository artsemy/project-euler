package problems

import munit.FunSuite

class P38_PandigitalMultiplesTest extends FunSuite :

  test("pandigitalMultiplesMax") {
    assertEquals(pandigitalMultiplesMax(), 932718654)
  }

  test("countPandigit 9 - 9") {
    assertEquals(countPandigit(9, 9), 918273645)
  }

  test("countPandigit 5 - 9") {
    assertEquals(countPandigit(5, 9), -1)
  }
