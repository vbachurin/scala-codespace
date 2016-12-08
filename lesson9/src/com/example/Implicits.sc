package com.example

object Implicits {
  println("Welcome to the Scala worksheet")
  object Sqrt {

    def apply[T](x: T)(implicit n: Numeric[T]): Double =
      {
        def v(s: Double, xn: Double) =
          (xn + s / xn) / 2

        var done = false
        var xp = 1.0
        val s = n.toDouble(x)
        while (!done) {
          val xc = v(s, xp)
          done = Math.abs(xc - xp) < 0.001
          xp = xc
        }
        xp
      }

  }

  Sqrt(200)

  implicit class WithSqrt[X](x: X)(implicit n: Numeric[X]) {

    def sqrt(): Double = Sqrt(x)

  }
}