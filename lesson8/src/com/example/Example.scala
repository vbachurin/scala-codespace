package com.example

import scala.util.Try

trait Request {
  def email: String = ???
}

object Operations[M[_] <: CatIntro4.Functor[_]] {

  def receiveRequest(): Either[String, Request] = ???

  def validate(r: Request): Either[String, Request] = ???

  def canonizeEmail(s: String): Either[String, String] = ???

}

trait M {

}

/*
  receiveRequest flatMap { request =>
  for{validateRequest <- validate(request)
      email <- canonizeEmail(request.email)
  } yield 1 }
 */
object A {
  import Operations._
  def process[M](operations: Operations[M])(implicit mm: Monadic[M]): M[Int] = {

    import operations._
    for {
      request <- recieveRequest
      validatedReuest <- validate(request)
      email <- canonizeEmail(request.email)
    } yield 1
  }

}
class Example {

}