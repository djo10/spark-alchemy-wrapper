name := "spark-alchemy-wrapper"

version := "0.1"

scalaVersion := "2.11.8"

assemblyJarName in assembly := "spark-alchemy-wrapper.jar"

val sparkVersion = "2.3.0"

resolvers += Resolver.bintrayRepo("swoop-inc", "maven")

libraryDependencies ++= Seq(
  // spark components
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  
  "com.swoop" %% "spark-alchemy" % "0.5.5"
)