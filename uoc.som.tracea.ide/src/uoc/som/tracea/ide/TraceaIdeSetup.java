/*
 * generated by Xtext 2.21.0
 */
package uoc.som.tracea.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uoc.som.tracea.TraceaRuntimeModule;
import uoc.som.tracea.TraceaStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TraceaIdeSetup extends TraceaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TraceaRuntimeModule(), new TraceaIdeModule()));
	}
	
}
