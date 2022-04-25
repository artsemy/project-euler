package problems

import munit.FunSuite

class P35_CircularPrimesTest extends FunSuite:

  test("circular primes number up to 100") {
    assertEquals(circularPrimesNumber(100), 13)
  }

  test("circular primes number up to 1M") {
    assertEquals(circularPrimesNumber(1000000), 55)
  }

  test("isCircularInSet 13 (13, 31)") {
    assertEquals(isCircularInSet(13, Set(13, 31)), true)
  }

  test("isCircularInSet 13 (13, 23) not") {
    assertEquals(isCircularInSet(13, Set(13, 23)), false)
  }

  test("getAllRotations 135") {
    assertEquals(getAllRotations(135), Seq(135, 351, 513))
  }