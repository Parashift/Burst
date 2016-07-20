/*
 * generated by Xtext 2.9.0
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
	protected AbstractElementAlias match_RuleConcern_ENDLINETerminalRuleCall_3_0_a;
	protected AbstractElementAlias match_RuleConcern_ENDLINETerminalRuleCall_3_2_a;
	protected AbstractElementAlias match_RuleConcern___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_RuleIntersect_ENDLINETerminalRuleCall_2_0_a;
	protected AbstractElementAlias match_RuleIntersect___AndKeyword_2_2_1_or_CommaKeyword_2_2_0__q;
	protected AbstractElementAlias match_RulePackage_ENDLINETerminalRuleCall_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BurstGrammarAccess) access;
		match_RuleConcern_ENDLINETerminalRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0());
		match_RuleConcern_ENDLINETerminalRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2());
		match_RuleConcern___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_2()));
		match_RuleIntersect_ENDLINETerminalRuleCall_2_0_a = new TokenAlias(true, true, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2_0());
		match_RuleIntersect___AndKeyword_2_2_1_or_CommaKeyword_2_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getAndKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0()));
		match_RulePackage_ENDLINETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getENDLINERule())
			return getENDLINEToken(semanticObject, ruleCall, node);
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_RuleConcern_ENDLINETerminalRuleCall_3_0_a.equals(syntax))
				emit_RuleConcern_ENDLINETerminalRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleConcern_ENDLINETerminalRuleCall_3_2_a.equals(syntax))
				emit_RuleConcern_ENDLINETerminalRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleConcern___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_RuleConcern___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect_ENDLINETerminalRuleCall_2_0_a.equals(syntax))
				emit_RuleIntersect_ENDLINETerminalRuleCall_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RuleIntersect___AndKeyword_2_2_1_or_CommaKeyword_2_2_0__q.equals(syntax))
				emit_RuleIntersect___AndKeyword_2_2_1_or_CommaKeyword_2_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RulePackage_ENDLINETerminalRuleCall_3_a.equals(syntax))
				emit_RulePackage_ENDLINETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'extends' ENDLINE* supertype=[Concern|QualifiedName]
	 */
	protected void emit_RuleConcern_ENDLINETerminalRuleCall_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ENDLINE* 'extends' (ambiguity) supertype=[Concern|QualifiedName]
	 */
	protected void emit_RuleConcern_ENDLINETerminalRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 *     supertype=[Concern|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_RuleConcern___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name='when' (ambiguity) parameters+=Parameter
	 *     parameters+=Parameter (',' | 'and')? (ambiguity) parameters+=Parameter
	 */
	protected void emit_RuleIntersect_ENDLINETerminalRuleCall_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (',' | 'and')?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=Parameter (ambiguity) '{' '}' (rule end)
	 *     parameters+=Parameter (ambiguity) '{' lines+=IntersectionElement
	 *     parameters+=Parameter (ambiguity) ENDLINE* parameters+=Parameter
	 */
	protected void emit_RuleIntersect___AndKeyword_2_2_1_or_CommaKeyword_2_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ENDLINE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName (ambiguity) '{' '}' (rule end)
	 *     name=QualifiedName (ambiguity) '{' elements+=PackageElement
	 */
	protected void emit_RulePackage_ENDLINETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
