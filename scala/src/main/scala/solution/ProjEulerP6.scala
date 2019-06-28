package solution

object ProjEulerP6 extends App {

  /* since the sum of square is f(n) = \frac{1}{6}*n*(n+1)(2n+1)
  and the square of sum is g(n)= \frac{1}{4}n^2(n+1)^2
  f(n)-g(n) = \frac{1}{12}*n*(n+1)(3n^2-n-2)
  */

  def diff(n: Int): Long = {
    n * ( n + 1) * ( 3 * n * n - n - 2) / 12
  }
  println(diff(100))
}
