name := "helloworld"

// note that the ':=' is a method on SettingKey that returns a Setting object 
//  [version is a SettingKey object], such that the follow are the same:
// version.:=("1.0")
version:= "1.0"

scalaVersion := "2.9.2"

libraryDependencies += "junit" % "junit" % "4.9"

libraryDependencies ++= Seq(
    "org.hamcrest" % "hamcrest-all" % "1.1"
)

// map lots of classes with the same names to the lib deps
libraryDependencies ++= Seq("spring-core", "spring-orm", "spring-jdbc") map ("org.springframework" % _ % "3.1.1.RELEASE")

// define a simple task
TaskKey[Unit]("hello") := { println("Hello World!") }

// customise the sbt prompt (because we can)
shellPrompt := {state => System.getProperty("user.name") + ">" }

maxErrors := 20

pollInterval := 1000


