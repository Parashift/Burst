/*
 * generated by Xtext 2.9.0
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
import org.xtext.burst.burst.BurstPackage;
import org.xtext.burst.burst.CallMember;
import org.xtext.burst.burst.Concern;
import org.xtext.burst.burst.File;
import org.xtext.burst.burst.Import;
import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.Line;
import org.xtext.burst.burst.Member;
import org.xtext.burst.burst.MemberCall;
import org.xtext.burst.burst.MemberInConcern;
import org.xtext.burst.burst.NamedParameter;
import org.xtext.burst.burst.ParameterCall;
import org.xtext.burst.burst.StaticParameter;
import org.xtext.burst.burst.UsageParameter;
import org.xtext.burst.burst.VariableCall;
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
			case BurstPackage.CALL_MEMBER:
				sequence_CallMember(context, (CallMember) semanticObject); 
				return; 
			case BurstPackage.CONCERN:
				sequence_RuleConcern(context, (Concern) semanticObject); 
				return; 
			case BurstPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case BurstPackage.IMPORT:
				sequence_RuleImport(context, (Import) semanticObject); 
				return; 
			case BurstPackage.INTERSECTION:
				sequence_RuleIntersect(context, (Intersection) semanticObject); 
				return; 
			case BurstPackage.LINE:
				sequence_Line(context, (Line) semanticObject); 
				return; 
			case BurstPackage.MEMBER:
				sequence_Member(context, (Member) semanticObject); 
				return; 
			case BurstPackage.MEMBER_CALL:
				sequence_MemberCall(context, (MemberCall) semanticObject); 
				return; 
			case BurstPackage.MEMBER_IN_CONCERN:
				sequence_CallParameterInConcern(context, (MemberInConcern) semanticObject); 
				return; 
			case BurstPackage.NAMED_PARAMETER:
				sequence_NamedParameter(context, (NamedParameter) semanticObject); 
				return; 
			case BurstPackage.PACKAGE:
				sequence_RulePackage(context, (org.xtext.burst.burst.Package) semanticObject); 
				return; 
			case BurstPackage.PARAMETER_CALL:
				sequence_ParameterCall(context, (ParameterCall) semanticObject); 
				return; 
			case BurstPackage.STATIC_PARAMETER:
				sequence_StaticParameter(context, (StaticParameter) semanticObject); 
				return; 
			case BurstPackage.USAGE_PARAMETER:
				sequence_UsageParameter(context, (UsageParameter) semanticObject); 
				return; 
			case BurstPackage.VARIABLE_CALL:
				sequence_VariableCall(context, (VariableCall) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CallMember returns CallMember
	 *
	 * Constraint:
	 *     name=[Member|ID]
	 */
	protected void sequence_CallMember(ISerializationContext context, CallMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.CALL_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.CALL_MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallMemberAccess().getNameMemberIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallParameterInConcern returns MemberInConcern
	 *
	 * Constraint:
	 *     (target=[Parameter|ID] name=[Member|ID])
	 */
	protected void sequence_CallParameterInConcern(ISerializationContext context, MemberInConcern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.MEMBER_IN_CONCERN__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.MEMBER_IN_CONCERN__TARGET));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.MEMBER_IN_CONCERN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.MEMBER_IN_CONCERN__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallParameterInConcernAccess().getTargetParameterIDTerminalRuleCall_1_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getCallParameterInConcernAccess().getNameMemberIDTerminalRuleCall_3_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     elements+=RuleFileElement+
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Line returns Line
	 *
	 * Constraint:
	 *     (calls+=Call calls+=Call*)
	 */
	protected void sequence_Line(ISerializationContext context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Call returns MemberCall
	 *     MemberCall returns MemberCall
	 *
	 * Constraint:
	 *     (variable=[Variable|ID] name=[Member|ID])
	 */
	protected void sequence_MemberCall(ISerializationContext context, MemberCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.MEMBER_CALL__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.MEMBER_CALL__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.CALL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberCallAccess().getVariableVariableIDTerminalRuleCall_1_0_1(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getMemberCallAccess().getNameMemberIDTerminalRuleCall_3_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConcernElement returns Member
	 *     Member returns Member
	 *     Variable returns Member
	 *
	 * Constraint:
	 *     (concern=[Concern|QualifiedName] name=ID)
	 */
	protected void sequence_Member(ISerializationContext context, Member semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.MEMBER__CONCERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.MEMBER__CONCERN));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1(), semanticObject.getConcern());
		feeder.accept(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns NamedParameter
	 *     Parameter returns NamedParameter
	 *     NamedParameter returns NamedParameter
	 *
	 * Constraint:
	 *     (type=[Concern|ID] name=ID)
	 */
	protected void sequence_NamedParameter(ISerializationContext context, NamedParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.NAMED_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.NAMED_PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.NAMED_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.NAMED_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getNamedParameterAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterCall returns ParameterCall
	 *
	 * Constraint:
	 *     name=[Parameter|ID]
	 */
	protected void sequence_ParameterCall(ISerializationContext context, ParameterCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.PARAMETER_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.PARAMETER_CALL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterCallAccess().getNameParameterIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Concern
	 *     RuleConcern returns Concern
	 *
	 * Constraint:
	 *     (name=ID supertype=[Concern|QualifiedName]? elements+=ConcernElement*)
	 */
	protected void sequence_RuleConcern(ISerializationContext context, Concern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleFileElement returns Import
	 *     RuleImport returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 */
	protected void sequence_RuleImport(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageElement returns Intersection
	 *     ConcernElement returns Intersection
	 *     RuleIntersect returns Intersection
	 *
	 * Constraint:
	 *     (name='when' parameters+=Parameter parameters+=Parameter* lines+=Line*)
	 */
	protected void sequence_RuleIntersect(ISerializationContext context, Intersection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleFileElement returns Package
	 *     RulePackage returns Package
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=PackageElement*)
	 */
	protected void sequence_RulePackage(ISerializationContext context, org.xtext.burst.burst.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns StaticParameter
	 *     Parameter returns StaticParameter
	 *     StaticParameter returns StaticParameter
	 *
	 * Constraint:
	 *     name=[Concern|ID]
	 */
	protected void sequence_StaticParameter(ISerializationContext context, StaticParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.STATIC_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.STATIC_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStaticParameterAccess().getNameConcernIDTerminalRuleCall_2_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns UsageParameter
	 *     Parameter returns UsageParameter
	 *     UsageParameter returns UsageParameter
	 *
	 * Constraint:
	 *     (type=[Concern|ID] name=ID)
	 */
	protected void sequence_UsageParameter(ISerializationContext context, UsageParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.USAGE_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.USAGE_PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.USAGE_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.USAGE_PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsageParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getUsageParameterAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Call returns VariableCall
	 *     VariableCall returns VariableCall
	 *
	 * Constraint:
	 *     name=[Variable|ID]
	 */
	protected void sequence_VariableCall(ISerializationContext context, VariableCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BurstPackage.Literals.CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BurstPackage.Literals.CALL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
