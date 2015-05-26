name := "es-repro"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
//  "org.elasticsearch" % "elasticsearch" % "1.0.0.Beta2",
  //"org.elasticsearch" % "elasticsearch" % "1.4.4",
  "org.elasticsearch" % "elasticsearch" % "1.5.2",
  "joda-time" % "joda-time"    % "2.3",
  "org.joda"  % "joda-convert" % "1.6"
)
