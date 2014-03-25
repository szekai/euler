package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P06._

@RunWith(classOf[JUnitRunner])
class P06test extends FunSuite with ShouldMatchers{

  test("6. What is the smallest number divisible by each of the numbers 1 to 20?") {
    r should be (25164150)
  }
}