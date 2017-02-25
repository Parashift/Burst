package org.xtext.burst.ui.run;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
//import org.eclipse.xtext.resource.XtextResourceSet;
//
//import com.google.inject.Inject;

public class BurstLauncher implements ILaunchShortcut {
	// @Inject
	// private XtextResourceSet resourceSet;

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection.isEmpty()) {
			return;
		}

		if (selection instanceof StructuredSelection) {
			@SuppressWarnings("unchecked")
			Iterator<Object> iter = ((StructuredSelection) selection).iterator();
			while (iter.hasNext()) {
				IFile ifile = Platform.getAdapterManager().getAdapter(iter.next(), IFile.class);
				URI uri = URI.createFileURI(ifile.getLocation().toFile().getPath());
				System.err.println("File uri = " + uri);
				LaunchBurstExecution.runMyDSL(uri);
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		if (input instanceof IFileEditorInput) {
			IFile ifile = ((IFileEditorInput) input).getFile();
			URI uri = URI.createFileURI(ifile.getLocation().toFile().getPath());
			LaunchBurstExecution.runMyDSL(uri);
		}

	}
}
