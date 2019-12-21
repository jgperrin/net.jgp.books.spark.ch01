This repository contains Scala and Python versions of the Java code used in Manning Publication’s **[Spark in Action, 2nd edition](https://www.manning.com/books/spark-in-action-second-edition?a_aid=jgp)**, by Jean-Georges Perrin..

# Spark in Action, 2nd edition – Java, Python, and Scala code for chapter 1

Chapter 1 introduces the book and offers a basic example.

## Lab

Each chapter has one or more labs. Labs are examples used for teaching in the book(https://www.manning.com/books/spark-in-action-second-edition?a_aid=jgp). You are encouraged to take ownership of the code and modify it, experiment with it, hence the use of the term **lab**. This chapter has only one lab.

### Lab \#100

The `CsvToDataframeApp` application does the following:

1.	It acquires a session (a `SparkSession`).
2.	It asks Spark to load (ingest) a dataset in CSV format.
3.	Spark stores the contents in a dataframe, then displays the first five rows of the dataset.

## Running the lab in Java

For information on running the Java lab, see chapter 1 in [Spark in Action, 2nd edition](http://jgp.net/sia).

## Running the lab using PySpark

Prerequisites:

You will need:
 * `git`.
 * Apache Spark (please refer Appendix P - 'Spark in production: installation and a few tips').

1. Clone this project

    git clone https://github.com/jgperrin/net.jgp.books.spark.ch01

2. Go to the lab in the Python directory

    cd net.jgp.books.spark.ch01/src/main/python/lab100_csv_to_dataframe/

3. Execute the following spark-submit command to create a jar file to our this application

 ```
    spark-submit csvToDataframeApp.py
 ```

## Running the lab in Scala


Prerequisites:

You will need:
 * `git`.
 * Apache Spark (please refer Appendix P - 'Spark in production: installation and a few tips'). 

1. Clone this project

    git clone https://github.com/jgperrin/net.jgp.books.spark.ch01

2. cd net.jgp.books.spark.ch01

3. Package application using sbt command

   ```
     sbt clean assembly
   ```

4. Run Spark/Scala application using spark-submit command as shown below:

   ```
     spark-submit --class net.jgp.books.spark.ch01.lab100_csv_to_dataframe.CsvToDataframeScalaApp target/scala-2.11/SparkInAction2-Chapter01-assembly-1.0.0.jar
   ```

Notes: 
 1. [Java] Due to renaming the packages to match more closely Java standards, this project is not in sync with the book's MEAP prior to v10 (published in April 2019).
 2. [Scala, Python] As of MEAP v14, we have introduced Scala and Python examples (published in October 2019).
 
---

Follow me on Twitter to get updates about the book and Apache Spark: [@jgperrin](https://twitter.com/jgperrin). Join the book's community on [Facebook](https://facebook.com/sparkinaction/) or in [Manning's live site](https://forums.manning.com/forums/spark-in-action-second-edition?a_aid=jgp).
