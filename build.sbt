enablePlugins(ScalaJSPlugin)

name := "scalajs_tutorial"

version := "1.0"

scalaVersion := "2.11.5"

scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)