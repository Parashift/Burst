/**
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.burst.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.burst.burst.Access;
import org.xtext.burst.burst.Block;
import org.xtext.burst.burst.BoolConstant;
import org.xtext.burst.burst.BurstFactory;
import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Call;
import org.xtext.burst.burst.CallElement;
import org.xtext.burst.burst.Concern;
import org.xtext.burst.burst.ConcernElement;
import org.xtext.burst.burst.ContextManagement;
import org.xtext.burst.burst.DoubleConstant;
import org.xtext.burst.burst.File;
import org.xtext.burst.burst.FileElement;
import org.xtext.burst.burst.If;
import org.xtext.burst.burst.Import;
import org.xtext.burst.burst.IntConstant;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Line;
import org.xtext.burst.burst.Locale;
import org.xtext.burst.burst.Member;
import org.xtext.burst.burst.NullConstant;
import org.xtext.burst.burst.PackageElement;
import org.xtext.burst.burst.Parameter;
import org.xtext.burst.burst.Role;
import org.xtext.burst.burst.Roles;
import org.xtext.burst.burst.RuleIntersect;
import org.xtext.burst.burst.Stop;
import org.xtext.burst.burst.StringConstant;
import org.xtext.burst.burst.SubCall;
import org.xtext.burst.burst.Template;
import org.xtext.burst.burst.TerminalExpression;
import org.xtext.burst.burst.ThisConstant;
import org.xtext.burst.burst.Variable;
import org.xtext.burst.burst.concernManagment;

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
      case BurstPackage.BLOCK: return createBlock();
      case BurstPackage.PARAMETER: return createParameter();
      case BurstPackage.VARIABLE: return createVariable();
      case BurstPackage.LINE: return createLine();
      case BurstPackage.STOP: return createStop();
      case BurstPackage.IF: return createIf();
      case BurstPackage.CONTEXT_MANAGEMENT: return createContextManagement();
      case BurstPackage.CALL: return createCall();
      case BurstPackage.CALL_ELEMENT: return createCallElement();
      case BurstPackage.LOCALE: return createLocale();
      case BurstPackage.ACCESS: return createAccess();
      case BurstPackage.SUB_CALL: return createSubCall();
      case BurstPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case BurstPackage.ROLE: return createRole();
      case BurstPackage.INTERSECTION: return createIntersection();
      case BurstPackage.INT_CONSTANT: return createIntConstant();
      case BurstPackage.STRING_CONSTANT: return createStringConstant();
      case BurstPackage.BOOL_CONSTANT: return createBoolConstant();
      case BurstPackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case BurstPackage.THIS_CONSTANT: return createThisConstant();
      case BurstPackage.NULL_CONSTANT: return createNullConstant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BurstPackage.CONCERN_MANAGMENT:
        return createconcernManagmentFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BurstPackage.CONCERN_MANAGMENT:
        return convertconcernManagmentToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
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
  public Stop createStop()
  {
    StopImpl stop = new StopImpl();
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextManagement createContextManagement()
  {
    ContextManagementImpl contextManagement = new ContextManagementImpl();
    return contextManagement;
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
  public CallElement createCallElement()
  {
    CallElementImpl callElement = new CallElementImpl();
    return callElement;
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
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
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
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleConstant createDoubleConstant()
  {
    DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
    return doubleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThisConstant createThisConstant()
  {
    ThisConstantImpl thisConstant = new ThisConstantImpl();
    return thisConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullConstant createNullConstant()
  {
    NullConstantImpl nullConstant = new NullConstantImpl();
    return nullConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public concernManagment createconcernManagmentFromString(EDataType eDataType, String initialValue)
  {
    concernManagment result = concernManagment.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertconcernManagmentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
