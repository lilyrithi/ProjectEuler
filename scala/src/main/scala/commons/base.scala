package commons

class base {

  /*Using the sieve of Eratosthenes to compute prime numbers.
  * n is the end of our natural number sequence starting from 1
  * Return the list of prime numbers*/
  def prime(n: Long): List[Int] = {
    // compute odd numbers since even can't be prime except for 2
    val candidates = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(n).toInt)
    // keep track of multiple of each number not exceeding n.
    val multiple = candidates.flatMap(a => Stream.from(a * a, 2 * a).takeWhile(_ <= n))
    Stream.from(3, 2).takeWhile(_ <= n).diff(multiple).toList
  }

  def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
}
