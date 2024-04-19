lazy val root = project
  .in(file("."))
  .settings(
    name := "sbt-pipelining-debug",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := "3.4.1",

    usePipelining := true,
    compileOrder  := CompileOrder.JavaThenScala,
  )
