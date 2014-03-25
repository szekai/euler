package euler

/**
 * Special Pythagorean triplet
 *
 * Find the only Pythagorean triplet, {a, b, c}, for which a + b + c = 1000.
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
object P09 {
	
  val rs = for{
		c <- 3 until 1000
		b <- 2 until c
		a <- 1 until b
		if c > b
		if b > a
		if a + b + c == 1000
		if a * a + b * b == c *c
	} yield a * b * c                         //> rs  : scala.collection.immutable.IndexedSeq[Int] = Vector(31875000)
	val r = rs(0)
  
}