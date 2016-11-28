package com.example

object Test {
  trait Ring[X <: Ring[X]] {

    type Self = X

    def +(x: Self): Self

    def unary_- : Self
    def unary_+ : this.type = this

    def *(y: Self): Self

  }

  case class Z3(v: Int) extends Ring[Z3] {

    def +(x: Z3): Self = Z3((_v + x._v) % 3)

    def unary_- : Z3 = Z3(3 - _v)

    def unary_! : Z3 = Z3(-3 - _v)

    def *(x: Z3) = Z3((_v * x._v) % 3)

    override def toString = s"Z3(${_v})"

    private val _v = v % 3
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(499); 

  val z = Z3(10) + Z3(5);System.out.println("""z  : com.example.Test.Z3 = """ + $show(z ));$skip(19); 

  val z1 = -Z3(5);System.out.println("""z1  : com.example.Test.Z3 = """ + $show(z1 ));$skip(18); 
  val z2 = !Z3(4);System.out.println("""z2  : com.example.Test.Z3 = """ + $show(z2 ));$skip(66); 

  def min[X <: Ordered[X]](a: X, b: X) =
    if (a < b) a else b;System.out.println("""min: [X <: Ordered[X]](a: X, b: X)X""");$skip(252); 

  def optimize[X <: (Ordered[X] with Ring[X])](f: X => X, begin: X, end: X, step: X): X =
    {
      var c: X = begin
      var cm = f(c)
      while (c < end) {
        var y = f(c)
        cm = min(c, y)
        c = c + step
      }
      cm
    };System.out.println("""optimize: [X <: Ordered[X] with com.example.Test.Ring[X]](f: X => X, begin: X, end: X, step: X)X""")}
}
