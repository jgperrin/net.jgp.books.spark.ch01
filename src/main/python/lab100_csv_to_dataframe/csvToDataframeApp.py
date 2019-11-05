"""
CsvToDataframeApp.py - CSV ingestion in a dataframe.
@author rambabu.posa
"""
from pyspark.sql import SparkSession
import os

current_dir = os.path.dirname(__file__)
relative_path = "../../../../data/books.csv"
absolute_file_path = os.path.join(current_dir, relative_path)

# Creates a session on a local master
session = SparkSession.builder.appName("CSV to Dataset").master("local[*]").getOrCreate()

# Reads a CSV file with header, called books.csv, stores it in a dataframe
df = session.read.csv(header=True, inferSchema=True, path=absolute_file_path)

# Shows at most 5 rows from the dataframe
df.show(5)

# Good to stop SparkSession at the end of the application
session.stop()