package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P08._

@RunWith(classOf[JUnitRunner])
class P08test extends FunSuite with ShouldMatchers{

  test("8. Discover the largest product of five consecutive digits in the 1000-digit number.") {
    r should be (40824)
  }
}