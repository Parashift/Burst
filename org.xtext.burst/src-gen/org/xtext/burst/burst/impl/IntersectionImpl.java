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
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.burst.burst.Block;
import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Parameter;
import org.xtext.burst.burst.WithParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getWithParams <em>With Params</em>}</li>
 *   <li>{@link org.xtext.burst.burst.impl.IntersectionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionImpl extends RuleIntersectImpl implements Intersection
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getWithParams() <em>With Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithParams()
   * @generated
   * @ordered
   */
  protected EList<WithParameter> withParams;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

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
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, BurstPackage.INTERSECTION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WithParameter> getWithParams()
  {
    if (withParams == null)
    {
      withParams = new EObjectContainmentEList<WithParameter>(WithParameter.class, this, BurstPackage.INTERSECTION__WITH_PARAMS);
    }
    return withParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BurstPackage.INTERSECTION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BurstPackage.INTERSECTION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BurstPackage.INTERSECTION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BurstPackage.INTERSECTION__BLOCK, newBlock, newBlock));
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
      case BurstPackage.INTERSECTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case BurstPackage.INTERSECTION__WITH_PARAMS:
        return ((InternalEList<?>)getWithParams()).basicRemove(otherEnd, msgs);
      case BurstPackage.INTERSECTION__BLOCK:
        return basicSetBlock(null, msgs);
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
      case BurstPackage.INTERSECTION__PARAMS:
        return getParams();
      case BurstPackage.INTERSECTION__WITH_PARAMS:
        return getWithParams();
      case BurstPackage.INTERSECTION__BLOCK:
        return getBlock();
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
      case BurstPackage.INTERSECTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case BurstPackage.INTERSECTION__WITH_PARAMS:
        getWithParams().clear();
        getWithParams().addAll((Collection<? extends WithParameter>)newValue);
        return;
      case BurstPackage.INTERSECTION__BLOCK:
        setBlock((Block)newValue);
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
      case BurstPackage.INTERSECTION__PARAMS:
        getParams().clear();
        return;
      case BurstPackage.INTERSECTION__WITH_PARAMS:
        getWithParams().clear();
        return;
      case BurstPackage.INTERSECTION__BLOCK:
        setBlock((Block)null);
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
      case BurstPackage.INTERSECTION__PARAMS:
        return params != null && !params.isEmpty();
      case BurstPackage.INTERSECTION__WITH_PARAMS:
        return withParams != null && !withParams.isEmpty();
      case BurstPackage.INTERSECTION__BLOCK:
        return block != null;
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
