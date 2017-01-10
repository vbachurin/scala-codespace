package example

object ImplicitTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  class IntWrapper(val x: Int) {
    def **(y: Int) = x * y * y
  }

  implicit def x2wrapper(x: Int): IntWrapper = new IntWrapper(x)
                                                  //> x2wrapper: (x: Int)example.ImplicitTest.IntWrapper

  def f(x: Int): Int = x**3                       //> f: (x: Int)Int

  f(4)                                            //> res0: Int = 36
  
  
  implicit val xImplicit: Int = 4                 //> xImplicit  : Int = 4
  
  def f2(x:Int)(implicit y:Int):Int = x**y        //> f2: (x: Int)(implicit y: Int)Int
  
  f2(4)                                           //> res1: Int = 64
  f2(4)(3)                                        //> res2: Int = 36
}