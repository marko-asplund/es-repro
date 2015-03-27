package fi.markoa.es.repro.i10290

import org.elasticsearch.common.inject.Inject
import org.elasticsearch.plugins.AbstractPlugin
import org.elasticsearch.river.RiversModule

class FooRiverPlugin @Inject() extends AbstractPlugin {
  def description: String = ???
  def name: String = ???

  def onModule(module: RiversModule): Unit = module.registerRiver(name, classOf[FooRiverModule])
}

