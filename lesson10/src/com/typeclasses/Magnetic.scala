package com.typeclasses

trait FunMagnit {
  def id: Int
  def name: String
}

object MagnitClient {
  implicit class PointFunMagnetic(p: Point) extends FunMagnit {
    override def id = p.x * p.y

    override def name = p.toString()
  }

  def main(args: Array[String]): Unit = {
    Magnetic.fun(Point(3, 2))
  }
}

object Magnetic {
  def fun(par: FunMagnit): Unit = {
    System.out.println("par:" + par.id.toString + ":" + par.name.toString)
  }
}