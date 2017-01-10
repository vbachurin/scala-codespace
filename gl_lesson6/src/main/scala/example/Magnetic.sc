package example

object Magnetic {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  object A {

    trait PrintableMagnit {
      def tp: String
      def value: String
    }
    
    def print(m: PrintableMagnit): String = {
      import m._
      s"$tp: $value"
    }

    implicit class IntPrintableMagnit(x: Int) extends PrintableMagnit {
      def tp = "int"
      def value = x.toString
    }

    implicit class StringPrintableMagnit(s: String) extends PrintableMagnit {
      def tp = "string"
      def value = s
    }

    implicit class IntListPrintableMagnit(x: List[Int]) extends PrintableMagnit {
      def tp = "list[int]"
      def value = x.toString
    }

    implicit class StringListPrintableMagnit(x: List[String]) extends PrintableMagnit {
      def tp = "list[string]"
      def value = x.toString
    }

    A.print(5)
    A.print(List(1, 2, 3))
    A.print(List("A", "B", "CX"))

    /*
    def print(x: Int): Unit = {
      Console.println("int: " + x)
    }

    def print(x: String): Unit = {
      Console.println("string: " + x)
    }

    def print(x: List[Int]): Unit = {
      Console.println("List[Int]:" + x)
    }

    def print(x: List[String]): Unit = {
      Console.println("List[String]:" + x)
    }
    */
  }
}