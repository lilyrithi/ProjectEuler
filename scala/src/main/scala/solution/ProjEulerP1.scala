package solution

class ProjEulerP1 {
  val result = (1 until 1000).view.filter((x) => (x % 3 == 0 || x % 5 == 0)).sum
}

object solution extends ProjEulerP1 {
  def main(args: Array[String]): Unit = {
    print(result)
  }
}