package example

import scala.async.Async._
import scala.concurrent.Future
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._


package example.AsyncExample {


  object AsyncExample {
    def main(args: Array[String]): Unit = {
      val f = Future{
        Thread.sleep(100)
        100
      }
      val f1 = async {
        Console.println("before f")
        await(f)
        Console.println("after f")
      }
      Await.ready(f1, 1 second)
      Console.println("f1 reade")
    }
  }
}