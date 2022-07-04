package problems

import munit.FunSuite

class P87_PrimePowerTriplesTest extends FunSuite:

  test("triples below 50") {
    assertEquals(countPrimePowerTriples(50), 4)
  }
  
  test("triples below 50 000 000") {
    assertEquals(countPrimePowerTriples(50000000), 1097343)
  }
  