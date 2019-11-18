package com.spark.alchemy.wrapper

import org.apache.spark.sql.SparkSession

object PythonHelper {

  def registerHllFunctions(spark: SparkSession): Unit =
    com.swoop.alchemy.spark.expressions.hll.HLLFunctionRegistration.registerFunctions(spark)

}
