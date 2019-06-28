package solution

object ProjEulerP2 extends App {
  val fib: Stream[Int] = 0 #:: fib.scanLeft(1)(_ + _)
  println(fib.takeWhile(_ < 4000000).filter(n => n % 2 == 0).sum)
}
