Original blog:
https://markobigdata.com/2017/01/07/creating-first-scala-project-with-sbt-and-submitting-it-to-apache-spark/

Importante capire come e' fatto questo file:
build.sbt 

fork := true --> Verify with Ammonite
https://stackoverflow.com/questions/44298847/why-do-we-need-to-add-fork-in-run-true-when-running-spark-sbt-application



Simple Build Tool (sbt)
sbt compile
sbt run
sbt package

--> sbt package and run generate the jar file /target/scala-xxx/projectName????.jar

Eg.
$SPARK_HOME/bin/spark-submit --class ne /Users/cinzia/gitRepositories/scala-spark/scala-spark-sbt/target/scala-2.12/spark-ne_2.12-1.0.jar




Command to list the files inside a jar file
jar tvf /Users/cinzia/gitRepositories/scala-spark/scala-spark-sbt/target/scala-2.12/spark-ne_2.12-1.0.jar


Quick Introduction (Scala)
https://www.scala-lang.org/documentation/your-first-lines-of-scala.html


Questions:
https://stackoverflow.com/questions/27192398/what-is-the-difference-of-running-scala-and-sbt-console
https://stackoverflow.com/questions/44298847/why-do-we-need-to-add-fork-in-run-true-when-running-spark-sbt-application