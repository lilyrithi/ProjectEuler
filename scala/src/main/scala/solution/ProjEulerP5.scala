package solution

object ProjEulerP5 extends App {

  def evenlyDivisible(n: Int, start: Int, end: Int): Int = {
    val range = start until (end, 1)
    if(range.forall(d => n % d == 0)) n
    else evenlyDivisible(n+1, start, end)
  }

  println(evenlyDivisible(1,1,20))
}
