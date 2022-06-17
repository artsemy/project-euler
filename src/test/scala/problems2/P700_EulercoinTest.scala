package problems2

import munit.FunSuite

class P700_EulercoinTest extends FunSuite:

  test("eulercoin sum") {
    val startNumber = BigInt("1504170715041707")
    val divider = BigInt("4503599627370517")
    assertEquals(eulerCoinSum(startNumber, divider), BigInt("1517926517777556"))
  }
