package net.jgp.books.sparkWithJava.ch01;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

/**
 * CSV ingestion in a dataframe.
 * 
 * @author jperrin
 */
public class CsvToDataframeApp {

	/**
	 * main() is your entry point to the application. 
	 * @param args
	 */
    public static void main(String[] args) {
        CsvToDataframeApp app = new CsvToDataframeApp();
        app.start();
    }

    /**
     * The processing code.
     */
    private void start() {
        // Creates a session on a local master
        SparkSession spark = SparkSession.builder()
                .appName("CSV to Dataset")
                .master("local")
                .getOrCreate();

        // Reads a CSV file with header, called books.csv, stores it in a dataframe
        Dataset<Row> df = spark.read().format("csv")
                .option("header", "true")
                .load("data/books.csv");

        // Shows at most 5 rows from the dataframe
        df.show(5);
    }
}
