package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P01._

@RunWith(classOf[JUnitRunner])
class P01test extends FunSuite with ShouldMatchers{

  test("1. Add all the natural numbers below one thousand that are multiples of 3 or 5") {
    s1 should be (233168)
    s2 should be (233168)
  }
}