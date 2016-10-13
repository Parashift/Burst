/**
 * generated by Xtext 2.10.0
 */
package org.xtext.burst.burst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Parameter#isUsage <em>Usage</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Parameter#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Concern)
   * @see org.xtext.burst.burst.BurstPackage#getParameter_Type()
   * @model
   * @generated
   */
  Concern getType();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Parameter#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Concern value);

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
   * @see org.xtext.burst.burst.BurstPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Usage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usage</em>' attribute.
   * @see #setUsage(boolean)
   * @see org.xtext.burst.burst.BurstPackage#getParameter_Usage()
   * @model
   * @generated
   */
  boolean isUsage();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Parameter#isUsage <em>Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usage</em>' attribute.
   * @see #isUsage()
   * @generated
   */
  void setUsage(boolean value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see org.xtext.burst.burst.BurstPackage#getParameter_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Parameter#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // Parameter
