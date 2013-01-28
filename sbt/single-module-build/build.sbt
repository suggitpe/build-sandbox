name := "openspace-demo"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1"

shellPrompt := {s => System.getProperty("user.name") + "> " }

TaskKey[Unit]("hello") := { 
    println("Hello World!") 
}