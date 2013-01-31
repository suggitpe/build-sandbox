import sbt._
import sbt.Keys._

object Build extends Build {

    lazy val root = Project(
        id = "SbtOpenspace",
        base = file(".")
    ) aggregate(rdsApi, rdsImpl)

    lazy val rdsApi = Project(
        id = "rds-api",
        base = file("rds-api"),
        dependencies = Seq(),
        settings = defaultSettings ++ Seq()
    )

    lazy val rdsImpl = Project(
        id = "rds-impl",
        base = file("rds-impl"),
        dependencies = Seq(rdsApi),
        settings = defaultSettings ++ Seq()
    )

    // ############################
    // SETTINGS
    override lazy val settings =
        super.settings ++
            buildSettings ++
            Seq(shellPrompt := {
                s => Project.extract(s).currentProject.id + "> "
            })

    lazy val buildSettings = Seq(
        organization := "org.suggs",
        version := "1.0",
        scalaVersion := "2.10.0"
    )

    lazy val baseSettings = Defaults.defaultSettings ++ Seq(
        libraryDependencies ++= Dependencies.depAllProjects
    )

    lazy val defaultSettings = baseSettings ++ Seq(
     // here we put scalac and javac settings etc
    )


}

object Dependencies {


    val scalatest = "org.scalatest" %% "scalatest" % "1.9.1"

    lazy val depAllProjects = Seq(scalatest)
}

