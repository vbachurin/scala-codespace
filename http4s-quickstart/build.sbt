organization := "com.example"
name := "http4s-quickstart"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blaze-server" % "0.15.4a",
  "org.http4s" %% "http4s-dsl"          % "0.15.4a",
  "org.http4s" %% "http4s-argonaut"     % "0.15.4a"
)

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"
