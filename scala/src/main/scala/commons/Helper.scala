package commons

import scala.math.BigInt

object Helper {

  /*The Sieve of Erasthoneses implemented by mattfowler on Medium*/
  def sieve(n: Long): List[Int] = {
    val candidates = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(n).toInt)
    // keep track of multiple of each number not exceeding n.
    val multiple = candidates.flatMap(a => Stream.from(a * a, 2 * a).takeWhile(_ <= n))
    val primes = Stream.from(3, 2).takeWhile(_ <= n).diff(multiple).toList
    List(2) ++ primes
  }

  // computing gcd
  def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

  //compute prime factorization
  def factorization(n: Long): List[Long] = {
    def fac(a: Long, b: Long): List[Long] = a % b match {
      case _ if Math.pow(b, 2) > a => List(a)
      case 0 => b :: fac(a/b, b)
      case _ => fac(a, b+1)
    }
    fac(n, 2)
  }

  /* credit @Jesper on StackOverflow. Don't think I'll be using this in computing solutions. Helpful to know how fast
  * my solution is though.
  */
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }
}
