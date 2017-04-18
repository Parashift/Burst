package org.xtext.burst;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.burst.burst.Access;
import org.xtext.burst.burst.BurstFactory;
import org.xtext.burst.burst.Call;
import org.xtext.burst.burst.Concern;
import org.xtext.burst.burst.ConcernElement;
import org.xtext.burst.burst.ContextManagement;
import org.xtext.burst.burst.File;
import org.xtext.burst.burst.FileElement;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Line;
import org.xtext.burst.burst.Package;
import org.xtext.burst.burst.PackageElement;
import org.xtext.burst.burst.Parameter;
import org.xtext.burst.burst.Role;

public class BurstController {

	private static List<Role> roles = new ArrayList<Role>();
	private static Hashtable<String, Concern> concerns = new Hashtable<String, Concern>();
	private static List<Intersection> intersectionLibres = new ArrayList<Intersection>();
	private static List<Intersection> allIntersections = new ArrayList<Intersection>();
	private static Role affected;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BurstStandaloneSetup.doSetup();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI("file:///c:/test.burst", true), true);

		readResource(resource);
		transformEquality();

		execute(createCallStartProgram(), new ArrayList<Concern>());
	}

	/**
	 * Create the affected role and transform every intersection to replace the
	 * right side of the equality in a content with an affected role Do the same
	 * for intersection definition
	 */
	private static void transformEquality() {
		// Create the affected role
		// affected = BurstFactory.eINSTANCE.createRole();
		// affected.setName("affected");
		// roles.add(affected);
		//
		// for (Intersection inter : allIntersections) {
		// for (Line line : inter.getLines()) {
		// if (line instanceof Call) {
		// Call c = (Call) line;
		// if (c.isEquality()) {
		// for (CallElement cElemt : c.getContent()) {
		// cElemt.getRoles().add(affected);
		// }
		// c.getContent().addAll(c.getSource());
		// c.setEquality(false);
		// }
		// }
		// }
		// }
	}

	/**
	 * @return
	 */
	private static Call createCallStartProgram() {
		Access accessProgram = BurstFactory.eINSTANCE.createAccess();
		accessProgram.setName(concerns.get("Program"));

		Access accessStart = BurstFactory.eINSTANCE.createAccess();
		accessStart.setName(concerns.get("Start"));

		Call call = BurstFactory.eINSTANCE.createCall();

		call.getContent().add(accessProgram);
		call.getContent().add(accessStart);
		call.setEquality(false);
		return call;
	}

	private static void execute(Call call, List<Concern> context) {
		List<Intersection> callStructure = buildCallList(allIntersections, call);
		for (Intersection inter : callStructure) {
			for (Line line : inter.getBlock().getLines()) {
				if (line instanceof Call) {
					Call c = (Call) line;
					// Here we analyze c.getContent() to call the good treatment

				} else if (line instanceof ContextManagement) {
					ContextManagement cm = (ContextManagement) line;
					switch (cm.getAction()) {
					case REMOVE:
						break;
					case ADD:
						break;
					}
				}
			}
		}
	}

	private static Role findEqualRole() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Analyse all intersections to find a good sequence of primitive to invoke
	 * from the most precise combination to the largest one
	 * 
	 * @param allIntersections
	 * @param call
	 * @return
	 */
	private static List<Intersection> buildCallList(List<Intersection> allIntersections, Call call) {
		List<Intersection> sequence = new ArrayList<Intersection>();
		for (Intersection i : allIntersections) {
			// if (i.isApplicableWhen(call)) {
			// int distance = i.countUnusedDimension(call);
			//
			// }
		}
		return sequence;
	}

	/**
	 * Read the resource to collect every object type to include in the Burst VM
	 * recovering the root of the element tree of the language
	 * 
	 * @param resource
	 *            the resource to read
	 */
	private static void readResource(Resource resource) {
		EObject eobject = resource.getContents().get(0);
		if (eobject instanceof File) {
			EList<FileElement> elements = ((File) eobject).getElements();
			for (FileElement elmt : elements) {
				if (elmt instanceof Package) {
					Package pack = (Package) elmt;
					for (PackageElement packElmt : pack.getElements()) {
						if (packElmt instanceof Concern) {
							Concern c = (Concern) packElmt;
							concerns.put(c.getName(), c);
							for (ConcernElement elemt : c.getElements()) {
								if (elemt instanceof Intersection) {
									Intersection intersect = (Intersection) elemt;
									Parameter param = BurstFactory.eINSTANCE.createParameter();
									param.setName("this");
									param.setType(c);
									intersect.getParams().add(0, param);
									allIntersections.add(intersect);
								}
							}
						}
						if (packElmt instanceof Intersection) {
							intersectionLibres.add((Intersection) packElmt);
							allIntersections.add((Intersection) packElmt);
						}
					}
				}
				if (elmt instanceof Role) {
					roles.add((Role) elmt);
				}
			}
		}
	}

}
