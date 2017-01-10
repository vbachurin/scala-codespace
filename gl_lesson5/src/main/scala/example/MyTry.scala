package example

import scala.util.Failure
import scala.util.Success
import scala.util.Try

object MyTry {

  def parseInt(in: String): Try[Int] = {
    try {
      Success(in.toInt)
    } catch {
      case e: Exception =>
        Failure(e)
    }
  }

  def divideBy(x: Int, y: Int): Try[Int] = {
    Try(x / y)
  }

  for {
    x <- parseInt("AAA")
    y <- parseInt("BBB")
    z <- divideBy(x, y)
  } yield {
    s"$x/$y=$z"
  }

}