/** ********* PROJECT INFO ******************/
name := "CQRS DDD Scala Example"
version := "1.0"

/** ********* PROJECT SETTINGS ******************/
Configuration.settings

/** ********* PROD DEPENDENCIES *****************/
libraryDependencies ++= Seq(
  "com.github.nscala-time" %% "nscala-time" % "2.16.0",
  "com.lihaoyi" %% "pprint" % "0.5.2",
  "org.typelevel" %% "cats-core" % "1.0.0-MF"
)

/** ********* TEST DEPENDENCIES *****************/
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test
)

/** ********* COMMANDS ALIASES ******************/
addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
addCommandAlias("tq", "testQuick")
addCommandAlias("tsf", "testShowFailed")

addCommandAlias("c", "compile")
addCommandAlias("tc", "test:compile")

addCommandAlias("f", "scalafmt") // Format all files according to ScalaFmt
addCommandAlias("ft", "scalafmtTest") // Test if all files are formatted according to ScalaFmt

addCommandAlias("prep", ";c;tc;ft") // All the needed tasks before running the test
