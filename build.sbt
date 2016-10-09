name := "example-di-scala"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "com.softwaremill.macwire" %% "macros" % "2.2.0" % "provided",
  "com.softwaremill.macwire" %% "util" % "2.2.0" % "provided",
  "org.scaldi" %% "scaldi" % "0.5.7" % "provided",
  "com.escalatesoft.subcut" %% "subcut" % "2.1" % "provided"
)
