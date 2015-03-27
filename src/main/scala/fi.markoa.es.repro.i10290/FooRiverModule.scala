package fi.markoa.es.repro.i10290

import org.elasticsearch.common.inject.AbstractModule
import org.elasticsearch.river.River

class FooRiverModule extends AbstractModule {
  override def configure = bind(classOf[River]).to(classOf[FooRiver]).asEagerSingleton()
}