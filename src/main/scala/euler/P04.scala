package euler

/**
 * Largest palindrome product
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object P04 {
  def s1 = (for {
    i <- (100 to 999)
    j <- (i to 999)
  } yield i * j).filter(n => n.toString == n.toString.reverse).max
  
  def s2 = (100 to 999).view
        .flatMap(i => (i to 999).map(i *))
        .filter(n => n.toString == n.toString.reverse)
        .max
}