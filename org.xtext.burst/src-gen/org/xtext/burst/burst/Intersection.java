/**
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.burst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.Intersection#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Intersection#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Intersection#getWithParams <em>With Params</em>}</li>
 *   <li>{@link org.xtext.burst.burst.Intersection#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getIntersection()
 * @model
 * @generated
 */
public interface Intersection extends RuleIntersect
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
   * @see org.xtext.burst.burst.BurstPackage#getIntersection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Intersection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.burst.burst.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.burst.burst.BurstPackage#getIntersection_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>With Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.burst.burst.WithParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Params</em>' containment reference list.
   * @see org.xtext.burst.burst.BurstPackage#getIntersection_WithParams()
   * @model containment="true"
   * @generated
   */
  EList<WithParameter> getWithParams();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.burst.burst.BurstPackage#getIntersection_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.burst.burst.Intersection#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Intersection
