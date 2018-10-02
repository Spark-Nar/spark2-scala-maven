package com.nar.allaboutscala

object DataFrame_Tutorial extends App with Context{

  // Create a DataFrame from reading a CSV file
  val dfTags = sparkSession
    .read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv("src/main/resources/question_tags_10K.csv")
    .toDF("id", "tag")

  dfTags.show(10)

}
