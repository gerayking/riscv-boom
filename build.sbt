organization := "edu.berkeley.cs"
version := "3.0"
name := "boom"
scalaVersion := "2.12.10"
addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.3" cross CrossVersion.full)
libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.5.3"
// We also recommend using chiseltest for writing unit tests
libraryDependencies += "edu.berkeley.cs" %% "chiseltest" % "0.5.3" % "test"
libraryDependencies += "edu.berkeley.cs" %% "chisel-iotesters" % "2.5.4"
libraryDependencies += "edu.berkeley.cs" %% "rocketchip" % "1.2.6"