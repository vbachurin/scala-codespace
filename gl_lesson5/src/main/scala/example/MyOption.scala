package example

sealed abstract class MyOption[+A]
{

  thisMyOption =>
  
  def isEmpty: Boolean

  def map[B](f: A => B)

  def flatMap[B](f: A => MyOption[B]): MyOption[B] =
    this match {
      case MyNone => MyNone
      case MySome(a) => f(a)
    }
  
  // f: A=>MyOption[B]
  // flatten(x map f) == x flatMap f
  
  
  def foreach(f: A=>Unit): Unit

  def filter(p: A => Boolean): MyOption[A]

  def withFilter(p: A=>Boolean) = filter(p)

  
}

object MyOption
{
  
  def flatten[A](x:MyOption[MyOption[A]]):MyOption[A] =
    x match {
      case MySome(x) => x
      case MyNone => MyNone
    }

}

case class MySome[A](val value:A) extends MyOption[A]
{

  override def isEmpty: Boolean = false
  
  def map[B](f: A => B) = MySome(f(value)): MyOption[B]

  def foreach(f: A=>Unit): Unit = f(value)

  def filter(p: A => Boolean): MyOption[A] =
    if (p(value)) this else MyNone



}

case object MyNone extends MyOption[Nothing]
{

  override def isEmpty: Boolean = true

  def map[B](f: Nothing => B) = this

  def foreach(f: Nothing=>Unit): Unit = {}

  def filter(p: Nothing => Boolean): MyOption[Nothing] = this


}