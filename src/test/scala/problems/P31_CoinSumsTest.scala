package problems

import munit.FunSuite

class P31_CoinSumsTest extends FunSuite:

  test("coin sums (1,2) - 4") {
    assertEquals(coinSums(Seq(1, 2), 4), 3)
  }

  test("coin sums (1,2,5,10,20,50,100,200) - 200") {
    assertEquals(coinSums(Seq(1, 2, 5, 10, 20, 50, 100, 200), 200), 73682)
  }
