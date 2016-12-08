package com.example

class CatIntro4 {
  trait Functor[F[_]] {
    def map[A, B](a: F[A])(f: A => B): F[B]

    /*
  ({   type F[X]
      type G[X]
      type FG[X] = F[G[X]] })
      
      =======
    def compose[G[_]](g: Functor[G]): Functor[F[G]] =
      new Functor[F[G]] {
        def map[A, B](a: F[G][A])(f: A => B): F[G][B] = {
          self.map[G[A],G[B]](a)((x: G[A]) => g.map(x)(f))
        }

      }
    		 */
  }
  object OptionFunctor extends Functor[Option] {
    def map[A, B](a: Option[A])(f: A => B): Option[B] = a map f
  }

  object ListFunctor extends Functor[List] {
    def map[A, B](a: List[A])(f: A => B): List[B] = a map f
  }

  trait Apply[F[_]] extends Functor[F] {
    def ap[A, B](ff: F[A => B])(a: F[A]): F[B]
  }

  object OptionApply extends Apply[Option] {
    def ap[A, B](ff: Option[A => B])(fa: Option[A]): Option[B] = {
      ff.flatMap(f => fa map (a => f(a)))
      /*
      for{f <- ff
          a <- fa
        } yield f(a)      */
    }

    def map[A, B](a: Option[A])(f: A => B): Option[B] = a map f
  }

  trait Applicative[F[_]] extends Apply[F] {
    def pure[A](a: A): F[A]

    def pureFun[A, B](f: A => B): F[A => B] = pure(f)
  }

  trait Monadic[F[_]] extends Functor[F] {
    def map[A, B](f: A => B): F[A] => F[B]

    def flatten[A](ffa: F[F[A]]): F[A]

    def flatMap[A, B](f: A => F[B]): (F[A] => F[B]) =
      (fa: F[A]) =>
        //val faffb:(F[A] => F[F[B]]) = map(f)
        flatten(map(f)(fa))
  }

  def f(): Int = {
    var x = 1
    var z = 0
    for (i <- 1 to 10) {
      x = x * 2
    }
    x
  }

  def f1(): Int = {
    def s(i: Int, x: Int): Option[Int] = if (i == 10) Some(x) else s(i + 1, x * 2)
    s(1, 1).get
  }

}