package problems

import munit.FunSuite
import problems.P23_NonAbundantSums._

class P23_NonAbundantSumsTest extends FunSuite :

  test("abundantSeq 13") {
    assertEquals(abundantSeq(13), Seq(12))
  }

  test("abundantSeq 20") {
    assertEquals(abundantSeq(20), Seq(12, 18, 20))
  }

  test("twoAbundantSumSeq 23") {
    assertEquals(twoAbundantSumNumbers(23), Set())
  }

  test("twoAbundantSumSeq 24") {
    assertEquals(twoAbundantSumNumbers(24), Set(24))
  }

  test("nonAbundantSum 10") {
    assertEquals(nonAbundantSum(10), 55)
  }

  test("nonAbundantSum 24") {
    assertEquals(nonAbundantSum(24), 276)
  }

  test("nonAbundantSum 28123") {
    assertEquals(nonAbundantSum(28123), 4179871)
  }
