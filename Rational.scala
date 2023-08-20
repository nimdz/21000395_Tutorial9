class Rational (x:Int,y:Int){

  def num= x
  def denom=y

  def neg:Rational=new Rational(-num,denom)
  override def toString: String = s"$num/$denom"

}

object  RationalTest{

  def main(args:Array[String]):Unit={
      val x=new Rational(3,2)
      val y=new Rational(3,4)

    println(s"x = $x")
    println(s"-x = ${x.neg}")

    println(s"y = $y")
    println(s"-y = ${y.neg}")
  }
}
