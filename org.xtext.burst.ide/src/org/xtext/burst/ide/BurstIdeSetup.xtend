/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.burst.BurstRuntimeModule
import org.xtext.burst.BurstStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BurstIdeSetup extends BurstStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BurstRuntimeModule, new BurstIdeModule))
	}
	
}
