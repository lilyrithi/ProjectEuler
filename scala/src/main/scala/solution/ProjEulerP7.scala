package solution

import java.lang.Math._
import commons.Helper
/*
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*/

object ProjEulerP7 extends App {
  // compute the upper bounds for n-th prime, http://en.wikipedia.org/wiki/Prime_number_theorem
  def primeUpperBound(n: Int): Int = {
    if(n > 6)
      ceil(n * (log(n) + log(log(n)))).toInt
    else n
  }

  val upperBound = primeUpperBound(10001)
  val sieve = Helper.sieve(upperBound)
  println(sieve(10000))
}
