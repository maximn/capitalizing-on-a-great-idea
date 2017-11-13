name := "Capitalizing On A Great IDEA"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++=
Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "joda-time" % "joda-time" % "2.9.9",
  "org.specs2" %% "specs2-core" % "3.9.1" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")