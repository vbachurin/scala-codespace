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
  }

  val z = Z3(10) + Z3(5)                          //> z  : com.example.Test.Z3 = Z3(0)

  val z1 = -Z3(5)                                 //> z1  : com.example.Test.Z3 = Z3(1)
  val z2 = !Z3(4)                                 //> z2  : com.example.Test.Z3 = Z3(-1)

  def min[X <: Ordered[X]](a: X, b: X) =
    if (a < b) a else b                           //> min: [X <: Ordered[X]](a: X, b: X)X

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
    }                                             //> optimize: [X <: Ordered[X] with com.example.Test.Ring[X]](f: X => X, begin: 
                                                  //| X, end: X, step: X)X
}