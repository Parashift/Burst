/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.burst.burst.Access;
import org.xtext.burst.burst.BPackage;
import org.xtext.burst.burst.Block;
import org.xtext.burst.burst.BoolConstant;
import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.Call;
import org.xtext.burst.burst.Concern;
import org.xtext.burst.burst.ContextManagement;
import org.xtext.burst.burst.DoubleConstant;
import org.xtext.burst.burst.File;
import org.xtext.burst.burst.If;
import org.xtext.burst.burst.Import;
import org.xtext.burst.burst.IntConstant;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Locale;
import org.xtext.burst.burst.Member;
import org.xtext.burst.burst.NullConstant;
import org.xtext.burst.burst.Role;
import org.xtext.burst.burst.Stop;
import org.xtext.burst.burst.StringConstant;
import org.xtext.burst.burst.Template;
import org.xtext.burst.burst.ThisConstant;
import org.xtext.burst.services.BurstGrammarAccess;

@SuppressWarnings("all")
public class BurstSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BurstGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BurstPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BurstPackage.ACCESS:
				sequence_Access(context, (Access) semanticObject); 
				return; 
			case BurstPackage.BPACKAGE:
				sequence_Package(context, (BPackage) semanticObject); 
				return; 
			case BurstPackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case BurstPackage.BOOL_CONSTANT:
				sequence_TerminalExpression(context, (BoolConstant) semanticObject); 
				return; 
			case BurstPackage.CALL:
				if (rule == grammarAccess.getLineRule()
						|| rule == grammarAccess.getCallRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCallElementRule()
						|| rule == grammarAccess.getSubCallRule()) {
					sequence_SubCall(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case BurstPackage.CONCERN:
				sequence_Concern(context, (Concern) semanticObject); 
				return; 
			case BurstPackage.CONTEXT_MANAGEMENT:
				sequence_ContextManagement(context, (ContextManagement) semanticObject); 
				return; 
			case BurstPackage.DOUBLE_CONSTANT:
				sequence_TerminalExpression(context, (DoubleConstant) semanticObject); 
				return; 
			case BurstPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case BurstPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case BurstPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case BurstPackage.INT_CONSTANT:
				sequence_TerminalExpression(context, (IntConstant) semanticObject); 
				return; 
			case BurstPackage.INTERSECTION:
				sequence_RuleIntersect(context, (Intersection) semanticObject); 
				return; 
			case BurstPackage.LOCALE:
				sequence_Locale(context, (Locale) semanticObject); 
				return; 
			case BurstPackage.MEMBER:
				sequence_Member(context, (Member) semanticObject); 
				return; 
			case BurstPackage.NULL_CONSTANT:
				sequence_TerminalExpression(context, (NullConstant) semanticObject); 
				return; 
			case BurstPackage.PARAMETER:
				sequence_Parameter(context, (org.xtext.burst.burst.Parameter) semanticObject); 
				return; 
			case BurstPackage.ROLE:
				sequence_Roles(context, (Role) semanticObject); 
				return; 
			case BurstPackage.STOP:
				sequence_Stop(context, (Stop) semanticObject); 
				return; 
			case BurstPackage.STRING_CONSTANT:
				sequence_TerminalExpression(context, (StringConstant) semanticObject); 
				return; 
			case BurstPackage.TEMPLATE:
				sequence_Template(context, (Template) semanticObject); 
				return; 
			case BurstPackage.THIS_CONSTANT:
				sequence_TerminalExpression(context, (ThisConstant) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CallElement returns Access
	 *     Access returns Access
	 *     Access.Access_2_0 returns Access
	 *
	 * Constraint:
	 *     (name=[Variable|ID] | (base=Access_Access_2_0 member=[Member|ID] roles+=[Role|ID]*))
	 */
	protected void sequence_Access(ISerializationContext context, Access semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Block returns Block
	 *     Line returns Block
	 *
	 * Constraint:
	 *     (lines+=Line lines+=Line*)?
	 */
	protected void sequence_Block(ISerializationContext context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Call
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (content+=CallElement+ (equality?='=' source+=CallElement+)?)
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Concern
	 *     Concern returns Concern
	 *     Variable returns Concern
	 *
	 * Constraint:
	 *     (name=ID elements+=ConcernElement*)
	 */
	protected void sequence_Concern(ISerializationContext context, Concern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns ContextManagement
	 *     ContextManagement returns ContextManagement
	 *
	 * Constraint:
	 *     (action=concernManagment target=Access)
	 */
	protected void sequence_ContextManagement(ISerializationContext context, ContextManagement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.CONTEXT_MANAGEMENT__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.CONTEXT_MANAGEMENT__ACTION));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.CONTEXT_MANAGEMENT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.CONTEXT_MANAGEMENT__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     (Imports+=Import* elements+=FileElement*)
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (expression=Call (thenBlock=Block | thenBlock=Line) elseBlock=Line?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Locale
	 *     CallElement returns Locale
	 *     Locale returns Locale
	 *
	 * Constraint:
	 *     (type=[Concern|QualifiedName] name=ID roles+=[Role|ID]*)
	 */
	protected void sequence_Locale(ISerializationContext context, Locale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConcernElement returns Member
	 *     Member returns Member
	 *     Variable returns Member
	 *
	 * Constraint:
	 *     (actAs?='as'? isContent?='is'? concern=[Concern|QualifiedName] name=ID)
	 */
	protected void sequence_Member(ISerializationContext context, Member semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FileElement returns BPackage
	 *     Package returns BPackage
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=PackageElement*)
	 */
	protected void sequence_Package(ISerializationContext context, BPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *     Variable returns Parameter
	 *
	 * Constraint:
	 *     (name=ID | (type=[Concern|QualifiedName] name=ID) | (role=[Role|ID] type=[Concern|QualifiedName] name=ID))
	 */
	protected void sequence_Parameter(ISerializationContext context, org.xtext.burst.burst.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FileElement returns Role
	 *     Roles returns Role
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Roles(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.ROLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Intersection
	 *     ConcernElement returns Intersection
	 *     RuleIntersect returns Intersection
	 *
	 * Constraint:
	 *     (name='when' params+=Parameter params+=Parameter* block=Block)
	 */
	protected void sequence_RuleIntersect(ISerializationContext context, Intersection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Stop
	 *     Stop returns Stop
	 *
	 * Constraint:
	 *     condition=Call?
	 */
	protected void sequence_Stop(ISerializationContext context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns Call
	 *     SubCall returns Call
	 *
	 * Constraint:
	 *     (content+=Call roles+=[Role|ID]*)
	 */
	protected void sequence_SubCall(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Template
	 *     Template returns Template
	 *
	 * Constraint:
	 *     (name=ID templateArguments+=[Concern|ID] templateArguments+=[Concern|ID]* elements+=ConcernElement*)
	 */
	protected void sequence_Template(ISerializationContext context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns BoolConstant
	 *     TerminalExpression returns BoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns DoubleConstant
	 *     TerminalExpression returns DoubleConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, DoubleConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.DOUBLE_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.DOUBLE_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns IntConstant
	 *     TerminalExpression returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns NullConstant
	 *     TerminalExpression returns NullConstant
	 *
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, NullConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.NULL_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.NULL_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns StringConstant
	 *     TerminalExpression returns StringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallElement returns ThisConstant
	 *     TerminalExpression returns ThisConstant
	 *
	 * Constraint:
	 *     value='this'
	 */
	protected void sequence_TerminalExpression(ISerializationContext context, ThisConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.THIS_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.THIS_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
