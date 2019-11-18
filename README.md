# spark-alchemy-wrapper

This is a helper for registering [Spark Alchemy](https://github.com/swoop-inc/spark-alchemy) functions in PySpark.

### To build and run paser jar:
`sbt clean assembly`

### To include jar into pyspark:
`pyspark --jars spark-alchemy-wrapper.jar`

### To register Spark Alchemy function and use in Python SparkSQL:
`sc._jvm.com.spark.alchemy.wrapper.PythonHelper.registerHllFunctions(spark._jsparkSession)`
