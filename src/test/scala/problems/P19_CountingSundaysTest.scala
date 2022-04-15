package problems

import munit.FunSuite

class P19_CountingSundaysTest extends FunSuite :

  test("sundays on 1 of month in 20th century") {
    assertEquals(countSunday(20), 171)
  }
