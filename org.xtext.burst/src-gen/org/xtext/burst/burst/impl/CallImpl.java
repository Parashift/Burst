/**
 * generated by Xtext 2.11.0
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Call;
import org.xtext.burst.burst.CallElement;
import org.xtext.burst.burst.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.impl.CallImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.CallImpl#isEquality <em>Equality</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.CallImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.CallImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends LineImpl implements Call
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<CallElement> content;

  /**
   * The default value of the '{@link #isEquality() <em>Equality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquality()
   * @generated
   * @ordered
   */
  protected static final boolean EQUALITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEquality() <em>Equality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquality()
   * @generated
   * @ordered
   */
  protected boolean equality = EQUALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<CallElement> source;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
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
    return BurstPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CallElement> getContent()
  {
    if (content == null)
    {
      content = new EObjectContainmentEList<CallElement>(CallElement.class, this, BurstPackage.CALL__CONTENT);
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEquality()
  {
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquality(boolean newEquality)
  {
    boolean oldEquality = equality;
    equality = newEquality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BurstPackage.CALL__EQUALITY, oldEquality, equality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CallElement> getSource()
  {
    if (source == null)
    {
      source = new EObjectContainmentEList<CallElement>(CallElement.class, this, BurstPackage.CALL__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectResolvingEList<Role>(Role.class, this, BurstPackage.CALL__ROLES);
    }
    return roles;
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
      case BurstPackage.CALL__CONTENT:
        return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
      case BurstPackage.CALL__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
      case BurstPackage.CALL__CONTENT:
        return getContent();
      case BurstPackage.CALL__EQUALITY:
        return isEquality();
      case BurstPackage.CALL__SOURCE:
        return getSource();
      case BurstPackage.CALL__ROLES:
        return getRoles();
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
      case BurstPackage.CALL__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends CallElement>)newValue);
        return;
      case BurstPackage.CALL__EQUALITY:
        setEquality((Boolean)newValue);
        return;
      case BurstPackage.CALL__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends CallElement>)newValue);
        return;
      case BurstPackage.CALL__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
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
      case BurstPackage.CALL__CONTENT:
        getContent().clear();
        return;
      case BurstPackage.CALL__EQUALITY:
        setEquality(EQUALITY_EDEFAULT);
        return;
      case BurstPackage.CALL__SOURCE:
        getSource().clear();
        return;
      case BurstPackage.CALL__ROLES:
        getRoles().clear();
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
      case BurstPackage.CALL__CONTENT:
        return content != null && !content.isEmpty();
      case BurstPackage.CALL__EQUALITY:
        return equality != EQUALITY_EDEFAULT;
      case BurstPackage.CALL__SOURCE:
        return source != null && !source.isEmpty();
      case BurstPackage.CALL__ROLES:
        return roles != null && !roles.isEmpty();
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
    result.append(" (equality: ");
    result.append(equality);
    result.append(')');
    return result.toString();
  }

} //CallImpl
