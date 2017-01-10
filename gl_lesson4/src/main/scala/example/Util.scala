package example

class Util {

  def withResource[R <: { def close(): Unit }](r: R)(f: R => Unit): Unit = {
    f
    r.close()
  }
}