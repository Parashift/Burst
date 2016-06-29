/**
 */
package burst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link burst.File#getConcern <em>Concern</em>}</li>
 * </ul>
 *
 * @see burst.BurstPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>Concern</b></em>' containment reference list.
	 * The list contents are of type {@link burst.concern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' containment reference list.
	 * @see burst.BurstPackage#getFile_Concern()
	 * @model containment="true"
	 * @generated
	 */
	EList<concern> getConcern();

} // File
