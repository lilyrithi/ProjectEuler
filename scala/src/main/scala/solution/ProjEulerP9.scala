package solution

import commons.Helper

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

object ProjEulerP9 extends App {

  /*
  using Euclid's formula to generate Pythagorean Triples
  https://en.wikipedia.org/wiki/Pythagorean_triple
  a = (m^2 - n^2)d, b = 2mnd, c = (m^2+n^2)d -- read the given link for the proof
  a + b + c = s
  (m^2-n^2)d + 2mnd + (m^2+n^2)d = s
  d(m^2 - n^2 + 2mn + m^2 + n^2) = s
  d(2m^2 + 2mn) = s
  2dm(m+n) = s
  Thus, m is a divisor of s/2 and m < sqrt(s/2). So, find k = m+n such that k is a divisor of s/2m
  */

  /*val lim = Math.sqrt(1000/2).toInt
  var k, m, n, d, a, b, c = 0
  for(m <- 2 to lim) {
    if(500 % m == 0) {
      k = m + 1
    } else m + 2
    while(k < 2*m && k <= 1000 / (2*m)) {
      if(1000/(2*m) % k == 0 && Helper.gcd(k, m) == 1) {
        d = 500 / (k*m)
        n = k - m
        a = d * ( m * m - n * n)
        b = 2 * m * n * d
        c = d * (m * m + n * n)
      }
    }
  }*/
  val lim = Math.sqrt(1000/2).toInt
  val result = for {
    m <- 2 to lim
    n <- 1 until m
    a = m * m - n * n
    b = 2 * m * n
    c = m * m + n * n
    if a+b+c == 1000
  } yield a*b*c

  println(result)
}
