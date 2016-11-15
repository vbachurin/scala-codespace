object WS1 {
/*
  var i = 0
  var s = 0
  while(i < 10) {
  	val div3 = if (i % 3 == 0) true else false
  	val div5 = if (i % 5 == 0) true else false
  	if (div3 || div5) {
  		s += i
  	}
  	i += 1
  }
  s
*/
  
  
  val f: Int => Boolean = ((x:Int) => (x % 3 == 0))
                                                  //> f  : Int => Boolean = <function1>
  
  def f1(x: Int) = (x %3 == 0)                    //> f1: (x: Int)Boolean
  val myFun00 = (x: Int) => f1(x)                 //> myFun00  : Int => Boolean = <function1>
  val myFun: (Int => Boolean) = f1                //> myFun  : Int => Boolean = <function1>
  
  val r0 = (1 to 10).filter(x => (x % 3 == 0))    //> r0  : scala.collection.immutable.IndexedSeq[Int] = Vector(3, 6, 9)
 
  val r = 1 until 1000 filter(x =>
  	(x % 3 == 0) || (x % 5 == 0)
  	) sum                                     //> r  : Int = 233168
}