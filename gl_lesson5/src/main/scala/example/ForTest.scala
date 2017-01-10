sealed trait Maybe[+A] {
  def map[B](f: A => B)
  
  def flatMap[B](f: => Maybe[B]): Maybe[B] = {
    thisMaybe match {
      case EmptyMaybe => EmptyMaybe
      case MyFortest(a) => f(a)
    }
  }

  def foreach(f: A => Unit): Unit

  def filter(p: A => Boolean): Maybe[A]

  def withFilter(p: A => Boolean) = filter(p)

}

case object EmptyMaybe extends Maybe[Nothing] {
  def map[B](f: Nothing => B) = this

  def foreach(f: Nothing => Unit): Unit = {}

  def filter(p: Nothing => Boolean): Maybe[Nothing] = this

}

case class MyFortest[A](a: A) extends Maybe[A] {

  def map[B](f: A => B) = f(a)

  def foreach(f: A => Unit): Unit = f(a)

  def filter(p: A => Boolean): Maybe[A] =
    if (p(a)) this else EmptyMaybe

  def withFilter(p: A => Boolean) = new AnyRef {
    def map[B](f: A => B): Maybe[B] =
      thisMaybe match {
        case EmptyMaybe => EmptyMaybe
        case MyFortest(a) => if (p(a))
          MyFortest(f(a))

      }
  }

}

for (x <- MyFortest(1) if (x == 1)) {
  Console.println(x)
}