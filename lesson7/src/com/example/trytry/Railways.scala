package com.example.trytry

object Railways {
  
  trait Request {
    def email:String = ???
  }

  object Operations
  {
  
    def receiveRequest():Either[String,Request] = ???
  
    def validate(r:Request):Either[String,Request] = ???
  
    def canonizeEmail(s:String):Either[String,String] = ???
  
  }
  
  import Operations._
  
  receiveRequest flatMap { request =>
  for{validateRequest <- validate(request)
      email <- canonizeEmail(request.email)
  } yield 1 }
  
}       