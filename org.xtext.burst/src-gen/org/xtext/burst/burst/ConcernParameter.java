/**
 * generated by Xtext 2.9.0
 */
package org.xtext.burst.burst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.ConcernParameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getConcernParameter()
 * @model
 * @generated
 */
public interface ConcernParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Concern)
   * @see org.xtext.burst.burst.BurstPackage#getConcernParameter_Name()
   * @model
   * @generated
   */
  Concern getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.ConcernParameter#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Concern value);

} // ConcernParameter
