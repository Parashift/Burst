/**
 * generated by Xtext 2.10.0
 */
package org.xtext.burst.burst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.Concern#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Concern#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends PackageElement, Variable
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
   * @see org.xtext.burst.burst.BurstPackage#getConcern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Concern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.burst.burst.ConcernElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.burst.burst.BurstPackage#getConcern_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ConcernElement> getElements();

} // Concern
