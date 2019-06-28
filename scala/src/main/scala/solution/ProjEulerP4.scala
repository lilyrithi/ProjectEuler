package solution

object ProjEulerP4 extends App {
  val tDigits = 100 until 1000
  var currMax = 0
  val resp = for {
    i <- tDigits
    j <- tDigits
    if palindrome(i*j)
  } yield i*j

  println(resp.max)

  //todo; maybe actually implement something that doesn't involve string?
  def palindrome(n: Int): Boolean = n.toString == n.toString.reverse
}
