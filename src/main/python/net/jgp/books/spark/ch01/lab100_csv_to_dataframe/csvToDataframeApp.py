"""
CsvToDataframeApp.py - CSV ingestion in a dataframe.
@author rambabu.posa
"""
from pyspark.sql import SparkSession

# Creates a session on a local master
session = SparkSession.builder.appName("CSV to Dataset").master("local[*]").getOrCreate()

# Reads a CSV file with header, called books.csv, stores it in a dataframe
df = session.read.csv(header=True, inferSchema=True, path="../../../data/books.csv")

# Shows at most 5 rows from the dataframe
df.show(5)

# Good to stop SparkSession at the end of the application
session.stop()