enablePlugins(ScalaJSPlugin)

name := "scalajs_tutorial"

version := "1.0"

scalaVersion := "2.11.5"

scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0"
)

skip in packageJSDependencies := false
