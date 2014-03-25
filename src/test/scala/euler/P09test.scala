package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import euler.P09._

@RunWith(classOf[JUnitRunner])
class P09test extends FunSuite with ShouldMatchers{

  test("9. Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.") {
    r should be (31875000)
  }
}