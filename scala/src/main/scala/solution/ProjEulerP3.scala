package solution

import commons.Helper


object ProjEulerP3 extends App {

  val result = Helper.factorization(600851475143L).max
  println(result)

}
