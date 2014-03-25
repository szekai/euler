package ninetynine

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import ninetynine.P01._

@RunWith(classOf[JUnitRunner])
class P01test extends FunSuite with ShouldMatchers{

  test("Get last 1") {
    findLast1(List(1,2,3,4,5)) should be (5)
  }
  
  test("Get last 2") {
    findLast2(List(1,2,3,4,5)) should be (5)
  }
  
  test("Get last 3") {
    findLast3(List(1,2,3,4,5)) should be (5)
    f3(List(1,2,3,4,5)) should be (5)
    f4(List(1,2,3,4,5)) should be (5)
    f5(List(1,2,3,4,5)) should be (5)
    f6(List(1,2,3,4,5)) should be (5)
  }
}