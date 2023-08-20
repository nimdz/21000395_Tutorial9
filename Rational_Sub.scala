class Rational_Sub(n: Int, d: Int) {

  def numer:Int=n
  def denom=d

  def neg: Rational_Sub = new Rational_Sub(-numer, denom)

  def sub(other: Rational_Sub): Rational_Sub = {
    new Rational_Sub(numer * other.denom - other.numer * denom, denom * other.denom)
  }

  override def toString: String = s"$numer/$denom"
}

object RationalTest1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational_Sub(3, 4)
    val y = new Rational_Sub(5, 8)
    val z = new Rational_Sub(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z")
    println(s"x - y - z = $result")
  }
}
