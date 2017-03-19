/**
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.burst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.ContextManagement#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.burst.burst.ContextManagement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getContextManagement()
 * @model
 * @generated
 */
public interface ContextManagement extends Line
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.burst.burst.concernManagment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see org.xtext.burst.burst.concernManagment
   * @see #setAction(concernManagment)
   * @see org.xtext.burst.burst.BurstPackage#getContextManagement_Action()
   * @model
   * @generated
   */
  concernManagment getAction();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.ContextManagement#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see org.xtext.burst.burst.concernManagment
   * @see #getAction()
   * @generated
   */
  void setAction(concernManagment value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Access)
   * @see org.xtext.burst.burst.BurstPackage#getContextManagement_Target()
   * @model containment="true"
   * @generated
   */
  Access getTarget();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.ContextManagement#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Access value);

} // ContextManagement
