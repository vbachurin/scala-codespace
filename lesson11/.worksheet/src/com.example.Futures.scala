package com.example

object Futures {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(143); 
  val fx: Future[Int] = Future {
    Thread.sleep(5)
    throw new IllegalStateException("xxx")
    1
  };System.out.println("""fx  : <error> = """ + $show(fx ));$skip(109); 

  val fy: Future[Int] = Future {
    Thread.sleep(5)
    //throw new IllegalStateException("xxx")
    1
  };System.out.println("""fy  : <error> = """ + $show(fy ));$skip(60); 

  val fz: Future[Int] = for (x <- fx; y <- fy) yield x + y;System.out.println("""fz  : <error> = """ + $show(fz ));$skip(39); val res$0 = 

  fx.flatMap(x => fy.map(y => x + y));System.out.println("""res0: <error> = """ + $show(res$0));$skip(40); val res$1 = 

  fz.foreach { z =>
    println(z)
  };System.out.println("""res1: <error> = """ + $show(res$1));$skip(132); val res$2 = 

  fz.onComplete {
    case Success(z) => System.out.println(s"success: $z")
    case Failure(ex) =>
      ex.printStackTrace()
  };System.out.println("""res2: <error> = """ + $show(res$2))}
}
