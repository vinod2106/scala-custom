name := "helloSpark"
 
version := "1.0"
 
scalaVersion := "2.10.5"
 
libraryDependencies ++= {
    val sparkVersion =  "1.6.0"
    Seq(
        "org.apache.spark" %% "spark-core" % sparkVersion,
        "org.apache.spark" %% "spark-sql" % sparkVersion,
        "org.apache.spark" %% "spark-repl" % sparkVersion
    )
}
