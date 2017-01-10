package com.typeclasses

object Implicits {
  trait JsonSerializer[T] {
    def toJson(x: T): Json
  }

  trait XmlSerializer[T] {
    def toXml(x: T): Xml
  }

  implicit object PointXmlSerializer extends XmlSerializer[Point] {
    def toXml(x: Point): Xml = ???
  }
}

case class Point(x: Int, y: Int)

trait Json
trait Xml

object X {

  import Implicits._
  def useXml[T](p: T)(implicit m: XmlSerializer[T]): Unit = {
    println(m.toXml(p))
  }

  def useJson(p: Json): Unit = {
    println(p)
  }

}

object XClient {
  X.useXml(new Point(2, 3))
}