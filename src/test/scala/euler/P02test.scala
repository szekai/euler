package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P02._

@RunWith(classOf[JUnitRunner])
class P02test extends FunSuite with ShouldMatchers{

  test("2. Find the sum of all the even-valued terms in the Fibonacci sequence which do not exceed four million.") {
    s1 should be (4613732)
    s2 should be (4613732)
  }
}