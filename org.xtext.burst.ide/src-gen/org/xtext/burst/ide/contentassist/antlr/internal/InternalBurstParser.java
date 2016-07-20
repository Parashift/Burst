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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBurstParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'import'", "'package'", "'{'", "'}'", "'concern'", "'extends'", "'.'", "'when'", "'toto'"
    };
    public static final int RULE_ENDLINE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBurstParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBurstParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBurstParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBurst.g"; }


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



    // $ANTLR start "entryRuleFile"
    // InternalBurst.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalBurst.g:54:1: ( ruleFile EOF )
            // InternalBurst.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalBurst.g:62:1: ruleFile : ( ( rule__File__ElementsAssignment )* ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:66:2: ( ( ( rule__File__ElementsAssignment )* ) )
            // InternalBurst.g:67:2: ( ( rule__File__ElementsAssignment )* )
            {
            // InternalBurst.g:67:2: ( ( rule__File__ElementsAssignment )* )
            // InternalBurst.g:68:3: ( rule__File__ElementsAssignment )*
            {
             before(grammarAccess.getFileAccess().getElementsAssignment()); 
            // InternalBurst.g:69:3: ( rule__File__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENDLINE||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:69:4: rule__File__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__File__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleRuleFileElement"
    // InternalBurst.g:78:1: entryRuleRuleFileElement : ruleRuleFileElement EOF ;
    public final void entryRuleRuleFileElement() throws RecognitionException {
        try {
            // InternalBurst.g:79:1: ( ruleRuleFileElement EOF )
            // InternalBurst.g:80:1: ruleRuleFileElement EOF
            {
             before(grammarAccess.getRuleFileElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleFileElement();

            state._fsp--;

             after(grammarAccess.getRuleFileElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleFileElement"


    // $ANTLR start "ruleRuleFileElement"
    // InternalBurst.g:87:1: ruleRuleFileElement : ( ( rule__RuleFileElement__Alternatives ) ) ;
    public final void ruleRuleFileElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:91:2: ( ( ( rule__RuleFileElement__Alternatives ) ) )
            // InternalBurst.g:92:2: ( ( rule__RuleFileElement__Alternatives ) )
            {
            // InternalBurst.g:92:2: ( ( rule__RuleFileElement__Alternatives ) )
            // InternalBurst.g:93:3: ( rule__RuleFileElement__Alternatives )
            {
             before(grammarAccess.getRuleFileElementAccess().getAlternatives()); 
            // InternalBurst.g:94:3: ( rule__RuleFileElement__Alternatives )
            // InternalBurst.g:94:4: rule__RuleFileElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleFileElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleFileElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleFileElement"


    // $ANTLR start "entryRuleRuleImport"
    // InternalBurst.g:103:1: entryRuleRuleImport : ruleRuleImport EOF ;
    public final void entryRuleRuleImport() throws RecognitionException {
        try {
            // InternalBurst.g:104:1: ( ruleRuleImport EOF )
            // InternalBurst.g:105:1: ruleRuleImport EOF
            {
             before(grammarAccess.getRuleImportRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleImport();

            state._fsp--;

             after(grammarAccess.getRuleImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleImport"


    // $ANTLR start "ruleRuleImport"
    // InternalBurst.g:112:1: ruleRuleImport : ( ( rule__RuleImport__Group__0 ) ) ;
    public final void ruleRuleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:116:2: ( ( ( rule__RuleImport__Group__0 ) ) )
            // InternalBurst.g:117:2: ( ( rule__RuleImport__Group__0 ) )
            {
            // InternalBurst.g:117:2: ( ( rule__RuleImport__Group__0 ) )
            // InternalBurst.g:118:3: ( rule__RuleImport__Group__0 )
            {
             before(grammarAccess.getRuleImportAccess().getGroup()); 
            // InternalBurst.g:119:3: ( rule__RuleImport__Group__0 )
            // InternalBurst.g:119:4: rule__RuleImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleImport"


    // $ANTLR start "entryRuleRulePackage"
    // InternalBurst.g:128:1: entryRuleRulePackage : ruleRulePackage EOF ;
    public final void entryRuleRulePackage() throws RecognitionException {
        try {
            // InternalBurst.g:129:1: ( ruleRulePackage EOF )
            // InternalBurst.g:130:1: ruleRulePackage EOF
            {
             before(grammarAccess.getRulePackageRule()); 
            pushFollow(FOLLOW_1);
            ruleRulePackage();

            state._fsp--;

             after(grammarAccess.getRulePackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRulePackage"


    // $ANTLR start "ruleRulePackage"
    // InternalBurst.g:137:1: ruleRulePackage : ( ( rule__RulePackage__Group__0 ) ) ;
    public final void ruleRulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:141:2: ( ( ( rule__RulePackage__Group__0 ) ) )
            // InternalBurst.g:142:2: ( ( rule__RulePackage__Group__0 ) )
            {
            // InternalBurst.g:142:2: ( ( rule__RulePackage__Group__0 ) )
            // InternalBurst.g:143:3: ( rule__RulePackage__Group__0 )
            {
             before(grammarAccess.getRulePackageAccess().getGroup()); 
            // InternalBurst.g:144:3: ( rule__RulePackage__Group__0 )
            // InternalBurst.g:144:4: rule__RulePackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulePackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRulePackage"


    // $ANTLR start "entryRulePackageElement"
    // InternalBurst.g:153:1: entryRulePackageElement : rulePackageElement EOF ;
    public final void entryRulePackageElement() throws RecognitionException {
        try {
            // InternalBurst.g:154:1: ( rulePackageElement EOF )
            // InternalBurst.g:155:1: rulePackageElement EOF
            {
             before(grammarAccess.getPackageElementRule()); 
            pushFollow(FOLLOW_1);
            rulePackageElement();

            state._fsp--;

             after(grammarAccess.getPackageElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageElement"


    // $ANTLR start "rulePackageElement"
    // InternalBurst.g:162:1: rulePackageElement : ( ( rule__PackageElement__Alternatives ) ) ;
    public final void rulePackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:166:2: ( ( ( rule__PackageElement__Alternatives ) ) )
            // InternalBurst.g:167:2: ( ( rule__PackageElement__Alternatives ) )
            {
            // InternalBurst.g:167:2: ( ( rule__PackageElement__Alternatives ) )
            // InternalBurst.g:168:3: ( rule__PackageElement__Alternatives )
            {
             before(grammarAccess.getPackageElementAccess().getAlternatives()); 
            // InternalBurst.g:169:3: ( rule__PackageElement__Alternatives )
            // InternalBurst.g:169:4: rule__PackageElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PackageElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPackageElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRuleRuleConcern"
    // InternalBurst.g:178:1: entryRuleRuleConcern : ruleRuleConcern EOF ;
    public final void entryRuleRuleConcern() throws RecognitionException {
        try {
            // InternalBurst.g:179:1: ( ruleRuleConcern EOF )
            // InternalBurst.g:180:1: ruleRuleConcern EOF
            {
             before(grammarAccess.getRuleConcernRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleConcern();

            state._fsp--;

             after(grammarAccess.getRuleConcernRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleConcern"


    // $ANTLR start "ruleRuleConcern"
    // InternalBurst.g:187:1: ruleRuleConcern : ( ( rule__RuleConcern__Group__0 ) ) ;
    public final void ruleRuleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:191:2: ( ( ( rule__RuleConcern__Group__0 ) ) )
            // InternalBurst.g:192:2: ( ( rule__RuleConcern__Group__0 ) )
            {
            // InternalBurst.g:192:2: ( ( rule__RuleConcern__Group__0 ) )
            // InternalBurst.g:193:3: ( rule__RuleConcern__Group__0 )
            {
             before(grammarAccess.getRuleConcernAccess().getGroup()); 
            // InternalBurst.g:194:3: ( rule__RuleConcern__Group__0 )
            // InternalBurst.g:194:4: rule__RuleConcern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleConcernAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleConcern"


    // $ANTLR start "entryRuleConcernElement"
    // InternalBurst.g:203:1: entryRuleConcernElement : ruleConcernElement EOF ;
    public final void entryRuleConcernElement() throws RecognitionException {
        try {
            // InternalBurst.g:204:1: ( ruleConcernElement EOF )
            // InternalBurst.g:205:1: ruleConcernElement EOF
            {
             before(grammarAccess.getConcernElementRule()); 
            pushFollow(FOLLOW_1);
            ruleConcernElement();

            state._fsp--;

             after(grammarAccess.getConcernElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcernElement"


    // $ANTLR start "ruleConcernElement"
    // InternalBurst.g:212:1: ruleConcernElement : ( ( rule__ConcernElement__Alternatives ) ) ;
    public final void ruleConcernElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:216:2: ( ( ( rule__ConcernElement__Alternatives ) ) )
            // InternalBurst.g:217:2: ( ( rule__ConcernElement__Alternatives ) )
            {
            // InternalBurst.g:217:2: ( ( rule__ConcernElement__Alternatives ) )
            // InternalBurst.g:218:3: ( rule__ConcernElement__Alternatives )
            {
             before(grammarAccess.getConcernElementAccess().getAlternatives()); 
            // InternalBurst.g:219:3: ( rule__ConcernElement__Alternatives )
            // InternalBurst.g:219:4: rule__ConcernElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConcernElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConcernElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcernElement"


    // $ANTLR start "entryRuleDeclareMember"
    // InternalBurst.g:228:1: entryRuleDeclareMember : ruleDeclareMember EOF ;
    public final void entryRuleDeclareMember() throws RecognitionException {
        try {
            // InternalBurst.g:229:1: ( ruleDeclareMember EOF )
            // InternalBurst.g:230:1: ruleDeclareMember EOF
            {
             before(grammarAccess.getDeclareMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclareMember();

            state._fsp--;

             after(grammarAccess.getDeclareMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclareMember"


    // $ANTLR start "ruleDeclareMember"
    // InternalBurst.g:237:1: ruleDeclareMember : ( ( rule__DeclareMember__Group__0 ) ) ;
    public final void ruleDeclareMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:241:2: ( ( ( rule__DeclareMember__Group__0 ) ) )
            // InternalBurst.g:242:2: ( ( rule__DeclareMember__Group__0 ) )
            {
            // InternalBurst.g:242:2: ( ( rule__DeclareMember__Group__0 ) )
            // InternalBurst.g:243:3: ( rule__DeclareMember__Group__0 )
            {
             before(grammarAccess.getDeclareMemberAccess().getGroup()); 
            // InternalBurst.g:244:3: ( rule__DeclareMember__Group__0 )
            // InternalBurst.g:244:4: rule__DeclareMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclareMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclareMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclareMember"


    // $ANTLR start "entryRuleRuleIntersect"
    // InternalBurst.g:253:1: entryRuleRuleIntersect : ruleRuleIntersect EOF ;
    public final void entryRuleRuleIntersect() throws RecognitionException {
        try {
            // InternalBurst.g:254:1: ( ruleRuleIntersect EOF )
            // InternalBurst.g:255:1: ruleRuleIntersect EOF
            {
             before(grammarAccess.getRuleIntersectRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleIntersect();

            state._fsp--;

             after(grammarAccess.getRuleIntersectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleIntersect"


    // $ANTLR start "ruleRuleIntersect"
    // InternalBurst.g:262:1: ruleRuleIntersect : ( ( rule__RuleIntersect__Group__0 ) ) ;
    public final void ruleRuleIntersect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:266:2: ( ( ( rule__RuleIntersect__Group__0 ) ) )
            // InternalBurst.g:267:2: ( ( rule__RuleIntersect__Group__0 ) )
            {
            // InternalBurst.g:267:2: ( ( rule__RuleIntersect__Group__0 ) )
            // InternalBurst.g:268:3: ( rule__RuleIntersect__Group__0 )
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup()); 
            // InternalBurst.g:269:3: ( rule__RuleIntersect__Group__0 )
            // InternalBurst.g:269:4: rule__RuleIntersect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleIntersect"


    // $ANTLR start "entryRuleDeclareParameter"
    // InternalBurst.g:278:1: entryRuleDeclareParameter : ruleDeclareParameter EOF ;
    public final void entryRuleDeclareParameter() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleDeclareParameter EOF )
            // InternalBurst.g:280:1: ruleDeclareParameter EOF
            {
             before(grammarAccess.getDeclareParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclareParameter();

            state._fsp--;

             after(grammarAccess.getDeclareParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclareParameter"


    // $ANTLR start "ruleDeclareParameter"
    // InternalBurst.g:287:1: ruleDeclareParameter : ( ruleRenamedParameter ) ;
    public final void ruleDeclareParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ruleRenamedParameter ) )
            // InternalBurst.g:292:2: ( ruleRenamedParameter )
            {
            // InternalBurst.g:292:2: ( ruleRenamedParameter )
            // InternalBurst.g:293:3: ruleRenamedParameter
            {
             before(grammarAccess.getDeclareParameterAccess().getRenamedParameterParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRenamedParameter();

            state._fsp--;

             after(grammarAccess.getDeclareParameterAccess().getRenamedParameterParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclareParameter"


    // $ANTLR start "entryRuleRenamedParameter"
    // InternalBurst.g:303:1: entryRuleRenamedParameter : ruleRenamedParameter EOF ;
    public final void entryRuleRenamedParameter() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleRenamedParameter EOF )
            // InternalBurst.g:305:1: ruleRenamedParameter EOF
            {
             before(grammarAccess.getRenamedParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleRenamedParameter();

            state._fsp--;

             after(grammarAccess.getRenamedParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenamedParameter"


    // $ANTLR start "ruleRenamedParameter"
    // InternalBurst.g:312:1: ruleRenamedParameter : ( ( rule__RenamedParameter__Group__0 ) ) ;
    public final void ruleRenamedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__RenamedParameter__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__RenamedParameter__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__RenamedParameter__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__RenamedParameter__Group__0 )
            {
             before(grammarAccess.getRenamedParameterAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__RenamedParameter__Group__0 )
            // InternalBurst.g:319:4: rule__RenamedParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenamedParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenamedParameter"


    // $ANTLR start "entryRuleIntersectionElement"
    // InternalBurst.g:328:1: entryRuleIntersectionElement : ruleIntersectionElement EOF ;
    public final void entryRuleIntersectionElement() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleIntersectionElement EOF )
            // InternalBurst.g:330:1: ruleIntersectionElement EOF
            {
             before(grammarAccess.getIntersectionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleIntersectionElement();

            state._fsp--;

             after(grammarAccess.getIntersectionElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntersectionElement"


    // $ANTLR start "ruleIntersectionElement"
    // InternalBurst.g:337:1: ruleIntersectionElement : ( ( rule__IntersectionElement__Alternatives ) ) ;
    public final void ruleIntersectionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__IntersectionElement__Alternatives ) ) )
            // InternalBurst.g:342:2: ( ( rule__IntersectionElement__Alternatives ) )
            {
            // InternalBurst.g:342:2: ( ( rule__IntersectionElement__Alternatives ) )
            // InternalBurst.g:343:3: ( rule__IntersectionElement__Alternatives )
            {
             before(grammarAccess.getIntersectionElementAccess().getAlternatives()); 
            // InternalBurst.g:344:3: ( rule__IntersectionElement__Alternatives )
            // InternalBurst.g:344:4: rule__IntersectionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntersectionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntersectionElement"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:353:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleLine EOF )
            // InternalBurst.g:355:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalBurst.g:362:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:367:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:367:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:368:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:369:3: ( rule__Line__Group__0 )
            // InternalBurst.g:369:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:378:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:379:1: ( ruleCall EOF )
            // InternalBurst.g:380:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalBurst.g:387:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:391:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalBurst.g:392:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalBurst.g:392:2: ( ( rule__Call__Alternatives ) )
            // InternalBurst.g:393:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalBurst.g:394:3: ( rule__Call__Alternatives )
            // InternalBurst.g:394:4: rule__Call__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Call__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuletoto"
    // InternalBurst.g:403:1: entryRuletoto : ruletoto EOF ;
    public final void entryRuletoto() throws RecognitionException {
        try {
            // InternalBurst.g:404:1: ( ruletoto EOF )
            // InternalBurst.g:405:1: ruletoto EOF
            {
             before(grammarAccess.getTotoRule()); 
            pushFollow(FOLLOW_1);
            ruletoto();

            state._fsp--;

             after(grammarAccess.getTotoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletoto"


    // $ANTLR start "ruletoto"
    // InternalBurst.g:412:1: ruletoto : ( ( rule__Toto__Group__0 ) ) ;
    public final void ruletoto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:2: ( ( ( rule__Toto__Group__0 ) ) )
            // InternalBurst.g:417:2: ( ( rule__Toto__Group__0 ) )
            {
            // InternalBurst.g:417:2: ( ( rule__Toto__Group__0 ) )
            // InternalBurst.g:418:3: ( rule__Toto__Group__0 )
            {
             before(grammarAccess.getTotoAccess().getGroup()); 
            // InternalBurst.g:419:3: ( rule__Toto__Group__0 )
            // InternalBurst.g:419:4: rule__Toto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Toto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTotoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletoto"


    // $ANTLR start "entryRuleRenamedParameterCall"
    // InternalBurst.g:428:1: entryRuleRenamedParameterCall : ruleRenamedParameterCall EOF ;
    public final void entryRuleRenamedParameterCall() throws RecognitionException {
        try {
            // InternalBurst.g:429:1: ( ruleRenamedParameterCall EOF )
            // InternalBurst.g:430:1: ruleRenamedParameterCall EOF
            {
             before(grammarAccess.getRenamedParameterCallRule()); 
            pushFollow(FOLLOW_1);
            ruleRenamedParameterCall();

            state._fsp--;

             after(grammarAccess.getRenamedParameterCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenamedParameterCall"


    // $ANTLR start "ruleRenamedParameterCall"
    // InternalBurst.g:437:1: ruleRenamedParameterCall : ( ( rule__RenamedParameterCall__Group__0 ) ) ;
    public final void ruleRenamedParameterCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:2: ( ( ( rule__RenamedParameterCall__Group__0 ) ) )
            // InternalBurst.g:442:2: ( ( rule__RenamedParameterCall__Group__0 ) )
            {
            // InternalBurst.g:442:2: ( ( rule__RenamedParameterCall__Group__0 ) )
            // InternalBurst.g:443:3: ( rule__RenamedParameterCall__Group__0 )
            {
             before(grammarAccess.getRenamedParameterCallAccess().getGroup()); 
            // InternalBurst.g:444:3: ( rule__RenamedParameterCall__Group__0 )
            // InternalBurst.g:444:4: rule__RenamedParameterCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameterCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenamedParameterCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenamedParameterCall"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:454:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:455:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBurst.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:467:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:468:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:469:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:469:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__RuleFileElement__Alternatives"
    // InternalBurst.g:477:1: rule__RuleFileElement__Alternatives : ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) );
    public final void rule__RuleFileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:481:1: ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case RULE_ENDLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBurst.g:482:2: ( ruleRuleImport )
                    {
                    // InternalBurst.g:482:2: ( ruleRuleImport )
                    // InternalBurst.g:483:3: ruleRuleImport
                    {
                     before(grammarAccess.getRuleFileElementAccess().getRuleImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleImport();

                    state._fsp--;

                     after(grammarAccess.getRuleFileElementAccess().getRuleImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:488:2: ( ruleRulePackage )
                    {
                    // InternalBurst.g:488:2: ( ruleRulePackage )
                    // InternalBurst.g:489:3: ruleRulePackage
                    {
                     before(grammarAccess.getRuleFileElementAccess().getRulePackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRulePackage();

                    state._fsp--;

                     after(grammarAccess.getRuleFileElementAccess().getRulePackageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:494:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:494:2: ( RULE_ENDLINE )
                    // InternalBurst.g:495:3: RULE_ENDLINE
                    {
                     before(grammarAccess.getRuleFileElementAccess().getENDLINETerminalRuleCall_2()); 
                    match(input,RULE_ENDLINE,FOLLOW_2); 
                     after(grammarAccess.getRuleFileElementAccess().getENDLINETerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleFileElement__Alternatives"


    // $ANTLR start "rule__PackageElement__Alternatives"
    // InternalBurst.g:504:1: rule__PackageElement__Alternatives : ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:508:1: ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case RULE_ENDLINE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBurst.g:509:2: ( ruleRuleConcern )
                    {
                    // InternalBurst.g:509:2: ( ruleRuleConcern )
                    // InternalBurst.g:510:3: ruleRuleConcern
                    {
                     before(grammarAccess.getPackageElementAccess().getRuleConcernParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleConcern();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getRuleConcernParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:515:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:515:2: ( ruleRuleIntersect )
                    // InternalBurst.g:516:3: ruleRuleIntersect
                    {
                     before(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:521:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:521:2: ( RULE_ENDLINE )
                    // InternalBurst.g:522:3: RULE_ENDLINE
                    {
                     before(grammarAccess.getPackageElementAccess().getENDLINETerminalRuleCall_2()); 
                    match(input,RULE_ENDLINE,FOLLOW_2); 
                     after(grammarAccess.getPackageElementAccess().getENDLINETerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageElement__Alternatives"


    // $ANTLR start "rule__ConcernElement__Alternatives"
    // InternalBurst.g:531:1: rule__ConcernElement__Alternatives : ( ( ruleDeclareMember ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:535:1: ( ( ruleDeclareMember ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case RULE_ENDLINE:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBurst.g:536:2: ( ruleDeclareMember )
                    {
                    // InternalBurst.g:536:2: ( ruleDeclareMember )
                    // InternalBurst.g:537:3: ruleDeclareMember
                    {
                     before(grammarAccess.getConcernElementAccess().getDeclareMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclareMember();

                    state._fsp--;

                     after(grammarAccess.getConcernElementAccess().getDeclareMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:542:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:542:2: ( ruleRuleIntersect )
                    // InternalBurst.g:543:3: ruleRuleIntersect
                    {
                     before(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;

                     after(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:548:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:548:2: ( RULE_ENDLINE )
                    // InternalBurst.g:549:3: RULE_ENDLINE
                    {
                     before(grammarAccess.getConcernElementAccess().getENDLINETerminalRuleCall_2()); 
                    match(input,RULE_ENDLINE,FOLLOW_2); 
                     after(grammarAccess.getConcernElementAccess().getENDLINETerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcernElement__Alternatives"


    // $ANTLR start "rule__RuleIntersect__Alternatives_2_2"
    // InternalBurst.g:558:1: rule__RuleIntersect__Alternatives_2_2 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:562:1: ( ( ',' ) | ( 'and' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBurst.g:563:2: ( ',' )
                    {
                    // InternalBurst.g:563:2: ( ',' )
                    // InternalBurst.g:564:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:569:2: ( 'and' )
                    {
                    // InternalBurst.g:569:2: ( 'and' )
                    // InternalBurst.g:570:3: 'and'
                    {
                     before(grammarAccess.getRuleIntersectAccess().getAndKeyword_2_2_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getAndKeyword_2_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Alternatives_2_2"


    // $ANTLR start "rule__IntersectionElement__Alternatives"
    // InternalBurst.g:579:1: rule__IntersectionElement__Alternatives : ( ( ruleLine ) | ( RULE_ENDLINE ) );
    public final void rule__IntersectionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:583:1: ( ( ruleLine ) | ( RULE_ENDLINE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ENDLINE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:584:2: ( ruleLine )
                    {
                    // InternalBurst.g:584:2: ( ruleLine )
                    // InternalBurst.g:585:3: ruleLine
                    {
                     before(grammarAccess.getIntersectionElementAccess().getLineParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLine();

                    state._fsp--;

                     after(grammarAccess.getIntersectionElementAccess().getLineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:590:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:590:2: ( RULE_ENDLINE )
                    // InternalBurst.g:591:3: RULE_ENDLINE
                    {
                     before(grammarAccess.getIntersectionElementAccess().getENDLINETerminalRuleCall_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_2); 
                     after(grammarAccess.getIntersectionElementAccess().getENDLINETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntersectionElement__Alternatives"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalBurst.g:600:1: rule__Call__Alternatives : ( ( ruletoto ) | ( ruleRenamedParameterCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:604:1: ( ( ruletoto ) | ( ruleRenamedParameterCall ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:605:2: ( ruletoto )
                    {
                    // InternalBurst.g:605:2: ( ruletoto )
                    // InternalBurst.g:606:3: ruletoto
                    {
                     before(grammarAccess.getCallAccess().getTotoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruletoto();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getTotoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:611:2: ( ruleRenamedParameterCall )
                    {
                    // InternalBurst.g:611:2: ( ruleRenamedParameterCall )
                    // InternalBurst.g:612:3: ruleRenamedParameterCall
                    {
                     before(grammarAccess.getCallAccess().getRenamedParameterCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenamedParameterCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getRenamedParameterCallParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Alternatives"


    // $ANTLR start "rule__RuleImport__Group__0"
    // InternalBurst.g:621:1: rule__RuleImport__Group__0 : rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 ;
    public final void rule__RuleImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:625:1: ( rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 )
            // InternalBurst.g:626:2: rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RuleImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__0"


    // $ANTLR start "rule__RuleImport__Group__0__Impl"
    // InternalBurst.g:633:1: rule__RuleImport__Group__0__Impl : ( () ) ;
    public final void rule__RuleImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:637:1: ( ( () ) )
            // InternalBurst.g:638:1: ( () )
            {
            // InternalBurst.g:638:1: ( () )
            // InternalBurst.g:639:2: ()
            {
             before(grammarAccess.getRuleImportAccess().getImportAction_0()); 
            // InternalBurst.g:640:2: ()
            // InternalBurst.g:640:3: 
            {
            }

             after(grammarAccess.getRuleImportAccess().getImportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__0__Impl"


    // $ANTLR start "rule__RuleImport__Group__1"
    // InternalBurst.g:648:1: rule__RuleImport__Group__1 : rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 ;
    public final void rule__RuleImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:652:1: ( rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 )
            // InternalBurst.g:653:2: rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RuleImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__1"


    // $ANTLR start "rule__RuleImport__Group__1__Impl"
    // InternalBurst.g:660:1: rule__RuleImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__RuleImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:664:1: ( ( 'import' ) )
            // InternalBurst.g:665:1: ( 'import' )
            {
            // InternalBurst.g:665:1: ( 'import' )
            // InternalBurst.g:666:2: 'import'
            {
             before(grammarAccess.getRuleImportAccess().getImportKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRuleImportAccess().getImportKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__1__Impl"


    // $ANTLR start "rule__RuleImport__Group__2"
    // InternalBurst.g:675:1: rule__RuleImport__Group__2 : rule__RuleImport__Group__2__Impl ;
    public final void rule__RuleImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:679:1: ( rule__RuleImport__Group__2__Impl )
            // InternalBurst.g:680:2: rule__RuleImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__2"


    // $ANTLR start "rule__RuleImport__Group__2__Impl"
    // InternalBurst.g:686:1: rule__RuleImport__Group__2__Impl : ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__RuleImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:690:1: ( ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:691:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:691:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:692:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getRuleImportAccess().getImportedNamespaceAssignment_2()); 
            // InternalBurst.g:693:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:693:3: rule__RuleImport__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleImport__ImportedNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleImportAccess().getImportedNamespaceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__Group__2__Impl"


    // $ANTLR start "rule__RulePackage__Group__0"
    // InternalBurst.g:702:1: rule__RulePackage__Group__0 : rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 ;
    public final void rule__RulePackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:706:1: ( rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 )
            // InternalBurst.g:707:2: rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RulePackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__0"


    // $ANTLR start "rule__RulePackage__Group__0__Impl"
    // InternalBurst.g:714:1: rule__RulePackage__Group__0__Impl : ( () ) ;
    public final void rule__RulePackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:718:1: ( ( () ) )
            // InternalBurst.g:719:1: ( () )
            {
            // InternalBurst.g:719:1: ( () )
            // InternalBurst.g:720:2: ()
            {
             before(grammarAccess.getRulePackageAccess().getPackageAction_0()); 
            // InternalBurst.g:721:2: ()
            // InternalBurst.g:721:3: 
            {
            }

             after(grammarAccess.getRulePackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__0__Impl"


    // $ANTLR start "rule__RulePackage__Group__1"
    // InternalBurst.g:729:1: rule__RulePackage__Group__1 : rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 ;
    public final void rule__RulePackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:733:1: ( rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 )
            // InternalBurst.g:734:2: rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RulePackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__1"


    // $ANTLR start "rule__RulePackage__Group__1__Impl"
    // InternalBurst.g:741:1: rule__RulePackage__Group__1__Impl : ( 'package' ) ;
    public final void rule__RulePackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:745:1: ( ( 'package' ) )
            // InternalBurst.g:746:1: ( 'package' )
            {
            // InternalBurst.g:746:1: ( 'package' )
            // InternalBurst.g:747:2: 'package'
            {
             before(grammarAccess.getRulePackageAccess().getPackageKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRulePackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__1__Impl"


    // $ANTLR start "rule__RulePackage__Group__2"
    // InternalBurst.g:756:1: rule__RulePackage__Group__2 : rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 ;
    public final void rule__RulePackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:760:1: ( rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 )
            // InternalBurst.g:761:2: rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RulePackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__2"


    // $ANTLR start "rule__RulePackage__Group__2__Impl"
    // InternalBurst.g:768:1: rule__RulePackage__Group__2__Impl : ( ( rule__RulePackage__NameAssignment_2 ) ) ;
    public final void rule__RulePackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:772:1: ( ( ( rule__RulePackage__NameAssignment_2 ) ) )
            // InternalBurst.g:773:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            {
            // InternalBurst.g:773:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            // InternalBurst.g:774:2: ( rule__RulePackage__NameAssignment_2 )
            {
             before(grammarAccess.getRulePackageAccess().getNameAssignment_2()); 
            // InternalBurst.g:775:2: ( rule__RulePackage__NameAssignment_2 )
            // InternalBurst.g:775:3: rule__RulePackage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRulePackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__2__Impl"


    // $ANTLR start "rule__RulePackage__Group__3"
    // InternalBurst.g:783:1: rule__RulePackage__Group__3 : rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 ;
    public final void rule__RulePackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:787:1: ( rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 )
            // InternalBurst.g:788:2: rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RulePackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__3"


    // $ANTLR start "rule__RulePackage__Group__3__Impl"
    // InternalBurst.g:795:1: rule__RulePackage__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RulePackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:799:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:800:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:800:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:801:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3()); 
            // InternalBurst.g:802:2: ( RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ENDLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:802:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__3__Impl"


    // $ANTLR start "rule__RulePackage__Group__4"
    // InternalBurst.g:810:1: rule__RulePackage__Group__4 : rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 ;
    public final void rule__RulePackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:814:1: ( rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 )
            // InternalBurst.g:815:2: rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__RulePackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__4"


    // $ANTLR start "rule__RulePackage__Group__4__Impl"
    // InternalBurst.g:822:1: rule__RulePackage__Group__4__Impl : ( '{' ) ;
    public final void rule__RulePackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:826:1: ( ( '{' ) )
            // InternalBurst.g:827:1: ( '{' )
            {
            // InternalBurst.g:827:1: ( '{' )
            // InternalBurst.g:828:2: '{'
            {
             before(grammarAccess.getRulePackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRulePackageAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__4__Impl"


    // $ANTLR start "rule__RulePackage__Group__5"
    // InternalBurst.g:837:1: rule__RulePackage__Group__5 : rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 ;
    public final void rule__RulePackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:841:1: ( rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 )
            // InternalBurst.g:842:2: rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RulePackage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__5"


    // $ANTLR start "rule__RulePackage__Group__5__Impl"
    // InternalBurst.g:849:1: rule__RulePackage__Group__5__Impl : ( ( rule__RulePackage__ElementsAssignment_5 )* ) ;
    public final void rule__RulePackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:853:1: ( ( ( rule__RulePackage__ElementsAssignment_5 )* ) )
            // InternalBurst.g:854:1: ( ( rule__RulePackage__ElementsAssignment_5 )* )
            {
            // InternalBurst.g:854:1: ( ( rule__RulePackage__ElementsAssignment_5 )* )
            // InternalBurst.g:855:2: ( rule__RulePackage__ElementsAssignment_5 )*
            {
             before(grammarAccess.getRulePackageAccess().getElementsAssignment_5()); 
            // InternalBurst.g:856:2: ( rule__RulePackage__ElementsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ENDLINE||LA9_0==18||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:856:3: rule__RulePackage__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RulePackage__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRulePackageAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__5__Impl"


    // $ANTLR start "rule__RulePackage__Group__6"
    // InternalBurst.g:864:1: rule__RulePackage__Group__6 : rule__RulePackage__Group__6__Impl ;
    public final void rule__RulePackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:868:1: ( rule__RulePackage__Group__6__Impl )
            // InternalBurst.g:869:2: rule__RulePackage__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__6"


    // $ANTLR start "rule__RulePackage__Group__6__Impl"
    // InternalBurst.g:875:1: rule__RulePackage__Group__6__Impl : ( '}' ) ;
    public final void rule__RulePackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:879:1: ( ( '}' ) )
            // InternalBurst.g:880:1: ( '}' )
            {
            // InternalBurst.g:880:1: ( '}' )
            // InternalBurst.g:881:2: '}'
            {
             before(grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__Group__6__Impl"


    // $ANTLR start "rule__RuleConcern__Group__0"
    // InternalBurst.g:891:1: rule__RuleConcern__Group__0 : rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 ;
    public final void rule__RuleConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:895:1: ( rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 )
            // InternalBurst.g:896:2: rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RuleConcern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__0"


    // $ANTLR start "rule__RuleConcern__Group__0__Impl"
    // InternalBurst.g:903:1: rule__RuleConcern__Group__0__Impl : ( () ) ;
    public final void rule__RuleConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:907:1: ( ( () ) )
            // InternalBurst.g:908:1: ( () )
            {
            // InternalBurst.g:908:1: ( () )
            // InternalBurst.g:909:2: ()
            {
             before(grammarAccess.getRuleConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:910:2: ()
            // InternalBurst.g:910:3: 
            {
            }

             after(grammarAccess.getRuleConcernAccess().getConcernAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__0__Impl"


    // $ANTLR start "rule__RuleConcern__Group__1"
    // InternalBurst.g:918:1: rule__RuleConcern__Group__1 : rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 ;
    public final void rule__RuleConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:922:1: ( rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 )
            // InternalBurst.g:923:2: rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RuleConcern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__1"


    // $ANTLR start "rule__RuleConcern__Group__1__Impl"
    // InternalBurst.g:930:1: rule__RuleConcern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__RuleConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:934:1: ( ( 'concern' ) )
            // InternalBurst.g:935:1: ( 'concern' )
            {
            // InternalBurst.g:935:1: ( 'concern' )
            // InternalBurst.g:936:2: 'concern'
            {
             before(grammarAccess.getRuleConcernAccess().getConcernKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getConcernKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__1__Impl"


    // $ANTLR start "rule__RuleConcern__Group__2"
    // InternalBurst.g:945:1: rule__RuleConcern__Group__2 : rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 ;
    public final void rule__RuleConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:949:1: ( rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 )
            // InternalBurst.g:950:2: rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RuleConcern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__2"


    // $ANTLR start "rule__RuleConcern__Group__2__Impl"
    // InternalBurst.g:957:1: rule__RuleConcern__Group__2__Impl : ( ( rule__RuleConcern__NameAssignment_2 ) ) ;
    public final void rule__RuleConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:961:1: ( ( ( rule__RuleConcern__NameAssignment_2 ) ) )
            // InternalBurst.g:962:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            {
            // InternalBurst.g:962:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            // InternalBurst.g:963:2: ( rule__RuleConcern__NameAssignment_2 )
            {
             before(grammarAccess.getRuleConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:964:2: ( rule__RuleConcern__NameAssignment_2 )
            // InternalBurst.g:964:3: rule__RuleConcern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleConcernAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__2__Impl"


    // $ANTLR start "rule__RuleConcern__Group__3"
    // InternalBurst.g:972:1: rule__RuleConcern__Group__3 : rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 ;
    public final void rule__RuleConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:976:1: ( rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 )
            // InternalBurst.g:977:2: rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RuleConcern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__3"


    // $ANTLR start "rule__RuleConcern__Group__3__Impl"
    // InternalBurst.g:984:1: rule__RuleConcern__Group__3__Impl : ( ( rule__RuleConcern__Group_3__0 )? ) ;
    public final void rule__RuleConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:988:1: ( ( ( rule__RuleConcern__Group_3__0 )? ) )
            // InternalBurst.g:989:1: ( ( rule__RuleConcern__Group_3__0 )? )
            {
            // InternalBurst.g:989:1: ( ( rule__RuleConcern__Group_3__0 )? )
            // InternalBurst.g:990:2: ( rule__RuleConcern__Group_3__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_3()); 
            // InternalBurst.g:991:2: ( rule__RuleConcern__Group_3__0 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:991:3: rule__RuleConcern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleConcern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleConcernAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__3__Impl"


    // $ANTLR start "rule__RuleConcern__Group__4"
    // InternalBurst.g:999:1: rule__RuleConcern__Group__4 : rule__RuleConcern__Group__4__Impl ;
    public final void rule__RuleConcern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1003:1: ( rule__RuleConcern__Group__4__Impl )
            // InternalBurst.g:1004:2: rule__RuleConcern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__4"


    // $ANTLR start "rule__RuleConcern__Group__4__Impl"
    // InternalBurst.g:1010:1: rule__RuleConcern__Group__4__Impl : ( ( rule__RuleConcern__Group_4__0 )? ) ;
    public final void rule__RuleConcern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1014:1: ( ( ( rule__RuleConcern__Group_4__0 )? ) )
            // InternalBurst.g:1015:1: ( ( rule__RuleConcern__Group_4__0 )? )
            {
            // InternalBurst.g:1015:1: ( ( rule__RuleConcern__Group_4__0 )? )
            // InternalBurst.g:1016:2: ( rule__RuleConcern__Group_4__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_4()); 
            // InternalBurst.g:1017:2: ( rule__RuleConcern__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBurst.g:1017:3: rule__RuleConcern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleConcern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleConcernAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group__4__Impl"


    // $ANTLR start "rule__RuleConcern__Group_3__0"
    // InternalBurst.g:1026:1: rule__RuleConcern__Group_3__0 : rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 ;
    public final void rule__RuleConcern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1030:1: ( rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 )
            // InternalBurst.g:1031:2: rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RuleConcern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__0"


    // $ANTLR start "rule__RuleConcern__Group_3__0__Impl"
    // InternalBurst.g:1038:1: rule__RuleConcern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1042:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1043:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1043:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1044:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            // InternalBurst.g:1045:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1045:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__0__Impl"


    // $ANTLR start "rule__RuleConcern__Group_3__1"
    // InternalBurst.g:1053:1: rule__RuleConcern__Group_3__1 : rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 ;
    public final void rule__RuleConcern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1057:1: ( rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 )
            // InternalBurst.g:1058:2: rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__RuleConcern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__1"


    // $ANTLR start "rule__RuleConcern__Group_3__1__Impl"
    // InternalBurst.g:1065:1: rule__RuleConcern__Group_3__1__Impl : ( 'extends' ) ;
    public final void rule__RuleConcern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1069:1: ( ( 'extends' ) )
            // InternalBurst.g:1070:1: ( 'extends' )
            {
            // InternalBurst.g:1070:1: ( 'extends' )
            // InternalBurst.g:1071:2: 'extends'
            {
             before(grammarAccess.getRuleConcernAccess().getExtendsKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getExtendsKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__1__Impl"


    // $ANTLR start "rule__RuleConcern__Group_3__2"
    // InternalBurst.g:1080:1: rule__RuleConcern__Group_3__2 : rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 ;
    public final void rule__RuleConcern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1084:1: ( rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 )
            // InternalBurst.g:1085:2: rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__RuleConcern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__2"


    // $ANTLR start "rule__RuleConcern__Group_3__2__Impl"
    // InternalBurst.g:1092:1: rule__RuleConcern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1096:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1097:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1097:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1098:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            // InternalBurst.g:1099:2: ( RULE_ENDLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ENDLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1099:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__2__Impl"


    // $ANTLR start "rule__RuleConcern__Group_3__3"
    // InternalBurst.g:1107:1: rule__RuleConcern__Group_3__3 : rule__RuleConcern__Group_3__3__Impl ;
    public final void rule__RuleConcern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1111:1: ( rule__RuleConcern__Group_3__3__Impl )
            // InternalBurst.g:1112:2: rule__RuleConcern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__3"


    // $ANTLR start "rule__RuleConcern__Group_3__3__Impl"
    // InternalBurst.g:1118:1: rule__RuleConcern__Group_3__3__Impl : ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) ;
    public final void rule__RuleConcern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1122:1: ( ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) )
            // InternalBurst.g:1123:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            {
            // InternalBurst.g:1123:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            // InternalBurst.g:1124:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeAssignment_3_3()); 
            // InternalBurst.g:1125:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            // InternalBurst.g:1125:3: rule__RuleConcern__SupertypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__SupertypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleConcernAccess().getSupertypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_3__3__Impl"


    // $ANTLR start "rule__RuleConcern__Group_4__0"
    // InternalBurst.g:1134:1: rule__RuleConcern__Group_4__0 : rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 ;
    public final void rule__RuleConcern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1138:1: ( rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 )
            // InternalBurst.g:1139:2: rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__RuleConcern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__0"


    // $ANTLR start "rule__RuleConcern__Group_4__0__Impl"
    // InternalBurst.g:1146:1: rule__RuleConcern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__RuleConcern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1150:1: ( ( '{' ) )
            // InternalBurst.g:1151:1: ( '{' )
            {
            // InternalBurst.g:1151:1: ( '{' )
            // InternalBurst.g:1152:2: '{'
            {
             before(grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__0__Impl"


    // $ANTLR start "rule__RuleConcern__Group_4__1"
    // InternalBurst.g:1161:1: rule__RuleConcern__Group_4__1 : rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 ;
    public final void rule__RuleConcern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1165:1: ( rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 )
            // InternalBurst.g:1166:2: rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__RuleConcern__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__1"


    // $ANTLR start "rule__RuleConcern__Group_4__1__Impl"
    // InternalBurst.g:1173:1: rule__RuleConcern__Group_4__1__Impl : ( ( rule__RuleConcern__ElementsAssignment_4_1 )* ) ;
    public final void rule__RuleConcern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1177:1: ( ( ( rule__RuleConcern__ElementsAssignment_4_1 )* ) )
            // InternalBurst.g:1178:1: ( ( rule__RuleConcern__ElementsAssignment_4_1 )* )
            {
            // InternalBurst.g:1178:1: ( ( rule__RuleConcern__ElementsAssignment_4_1 )* )
            // InternalBurst.g:1179:2: ( rule__RuleConcern__ElementsAssignment_4_1 )*
            {
             before(grammarAccess.getRuleConcernAccess().getElementsAssignment_4_1()); 
            // InternalBurst.g:1180:2: ( rule__RuleConcern__ElementsAssignment_4_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ENDLINE && LA14_0<=RULE_ID)||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1180:3: rule__RuleConcern__ElementsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__RuleConcern__ElementsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getElementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__1__Impl"


    // $ANTLR start "rule__RuleConcern__Group_4__2"
    // InternalBurst.g:1188:1: rule__RuleConcern__Group_4__2 : rule__RuleConcern__Group_4__2__Impl ;
    public final void rule__RuleConcern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1192:1: ( rule__RuleConcern__Group_4__2__Impl )
            // InternalBurst.g:1193:2: rule__RuleConcern__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__2"


    // $ANTLR start "rule__RuleConcern__Group_4__2__Impl"
    // InternalBurst.g:1199:1: rule__RuleConcern__Group_4__2__Impl : ( '}' ) ;
    public final void rule__RuleConcern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1203:1: ( ( '}' ) )
            // InternalBurst.g:1204:1: ( '}' )
            {
            // InternalBurst.g:1204:1: ( '}' )
            // InternalBurst.g:1205:2: '}'
            {
             before(grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__Group_4__2__Impl"


    // $ANTLR start "rule__DeclareMember__Group__0"
    // InternalBurst.g:1215:1: rule__DeclareMember__Group__0 : rule__DeclareMember__Group__0__Impl rule__DeclareMember__Group__1 ;
    public final void rule__DeclareMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1219:1: ( rule__DeclareMember__Group__0__Impl rule__DeclareMember__Group__1 )
            // InternalBurst.g:1220:2: rule__DeclareMember__Group__0__Impl rule__DeclareMember__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DeclareMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclareMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__0"


    // $ANTLR start "rule__DeclareMember__Group__0__Impl"
    // InternalBurst.g:1227:1: rule__DeclareMember__Group__0__Impl : ( () ) ;
    public final void rule__DeclareMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1231:1: ( ( () ) )
            // InternalBurst.g:1232:1: ( () )
            {
            // InternalBurst.g:1232:1: ( () )
            // InternalBurst.g:1233:2: ()
            {
             before(grammarAccess.getDeclareMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:1234:2: ()
            // InternalBurst.g:1234:3: 
            {
            }

             after(grammarAccess.getDeclareMemberAccess().getMemberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__0__Impl"


    // $ANTLR start "rule__DeclareMember__Group__1"
    // InternalBurst.g:1242:1: rule__DeclareMember__Group__1 : rule__DeclareMember__Group__1__Impl rule__DeclareMember__Group__2 ;
    public final void rule__DeclareMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1246:1: ( rule__DeclareMember__Group__1__Impl rule__DeclareMember__Group__2 )
            // InternalBurst.g:1247:2: rule__DeclareMember__Group__1__Impl rule__DeclareMember__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeclareMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclareMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__1"


    // $ANTLR start "rule__DeclareMember__Group__1__Impl"
    // InternalBurst.g:1254:1: rule__DeclareMember__Group__1__Impl : ( ( rule__DeclareMember__ConcernAssignment_1 ) ) ;
    public final void rule__DeclareMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1258:1: ( ( ( rule__DeclareMember__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1259:1: ( ( rule__DeclareMember__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1259:1: ( ( rule__DeclareMember__ConcernAssignment_1 ) )
            // InternalBurst.g:1260:2: ( rule__DeclareMember__ConcernAssignment_1 )
            {
             before(grammarAccess.getDeclareMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1261:2: ( rule__DeclareMember__ConcernAssignment_1 )
            // InternalBurst.g:1261:3: rule__DeclareMember__ConcernAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclareMember__ConcernAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclareMemberAccess().getConcernAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__1__Impl"


    // $ANTLR start "rule__DeclareMember__Group__2"
    // InternalBurst.g:1269:1: rule__DeclareMember__Group__2 : rule__DeclareMember__Group__2__Impl ;
    public final void rule__DeclareMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1273:1: ( rule__DeclareMember__Group__2__Impl )
            // InternalBurst.g:1274:2: rule__DeclareMember__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclareMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__2"


    // $ANTLR start "rule__DeclareMember__Group__2__Impl"
    // InternalBurst.g:1280:1: rule__DeclareMember__Group__2__Impl : ( ( rule__DeclareMember__NameAssignment_2 ) ) ;
    public final void rule__DeclareMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1284:1: ( ( ( rule__DeclareMember__NameAssignment_2 ) ) )
            // InternalBurst.g:1285:1: ( ( rule__DeclareMember__NameAssignment_2 ) )
            {
            // InternalBurst.g:1285:1: ( ( rule__DeclareMember__NameAssignment_2 ) )
            // InternalBurst.g:1286:2: ( rule__DeclareMember__NameAssignment_2 )
            {
             before(grammarAccess.getDeclareMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:1287:2: ( rule__DeclareMember__NameAssignment_2 )
            // InternalBurst.g:1287:3: rule__DeclareMember__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclareMember__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclareMemberAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__Group__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__0"
    // InternalBurst.g:1296:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1300:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:1301:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RuleIntersect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__0"


    // $ANTLR start "rule__RuleIntersect__Group__0__Impl"
    // InternalBurst.g:1308:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1312:1: ( ( () ) )
            // InternalBurst.g:1313:1: ( () )
            {
            // InternalBurst.g:1313:1: ( () )
            // InternalBurst.g:1314:2: ()
            {
             before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1315:2: ()
            // InternalBurst.g:1315:3: 
            {
            }

             after(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__1"
    // InternalBurst.g:1323:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1327:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:1328:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RuleIntersect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__1"


    // $ANTLR start "rule__RuleIntersect__Group__1__Impl"
    // InternalBurst.g:1335:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1339:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:1340:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:1340:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:1341:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            // InternalBurst.g:1342:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:1342:3: rule__RuleIntersect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__2"
    // InternalBurst.g:1350:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1354:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:1355:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__RuleIntersect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__2"


    // $ANTLR start "rule__RuleIntersect__Group__2__Impl"
    // InternalBurst.g:1362:1: rule__RuleIntersect__Group__2__Impl : ( ( rule__RuleIntersect__Group_2__0 )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1366:1: ( ( ( rule__RuleIntersect__Group_2__0 )* ) )
            // InternalBurst.g:1367:1: ( ( rule__RuleIntersect__Group_2__0 )* )
            {
            // InternalBurst.g:1367:1: ( ( rule__RuleIntersect__Group_2__0 )* )
            // InternalBurst.g:1368:2: ( rule__RuleIntersect__Group_2__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_2()); 
            // InternalBurst.g:1369:2: ( rule__RuleIntersect__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ENDLINE && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1369:3: rule__RuleIntersect__Group_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__RuleIntersect__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__3"
    // InternalBurst.g:1377:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1381:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:1382:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__RuleIntersect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__3"


    // $ANTLR start "rule__RuleIntersect__Group__3__Impl"
    // InternalBurst.g:1389:1: rule__RuleIntersect__Group__3__Impl : ( '{' ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1393:1: ( ( '{' ) )
            // InternalBurst.g:1394:1: ( '{' )
            {
            // InternalBurst.g:1394:1: ( '{' )
            // InternalBurst.g:1395:2: '{'
            {
             before(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__4"
    // InternalBurst.g:1404:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1408:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:1409:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__RuleIntersect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__4"


    // $ANTLR start "rule__RuleIntersect__Group__4__Impl"
    // InternalBurst.g:1416:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__LinesAssignment_4 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1420:1: ( ( ( rule__RuleIntersect__LinesAssignment_4 )* ) )
            // InternalBurst.g:1421:1: ( ( rule__RuleIntersect__LinesAssignment_4 )* )
            {
            // InternalBurst.g:1421:1: ( ( rule__RuleIntersect__LinesAssignment_4 )* )
            // InternalBurst.g:1422:2: ( rule__RuleIntersect__LinesAssignment_4 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesAssignment_4()); 
            // InternalBurst.g:1423:2: ( rule__RuleIntersect__LinesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ENDLINE && LA16_0<=RULE_ID)||LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1423:3: rule__RuleIntersect__LinesAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__RuleIntersect__LinesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getLinesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__4__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__5"
    // InternalBurst.g:1431:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1435:1: ( rule__RuleIntersect__Group__5__Impl )
            // InternalBurst.g:1436:2: rule__RuleIntersect__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__5"


    // $ANTLR start "rule__RuleIntersect__Group__5__Impl"
    // InternalBurst.g:1442:1: rule__RuleIntersect__Group__5__Impl : ( '}' ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1446:1: ( ( '}' ) )
            // InternalBurst.g:1447:1: ( '}' )
            {
            // InternalBurst.g:1447:1: ( '}' )
            // InternalBurst.g:1448:2: '}'
            {
             before(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__5__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_2__0"
    // InternalBurst.g:1458:1: rule__RuleIntersect__Group_2__0 : rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1 ;
    public final void rule__RuleIntersect__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1462:1: ( rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1 )
            // InternalBurst.g:1463:2: rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__RuleIntersect__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__0"


    // $ANTLR start "rule__RuleIntersect__Group_2__0__Impl"
    // InternalBurst.g:1470:1: rule__RuleIntersect__Group_2__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1474:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1475:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1475:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1476:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2_0()); 
            // InternalBurst.g:1477:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1477:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_2__1"
    // InternalBurst.g:1485:1: rule__RuleIntersect__Group_2__1 : rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2 ;
    public final void rule__RuleIntersect__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1489:1: ( rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2 )
            // InternalBurst.g:1490:2: rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__RuleIntersect__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__1"


    // $ANTLR start "rule__RuleIntersect__Group_2__1__Impl"
    // InternalBurst.g:1497:1: rule__RuleIntersect__Group_2__1__Impl : ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) ) ;
    public final void rule__RuleIntersect__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1501:1: ( ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) ) )
            // InternalBurst.g:1502:1: ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) )
            {
            // InternalBurst.g:1502:1: ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) )
            // InternalBurst.g:1503:2: ( rule__RuleIntersect__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersAssignment_2_1()); 
            // InternalBurst.g:1504:2: ( rule__RuleIntersect__ParametersAssignment_2_1 )
            // InternalBurst.g:1504:3: rule__RuleIntersect__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_2__2"
    // InternalBurst.g:1512:1: rule__RuleIntersect__Group_2__2 : rule__RuleIntersect__Group_2__2__Impl ;
    public final void rule__RuleIntersect__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1516:1: ( rule__RuleIntersect__Group_2__2__Impl )
            // InternalBurst.g:1517:2: rule__RuleIntersect__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__2"


    // $ANTLR start "rule__RuleIntersect__Group_2__2__Impl"
    // InternalBurst.g:1523:1: rule__RuleIntersect__Group_2__2__Impl : ( ( rule__RuleIntersect__Alternatives_2_2 )? ) ;
    public final void rule__RuleIntersect__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1527:1: ( ( ( rule__RuleIntersect__Alternatives_2_2 )? ) )
            // InternalBurst.g:1528:1: ( ( rule__RuleIntersect__Alternatives_2_2 )? )
            {
            // InternalBurst.g:1528:1: ( ( rule__RuleIntersect__Alternatives_2_2 )? )
            // InternalBurst.g:1529:2: ( rule__RuleIntersect__Alternatives_2_2 )?
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_2_2()); 
            // InternalBurst.g:1530:2: ( rule__RuleIntersect__Alternatives_2_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:1530:3: rule__RuleIntersect__Alternatives_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleIntersect__Alternatives_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleIntersectAccess().getAlternatives_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_2__2__Impl"


    // $ANTLR start "rule__RenamedParameter__Group__0"
    // InternalBurst.g:1539:1: rule__RenamedParameter__Group__0 : rule__RenamedParameter__Group__0__Impl rule__RenamedParameter__Group__1 ;
    public final void rule__RenamedParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1543:1: ( rule__RenamedParameter__Group__0__Impl rule__RenamedParameter__Group__1 )
            // InternalBurst.g:1544:2: rule__RenamedParameter__Group__0__Impl rule__RenamedParameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RenamedParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenamedParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__0"


    // $ANTLR start "rule__RenamedParameter__Group__0__Impl"
    // InternalBurst.g:1551:1: rule__RenamedParameter__Group__0__Impl : ( () ) ;
    public final void rule__RenamedParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1555:1: ( ( () ) )
            // InternalBurst.g:1556:1: ( () )
            {
            // InternalBurst.g:1556:1: ( () )
            // InternalBurst.g:1557:2: ()
            {
             before(grammarAccess.getRenamedParameterAccess().getRenamedParameterAction_0()); 
            // InternalBurst.g:1558:2: ()
            // InternalBurst.g:1558:3: 
            {
            }

             after(grammarAccess.getRenamedParameterAccess().getRenamedParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__0__Impl"


    // $ANTLR start "rule__RenamedParameter__Group__1"
    // InternalBurst.g:1566:1: rule__RenamedParameter__Group__1 : rule__RenamedParameter__Group__1__Impl rule__RenamedParameter__Group__2 ;
    public final void rule__RenamedParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1570:1: ( rule__RenamedParameter__Group__1__Impl rule__RenamedParameter__Group__2 )
            // InternalBurst.g:1571:2: rule__RenamedParameter__Group__1__Impl rule__RenamedParameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RenamedParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenamedParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__1"


    // $ANTLR start "rule__RenamedParameter__Group__1__Impl"
    // InternalBurst.g:1578:1: rule__RenamedParameter__Group__1__Impl : ( ( rule__RenamedParameter__ConcernAssignment_1 ) ) ;
    public final void rule__RenamedParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1582:1: ( ( ( rule__RenamedParameter__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1583:1: ( ( rule__RenamedParameter__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1583:1: ( ( rule__RenamedParameter__ConcernAssignment_1 ) )
            // InternalBurst.g:1584:2: ( rule__RenamedParameter__ConcernAssignment_1 )
            {
             before(grammarAccess.getRenamedParameterAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1585:2: ( rule__RenamedParameter__ConcernAssignment_1 )
            // InternalBurst.g:1585:3: rule__RenamedParameter__ConcernAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameter__ConcernAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenamedParameterAccess().getConcernAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__1__Impl"


    // $ANTLR start "rule__RenamedParameter__Group__2"
    // InternalBurst.g:1593:1: rule__RenamedParameter__Group__2 : rule__RenamedParameter__Group__2__Impl ;
    public final void rule__RenamedParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1597:1: ( rule__RenamedParameter__Group__2__Impl )
            // InternalBurst.g:1598:2: rule__RenamedParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__2"


    // $ANTLR start "rule__RenamedParameter__Group__2__Impl"
    // InternalBurst.g:1604:1: rule__RenamedParameter__Group__2__Impl : ( ( rule__RenamedParameter__NameAssignment_2 ) ) ;
    public final void rule__RenamedParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1608:1: ( ( ( rule__RenamedParameter__NameAssignment_2 ) ) )
            // InternalBurst.g:1609:1: ( ( rule__RenamedParameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:1609:1: ( ( rule__RenamedParameter__NameAssignment_2 ) )
            // InternalBurst.g:1610:2: ( rule__RenamedParameter__NameAssignment_2 )
            {
             before(grammarAccess.getRenamedParameterAccess().getNameAssignment_2()); 
            // InternalBurst.g:1611:2: ( rule__RenamedParameter__NameAssignment_2 )
            // InternalBurst.g:1611:3: rule__RenamedParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenamedParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalBurst.g:1620:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1624:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:1625:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalBurst.g:1632:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1636:1: ( ( () ) )
            // InternalBurst.g:1637:1: ( () )
            {
            // InternalBurst.g:1637:1: ( () )
            // InternalBurst.g:1638:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalBurst.g:1639:2: ()
            // InternalBurst.g:1639:3: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalBurst.g:1647:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1651:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBurst.g:1652:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalBurst.g:1659:1: rule__Line__Group__1__Impl : ( ( rule__Line__CallsAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1663:1: ( ( ( rule__Line__CallsAssignment_1 ) ) )
            // InternalBurst.g:1664:1: ( ( rule__Line__CallsAssignment_1 ) )
            {
            // InternalBurst.g:1664:1: ( ( rule__Line__CallsAssignment_1 ) )
            // InternalBurst.g:1665:2: ( rule__Line__CallsAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_1()); 
            // InternalBurst.g:1666:2: ( rule__Line__CallsAssignment_1 )
            // InternalBurst.g:1666:3: rule__Line__CallsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__CallsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getCallsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // InternalBurst.g:1674:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1678:1: ( rule__Line__Group__2__Impl )
            // InternalBurst.g:1679:2: rule__Line__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalBurst.g:1685:1: rule__Line__Group__2__Impl : ( ( rule__Line__CallsAssignment_2 )* ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1689:1: ( ( ( rule__Line__CallsAssignment_2 )* ) )
            // InternalBurst.g:1690:1: ( ( rule__Line__CallsAssignment_2 )* )
            {
            // InternalBurst.g:1690:1: ( ( rule__Line__CallsAssignment_2 )* )
            // InternalBurst.g:1691:2: ( rule__Line__CallsAssignment_2 )*
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_2()); 
            // InternalBurst.g:1692:2: ( rule__Line__CallsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }
                else if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1692:3: rule__Line__CallsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Line__CallsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getCallsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Toto__Group__0"
    // InternalBurst.g:1701:1: rule__Toto__Group__0 : rule__Toto__Group__0__Impl rule__Toto__Group__1 ;
    public final void rule__Toto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1705:1: ( rule__Toto__Group__0__Impl rule__Toto__Group__1 )
            // InternalBurst.g:1706:2: rule__Toto__Group__0__Impl rule__Toto__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Toto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Toto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toto__Group__0"


    // $ANTLR start "rule__Toto__Group__0__Impl"
    // InternalBurst.g:1713:1: rule__Toto__Group__0__Impl : ( () ) ;
    public final void rule__Toto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1717:1: ( ( () ) )
            // InternalBurst.g:1718:1: ( () )
            {
            // InternalBurst.g:1718:1: ( () )
            // InternalBurst.g:1719:2: ()
            {
             before(grammarAccess.getTotoAccess().getTotoAction_0()); 
            // InternalBurst.g:1720:2: ()
            // InternalBurst.g:1720:3: 
            {
            }

             after(grammarAccess.getTotoAccess().getTotoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toto__Group__0__Impl"


    // $ANTLR start "rule__Toto__Group__1"
    // InternalBurst.g:1728:1: rule__Toto__Group__1 : rule__Toto__Group__1__Impl ;
    public final void rule__Toto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1732:1: ( rule__Toto__Group__1__Impl )
            // InternalBurst.g:1733:2: rule__Toto__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Toto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toto__Group__1"


    // $ANTLR start "rule__Toto__Group__1__Impl"
    // InternalBurst.g:1739:1: rule__Toto__Group__1__Impl : ( ( rule__Toto__NameAssignment_1 ) ) ;
    public final void rule__Toto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1743:1: ( ( ( rule__Toto__NameAssignment_1 ) ) )
            // InternalBurst.g:1744:1: ( ( rule__Toto__NameAssignment_1 ) )
            {
            // InternalBurst.g:1744:1: ( ( rule__Toto__NameAssignment_1 ) )
            // InternalBurst.g:1745:2: ( rule__Toto__NameAssignment_1 )
            {
             before(grammarAccess.getTotoAccess().getNameAssignment_1()); 
            // InternalBurst.g:1746:2: ( rule__Toto__NameAssignment_1 )
            // InternalBurst.g:1746:3: rule__Toto__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Toto__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTotoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toto__Group__1__Impl"


    // $ANTLR start "rule__RenamedParameterCall__Group__0"
    // InternalBurst.g:1755:1: rule__RenamedParameterCall__Group__0 : rule__RenamedParameterCall__Group__0__Impl rule__RenamedParameterCall__Group__1 ;
    public final void rule__RenamedParameterCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1759:1: ( rule__RenamedParameterCall__Group__0__Impl rule__RenamedParameterCall__Group__1 )
            // InternalBurst.g:1760:2: rule__RenamedParameterCall__Group__0__Impl rule__RenamedParameterCall__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RenamedParameterCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenamedParameterCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameterCall__Group__0"


    // $ANTLR start "rule__RenamedParameterCall__Group__0__Impl"
    // InternalBurst.g:1767:1: rule__RenamedParameterCall__Group__0__Impl : ( () ) ;
    public final void rule__RenamedParameterCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1771:1: ( ( () ) )
            // InternalBurst.g:1772:1: ( () )
            {
            // InternalBurst.g:1772:1: ( () )
            // InternalBurst.g:1773:2: ()
            {
             before(grammarAccess.getRenamedParameterCallAccess().getRenamedParameterCallAction_0()); 
            // InternalBurst.g:1774:2: ()
            // InternalBurst.g:1774:3: 
            {
            }

             after(grammarAccess.getRenamedParameterCallAccess().getRenamedParameterCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameterCall__Group__0__Impl"


    // $ANTLR start "rule__RenamedParameterCall__Group__1"
    // InternalBurst.g:1782:1: rule__RenamedParameterCall__Group__1 : rule__RenamedParameterCall__Group__1__Impl ;
    public final void rule__RenamedParameterCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1786:1: ( rule__RenamedParameterCall__Group__1__Impl )
            // InternalBurst.g:1787:2: rule__RenamedParameterCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameterCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameterCall__Group__1"


    // $ANTLR start "rule__RenamedParameterCall__Group__1__Impl"
    // InternalBurst.g:1793:1: rule__RenamedParameterCall__Group__1__Impl : ( ( rule__RenamedParameterCall__NameAssignment_1 ) ) ;
    public final void rule__RenamedParameterCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1797:1: ( ( ( rule__RenamedParameterCall__NameAssignment_1 ) ) )
            // InternalBurst.g:1798:1: ( ( rule__RenamedParameterCall__NameAssignment_1 ) )
            {
            // InternalBurst.g:1798:1: ( ( rule__RenamedParameterCall__NameAssignment_1 ) )
            // InternalBurst.g:1799:2: ( rule__RenamedParameterCall__NameAssignment_1 )
            {
             before(grammarAccess.getRenamedParameterCallAccess().getNameAssignment_1()); 
            // InternalBurst.g:1800:2: ( rule__RenamedParameterCall__NameAssignment_1 )
            // InternalBurst.g:1800:3: rule__RenamedParameterCall__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenamedParameterCall__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenamedParameterCallAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameterCall__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:1809:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1813:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:1814:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalBurst.g:1821:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1825:1: ( ( RULE_ID ) )
            // InternalBurst.g:1826:1: ( RULE_ID )
            {
            // InternalBurst.g:1826:1: ( RULE_ID )
            // InternalBurst.g:1827:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBurst.g:1836:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1840:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:1841:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalBurst.g:1847:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1851:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:1852:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:1852:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:1853:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:1854:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1854:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBurst.g:1863:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1867:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:1868:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalBurst.g:1875:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1879:1: ( ( '.' ) )
            // InternalBurst.g:1880:1: ( '.' )
            {
            // InternalBurst.g:1880:1: ( '.' )
            // InternalBurst.g:1881:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBurst.g:1890:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1894:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:1895:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalBurst.g:1901:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1905:1: ( ( RULE_ID ) )
            // InternalBurst.g:1906:1: ( RULE_ID )
            {
            // InternalBurst.g:1906:1: ( RULE_ID )
            // InternalBurst.g:1907:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__File__ElementsAssignment"
    // InternalBurst.g:1917:1: rule__File__ElementsAssignment : ( ruleRuleFileElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1921:1: ( ( ruleRuleFileElement ) )
            // InternalBurst.g:1922:2: ( ruleRuleFileElement )
            {
            // InternalBurst.g:1922:2: ( ruleRuleFileElement )
            // InternalBurst.g:1923:3: ruleRuleFileElement
            {
             before(grammarAccess.getFileAccess().getElementsRuleFileElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleFileElement();

            state._fsp--;

             after(grammarAccess.getFileAccess().getElementsRuleFileElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ElementsAssignment"


    // $ANTLR start "rule__RuleImport__ImportedNamespaceAssignment_2"
    // InternalBurst.g:1932:1: rule__RuleImport__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RuleImport__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1936:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1937:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1937:2: ( ruleQualifiedName )
            // InternalBurst.g:1938:3: ruleQualifiedName
            {
             before(grammarAccess.getRuleImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleImport__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__RulePackage__NameAssignment_2"
    // InternalBurst.g:1947:1: rule__RulePackage__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RulePackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1951:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1952:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1952:2: ( ruleQualifiedName )
            // InternalBurst.g:1953:3: ruleQualifiedName
            {
             before(grammarAccess.getRulePackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRulePackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__NameAssignment_2"


    // $ANTLR start "rule__RulePackage__ElementsAssignment_5"
    // InternalBurst.g:1962:1: rule__RulePackage__ElementsAssignment_5 : ( rulePackageElement ) ;
    public final void rule__RulePackage__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1966:1: ( ( rulePackageElement ) )
            // InternalBurst.g:1967:2: ( rulePackageElement )
            {
            // InternalBurst.g:1967:2: ( rulePackageElement )
            // InternalBurst.g:1968:3: rulePackageElement
            {
             before(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePackageElement();

            state._fsp--;

             after(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulePackage__ElementsAssignment_5"


    // $ANTLR start "rule__RuleConcern__NameAssignment_2"
    // InternalBurst.g:1977:1: rule__RuleConcern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleConcern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1981:1: ( ( RULE_ID ) )
            // InternalBurst.g:1982:2: ( RULE_ID )
            {
            // InternalBurst.g:1982:2: ( RULE_ID )
            // InternalBurst.g:1983:3: RULE_ID
            {
             before(grammarAccess.getRuleConcernAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__NameAssignment_2"


    // $ANTLR start "rule__RuleConcern__SupertypeAssignment_3_3"
    // InternalBurst.g:1992:1: rule__RuleConcern__SupertypeAssignment_3_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RuleConcern__SupertypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1996:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1997:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1997:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1998:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0()); 
            // InternalBurst.g:1999:3: ( ruleQualifiedName )
            // InternalBurst.g:2000:4: ruleQualifiedName
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_3_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__SupertypeAssignment_3_3"


    // $ANTLR start "rule__RuleConcern__ElementsAssignment_4_1"
    // InternalBurst.g:2011:1: rule__RuleConcern__ElementsAssignment_4_1 : ( ruleConcernElement ) ;
    public final void rule__RuleConcern__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2015:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:2016:2: ( ruleConcernElement )
            {
            // InternalBurst.g:2016:2: ( ruleConcernElement )
            // InternalBurst.g:2017:3: ruleConcernElement
            {
             before(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;

             after(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleConcern__ElementsAssignment_4_1"


    // $ANTLR start "rule__DeclareMember__ConcernAssignment_1"
    // InternalBurst.g:2026:1: rule__DeclareMember__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DeclareMember__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2030:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2031:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2031:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2032:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDeclareMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:2033:3: ( ruleQualifiedName )
            // InternalBurst.g:2034:4: ruleQualifiedName
            {
             before(grammarAccess.getDeclareMemberAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDeclareMemberAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclareMemberAccess().getConcernConcernCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__ConcernAssignment_1"


    // $ANTLR start "rule__DeclareMember__NameAssignment_2"
    // InternalBurst.g:2045:1: rule__DeclareMember__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeclareMember__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2049:1: ( ( RULE_ID ) )
            // InternalBurst.g:2050:2: ( RULE_ID )
            {
            // InternalBurst.g:2050:2: ( RULE_ID )
            // InternalBurst.g:2051:3: RULE_ID
            {
             before(grammarAccess.getDeclareMemberAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclareMemberAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareMember__NameAssignment_2"


    // $ANTLR start "rule__RuleIntersect__NameAssignment_1"
    // InternalBurst.g:2060:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2064:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:2065:2: ( ( 'when' ) )
            {
            // InternalBurst.g:2065:2: ( ( 'when' ) )
            // InternalBurst.g:2066:3: ( 'when' )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:2067:3: ( 'when' )
            // InternalBurst.g:2068:4: 'when'
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 

            }

             after(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__NameAssignment_1"


    // $ANTLR start "rule__RuleIntersect__ParametersAssignment_2_1"
    // InternalBurst.g:2079:1: rule__RuleIntersect__ParametersAssignment_2_1 : ( ruleDeclareParameter ) ;
    public final void rule__RuleIntersect__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2083:1: ( ( ruleDeclareParameter ) )
            // InternalBurst.g:2084:2: ( ruleDeclareParameter )
            {
            // InternalBurst.g:2084:2: ( ruleDeclareParameter )
            // InternalBurst.g:2085:3: ruleDeclareParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersDeclareParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclareParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParametersDeclareParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__ParametersAssignment_2_1"


    // $ANTLR start "rule__RuleIntersect__LinesAssignment_4"
    // InternalBurst.g:2094:1: rule__RuleIntersect__LinesAssignment_4 : ( ruleIntersectionElement ) ;
    public final void rule__RuleIntersect__LinesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2098:1: ( ( ruleIntersectionElement ) )
            // InternalBurst.g:2099:2: ( ruleIntersectionElement )
            {
            // InternalBurst.g:2099:2: ( ruleIntersectionElement )
            // InternalBurst.g:2100:3: ruleIntersectionElement
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesIntersectionElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersectionElement();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getLinesIntersectionElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__LinesAssignment_4"


    // $ANTLR start "rule__RenamedParameter__ConcernAssignment_1"
    // InternalBurst.g:2109:1: rule__RenamedParameter__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RenamedParameter__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2113:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2114:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2114:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2115:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRenamedParameterAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:2116:3: ( ruleQualifiedName )
            // InternalBurst.g:2117:4: ruleQualifiedName
            {
             before(grammarAccess.getRenamedParameterAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRenamedParameterAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRenamedParameterAccess().getConcernConcernCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__ConcernAssignment_1"


    // $ANTLR start "rule__RenamedParameter__NameAssignment_2"
    // InternalBurst.g:2128:1: rule__RenamedParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RenamedParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2132:1: ( ( RULE_ID ) )
            // InternalBurst.g:2133:2: ( RULE_ID )
            {
            // InternalBurst.g:2133:2: ( RULE_ID )
            // InternalBurst.g:2134:3: RULE_ID
            {
             before(grammarAccess.getRenamedParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenamedParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameter__NameAssignment_2"


    // $ANTLR start "rule__Line__CallsAssignment_1"
    // InternalBurst.g:2143:1: rule__Line__CallsAssignment_1 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2147:1: ( ( ruleCall ) )
            // InternalBurst.g:2148:2: ( ruleCall )
            {
            // InternalBurst.g:2148:2: ( ruleCall )
            // InternalBurst.g:2149:3: ruleCall
            {
             before(grammarAccess.getLineAccess().getCallsCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCallsCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CallsAssignment_1"


    // $ANTLR start "rule__Line__CallsAssignment_2"
    // InternalBurst.g:2158:1: rule__Line__CallsAssignment_2 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2162:1: ( ( ruleCall ) )
            // InternalBurst.g:2163:2: ( ruleCall )
            {
            // InternalBurst.g:2163:2: ( ruleCall )
            // InternalBurst.g:2164:3: ruleCall
            {
             before(grammarAccess.getLineAccess().getCallsCallParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCallsCallParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CallsAssignment_2"


    // $ANTLR start "rule__Toto__NameAssignment_1"
    // InternalBurst.g:2173:1: rule__Toto__NameAssignment_1 : ( ( 'toto' ) ) ;
    public final void rule__Toto__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2177:1: ( ( ( 'toto' ) ) )
            // InternalBurst.g:2178:2: ( ( 'toto' ) )
            {
            // InternalBurst.g:2178:2: ( ( 'toto' ) )
            // InternalBurst.g:2179:3: ( 'toto' )
            {
             before(grammarAccess.getTotoAccess().getNameTotoKeyword_1_0()); 
            // InternalBurst.g:2180:3: ( 'toto' )
            // InternalBurst.g:2181:4: 'toto'
            {
             before(grammarAccess.getTotoAccess().getNameTotoKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTotoAccess().getNameTotoKeyword_1_0()); 

            }

             after(grammarAccess.getTotoAccess().getNameTotoKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toto__NameAssignment_1"


    // $ANTLR start "rule__RenamedParameterCall__NameAssignment_1"
    // InternalBurst.g:2192:1: rule__RenamedParameterCall__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RenamedParameterCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2196:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2197:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2197:2: ( ( RULE_ID ) )
            // InternalBurst.g:2198:3: ( RULE_ID )
            {
             before(grammarAccess.getRenamedParameterCallAccess().getNameRenamedParameterCrossReference_1_0()); 
            // InternalBurst.g:2199:3: ( RULE_ID )
            // InternalBurst.g:2200:4: RULE_ID
            {
             before(grammarAccess.getRenamedParameterCallAccess().getNameRenamedParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenamedParameterCallAccess().getNameRenamedParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRenamedParameterCallAccess().getNameRenamedParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenamedParameterCall__NameAssignment_1"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\25\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\13\uffff\3\3\1\2\1\uffff\1\3",
            "\1\1\14\uffff\2\3\1\2\1\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "991:2: ( rule__RuleConcern__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000260010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000240012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000220030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000420030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100002L});

}