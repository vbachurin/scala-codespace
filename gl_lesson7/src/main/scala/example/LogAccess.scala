package example

object LogAccess {
  def logs(userId: Long, startTime: Long, endTime: Long): Either[String, UserAction] = ???
}