package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P05._

@RunWith(classOf[JUnitRunner])
class P05test extends FunSuite with ShouldMatchers{

  test("5. What is the smallest number divisible by each of the numbers 1 to 20?") {
    s1 should be (232792560)
    s2 should be (232792560)
  }
}