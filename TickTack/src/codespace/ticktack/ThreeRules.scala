package codespace.ticktack

class ThreeRules {
  case class ThreeField(val data: Array[Array[Option[Label]]]) extends Rules {
    override def get(i: Int, j: Int): Option[Label] = {
      checkCorrect(i, j)
      data(i)(j)
    }
    
    override def put(i: Int, j: Int, l: Label): Field = {
      checkCorrect(i, j)
      get(i, j) match {
        case Some(label) => 
          throw new IllegalArgumentException("label already filled")
        case None =>
          val nextRow: IndexedSeq[Option[Label]] = data(i).patch(j, Seq(Some(l)), j)
          val nextData: IndexedSeq[IndexedSeq[Option[Label]]] = 
            data.patch(i, Seq(nextRow), i)
          ThreeField(nextData)
      }
    }
    
    def checkCorrect(i: Int, j: Int): Unit = {
    	require(i >= 0)
    	require(j >= 0)
    	require(i < data.length)
    	require(j < data(0).length)
    }
  }
}