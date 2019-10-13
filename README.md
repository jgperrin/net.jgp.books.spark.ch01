The examples in this repository are support to the **[Spark in Action, 2nd edition](http://jgp.net/sia)** book by Jean-Georges Perrin and published by Manning. Find out more about the book on [Manning's website](http://jgp.net/sia).

# Spark in Action, 2nd edition - chapter 1

Welcome to Spark in Action, 2nd edition, chapter 1. This chapter is an introduction to the book and offers a basic example.

## Lab

This chapter only has one lab:

* Lab \#100: `CsvToDataframeApp` is reading (ingesting) a CSV file and store the content in a dataframe.

## Running the lab in Java

Refer to [Spark in Action, 2nd edition](http://jgp.net/sia)'s chapter 1 for the way to run the lab.

## Running the lab using PySpark

Prerequisites:
 * You will need `git`.
 * 

1. Clone this project

    git clone https://github.com/jgperrin/net.jgp.books.spark.ch01

2. Go to the lab in the Python directory

    cd net.jgp.books.spark.ch01/src/main/python/net/jgp/books/spark/ch01/lab100_csv_to_dataframe/

TODO Ram: install Spark? Refer to an Appendix?

    3. Execute the following spark-submit command to create a jar file to our this application
    ```
    spark-submit CsvToDataframeApp.py
    ```

## Running the lab in Scala

    1. Clone this project
       Assume that cloned this project to ${MY_HOME_DIR}

    2. cd ${MY_HOME_DIR}/src/main/scala

TODO Ram: install Spark? Refer to an Appendix?
TODO Ram: Compile

    3. Execute the following spark-submit command to create a jar file to our this application
    ```
    spark-submit net.jgp.books.spark.ch01.lab100_csv_to_dataframe.Csv2DataframeApp
    ```

Notes: 
 1. Due to renaming the packages to match more closely Java standards, this project is not in sync with the book's MEAP prior to v10 (published around April 2019).
 2. As of MEAP v14, we have introduced Scala and Python examples.
 
---

Follow me on Twitter to get updates about the book and Apache Spark: [@jgperrin](https://twitter.com/jgperrin). Join the book's community on [Facebook](https://facebook.com/sparkinaction/) or in [Manning's live site](https://forums.manning.com/forums/spark-in-action-second-edition?a_aid=jgp).
 