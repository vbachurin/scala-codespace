import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "gl_lesson7",
    libraryDependencies += scalaTest % Test,
    
    libraryDependencies += scalaVersion( "org.scala-lang" % "scala-reflect" % _)
  )
