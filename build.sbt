enablePlugins(ScalaJSPlugin)

name := "scalajs_tutorial"

version := "1.0"

scalaVersion := "2.11.5"

scalaJSStage in Global := FastOptStage

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

jsDependencies += RuntimeDOM

persistLauncher in Compile := true

persistLauncher in Test := false