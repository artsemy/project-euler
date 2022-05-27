package problems

import munit.FunSuite
import res.FromFileData.p79KeyLog

class P79_PasscodeDerivationTest extends FunSuite:

  val attempts: Seq[Int] = p79KeyLog

  test("passcode derivation") {
    assertEquals(passcodeDerivation(attempts), "73162890")
  }
