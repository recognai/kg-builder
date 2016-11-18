package recognai.kg.builder.rdf.spark.enrichment


/**
  * Created by @frascuchon on 14/11/2016.
  */
case class ApplicationConfig(spark: SparkConfig
                             , entities: List[EntityConf]
                             , enrichments: List[EntityConf]
                             , store: StoreConfig)

case class StoreConfig(`exclude.features`: List[String], `elasticsearch.hadoop`: Map[String, String])

case class EntityConf(endpoint: String
                      , prefixes: Map[String, String]
                      , queries: List[String]
                      , partitionSize: Option[Int] = Some(1000)
                      , countLimit: Option[Int] = None)

case class SparkConfig(master: Option[String], appName: String)