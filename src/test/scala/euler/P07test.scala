package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P07._

@RunWith(classOf[JUnitRunner])
class P07test extends FunSuite with ShouldMatchers{

  test("7. Find the 10001st prime.") {
    r should be (104743)
  }
}