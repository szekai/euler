package euler

/**
 * 10001st prime
 *
 * Find the 10001st prime.
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
object P07 {
  
  // More explaination at http://stackoverflow.com/questions/15594227/calculating-prime-numbers-in-scala-how-does-this-code-work
  lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
    ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

  val r = ps(10000)
}