package fi.markoa.es.repro.i10290

import java.util.TimeZone

import org.elasticsearch.client.Client
import org.elasticsearch.common.inject.Inject
import org.elasticsearch.river._
import org.joda.convert.StringConvert

class FooRiver @Inject() (riverName: RiverName, settings: RiverSettings,
                                      @RiverIndexName riverIndexName: String,
                                      client: Client)
  extends AbstractRiverComponent(riverName, settings) with River {

  def close(): Unit = ???
  def start(): Unit = ???

  def foo = {
    val zone = StringConvert.INSTANCE.convertFromString(classOf[TimeZone], "");
  }
}