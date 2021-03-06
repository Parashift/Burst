/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.burst.ide.contentassist.antlr.internal.InternalBurstParser;
import org.xtext.burst.services.BurstGrammarAccess;

public class BurstParser extends AbstractContentAssistParser {

	@Inject
	private BurstGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBurstParser createParser() {
		InternalBurstParser result = new InternalBurstParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFileElementAccess().getAlternatives(), "rule__FileElement__Alternatives");
					put(grammarAccess.getPackageElementAccess().getAlternatives(), "rule__PackageElement__Alternatives");
					put(grammarAccess.getConcernElementAccess().getAlternatives(), "rule__ConcernElement__Alternatives");
					put(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1(), "rule__RuleIntersect__Alternatives_4_1");
					put(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1(), "rule__RuleIntersect__Alternatives_5_3_1");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getLineAccess().getAlternatives(), "rule__Line__Alternatives");
					put(grammarAccess.getIfAccess().getAlternatives_3(), "rule__If__Alternatives_3");
					put(grammarAccess.getCallElementAccess().getAlternatives(), "rule__CallElement__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__TerminalExpression__ValueAlternatives_2_1_0");
					put(grammarAccess.getConcernManagmentAccess().getAlternatives(), "rule__ConcernManagment__Alternatives");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getFileAccess().getGroup_2(), "rule__File__Group_2__0");
					put(grammarAccess.getFileAccess().getGroup_3(), "rule__File__Group_3__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getRolesAccess().getGroup(), "rule__Roles__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_6(), "rule__Package__Group_6__0");
					put(grammarAccess.getConcernAccess().getGroup(), "rule__Concern__Group__0");
					put(grammarAccess.getConcernAccess().getGroup_3(), "rule__Concern__Group_3__0");
					put(grammarAccess.getConcernAccess().getGroup_3_3(), "rule__Concern__Group_3_3__0");
					put(grammarAccess.getTemplateAccess().getGroup(), "rule__Template__Group__0");
					put(grammarAccess.getTemplateAccess().getGroup_5(), "rule__Template__Group_5__0");
					put(grammarAccess.getTemplateAccess().getGroup_7(), "rule__Template__Group_7__0");
					put(grammarAccess.getTemplateAccess().getGroup_7_3(), "rule__Template__Group_7_3__0");
					put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
					put(grammarAccess.getRuleIntersectAccess().getGroup(), "rule__RuleIntersect__Group__0");
					put(grammarAccess.getRuleIntersectAccess().getGroup_4(), "rule__RuleIntersect__Group_4__0");
					put(grammarAccess.getRuleIntersectAccess().getGroup_5(), "rule__RuleIntersect__Group_5__0");
					put(grammarAccess.getRuleIntersectAccess().getGroup_5_3(), "rule__RuleIntersect__Group_5_3__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_3(), "rule__Block__Group_3__0");
					put(grammarAccess.getBlockAccess().getGroup_3_1(), "rule__Block__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getWithParameterAccess().getGroup(), "rule__WithParameter__Group__0");
					put(grammarAccess.getWithParameterAccess().getGroup_2(), "rule__WithParameter__Group_2__0");
					put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_3_1(), "rule__If__Group_3_1__0");
					put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
					put(grammarAccess.getIfAccess().getGroup_4_0(), "rule__If__Group_4_0__0");
					put(grammarAccess.getContextManagementAccess().getGroup(), "rule__ContextManagement__Group__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getCallAccess().getGroup_2(), "rule__Call__Group_2__0");
					put(grammarAccess.getLocaleAccess().getGroup(), "rule__Locale__Group__0");
					put(grammarAccess.getLocaleAccess().getGroup_4(), "rule__Locale__Group_4__0");
					put(grammarAccess.getAccessAccess().getGroup(), "rule__Access__Group__0");
					put(grammarAccess.getAccessAccess().getGroup_2(), "rule__Access__Group_2__0");
					put(grammarAccess.getAccessAccess().getGroup_3(), "rule__Access__Group_3__0");
					put(grammarAccess.getSubCallAccess().getGroup(), "rule__SubCall__Group__0");
					put(grammarAccess.getSubCallAccess().getGroup_4(), "rule__SubCall__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_4(), "rule__TerminalExpression__Group_4__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_5(), "rule__TerminalExpression__Group_5__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getFileAccess().getImportsAssignment_2_0(), "rule__File__ImportsAssignment_2_0");
					put(grammarAccess.getFileAccess().getElementsAssignment_3_0(), "rule__File__ElementsAssignment_3_0");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2(), "rule__Import__ImportedNamespaceAssignment_2");
					put(grammarAccess.getRolesAccess().getNameAssignment_2(), "rule__Roles__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getElementsAssignment_6_0(), "rule__Package__ElementsAssignment_6_0");
					put(grammarAccess.getConcernAccess().getNameAssignment_2(), "rule__Concern__NameAssignment_2");
					put(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0(), "rule__Concern__ElementsAssignment_3_3_0");
					put(grammarAccess.getTemplateAccess().getNameAssignment_2(), "rule__Template__NameAssignment_2");
					put(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4(), "rule__Template__TemplateArgumentsAssignment_4");
					put(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1(), "rule__Template__TemplateArgumentsAssignment_5_1");
					put(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0(), "rule__Template__ElementsAssignment_7_3_0");
					put(grammarAccess.getMemberAccess().getActAsAssignment_1(), "rule__Member__ActAsAssignment_1");
					put(grammarAccess.getMemberAccess().getIsContentAssignment_2(), "rule__Member__IsContentAssignment_2");
					put(grammarAccess.getMemberAccess().getConcernAssignment_3(), "rule__Member__ConcernAssignment_3");
					put(grammarAccess.getMemberAccess().getNameAssignment_4(), "rule__Member__NameAssignment_4");
					put(grammarAccess.getRuleIntersectAccess().getNameAssignment_1(), "rule__RuleIntersect__NameAssignment_1");
					put(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3(), "rule__RuleIntersect__ParamsAssignment_3");
					put(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3(), "rule__RuleIntersect__ParamsAssignment_4_3");
					put(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_2(), "rule__RuleIntersect__WithParamsAssignment_5_2");
					put(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_3_3(), "rule__RuleIntersect__WithParamsAssignment_5_3_3");
					put(grammarAccess.getRuleIntersectAccess().getBlockAssignment_6(), "rule__RuleIntersect__BlockAssignment_6");
					put(grammarAccess.getBlockAccess().getLinesAssignment_3_0(), "rule__Block__LinesAssignment_3_0");
					put(grammarAccess.getBlockAccess().getLinesAssignment_3_1_1(), "rule__Block__LinesAssignment_3_1_1");
					put(grammarAccess.getParameterAccess().getTypeAssignment_1(), "rule__Parameter__TypeAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getParameterAccess().getUsageAssignment_3_0(), "rule__Parameter__UsageAssignment_3_0");
					put(grammarAccess.getParameterAccess().getRoleAssignment_3_1(), "rule__Parameter__RoleAssignment_3_1");
					put(grammarAccess.getWithParameterAccess().getNameAssignment_1(), "rule__WithParameter__NameAssignment_1");
					put(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0(), "rule__WithParameter__UsageAssignment_2_0");
					put(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1(), "rule__WithParameter__RoleAssignment_2_1");
					put(grammarAccess.getStopAccess().getConditionAssignment_2(), "rule__Stop__ConditionAssignment_2");
					put(grammarAccess.getIfAccess().getExpressionAssignment_2(), "rule__If__ExpressionAssignment_2");
					put(grammarAccess.getIfAccess().getThenBlockAssignment_3_0(), "rule__If__ThenBlockAssignment_3_0");
					put(grammarAccess.getIfAccess().getThenBlockAssignment_3_1_1(), "rule__If__ThenBlockAssignment_3_1_1");
					put(grammarAccess.getIfAccess().getElseBlockAssignment_4_3(), "rule__If__ElseBlockAssignment_4_3");
					put(grammarAccess.getContextManagementAccess().getActionAssignment_1(), "rule__ContextManagement__ActionAssignment_1");
					put(grammarAccess.getContextManagementAccess().getTargetAssignment_2(), "rule__ContextManagement__TargetAssignment_2");
					put(grammarAccess.getCallAccess().getContentAssignment_1(), "rule__Call__ContentAssignment_1");
					put(grammarAccess.getCallAccess().getEqualityAssignment_2_0(), "rule__Call__EqualityAssignment_2_0");
					put(grammarAccess.getCallAccess().getSourceAssignment_2_1(), "rule__Call__SourceAssignment_2_1");
					put(grammarAccess.getLocaleAccess().getTypeAssignment_2(), "rule__Locale__TypeAssignment_2");
					put(grammarAccess.getLocaleAccess().getNameAssignment_3(), "rule__Locale__NameAssignment_3");
					put(grammarAccess.getLocaleAccess().getRolesAssignment_4_1(), "rule__Locale__RolesAssignment_4_1");
					put(grammarAccess.getAccessAccess().getNameAssignment_1(), "rule__Access__NameAssignment_1");
					put(grammarAccess.getAccessAccess().getMembersAssignment_2_1(), "rule__Access__MembersAssignment_2_1");
					put(grammarAccess.getAccessAccess().getRolesAssignment_3_1(), "rule__Access__RolesAssignment_3_1");
					put(grammarAccess.getSubCallAccess().getContentAssignment_2(), "rule__SubCall__ContentAssignment_2");
					put(grammarAccess.getSubCallAccess().getRolesAssignment_4_1(), "rule__SubCall__RolesAssignment_4_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1(), "rule__TerminalExpression__ValueAssignment_3_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1(), "rule__TerminalExpression__ValueAssignment_4_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1(), "rule__TerminalExpression__ValueAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BurstGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BurstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
