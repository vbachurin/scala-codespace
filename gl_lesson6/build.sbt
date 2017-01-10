import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.0"
    )),
    name := "gl_lesson6",
    libraryDependencies += scalaTest % Test
  )
