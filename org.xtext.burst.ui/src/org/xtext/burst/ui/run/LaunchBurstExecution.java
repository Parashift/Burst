package org.xtext.burst.ui.run;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.burst.burst.impl.FileImpl;

public class LaunchBurstExecution implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		System.err.println("Launching conf " + configuration + " in mode " + mode + " launch " + launch);

	}

	public static void runMyDSL(URI uri) {
		System.err.println("Running " + uri);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource model = resourceSet.getResource(uri, true);
		FileImpl system = null;
		try {
			system = (FileImpl) model.getContents().get(0);
		} catch (ClassCastException e) {
			System.err.println("#Error: invalid model in \"" + uri + "\"");
		}
		new ModelExtension(system);
	}
}
