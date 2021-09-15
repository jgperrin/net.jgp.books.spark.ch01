package com.npd.jgp.labs.lab100_ingest_gfiles;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

/**
 * CSV ingestion in a dataframe.
 * 
 * @author jgp
 */
public class GfileToDataframeApp {

  /**
   * main() is your entry point to the application.
   * 
   * @param args
   */
  public static void main(String[] args) {
    GfileToDataframeApp app = new GfileToDataframeApp();
    app.start(
        "/Users/jgp/Documents/Jean-Georges/Work/NPD/Projects/2107 Curation/Data/g10502021061.sample.dlm");
  }

  /**
   * The processing code.
   */
  private void start(String pathToGfile) {
    // Creates a session on a local master
    SparkSession spark = SparkSession.builder()
        .appName("Gfile to dataframe").master("local").getOrCreate();

    // Reads a CSV file with header, called books.csv, stores it in a
    // dataframe
    Dataset<Row> df = spark.read().format("csv").option("header", false)
        .option("sep", "|")
        .option("inferSchema", true).load(pathToGfile)
        .withColumnRenamed("_c0", "outletDepartment")
        .withColumnRenamed("_c1", "outletClass")
        .withColumnRenamed("_c2", "outletSubclass")
        .withColumnRenamed("_c3", "SubSubclass")
        .withColumnRenamed("_c4", "Sku")
        .withColumnRenamed("_c5", "outletdescription")
        .withColumnRenamed("_c6", "outletbrand")
        .withColumnRenamed("_c7", "mfrnumber")
        .withColumnRenamed("_c8", "outletitemnumber")
        .withColumnRenamed("_c9", "manufacturercode")
        .withColumnRenamed("_c10", "Unitssold")
        .withColumnRenamed("_c11", "Price")
        .withColumnRenamed("_c12", "totalvalue")
        .withColumnRenamed("_c13", "inventory")
        .withColumnRenamed("_c14", "privatelabelflag")
        .withColumnRenamed("_c15", "c15")
        .withColumnRenamed("_c16", "c16")
        .withColumnRenamed("_c17", "c17")
        .withColumnRenamed("_c18", "c18")
        .withColumnRenamed("_c19", "c19")
        .withColumnRenamed("_c20", "c20")
        .withColumnRenamed("_c21", "c21")
        .withColumnRenamed("_c22", "c22")
        .withColumnRenamed("_c23", "c23")
        .withColumnRenamed("_c24", "c24")
        .withColumnRenamed("_c25", "c25")
        .withColumnRenamed("_c26", "c26")
        .withColumnRenamed("_c27", "c27")
        .withColumnRenamed("_c28", "c28")
        .withColumnRenamed("_c29", "posoutlet")
        .withColumnRenamed("_c30", "c30")
        .withColumnRenamed("_c31", "c31")
        .withColumnRenamed("_c32", "c32")
        .withColumnRenamed("_c33", "c33")
        .withColumnRenamed("_c34", "c34")
        .withColumnRenamed("_c35", "c35")
        .withColumnRenamed("_c36", "c36")
        .withColumnRenamed("_c37", "c37")
        .withColumnRenamed("_c38", "c38")
        .withColumnRenamed("_c39", "c39")
        .withColumnRenamed("_c40", "c40")
        .withColumnRenamed("_c41", "c41");

    // Shows at most 5 rows from the dataframe
    df.show(5);
    df.printSchema();

  }
}
