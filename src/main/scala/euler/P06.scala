package euler

/**
 * Sum square difference
 *
 * What is the difference between the sum of the squares and the square of the sums?
 *
 * The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
object P06 {
  val numbers = 1 to 100

  def square(n: Int) = n * n

  val r = square(numbers.sum) - numbers.map(square).sum
}