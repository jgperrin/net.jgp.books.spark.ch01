package net.jgp.books.spark.ch01.lab100_csv_to_dataframe

import org.apache.spark.sql.SparkSession

/**
  * CSV ingestion in a dataframe.
  *
  * @author rambabu.posa
  */
object CsvToDataframeScalaApp {

  /**
    * main() is your entry point to the application.
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    // Creates a session on a local master
    val spark = SparkSession.builder
                            .appName("CSV to Dataset")
                            .master("local[*]")
                            .getOrCreate

    // Reads a CSV file with header, called books.csv, stores it in a dataframe
    val df = spark.read.format("csv")
                       .option("header", "true")
                       .load("data/books.csv")

    // Shows at most 5 rows from the dataframe
    df.show(5)

    // Good to stop SparkSession at the end of the application
    spark.stop
  }

}
