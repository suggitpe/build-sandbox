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
        dependencies = Seq()
    )

    lazy val rdsImpl = Project(
        id = "rds-impl",
        base = file("rds-impl"),
        dependencies = Seq(rdsApi)
    )

    override lazy val settings =
        super.settings ++
            buildSettings ++
            Seq( shellPrompt := {s => Project.extract(s).currentProject.id + "> " } )

    lazy val buildSettings = Seq(
        organization := "org.suggs",
        version := "1.0",
        scalaVersion := "2.10.0"
    )

}

