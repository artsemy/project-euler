package problems

import munit.FunSuite

class P55_LychrelNumbersTest extends FunSuite:

  test("lychrelNumbersCount") {
    assertEquals(lychrelNumbersCount(10000), 249)
  }

  test("isLychrelCandidate 196") {
    assertEquals(isLychrelCandidate(196), true)
  }

  test("isLychrelCandidate 4994") {
    assertEquals(isLychrelCandidate(4994), true)
  }

  test("isLychrelCandidate 200 no") {
    assertEquals(isLychrelCandidate(200), false)
  }
