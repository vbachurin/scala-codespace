name := "gl-scalaz"

version := "1.0"

scalaVersion := "2.12.1"

val scalazVersion = "7.2.8"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.8",
  "org.scalaz" %% "scalaz-effect" % scalazVersion
)
    