name := "SparkInAction2-Chapter01"

version := "1.0.0"

scalaVersion := "2.11.11"

val sparkVersion = "2.4.4"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
