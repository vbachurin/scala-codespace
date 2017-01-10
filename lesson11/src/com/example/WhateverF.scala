package com.example

import java.util.concurrent.Future

object WhateverF {
  val fx:Future[Int] = Future{
  Thread.sleep(5)
  throw new IllegalStateException("xxx")
  1
}

val fy:Future[Int] = Future{
  Thread.sleep(5)
  //throw new IllegalStateException("xxx")
  1
}

val fz:Future[Int] = for(x <- fx; y<-fy ) yield x+y

fx.flatMap(x => fy.map(y => x+y))

fz.foreach{ z =>
  println(z)
}

fz.onComplete{
  case Success(z) => System.out.println(s"success: $z")
  case Failure(ex) => 
    ex.printStackTrace()
}
}