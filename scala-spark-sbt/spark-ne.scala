import org.apache.spark.sql.SparkSession
 
object ne {
 
        def main(args: Array[String]) {
                val fil = "/Users/cinzia/gitRepositories/scala-spark/scala-spark-sbt/data/n-europe.csv"
 
                val spark = SparkSession
                        .builder
                        .appName("Scala-Northern-E")
                        .config("spark.master", "local")
                        .getOrCreate()
 
                val neDF = spark.read.csv(fil)
                neDF.show()
        }
}
