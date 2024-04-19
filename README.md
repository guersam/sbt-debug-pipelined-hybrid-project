## Minimal reproducer for sbt pipelining issue with Java hybrid project

in sbt 1.9.9 and 1.10.0-RC2, a Java + Scala project doesn't trigger Java build with the following config:

```scala
usePipelining := true,
compileOrder  := CompileOrder.JavaThenScala,
```

This is a minimal reproducer of this issue.