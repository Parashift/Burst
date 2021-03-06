/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.burst.services.BurstGrammarAccess;

@SuppressWarnings("all")
public class BurstSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BurstGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Block_ENDLINETerminalRuleCall_2_a;
	protected AbstractElementAlias match_Block_ENDLINETerminalRuleCall_3_1_0_p;
	protected AbstractElementAlias match_Block_ENDLINETerminalRuleCall_3_2_a;
	protected AbstractElementAlias match_Concern_ENDLINETerminalRuleCall_3_0_a;
	protected AbstractElementAlias match_Concern_ENDLINETerminalRuleCall_3_2_a;
	protected AbstractElementAlias match_Concern_ENDLINETerminalRuleCall_3_3_1_p;
	protected AbstractElementAlias match_Concern___ENDLINETerminalRuleCall_3_0_a_LeftCurlyBracketKeyword_3_1_ENDLINETerminalRuleCall_3_2_a_RightCurlyBracketKeyword_3_4__q;
	protected AbstractElementAlias match_File_ENDLINETerminalRuleCall_1_a;
	protected AbstractElementAlias match_File_ENDLINETerminalRuleCall_2_1_a;
	protected AbstractElementAlias match_File_ENDLINETerminalRuleCall_3_1_a;
	protected AbstractElementAlias match_If_ENDLINETerminalRuleCall_3_1_0_p;
	protected AbstractElementAlias match_If_ENDLINETerminalRuleCall_4_0_0_a;
	protected AbstractElementAlias match_If_ENDLINETerminalRuleCall_4_2_a;
	protected AbstractElementAlias match_Package_ENDLINETerminalRuleCall_3_a;
	protected AbstractElementAlias match_Package_ENDLINETerminalRuleCall_5_a;
	protected AbstractElementAlias match_Package_ENDLINETerminalRuleCall_6_1_a;
	protected AbstractElementAlias match_RuleIntersect_AndKeyword_4_1_1_or_CommaKeyword_4_1_0;
	protected AbstractElementAlias match_RuleIntersect_AndKeyword_5_3_1_1_or_CommaKeyword_5_3_1_0;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_2_a;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_4_0_a;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_4_2_a;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_5_1_a;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_5_3_0_a;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_5_3_2_a;
	protected AbstractElementAlias match_Template_ENDLINETerminalRuleCall_7_0_a;
	protected AbstractElementAlias match_Template_ENDLINETerminalRuleCall_7_2_a;
	protected AbstractElementAlias match_Template_ENDLINETerminalRuleCall_7_3_1_p;
	protected AbstractElementAlias match_Template___ENDLINETerminalRuleCall_7_0_a_LeftCurlyBracketKeyword_7_1_ENDLINETerminalRuleCall_7_2_a_RightCurlyBracketKeyword_7_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BurstGrammarAccess) access;
		match_Block_ENDLINETerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_2());
		match_Block_ENDLINETerminalRuleCall_3_1_0_p = new TokenAlias(true, false, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0());
		match_Block_ENDLINETerminalRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_2());
		match_Concern_ENDLINETerminalRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0());
		match_Concern_ENDLINETerminalRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2());
		match_Concern_ENDLINETerminalRuleCall_3_3_1_p = new TokenAlias(true, false, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1());
		match_Concern___ENDLINETerminalRuleCall_3_0_a_LeftCurlyBracketKeyword_3_1_ENDLINETerminalRuleCall_3_2_a_RightCurlyBracketKeyword_3_4__q = new GroupAlias(false, true, new TokenAlias(true, true, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(true, true, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()), new TokenAlias(false, false, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()));
		match_File_ENDLINETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1());
		match_File_ENDLINETerminalRuleCall_2_1_a = new TokenAlias(true, true, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1());
		match_File_ENDLINETerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1());
		match_If_ENDLINETerminalRuleCall_3_1_0_p = new TokenAlias(true, false, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0());
		match_If_ENDLINETerminalRuleCall_4_0_0_a = new TokenAlias(true, true, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_0_0());
		match_If_ENDLINETerminalRuleCall_4_2_a = new TokenAlias(true, true, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_2());
		match_Package_ENDLINETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3());
		match_Package_ENDLINETerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5());
		match_Package_ENDLINETerminalRuleCall_6_1_a = new TokenAlias(true, true, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1());
		match_RuleIntersect_AndKeyword_4_1_1_or_CommaKeyword_4_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1()), new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()));
		match_RuleIntersect_AndKeyword_5_3_1_1_or_CommaKeyword_5_3_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1()), new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()));
		match_RuleIntersect_ENDLINETerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
		match_RuleIntersect_ENDLINETerminalRuleCall_4_0_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
		match_RuleIntersect_ENDLINETerminalRuleCall_4_2_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
		match_RuleIntersect_ENDLINETerminalRuleCall_5_1_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1());
		match_RuleIntersect_ENDLINETerminalRuleCall_5_3_0_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0());
		match_RuleIntersect_ENDLINETerminalRuleCall_5_3_2_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2());
		match_Template_ENDLINETerminalRuleCall_7_0_a = new TokenAlias(true, true, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0());
		match_Template_ENDLINETerminalRuleCall_7_2_a = new TokenAlias(true, true, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2());
		match_Template_ENDLINETerminalRuleCall_7_3_1_p = new TokenAlias(true, false, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1());
		match_Template___ENDLINETerminalRuleCall_7_0_a_LeftCurlyBracketKeyword_7_1_ENDLINETerminalRuleCall_7_2_a_RightCurlyBracketKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(true, true, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(true, true, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()), new TokenAlias(false, false, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getENDLINERule())
			return getENDLINEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ENDLINE    : '\r'? '\n';
	 */
	protected String getENDLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Block_ENDLINETerminalRuleCall_2_a.equals(syntax))
				emit_Block_ENDLINETerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Block_ENDLINETerminalRuleCall_3_1_0_p.equals(syntax))
				emit_Block_ENDLINETerminalRuleCall_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Block_ENDLINETerminalRuleCall_3_2_a.equals(syntax))
				emit_Block_ENDLINETerminalRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Concern_ENDLINETerminalRuleCall_3_0_a.equals(syntax))
				emit_Concern_ENDLINETerminalRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Concern_ENDLINETerminalRuleCall_3_2_a.equals(syntax))
				emit_Concern_ENDLINETerminalRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Concern_ENDLINETerminalRuleCall_3_3_1_p.equals(syntax))
				emit_Concern_ENDLINETerminalRuleCall_3_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Concern___ENDLINETerminalRuleCall_3_0_a_LeftCurlyBracketKeyword_3_1_ENDLINETerminalRuleCall_3_2_a_RightCurlyBracketKeyword_3_4__q.equals(syntax))
				emit_Concern___ENDLINETerminalRuleCall_3_0_a_LeftCurlyBracketKeyword_3_1_ENDLINETerminalRuleCall_3_2_a_RightCurlyBracketKeyword_3_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_File_ENDLINETerminalRuleCall_1_a.equals(syntax))
				emit_File_ENDLINETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_File_ENDLINETerminalRuleCall_2_1_a.equals(syntax))
				emit_File_ENDLINETerminalRuleCall_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_File_ENDLINETerminalRuleCall_3_1_a.equals(syntax))
				emit_File_ENDLINETerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If_ENDLINETerminalRuleCall_3_1_0_p.equals(syntax))
				emit_If_ENDLINETerminalRuleCall_3_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If_ENDLINETerminalRuleCall_4_0_0_a.equals(syntax))
				emit_If_ENDLINETerminalRuleCall_4_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If_ENDLINETerminalRuleCall_4_2_a.equals(syntax))
				emit_If_ENDLINETerminalRuleCall_4_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Package_ENDLINETerminalRuleCall_3_a.equals(syntax))
				emit_Package_ENDLINETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Package_ENDLINETerminalRuleCall_5_a.equals(syntax))
				emit_Package_ENDLINETerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Package_ENDLINETerminalRuleCall_6_1_a.equals(syntax))
				emit_Package_ENDLINETerminalRuleCall_6_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_AndKeyword_4_1_1_or_CommaKeyword_4_1_0.equals(syntax))
				emit_RuleIntersect_AndKeyword_4_1_1_or_CommaKeyword_4_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_AndKeyword_5_3_1_1_or_CommaKeyword_5_3_1_0.equals(syntax))
				emit_RuleIntersect_AndKeyword_5_3_1_1_or_CommaKeyword_5_3_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_2_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_4_0_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_4_2_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_4_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_5_1_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_5_3_0_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_5_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_5_3_2_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_5_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template_ENDLINETerminalRuleCall_7_0_a.equals(syntax))
				emit_Template_ENDLINETerminalRuleCall_7_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template_ENDLINETerminalRuleCall_7_2_a.equals(syntax))
				emit_Template_ENDLINETerminalRuleCall_7_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template_ENDLINETerminalRuleCall_7_3_1_p.equals(syntax))
				emit_Template_ENDLINETerminalRuleCall_7_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template___ENDLINETerminalRuleCall_7_0_a_LeftCurlyBracketKeyword_7_1_ENDLINETerminalRuleCall_7_2_a_RightCurlyBracketKeyword_7_4__q.equals(syntax))
				emit_Template___ENDLINETerminalRuleCall_7_0_a_LeftCurlyBracketKeyword_7_1_ENDLINETerminalRuleCall_7_2_a_RightCurlyBracketKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '{' (ambiguity) '}' (rule start)
	 *     (rule start) '{' (ambiguity) lines+=Line
	 */
	protected void emit_Block_ENDLINETerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) lines+=Line
	 */
	protected void emit_Block_ENDLINETerminalRuleCall_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     lines+=Line (ambiguity) '}' (rule end)
	 */
	protected void emit_Block_ENDLINETerminalRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) '{' ENDLINE* elements+=ConcernElement
	 */
	protected void emit_Concern_ENDLINETerminalRuleCall_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ENDLINE* '{' (ambiguity) elements+=ConcernElement
	 */
	protected void emit_Concern_ENDLINETerminalRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=ConcernElement (ambiguity) '}' (rule end)
	 *     elements+=ConcernElement (ambiguity) elements+=ConcernElement
	 */
	protected void emit_Concern_ENDLINETerminalRuleCall_3_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ENDLINE* '{' ENDLINE* '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Concern___ENDLINETerminalRuleCall_3_0_a_LeftCurlyBracketKeyword_3_1_ENDLINETerminalRuleCall_3_2_a_RightCurlyBracketKeyword_3_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) Imports+=Import
	 *     (rule start) (ambiguity) elements+=FileElement
	 */
	protected void emit_File_ENDLINETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     Imports+=Import (ambiguity) (rule end)
	 *     Imports+=Import (ambiguity) Imports+=Import
	 *     Imports+=Import (ambiguity) elements+=FileElement
	 */
	protected void emit_File_ENDLINETerminalRuleCall_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=FileElement (ambiguity) (rule end)
	 *     elements+=FileElement (ambiguity) elements+=FileElement
	 */
	protected void emit_File_ENDLINETerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Call (ambiguity) thenBlock=Line
	 */
	protected void emit_If_ENDLINETerminalRuleCall_3_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     thenBlock=Block (ambiguity) 'else' ENDLINE* elseBlock=Line
	 *     thenBlock=Line (ambiguity) 'else' ENDLINE* elseBlock=Line
	 */
	protected void emit_If_ENDLINETerminalRuleCall_4_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     thenBlock=Block ENDLINE* 'else' (ambiguity) elseBlock=Line
	 *     thenBlock=Line ENDLINE* 'else' (ambiguity) elseBlock=Line
	 */
	protected void emit_If_ENDLINETerminalRuleCall_4_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName (ambiguity) '{' ENDLINE* '}' (rule end)
	 *     name=QualifiedName (ambiguity) '{' ENDLINE* elements+=PackageElement
	 */
	protected void emit_Package_ENDLINETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName ENDLINE* '{' (ambiguity) '}' (rule end)
	 *     name=QualifiedName ENDLINE* '{' (ambiguity) elements+=PackageElement
	 */
	protected void emit_Package_ENDLINETerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=PackageElement (ambiguity) '}' (rule end)
	 *     elements+=PackageElement (ambiguity) elements+=PackageElement
	 */
	protected void emit_Package_ENDLINETerminalRuleCall_6_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ',' | 'and'
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=Parameter ENDLINE* (ambiguity) ENDLINE* params+=Parameter
	 */
	protected void emit_RuleIntersect_AndKeyword_4_1_1_or_CommaKeyword_4_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'and' | ','
	 *
	 * This ambiguous syntax occurs at:
	 *     withParams+=WithParameter ENDLINE* (ambiguity) ENDLINE* withParams+=WithParameter
	 */
	protected void emit_RuleIntersect_AndKeyword_5_3_1_1_or_CommaKeyword_5_3_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name='when' (ambiguity) params+=Parameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=Parameter (ambiguity) (',' | 'and') ENDLINE* params+=Parameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=Parameter ENDLINE* (',' | 'and') (ambiguity) params+=Parameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_4_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     params+=Parameter 'with' (ambiguity) withParams+=WithParameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     withParams+=WithParameter (ambiguity) ('and' | ',') ENDLINE* withParams+=WithParameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_5_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     withParams+=WithParameter ENDLINE* ('and' | ',') (ambiguity) withParams+=WithParameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_5_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     templateArguments+=[Concern|ID] '>' (ambiguity) '{' ENDLINE* elements+=ConcernElement
	 */
	protected void emit_Template_ENDLINETerminalRuleCall_7_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     templateArguments+=[Concern|ID] '>' ENDLINE* '{' (ambiguity) elements+=ConcernElement
	 */
	protected void emit_Template_ENDLINETerminalRuleCall_7_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE+
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=ConcernElement (ambiguity) '}' (rule end)
	 *     elements+=ConcernElement (ambiguity) elements+=ConcernElement
	 */
	protected void emit_Template_ENDLINETerminalRuleCall_7_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ENDLINE* '{' ENDLINE* '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     templateArguments+=[Concern|ID] '>' (ambiguity) (rule end)
	 */
	protected void emit_Template___ENDLINETerminalRuleCall_7_0_a_LeftCurlyBracketKeyword_7_1_ENDLINETerminalRuleCall_7_2_a_RightCurlyBracketKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
