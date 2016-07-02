/*
 * generated by Xtext 2.9.0
 */
grammar InternalBurst;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.burst.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.burst.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.burst.services.BurstGrammarAccess;

}
@parser::members {
	private BurstGrammarAccess grammarAccess;

	public void setGrammarAccess(BurstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFile
entryRuleFile
:
{ before(grammarAccess.getFileRule()); }
	 ruleFile
{ after(grammarAccess.getFileRule()); } 
	 EOF 
;

// Rule File
ruleFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFileAccess().getGroup()); }
		(rule__File__Group__0)
		{ after(grammarAccess.getFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConcern
entryRuleConcern
:
{ before(grammarAccess.getConcernRule()); }
	 ruleConcern
{ after(grammarAccess.getConcernRule()); } 
	 EOF 
;

// Rule Concern
ruleConcern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConcernAccess().getGroup()); }
		(rule__Concern__Group__0)
		{ after(grammarAccess.getConcernAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMember
entryRuleMember
:
{ before(grammarAccess.getMemberRule()); }
	 ruleMember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule Member
ruleMember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getGroup()); }
		(rule__Member__Group__0)
		{ after(grammarAccess.getMemberAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntersection
entryRuleIntersection
:
{ before(grammarAccess.getIntersectionRule()); }
	 ruleIntersection
{ after(grammarAccess.getIntersectionRule()); } 
	 EOF 
;

// Rule Intersection
ruleIntersection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntersectionAccess().getGroup()); }
		(rule__Intersection__Group__0)
		{ after(grammarAccess.getIntersectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLine
entryRuleLine
:
{ before(grammarAccess.getLineRule()); }
	 ruleLine
{ after(grammarAccess.getLineRule()); } 
	 EOF 
;

// Rule Line
ruleLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLineAccess().getGroup()); }
		(rule__Line__Group__0)
		{ after(grammarAccess.getLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifier
entryRuleQualifier
:
{ before(grammarAccess.getQualifierRule()); }
	 ruleQualifier
{ after(grammarAccess.getQualifierRule()); } 
	 EOF 
;

// Rule Qualifier
ruleQualifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifierAccess().getAlternatives()); }
		(rule__Qualifier__Alternatives)
		{ after(grammarAccess.getQualifierAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getConcernsAssignment_1_0()); }
		(rule__File__ConcernsAssignment_1_0)
		{ after(grammarAccess.getFileAccess().getConcernsAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFileAccess().getExternIntersectionsAssignment_1_1()); }
		(rule__File__ExternIntersectionsAssignment_1_1)
		{ after(grammarAccess.getFileAccess().getExternIntersectionsAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcernAccess().getMembersAssignment_5_0()); }
		(rule__Concern__MembersAssignment_5_0)
		{ after(grammarAccess.getConcernAccess().getMembersAssignment_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getConcernAccess().getIntersectionsAssignment_5_1()); }
		(rule__Concern__IntersectionsAssignment_5_1)
		{ after(grammarAccess.getConcernAccess().getIntersectionsAssignment_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Qualifier__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQualifierAccess().getGroup_0()); }
		(rule__Qualifier__Group_0__0)
		{ after(grammarAccess.getQualifierAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getQualifierAccess().getNoneKeyword_1()); }
		'none'
		{ after(grammarAccess.getQualifierAccess().getNoneKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__File__Group__0__Impl
	rule__File__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFileAccess().getImportsAssignment_0()); }
	(rule__File__ImportsAssignment_0)*
	{ after(grammarAccess.getFileAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__File__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFileAccess().getAlternatives_1()); }
	(rule__File__Alternatives_1)*
	{ after(grammarAccess.getFileAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportAction_0()); }
	()
	{ after(grammarAccess.getImportAccess().getImportAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
	rule__Import__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_1()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getNameAssignment_2()); }
	(rule__Import__NameAssignment_2)
	{ after(grammarAccess.getImportAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Concern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__0__Impl
	rule__Concern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getConcernAction_0()); }
	()
	{ after(grammarAccess.getConcernAccess().getConcernAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__1__Impl
	rule__Concern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getConcernKeyword_1()); }
	'concern'
	{ after(grammarAccess.getConcernAccess().getConcernKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__2__Impl
	rule__Concern__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getNameAssignment_2()); }
	(rule__Concern__NameAssignment_2)
	{ after(grammarAccess.getConcernAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__3__Impl
	rule__Concern__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getGroup_3()); }
	(rule__Concern__Group_3__0)?
	{ after(grammarAccess.getConcernAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__4__Impl
	rule__Concern__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__5__Impl
	rule__Concern__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getAlternatives_5()); }
	(rule__Concern__Alternatives_5)*
	{ after(grammarAccess.getConcernAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Concern__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group_3__0__Impl
	rule__Concern__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getExtendsKeyword_3_0()); }
	'extends'
	{ after(grammarAccess.getConcernAccess().getExtendsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concern__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); }
	(rule__Concern__SupertypeAssignment_3_1)
	{ after(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Member__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__0__Impl
	rule__Member__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getMemberAction_0()); }
	()
	{ after(grammarAccess.getMemberAccess().getMemberAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__1__Impl
	rule__Member__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getIntKeyword_1()); }
	'int'
	{ after(grammarAccess.getMemberAccess().getIntKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Member__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberAccess().getNameAssignment_2()); }
	(rule__Member__NameAssignment_2)
	{ after(grammarAccess.getMemberAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Intersection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__0__Impl
	rule__Intersection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); }
	()
	{ after(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__1__Impl
	rule__Intersection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getWhenKeyword_1()); }
	'when'
	{ after(grammarAccess.getIntersectionAccess().getWhenKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__2__Impl
	rule__Intersection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getQualifiersAssignment_2()); }
	(rule__Intersection__QualifiersAssignment_2)*
	{ after(grammarAccess.getIntersectionAccess().getQualifiersAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__3__Impl
	rule__Intersection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__4__Impl
	rule__Intersection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); }
	(rule__Intersection__LinesContentAssignment_4)*
	{ after(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intersection__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Line__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group__0__Impl
	rule__Line__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getLineAction_0()); }
	()
	{ after(grammarAccess.getLineAccess().getLineAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group__1__Impl
	rule__Line__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getCallKeyword_1()); }
	'call'
	{ after(grammarAccess.getLineAccess().getCallKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getCalledAssignment_2()); }
	(rule__Line__CalledAssignment_2)*
	{ after(grammarAccess.getLineAccess().getCalledAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Qualifier__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Qualifier__Group_0__0__Impl
	rule__Qualifier__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Qualifier__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifierAccess().getQualifierAction_0_0()); }
	()
	{ after(grammarAccess.getQualifierAccess().getQualifierAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Qualifier__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Qualifier__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Qualifier__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifierAccess().getNameAssignment_0_1()); }
	(rule__Qualifier__NameAssignment_0_1)
	{ after(grammarAccess.getQualifierAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__File__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getImportsImportParserRuleCall_0_0()); }
		ruleImport
		{ after(grammarAccess.getFileAccess().getImportsImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__ConcernsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getConcernsConcernParserRuleCall_1_0_0()); }
		ruleConcern
		{ after(grammarAccess.getFileAccess().getConcernsConcernParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__File__ExternIntersectionsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFileAccess().getExternIntersectionsIntersectionParserRuleCall_1_1_0()); }
		ruleIntersection
		{ after(grammarAccess.getFileAccess().getExternIntersectionsIntersectionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__SupertypeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getConcernAccess().getSupertypeConcernIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConcernAccess().getSupertypeConcernIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__MembersAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_5_0_0()); }
		ruleMember
		{ after(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concern__IntersectionsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_5_1_0()); }
		ruleIntersection
		{ after(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__QualifiersAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntersectionAccess().getQualifiersConcernCrossReference_2_0()); }
		(
			{ before(grammarAccess.getIntersectionAccess().getQualifiersConcernIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntersectionAccess().getQualifiersConcernIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getIntersectionAccess().getQualifiersConcernCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intersection__LinesContentAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0()); }
		ruleLine
		{ after(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__CalledAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLineAccess().getCalledQualifierParserRuleCall_2_0()); }
		ruleQualifier
		{ after(grammarAccess.getLineAccess().getCalledQualifierParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Qualifier__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQualifierAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getQualifierAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_LINE_END : '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
