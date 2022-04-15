package problems

import munit.FunSuite

class P23_NonAbundantSumsTest extends FunSuite :

  test("abundantSeq 13") {
    assertEquals(abundantSeq(13), Seq(12))
  }

  test("abundantSeq 20") {
    assertEquals(abundantSeq(20), Seq(12, 18, 20))
  }

  test("twoAbundantSumSeq 23") {
    assertEquals(twoAbundantSumSeq(23), Set())
  }

  test("twoAbundantSumSeq 24") {
    assertEquals(twoAbundantSumSeq(24), Set(24))
  }

  test("nonTwoAbundantSumSeq 23") {
    assertEquals(nonTwoAbundantSumSeq(23), (1 to 23).toSet)
  }

  test("nonTwoAbundantSumSeq 24") {
    assertEquals(nonTwoAbundantSumSeq(24), (1 to 23).toSet)
  }

  test("nonAbundantSum 10") {
    assertEquals(nonAbundantSeqSum(10), 55)
  }

  test("nonAbundantSum 24") {
    assertEquals(nonAbundantSeqSum(24), 276)
  }

  test("nonAbundantSum 28123") {
    assertEquals(nonAbundantSeqSum(28123), 4179871)
  }
