package euler

/**
 * Smallest multiple
 *
 * What is the smallest number divisible by each of the numbers 1 to 20?
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
object P05 {
  def smallestNumber(i: Int): Int = {
    if ((2 to 20).view.filter(x => i % x == 0).size < 19) {
      smallestNumber(i + 1)
    } else { i }
  }

  def s1 = smallestNumber(21)
  
  def s2 = Range(20, Int.MaxValue)
        .find(n => Range(2, 21).forall(n % _ == 0)).get
}