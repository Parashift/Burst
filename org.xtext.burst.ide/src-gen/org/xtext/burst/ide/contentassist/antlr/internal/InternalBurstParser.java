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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ENDLINE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'import'", "'package'", "'{'", "'}'", "'concern'", "'extends'", "'with'", "'.'", "'when'"
    };
    public static final int RULE_ENDLINE=5;
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
    public static final int RULE_ID=4;
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


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:228:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:229:1: ( ruleMember EOF )
            // InternalBurst.g:230:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalBurst.g:237:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:241:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:242:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:242:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:243:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalBurst.g:244:3: ( rule__Member__Group__0 )
            // InternalBurst.g:244:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleMember"


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


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:278:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleParameter EOF )
            // InternalBurst.g:280:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalBurst.g:287:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalBurst.g:292:2: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalBurst.g:292:2: ( ( rule__Parameter__Alternatives ) )
            // InternalBurst.g:293:3: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // InternalBurst.g:294:3: ( rule__Parameter__Alternatives )
            // InternalBurst.g:294:4: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamedParameter"
    // InternalBurst.g:303:1: entryRuleNamedParameter : ruleNamedParameter EOF ;
    public final void entryRuleNamedParameter() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleNamedParameter EOF )
            // InternalBurst.g:305:1: ruleNamedParameter EOF
            {
             before(grammarAccess.getNamedParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedParameter();

            state._fsp--;

             after(grammarAccess.getNamedParameterRule()); 
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
    // $ANTLR end "entryRuleNamedParameter"


    // $ANTLR start "ruleNamedParameter"
    // InternalBurst.g:312:1: ruleNamedParameter : ( ( rule__NamedParameter__Group__0 ) ) ;
    public final void ruleNamedParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__NamedParameter__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__NamedParameter__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__NamedParameter__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__NamedParameter__Group__0 )
            {
             before(grammarAccess.getNamedParameterAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__NamedParameter__Group__0 )
            // InternalBurst.g:319:4: rule__NamedParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamedParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleNamedParameter"


    // $ANTLR start "entryRuleStaticParameter"
    // InternalBurst.g:328:1: entryRuleStaticParameter : ruleStaticParameter EOF ;
    public final void entryRuleStaticParameter() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleStaticParameter EOF )
            // InternalBurst.g:330:1: ruleStaticParameter EOF
            {
             before(grammarAccess.getStaticParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticParameter();

            state._fsp--;

             after(grammarAccess.getStaticParameterRule()); 
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
    // $ANTLR end "entryRuleStaticParameter"


    // $ANTLR start "ruleStaticParameter"
    // InternalBurst.g:337:1: ruleStaticParameter : ( ( rule__StaticParameter__Group__0 ) ) ;
    public final void ruleStaticParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__StaticParameter__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__StaticParameter__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__StaticParameter__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__StaticParameter__Group__0 )
            {
             before(grammarAccess.getStaticParameterAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__StaticParameter__Group__0 )
            // InternalBurst.g:344:4: rule__StaticParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StaticParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleStaticParameter"


    // $ANTLR start "entryRuleUsageParameter"
    // InternalBurst.g:353:1: entryRuleUsageParameter : ruleUsageParameter EOF ;
    public final void entryRuleUsageParameter() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleUsageParameter EOF )
            // InternalBurst.g:355:1: ruleUsageParameter EOF
            {
             before(grammarAccess.getUsageParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleUsageParameter();

            state._fsp--;

             after(grammarAccess.getUsageParameterRule()); 
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
    // $ANTLR end "entryRuleUsageParameter"


    // $ANTLR start "ruleUsageParameter"
    // InternalBurst.g:362:1: ruleUsageParameter : ( ( rule__UsageParameter__Group__0 ) ) ;
    public final void ruleUsageParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__UsageParameter__Group__0 ) ) )
            // InternalBurst.g:367:2: ( ( rule__UsageParameter__Group__0 ) )
            {
            // InternalBurst.g:367:2: ( ( rule__UsageParameter__Group__0 ) )
            // InternalBurst.g:368:3: ( rule__UsageParameter__Group__0 )
            {
             before(grammarAccess.getUsageParameterAccess().getGroup()); 
            // InternalBurst.g:369:3: ( rule__UsageParameter__Group__0 )
            // InternalBurst.g:369:4: rule__UsageParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsageParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleUsageParameter"


    // $ANTLR start "entryRuleusage"
    // InternalBurst.g:378:1: entryRuleusage : ruleusage EOF ;
    public final void entryRuleusage() throws RecognitionException {
        try {
            // InternalBurst.g:379:1: ( ruleusage EOF )
            // InternalBurst.g:380:1: ruleusage EOF
            {
             before(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_1);
            ruleusage();

            state._fsp--;

             after(grammarAccess.getUsageRule()); 
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
    // $ANTLR end "entryRuleusage"


    // $ANTLR start "ruleusage"
    // InternalBurst.g:387:1: ruleusage : ( RULE_ID ) ;
    public final void ruleusage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:391:2: ( ( RULE_ID ) )
            // InternalBurst.g:392:2: ( RULE_ID )
            {
            // InternalBurst.g:392:2: ( RULE_ID )
            // InternalBurst.g:393:3: RULE_ID
            {
             before(grammarAccess.getUsageAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsageAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleusage"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:403:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:404:1: ( ruleLine EOF )
            // InternalBurst.g:405:1: ruleLine EOF
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
    // InternalBurst.g:412:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:417:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:417:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:418:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:419:3: ( rule__Line__Group__0 )
            // InternalBurst.g:419:4: rule__Line__Group__0
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
    // InternalBurst.g:428:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:429:1: ( ruleCall EOF )
            // InternalBurst.g:430:1: ruleCall EOF
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
    // InternalBurst.g:437:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalBurst.g:442:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalBurst.g:442:2: ( ( rule__Call__Alternatives ) )
            // InternalBurst.g:443:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalBurst.g:444:3: ( rule__Call__Alternatives )
            // InternalBurst.g:444:4: rule__Call__Alternatives
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


    // $ANTLR start "entryRuleMemberCall"
    // InternalBurst.g:453:1: entryRuleMemberCall : ruleMemberCall EOF ;
    public final void entryRuleMemberCall() throws RecognitionException {
        try {
            // InternalBurst.g:454:1: ( ruleMemberCall EOF )
            // InternalBurst.g:455:1: ruleMemberCall EOF
            {
             before(grammarAccess.getMemberCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberCall();

            state._fsp--;

             after(grammarAccess.getMemberCallRule()); 
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
    // $ANTLR end "entryRuleMemberCall"


    // $ANTLR start "ruleMemberCall"
    // InternalBurst.g:462:1: ruleMemberCall : ( ( rule__MemberCall__Group__0 ) ) ;
    public final void ruleMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:466:2: ( ( ( rule__MemberCall__Group__0 ) ) )
            // InternalBurst.g:467:2: ( ( rule__MemberCall__Group__0 ) )
            {
            // InternalBurst.g:467:2: ( ( rule__MemberCall__Group__0 ) )
            // InternalBurst.g:468:3: ( rule__MemberCall__Group__0 )
            {
             before(grammarAccess.getMemberCallAccess().getGroup()); 
            // InternalBurst.g:469:3: ( rule__MemberCall__Group__0 )
            // InternalBurst.g:469:4: rule__MemberCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberCallAccess().getGroup()); 

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
    // $ANTLR end "ruleMemberCall"


    // $ANTLR start "entryRuleVariableCall"
    // InternalBurst.g:478:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalBurst.g:479:1: ( ruleVariableCall EOF )
            // InternalBurst.g:480:1: ruleVariableCall EOF
            {
             before(grammarAccess.getVariableCallRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableCall();

            state._fsp--;

             after(grammarAccess.getVariableCallRule()); 
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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalBurst.g:487:1: ruleVariableCall : ( ( rule__VariableCall__Group__0 ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:491:2: ( ( ( rule__VariableCall__Group__0 ) ) )
            // InternalBurst.g:492:2: ( ( rule__VariableCall__Group__0 ) )
            {
            // InternalBurst.g:492:2: ( ( rule__VariableCall__Group__0 ) )
            // InternalBurst.g:493:3: ( rule__VariableCall__Group__0 )
            {
             before(grammarAccess.getVariableCallAccess().getGroup()); 
            // InternalBurst.g:494:3: ( rule__VariableCall__Group__0 )
            // InternalBurst.g:494:4: rule__VariableCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableCallAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:503:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:504:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:505:1: ruleQualifiedName EOF
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
    // InternalBurst.g:512:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:516:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:518:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:519:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:519:4: rule__QualifiedName__Group__0
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
    // InternalBurst.g:527:1: rule__RuleFileElement__Alternatives : ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) );
    public final void rule__RuleFileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:531:1: ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) )
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
                    // InternalBurst.g:532:2: ( ruleRuleImport )
                    {
                    // InternalBurst.g:532:2: ( ruleRuleImport )
                    // InternalBurst.g:533:3: ruleRuleImport
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
                    // InternalBurst.g:538:2: ( ruleRulePackage )
                    {
                    // InternalBurst.g:538:2: ( ruleRulePackage )
                    // InternalBurst.g:539:3: ruleRulePackage
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
                    // InternalBurst.g:544:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:544:2: ( RULE_ENDLINE )
                    // InternalBurst.g:545:3: RULE_ENDLINE
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
    // InternalBurst.g:554:1: rule__PackageElement__Alternatives : ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:558:1: ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:559:2: ( ruleRuleConcern )
                    {
                    // InternalBurst.g:559:2: ( ruleRuleConcern )
                    // InternalBurst.g:560:3: ruleRuleConcern
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
                    // InternalBurst.g:565:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:565:2: ( ruleRuleIntersect )
                    // InternalBurst.g:566:3: ruleRuleIntersect
                    {
                     before(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1()); 

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
    // InternalBurst.g:575:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:579:1: ( ( ruleMember ) | ( ruleRuleIntersect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBurst.g:580:2: ( ruleMember )
                    {
                    // InternalBurst.g:580:2: ( ruleMember )
                    // InternalBurst.g:581:3: ruleMember
                    {
                     before(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMember();

                    state._fsp--;

                     after(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:586:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:586:2: ( ruleRuleIntersect )
                    // InternalBurst.g:587:3: ruleRuleIntersect
                    {
                     before(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;

                     after(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 

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


    // $ANTLR start "rule__RuleIntersect__Alternatives_4_1"
    // InternalBurst.g:596:1: rule__RuleIntersect__Alternatives_4_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:600:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:601:2: ( ',' )
                    {
                    // InternalBurst.g:601:2: ( ',' )
                    // InternalBurst.g:602:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:607:2: ( 'and' )
                    {
                    // InternalBurst.g:607:2: ( 'and' )
                    // InternalBurst.g:608:3: 'and'
                    {
                     before(grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1()); 

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
    // $ANTLR end "rule__RuleIntersect__Alternatives_4_1"


    // $ANTLR start "rule__Parameter__Alternatives"
    // InternalBurst.g:617:1: rule__Parameter__Alternatives : ( ( ruleNamedParameter ) | ( ruleStaticParameter ) | ( ruleUsageParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:621:1: ( ( ruleNamedParameter ) | ( ruleStaticParameter ) | ( ruleUsageParameter ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==21) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:622:2: ( ruleNamedParameter )
                    {
                    // InternalBurst.g:622:2: ( ruleNamedParameter )
                    // InternalBurst.g:623:3: ruleNamedParameter
                    {
                     before(grammarAccess.getParameterAccess().getNamedParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getNamedParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:628:2: ( ruleStaticParameter )
                    {
                    // InternalBurst.g:628:2: ( ruleStaticParameter )
                    // InternalBurst.g:629:3: ruleStaticParameter
                    {
                     before(grammarAccess.getParameterAccess().getStaticParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStaticParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getStaticParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:634:2: ( ruleUsageParameter )
                    {
                    // InternalBurst.g:634:2: ( ruleUsageParameter )
                    // InternalBurst.g:635:3: ruleUsageParameter
                    {
                     before(grammarAccess.getParameterAccess().getUsageParameterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUsageParameter();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getUsageParameterParserRuleCall_2()); 

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
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalBurst.g:644:1: rule__Call__Alternatives : ( ( ruleVariableCall ) | ( ruleMemberCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:648:1: ( ( ruleVariableCall ) | ( ruleMemberCall ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_ENDLINE)) ) {
                    alt7=1;
                }
                else if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:649:2: ( ruleVariableCall )
                    {
                    // InternalBurst.g:649:2: ( ruleVariableCall )
                    // InternalBurst.g:650:3: ruleVariableCall
                    {
                     before(grammarAccess.getCallAccess().getVariableCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getVariableCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:655:2: ( ruleMemberCall )
                    {
                    // InternalBurst.g:655:2: ( ruleMemberCall )
                    // InternalBurst.g:656:3: ruleMemberCall
                    {
                     before(grammarAccess.getCallAccess().getMemberCallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMemberCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getMemberCallParserRuleCall_1()); 

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
    // InternalBurst.g:665:1: rule__RuleImport__Group__0 : rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 ;
    public final void rule__RuleImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:669:1: ( rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 )
            // InternalBurst.g:670:2: rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1
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
    // InternalBurst.g:677:1: rule__RuleImport__Group__0__Impl : ( () ) ;
    public final void rule__RuleImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:681:1: ( ( () ) )
            // InternalBurst.g:682:1: ( () )
            {
            // InternalBurst.g:682:1: ( () )
            // InternalBurst.g:683:2: ()
            {
             before(grammarAccess.getRuleImportAccess().getImportAction_0()); 
            // InternalBurst.g:684:2: ()
            // InternalBurst.g:684:3: 
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
    // InternalBurst.g:692:1: rule__RuleImport__Group__1 : rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 ;
    public final void rule__RuleImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:696:1: ( rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 )
            // InternalBurst.g:697:2: rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2
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
    // InternalBurst.g:704:1: rule__RuleImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__RuleImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:708:1: ( ( 'import' ) )
            // InternalBurst.g:709:1: ( 'import' )
            {
            // InternalBurst.g:709:1: ( 'import' )
            // InternalBurst.g:710:2: 'import'
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
    // InternalBurst.g:719:1: rule__RuleImport__Group__2 : rule__RuleImport__Group__2__Impl ;
    public final void rule__RuleImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:723:1: ( rule__RuleImport__Group__2__Impl )
            // InternalBurst.g:724:2: rule__RuleImport__Group__2__Impl
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
    // InternalBurst.g:730:1: rule__RuleImport__Group__2__Impl : ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__RuleImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:734:1: ( ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:735:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:735:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:736:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getRuleImportAccess().getImportedNamespaceAssignment_2()); 
            // InternalBurst.g:737:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:737:3: rule__RuleImport__ImportedNamespaceAssignment_2
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
    // InternalBurst.g:746:1: rule__RulePackage__Group__0 : rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 ;
    public final void rule__RulePackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:750:1: ( rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 )
            // InternalBurst.g:751:2: rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1
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
    // InternalBurst.g:758:1: rule__RulePackage__Group__0__Impl : ( () ) ;
    public final void rule__RulePackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:762:1: ( ( () ) )
            // InternalBurst.g:763:1: ( () )
            {
            // InternalBurst.g:763:1: ( () )
            // InternalBurst.g:764:2: ()
            {
             before(grammarAccess.getRulePackageAccess().getPackageAction_0()); 
            // InternalBurst.g:765:2: ()
            // InternalBurst.g:765:3: 
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
    // InternalBurst.g:773:1: rule__RulePackage__Group__1 : rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 ;
    public final void rule__RulePackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:777:1: ( rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 )
            // InternalBurst.g:778:2: rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2
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
    // InternalBurst.g:785:1: rule__RulePackage__Group__1__Impl : ( 'package' ) ;
    public final void rule__RulePackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:789:1: ( ( 'package' ) )
            // InternalBurst.g:790:1: ( 'package' )
            {
            // InternalBurst.g:790:1: ( 'package' )
            // InternalBurst.g:791:2: 'package'
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
    // InternalBurst.g:800:1: rule__RulePackage__Group__2 : rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 ;
    public final void rule__RulePackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:804:1: ( rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 )
            // InternalBurst.g:805:2: rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3
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
    // InternalBurst.g:812:1: rule__RulePackage__Group__2__Impl : ( ( rule__RulePackage__NameAssignment_2 ) ) ;
    public final void rule__RulePackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:816:1: ( ( ( rule__RulePackage__NameAssignment_2 ) ) )
            // InternalBurst.g:817:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            {
            // InternalBurst.g:817:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            // InternalBurst.g:818:2: ( rule__RulePackage__NameAssignment_2 )
            {
             before(grammarAccess.getRulePackageAccess().getNameAssignment_2()); 
            // InternalBurst.g:819:2: ( rule__RulePackage__NameAssignment_2 )
            // InternalBurst.g:819:3: rule__RulePackage__NameAssignment_2
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
    // InternalBurst.g:827:1: rule__RulePackage__Group__3 : rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 ;
    public final void rule__RulePackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:831:1: ( rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 )
            // InternalBurst.g:832:2: rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4
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
    // InternalBurst.g:839:1: rule__RulePackage__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RulePackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:843:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:844:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:844:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:845:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3()); 
            // InternalBurst.g:846:2: ( RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ENDLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:846:3: RULE_ENDLINE
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
    // InternalBurst.g:854:1: rule__RulePackage__Group__4 : rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 ;
    public final void rule__RulePackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:858:1: ( rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 )
            // InternalBurst.g:859:2: rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5
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
    // InternalBurst.g:866:1: rule__RulePackage__Group__4__Impl : ( '{' ) ;
    public final void rule__RulePackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:870:1: ( ( '{' ) )
            // InternalBurst.g:871:1: ( '{' )
            {
            // InternalBurst.g:871:1: ( '{' )
            // InternalBurst.g:872:2: '{'
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
    // InternalBurst.g:881:1: rule__RulePackage__Group__5 : rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 ;
    public final void rule__RulePackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:885:1: ( rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 )
            // InternalBurst.g:886:2: rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6
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
    // InternalBurst.g:893:1: rule__RulePackage__Group__5__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RulePackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:897:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:898:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:898:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:899:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_5()); 
            // InternalBurst.g:900:2: ( RULE_ENDLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ENDLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:900:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_5()); 

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
    // InternalBurst.g:908:1: rule__RulePackage__Group__6 : rule__RulePackage__Group__6__Impl rule__RulePackage__Group__7 ;
    public final void rule__RulePackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:912:1: ( rule__RulePackage__Group__6__Impl rule__RulePackage__Group__7 )
            // InternalBurst.g:913:2: rule__RulePackage__Group__6__Impl rule__RulePackage__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__RulePackage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__7();

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
    // InternalBurst.g:920:1: rule__RulePackage__Group__6__Impl : ( ( rule__RulePackage__Group_6__0 )* ) ;
    public final void rule__RulePackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:924:1: ( ( ( rule__RulePackage__Group_6__0 )* ) )
            // InternalBurst.g:925:1: ( ( rule__RulePackage__Group_6__0 )* )
            {
            // InternalBurst.g:925:1: ( ( rule__RulePackage__Group_6__0 )* )
            // InternalBurst.g:926:2: ( rule__RulePackage__Group_6__0 )*
            {
             before(grammarAccess.getRulePackageAccess().getGroup_6()); 
            // InternalBurst.g:927:2: ( rule__RulePackage__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:927:3: rule__RulePackage__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RulePackage__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRulePackageAccess().getGroup_6()); 

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


    // $ANTLR start "rule__RulePackage__Group__7"
    // InternalBurst.g:935:1: rule__RulePackage__Group__7 : rule__RulePackage__Group__7__Impl ;
    public final void rule__RulePackage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:939:1: ( rule__RulePackage__Group__7__Impl )
            // InternalBurst.g:940:2: rule__RulePackage__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__Group__7__Impl();

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
    // $ANTLR end "rule__RulePackage__Group__7"


    // $ANTLR start "rule__RulePackage__Group__7__Impl"
    // InternalBurst.g:946:1: rule__RulePackage__Group__7__Impl : ( '}' ) ;
    public final void rule__RulePackage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:950:1: ( ( '}' ) )
            // InternalBurst.g:951:1: ( '}' )
            {
            // InternalBurst.g:951:1: ( '}' )
            // InternalBurst.g:952:2: '}'
            {
             before(grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RulePackage__Group__7__Impl"


    // $ANTLR start "rule__RulePackage__Group_6__0"
    // InternalBurst.g:962:1: rule__RulePackage__Group_6__0 : rule__RulePackage__Group_6__0__Impl rule__RulePackage__Group_6__1 ;
    public final void rule__RulePackage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:966:1: ( rule__RulePackage__Group_6__0__Impl rule__RulePackage__Group_6__1 )
            // InternalBurst.g:967:2: rule__RulePackage__Group_6__0__Impl rule__RulePackage__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__RulePackage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulePackage__Group_6__1();

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
    // $ANTLR end "rule__RulePackage__Group_6__0"


    // $ANTLR start "rule__RulePackage__Group_6__0__Impl"
    // InternalBurst.g:974:1: rule__RulePackage__Group_6__0__Impl : ( ( rule__RulePackage__ElementsAssignment_6_0 ) ) ;
    public final void rule__RulePackage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:978:1: ( ( ( rule__RulePackage__ElementsAssignment_6_0 ) ) )
            // InternalBurst.g:979:1: ( ( rule__RulePackage__ElementsAssignment_6_0 ) )
            {
            // InternalBurst.g:979:1: ( ( rule__RulePackage__ElementsAssignment_6_0 ) )
            // InternalBurst.g:980:2: ( rule__RulePackage__ElementsAssignment_6_0 )
            {
             before(grammarAccess.getRulePackageAccess().getElementsAssignment_6_0()); 
            // InternalBurst.g:981:2: ( rule__RulePackage__ElementsAssignment_6_0 )
            // InternalBurst.g:981:3: rule__RulePackage__ElementsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__ElementsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getRulePackageAccess().getElementsAssignment_6_0()); 

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
    // $ANTLR end "rule__RulePackage__Group_6__0__Impl"


    // $ANTLR start "rule__RulePackage__Group_6__1"
    // InternalBurst.g:989:1: rule__RulePackage__Group_6__1 : rule__RulePackage__Group_6__1__Impl ;
    public final void rule__RulePackage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:993:1: ( rule__RulePackage__Group_6__1__Impl )
            // InternalBurst.g:994:2: rule__RulePackage__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RulePackage__Group_6__1__Impl();

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
    // $ANTLR end "rule__RulePackage__Group_6__1"


    // $ANTLR start "rule__RulePackage__Group_6__1__Impl"
    // InternalBurst.g:1000:1: rule__RulePackage__Group_6__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RulePackage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1004:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1005:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1005:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1006:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_6_1()); 
            // InternalBurst.g:1007:2: ( RULE_ENDLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ENDLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:1007:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_6_1()); 

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
    // $ANTLR end "rule__RulePackage__Group_6__1__Impl"


    // $ANTLR start "rule__RuleConcern__Group__0"
    // InternalBurst.g:1016:1: rule__RuleConcern__Group__0 : rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 ;
    public final void rule__RuleConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1020:1: ( rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 )
            // InternalBurst.g:1021:2: rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:1028:1: rule__RuleConcern__Group__0__Impl : ( () ) ;
    public final void rule__RuleConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1032:1: ( ( () ) )
            // InternalBurst.g:1033:1: ( () )
            {
            // InternalBurst.g:1033:1: ( () )
            // InternalBurst.g:1034:2: ()
            {
             before(grammarAccess.getRuleConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:1035:2: ()
            // InternalBurst.g:1035:3: 
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
    // InternalBurst.g:1043:1: rule__RuleConcern__Group__1 : rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 ;
    public final void rule__RuleConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1047:1: ( rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 )
            // InternalBurst.g:1048:2: rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2
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
    // InternalBurst.g:1055:1: rule__RuleConcern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__RuleConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1059:1: ( ( 'concern' ) )
            // InternalBurst.g:1060:1: ( 'concern' )
            {
            // InternalBurst.g:1060:1: ( 'concern' )
            // InternalBurst.g:1061:2: 'concern'
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
    // InternalBurst.g:1070:1: rule__RuleConcern__Group__2 : rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 ;
    public final void rule__RuleConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1074:1: ( rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 )
            // InternalBurst.g:1075:2: rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:1082:1: rule__RuleConcern__Group__2__Impl : ( ( rule__RuleConcern__NameAssignment_2 ) ) ;
    public final void rule__RuleConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1086:1: ( ( ( rule__RuleConcern__NameAssignment_2 ) ) )
            // InternalBurst.g:1087:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            {
            // InternalBurst.g:1087:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            // InternalBurst.g:1088:2: ( rule__RuleConcern__NameAssignment_2 )
            {
             before(grammarAccess.getRuleConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:1089:2: ( rule__RuleConcern__NameAssignment_2 )
            // InternalBurst.g:1089:3: rule__RuleConcern__NameAssignment_2
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
    // InternalBurst.g:1097:1: rule__RuleConcern__Group__3 : rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 ;
    public final void rule__RuleConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1101:1: ( rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 )
            // InternalBurst.g:1102:2: rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:1109:1: rule__RuleConcern__Group__3__Impl : ( ( rule__RuleConcern__Group_3__0 )? ) ;
    public final void rule__RuleConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1113:1: ( ( ( rule__RuleConcern__Group_3__0 )? ) )
            // InternalBurst.g:1114:1: ( ( rule__RuleConcern__Group_3__0 )? )
            {
            // InternalBurst.g:1114:1: ( ( rule__RuleConcern__Group_3__0 )? )
            // InternalBurst.g:1115:2: ( rule__RuleConcern__Group_3__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_3()); 
            // InternalBurst.g:1116:2: ( rule__RuleConcern__Group_3__0 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalBurst.g:1116:3: rule__RuleConcern__Group_3__0
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
    // InternalBurst.g:1124:1: rule__RuleConcern__Group__4 : rule__RuleConcern__Group__4__Impl ;
    public final void rule__RuleConcern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1128:1: ( rule__RuleConcern__Group__4__Impl )
            // InternalBurst.g:1129:2: rule__RuleConcern__Group__4__Impl
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
    // InternalBurst.g:1135:1: rule__RuleConcern__Group__4__Impl : ( ( rule__RuleConcern__Group_4__0 )? ) ;
    public final void rule__RuleConcern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1139:1: ( ( ( rule__RuleConcern__Group_4__0 )? ) )
            // InternalBurst.g:1140:1: ( ( rule__RuleConcern__Group_4__0 )? )
            {
            // InternalBurst.g:1140:1: ( ( rule__RuleConcern__Group_4__0 )? )
            // InternalBurst.g:1141:2: ( rule__RuleConcern__Group_4__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_4()); 
            // InternalBurst.g:1142:2: ( rule__RuleConcern__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBurst.g:1142:3: rule__RuleConcern__Group_4__0
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
    // InternalBurst.g:1151:1: rule__RuleConcern__Group_3__0 : rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 ;
    public final void rule__RuleConcern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1155:1: ( rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 )
            // InternalBurst.g:1156:2: rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBurst.g:1163:1: rule__RuleConcern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1167:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1168:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1168:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1169:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            // InternalBurst.g:1170:2: ( RULE_ENDLINE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ENDLINE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1170:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBurst.g:1178:1: rule__RuleConcern__Group_3__1 : rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 ;
    public final void rule__RuleConcern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1182:1: ( rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 )
            // InternalBurst.g:1183:2: rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBurst.g:1190:1: rule__RuleConcern__Group_3__1__Impl : ( 'extends' ) ;
    public final void rule__RuleConcern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1194:1: ( ( 'extends' ) )
            // InternalBurst.g:1195:1: ( 'extends' )
            {
            // InternalBurst.g:1195:1: ( 'extends' )
            // InternalBurst.g:1196:2: 'extends'
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
    // InternalBurst.g:1205:1: rule__RuleConcern__Group_3__2 : rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 ;
    public final void rule__RuleConcern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1209:1: ( rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 )
            // InternalBurst.g:1210:2: rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBurst.g:1217:1: rule__RuleConcern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1221:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1222:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1222:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1223:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            // InternalBurst.g:1224:2: ( RULE_ENDLINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ENDLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1224:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBurst.g:1232:1: rule__RuleConcern__Group_3__3 : rule__RuleConcern__Group_3__3__Impl ;
    public final void rule__RuleConcern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1236:1: ( rule__RuleConcern__Group_3__3__Impl )
            // InternalBurst.g:1237:2: rule__RuleConcern__Group_3__3__Impl
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
    // InternalBurst.g:1243:1: rule__RuleConcern__Group_3__3__Impl : ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) ;
    public final void rule__RuleConcern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1247:1: ( ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) )
            // InternalBurst.g:1248:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            {
            // InternalBurst.g:1248:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            // InternalBurst.g:1249:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeAssignment_3_3()); 
            // InternalBurst.g:1250:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            // InternalBurst.g:1250:3: rule__RuleConcern__SupertypeAssignment_3_3
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
    // InternalBurst.g:1259:1: rule__RuleConcern__Group_4__0 : rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 ;
    public final void rule__RuleConcern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1263:1: ( rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 )
            // InternalBurst.g:1264:2: rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBurst.g:1271:1: rule__RuleConcern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__RuleConcern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1275:1: ( ( '{' ) )
            // InternalBurst.g:1276:1: ( '{' )
            {
            // InternalBurst.g:1276:1: ( '{' )
            // InternalBurst.g:1277:2: '{'
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
    // InternalBurst.g:1286:1: rule__RuleConcern__Group_4__1 : rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 ;
    public final void rule__RuleConcern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1290:1: ( rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 )
            // InternalBurst.g:1291:2: rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBurst.g:1298:1: rule__RuleConcern__Group_4__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1302:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1303:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1303:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1304:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_1()); 
            // InternalBurst.g:1305:2: ( RULE_ENDLINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ENDLINE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1305:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_1()); 

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
    // InternalBurst.g:1313:1: rule__RuleConcern__Group_4__2 : rule__RuleConcern__Group_4__2__Impl rule__RuleConcern__Group_4__3 ;
    public final void rule__RuleConcern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1317:1: ( rule__RuleConcern__Group_4__2__Impl rule__RuleConcern__Group_4__3 )
            // InternalBurst.g:1318:2: rule__RuleConcern__Group_4__2__Impl rule__RuleConcern__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__RuleConcern__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4__3();

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
    // InternalBurst.g:1325:1: rule__RuleConcern__Group_4__2__Impl : ( ( rule__RuleConcern__Group_4_2__0 )* ) ;
    public final void rule__RuleConcern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1329:1: ( ( ( rule__RuleConcern__Group_4_2__0 )* ) )
            // InternalBurst.g:1330:1: ( ( rule__RuleConcern__Group_4_2__0 )* )
            {
            // InternalBurst.g:1330:1: ( ( rule__RuleConcern__Group_4_2__0 )* )
            // InternalBurst.g:1331:2: ( rule__RuleConcern__Group_4_2__0 )*
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_4_2()); 
            // InternalBurst.g:1332:2: ( rule__RuleConcern__Group_4_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1332:3: rule__RuleConcern__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__RuleConcern__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getGroup_4_2()); 

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


    // $ANTLR start "rule__RuleConcern__Group_4__3"
    // InternalBurst.g:1340:1: rule__RuleConcern__Group_4__3 : rule__RuleConcern__Group_4__3__Impl ;
    public final void rule__RuleConcern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1344:1: ( rule__RuleConcern__Group_4__3__Impl )
            // InternalBurst.g:1345:2: rule__RuleConcern__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4__3__Impl();

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
    // $ANTLR end "rule__RuleConcern__Group_4__3"


    // $ANTLR start "rule__RuleConcern__Group_4__3__Impl"
    // InternalBurst.g:1351:1: rule__RuleConcern__Group_4__3__Impl : ( '}' ) ;
    public final void rule__RuleConcern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1355:1: ( ( '}' ) )
            // InternalBurst.g:1356:1: ( '}' )
            {
            // InternalBurst.g:1356:1: ( '}' )
            // InternalBurst.g:1357:2: '}'
            {
             before(grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__RuleConcern__Group_4__3__Impl"


    // $ANTLR start "rule__RuleConcern__Group_4_2__0"
    // InternalBurst.g:1367:1: rule__RuleConcern__Group_4_2__0 : rule__RuleConcern__Group_4_2__0__Impl rule__RuleConcern__Group_4_2__1 ;
    public final void rule__RuleConcern__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1371:1: ( rule__RuleConcern__Group_4_2__0__Impl rule__RuleConcern__Group_4_2__1 )
            // InternalBurst.g:1372:2: rule__RuleConcern__Group_4_2__0__Impl rule__RuleConcern__Group_4_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RuleConcern__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4_2__1();

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
    // $ANTLR end "rule__RuleConcern__Group_4_2__0"


    // $ANTLR start "rule__RuleConcern__Group_4_2__0__Impl"
    // InternalBurst.g:1379:1: rule__RuleConcern__Group_4_2__0__Impl : ( ( rule__RuleConcern__ElementsAssignment_4_2_0 ) ) ;
    public final void rule__RuleConcern__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1383:1: ( ( ( rule__RuleConcern__ElementsAssignment_4_2_0 ) ) )
            // InternalBurst.g:1384:1: ( ( rule__RuleConcern__ElementsAssignment_4_2_0 ) )
            {
            // InternalBurst.g:1384:1: ( ( rule__RuleConcern__ElementsAssignment_4_2_0 ) )
            // InternalBurst.g:1385:2: ( rule__RuleConcern__ElementsAssignment_4_2_0 )
            {
             before(grammarAccess.getRuleConcernAccess().getElementsAssignment_4_2_0()); 
            // InternalBurst.g:1386:2: ( rule__RuleConcern__ElementsAssignment_4_2_0 )
            // InternalBurst.g:1386:3: rule__RuleConcern__ElementsAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__ElementsAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleConcernAccess().getElementsAssignment_4_2_0()); 

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
    // $ANTLR end "rule__RuleConcern__Group_4_2__0__Impl"


    // $ANTLR start "rule__RuleConcern__Group_4_2__1"
    // InternalBurst.g:1394:1: rule__RuleConcern__Group_4_2__1 : rule__RuleConcern__Group_4_2__1__Impl ;
    public final void rule__RuleConcern__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1398:1: ( rule__RuleConcern__Group_4_2__1__Impl )
            // InternalBurst.g:1399:2: rule__RuleConcern__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleConcern__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__RuleConcern__Group_4_2__1"


    // $ANTLR start "rule__RuleConcern__Group_4_2__1__Impl"
    // InternalBurst.g:1405:1: rule__RuleConcern__Group_4_2__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__RuleConcern__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1409:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1410:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1410:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1411:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1411:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1412:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1()); 
            // InternalBurst.g:1413:3: ( RULE_ENDLINE )
            // InternalBurst.g:1413:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_8); 

            }

             after(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1()); 

            }

            // InternalBurst.g:1416:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1417:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1()); 
            // InternalBurst.g:1418:3: ( RULE_ENDLINE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENDLINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBurst.g:1418:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1()); 

            }


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
    // $ANTLR end "rule__RuleConcern__Group_4_2__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:1428:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1432:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:1433:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

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
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalBurst.g:1440:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1444:1: ( ( () ) )
            // InternalBurst.g:1445:1: ( () )
            {
            // InternalBurst.g:1445:1: ( () )
            // InternalBurst.g:1446:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:1447:2: ()
            // InternalBurst.g:1447:3: 
            {
            }

             after(grammarAccess.getMemberAccess().getMemberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalBurst.g:1455:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1459:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:1460:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

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
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalBurst.g:1467:1: rule__Member__Group__1__Impl : ( ( rule__Member__ConcernAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1471:1: ( ( ( rule__Member__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1472:1: ( ( rule__Member__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1472:1: ( ( rule__Member__ConcernAssignment_1 ) )
            // InternalBurst.g:1473:2: ( rule__Member__ConcernAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1474:2: ( rule__Member__ConcernAssignment_1 )
            // InternalBurst.g:1474:3: rule__Member__ConcernAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__ConcernAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getConcernAssignment_1()); 

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
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalBurst.g:1482:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1486:1: ( rule__Member__Group__2__Impl )
            // InternalBurst.g:1487:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__2__Impl();

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
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalBurst.g:1493:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1497:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // InternalBurst.g:1498:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // InternalBurst.g:1498:1: ( ( rule__Member__NameAssignment_2 ) )
            // InternalBurst.g:1499:2: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:1500:2: ( rule__Member__NameAssignment_2 )
            // InternalBurst.g:1500:3: rule__Member__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__0"
    // InternalBurst.g:1509:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1513:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:1514:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBurst.g:1521:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1525:1: ( ( () ) )
            // InternalBurst.g:1526:1: ( () )
            {
            // InternalBurst.g:1526:1: ( () )
            // InternalBurst.g:1527:2: ()
            {
             before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1528:2: ()
            // InternalBurst.g:1528:3: 
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
    // InternalBurst.g:1536:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1540:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:1541:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBurst.g:1548:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1552:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:1553:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:1553:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:1554:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            // InternalBurst.g:1555:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:1555:3: rule__RuleIntersect__NameAssignment_1
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
    // InternalBurst.g:1563:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1567:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:1568:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBurst.g:1575:1: rule__RuleIntersect__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1579:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1580:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1580:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1581:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:1582:2: ( RULE_ENDLINE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ENDLINE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1582:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 

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
    // InternalBurst.g:1590:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1594:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:1595:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
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
    // InternalBurst.g:1602:1: rule__RuleIntersect__Group__3__Impl : ( ( rule__RuleIntersect__ParametersAssignment_3 ) ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1606:1: ( ( ( rule__RuleIntersect__ParametersAssignment_3 ) ) )
            // InternalBurst.g:1607:1: ( ( rule__RuleIntersect__ParametersAssignment_3 ) )
            {
            // InternalBurst.g:1607:1: ( ( rule__RuleIntersect__ParametersAssignment_3 ) )
            // InternalBurst.g:1608:2: ( rule__RuleIntersect__ParametersAssignment_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersAssignment_3()); 
            // InternalBurst.g:1609:2: ( rule__RuleIntersect__ParametersAssignment_3 )
            // InternalBurst.g:1609:3: rule__RuleIntersect__ParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParametersAssignment_3()); 

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
    // InternalBurst.g:1617:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1621:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:1622:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
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
    // InternalBurst.g:1629:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__Group_4__0 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1633:1: ( ( ( rule__RuleIntersect__Group_4__0 )* ) )
            // InternalBurst.g:1634:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            {
            // InternalBurst.g:1634:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            // InternalBurst.g:1635:2: ( rule__RuleIntersect__Group_4__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
            // InternalBurst.g:1636:2: ( rule__RuleIntersect__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE||(LA20_0>=12 && LA20_0<=13)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1636:3: rule__RuleIntersect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__RuleIntersect__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getGroup_4()); 

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
    // InternalBurst.g:1644:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1648:1: ( rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 )
            // InternalBurst.g:1649:2: rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__RuleIntersect__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__6();

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
    // InternalBurst.g:1656:1: rule__RuleIntersect__Group__5__Impl : ( '{' ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1660:1: ( ( '{' ) )
            // InternalBurst.g:1661:1: ( '{' )
            {
            // InternalBurst.g:1661:1: ( '{' )
            // InternalBurst.g:1662:2: '{'
            {
             before(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__RuleIntersect__Group__6"
    // InternalBurst.g:1671:1: rule__RuleIntersect__Group__6 : rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 ;
    public final void rule__RuleIntersect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1675:1: ( rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 )
            // InternalBurst.g:1676:2: rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__RuleIntersect__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__7();

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
    // $ANTLR end "rule__RuleIntersect__Group__6"


    // $ANTLR start "rule__RuleIntersect__Group__6__Impl"
    // InternalBurst.g:1683:1: rule__RuleIntersect__Group__6__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1687:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1688:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1688:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1689:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_6()); 
            // InternalBurst.g:1690:2: ( RULE_ENDLINE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ENDLINE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:1690:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_6()); 

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
    // $ANTLR end "rule__RuleIntersect__Group__6__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__7"
    // InternalBurst.g:1698:1: rule__RuleIntersect__Group__7 : rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 ;
    public final void rule__RuleIntersect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1702:1: ( rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 )
            // InternalBurst.g:1703:2: rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__RuleIntersect__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__8();

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
    // $ANTLR end "rule__RuleIntersect__Group__7"


    // $ANTLR start "rule__RuleIntersect__Group__7__Impl"
    // InternalBurst.g:1710:1: rule__RuleIntersect__Group__7__Impl : ( ( rule__RuleIntersect__Group_7__0 )* ) ;
    public final void rule__RuleIntersect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1714:1: ( ( ( rule__RuleIntersect__Group_7__0 )* ) )
            // InternalBurst.g:1715:1: ( ( rule__RuleIntersect__Group_7__0 )* )
            {
            // InternalBurst.g:1715:1: ( ( rule__RuleIntersect__Group_7__0 )* )
            // InternalBurst.g:1716:2: ( rule__RuleIntersect__Group_7__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_7()); 
            // InternalBurst.g:1717:2: ( rule__RuleIntersect__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBurst.g:1717:3: rule__RuleIntersect__Group_7__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__RuleIntersect__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getGroup_7()); 

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
    // $ANTLR end "rule__RuleIntersect__Group__7__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__8"
    // InternalBurst.g:1725:1: rule__RuleIntersect__Group__8 : rule__RuleIntersect__Group__8__Impl ;
    public final void rule__RuleIntersect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1729:1: ( rule__RuleIntersect__Group__8__Impl )
            // InternalBurst.g:1730:2: rule__RuleIntersect__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__8__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group__8"


    // $ANTLR start "rule__RuleIntersect__Group__8__Impl"
    // InternalBurst.g:1736:1: rule__RuleIntersect__Group__8__Impl : ( '}' ) ;
    public final void rule__RuleIntersect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1740:1: ( ( '}' ) )
            // InternalBurst.g:1741:1: ( '}' )
            {
            // InternalBurst.g:1741:1: ( '}' )
            // InternalBurst.g:1742:2: '}'
            {
             before(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__RuleIntersect__Group__8__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__0"
    // InternalBurst.g:1752:1: rule__RuleIntersect__Group_4__0 : rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 ;
    public final void rule__RuleIntersect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1756:1: ( rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 )
            // InternalBurst.g:1757:2: rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__1();

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
    // $ANTLR end "rule__RuleIntersect__Group_4__0"


    // $ANTLR start "rule__RuleIntersect__Group_4__0__Impl"
    // InternalBurst.g:1764:1: rule__RuleIntersect__Group_4__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1768:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1769:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1769:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1770:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
            // InternalBurst.g:1771:2: ( RULE_ENDLINE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ENDLINE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1771:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_4__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__1"
    // InternalBurst.g:1779:1: rule__RuleIntersect__Group_4__1 : rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 ;
    public final void rule__RuleIntersect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1783:1: ( rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 )
            // InternalBurst.g:1784:2: rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__RuleIntersect__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__2();

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
    // $ANTLR end "rule__RuleIntersect__Group_4__1"


    // $ANTLR start "rule__RuleIntersect__Group_4__1__Impl"
    // InternalBurst.g:1791:1: rule__RuleIntersect__Group_4__1__Impl : ( ( rule__RuleIntersect__Alternatives_4_1 ) ) ;
    public final void rule__RuleIntersect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1795:1: ( ( ( rule__RuleIntersect__Alternatives_4_1 ) ) )
            // InternalBurst.g:1796:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            {
            // InternalBurst.g:1796:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            // InternalBurst.g:1797:2: ( rule__RuleIntersect__Alternatives_4_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
            // InternalBurst.g:1798:2: ( rule__RuleIntersect__Alternatives_4_1 )
            // InternalBurst.g:1798:3: rule__RuleIntersect__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_4__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__2"
    // InternalBurst.g:1806:1: rule__RuleIntersect__Group_4__2 : rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 ;
    public final void rule__RuleIntersect__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1810:1: ( rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 )
            // InternalBurst.g:1811:2: rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__RuleIntersect__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__3();

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
    // $ANTLR end "rule__RuleIntersect__Group_4__2"


    // $ANTLR start "rule__RuleIntersect__Group_4__2__Impl"
    // InternalBurst.g:1818:1: rule__RuleIntersect__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1822:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1823:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1823:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1824:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
            // InternalBurst.g:1825:2: ( RULE_ENDLINE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ENDLINE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBurst.g:1825:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_4__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__3"
    // InternalBurst.g:1833:1: rule__RuleIntersect__Group_4__3 : rule__RuleIntersect__Group_4__3__Impl ;
    public final void rule__RuleIntersect__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1837:1: ( rule__RuleIntersect__Group_4__3__Impl )
            // InternalBurst.g:1838:2: rule__RuleIntersect__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__3__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group_4__3"


    // $ANTLR start "rule__RuleIntersect__Group_4__3__Impl"
    // InternalBurst.g:1844:1: rule__RuleIntersect__Group_4__3__Impl : ( ( rule__RuleIntersect__ParametersAssignment_4_3 ) ) ;
    public final void rule__RuleIntersect__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1848:1: ( ( ( rule__RuleIntersect__ParametersAssignment_4_3 ) ) )
            // InternalBurst.g:1849:1: ( ( rule__RuleIntersect__ParametersAssignment_4_3 ) )
            {
            // InternalBurst.g:1849:1: ( ( rule__RuleIntersect__ParametersAssignment_4_3 ) )
            // InternalBurst.g:1850:2: ( rule__RuleIntersect__ParametersAssignment_4_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersAssignment_4_3()); 
            // InternalBurst.g:1851:2: ( rule__RuleIntersect__ParametersAssignment_4_3 )
            // InternalBurst.g:1851:3: rule__RuleIntersect__ParametersAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParametersAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParametersAssignment_4_3()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_4__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_7__0"
    // InternalBurst.g:1860:1: rule__RuleIntersect__Group_7__0 : rule__RuleIntersect__Group_7__0__Impl rule__RuleIntersect__Group_7__1 ;
    public final void rule__RuleIntersect__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1864:1: ( rule__RuleIntersect__Group_7__0__Impl rule__RuleIntersect__Group_7__1 )
            // InternalBurst.g:1865:2: rule__RuleIntersect__Group_7__0__Impl rule__RuleIntersect__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__RuleIntersect__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_7__1();

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
    // $ANTLR end "rule__RuleIntersect__Group_7__0"


    // $ANTLR start "rule__RuleIntersect__Group_7__0__Impl"
    // InternalBurst.g:1872:1: rule__RuleIntersect__Group_7__0__Impl : ( ( rule__RuleIntersect__LinesAssignment_7_0 ) ) ;
    public final void rule__RuleIntersect__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1876:1: ( ( ( rule__RuleIntersect__LinesAssignment_7_0 ) ) )
            // InternalBurst.g:1877:1: ( ( rule__RuleIntersect__LinesAssignment_7_0 ) )
            {
            // InternalBurst.g:1877:1: ( ( rule__RuleIntersect__LinesAssignment_7_0 ) )
            // InternalBurst.g:1878:2: ( rule__RuleIntersect__LinesAssignment_7_0 )
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesAssignment_7_0()); 
            // InternalBurst.g:1879:2: ( rule__RuleIntersect__LinesAssignment_7_0 )
            // InternalBurst.g:1879:3: rule__RuleIntersect__LinesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__LinesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getLinesAssignment_7_0()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_7__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_7__1"
    // InternalBurst.g:1887:1: rule__RuleIntersect__Group_7__1 : rule__RuleIntersect__Group_7__1__Impl ;
    public final void rule__RuleIntersect__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1891:1: ( rule__RuleIntersect__Group_7__1__Impl )
            // InternalBurst.g:1892:2: rule__RuleIntersect__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_7__1__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group_7__1"


    // $ANTLR start "rule__RuleIntersect__Group_7__1__Impl"
    // InternalBurst.g:1898:1: rule__RuleIntersect__Group_7__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__RuleIntersect__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1902:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1903:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1903:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1904:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1904:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1905:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1()); 
            // InternalBurst.g:1906:3: ( RULE_ENDLINE )
            // InternalBurst.g:1906:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_8); 

            }

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1()); 

            }

            // InternalBurst.g:1909:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1910:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1()); 
            // InternalBurst.g:1911:3: ( RULE_ENDLINE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ENDLINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:1911:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_8); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1()); 

            }


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
    // $ANTLR end "rule__RuleIntersect__Group_7__1__Impl"


    // $ANTLR start "rule__NamedParameter__Group__0"
    // InternalBurst.g:1921:1: rule__NamedParameter__Group__0 : rule__NamedParameter__Group__0__Impl rule__NamedParameter__Group__1 ;
    public final void rule__NamedParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1925:1: ( rule__NamedParameter__Group__0__Impl rule__NamedParameter__Group__1 )
            // InternalBurst.g:1926:2: rule__NamedParameter__Group__0__Impl rule__NamedParameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NamedParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedParameter__Group__1();

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
    // $ANTLR end "rule__NamedParameter__Group__0"


    // $ANTLR start "rule__NamedParameter__Group__0__Impl"
    // InternalBurst.g:1933:1: rule__NamedParameter__Group__0__Impl : ( () ) ;
    public final void rule__NamedParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1937:1: ( ( () ) )
            // InternalBurst.g:1938:1: ( () )
            {
            // InternalBurst.g:1938:1: ( () )
            // InternalBurst.g:1939:2: ()
            {
             before(grammarAccess.getNamedParameterAccess().getNamedParameterAction_0()); 
            // InternalBurst.g:1940:2: ()
            // InternalBurst.g:1940:3: 
            {
            }

             after(grammarAccess.getNamedParameterAccess().getNamedParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedParameter__Group__0__Impl"


    // $ANTLR start "rule__NamedParameter__Group__1"
    // InternalBurst.g:1948:1: rule__NamedParameter__Group__1 : rule__NamedParameter__Group__1__Impl rule__NamedParameter__Group__2 ;
    public final void rule__NamedParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1952:1: ( rule__NamedParameter__Group__1__Impl rule__NamedParameter__Group__2 )
            // InternalBurst.g:1953:2: rule__NamedParameter__Group__1__Impl rule__NamedParameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NamedParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamedParameter__Group__2();

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
    // $ANTLR end "rule__NamedParameter__Group__1"


    // $ANTLR start "rule__NamedParameter__Group__1__Impl"
    // InternalBurst.g:1960:1: rule__NamedParameter__Group__1__Impl : ( ( rule__NamedParameter__TypeAssignment_1 ) ) ;
    public final void rule__NamedParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1964:1: ( ( ( rule__NamedParameter__TypeAssignment_1 ) ) )
            // InternalBurst.g:1965:1: ( ( rule__NamedParameter__TypeAssignment_1 ) )
            {
            // InternalBurst.g:1965:1: ( ( rule__NamedParameter__TypeAssignment_1 ) )
            // InternalBurst.g:1966:2: ( rule__NamedParameter__TypeAssignment_1 )
            {
             before(grammarAccess.getNamedParameterAccess().getTypeAssignment_1()); 
            // InternalBurst.g:1967:2: ( rule__NamedParameter__TypeAssignment_1 )
            // InternalBurst.g:1967:3: rule__NamedParameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NamedParameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedParameterAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__NamedParameter__Group__1__Impl"


    // $ANTLR start "rule__NamedParameter__Group__2"
    // InternalBurst.g:1975:1: rule__NamedParameter__Group__2 : rule__NamedParameter__Group__2__Impl ;
    public final void rule__NamedParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1979:1: ( rule__NamedParameter__Group__2__Impl )
            // InternalBurst.g:1980:2: rule__NamedParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamedParameter__Group__2__Impl();

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
    // $ANTLR end "rule__NamedParameter__Group__2"


    // $ANTLR start "rule__NamedParameter__Group__2__Impl"
    // InternalBurst.g:1986:1: rule__NamedParameter__Group__2__Impl : ( ( rule__NamedParameter__NameAssignment_2 ) ) ;
    public final void rule__NamedParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1990:1: ( ( ( rule__NamedParameter__NameAssignment_2 ) ) )
            // InternalBurst.g:1991:1: ( ( rule__NamedParameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:1991:1: ( ( rule__NamedParameter__NameAssignment_2 ) )
            // InternalBurst.g:1992:2: ( rule__NamedParameter__NameAssignment_2 )
            {
             before(grammarAccess.getNamedParameterAccess().getNameAssignment_2()); 
            // InternalBurst.g:1993:2: ( rule__NamedParameter__NameAssignment_2 )
            // InternalBurst.g:1993:3: rule__NamedParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NamedParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedParameterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__NamedParameter__Group__2__Impl"


    // $ANTLR start "rule__StaticParameter__Group__0"
    // InternalBurst.g:2002:1: rule__StaticParameter__Group__0 : rule__StaticParameter__Group__0__Impl rule__StaticParameter__Group__1 ;
    public final void rule__StaticParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2006:1: ( rule__StaticParameter__Group__0__Impl rule__StaticParameter__Group__1 )
            // InternalBurst.g:2007:2: rule__StaticParameter__Group__0__Impl rule__StaticParameter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__StaticParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticParameter__Group__1();

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
    // $ANTLR end "rule__StaticParameter__Group__0"


    // $ANTLR start "rule__StaticParameter__Group__0__Impl"
    // InternalBurst.g:2014:1: rule__StaticParameter__Group__0__Impl : ( () ) ;
    public final void rule__StaticParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2018:1: ( ( () ) )
            // InternalBurst.g:2019:1: ( () )
            {
            // InternalBurst.g:2019:1: ( () )
            // InternalBurst.g:2020:2: ()
            {
             before(grammarAccess.getStaticParameterAccess().getStaticParameterAction_0()); 
            // InternalBurst.g:2021:2: ()
            // InternalBurst.g:2021:3: 
            {
            }

             after(grammarAccess.getStaticParameterAccess().getStaticParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticParameter__Group__0__Impl"


    // $ANTLR start "rule__StaticParameter__Group__1"
    // InternalBurst.g:2029:1: rule__StaticParameter__Group__1 : rule__StaticParameter__Group__1__Impl rule__StaticParameter__Group__2 ;
    public final void rule__StaticParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2033:1: ( rule__StaticParameter__Group__1__Impl rule__StaticParameter__Group__2 )
            // InternalBurst.g:2034:2: rule__StaticParameter__Group__1__Impl rule__StaticParameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StaticParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticParameter__Group__2();

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
    // $ANTLR end "rule__StaticParameter__Group__1"


    // $ANTLR start "rule__StaticParameter__Group__1__Impl"
    // InternalBurst.g:2041:1: rule__StaticParameter__Group__1__Impl : ( 'with' ) ;
    public final void rule__StaticParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2045:1: ( ( 'with' ) )
            // InternalBurst.g:2046:1: ( 'with' )
            {
            // InternalBurst.g:2046:1: ( 'with' )
            // InternalBurst.g:2047:2: 'with'
            {
             before(grammarAccess.getStaticParameterAccess().getWithKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStaticParameterAccess().getWithKeyword_1()); 

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
    // $ANTLR end "rule__StaticParameter__Group__1__Impl"


    // $ANTLR start "rule__StaticParameter__Group__2"
    // InternalBurst.g:2056:1: rule__StaticParameter__Group__2 : rule__StaticParameter__Group__2__Impl ;
    public final void rule__StaticParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2060:1: ( rule__StaticParameter__Group__2__Impl )
            // InternalBurst.g:2061:2: rule__StaticParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticParameter__Group__2__Impl();

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
    // $ANTLR end "rule__StaticParameter__Group__2"


    // $ANTLR start "rule__StaticParameter__Group__2__Impl"
    // InternalBurst.g:2067:1: rule__StaticParameter__Group__2__Impl : ( ( rule__StaticParameter__NameAssignment_2 ) ) ;
    public final void rule__StaticParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2071:1: ( ( ( rule__StaticParameter__NameAssignment_2 ) ) )
            // InternalBurst.g:2072:1: ( ( rule__StaticParameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:2072:1: ( ( rule__StaticParameter__NameAssignment_2 ) )
            // InternalBurst.g:2073:2: ( rule__StaticParameter__NameAssignment_2 )
            {
             before(grammarAccess.getStaticParameterAccess().getNameAssignment_2()); 
            // InternalBurst.g:2074:2: ( rule__StaticParameter__NameAssignment_2 )
            // InternalBurst.g:2074:3: rule__StaticParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StaticParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStaticParameterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__StaticParameter__Group__2__Impl"


    // $ANTLR start "rule__UsageParameter__Group__0"
    // InternalBurst.g:2083:1: rule__UsageParameter__Group__0 : rule__UsageParameter__Group__0__Impl rule__UsageParameter__Group__1 ;
    public final void rule__UsageParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2087:1: ( rule__UsageParameter__Group__0__Impl rule__UsageParameter__Group__1 )
            // InternalBurst.g:2088:2: rule__UsageParameter__Group__0__Impl rule__UsageParameter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__UsageParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__1();

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
    // $ANTLR end "rule__UsageParameter__Group__0"


    // $ANTLR start "rule__UsageParameter__Group__0__Impl"
    // InternalBurst.g:2095:1: rule__UsageParameter__Group__0__Impl : ( () ) ;
    public final void rule__UsageParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2099:1: ( ( () ) )
            // InternalBurst.g:2100:1: ( () )
            {
            // InternalBurst.g:2100:1: ( () )
            // InternalBurst.g:2101:2: ()
            {
             before(grammarAccess.getUsageParameterAccess().getUsageParameterAction_0()); 
            // InternalBurst.g:2102:2: ()
            // InternalBurst.g:2102:3: 
            {
            }

             after(grammarAccess.getUsageParameterAccess().getUsageParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsageParameter__Group__0__Impl"


    // $ANTLR start "rule__UsageParameter__Group__1"
    // InternalBurst.g:2110:1: rule__UsageParameter__Group__1 : rule__UsageParameter__Group__1__Impl rule__UsageParameter__Group__2 ;
    public final void rule__UsageParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2114:1: ( rule__UsageParameter__Group__1__Impl rule__UsageParameter__Group__2 )
            // InternalBurst.g:2115:2: rule__UsageParameter__Group__1__Impl rule__UsageParameter__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__UsageParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__2();

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
    // $ANTLR end "rule__UsageParameter__Group__1"


    // $ANTLR start "rule__UsageParameter__Group__1__Impl"
    // InternalBurst.g:2122:1: rule__UsageParameter__Group__1__Impl : ( ( rule__UsageParameter__TypeAssignment_1 ) ) ;
    public final void rule__UsageParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2126:1: ( ( ( rule__UsageParameter__TypeAssignment_1 ) ) )
            // InternalBurst.g:2127:1: ( ( rule__UsageParameter__TypeAssignment_1 ) )
            {
            // InternalBurst.g:2127:1: ( ( rule__UsageParameter__TypeAssignment_1 ) )
            // InternalBurst.g:2128:2: ( rule__UsageParameter__TypeAssignment_1 )
            {
             before(grammarAccess.getUsageParameterAccess().getTypeAssignment_1()); 
            // InternalBurst.g:2129:2: ( rule__UsageParameter__TypeAssignment_1 )
            // InternalBurst.g:2129:3: rule__UsageParameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UsageParameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsageParameterAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__UsageParameter__Group__1__Impl"


    // $ANTLR start "rule__UsageParameter__Group__2"
    // InternalBurst.g:2137:1: rule__UsageParameter__Group__2 : rule__UsageParameter__Group__2__Impl rule__UsageParameter__Group__3 ;
    public final void rule__UsageParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2141:1: ( rule__UsageParameter__Group__2__Impl rule__UsageParameter__Group__3 )
            // InternalBurst.g:2142:2: rule__UsageParameter__Group__2__Impl rule__UsageParameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UsageParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__3();

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
    // $ANTLR end "rule__UsageParameter__Group__2"


    // $ANTLR start "rule__UsageParameter__Group__2__Impl"
    // InternalBurst.g:2149:1: rule__UsageParameter__Group__2__Impl : ( '.' ) ;
    public final void rule__UsageParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2153:1: ( ( '.' ) )
            // InternalBurst.g:2154:1: ( '.' )
            {
            // InternalBurst.g:2154:1: ( '.' )
            // InternalBurst.g:2155:2: '.'
            {
             before(grammarAccess.getUsageParameterAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUsageParameterAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__UsageParameter__Group__2__Impl"


    // $ANTLR start "rule__UsageParameter__Group__3"
    // InternalBurst.g:2164:1: rule__UsageParameter__Group__3 : rule__UsageParameter__Group__3__Impl rule__UsageParameter__Group__4 ;
    public final void rule__UsageParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2168:1: ( rule__UsageParameter__Group__3__Impl rule__UsageParameter__Group__4 )
            // InternalBurst.g:2169:2: rule__UsageParameter__Group__3__Impl rule__UsageParameter__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__UsageParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__4();

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
    // $ANTLR end "rule__UsageParameter__Group__3"


    // $ANTLR start "rule__UsageParameter__Group__3__Impl"
    // InternalBurst.g:2176:1: rule__UsageParameter__Group__3__Impl : ( ruleusage ) ;
    public final void rule__UsageParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2180:1: ( ( ruleusage ) )
            // InternalBurst.g:2181:1: ( ruleusage )
            {
            // InternalBurst.g:2181:1: ( ruleusage )
            // InternalBurst.g:2182:2: ruleusage
            {
             before(grammarAccess.getUsageParameterAccess().getUsageParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleusage();

            state._fsp--;

             after(grammarAccess.getUsageParameterAccess().getUsageParserRuleCall_3()); 

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
    // $ANTLR end "rule__UsageParameter__Group__3__Impl"


    // $ANTLR start "rule__UsageParameter__Group__4"
    // InternalBurst.g:2191:1: rule__UsageParameter__Group__4 : rule__UsageParameter__Group__4__Impl ;
    public final void rule__UsageParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2195:1: ( rule__UsageParameter__Group__4__Impl )
            // InternalBurst.g:2196:2: rule__UsageParameter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsageParameter__Group__4__Impl();

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
    // $ANTLR end "rule__UsageParameter__Group__4"


    // $ANTLR start "rule__UsageParameter__Group__4__Impl"
    // InternalBurst.g:2202:1: rule__UsageParameter__Group__4__Impl : ( ( rule__UsageParameter__NameAssignment_4 ) ) ;
    public final void rule__UsageParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2206:1: ( ( ( rule__UsageParameter__NameAssignment_4 ) ) )
            // InternalBurst.g:2207:1: ( ( rule__UsageParameter__NameAssignment_4 ) )
            {
            // InternalBurst.g:2207:1: ( ( rule__UsageParameter__NameAssignment_4 ) )
            // InternalBurst.g:2208:2: ( rule__UsageParameter__NameAssignment_4 )
            {
             before(grammarAccess.getUsageParameterAccess().getNameAssignment_4()); 
            // InternalBurst.g:2209:2: ( rule__UsageParameter__NameAssignment_4 )
            // InternalBurst.g:2209:3: rule__UsageParameter__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UsageParameter__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUsageParameterAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__UsageParameter__Group__4__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalBurst.g:2218:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2222:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:2223:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBurst.g:2230:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2234:1: ( ( () ) )
            // InternalBurst.g:2235:1: ( () )
            {
            // InternalBurst.g:2235:1: ( () )
            // InternalBurst.g:2236:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalBurst.g:2237:2: ()
            // InternalBurst.g:2237:3: 
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
    // InternalBurst.g:2245:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2249:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBurst.g:2250:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBurst.g:2257:1: rule__Line__Group__1__Impl : ( ( rule__Line__CallsAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2261:1: ( ( ( rule__Line__CallsAssignment_1 ) ) )
            // InternalBurst.g:2262:1: ( ( rule__Line__CallsAssignment_1 ) )
            {
            // InternalBurst.g:2262:1: ( ( rule__Line__CallsAssignment_1 ) )
            // InternalBurst.g:2263:2: ( rule__Line__CallsAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_1()); 
            // InternalBurst.g:2264:2: ( rule__Line__CallsAssignment_1 )
            // InternalBurst.g:2264:3: rule__Line__CallsAssignment_1
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
    // InternalBurst.g:2272:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2276:1: ( rule__Line__Group__2__Impl )
            // InternalBurst.g:2277:2: rule__Line__Group__2__Impl
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
    // InternalBurst.g:2283:1: rule__Line__Group__2__Impl : ( ( rule__Line__CallsAssignment_2 )* ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2287:1: ( ( ( rule__Line__CallsAssignment_2 )* ) )
            // InternalBurst.g:2288:1: ( ( rule__Line__CallsAssignment_2 )* )
            {
            // InternalBurst.g:2288:1: ( ( rule__Line__CallsAssignment_2 )* )
            // InternalBurst.g:2289:2: ( rule__Line__CallsAssignment_2 )*
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_2()); 
            // InternalBurst.g:2290:2: ( rule__Line__CallsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:2290:3: rule__Line__CallsAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Line__CallsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__MemberCall__Group__0"
    // InternalBurst.g:2299:1: rule__MemberCall__Group__0 : rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 ;
    public final void rule__MemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2303:1: ( rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 )
            // InternalBurst.g:2304:2: rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MemberCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__1();

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
    // $ANTLR end "rule__MemberCall__Group__0"


    // $ANTLR start "rule__MemberCall__Group__0__Impl"
    // InternalBurst.g:2311:1: rule__MemberCall__Group__0__Impl : ( () ) ;
    public final void rule__MemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2315:1: ( ( () ) )
            // InternalBurst.g:2316:1: ( () )
            {
            // InternalBurst.g:2316:1: ( () )
            // InternalBurst.g:2317:2: ()
            {
             before(grammarAccess.getMemberCallAccess().getMemberCallAction_0()); 
            // InternalBurst.g:2318:2: ()
            // InternalBurst.g:2318:3: 
            {
            }

             after(grammarAccess.getMemberCallAccess().getMemberCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberCall__Group__0__Impl"


    // $ANTLR start "rule__MemberCall__Group__1"
    // InternalBurst.g:2326:1: rule__MemberCall__Group__1 : rule__MemberCall__Group__1__Impl rule__MemberCall__Group__2 ;
    public final void rule__MemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2330:1: ( rule__MemberCall__Group__1__Impl rule__MemberCall__Group__2 )
            // InternalBurst.g:2331:2: rule__MemberCall__Group__1__Impl rule__MemberCall__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MemberCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__2();

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
    // $ANTLR end "rule__MemberCall__Group__1"


    // $ANTLR start "rule__MemberCall__Group__1__Impl"
    // InternalBurst.g:2338:1: rule__MemberCall__Group__1__Impl : ( ( rule__MemberCall__VariableAssignment_1 ) ) ;
    public final void rule__MemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2342:1: ( ( ( rule__MemberCall__VariableAssignment_1 ) ) )
            // InternalBurst.g:2343:1: ( ( rule__MemberCall__VariableAssignment_1 ) )
            {
            // InternalBurst.g:2343:1: ( ( rule__MemberCall__VariableAssignment_1 ) )
            // InternalBurst.g:2344:2: ( rule__MemberCall__VariableAssignment_1 )
            {
             before(grammarAccess.getMemberCallAccess().getVariableAssignment_1()); 
            // InternalBurst.g:2345:2: ( rule__MemberCall__VariableAssignment_1 )
            // InternalBurst.g:2345:3: rule__MemberCall__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberCallAccess().getVariableAssignment_1()); 

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
    // $ANTLR end "rule__MemberCall__Group__1__Impl"


    // $ANTLR start "rule__MemberCall__Group__2"
    // InternalBurst.g:2353:1: rule__MemberCall__Group__2 : rule__MemberCall__Group__2__Impl rule__MemberCall__Group__3 ;
    public final void rule__MemberCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2357:1: ( rule__MemberCall__Group__2__Impl rule__MemberCall__Group__3 )
            // InternalBurst.g:2358:2: rule__MemberCall__Group__2__Impl rule__MemberCall__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MemberCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__3();

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
    // $ANTLR end "rule__MemberCall__Group__2"


    // $ANTLR start "rule__MemberCall__Group__2__Impl"
    // InternalBurst.g:2365:1: rule__MemberCall__Group__2__Impl : ( '.' ) ;
    public final void rule__MemberCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2369:1: ( ( '.' ) )
            // InternalBurst.g:2370:1: ( '.' )
            {
            // InternalBurst.g:2370:1: ( '.' )
            // InternalBurst.g:2371:2: '.'
            {
             before(grammarAccess.getMemberCallAccess().getFullStopKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMemberCallAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__MemberCall__Group__2__Impl"


    // $ANTLR start "rule__MemberCall__Group__3"
    // InternalBurst.g:2380:1: rule__MemberCall__Group__3 : rule__MemberCall__Group__3__Impl ;
    public final void rule__MemberCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2384:1: ( rule__MemberCall__Group__3__Impl )
            // InternalBurst.g:2385:2: rule__MemberCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__3__Impl();

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
    // $ANTLR end "rule__MemberCall__Group__3"


    // $ANTLR start "rule__MemberCall__Group__3__Impl"
    // InternalBurst.g:2391:1: rule__MemberCall__Group__3__Impl : ( ( rule__MemberCall__NameAssignment_3 ) ) ;
    public final void rule__MemberCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2395:1: ( ( ( rule__MemberCall__NameAssignment_3 ) ) )
            // InternalBurst.g:2396:1: ( ( rule__MemberCall__NameAssignment_3 ) )
            {
            // InternalBurst.g:2396:1: ( ( rule__MemberCall__NameAssignment_3 ) )
            // InternalBurst.g:2397:2: ( rule__MemberCall__NameAssignment_3 )
            {
             before(grammarAccess.getMemberCallAccess().getNameAssignment_3()); 
            // InternalBurst.g:2398:2: ( rule__MemberCall__NameAssignment_3 )
            // InternalBurst.g:2398:3: rule__MemberCall__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberCallAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__MemberCall__Group__3__Impl"


    // $ANTLR start "rule__VariableCall__Group__0"
    // InternalBurst.g:2407:1: rule__VariableCall__Group__0 : rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1 ;
    public final void rule__VariableCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2411:1: ( rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1 )
            // InternalBurst.g:2412:2: rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__1();

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
    // $ANTLR end "rule__VariableCall__Group__0"


    // $ANTLR start "rule__VariableCall__Group__0__Impl"
    // InternalBurst.g:2419:1: rule__VariableCall__Group__0__Impl : ( () ) ;
    public final void rule__VariableCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2423:1: ( ( () ) )
            // InternalBurst.g:2424:1: ( () )
            {
            // InternalBurst.g:2424:1: ( () )
            // InternalBurst.g:2425:2: ()
            {
             before(grammarAccess.getVariableCallAccess().getVariableCallAction_0()); 
            // InternalBurst.g:2426:2: ()
            // InternalBurst.g:2426:3: 
            {
            }

             after(grammarAccess.getVariableCallAccess().getVariableCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group__0__Impl"


    // $ANTLR start "rule__VariableCall__Group__1"
    // InternalBurst.g:2434:1: rule__VariableCall__Group__1 : rule__VariableCall__Group__1__Impl ;
    public final void rule__VariableCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2438:1: ( rule__VariableCall__Group__1__Impl )
            // InternalBurst.g:2439:2: rule__VariableCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__1__Impl();

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
    // $ANTLR end "rule__VariableCall__Group__1"


    // $ANTLR start "rule__VariableCall__Group__1__Impl"
    // InternalBurst.g:2445:1: rule__VariableCall__Group__1__Impl : ( ( rule__VariableCall__NameAssignment_1 ) ) ;
    public final void rule__VariableCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2449:1: ( ( ( rule__VariableCall__NameAssignment_1 ) ) )
            // InternalBurst.g:2450:1: ( ( rule__VariableCall__NameAssignment_1 ) )
            {
            // InternalBurst.g:2450:1: ( ( rule__VariableCall__NameAssignment_1 ) )
            // InternalBurst.g:2451:2: ( rule__VariableCall__NameAssignment_1 )
            {
             before(grammarAccess.getVariableCallAccess().getNameAssignment_1()); 
            // InternalBurst.g:2452:2: ( rule__VariableCall__NameAssignment_1 )
            // InternalBurst.g:2452:3: rule__VariableCall__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableCallAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableCall__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:2461:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2465:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:2466:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalBurst.g:2473:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2477:1: ( ( RULE_ID ) )
            // InternalBurst.g:2478:1: ( RULE_ID )
            {
            // InternalBurst.g:2478:1: ( RULE_ID )
            // InternalBurst.g:2479:2: RULE_ID
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
    // InternalBurst.g:2488:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2492:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:2493:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:2499:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2503:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:2504:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:2504:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:2505:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:2506:2: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBurst.g:2506:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalBurst.g:2515:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2519:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:2520:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:2527:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2531:1: ( ( '.' ) )
            // InternalBurst.g:2532:1: ( '.' )
            {
            // InternalBurst.g:2532:1: ( '.' )
            // InternalBurst.g:2533:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBurst.g:2542:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2546:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:2547:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:2553:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2557:1: ( ( RULE_ID ) )
            // InternalBurst.g:2558:1: ( RULE_ID )
            {
            // InternalBurst.g:2558:1: ( RULE_ID )
            // InternalBurst.g:2559:2: RULE_ID
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
    // InternalBurst.g:2569:1: rule__File__ElementsAssignment : ( ruleRuleFileElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2573:1: ( ( ruleRuleFileElement ) )
            // InternalBurst.g:2574:2: ( ruleRuleFileElement )
            {
            // InternalBurst.g:2574:2: ( ruleRuleFileElement )
            // InternalBurst.g:2575:3: ruleRuleFileElement
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
    // InternalBurst.g:2584:1: rule__RuleImport__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RuleImport__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2588:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2589:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:2589:2: ( ruleQualifiedName )
            // InternalBurst.g:2590:3: ruleQualifiedName
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
    // InternalBurst.g:2599:1: rule__RulePackage__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RulePackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2603:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2604:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:2604:2: ( ruleQualifiedName )
            // InternalBurst.g:2605:3: ruleQualifiedName
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


    // $ANTLR start "rule__RulePackage__ElementsAssignment_6_0"
    // InternalBurst.g:2614:1: rule__RulePackage__ElementsAssignment_6_0 : ( rulePackageElement ) ;
    public final void rule__RulePackage__ElementsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2618:1: ( ( rulePackageElement ) )
            // InternalBurst.g:2619:2: ( rulePackageElement )
            {
            // InternalBurst.g:2619:2: ( rulePackageElement )
            // InternalBurst.g:2620:3: rulePackageElement
            {
             before(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageElement();

            state._fsp--;

             after(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__RulePackage__ElementsAssignment_6_0"


    // $ANTLR start "rule__RuleConcern__NameAssignment_2"
    // InternalBurst.g:2629:1: rule__RuleConcern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleConcern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2633:1: ( ( RULE_ID ) )
            // InternalBurst.g:2634:2: ( RULE_ID )
            {
            // InternalBurst.g:2634:2: ( RULE_ID )
            // InternalBurst.g:2635:3: RULE_ID
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
    // InternalBurst.g:2644:1: rule__RuleConcern__SupertypeAssignment_3_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RuleConcern__SupertypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2648:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2649:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2649:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2650:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0()); 
            // InternalBurst.g:2651:3: ( ruleQualifiedName )
            // InternalBurst.g:2652:4: ruleQualifiedName
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


    // $ANTLR start "rule__RuleConcern__ElementsAssignment_4_2_0"
    // InternalBurst.g:2663:1: rule__RuleConcern__ElementsAssignment_4_2_0 : ( ruleConcernElement ) ;
    public final void rule__RuleConcern__ElementsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2667:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:2668:2: ( ruleConcernElement )
            {
            // InternalBurst.g:2668:2: ( ruleConcernElement )
            // InternalBurst.g:2669:3: ruleConcernElement
            {
             before(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;

             after(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_2_0_0()); 

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
    // $ANTLR end "rule__RuleConcern__ElementsAssignment_4_2_0"


    // $ANTLR start "rule__Member__ConcernAssignment_1"
    // InternalBurst.g:2678:1: rule__Member__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2682:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2683:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2683:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2684:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:2685:3: ( ruleQualifiedName )
            // InternalBurst.g:2686:4: ruleQualifiedName
            {
             before(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__Member__ConcernAssignment_1"


    // $ANTLR start "rule__Member__NameAssignment_2"
    // InternalBurst.g:2697:1: rule__Member__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2701:1: ( ( RULE_ID ) )
            // InternalBurst.g:2702:2: ( RULE_ID )
            {
            // InternalBurst.g:2702:2: ( RULE_ID )
            // InternalBurst.g:2703:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment_2"


    // $ANTLR start "rule__RuleIntersect__NameAssignment_1"
    // InternalBurst.g:2712:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2716:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:2717:2: ( ( 'when' ) )
            {
            // InternalBurst.g:2717:2: ( ( 'when' ) )
            // InternalBurst.g:2718:3: ( 'when' )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:2719:3: ( 'when' )
            // InternalBurst.g:2720:4: 'when'
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__RuleIntersect__ParametersAssignment_3"
    // InternalBurst.g:2731:1: rule__RuleIntersect__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2735:1: ( ( ruleParameter ) )
            // InternalBurst.g:2736:2: ( ruleParameter )
            {
            // InternalBurst.g:2736:2: ( ruleParameter )
            // InternalBurst.g:2737:3: ruleParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RuleIntersect__ParametersAssignment_3"


    // $ANTLR start "rule__RuleIntersect__ParametersAssignment_4_3"
    // InternalBurst.g:2746:1: rule__RuleIntersect__ParametersAssignment_4_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParametersAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2750:1: ( ( ruleParameter ) )
            // InternalBurst.g:2751:2: ( ruleParameter )
            {
            // InternalBurst.g:2751:2: ( ruleParameter )
            // InternalBurst.g:2752:3: ruleParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__RuleIntersect__ParametersAssignment_4_3"


    // $ANTLR start "rule__RuleIntersect__LinesAssignment_7_0"
    // InternalBurst.g:2761:1: rule__RuleIntersect__LinesAssignment_7_0 : ( ruleLine ) ;
    public final void rule__RuleIntersect__LinesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2765:1: ( ( ruleLine ) )
            // InternalBurst.g:2766:2: ( ruleLine )
            {
            // InternalBurst.g:2766:2: ( ruleLine )
            // InternalBurst.g:2767:3: ruleLine
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__RuleIntersect__LinesAssignment_7_0"


    // $ANTLR start "rule__NamedParameter__TypeAssignment_1"
    // InternalBurst.g:2776:1: rule__NamedParameter__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NamedParameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2780:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2781:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2781:2: ( ( RULE_ID ) )
            // InternalBurst.g:2782:3: ( RULE_ID )
            {
             before(grammarAccess.getNamedParameterAccess().getTypeConcernCrossReference_1_0()); 
            // InternalBurst.g:2783:3: ( RULE_ID )
            // InternalBurst.g:2784:4: RULE_ID
            {
             before(grammarAccess.getNamedParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNamedParameterAccess().getTypeConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__NamedParameter__TypeAssignment_1"


    // $ANTLR start "rule__NamedParameter__NameAssignment_2"
    // InternalBurst.g:2795:1: rule__NamedParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NamedParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2799:1: ( ( RULE_ID ) )
            // InternalBurst.g:2800:2: ( RULE_ID )
            {
            // InternalBurst.g:2800:2: ( RULE_ID )
            // InternalBurst.g:2801:3: RULE_ID
            {
             before(grammarAccess.getNamedParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamedParameterAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NamedParameter__NameAssignment_2"


    // $ANTLR start "rule__StaticParameter__NameAssignment_2"
    // InternalBurst.g:2810:1: rule__StaticParameter__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StaticParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2814:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2815:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2815:2: ( ( RULE_ID ) )
            // InternalBurst.g:2816:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticParameterAccess().getNameConcernCrossReference_2_0()); 
            // InternalBurst.g:2817:3: ( RULE_ID )
            // InternalBurst.g:2818:4: RULE_ID
            {
             before(grammarAccess.getStaticParameterAccess().getNameConcernIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticParameterAccess().getNameConcernIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStaticParameterAccess().getNameConcernCrossReference_2_0()); 

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
    // $ANTLR end "rule__StaticParameter__NameAssignment_2"


    // $ANTLR start "rule__UsageParameter__TypeAssignment_1"
    // InternalBurst.g:2829:1: rule__UsageParameter__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UsageParameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2833:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2834:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2834:2: ( ( RULE_ID ) )
            // InternalBurst.g:2835:3: ( RULE_ID )
            {
             before(grammarAccess.getUsageParameterAccess().getTypeConcernCrossReference_1_0()); 
            // InternalBurst.g:2836:3: ( RULE_ID )
            // InternalBurst.g:2837:4: RULE_ID
            {
             before(grammarAccess.getUsageParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsageParameterAccess().getTypeConcernIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUsageParameterAccess().getTypeConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__UsageParameter__TypeAssignment_1"


    // $ANTLR start "rule__UsageParameter__NameAssignment_4"
    // InternalBurst.g:2848:1: rule__UsageParameter__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__UsageParameter__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2852:1: ( ( RULE_ID ) )
            // InternalBurst.g:2853:2: ( RULE_ID )
            {
            // InternalBurst.g:2853:2: ( RULE_ID )
            // InternalBurst.g:2854:3: RULE_ID
            {
             before(grammarAccess.getUsageParameterAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsageParameterAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__UsageParameter__NameAssignment_4"


    // $ANTLR start "rule__Line__CallsAssignment_1"
    // InternalBurst.g:2863:1: rule__Line__CallsAssignment_1 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2867:1: ( ( ruleCall ) )
            // InternalBurst.g:2868:2: ( ruleCall )
            {
            // InternalBurst.g:2868:2: ( ruleCall )
            // InternalBurst.g:2869:3: ruleCall
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
    // InternalBurst.g:2878:1: rule__Line__CallsAssignment_2 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2882:1: ( ( ruleCall ) )
            // InternalBurst.g:2883:2: ( ruleCall )
            {
            // InternalBurst.g:2883:2: ( ruleCall )
            // InternalBurst.g:2884:3: ruleCall
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


    // $ANTLR start "rule__MemberCall__VariableAssignment_1"
    // InternalBurst.g:2893:1: rule__MemberCall__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2897:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2898:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2898:2: ( ( RULE_ID ) )
            // InternalBurst.g:2899:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberCallAccess().getVariableVariableCrossReference_1_0()); 
            // InternalBurst.g:2900:3: ( RULE_ID )
            // InternalBurst.g:2901:4: RULE_ID
            {
             before(grammarAccess.getMemberCallAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberCallAccess().getVariableVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemberCallAccess().getVariableVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__MemberCall__VariableAssignment_1"


    // $ANTLR start "rule__MemberCall__NameAssignment_3"
    // InternalBurst.g:2912:1: rule__MemberCall__NameAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2916:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2917:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2917:2: ( ( RULE_ID ) )
            // InternalBurst.g:2918:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_3_0()); 
            // InternalBurst.g:2919:3: ( RULE_ID )
            // InternalBurst.g:2920:4: RULE_ID
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberCallAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_3_0()); 

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
    // $ANTLR end "rule__MemberCall__NameAssignment_3"


    // $ANTLR start "rule__VariableCall__NameAssignment_1"
    // InternalBurst.g:2931:1: rule__VariableCall__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2935:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2936:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2936:2: ( ( RULE_ID ) )
            // InternalBurst.g:2937:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_1_0()); 
            // InternalBurst.g:2938:3: ( RULE_ID )
            // InternalBurst.g:2939:4: RULE_ID
            {
             before(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableCallAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableCallAccess().getNameVariableCrossReference_1_0()); 

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
    // $ANTLR end "rule__VariableCall__NameAssignment_1"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\2\26\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\3\3\1\2\2\uffff\1\3",
            "\1\1\13\uffff\2\3\1\2\2\uffff\1\3",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1116:2: ( rule__RuleConcern__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000460020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000460030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000440012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000013020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200002L});

}