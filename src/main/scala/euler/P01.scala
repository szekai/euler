package euler

/**
 * 
 * Multiples of 3 and 5
 * 
 * Add all the natural numbers below one thousand that are multiples of 3 or 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
object P01 {

  def s1 = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum
  
  def s2 = {
    def s2_(l: List[Int], total: Int):Int = l match{
      case Nil => total
      case x::xs => if(x % 3 == 0 || x % 5 == 0){ s2_(xs, total + x) } else s2_(xs, total) 
    }
    
    s2_((1 until 1000).toList, 0)
  }
}