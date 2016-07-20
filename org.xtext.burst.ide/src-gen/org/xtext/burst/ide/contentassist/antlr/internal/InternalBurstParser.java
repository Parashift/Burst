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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'import'", "'package'", "'{'", "'}'", "'concern'", "'extends'", "'.'", "'when'"
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
    // InternalBurst.g:287:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalBurst.g:292:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalBurst.g:292:2: ( ( rule__Parameter__Group__0 ) )
            // InternalBurst.g:293:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalBurst.g:294:3: ( rule__Parameter__Group__0 )
            // InternalBurst.g:294:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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


    // $ANTLR start "entryRuleIntersectionElement"
    // InternalBurst.g:303:1: entryRuleIntersectionElement : ruleIntersectionElement EOF ;
    public final void entryRuleIntersectionElement() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleIntersectionElement EOF )
            // InternalBurst.g:305:1: ruleIntersectionElement EOF
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
    // InternalBurst.g:312:1: ruleIntersectionElement : ( ( rule__IntersectionElement__Alternatives ) ) ;
    public final void ruleIntersectionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__IntersectionElement__Alternatives ) ) )
            // InternalBurst.g:317:2: ( ( rule__IntersectionElement__Alternatives ) )
            {
            // InternalBurst.g:317:2: ( ( rule__IntersectionElement__Alternatives ) )
            // InternalBurst.g:318:3: ( rule__IntersectionElement__Alternatives )
            {
             before(grammarAccess.getIntersectionElementAccess().getAlternatives()); 
            // InternalBurst.g:319:3: ( rule__IntersectionElement__Alternatives )
            // InternalBurst.g:319:4: rule__IntersectionElement__Alternatives
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
    // InternalBurst.g:328:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleLine EOF )
            // InternalBurst.g:330:1: ruleLine EOF
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
    // InternalBurst.g:337:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__Line__Group__0 )
            // InternalBurst.g:344:4: rule__Line__Group__0
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
    // InternalBurst.g:353:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleCall EOF )
            // InternalBurst.g:355:1: ruleCall EOF
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
    // InternalBurst.g:362:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalBurst.g:367:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalBurst.g:367:2: ( ( rule__Call__Alternatives ) )
            // InternalBurst.g:368:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalBurst.g:369:3: ( rule__Call__Alternatives )
            // InternalBurst.g:369:4: rule__Call__Alternatives
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


    // $ANTLR start "entryRuleCallMember"
    // InternalBurst.g:378:1: entryRuleCallMember : ruleCallMember EOF ;
    public final void entryRuleCallMember() throws RecognitionException {
        try {
            // InternalBurst.g:379:1: ( ruleCallMember EOF )
            // InternalBurst.g:380:1: ruleCallMember EOF
            {
             before(grammarAccess.getCallMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleCallMember();

            state._fsp--;

             after(grammarAccess.getCallMemberRule()); 
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
    // $ANTLR end "entryRuleCallMember"


    // $ANTLR start "ruleCallMember"
    // InternalBurst.g:387:1: ruleCallMember : ( ( rule__CallMember__Group__0 ) ) ;
    public final void ruleCallMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:391:2: ( ( ( rule__CallMember__Group__0 ) ) )
            // InternalBurst.g:392:2: ( ( rule__CallMember__Group__0 ) )
            {
            // InternalBurst.g:392:2: ( ( rule__CallMember__Group__0 ) )
            // InternalBurst.g:393:3: ( rule__CallMember__Group__0 )
            {
             before(grammarAccess.getCallMemberAccess().getGroup()); 
            // InternalBurst.g:394:3: ( rule__CallMember__Group__0 )
            // InternalBurst.g:394:4: rule__CallMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleCallMember"


    // $ANTLR start "entryRuleCallMemberInConcern"
    // InternalBurst.g:403:1: entryRuleCallMemberInConcern : ruleCallMemberInConcern EOF ;
    public final void entryRuleCallMemberInConcern() throws RecognitionException {
        try {
            // InternalBurst.g:404:1: ( ruleCallMemberInConcern EOF )
            // InternalBurst.g:405:1: ruleCallMemberInConcern EOF
            {
             before(grammarAccess.getCallMemberInConcernRule()); 
            pushFollow(FOLLOW_1);
            ruleCallMemberInConcern();

            state._fsp--;

             after(grammarAccess.getCallMemberInConcernRule()); 
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
    // $ANTLR end "entryRuleCallMemberInConcern"


    // $ANTLR start "ruleCallMemberInConcern"
    // InternalBurst.g:412:1: ruleCallMemberInConcern : ( ( rule__CallMemberInConcern__Group__0 ) ) ;
    public final void ruleCallMemberInConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:2: ( ( ( rule__CallMemberInConcern__Group__0 ) ) )
            // InternalBurst.g:417:2: ( ( rule__CallMemberInConcern__Group__0 ) )
            {
            // InternalBurst.g:417:2: ( ( rule__CallMemberInConcern__Group__0 ) )
            // InternalBurst.g:418:3: ( rule__CallMemberInConcern__Group__0 )
            {
             before(grammarAccess.getCallMemberInConcernAccess().getGroup()); 
            // InternalBurst.g:419:3: ( rule__CallMemberInConcern__Group__0 )
            // InternalBurst.g:419:4: rule__CallMemberInConcern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallMemberInConcernAccess().getGroup()); 

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
    // $ANTLR end "ruleCallMemberInConcern"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:428:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:429:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:430:1: ruleQualifiedName EOF
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
    // InternalBurst.g:437:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:443:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:444:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:444:4: rule__QualifiedName__Group__0
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
    // InternalBurst.g:452:1: rule__RuleFileElement__Alternatives : ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) );
    public final void rule__RuleFileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:456:1: ( ( ruleRuleImport ) | ( ruleRulePackage ) | ( RULE_ENDLINE ) )
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
                    // InternalBurst.g:457:2: ( ruleRuleImport )
                    {
                    // InternalBurst.g:457:2: ( ruleRuleImport )
                    // InternalBurst.g:458:3: ruleRuleImport
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
                    // InternalBurst.g:463:2: ( ruleRulePackage )
                    {
                    // InternalBurst.g:463:2: ( ruleRulePackage )
                    // InternalBurst.g:464:3: ruleRulePackage
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
                    // InternalBurst.g:469:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:469:2: ( RULE_ENDLINE )
                    // InternalBurst.g:470:3: RULE_ENDLINE
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
    // InternalBurst.g:479:1: rule__PackageElement__Alternatives : ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:483:1: ( ( ruleRuleConcern ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) )
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
                    // InternalBurst.g:484:2: ( ruleRuleConcern )
                    {
                    // InternalBurst.g:484:2: ( ruleRuleConcern )
                    // InternalBurst.g:485:3: ruleRuleConcern
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
                    // InternalBurst.g:490:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:490:2: ( ruleRuleIntersect )
                    // InternalBurst.g:491:3: ruleRuleIntersect
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
                    // InternalBurst.g:496:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:496:2: ( RULE_ENDLINE )
                    // InternalBurst.g:497:3: RULE_ENDLINE
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
    // InternalBurst.g:506:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:510:1: ( ( ruleMember ) | ( ruleRuleIntersect ) | ( RULE_ENDLINE ) )
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
                    // InternalBurst.g:511:2: ( ruleMember )
                    {
                    // InternalBurst.g:511:2: ( ruleMember )
                    // InternalBurst.g:512:3: ruleMember
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
                    // InternalBurst.g:517:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:517:2: ( ruleRuleIntersect )
                    // InternalBurst.g:518:3: ruleRuleIntersect
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
                    // InternalBurst.g:523:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:523:2: ( RULE_ENDLINE )
                    // InternalBurst.g:524:3: RULE_ENDLINE
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
    // InternalBurst.g:533:1: rule__RuleIntersect__Alternatives_2_2 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:537:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:538:2: ( ',' )
                    {
                    // InternalBurst.g:538:2: ( ',' )
                    // InternalBurst.g:539:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:544:2: ( 'and' )
                    {
                    // InternalBurst.g:544:2: ( 'and' )
                    // InternalBurst.g:545:3: 'and'
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
    // InternalBurst.g:554:1: rule__IntersectionElement__Alternatives : ( ( ruleLine ) | ( RULE_ENDLINE ) );
    public final void rule__IntersectionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:558:1: ( ( ruleLine ) | ( RULE_ENDLINE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
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
                    // InternalBurst.g:559:2: ( ruleLine )
                    {
                    // InternalBurst.g:559:2: ( ruleLine )
                    // InternalBurst.g:560:3: ruleLine
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
                    // InternalBurst.g:565:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:565:2: ( RULE_ENDLINE )
                    // InternalBurst.g:566:3: RULE_ENDLINE
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
    // InternalBurst.g:575:1: rule__Call__Alternatives : ( ( ruleCallMemberInConcern ) | ( ruleCallMember ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:579:1: ( ( ruleCallMemberInConcern ) | ( ruleCallMember ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_ENDLINE && LA7_1<=RULE_ID)||LA7_1==17) ) {
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
                    // InternalBurst.g:580:2: ( ruleCallMemberInConcern )
                    {
                    // InternalBurst.g:580:2: ( ruleCallMemberInConcern )
                    // InternalBurst.g:581:3: ruleCallMemberInConcern
                    {
                     before(grammarAccess.getCallAccess().getCallMemberInConcernParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCallMemberInConcern();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getCallMemberInConcernParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:586:2: ( ruleCallMember )
                    {
                    // InternalBurst.g:586:2: ( ruleCallMember )
                    // InternalBurst.g:587:3: ruleCallMember
                    {
                     before(grammarAccess.getCallAccess().getCallMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCallMember();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getCallMemberParserRuleCall_1()); 

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
    // InternalBurst.g:596:1: rule__RuleImport__Group__0 : rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 ;
    public final void rule__RuleImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:600:1: ( rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1 )
            // InternalBurst.g:601:2: rule__RuleImport__Group__0__Impl rule__RuleImport__Group__1
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
    // InternalBurst.g:608:1: rule__RuleImport__Group__0__Impl : ( () ) ;
    public final void rule__RuleImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:612:1: ( ( () ) )
            // InternalBurst.g:613:1: ( () )
            {
            // InternalBurst.g:613:1: ( () )
            // InternalBurst.g:614:2: ()
            {
             before(grammarAccess.getRuleImportAccess().getImportAction_0()); 
            // InternalBurst.g:615:2: ()
            // InternalBurst.g:615:3: 
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
    // InternalBurst.g:623:1: rule__RuleImport__Group__1 : rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 ;
    public final void rule__RuleImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:627:1: ( rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2 )
            // InternalBurst.g:628:2: rule__RuleImport__Group__1__Impl rule__RuleImport__Group__2
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
    // InternalBurst.g:635:1: rule__RuleImport__Group__1__Impl : ( 'import' ) ;
    public final void rule__RuleImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:639:1: ( ( 'import' ) )
            // InternalBurst.g:640:1: ( 'import' )
            {
            // InternalBurst.g:640:1: ( 'import' )
            // InternalBurst.g:641:2: 'import'
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
    // InternalBurst.g:650:1: rule__RuleImport__Group__2 : rule__RuleImport__Group__2__Impl ;
    public final void rule__RuleImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:654:1: ( rule__RuleImport__Group__2__Impl )
            // InternalBurst.g:655:2: rule__RuleImport__Group__2__Impl
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
    // InternalBurst.g:661:1: rule__RuleImport__Group__2__Impl : ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__RuleImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:665:1: ( ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:666:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:666:1: ( ( rule__RuleImport__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:667:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getRuleImportAccess().getImportedNamespaceAssignment_2()); 
            // InternalBurst.g:668:2: ( rule__RuleImport__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:668:3: rule__RuleImport__ImportedNamespaceAssignment_2
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
    // InternalBurst.g:677:1: rule__RulePackage__Group__0 : rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 ;
    public final void rule__RulePackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:681:1: ( rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1 )
            // InternalBurst.g:682:2: rule__RulePackage__Group__0__Impl rule__RulePackage__Group__1
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
    // InternalBurst.g:689:1: rule__RulePackage__Group__0__Impl : ( () ) ;
    public final void rule__RulePackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:693:1: ( ( () ) )
            // InternalBurst.g:694:1: ( () )
            {
            // InternalBurst.g:694:1: ( () )
            // InternalBurst.g:695:2: ()
            {
             before(grammarAccess.getRulePackageAccess().getPackageAction_0()); 
            // InternalBurst.g:696:2: ()
            // InternalBurst.g:696:3: 
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
    // InternalBurst.g:704:1: rule__RulePackage__Group__1 : rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 ;
    public final void rule__RulePackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:708:1: ( rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2 )
            // InternalBurst.g:709:2: rule__RulePackage__Group__1__Impl rule__RulePackage__Group__2
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
    // InternalBurst.g:716:1: rule__RulePackage__Group__1__Impl : ( 'package' ) ;
    public final void rule__RulePackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:720:1: ( ( 'package' ) )
            // InternalBurst.g:721:1: ( 'package' )
            {
            // InternalBurst.g:721:1: ( 'package' )
            // InternalBurst.g:722:2: 'package'
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
    // InternalBurst.g:731:1: rule__RulePackage__Group__2 : rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 ;
    public final void rule__RulePackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:735:1: ( rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3 )
            // InternalBurst.g:736:2: rule__RulePackage__Group__2__Impl rule__RulePackage__Group__3
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
    // InternalBurst.g:743:1: rule__RulePackage__Group__2__Impl : ( ( rule__RulePackage__NameAssignment_2 ) ) ;
    public final void rule__RulePackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:747:1: ( ( ( rule__RulePackage__NameAssignment_2 ) ) )
            // InternalBurst.g:748:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            {
            // InternalBurst.g:748:1: ( ( rule__RulePackage__NameAssignment_2 ) )
            // InternalBurst.g:749:2: ( rule__RulePackage__NameAssignment_2 )
            {
             before(grammarAccess.getRulePackageAccess().getNameAssignment_2()); 
            // InternalBurst.g:750:2: ( rule__RulePackage__NameAssignment_2 )
            // InternalBurst.g:750:3: rule__RulePackage__NameAssignment_2
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
    // InternalBurst.g:758:1: rule__RulePackage__Group__3 : rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 ;
    public final void rule__RulePackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:762:1: ( rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4 )
            // InternalBurst.g:763:2: rule__RulePackage__Group__3__Impl rule__RulePackage__Group__4
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
    // InternalBurst.g:770:1: rule__RulePackage__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RulePackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:774:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:775:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:775:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:776:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3()); 
            // InternalBurst.g:777:2: ( RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ENDLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:777:3: RULE_ENDLINE
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
    // InternalBurst.g:785:1: rule__RulePackage__Group__4 : rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 ;
    public final void rule__RulePackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:789:1: ( rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5 )
            // InternalBurst.g:790:2: rule__RulePackage__Group__4__Impl rule__RulePackage__Group__5
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
    // InternalBurst.g:797:1: rule__RulePackage__Group__4__Impl : ( '{' ) ;
    public final void rule__RulePackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:801:1: ( ( '{' ) )
            // InternalBurst.g:802:1: ( '{' )
            {
            // InternalBurst.g:802:1: ( '{' )
            // InternalBurst.g:803:2: '{'
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
    // InternalBurst.g:812:1: rule__RulePackage__Group__5 : rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 ;
    public final void rule__RulePackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:816:1: ( rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6 )
            // InternalBurst.g:817:2: rule__RulePackage__Group__5__Impl rule__RulePackage__Group__6
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
    // InternalBurst.g:824:1: rule__RulePackage__Group__5__Impl : ( ( rule__RulePackage__ElementsAssignment_5 )* ) ;
    public final void rule__RulePackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:828:1: ( ( ( rule__RulePackage__ElementsAssignment_5 )* ) )
            // InternalBurst.g:829:1: ( ( rule__RulePackage__ElementsAssignment_5 )* )
            {
            // InternalBurst.g:829:1: ( ( rule__RulePackage__ElementsAssignment_5 )* )
            // InternalBurst.g:830:2: ( rule__RulePackage__ElementsAssignment_5 )*
            {
             before(grammarAccess.getRulePackageAccess().getElementsAssignment_5()); 
            // InternalBurst.g:831:2: ( rule__RulePackage__ElementsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ENDLINE||LA9_0==18||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:831:3: rule__RulePackage__ElementsAssignment_5
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
    // InternalBurst.g:839:1: rule__RulePackage__Group__6 : rule__RulePackage__Group__6__Impl ;
    public final void rule__RulePackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:843:1: ( rule__RulePackage__Group__6__Impl )
            // InternalBurst.g:844:2: rule__RulePackage__Group__6__Impl
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
    // InternalBurst.g:850:1: rule__RulePackage__Group__6__Impl : ( '}' ) ;
    public final void rule__RulePackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:854:1: ( ( '}' ) )
            // InternalBurst.g:855:1: ( '}' )
            {
            // InternalBurst.g:855:1: ( '}' )
            // InternalBurst.g:856:2: '}'
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
    // InternalBurst.g:866:1: rule__RuleConcern__Group__0 : rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 ;
    public final void rule__RuleConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:870:1: ( rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1 )
            // InternalBurst.g:871:2: rule__RuleConcern__Group__0__Impl rule__RuleConcern__Group__1
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
    // InternalBurst.g:878:1: rule__RuleConcern__Group__0__Impl : ( () ) ;
    public final void rule__RuleConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:882:1: ( ( () ) )
            // InternalBurst.g:883:1: ( () )
            {
            // InternalBurst.g:883:1: ( () )
            // InternalBurst.g:884:2: ()
            {
             before(grammarAccess.getRuleConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:885:2: ()
            // InternalBurst.g:885:3: 
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
    // InternalBurst.g:893:1: rule__RuleConcern__Group__1 : rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 ;
    public final void rule__RuleConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:897:1: ( rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2 )
            // InternalBurst.g:898:2: rule__RuleConcern__Group__1__Impl rule__RuleConcern__Group__2
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
    // InternalBurst.g:905:1: rule__RuleConcern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__RuleConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:909:1: ( ( 'concern' ) )
            // InternalBurst.g:910:1: ( 'concern' )
            {
            // InternalBurst.g:910:1: ( 'concern' )
            // InternalBurst.g:911:2: 'concern'
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
    // InternalBurst.g:920:1: rule__RuleConcern__Group__2 : rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 ;
    public final void rule__RuleConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:924:1: ( rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3 )
            // InternalBurst.g:925:2: rule__RuleConcern__Group__2__Impl rule__RuleConcern__Group__3
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
    // InternalBurst.g:932:1: rule__RuleConcern__Group__2__Impl : ( ( rule__RuleConcern__NameAssignment_2 ) ) ;
    public final void rule__RuleConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:936:1: ( ( ( rule__RuleConcern__NameAssignment_2 ) ) )
            // InternalBurst.g:937:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            {
            // InternalBurst.g:937:1: ( ( rule__RuleConcern__NameAssignment_2 ) )
            // InternalBurst.g:938:2: ( rule__RuleConcern__NameAssignment_2 )
            {
             before(grammarAccess.getRuleConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:939:2: ( rule__RuleConcern__NameAssignment_2 )
            // InternalBurst.g:939:3: rule__RuleConcern__NameAssignment_2
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
    // InternalBurst.g:947:1: rule__RuleConcern__Group__3 : rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 ;
    public final void rule__RuleConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:951:1: ( rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4 )
            // InternalBurst.g:952:2: rule__RuleConcern__Group__3__Impl rule__RuleConcern__Group__4
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
    // InternalBurst.g:959:1: rule__RuleConcern__Group__3__Impl : ( ( rule__RuleConcern__Group_3__0 )? ) ;
    public final void rule__RuleConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:963:1: ( ( ( rule__RuleConcern__Group_3__0 )? ) )
            // InternalBurst.g:964:1: ( ( rule__RuleConcern__Group_3__0 )? )
            {
            // InternalBurst.g:964:1: ( ( rule__RuleConcern__Group_3__0 )? )
            // InternalBurst.g:965:2: ( rule__RuleConcern__Group_3__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_3()); 
            // InternalBurst.g:966:2: ( rule__RuleConcern__Group_3__0 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:966:3: rule__RuleConcern__Group_3__0
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
    // InternalBurst.g:974:1: rule__RuleConcern__Group__4 : rule__RuleConcern__Group__4__Impl ;
    public final void rule__RuleConcern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:978:1: ( rule__RuleConcern__Group__4__Impl )
            // InternalBurst.g:979:2: rule__RuleConcern__Group__4__Impl
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
    // InternalBurst.g:985:1: rule__RuleConcern__Group__4__Impl : ( ( rule__RuleConcern__Group_4__0 )? ) ;
    public final void rule__RuleConcern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:989:1: ( ( ( rule__RuleConcern__Group_4__0 )? ) )
            // InternalBurst.g:990:1: ( ( rule__RuleConcern__Group_4__0 )? )
            {
            // InternalBurst.g:990:1: ( ( rule__RuleConcern__Group_4__0 )? )
            // InternalBurst.g:991:2: ( rule__RuleConcern__Group_4__0 )?
            {
             before(grammarAccess.getRuleConcernAccess().getGroup_4()); 
            // InternalBurst.g:992:2: ( rule__RuleConcern__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBurst.g:992:3: rule__RuleConcern__Group_4__0
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
    // InternalBurst.g:1001:1: rule__RuleConcern__Group_3__0 : rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 ;
    public final void rule__RuleConcern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1005:1: ( rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1 )
            // InternalBurst.g:1006:2: rule__RuleConcern__Group_3__0__Impl rule__RuleConcern__Group_3__1
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
    // InternalBurst.g:1013:1: rule__RuleConcern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1017:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1018:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1018:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1019:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            // InternalBurst.g:1020:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1020:3: RULE_ENDLINE
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
    // InternalBurst.g:1028:1: rule__RuleConcern__Group_3__1 : rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 ;
    public final void rule__RuleConcern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1032:1: ( rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2 )
            // InternalBurst.g:1033:2: rule__RuleConcern__Group_3__1__Impl rule__RuleConcern__Group_3__2
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
    // InternalBurst.g:1040:1: rule__RuleConcern__Group_3__1__Impl : ( 'extends' ) ;
    public final void rule__RuleConcern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1044:1: ( ( 'extends' ) )
            // InternalBurst.g:1045:1: ( 'extends' )
            {
            // InternalBurst.g:1045:1: ( 'extends' )
            // InternalBurst.g:1046:2: 'extends'
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
    // InternalBurst.g:1055:1: rule__RuleConcern__Group_3__2 : rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 ;
    public final void rule__RuleConcern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1059:1: ( rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3 )
            // InternalBurst.g:1060:2: rule__RuleConcern__Group_3__2__Impl rule__RuleConcern__Group_3__3
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
    // InternalBurst.g:1067:1: rule__RuleConcern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleConcern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1071:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1072:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1072:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1073:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            // InternalBurst.g:1074:2: ( RULE_ENDLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ENDLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1074:3: RULE_ENDLINE
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
    // InternalBurst.g:1082:1: rule__RuleConcern__Group_3__3 : rule__RuleConcern__Group_3__3__Impl ;
    public final void rule__RuleConcern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1086:1: ( rule__RuleConcern__Group_3__3__Impl )
            // InternalBurst.g:1087:2: rule__RuleConcern__Group_3__3__Impl
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
    // InternalBurst.g:1093:1: rule__RuleConcern__Group_3__3__Impl : ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) ;
    public final void rule__RuleConcern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1097:1: ( ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) ) )
            // InternalBurst.g:1098:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            {
            // InternalBurst.g:1098:1: ( ( rule__RuleConcern__SupertypeAssignment_3_3 ) )
            // InternalBurst.g:1099:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeAssignment_3_3()); 
            // InternalBurst.g:1100:2: ( rule__RuleConcern__SupertypeAssignment_3_3 )
            // InternalBurst.g:1100:3: rule__RuleConcern__SupertypeAssignment_3_3
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
    // InternalBurst.g:1109:1: rule__RuleConcern__Group_4__0 : rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 ;
    public final void rule__RuleConcern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1113:1: ( rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1 )
            // InternalBurst.g:1114:2: rule__RuleConcern__Group_4__0__Impl rule__RuleConcern__Group_4__1
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
    // InternalBurst.g:1121:1: rule__RuleConcern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__RuleConcern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1125:1: ( ( '{' ) )
            // InternalBurst.g:1126:1: ( '{' )
            {
            // InternalBurst.g:1126:1: ( '{' )
            // InternalBurst.g:1127:2: '{'
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
    // InternalBurst.g:1136:1: rule__RuleConcern__Group_4__1 : rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 ;
    public final void rule__RuleConcern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1140:1: ( rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2 )
            // InternalBurst.g:1141:2: rule__RuleConcern__Group_4__1__Impl rule__RuleConcern__Group_4__2
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
    // InternalBurst.g:1148:1: rule__RuleConcern__Group_4__1__Impl : ( ( rule__RuleConcern__ElementsAssignment_4_1 )* ) ;
    public final void rule__RuleConcern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1152:1: ( ( ( rule__RuleConcern__ElementsAssignment_4_1 )* ) )
            // InternalBurst.g:1153:1: ( ( rule__RuleConcern__ElementsAssignment_4_1 )* )
            {
            // InternalBurst.g:1153:1: ( ( rule__RuleConcern__ElementsAssignment_4_1 )* )
            // InternalBurst.g:1154:2: ( rule__RuleConcern__ElementsAssignment_4_1 )*
            {
             before(grammarAccess.getRuleConcernAccess().getElementsAssignment_4_1()); 
            // InternalBurst.g:1155:2: ( rule__RuleConcern__ElementsAssignment_4_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ENDLINE && LA14_0<=RULE_ID)||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1155:3: rule__RuleConcern__ElementsAssignment_4_1
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
    // InternalBurst.g:1163:1: rule__RuleConcern__Group_4__2 : rule__RuleConcern__Group_4__2__Impl ;
    public final void rule__RuleConcern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1167:1: ( rule__RuleConcern__Group_4__2__Impl )
            // InternalBurst.g:1168:2: rule__RuleConcern__Group_4__2__Impl
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
    // InternalBurst.g:1174:1: rule__RuleConcern__Group_4__2__Impl : ( '}' ) ;
    public final void rule__RuleConcern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1178:1: ( ( '}' ) )
            // InternalBurst.g:1179:1: ( '}' )
            {
            // InternalBurst.g:1179:1: ( '}' )
            // InternalBurst.g:1180:2: '}'
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


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:1190:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1194:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:1195:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalBurst.g:1202:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1206:1: ( ( () ) )
            // InternalBurst.g:1207:1: ( () )
            {
            // InternalBurst.g:1207:1: ( () )
            // InternalBurst.g:1208:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:1209:2: ()
            // InternalBurst.g:1209:3: 
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
    // InternalBurst.g:1217:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1221:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:1222:2: rule__Member__Group__1__Impl rule__Member__Group__2
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
    // InternalBurst.g:1229:1: rule__Member__Group__1__Impl : ( ( rule__Member__ConcernAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1233:1: ( ( ( rule__Member__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1234:1: ( ( rule__Member__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1234:1: ( ( rule__Member__ConcernAssignment_1 ) )
            // InternalBurst.g:1235:2: ( rule__Member__ConcernAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1236:2: ( rule__Member__ConcernAssignment_1 )
            // InternalBurst.g:1236:3: rule__Member__ConcernAssignment_1
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
    // InternalBurst.g:1244:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1248:1: ( rule__Member__Group__2__Impl )
            // InternalBurst.g:1249:2: rule__Member__Group__2__Impl
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
    // InternalBurst.g:1255:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1259:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // InternalBurst.g:1260:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // InternalBurst.g:1260:1: ( ( rule__Member__NameAssignment_2 ) )
            // InternalBurst.g:1261:2: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:1262:2: ( rule__Member__NameAssignment_2 )
            // InternalBurst.g:1262:3: rule__Member__NameAssignment_2
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
    // InternalBurst.g:1271:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1275:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:1276:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
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
    // InternalBurst.g:1283:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1287:1: ( ( () ) )
            // InternalBurst.g:1288:1: ( () )
            {
            // InternalBurst.g:1288:1: ( () )
            // InternalBurst.g:1289:2: ()
            {
             before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1290:2: ()
            // InternalBurst.g:1290:3: 
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
    // InternalBurst.g:1298:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1302:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:1303:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
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
    // InternalBurst.g:1310:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1314:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:1315:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:1315:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:1316:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            // InternalBurst.g:1317:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:1317:3: rule__RuleIntersect__NameAssignment_1
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
    // InternalBurst.g:1325:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1329:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:1330:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
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
    // InternalBurst.g:1337:1: rule__RuleIntersect__Group__2__Impl : ( ( rule__RuleIntersect__Group_2__0 )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1341:1: ( ( ( rule__RuleIntersect__Group_2__0 )* ) )
            // InternalBurst.g:1342:1: ( ( rule__RuleIntersect__Group_2__0 )* )
            {
            // InternalBurst.g:1342:1: ( ( rule__RuleIntersect__Group_2__0 )* )
            // InternalBurst.g:1343:2: ( rule__RuleIntersect__Group_2__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_2()); 
            // InternalBurst.g:1344:2: ( rule__RuleIntersect__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ENDLINE && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1344:3: rule__RuleIntersect__Group_2__0
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
    // InternalBurst.g:1352:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1356:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:1357:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
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
    // InternalBurst.g:1364:1: rule__RuleIntersect__Group__3__Impl : ( '{' ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1368:1: ( ( '{' ) )
            // InternalBurst.g:1369:1: ( '{' )
            {
            // InternalBurst.g:1369:1: ( '{' )
            // InternalBurst.g:1370:2: '{'
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
    // InternalBurst.g:1379:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1383:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:1384:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
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
    // InternalBurst.g:1391:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__LinesAssignment_4 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1395:1: ( ( ( rule__RuleIntersect__LinesAssignment_4 )* ) )
            // InternalBurst.g:1396:1: ( ( rule__RuleIntersect__LinesAssignment_4 )* )
            {
            // InternalBurst.g:1396:1: ( ( rule__RuleIntersect__LinesAssignment_4 )* )
            // InternalBurst.g:1397:2: ( rule__RuleIntersect__LinesAssignment_4 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesAssignment_4()); 
            // InternalBurst.g:1398:2: ( rule__RuleIntersect__LinesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ENDLINE && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1398:3: rule__RuleIntersect__LinesAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
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
    // InternalBurst.g:1406:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1410:1: ( rule__RuleIntersect__Group__5__Impl )
            // InternalBurst.g:1411:2: rule__RuleIntersect__Group__5__Impl
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
    // InternalBurst.g:1417:1: rule__RuleIntersect__Group__5__Impl : ( '}' ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1421:1: ( ( '}' ) )
            // InternalBurst.g:1422:1: ( '}' )
            {
            // InternalBurst.g:1422:1: ( '}' )
            // InternalBurst.g:1423:2: '}'
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
    // InternalBurst.g:1433:1: rule__RuleIntersect__Group_2__0 : rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1 ;
    public final void rule__RuleIntersect__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1437:1: ( rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1 )
            // InternalBurst.g:1438:2: rule__RuleIntersect__Group_2__0__Impl rule__RuleIntersect__Group_2__1
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
    // InternalBurst.g:1445:1: rule__RuleIntersect__Group_2__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1449:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1450:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1450:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1451:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2_0()); 
            // InternalBurst.g:1452:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1452:3: RULE_ENDLINE
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
    // InternalBurst.g:1460:1: rule__RuleIntersect__Group_2__1 : rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2 ;
    public final void rule__RuleIntersect__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1464:1: ( rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2 )
            // InternalBurst.g:1465:2: rule__RuleIntersect__Group_2__1__Impl rule__RuleIntersect__Group_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBurst.g:1472:1: rule__RuleIntersect__Group_2__1__Impl : ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) ) ;
    public final void rule__RuleIntersect__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1476:1: ( ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) ) )
            // InternalBurst.g:1477:1: ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) )
            {
            // InternalBurst.g:1477:1: ( ( rule__RuleIntersect__ParametersAssignment_2_1 ) )
            // InternalBurst.g:1478:2: ( rule__RuleIntersect__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersAssignment_2_1()); 
            // InternalBurst.g:1479:2: ( rule__RuleIntersect__ParametersAssignment_2_1 )
            // InternalBurst.g:1479:3: rule__RuleIntersect__ParametersAssignment_2_1
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
    // InternalBurst.g:1487:1: rule__RuleIntersect__Group_2__2 : rule__RuleIntersect__Group_2__2__Impl ;
    public final void rule__RuleIntersect__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1491:1: ( rule__RuleIntersect__Group_2__2__Impl )
            // InternalBurst.g:1492:2: rule__RuleIntersect__Group_2__2__Impl
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
    // InternalBurst.g:1498:1: rule__RuleIntersect__Group_2__2__Impl : ( ( rule__RuleIntersect__Alternatives_2_2 )? ) ;
    public final void rule__RuleIntersect__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1502:1: ( ( ( rule__RuleIntersect__Alternatives_2_2 )? ) )
            // InternalBurst.g:1503:1: ( ( rule__RuleIntersect__Alternatives_2_2 )? )
            {
            // InternalBurst.g:1503:1: ( ( rule__RuleIntersect__Alternatives_2_2 )? )
            // InternalBurst.g:1504:2: ( rule__RuleIntersect__Alternatives_2_2 )?
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_2_2()); 
            // InternalBurst.g:1505:2: ( rule__RuleIntersect__Alternatives_2_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=12 && LA18_0<=13)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:1505:3: rule__RuleIntersect__Alternatives_2_2
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalBurst.g:1514:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1518:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalBurst.g:1519:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalBurst.g:1526:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1530:1: ( ( () ) )
            // InternalBurst.g:1531:1: ( () )
            {
            // InternalBurst.g:1531:1: ( () )
            // InternalBurst.g:1532:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalBurst.g:1533:2: ()
            // InternalBurst.g:1533:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalBurst.g:1541:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1545:1: ( rule__Parameter__Group__1__Impl )
            // InternalBurst.g:1546:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalBurst.g:1552:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1556:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalBurst.g:1557:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalBurst.g:1557:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalBurst.g:1558:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalBurst.g:1559:2: ( rule__Parameter__NameAssignment_1 )
            // InternalBurst.g:1559:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalBurst.g:1568:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1572:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:1573:2: rule__Line__Group__0__Impl rule__Line__Group__1
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
    // InternalBurst.g:1580:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1584:1: ( ( () ) )
            // InternalBurst.g:1585:1: ( () )
            {
            // InternalBurst.g:1585:1: ( () )
            // InternalBurst.g:1586:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalBurst.g:1587:2: ()
            // InternalBurst.g:1587:3: 
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
    // InternalBurst.g:1595:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1599:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBurst.g:1600:2: rule__Line__Group__1__Impl rule__Line__Group__2
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
    // InternalBurst.g:1607:1: rule__Line__Group__1__Impl : ( ( rule__Line__CallsAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1611:1: ( ( ( rule__Line__CallsAssignment_1 ) ) )
            // InternalBurst.g:1612:1: ( ( rule__Line__CallsAssignment_1 ) )
            {
            // InternalBurst.g:1612:1: ( ( rule__Line__CallsAssignment_1 ) )
            // InternalBurst.g:1613:2: ( rule__Line__CallsAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_1()); 
            // InternalBurst.g:1614:2: ( rule__Line__CallsAssignment_1 )
            // InternalBurst.g:1614:3: rule__Line__CallsAssignment_1
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
    // InternalBurst.g:1622:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1626:1: ( rule__Line__Group__2__Impl )
            // InternalBurst.g:1627:2: rule__Line__Group__2__Impl
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
    // InternalBurst.g:1633:1: rule__Line__Group__2__Impl : ( ( rule__Line__CallsAssignment_2 )* ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1637:1: ( ( ( rule__Line__CallsAssignment_2 )* ) )
            // InternalBurst.g:1638:1: ( ( rule__Line__CallsAssignment_2 )* )
            {
            // InternalBurst.g:1638:1: ( ( rule__Line__CallsAssignment_2 )* )
            // InternalBurst.g:1639:2: ( rule__Line__CallsAssignment_2 )*
            {
             before(grammarAccess.getLineAccess().getCallsAssignment_2()); 
            // InternalBurst.g:1640:2: ( rule__Line__CallsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1640:3: rule__Line__CallsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
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


    // $ANTLR start "rule__CallMember__Group__0"
    // InternalBurst.g:1649:1: rule__CallMember__Group__0 : rule__CallMember__Group__0__Impl rule__CallMember__Group__1 ;
    public final void rule__CallMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1653:1: ( rule__CallMember__Group__0__Impl rule__CallMember__Group__1 )
            // InternalBurst.g:1654:2: rule__CallMember__Group__0__Impl rule__CallMember__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CallMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMember__Group__1();

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
    // $ANTLR end "rule__CallMember__Group__0"


    // $ANTLR start "rule__CallMember__Group__0__Impl"
    // InternalBurst.g:1661:1: rule__CallMember__Group__0__Impl : ( () ) ;
    public final void rule__CallMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1665:1: ( ( () ) )
            // InternalBurst.g:1666:1: ( () )
            {
            // InternalBurst.g:1666:1: ( () )
            // InternalBurst.g:1667:2: ()
            {
             before(grammarAccess.getCallMemberAccess().getCallMemberAction_0()); 
            // InternalBurst.g:1668:2: ()
            // InternalBurst.g:1668:3: 
            {
            }

             after(grammarAccess.getCallMemberAccess().getCallMemberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMember__Group__0__Impl"


    // $ANTLR start "rule__CallMember__Group__1"
    // InternalBurst.g:1676:1: rule__CallMember__Group__1 : rule__CallMember__Group__1__Impl ;
    public final void rule__CallMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1680:1: ( rule__CallMember__Group__1__Impl )
            // InternalBurst.g:1681:2: rule__CallMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallMember__Group__1__Impl();

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
    // $ANTLR end "rule__CallMember__Group__1"


    // $ANTLR start "rule__CallMember__Group__1__Impl"
    // InternalBurst.g:1687:1: rule__CallMember__Group__1__Impl : ( ( rule__CallMember__NameAssignment_1 ) ) ;
    public final void rule__CallMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1691:1: ( ( ( rule__CallMember__NameAssignment_1 ) ) )
            // InternalBurst.g:1692:1: ( ( rule__CallMember__NameAssignment_1 ) )
            {
            // InternalBurst.g:1692:1: ( ( rule__CallMember__NameAssignment_1 ) )
            // InternalBurst.g:1693:2: ( rule__CallMember__NameAssignment_1 )
            {
             before(grammarAccess.getCallMemberAccess().getNameAssignment_1()); 
            // InternalBurst.g:1694:2: ( rule__CallMember__NameAssignment_1 )
            // InternalBurst.g:1694:3: rule__CallMember__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CallMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallMemberAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CallMember__Group__1__Impl"


    // $ANTLR start "rule__CallMemberInConcern__Group__0"
    // InternalBurst.g:1703:1: rule__CallMemberInConcern__Group__0 : rule__CallMemberInConcern__Group__0__Impl rule__CallMemberInConcern__Group__1 ;
    public final void rule__CallMemberInConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1707:1: ( rule__CallMemberInConcern__Group__0__Impl rule__CallMemberInConcern__Group__1 )
            // InternalBurst.g:1708:2: rule__CallMemberInConcern__Group__0__Impl rule__CallMemberInConcern__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CallMemberInConcern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__Group__1();

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
    // $ANTLR end "rule__CallMemberInConcern__Group__0"


    // $ANTLR start "rule__CallMemberInConcern__Group__0__Impl"
    // InternalBurst.g:1715:1: rule__CallMemberInConcern__Group__0__Impl : ( () ) ;
    public final void rule__CallMemberInConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1719:1: ( ( () ) )
            // InternalBurst.g:1720:1: ( () )
            {
            // InternalBurst.g:1720:1: ( () )
            // InternalBurst.g:1721:2: ()
            {
             before(grammarAccess.getCallMemberInConcernAccess().getMemberInConcernAction_0()); 
            // InternalBurst.g:1722:2: ()
            // InternalBurst.g:1722:3: 
            {
            }

             after(grammarAccess.getCallMemberInConcernAccess().getMemberInConcernAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMemberInConcern__Group__0__Impl"


    // $ANTLR start "rule__CallMemberInConcern__Group__1"
    // InternalBurst.g:1730:1: rule__CallMemberInConcern__Group__1 : rule__CallMemberInConcern__Group__1__Impl rule__CallMemberInConcern__Group__2 ;
    public final void rule__CallMemberInConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1734:1: ( rule__CallMemberInConcern__Group__1__Impl rule__CallMemberInConcern__Group__2 )
            // InternalBurst.g:1735:2: rule__CallMemberInConcern__Group__1__Impl rule__CallMemberInConcern__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CallMemberInConcern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__Group__2();

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
    // $ANTLR end "rule__CallMemberInConcern__Group__1"


    // $ANTLR start "rule__CallMemberInConcern__Group__1__Impl"
    // InternalBurst.g:1742:1: rule__CallMemberInConcern__Group__1__Impl : ( ( rule__CallMemberInConcern__TargetAssignment_1 ) ) ;
    public final void rule__CallMemberInConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1746:1: ( ( ( rule__CallMemberInConcern__TargetAssignment_1 ) ) )
            // InternalBurst.g:1747:1: ( ( rule__CallMemberInConcern__TargetAssignment_1 ) )
            {
            // InternalBurst.g:1747:1: ( ( rule__CallMemberInConcern__TargetAssignment_1 ) )
            // InternalBurst.g:1748:2: ( rule__CallMemberInConcern__TargetAssignment_1 )
            {
             before(grammarAccess.getCallMemberInConcernAccess().getTargetAssignment_1()); 
            // InternalBurst.g:1749:2: ( rule__CallMemberInConcern__TargetAssignment_1 )
            // InternalBurst.g:1749:3: rule__CallMemberInConcern__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallMemberInConcernAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__CallMemberInConcern__Group__1__Impl"


    // $ANTLR start "rule__CallMemberInConcern__Group__2"
    // InternalBurst.g:1757:1: rule__CallMemberInConcern__Group__2 : rule__CallMemberInConcern__Group__2__Impl rule__CallMemberInConcern__Group__3 ;
    public final void rule__CallMemberInConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1761:1: ( rule__CallMemberInConcern__Group__2__Impl rule__CallMemberInConcern__Group__3 )
            // InternalBurst.g:1762:2: rule__CallMemberInConcern__Group__2__Impl rule__CallMemberInConcern__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CallMemberInConcern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__Group__3();

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
    // $ANTLR end "rule__CallMemberInConcern__Group__2"


    // $ANTLR start "rule__CallMemberInConcern__Group__2__Impl"
    // InternalBurst.g:1769:1: rule__CallMemberInConcern__Group__2__Impl : ( '.' ) ;
    public final void rule__CallMemberInConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1773:1: ( ( '.' ) )
            // InternalBurst.g:1774:1: ( '.' )
            {
            // InternalBurst.g:1774:1: ( '.' )
            // InternalBurst.g:1775:2: '.'
            {
             before(grammarAccess.getCallMemberInConcernAccess().getFullStopKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCallMemberInConcernAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__CallMemberInConcern__Group__2__Impl"


    // $ANTLR start "rule__CallMemberInConcern__Group__3"
    // InternalBurst.g:1784:1: rule__CallMemberInConcern__Group__3 : rule__CallMemberInConcern__Group__3__Impl ;
    public final void rule__CallMemberInConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1788:1: ( rule__CallMemberInConcern__Group__3__Impl )
            // InternalBurst.g:1789:2: rule__CallMemberInConcern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__Group__3__Impl();

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
    // $ANTLR end "rule__CallMemberInConcern__Group__3"


    // $ANTLR start "rule__CallMemberInConcern__Group__3__Impl"
    // InternalBurst.g:1795:1: rule__CallMemberInConcern__Group__3__Impl : ( ( rule__CallMemberInConcern__NameAssignment_3 ) ) ;
    public final void rule__CallMemberInConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1799:1: ( ( ( rule__CallMemberInConcern__NameAssignment_3 ) ) )
            // InternalBurst.g:1800:1: ( ( rule__CallMemberInConcern__NameAssignment_3 ) )
            {
            // InternalBurst.g:1800:1: ( ( rule__CallMemberInConcern__NameAssignment_3 ) )
            // InternalBurst.g:1801:2: ( rule__CallMemberInConcern__NameAssignment_3 )
            {
             before(grammarAccess.getCallMemberInConcernAccess().getNameAssignment_3()); 
            // InternalBurst.g:1802:2: ( rule__CallMemberInConcern__NameAssignment_3 )
            // InternalBurst.g:1802:3: rule__CallMemberInConcern__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CallMemberInConcern__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCallMemberInConcernAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__CallMemberInConcern__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:1811:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1815:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:1816:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBurst.g:1823:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1827:1: ( ( RULE_ID ) )
            // InternalBurst.g:1828:1: ( RULE_ID )
            {
            // InternalBurst.g:1828:1: ( RULE_ID )
            // InternalBurst.g:1829:2: RULE_ID
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
    // InternalBurst.g:1838:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1842:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:1843:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:1849:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1853:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:1854:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:1854:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:1855:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:1856:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1856:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalBurst.g:1865:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1869:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:1870:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:1877:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1881:1: ( ( '.' ) )
            // InternalBurst.g:1882:1: ( '.' )
            {
            // InternalBurst.g:1882:1: ( '.' )
            // InternalBurst.g:1883:2: '.'
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
    // InternalBurst.g:1892:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1896:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:1897:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:1903:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1907:1: ( ( RULE_ID ) )
            // InternalBurst.g:1908:1: ( RULE_ID )
            {
            // InternalBurst.g:1908:1: ( RULE_ID )
            // InternalBurst.g:1909:2: RULE_ID
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
    // InternalBurst.g:1919:1: rule__File__ElementsAssignment : ( ruleRuleFileElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1923:1: ( ( ruleRuleFileElement ) )
            // InternalBurst.g:1924:2: ( ruleRuleFileElement )
            {
            // InternalBurst.g:1924:2: ( ruleRuleFileElement )
            // InternalBurst.g:1925:3: ruleRuleFileElement
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
    // InternalBurst.g:1934:1: rule__RuleImport__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RuleImport__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1938:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1939:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1939:2: ( ruleQualifiedName )
            // InternalBurst.g:1940:3: ruleQualifiedName
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
    // InternalBurst.g:1949:1: rule__RulePackage__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__RulePackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1953:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1954:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1954:2: ( ruleQualifiedName )
            // InternalBurst.g:1955:3: ruleQualifiedName
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
    // InternalBurst.g:1964:1: rule__RulePackage__ElementsAssignment_5 : ( rulePackageElement ) ;
    public final void rule__RulePackage__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1968:1: ( ( rulePackageElement ) )
            // InternalBurst.g:1969:2: ( rulePackageElement )
            {
            // InternalBurst.g:1969:2: ( rulePackageElement )
            // InternalBurst.g:1970:3: rulePackageElement
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
    // InternalBurst.g:1979:1: rule__RuleConcern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RuleConcern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1983:1: ( ( RULE_ID ) )
            // InternalBurst.g:1984:2: ( RULE_ID )
            {
            // InternalBurst.g:1984:2: ( RULE_ID )
            // InternalBurst.g:1985:3: RULE_ID
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
    // InternalBurst.g:1994:1: rule__RuleConcern__SupertypeAssignment_3_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RuleConcern__SupertypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1998:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1999:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1999:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2000:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0()); 
            // InternalBurst.g:2001:3: ( ruleQualifiedName )
            // InternalBurst.g:2002:4: ruleQualifiedName
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
    // InternalBurst.g:2013:1: rule__RuleConcern__ElementsAssignment_4_1 : ( ruleConcernElement ) ;
    public final void rule__RuleConcern__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2017:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:2018:2: ( ruleConcernElement )
            {
            // InternalBurst.g:2018:2: ( ruleConcernElement )
            // InternalBurst.g:2019:3: ruleConcernElement
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


    // $ANTLR start "rule__Member__ConcernAssignment_1"
    // InternalBurst.g:2028:1: rule__Member__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2032:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2033:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2033:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2034:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:2035:3: ( ruleQualifiedName )
            // InternalBurst.g:2036:4: ruleQualifiedName
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
    // InternalBurst.g:2047:1: rule__Member__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2051:1: ( ( RULE_ID ) )
            // InternalBurst.g:2052:2: ( RULE_ID )
            {
            // InternalBurst.g:2052:2: ( RULE_ID )
            // InternalBurst.g:2053:3: RULE_ID
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
    // InternalBurst.g:2062:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2066:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:2067:2: ( ( 'when' ) )
            {
            // InternalBurst.g:2067:2: ( ( 'when' ) )
            // InternalBurst.g:2068:3: ( 'when' )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:2069:3: ( 'when' )
            // InternalBurst.g:2070:4: 'when'
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
    // InternalBurst.g:2081:1: rule__RuleIntersect__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2085:1: ( ( ruleParameter ) )
            // InternalBurst.g:2086:2: ( ruleParameter )
            {
            // InternalBurst.g:2086:2: ( ruleParameter )
            // InternalBurst.g:2087:3: ruleParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_2_1_0()); 

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
    // InternalBurst.g:2096:1: rule__RuleIntersect__LinesAssignment_4 : ( ruleIntersectionElement ) ;
    public final void rule__RuleIntersect__LinesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2100:1: ( ( ruleIntersectionElement ) )
            // InternalBurst.g:2101:2: ( ruleIntersectionElement )
            {
            // InternalBurst.g:2101:2: ( ruleIntersectionElement )
            // InternalBurst.g:2102:3: ruleIntersectionElement
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


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalBurst.g:2111:1: rule__Parameter__NameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2115:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2116:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2116:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2117:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getNameConcernCrossReference_1_0()); 
            // InternalBurst.g:2118:3: ( ruleQualifiedName )
            // InternalBurst.g:2119:4: ruleQualifiedName
            {
             before(grammarAccess.getParameterAccess().getNameConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getNameConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Line__CallsAssignment_1"
    // InternalBurst.g:2130:1: rule__Line__CallsAssignment_1 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2134:1: ( ( ruleCall ) )
            // InternalBurst.g:2135:2: ( ruleCall )
            {
            // InternalBurst.g:2135:2: ( ruleCall )
            // InternalBurst.g:2136:3: ruleCall
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
    // InternalBurst.g:2145:1: rule__Line__CallsAssignment_2 : ( ruleCall ) ;
    public final void rule__Line__CallsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2149:1: ( ( ruleCall ) )
            // InternalBurst.g:2150:2: ( ruleCall )
            {
            // InternalBurst.g:2150:2: ( ruleCall )
            // InternalBurst.g:2151:3: ruleCall
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


    // $ANTLR start "rule__CallMember__NameAssignment_1"
    // InternalBurst.g:2160:1: rule__CallMember__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2164:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2165:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2165:2: ( ( RULE_ID ) )
            // InternalBurst.g:2166:3: ( RULE_ID )
            {
             before(grammarAccess.getCallMemberAccess().getNameMemberCrossReference_1_0()); 
            // InternalBurst.g:2167:3: ( RULE_ID )
            // InternalBurst.g:2168:4: RULE_ID
            {
             before(grammarAccess.getCallMemberAccess().getNameMemberIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCallMemberAccess().getNameMemberIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallMemberAccess().getNameMemberCrossReference_1_0()); 

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
    // $ANTLR end "rule__CallMember__NameAssignment_1"


    // $ANTLR start "rule__CallMemberInConcern__TargetAssignment_1"
    // InternalBurst.g:2179:1: rule__CallMemberInConcern__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallMemberInConcern__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2183:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2184:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2184:2: ( ( RULE_ID ) )
            // InternalBurst.g:2185:3: ( RULE_ID )
            {
             before(grammarAccess.getCallMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 
            // InternalBurst.g:2186:3: ( RULE_ID )
            // InternalBurst.g:2187:4: RULE_ID
            {
             before(grammarAccess.getCallMemberInConcernAccess().getTargetConcernIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCallMemberInConcernAccess().getTargetConcernIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__CallMemberInConcern__TargetAssignment_1"


    // $ANTLR start "rule__CallMemberInConcern__NameAssignment_3"
    // InternalBurst.g:2198:1: rule__CallMemberInConcern__NameAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CallMemberInConcern__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2202:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2203:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2203:2: ( ( RULE_ID ) )
            // InternalBurst.g:2204:3: ( RULE_ID )
            {
             before(grammarAccess.getCallMemberInConcernAccess().getNameMemberCrossReference_3_0()); 
            // InternalBurst.g:2205:3: ( RULE_ID )
            // InternalBurst.g:2206:4: RULE_ID
            {
             before(grammarAccess.getCallMemberInConcernAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCallMemberInConcernAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCallMemberInConcernAccess().getNameMemberCrossReference_3_0()); 

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
    // $ANTLR end "rule__CallMemberInConcern__NameAssignment_3"

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
            return "966:2: ( rule__RuleConcern__Group_3__0 )?";
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100002L});

}