package example

object ForTest2 {
  val x: MyOption[Int] = MySome(1)

  def y(x: Int): MyOption[Int] =
    if (x % 2 == 0) MySome(x) else MyNone

  for {
    a <- x
    b <- y(a)
  } yield b + 1

  x.flatMap {
    a => { for (b <- y(a)) yield b }

  }

  x.flatMap { a => y(a) map { b => b + 1 } }
}