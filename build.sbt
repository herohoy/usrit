name := "usrit"

version := "1.0.0"

scalaVersion := "2.12.4"

sbtPlugin := true

organization := "com.today36524"

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  organization := "com.today36524",
  version := "1.0.0",
  scalaVersion := "2.12.4"
)

lazy val api = (project in file("usrit-api"))
  .settings(
    commonSettings,
    name := "usrit-api",
    libraryDependencies ++= Seq(
      "com.github.dapeng" % "dapeng-core" % "2.0.0-SNAPSHOT",
      "com.github.dapeng" % "dapeng-client-netty" % "2.0.0-SNAPSHOT",
      "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0"
    )
  ).enablePlugins(ThriftGeneratorPlugin)


lazy val service = (project in file("usrit-service"))
  .dependsOn( api )
  .settings(
    commonSettings,
    name := "usrit_service",
    libraryDependencies ++= Seq(
      "com.github.dapeng" % "dapeng-spring" % "2.0.0-SNAPSHOT",
      "com.github.wangzaixiang" %% "scala-sql" % "2.0.0",
      "org.slf4j" % "slf4j-api" % "1.7.13",
      "ch.qos.logback" % "logback-classic" % "1.1.3",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "org.codehaus.janino" % "janino" % "2.7.8", //logback (use if condition in logBack config file need this dependency)
      "mysql" % "mysql-connector-java" % "5.1.36",
      "com.alibaba" % "druid" % "1.0.17",
      "org.springframework" % "spring-context" % "4.2.4.RELEASE",
      "com.github.dapeng" % "dapeng-registry-zookeeper" % "2.0.0-SNAPSHOT",
      "com.github.dapeng" % "dapeng-client-netty" % "2.0.0-SNAPSHOT",
      "com.today" % "service-commons_2.12" % "1.1-SNAPSHOT"
    )).enablePlugins(ImageGeneratorPlugin)
    .enablePlugins(DbGeneratorPlugin)
  .enablePlugins(RunContainerPlugin)