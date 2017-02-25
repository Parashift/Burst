package org.xtext.burst.ui.run;

import org.xtext.burst.burst.impl.FileImpl;

public class ModelExtension {

	// A ModelExtension that just prints the code to System.out

	public ModelExtension(FileImpl m) {
		System.out.println("Running " + m.toString());
	}

}
