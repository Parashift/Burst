/*
 * generated by Xtext 2.9.0
 */
package org.xtext.burst.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.burst.ui.internal.BurstActivator;

public class BurstUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BurstActivator.getInstance().getInjector("org.xtext.burst.Burst");
	}

}
