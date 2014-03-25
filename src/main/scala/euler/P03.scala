package euler

/**
 * Largest prime factor
 * 
 * Find the largest prime factor of a composite number.
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
object P03 {

  def factors(n: Long): List[Long] =
  (2 to math.sqrt(n).toInt).find(n % _ == 0)
    .map(i => i.toLong :: factors(n / i)).getOrElse(List(n))
    
  def s1 = factors(600851475143L).last
}