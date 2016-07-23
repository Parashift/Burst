/*
 * generated by Xtext 2.9.0
 */
grammar InternalBurst;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.burst.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.burst.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.burst.services.BurstGrammarAccess;

}

@parser::members {

 	private BurstGrammarAccess grammarAccess;

    public InternalBurstParser(TokenStream input, BurstGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "File";
   	}

   	@Override
   	protected BurstGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFileAccess().getElementsRuleFileElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleRuleFileElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFileRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.burst.Burst.RuleFileElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleRuleFileElement
entryRuleRuleFileElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleFileElementRule()); }
	iv_ruleRuleFileElement=ruleRuleFileElement
	{ $current=$iv_ruleRuleFileElement.current; }
	EOF;

// Rule RuleFileElement
ruleRuleFileElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleFileElementAccess().getRuleImportParserRuleCall_0());
		}
		this_RuleImport_0=ruleRuleImport
		{
			$current = $this_RuleImport_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRuleFileElementAccess().getRulePackageParserRuleCall_1());
		}
		this_RulePackage_1=ruleRulePackage
		{
			$current = $this_RulePackage_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		this_ENDLINE_2=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_2, grammarAccess.getRuleFileElementAccess().getENDLINETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleRuleImport
entryRuleRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleImportRule()); }
	iv_ruleRuleImport=ruleRuleImport
	{ $current=$iv_ruleRuleImport.current; }
	EOF;

// Rule RuleImport
ruleRuleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRuleImportAccess().getImportAction_0(),
					$current);
			}
		)
		otherlv_1='import'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleImportAccess().getImportKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
				}
				lv_importedNamespace_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_2_0,
						"org.xtext.burst.Burst.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRulePackage
entryRuleRulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRulePackageRule()); }
	iv_ruleRulePackage=ruleRulePackage
	{ $current=$iv_ruleRulePackage.current; }
	EOF;

// Rule RulePackage
ruleRulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRulePackageAccess().getPackageAction_0(),
					$current);
			}
		)
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getRulePackageAccess().getPackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRulePackageAccess().getNameQualifiedNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRulePackageRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.burst.Burst.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_ENDLINE_3=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_3, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3());
			}
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getRulePackageAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			this_ENDLINE_5=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_5, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_5());
			}
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_6_0_0());
					}
					lv_elements_6_0=rulePackageElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRulePackageRule());
						}
						add(
							$current,
							"elements",
							lv_elements_6_0,
							"org.xtext.burst.Burst.PackageElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_ENDLINE_7=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_7, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_6_1());
				}
			)*
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRulePackageElement
entryRulePackageElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageElementRule()); }
	iv_rulePackageElement=rulePackageElement
	{ $current=$iv_rulePackageElement.current; }
	EOF;

// Rule PackageElement
rulePackageElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleConcernParserRuleCall_0());
		}
		this_RuleConcern_0=ruleRuleConcern
		{
			$current = $this_RuleConcern_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1());
		}
		this_RuleIntersect_1=ruleRuleIntersect
		{
			$current = $this_RuleIntersect_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRuleConcern
entryRuleRuleConcern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleConcernRule()); }
	iv_ruleRuleConcern=ruleRuleConcern
	{ $current=$iv_ruleRuleConcern.current; }
	EOF;

// Rule RuleConcern
ruleRuleConcern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRuleConcernAccess().getConcernAction_0(),
					$current);
			}
		)
		otherlv_1='concern'
		{
			newLeafNode(otherlv_1, grammarAccess.getRuleConcernAccess().getConcernKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getRuleConcernAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleConcernRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.burst.Burst.ID");
				}
			)
		)
		(
			(
				this_ENDLINE_3=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_3, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0());
				}
			)*
			otherlv_4='extends'
			{
				newLeafNode(otherlv_4, grammarAccess.getRuleConcernAccess().getExtendsKeyword_3_1());
			}
			(
				this_ENDLINE_5=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_5, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2());
				}
			)*
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleConcernRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				this_ENDLINE_8=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_8, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_1());
				}
			)*
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_2_0_0());
						}
						lv_elements_9_0=ruleConcernElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleConcernRule());
							}
							add(
								$current,
								"elements",
								lv_elements_9_0,
								"org.xtext.burst.Burst.ConcernElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					this_ENDLINE_10=RULE_ENDLINE
					{
						newLeafNode(this_ENDLINE_10, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1());
					}
				)+
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleConcernElement
entryRuleConcernElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConcernElementRule()); }
	iv_ruleConcernElement=ruleConcernElement
	{ $current=$iv_ruleConcernElement.current; }
	EOF;

// Rule ConcernElement
ruleConcernElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0());
		}
		this_Member_0=ruleMember
		{
			$current = $this_Member_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1());
		}
		this_RuleIntersect_1=ruleRuleIntersect
		{
			$current = $this_RuleIntersect_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMemberAccess().getMemberAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.burst.Burst.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleRuleIntersect
entryRuleRuleIntersect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleIntersectRule()); }
	iv_ruleRuleIntersect=ruleRuleIntersect
	{ $current=$iv_ruleRuleIntersect.current; }
	EOF;

// Rule RuleIntersect
ruleRuleIntersect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0='when'
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleIntersectRule());
					}
					setWithLastConsumed($current, "name", lv_name_1_0, "when");
				}
			)
		)
		(
			this_ENDLINE_2=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_3_0,
						"org.xtext.burst.Burst.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				this_ENDLINE_4=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_4, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
				}
			)*
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0());
				}
				    |
				otherlv_6='and'
				{
					newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1());
				}
			)
			(
				this_ENDLINE_7=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_7, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_4_3_0());
					}
					lv_parameters_8_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_8_0,
							"org.xtext.burst.Burst.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			this_ENDLINE_10=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_10, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_6());
			}
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_7_0_0());
					}
					lv_lines_11_0=ruleLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
						}
						add(
							$current,
							"lines",
							lv_lines_11_0,
							"org.xtext.burst.Burst.Line");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				this_ENDLINE_12=RULE_ENDLINE
				{
					newLeafNode(this_ENDLINE_12, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1());
				}
			)+
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getParameterAccess().getNamedParameterParserRuleCall_0());
		}
		this_NamedParameter_0=ruleNamedParameter
		{
			$current = $this_NamedParameter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParameterAccess().getStaticParameterParserRuleCall_1());
		}
		this_StaticParameter_1=ruleStaticParameter
		{
			$current = $this_StaticParameter_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParameterAccess().getUsageParameterParserRuleCall_2());
		}
		this_UsageParameter_2=ruleUsageParameter
		{
			$current = $this_UsageParameter_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNamedParameter
entryRuleNamedParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedParameterRule()); }
	iv_ruleNamedParameter=ruleNamedParameter
	{ $current=$iv_ruleNamedParameter.current; }
	EOF;

// Rule NamedParameter
ruleNamedParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNamedParameterAccess().getNamedParameterAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamedParameterRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getNamedParameterAccess().getTypeConcernCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getNamedParameterAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNamedParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.burst.Burst.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleStaticParameter
entryRuleStaticParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStaticParameterRule()); }
	iv_ruleStaticParameter=ruleStaticParameter
	{ $current=$iv_ruleStaticParameter.current; }
	EOF;

// Rule StaticParameter
ruleStaticParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStaticParameterAccess().getStaticParameterAction_0(),
					$current);
			}
		)
		otherlv_1='with'
		{
			newLeafNode(otherlv_1, grammarAccess.getStaticParameterAccess().getWithKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStaticParameterRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getStaticParameterAccess().getNameConcernCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleUsageParameter
entryRuleUsageParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsageParameterRule()); }
	iv_ruleUsageParameter=ruleUsageParameter
	{ $current=$iv_ruleUsageParameter.current; }
	EOF;

// Rule UsageParameter
ruleUsageParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUsageParameterAccess().getUsageParameterAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsageParameterRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getUsageParameterAccess().getTypeConcernCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getUsageParameterAccess().getFullStopKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getUsageParameterAccess().getUsageParserRuleCall_3());
		}
		ruleusage
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getUsageParameterAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsageParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.xtext.burst.Burst.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleusage
entryRuleusage returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUsageRule()); }
	iv_ruleusage=ruleusage
	{ $current=$iv_ruleusage.current.getText(); }
	EOF;

// Rule usage
ruleusage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getUsageAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleLine
entryRuleLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineRule()); }
	iv_ruleLine=ruleLine
	{ $current=$iv_ruleLine.current; }
	EOF;

// Rule Line
ruleLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLineAccess().getLineAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_1_0());
				}
				lv_calls_1_0=ruleCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLineRule());
					}
					add(
						$current,
						"calls",
						lv_calls_1_0,
						"org.xtext.burst.Burst.Call");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_2_0());
				}
				lv_calls_2_0=ruleCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLineRule());
					}
					add(
						$current,
						"calls",
						lv_calls_2_0,
						"org.xtext.burst.Burst.Call");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleCall
entryRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallRule()); }
	iv_ruleCall=ruleCall
	{ $current=$iv_ruleCall.current; }
	EOF;

// Rule Call
ruleCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCallAccess().getVariableCallParserRuleCall_0());
		}
		this_VariableCall_0=ruleVariableCall
		{
			$current = $this_VariableCall_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCallAccess().getMemberCallParserRuleCall_1());
		}
		this_MemberCall_1=ruleMemberCall
		{
			$current = $this_MemberCall_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMemberCall
entryRuleMemberCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberCallRule()); }
	iv_ruleMemberCall=ruleMemberCall
	{ $current=$iv_ruleMemberCall.current; }
	EOF;

// Rule MemberCall
ruleMemberCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMemberCallAccess().getMemberCallAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberCallRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getMemberCallAccess().getVariableVariableCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getMemberCallAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMemberCallRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getMemberCallAccess().getNameMemberCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleVariableCall
entryRuleVariableCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableCallRule()); }
	iv_ruleVariableCall=ruleVariableCall
	{ $current=$iv_ruleVariableCall.current; }
	EOF;

// Rule VariableCall
ruleVariableCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableCallAccess().getVariableCallAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableCallRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getNameVariableCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t')+;

RULE_ENDLINE : '\r'? '\n';

RULE_ANY_OTHER : .;
