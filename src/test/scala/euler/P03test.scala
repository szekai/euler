package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P03._

@RunWith(classOf[JUnitRunner])
class P03test extends FunSuite with ShouldMatchers{

  test("3. Find the largest prime factor of a composite number.") {
    s1 should be (6857)
  }
}