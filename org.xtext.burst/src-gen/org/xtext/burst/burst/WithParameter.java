/**
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.burst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.WithParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.WithParameter#isUsage <em>Usage</em>}</li>
 *   <li>{@link org.xtext.burst.burst.WithParameter#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getWithParameter()
 * @model
 * @generated
 */
public interface WithParameter extends Variable
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
   * @see org.xtext.burst.burst.BurstPackage#getWithParameter_Name()
   * @model
   * @generated
   */
  Concern getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.WithParameter#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Concern value);

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
   * @see org.xtext.burst.burst.BurstPackage#getWithParameter_Usage()
   * @model
   * @generated
   */
  boolean isUsage();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.WithParameter#isUsage <em>Usage</em>}' attribute.
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
   * @see org.xtext.burst.burst.BurstPackage#getWithParameter_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.WithParameter#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // WithParameter
