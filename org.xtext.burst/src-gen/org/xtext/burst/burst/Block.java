/**
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.burst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.Block#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.xtext.burst.burst.BurstPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Line
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.burst.burst.Line}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.xtext.burst.burst.BurstPackage#getBlock_Lines()
   * @model containment="true"
   * @generated
   */
  EList<Line> getLines();

} // Block
