package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P04._

@RunWith(classOf[JUnitRunner])
class P04test extends FunSuite with ShouldMatchers{

  test("4. Find the largest palindrome made from the product of two 3-digit numbers.") {
    s1 should be (906609)
    s2 should be (906609)
  }
}