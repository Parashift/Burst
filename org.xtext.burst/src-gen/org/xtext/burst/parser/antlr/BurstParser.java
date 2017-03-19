/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.burst.parser.antlr.internal.InternalBurstParser;
import org.xtext.burst.services.BurstGrammarAccess;

public class BurstParser extends AbstractAntlrParser {

	@Inject
	private BurstGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBurstParser createParser(XtextTokenStream stream) {
		return new InternalBurstParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "File";
	}

	public BurstGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BurstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}