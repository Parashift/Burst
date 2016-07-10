/**
 * generated by Xtext 2.9.0
 */
package org.xtext.burst.burst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destruct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.Destruct#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Destruct#getLinesContent <em>Lines Content</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getDestruct()
 * @model
 * @generated
 */
public interface Destruct extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.burst.burst.BurstPackage#getDestruct_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Destruct#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lines Content</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.burst.burst.Line}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines Content</em>' containment reference list.
   * @see org.xtext.burst.burst.BurstPackage#getDestruct_LinesContent()
   * @model containment="true"
   * @generated
   */
  EList<Line> getLinesContent();

} // Destruct
