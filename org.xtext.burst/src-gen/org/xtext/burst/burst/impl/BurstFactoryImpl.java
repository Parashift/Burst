/**
 * generated by Xtext 2.10.0
 */
package org.xtext.burst.burst.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.burst.burst.Access;
import org.xtext.burst.burst.BurstFactory;
import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Call;
import org.xtext.burst.burst.CallExpr;
import org.xtext.burst.burst.Concern;
import org.xtext.burst.burst.ConcernElement;
import org.xtext.burst.burst.File;
import org.xtext.burst.burst.FileElement;
import org.xtext.burst.burst.Import;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Line;
import org.xtext.burst.burst.Locale;
import org.xtext.burst.burst.Member;
import org.xtext.burst.burst.PackageElement;
import org.xtext.burst.burst.Parameter;
import org.xtext.burst.burst.Role;
import org.xtext.burst.burst.Roles;
import org.xtext.burst.burst.RuleIntersect;
import org.xtext.burst.burst.SubCall;
import org.xtext.burst.burst.Template;
import org.xtext.burst.burst.Variable;
import org.xtext.burst.burst.WithParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BurstFactoryImpl extends EFactoryImpl implements BurstFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BurstFactory init()
  {
    try
    {
      BurstFactory theBurstFactory = (BurstFactory)EPackage.Registry.INSTANCE.getEFactory(BurstPackage.eNS_URI);
      if (theBurstFactory != null)
      {
        return theBurstFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BurstFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BurstFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BurstPackage.FILE: return createFile();
      case BurstPackage.FILE_ELEMENT: return createFileElement();
      case BurstPackage.IMPORT: return createImport();
      case BurstPackage.ROLES: return createRoles();
      case BurstPackage.PACKAGE: return createPackage();
      case BurstPackage.PACKAGE_ELEMENT: return createPackageElement();
      case BurstPackage.CONCERN: return createConcern();
      case BurstPackage.TEMPLATE: return createTemplate();
      case BurstPackage.CONCERN_ELEMENT: return createConcernElement();
      case BurstPackage.MEMBER: return createMember();
      case BurstPackage.RULE_INTERSECT: return createRuleIntersect();
      case BurstPackage.LOCALE: return createLocale();
      case BurstPackage.PARAMETER: return createParameter();
      case BurstPackage.WITH_PARAMETER: return createWithParameter();
      case BurstPackage.VARIABLE: return createVariable();
      case BurstPackage.LINE: return createLine();
      case BurstPackage.CALL_EXPR: return createCallExpr();
      case BurstPackage.SUB_CALL: return createSubCall();
      case BurstPackage.CALL: return createCall();
      case BurstPackage.ACCESS: return createAccess();
      case BurstPackage.ROLE: return createRole();
      case BurstPackage.INTERSECTION: return createIntersection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileElement createFileElement()
  {
    FileElementImpl fileElement = new FileElementImpl();
    return fileElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Roles createRoles()
  {
    RolesImpl roles = new RolesImpl();
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.burst.burst.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageElement createPackageElement()
  {
    PackageElementImpl packageElement = new PackageElementImpl();
    return packageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concern createConcern()
  {
    ConcernImpl concern = new ConcernImpl();
    return concern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcernElement createConcernElement()
  {
    ConcernElementImpl concernElement = new ConcernElementImpl();
    return concernElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleIntersect createRuleIntersect()
  {
    RuleIntersectImpl ruleIntersect = new RuleIntersectImpl();
    return ruleIntersect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Locale createLocale()
  {
    LocaleImpl locale = new LocaleImpl();
    return locale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithParameter createWithParameter()
  {
    WithParameterImpl withParameter = new WithParameterImpl();
    return withParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallExpr createCallExpr()
  {
    CallExprImpl callExpr = new CallExprImpl();
    return callExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubCall createSubCall()
  {
    SubCallImpl subCall = new SubCallImpl();
    return subCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Access createAccess()
  {
    AccessImpl access = new AccessImpl();
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intersection createIntersection()
  {
    IntersectionImpl intersection = new IntersectionImpl();
    return intersection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BurstPackage getBurstPackage()
  {
    return (BurstPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BurstPackage getPackage()
  {
    return BurstPackage.eINSTANCE;
  }

} //BurstFactoryImpl
