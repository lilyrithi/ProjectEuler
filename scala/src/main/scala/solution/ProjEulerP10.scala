package solution

import commons.Helper

object ProjEulerP10 extends App {

  val result = Helper.sieve(2000000).map(a => BigInt(a)).sum
  println(result)
}
