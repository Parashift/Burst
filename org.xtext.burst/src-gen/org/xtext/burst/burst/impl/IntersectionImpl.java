/**
 * generated by Xtext 2.9.0
 */
package org.xtext.burst.burst.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Line;
import org.xtext.burst.burst.Member;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getLinesContent <em>Lines Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionImpl extends AbstractElementImpl implements Intersection
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * The cached value of the '{@link #getLinesContent() <em>Lines Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinesContent()
   * @generated
   * @ordered
   */
  protected EList<Line> linesContent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntersectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BurstPackage.Literals.INTERSECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BurstPackage.INTERSECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, BurstPackage.INTERSECTION__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Line> getLinesContent()
  {
    if (linesContent == null)
    {
      linesContent = new EObjectContainmentEList<Line>(Line.class, this, BurstPackage.INTERSECTION__LINES_CONTENT);
    }
    return linesContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BurstPackage.INTERSECTION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case BurstPackage.INTERSECTION__LINES_CONTENT:
        return ((InternalEList<?>)getLinesContent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BurstPackage.INTERSECTION__NAME:
        return getName();
      case BurstPackage.INTERSECTION__MEMBERS:
        return getMembers();
      case BurstPackage.INTERSECTION__LINES_CONTENT:
        return getLinesContent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BurstPackage.INTERSECTION__NAME:
        setName((String)newValue);
        return;
      case BurstPackage.INTERSECTION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
        return;
      case BurstPackage.INTERSECTION__LINES_CONTENT:
        getLinesContent().clear();
        getLinesContent().addAll((Collection<? extends Line>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BurstPackage.INTERSECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BurstPackage.INTERSECTION__MEMBERS:
        getMembers().clear();
        return;
      case BurstPackage.INTERSECTION__LINES_CONTENT:
        getLinesContent().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BurstPackage.INTERSECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BurstPackage.INTERSECTION__MEMBERS:
        return members != null && !members.isEmpty();
      case BurstPackage.INTERSECTION__LINES_CONTENT:
        return linesContent != null && !linesContent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IntersectionImpl
