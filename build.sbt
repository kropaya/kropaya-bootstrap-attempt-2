
organization := "net.flaviusb.kropaya"

name := "kropaya-bootstrap-attempt-2"

version := "0"

description := "The second attempt at bootstrapping kropaya as it's own project"

licenses := Seq("GPLv3" -> url("http://gplv3.fsf.org/")) // This license is fine, as microvm-refimpl2 is released CC BY-SA 4.0, which can be
  // converted to GPLv3 according to both Creative Commons and the FSF.

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
   // "org.microvm" % "microvm-refimpl2" % "2.2.0", // We put the jar in lib, as ivy2 and sbt do not seem to work together when publishing to
   // the local cache
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "org.antlr" % "antlr4" % "4.5.2-1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.github.jnr" % "jnr-ffi" % "2.0.9",
    "com.github.jnr" % "jffi" % "1.2.11",
    "com.github.jnr" % "jnr-posix" % "3.0.29",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
)
