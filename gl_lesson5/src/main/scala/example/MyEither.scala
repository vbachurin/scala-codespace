package example

object MyEither {

  def parseInt(in: String): Either[String, Int] = {
    try {
      Right(in.toInt)
    } catch {
      case e: Exception =>
        Left(in)
    }
  }

  def divideBy(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Y==0") else Right(x / y)
  }

  for {
    x <- parseInt("AAA").right
    y <- parseInt("BBB").right
    z <- divideBy(x, y).right
  } yield {
    s"$x/$y=$z"
  }

}