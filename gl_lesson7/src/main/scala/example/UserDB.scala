package example

import scala.reflect.runtime.universe._

trait Subscriber[T <: TariffPlan] {
  def id: Long
}

trait TariffPlan {
  def rate(logs: Seq[UserAction]): Either[String, Double]
}

trait Unlimited extends TariffPlan {

}

object UserDB {
  def tariffPlan[T <: TariffPlan](s: Subscriber[T]): T = ???

  //getter
  def subscriber[T <: TariffPlan](userId: Long)(implicit tt: TypeTag[T]): Option[Subscriber[T]] = {
    if (typeOf[T] =:= typeOf[Unlimited]) {
      None
    } else {
      None
    }
  }

  //  def logs[T](id: Long) = ???

}