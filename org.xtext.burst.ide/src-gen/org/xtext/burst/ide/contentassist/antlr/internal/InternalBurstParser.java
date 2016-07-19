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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'when'"
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

                if ( (LA1_0==RULE_ENDLINE||LA1_0==12||(LA1_0>=16 && LA1_0<=17)||LA1_0==19) ) {
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalBurst.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalBurst.g:79:1: ( ruleAbstractElement EOF )
            // InternalBurst.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalBurst.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalBurst.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalBurst.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalBurst.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalBurst.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalBurst.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // InternalBurst.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalBurst.g:104:1: ( rulePackage EOF )
            // InternalBurst.g:105:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalBurst.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalBurst.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalBurst.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalBurst.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalBurst.g:119:3: ( rule__Package__Group__0 )
            // InternalBurst.g:119:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:129:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:130:1: ruleQualifiedName EOF
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
    // InternalBurst.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBurst.g:154:1: ( ruleImport EOF )
            // InternalBurst.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBurst.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBurst.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalBurst.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalBurst.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalBurst.g:169:3: ( rule__Import__Group__0 )
            // InternalBurst.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:178:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // InternalBurst.g:179:1: ( ruleConcern EOF )
            // InternalBurst.g:180:1: ruleConcern EOF
            {
             before(grammarAccess.getConcernRule()); 
            pushFollow(FOLLOW_1);
            ruleConcern();

            state._fsp--;

             after(grammarAccess.getConcernRule()); 
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
    // $ANTLR end "entryRuleConcern"


    // $ANTLR start "ruleConcern"
    // InternalBurst.g:187:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:191:2: ( ( ( rule__Concern__Group__0 ) ) )
            // InternalBurst.g:192:2: ( ( rule__Concern__Group__0 ) )
            {
            // InternalBurst.g:192:2: ( ( rule__Concern__Group__0 ) )
            // InternalBurst.g:193:3: ( rule__Concern__Group__0 )
            {
             before(grammarAccess.getConcernAccess().getGroup()); 
            // InternalBurst.g:194:3: ( rule__Concern__Group__0 )
            // InternalBurst.g:194:4: rule__Concern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getGroup()); 

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
    // $ANTLR end "ruleConcern"


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:203:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:204:1: ( ruleMember EOF )
            // InternalBurst.g:205:1: ruleMember EOF
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
    // InternalBurst.g:212:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:216:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:217:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:217:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:218:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalBurst.g:219:3: ( rule__Member__Group__0 )
            // InternalBurst.g:219:4: rule__Member__Group__0
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


    // $ANTLR start "entryRuleIntersection"
    // InternalBurst.g:228:1: entryRuleIntersection : ruleIntersection EOF ;
    public final void entryRuleIntersection() throws RecognitionException {
        try {
            // InternalBurst.g:229:1: ( ruleIntersection EOF )
            // InternalBurst.g:230:1: ruleIntersection EOF
            {
             before(grammarAccess.getIntersectionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntersection();

            state._fsp--;

             after(grammarAccess.getIntersectionRule()); 
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
    // $ANTLR end "entryRuleIntersection"


    // $ANTLR start "ruleIntersection"
    // InternalBurst.g:237:1: ruleIntersection : ( ( rule__Intersection__Group__0 ) ) ;
    public final void ruleIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:241:2: ( ( ( rule__Intersection__Group__0 ) ) )
            // InternalBurst.g:242:2: ( ( rule__Intersection__Group__0 ) )
            {
            // InternalBurst.g:242:2: ( ( rule__Intersection__Group__0 ) )
            // InternalBurst.g:243:3: ( rule__Intersection__Group__0 )
            {
             before(grammarAccess.getIntersectionAccess().getGroup()); 
            // InternalBurst.g:244:3: ( rule__Intersection__Group__0 )
            // InternalBurst.g:244:4: rule__Intersection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intersection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntersection"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:253:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:254:1: ( ruleLine EOF )
            // InternalBurst.g:255:1: ruleLine EOF
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
    // InternalBurst.g:262:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:266:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:267:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:267:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:268:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:269:3: ( rule__Line__Group__0 )
            // InternalBurst.g:269:4: rule__Line__Group__0
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
    // InternalBurst.g:278:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleCall EOF )
            // InternalBurst.g:280:1: ruleCall EOF
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
    // InternalBurst.g:287:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalBurst.g:292:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalBurst.g:292:2: ( ( rule__Call__Alternatives ) )
            // InternalBurst.g:293:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalBurst.g:294:3: ( rule__Call__Alternatives )
            // InternalBurst.g:294:4: rule__Call__Alternatives
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
    // InternalBurst.g:303:1: entryRuleMemberCall : ruleMemberCall EOF ;
    public final void entryRuleMemberCall() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleMemberCall EOF )
            // InternalBurst.g:305:1: ruleMemberCall EOF
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
    // InternalBurst.g:312:1: ruleMemberCall : ( ( rule__MemberCall__Group__0 ) ) ;
    public final void ruleMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__MemberCall__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__MemberCall__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__MemberCall__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__MemberCall__Group__0 )
            {
             before(grammarAccess.getMemberCallAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__MemberCall__Group__0 )
            // InternalBurst.g:319:4: rule__MemberCall__Group__0
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


    // $ANTLR start "entryRuleMemberInConcern"
    // InternalBurst.g:328:1: entryRuleMemberInConcern : ruleMemberInConcern EOF ;
    public final void entryRuleMemberInConcern() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleMemberInConcern EOF )
            // InternalBurst.g:330:1: ruleMemberInConcern EOF
            {
             before(grammarAccess.getMemberInConcernRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberInConcern();

            state._fsp--;

             after(grammarAccess.getMemberInConcernRule()); 
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
    // $ANTLR end "entryRuleMemberInConcern"


    // $ANTLR start "ruleMemberInConcern"
    // InternalBurst.g:337:1: ruleMemberInConcern : ( ( rule__MemberInConcern__Group__0 ) ) ;
    public final void ruleMemberInConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__MemberInConcern__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__MemberInConcern__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__MemberInConcern__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__MemberInConcern__Group__0 )
            {
             before(grammarAccess.getMemberInConcernAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__MemberInConcern__Group__0 )
            // InternalBurst.g:344:4: rule__MemberInConcern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberInConcern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberInConcernAccess().getGroup()); 

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
    // $ANTLR end "ruleMemberInConcern"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalBurst.g:352:1: rule__AbstractElement__Alternatives : ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) | ( RULE_ENDLINE ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:356:1: ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) | ( RULE_ENDLINE ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            case RULE_ENDLINE:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBurst.g:357:2: ( ruleImport )
                    {
                    // InternalBurst.g:357:2: ( ruleImport )
                    // InternalBurst.g:358:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:363:2: ( ruleConcern )
                    {
                    // InternalBurst.g:363:2: ( ruleConcern )
                    // InternalBurst.g:364:3: ruleConcern
                    {
                     before(grammarAccess.getAbstractElementAccess().getConcernParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConcern();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getConcernParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:369:2: ( ruleIntersection )
                    {
                    // InternalBurst.g:369:2: ( ruleIntersection )
                    // InternalBurst.g:370:3: ruleIntersection
                    {
                     before(grammarAccess.getAbstractElementAccess().getIntersectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntersection();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getIntersectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:375:2: ( rulePackage )
                    {
                    // InternalBurst.g:375:2: ( rulePackage )
                    // InternalBurst.g:376:3: rulePackage
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBurst.g:381:2: ( RULE_ENDLINE )
                    {
                    // InternalBurst.g:381:2: ( RULE_ENDLINE )
                    // InternalBurst.g:382:3: RULE_ENDLINE
                    {
                     before(grammarAccess.getAbstractElementAccess().getENDLINETerminalRuleCall_4()); 
                    match(input,RULE_ENDLINE,FOLLOW_2); 
                     after(grammarAccess.getAbstractElementAccess().getENDLINETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Concern__Alternatives_6_2"
    // InternalBurst.g:391:1: rule__Concern__Alternatives_6_2 : ( ( ( rule__Concern__MembersAssignment_6_2_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_6_2_1 ) ) );
    public final void rule__Concern__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:395:1: ( ( ( rule__Concern__MembersAssignment_6_2_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_6_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:396:2: ( ( rule__Concern__MembersAssignment_6_2_0 ) )
                    {
                    // InternalBurst.g:396:2: ( ( rule__Concern__MembersAssignment_6_2_0 ) )
                    // InternalBurst.g:397:3: ( rule__Concern__MembersAssignment_6_2_0 )
                    {
                     before(grammarAccess.getConcernAccess().getMembersAssignment_6_2_0()); 
                    // InternalBurst.g:398:3: ( rule__Concern__MembersAssignment_6_2_0 )
                    // InternalBurst.g:398:4: rule__Concern__MembersAssignment_6_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__MembersAssignment_6_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getMembersAssignment_6_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:402:2: ( ( rule__Concern__IntersectionsAssignment_6_2_1 ) )
                    {
                    // InternalBurst.g:402:2: ( ( rule__Concern__IntersectionsAssignment_6_2_1 ) )
                    // InternalBurst.g:403:3: ( rule__Concern__IntersectionsAssignment_6_2_1 )
                    {
                     before(grammarAccess.getConcernAccess().getIntersectionsAssignment_6_2_1()); 
                    // InternalBurst.g:404:3: ( rule__Concern__IntersectionsAssignment_6_2_1 )
                    // InternalBurst.g:404:4: rule__Concern__IntersectionsAssignment_6_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__IntersectionsAssignment_6_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getIntersectionsAssignment_6_2_1()); 

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
    // $ANTLR end "rule__Concern__Alternatives_6_2"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalBurst.g:412:1: rule__Call__Alternatives : ( ( ( rule__Call__Group_0__0 ) ) | ( ( rule__Call__NameAssignment_1 ) ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:1: ( ( ( rule__Call__Group_0__0 ) ) | ( ( rule__Call__NameAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_ENDLINE && LA4_1<=RULE_ID)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBurst.g:417:2: ( ( rule__Call__Group_0__0 ) )
                    {
                    // InternalBurst.g:417:2: ( ( rule__Call__Group_0__0 ) )
                    // InternalBurst.g:418:3: ( rule__Call__Group_0__0 )
                    {
                     before(grammarAccess.getCallAccess().getGroup_0()); 
                    // InternalBurst.g:419:3: ( rule__Call__Group_0__0 )
                    // InternalBurst.g:419:4: rule__Call__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Call__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCallAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:423:2: ( ( rule__Call__NameAssignment_1 ) )
                    {
                    // InternalBurst.g:423:2: ( ( rule__Call__NameAssignment_1 ) )
                    // InternalBurst.g:424:3: ( rule__Call__NameAssignment_1 )
                    {
                     before(grammarAccess.getCallAccess().getNameAssignment_1()); 
                    // InternalBurst.g:425:3: ( rule__Call__NameAssignment_1 )
                    // InternalBurst.g:425:4: rule__Call__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Call__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCallAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Package__Group__0"
    // InternalBurst.g:433:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:437:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:438:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalBurst.g:445:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:449:1: ( ( 'package' ) )
            // InternalBurst.g:450:1: ( 'package' )
            {
            // InternalBurst.g:450:1: ( 'package' )
            // InternalBurst.g:451:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalBurst.g:460:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:464:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:465:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalBurst.g:472:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:476:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalBurst.g:477:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalBurst.g:477:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalBurst.g:478:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalBurst.g:479:2: ( rule__Package__NameAssignment_1 )
            // InternalBurst.g:479:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalBurst.g:487:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:491:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:492:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalBurst.g:499:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:503:1: ( ( '{' ) )
            // InternalBurst.g:504:1: ( '{' )
            {
            // InternalBurst.g:504:1: ( '{' )
            // InternalBurst.g:505:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalBurst.g:514:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:518:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:519:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalBurst.g:526:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:530:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalBurst.g:531:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalBurst.g:531:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalBurst.g:532:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalBurst.g:533:2: ( rule__Package__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ENDLINE||LA5_0==12||(LA5_0>=16 && LA5_0<=17)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:533:3: rule__Package__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Package__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalBurst.g:541:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:545:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalBurst.g:546:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalBurst.g:553:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:557:1: ( ( '}' ) )
            // InternalBurst.g:558:1: ( '}' )
            {
            // InternalBurst.g:558:1: ( '}' )
            // InternalBurst.g:559:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalBurst.g:568:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:572:1: ( rule__Package__Group__5__Impl )
            // InternalBurst.g:573:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

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
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalBurst.g:579:1: rule__Package__Group__5__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:583:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:584:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:584:1: ( RULE_ENDLINE )
            // InternalBurst.g:585:2: RULE_ENDLINE
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:595:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:599:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:600:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBurst.g:607:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:611:1: ( ( RULE_ID ) )
            // InternalBurst.g:612:1: ( RULE_ID )
            {
            // InternalBurst.g:612:1: ( RULE_ID )
            // InternalBurst.g:613:2: RULE_ID
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
    // InternalBurst.g:622:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:626:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:627:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:633:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:637:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:638:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:638:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:639:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:640:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBurst.g:640:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBurst.g:649:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:653:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:654:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBurst.g:661:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:665:1: ( ( '.' ) )
            // InternalBurst.g:666:1: ( '.' )
            {
            // InternalBurst.g:666:1: ( '.' )
            // InternalBurst.g:667:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBurst.g:676:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:680:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:681:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:687:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:691:1: ( ( RULE_ID ) )
            // InternalBurst.g:692:1: ( RULE_ID )
            {
            // InternalBurst.g:692:1: ( RULE_ID )
            // InternalBurst.g:693:2: RULE_ID
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalBurst.g:703:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:707:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:708:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalBurst.g:715:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:719:1: ( ( 'import' ) )
            // InternalBurst.g:720:1: ( 'import' )
            {
            // InternalBurst.g:720:1: ( 'import' )
            // InternalBurst.g:721:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalBurst.g:730:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:734:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:735:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalBurst.g:742:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:746:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalBurst.g:747:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalBurst.g:747:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalBurst.g:748:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalBurst.g:749:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalBurst.g:749:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalBurst.g:757:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:761:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:762:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalBurst.g:768:1: rule__Import__Group__2__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:772:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:773:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:773:1: ( RULE_ENDLINE )
            // InternalBurst.g:774:2: RULE_ENDLINE
            {
             before(grammarAccess.getImportAccess().getENDLINETerminalRuleCall_2()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getENDLINETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Concern__Group__0"
    // InternalBurst.g:784:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:788:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:789:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Concern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__1();

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
    // $ANTLR end "rule__Concern__Group__0"


    // $ANTLR start "rule__Concern__Group__0__Impl"
    // InternalBurst.g:796:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:800:1: ( ( () ) )
            // InternalBurst.g:801:1: ( () )
            {
            // InternalBurst.g:801:1: ( () )
            // InternalBurst.g:802:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:803:2: ()
            // InternalBurst.g:803:3: 
            {
            }

             after(grammarAccess.getConcernAccess().getConcernAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group__0__Impl"


    // $ANTLR start "rule__Concern__Group__1"
    // InternalBurst.g:811:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:815:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:816:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__2();

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
    // $ANTLR end "rule__Concern__Group__1"


    // $ANTLR start "rule__Concern__Group__1__Impl"
    // InternalBurst.g:823:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:827:1: ( ( 'concern' ) )
            // InternalBurst.g:828:1: ( 'concern' )
            {
            // InternalBurst.g:828:1: ( 'concern' )
            // InternalBurst.g:829:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getConcernKeyword_1()); 

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
    // $ANTLR end "rule__Concern__Group__1__Impl"


    // $ANTLR start "rule__Concern__Group__2"
    // InternalBurst.g:838:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:842:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:843:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__3();

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
    // $ANTLR end "rule__Concern__Group__2"


    // $ANTLR start "rule__Concern__Group__2__Impl"
    // InternalBurst.g:850:1: rule__Concern__Group__2__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:854:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:855:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:855:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:856:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:857:2: ( RULE_ENDLINE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ENDLINE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:857:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Concern__Group__2__Impl"


    // $ANTLR start "rule__Concern__Group__3"
    // InternalBurst.g:865:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl rule__Concern__Group__4 ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:869:1: ( rule__Concern__Group__3__Impl rule__Concern__Group__4 )
            // InternalBurst.g:870:2: rule__Concern__Group__3__Impl rule__Concern__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__4();

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
    // $ANTLR end "rule__Concern__Group__3"


    // $ANTLR start "rule__Concern__Group__3__Impl"
    // InternalBurst.g:877:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__NameAssignment_3 ) ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:881:1: ( ( ( rule__Concern__NameAssignment_3 ) ) )
            // InternalBurst.g:882:1: ( ( rule__Concern__NameAssignment_3 ) )
            {
            // InternalBurst.g:882:1: ( ( rule__Concern__NameAssignment_3 ) )
            // InternalBurst.g:883:2: ( rule__Concern__NameAssignment_3 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_3()); 
            // InternalBurst.g:884:2: ( rule__Concern__NameAssignment_3 )
            // InternalBurst.g:884:3: rule__Concern__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Concern__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Concern__Group__3__Impl"


    // $ANTLR start "rule__Concern__Group__4"
    // InternalBurst.g:892:1: rule__Concern__Group__4 : rule__Concern__Group__4__Impl rule__Concern__Group__5 ;
    public final void rule__Concern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:896:1: ( rule__Concern__Group__4__Impl rule__Concern__Group__5 )
            // InternalBurst.g:897:2: rule__Concern__Group__4__Impl rule__Concern__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__5();

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
    // $ANTLR end "rule__Concern__Group__4"


    // $ANTLR start "rule__Concern__Group__4__Impl"
    // InternalBurst.g:904:1: rule__Concern__Group__4__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:908:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:909:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:909:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:910:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_4()); 
            // InternalBurst.g:911:2: ( RULE_ENDLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ENDLINE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==13||LA8_1==18) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ENDLINE) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:911:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Concern__Group__4__Impl"


    // $ANTLR start "rule__Concern__Group__5"
    // InternalBurst.g:919:1: rule__Concern__Group__5 : rule__Concern__Group__5__Impl rule__Concern__Group__6 ;
    public final void rule__Concern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:923:1: ( rule__Concern__Group__5__Impl rule__Concern__Group__6 )
            // InternalBurst.g:924:2: rule__Concern__Group__5__Impl rule__Concern__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__6();

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
    // $ANTLR end "rule__Concern__Group__5"


    // $ANTLR start "rule__Concern__Group__5__Impl"
    // InternalBurst.g:931:1: rule__Concern__Group__5__Impl : ( ( rule__Concern__Group_5__0 )? ) ;
    public final void rule__Concern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:935:1: ( ( ( rule__Concern__Group_5__0 )? ) )
            // InternalBurst.g:936:1: ( ( rule__Concern__Group_5__0 )? )
            {
            // InternalBurst.g:936:1: ( ( rule__Concern__Group_5__0 )? )
            // InternalBurst.g:937:2: ( rule__Concern__Group_5__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_5()); 
            // InternalBurst.g:938:2: ( rule__Concern__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBurst.g:938:3: rule__Concern__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Concern__Group__5__Impl"


    // $ANTLR start "rule__Concern__Group__6"
    // InternalBurst.g:946:1: rule__Concern__Group__6 : rule__Concern__Group__6__Impl rule__Concern__Group__7 ;
    public final void rule__Concern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:950:1: ( rule__Concern__Group__6__Impl rule__Concern__Group__7 )
            // InternalBurst.g:951:2: rule__Concern__Group__6__Impl rule__Concern__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__7();

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
    // $ANTLR end "rule__Concern__Group__6"


    // $ANTLR start "rule__Concern__Group__6__Impl"
    // InternalBurst.g:958:1: rule__Concern__Group__6__Impl : ( ( rule__Concern__Group_6__0 )? ) ;
    public final void rule__Concern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:962:1: ( ( ( rule__Concern__Group_6__0 )? ) )
            // InternalBurst.g:963:1: ( ( rule__Concern__Group_6__0 )? )
            {
            // InternalBurst.g:963:1: ( ( rule__Concern__Group_6__0 )? )
            // InternalBurst.g:964:2: ( rule__Concern__Group_6__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_6()); 
            // InternalBurst.g:965:2: ( rule__Concern__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:965:3: rule__Concern__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Concern__Group__6__Impl"


    // $ANTLR start "rule__Concern__Group__7"
    // InternalBurst.g:973:1: rule__Concern__Group__7 : rule__Concern__Group__7__Impl ;
    public final void rule__Concern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:977:1: ( rule__Concern__Group__7__Impl )
            // InternalBurst.g:978:2: rule__Concern__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__7__Impl();

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
    // $ANTLR end "rule__Concern__Group__7"


    // $ANTLR start "rule__Concern__Group__7__Impl"
    // InternalBurst.g:984:1: rule__Concern__Group__7__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Concern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:988:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:989:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:989:1: ( RULE_ENDLINE )
            // InternalBurst.g:990:2: RULE_ENDLINE
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_7()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Concern__Group__7__Impl"


    // $ANTLR start "rule__Concern__Group_5__0"
    // InternalBurst.g:1000:1: rule__Concern__Group_5__0 : rule__Concern__Group_5__0__Impl rule__Concern__Group_5__1 ;
    public final void rule__Concern__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1004:1: ( rule__Concern__Group_5__0__Impl rule__Concern__Group_5__1 )
            // InternalBurst.g:1005:2: rule__Concern__Group_5__0__Impl rule__Concern__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_5__1();

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
    // $ANTLR end "rule__Concern__Group_5__0"


    // $ANTLR start "rule__Concern__Group_5__0__Impl"
    // InternalBurst.g:1012:1: rule__Concern__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__Concern__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1016:1: ( ( 'extends' ) )
            // InternalBurst.g:1017:1: ( 'extends' )
            {
            // InternalBurst.g:1017:1: ( 'extends' )
            // InternalBurst.g:1018:2: 'extends'
            {
             before(grammarAccess.getConcernAccess().getExtendsKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getExtendsKeyword_5_0()); 

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
    // $ANTLR end "rule__Concern__Group_5__0__Impl"


    // $ANTLR start "rule__Concern__Group_5__1"
    // InternalBurst.g:1027:1: rule__Concern__Group_5__1 : rule__Concern__Group_5__1__Impl rule__Concern__Group_5__2 ;
    public final void rule__Concern__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1031:1: ( rule__Concern__Group_5__1__Impl rule__Concern__Group_5__2 )
            // InternalBurst.g:1032:2: rule__Concern__Group_5__1__Impl rule__Concern__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_5__2();

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
    // $ANTLR end "rule__Concern__Group_5__1"


    // $ANTLR start "rule__Concern__Group_5__1__Impl"
    // InternalBurst.g:1039:1: rule__Concern__Group_5__1__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1043:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1044:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1044:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1045:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_1()); 
            // InternalBurst.g:1046:2: ( RULE_ENDLINE )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ENDLINE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBurst.g:1046:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Concern__Group_5__1__Impl"


    // $ANTLR start "rule__Concern__Group_5__2"
    // InternalBurst.g:1054:1: rule__Concern__Group_5__2 : rule__Concern__Group_5__2__Impl rule__Concern__Group_5__3 ;
    public final void rule__Concern__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1058:1: ( rule__Concern__Group_5__2__Impl rule__Concern__Group_5__3 )
            // InternalBurst.g:1059:2: rule__Concern__Group_5__2__Impl rule__Concern__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Concern__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_5__3();

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
    // $ANTLR end "rule__Concern__Group_5__2"


    // $ANTLR start "rule__Concern__Group_5__2__Impl"
    // InternalBurst.g:1066:1: rule__Concern__Group_5__2__Impl : ( ( rule__Concern__SupertypeAssignment_5_2 ) ) ;
    public final void rule__Concern__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1070:1: ( ( ( rule__Concern__SupertypeAssignment_5_2 ) ) )
            // InternalBurst.g:1071:1: ( ( rule__Concern__SupertypeAssignment_5_2 ) )
            {
            // InternalBurst.g:1071:1: ( ( rule__Concern__SupertypeAssignment_5_2 ) )
            // InternalBurst.g:1072:2: ( rule__Concern__SupertypeAssignment_5_2 )
            {
             before(grammarAccess.getConcernAccess().getSupertypeAssignment_5_2()); 
            // InternalBurst.g:1073:2: ( rule__Concern__SupertypeAssignment_5_2 )
            // InternalBurst.g:1073:3: rule__Concern__SupertypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Concern__SupertypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getSupertypeAssignment_5_2()); 

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
    // $ANTLR end "rule__Concern__Group_5__2__Impl"


    // $ANTLR start "rule__Concern__Group_5__3"
    // InternalBurst.g:1081:1: rule__Concern__Group_5__3 : rule__Concern__Group_5__3__Impl ;
    public final void rule__Concern__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1085:1: ( rule__Concern__Group_5__3__Impl )
            // InternalBurst.g:1086:2: rule__Concern__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_5__3__Impl();

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
    // $ANTLR end "rule__Concern__Group_5__3"


    // $ANTLR start "rule__Concern__Group_5__3__Impl"
    // InternalBurst.g:1092:1: rule__Concern__Group_5__3__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1096:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1097:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1097:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1098:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_3()); 
            // InternalBurst.g:1099:2: ( RULE_ENDLINE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ENDLINE) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==13) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ENDLINE) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalBurst.g:1099:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_3()); 

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
    // $ANTLR end "rule__Concern__Group_5__3__Impl"


    // $ANTLR start "rule__Concern__Group_6__0"
    // InternalBurst.g:1108:1: rule__Concern__Group_6__0 : rule__Concern__Group_6__0__Impl rule__Concern__Group_6__1 ;
    public final void rule__Concern__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1112:1: ( rule__Concern__Group_6__0__Impl rule__Concern__Group_6__1 )
            // InternalBurst.g:1113:2: rule__Concern__Group_6__0__Impl rule__Concern__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Concern__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_6__1();

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
    // $ANTLR end "rule__Concern__Group_6__0"


    // $ANTLR start "rule__Concern__Group_6__0__Impl"
    // InternalBurst.g:1120:1: rule__Concern__Group_6__0__Impl : ( '{' ) ;
    public final void rule__Concern__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1124:1: ( ( '{' ) )
            // InternalBurst.g:1125:1: ( '{' )
            {
            // InternalBurst.g:1125:1: ( '{' )
            // InternalBurst.g:1126:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_6_0()); 

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
    // $ANTLR end "rule__Concern__Group_6__0__Impl"


    // $ANTLR start "rule__Concern__Group_6__1"
    // InternalBurst.g:1135:1: rule__Concern__Group_6__1 : rule__Concern__Group_6__1__Impl rule__Concern__Group_6__2 ;
    public final void rule__Concern__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1139:1: ( rule__Concern__Group_6__1__Impl rule__Concern__Group_6__2 )
            // InternalBurst.g:1140:2: rule__Concern__Group_6__1__Impl rule__Concern__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Concern__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_6__2();

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
    // $ANTLR end "rule__Concern__Group_6__1"


    // $ANTLR start "rule__Concern__Group_6__1__Impl"
    // InternalBurst.g:1147:1: rule__Concern__Group_6__1__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1151:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1152:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1152:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1153:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_1()); 
            // InternalBurst.g:1154:2: ( RULE_ENDLINE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ENDLINE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBurst.g:1154:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_1()); 

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
    // $ANTLR end "rule__Concern__Group_6__1__Impl"


    // $ANTLR start "rule__Concern__Group_6__2"
    // InternalBurst.g:1162:1: rule__Concern__Group_6__2 : rule__Concern__Group_6__2__Impl rule__Concern__Group_6__3 ;
    public final void rule__Concern__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1166:1: ( rule__Concern__Group_6__2__Impl rule__Concern__Group_6__3 )
            // InternalBurst.g:1167:2: rule__Concern__Group_6__2__Impl rule__Concern__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Concern__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_6__3();

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
    // $ANTLR end "rule__Concern__Group_6__2"


    // $ANTLR start "rule__Concern__Group_6__2__Impl"
    // InternalBurst.g:1174:1: rule__Concern__Group_6__2__Impl : ( ( rule__Concern__Alternatives_6_2 )* ) ;
    public final void rule__Concern__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1178:1: ( ( ( rule__Concern__Alternatives_6_2 )* ) )
            // InternalBurst.g:1179:1: ( ( rule__Concern__Alternatives_6_2 )* )
            {
            // InternalBurst.g:1179:1: ( ( rule__Concern__Alternatives_6_2 )* )
            // InternalBurst.g:1180:2: ( rule__Concern__Alternatives_6_2 )*
            {
             before(grammarAccess.getConcernAccess().getAlternatives_6_2()); 
            // InternalBurst.g:1181:2: ( rule__Concern__Alternatives_6_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1181:3: rule__Concern__Alternatives_6_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Concern__Alternatives_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getAlternatives_6_2()); 

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
    // $ANTLR end "rule__Concern__Group_6__2__Impl"


    // $ANTLR start "rule__Concern__Group_6__3"
    // InternalBurst.g:1189:1: rule__Concern__Group_6__3 : rule__Concern__Group_6__3__Impl rule__Concern__Group_6__4 ;
    public final void rule__Concern__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1193:1: ( rule__Concern__Group_6__3__Impl rule__Concern__Group_6__4 )
            // InternalBurst.g:1194:2: rule__Concern__Group_6__3__Impl rule__Concern__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__Concern__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_6__4();

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
    // $ANTLR end "rule__Concern__Group_6__3"


    // $ANTLR start "rule__Concern__Group_6__3__Impl"
    // InternalBurst.g:1201:1: rule__Concern__Group_6__3__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Concern__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1205:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1206:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1206:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1207:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_3()); 
            // InternalBurst.g:1208:2: ( RULE_ENDLINE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ENDLINE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBurst.g:1208:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_3()); 

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
    // $ANTLR end "rule__Concern__Group_6__3__Impl"


    // $ANTLR start "rule__Concern__Group_6__4"
    // InternalBurst.g:1216:1: rule__Concern__Group_6__4 : rule__Concern__Group_6__4__Impl ;
    public final void rule__Concern__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1220:1: ( rule__Concern__Group_6__4__Impl )
            // InternalBurst.g:1221:2: rule__Concern__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_6__4__Impl();

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
    // $ANTLR end "rule__Concern__Group_6__4"


    // $ANTLR start "rule__Concern__Group_6__4__Impl"
    // InternalBurst.g:1227:1: rule__Concern__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Concern__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1231:1: ( ( '}' ) )
            // InternalBurst.g:1232:1: ( '}' )
            {
            // InternalBurst.g:1232:1: ( '}' )
            // InternalBurst.g:1233:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Concern__Group_6__4__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:1243:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1247:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:1248:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBurst.g:1255:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1259:1: ( ( () ) )
            // InternalBurst.g:1260:1: ( () )
            {
            // InternalBurst.g:1260:1: ( () )
            // InternalBurst.g:1261:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:1262:2: ()
            // InternalBurst.g:1262:3: 
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
    // InternalBurst.g:1270:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1274:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:1275:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBurst.g:1282:1: rule__Member__Group__1__Impl : ( ( rule__Member__ConcernAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1286:1: ( ( ( rule__Member__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1287:1: ( ( rule__Member__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1287:1: ( ( rule__Member__ConcernAssignment_1 ) )
            // InternalBurst.g:1288:2: ( rule__Member__ConcernAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1289:2: ( rule__Member__ConcernAssignment_1 )
            // InternalBurst.g:1289:3: rule__Member__ConcernAssignment_1
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
    // InternalBurst.g:1297:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1301:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalBurst.g:1302:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__3();

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
    // InternalBurst.g:1309:1: rule__Member__Group__2__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1313:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1314:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1314:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1315:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:1316:2: ( RULE_ENDLINE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ENDLINE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:1316:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Member__Group__3"
    // InternalBurst.g:1324:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1328:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalBurst.g:1329:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Member__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__4();

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
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // InternalBurst.g:1336:1: rule__Member__Group__3__Impl : ( ( rule__Member__NameAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1340:1: ( ( ( rule__Member__NameAssignment_3 ) ) )
            // InternalBurst.g:1341:1: ( ( rule__Member__NameAssignment_3 ) )
            {
            // InternalBurst.g:1341:1: ( ( rule__Member__NameAssignment_3 ) )
            // InternalBurst.g:1342:2: ( rule__Member__NameAssignment_3 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_3()); 
            // InternalBurst.g:1343:2: ( rule__Member__NameAssignment_3 )
            // InternalBurst.g:1343:3: rule__Member__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group__4"
    // InternalBurst.g:1351:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1355:1: ( rule__Member__Group__4__Impl )
            // InternalBurst.g:1356:2: rule__Member__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__4__Impl();

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
    // $ANTLR end "rule__Member__Group__4"


    // $ANTLR start "rule__Member__Group__4__Impl"
    // InternalBurst.g:1362:1: rule__Member__Group__4__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1366:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1367:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1367:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1368:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_4()); 
            // InternalBurst.g:1369:2: ( RULE_ENDLINE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ENDLINE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBurst.g:1369:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Member__Group__4__Impl"


    // $ANTLR start "rule__Intersection__Group__0"
    // InternalBurst.g:1378:1: rule__Intersection__Group__0 : rule__Intersection__Group__0__Impl rule__Intersection__Group__1 ;
    public final void rule__Intersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1382:1: ( rule__Intersection__Group__0__Impl rule__Intersection__Group__1 )
            // InternalBurst.g:1383:2: rule__Intersection__Group__0__Impl rule__Intersection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Intersection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__1();

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
    // $ANTLR end "rule__Intersection__Group__0"


    // $ANTLR start "rule__Intersection__Group__0__Impl"
    // InternalBurst.g:1390:1: rule__Intersection__Group__0__Impl : ( () ) ;
    public final void rule__Intersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1394:1: ( ( () ) )
            // InternalBurst.g:1395:1: ( () )
            {
            // InternalBurst.g:1395:1: ( () )
            // InternalBurst.g:1396:2: ()
            {
             before(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1397:2: ()
            // InternalBurst.g:1397:3: 
            {
            }

             after(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intersection__Group__0__Impl"


    // $ANTLR start "rule__Intersection__Group__1"
    // InternalBurst.g:1405:1: rule__Intersection__Group__1 : rule__Intersection__Group__1__Impl rule__Intersection__Group__2 ;
    public final void rule__Intersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1409:1: ( rule__Intersection__Group__1__Impl rule__Intersection__Group__2 )
            // InternalBurst.g:1410:2: rule__Intersection__Group__1__Impl rule__Intersection__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Intersection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__2();

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
    // $ANTLR end "rule__Intersection__Group__1"


    // $ANTLR start "rule__Intersection__Group__1__Impl"
    // InternalBurst.g:1417:1: rule__Intersection__Group__1__Impl : ( ( rule__Intersection__NameAssignment_1 ) ) ;
    public final void rule__Intersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1421:1: ( ( ( rule__Intersection__NameAssignment_1 ) ) )
            // InternalBurst.g:1422:1: ( ( rule__Intersection__NameAssignment_1 ) )
            {
            // InternalBurst.g:1422:1: ( ( rule__Intersection__NameAssignment_1 ) )
            // InternalBurst.g:1423:2: ( rule__Intersection__NameAssignment_1 )
            {
             before(grammarAccess.getIntersectionAccess().getNameAssignment_1()); 
            // InternalBurst.g:1424:2: ( rule__Intersection__NameAssignment_1 )
            // InternalBurst.g:1424:3: rule__Intersection__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intersection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Intersection__Group__1__Impl"


    // $ANTLR start "rule__Intersection__Group__2"
    // InternalBurst.g:1432:1: rule__Intersection__Group__2 : rule__Intersection__Group__2__Impl rule__Intersection__Group__3 ;
    public final void rule__Intersection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1436:1: ( rule__Intersection__Group__2__Impl rule__Intersection__Group__3 )
            // InternalBurst.g:1437:2: rule__Intersection__Group__2__Impl rule__Intersection__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Intersection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__3();

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
    // $ANTLR end "rule__Intersection__Group__2"


    // $ANTLR start "rule__Intersection__Group__2__Impl"
    // InternalBurst.g:1444:1: rule__Intersection__Group__2__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Intersection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1448:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1449:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1449:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1450:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:1451:2: ( RULE_ENDLINE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ENDLINE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:1451:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Intersection__Group__2__Impl"


    // $ANTLR start "rule__Intersection__Group__3"
    // InternalBurst.g:1459:1: rule__Intersection__Group__3 : rule__Intersection__Group__3__Impl rule__Intersection__Group__4 ;
    public final void rule__Intersection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1463:1: ( rule__Intersection__Group__3__Impl rule__Intersection__Group__4 )
            // InternalBurst.g:1464:2: rule__Intersection__Group__3__Impl rule__Intersection__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Intersection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__4();

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
    // $ANTLR end "rule__Intersection__Group__3"


    // $ANTLR start "rule__Intersection__Group__3__Impl"
    // InternalBurst.g:1471:1: rule__Intersection__Group__3__Impl : ( ( rule__Intersection__MembersAssignment_3 )* ) ;
    public final void rule__Intersection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1475:1: ( ( ( rule__Intersection__MembersAssignment_3 )* ) )
            // InternalBurst.g:1476:1: ( ( rule__Intersection__MembersAssignment_3 )* )
            {
            // InternalBurst.g:1476:1: ( ( rule__Intersection__MembersAssignment_3 )* )
            // InternalBurst.g:1477:2: ( rule__Intersection__MembersAssignment_3 )*
            {
             before(grammarAccess.getIntersectionAccess().getMembersAssignment_3()); 
            // InternalBurst.g:1478:2: ( rule__Intersection__MembersAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1478:3: rule__Intersection__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Intersection__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIntersectionAccess().getMembersAssignment_3()); 

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
    // $ANTLR end "rule__Intersection__Group__3__Impl"


    // $ANTLR start "rule__Intersection__Group__4"
    // InternalBurst.g:1486:1: rule__Intersection__Group__4 : rule__Intersection__Group__4__Impl rule__Intersection__Group__5 ;
    public final void rule__Intersection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1490:1: ( rule__Intersection__Group__4__Impl rule__Intersection__Group__5 )
            // InternalBurst.g:1491:2: rule__Intersection__Group__4__Impl rule__Intersection__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Intersection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__5();

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
    // $ANTLR end "rule__Intersection__Group__4"


    // $ANTLR start "rule__Intersection__Group__4__Impl"
    // InternalBurst.g:1498:1: rule__Intersection__Group__4__Impl : ( '{' ) ;
    public final void rule__Intersection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1502:1: ( ( '{' ) )
            // InternalBurst.g:1503:1: ( '{' )
            {
            // InternalBurst.g:1503:1: ( '{' )
            // InternalBurst.g:1504:2: '{'
            {
             before(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Intersection__Group__4__Impl"


    // $ANTLR start "rule__Intersection__Group__5"
    // InternalBurst.g:1513:1: rule__Intersection__Group__5 : rule__Intersection__Group__5__Impl rule__Intersection__Group__6 ;
    public final void rule__Intersection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1517:1: ( rule__Intersection__Group__5__Impl rule__Intersection__Group__6 )
            // InternalBurst.g:1518:2: rule__Intersection__Group__5__Impl rule__Intersection__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Intersection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__6();

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
    // $ANTLR end "rule__Intersection__Group__5"


    // $ANTLR start "rule__Intersection__Group__5__Impl"
    // InternalBurst.g:1525:1: rule__Intersection__Group__5__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Intersection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1529:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1530:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1530:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1531:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_5()); 
            // InternalBurst.g:1532:2: ( RULE_ENDLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ENDLINE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBurst.g:1532:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Intersection__Group__5__Impl"


    // $ANTLR start "rule__Intersection__Group__6"
    // InternalBurst.g:1540:1: rule__Intersection__Group__6 : rule__Intersection__Group__6__Impl rule__Intersection__Group__7 ;
    public final void rule__Intersection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1544:1: ( rule__Intersection__Group__6__Impl rule__Intersection__Group__7 )
            // InternalBurst.g:1545:2: rule__Intersection__Group__6__Impl rule__Intersection__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Intersection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__7();

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
    // $ANTLR end "rule__Intersection__Group__6"


    // $ANTLR start "rule__Intersection__Group__6__Impl"
    // InternalBurst.g:1552:1: rule__Intersection__Group__6__Impl : ( ( rule__Intersection__LinesContentAssignment_6 )* ) ;
    public final void rule__Intersection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1556:1: ( ( ( rule__Intersection__LinesContentAssignment_6 )* ) )
            // InternalBurst.g:1557:1: ( ( rule__Intersection__LinesContentAssignment_6 )* )
            {
            // InternalBurst.g:1557:1: ( ( rule__Intersection__LinesContentAssignment_6 )* )
            // InternalBurst.g:1558:2: ( rule__Intersection__LinesContentAssignment_6 )*
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentAssignment_6()); 
            // InternalBurst.g:1559:2: ( rule__Intersection__LinesContentAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:1559:3: rule__Intersection__LinesContentAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Intersection__LinesContentAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getIntersectionAccess().getLinesContentAssignment_6()); 

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
    // $ANTLR end "rule__Intersection__Group__6__Impl"


    // $ANTLR start "rule__Intersection__Group__7"
    // InternalBurst.g:1567:1: rule__Intersection__Group__7 : rule__Intersection__Group__7__Impl rule__Intersection__Group__8 ;
    public final void rule__Intersection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1571:1: ( rule__Intersection__Group__7__Impl rule__Intersection__Group__8 )
            // InternalBurst.g:1572:2: rule__Intersection__Group__7__Impl rule__Intersection__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Intersection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intersection__Group__8();

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
    // $ANTLR end "rule__Intersection__Group__7"


    // $ANTLR start "rule__Intersection__Group__7__Impl"
    // InternalBurst.g:1579:1: rule__Intersection__Group__7__Impl : ( ( RULE_ENDLINE )? ) ;
    public final void rule__Intersection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1583:1: ( ( ( RULE_ENDLINE )? ) )
            // InternalBurst.g:1584:1: ( ( RULE_ENDLINE )? )
            {
            // InternalBurst.g:1584:1: ( ( RULE_ENDLINE )? )
            // InternalBurst.g:1585:2: ( RULE_ENDLINE )?
            {
             before(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_7()); 
            // InternalBurst.g:1586:2: ( RULE_ENDLINE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ENDLINE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBurst.g:1586:3: RULE_ENDLINE
                    {
                    match(input,RULE_ENDLINE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Intersection__Group__7__Impl"


    // $ANTLR start "rule__Intersection__Group__8"
    // InternalBurst.g:1594:1: rule__Intersection__Group__8 : rule__Intersection__Group__8__Impl ;
    public final void rule__Intersection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1598:1: ( rule__Intersection__Group__8__Impl )
            // InternalBurst.g:1599:2: rule__Intersection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intersection__Group__8__Impl();

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
    // $ANTLR end "rule__Intersection__Group__8"


    // $ANTLR start "rule__Intersection__Group__8__Impl"
    // InternalBurst.g:1605:1: rule__Intersection__Group__8__Impl : ( '}' ) ;
    public final void rule__Intersection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1609:1: ( ( '}' ) )
            // InternalBurst.g:1610:1: ( '}' )
            {
            // InternalBurst.g:1610:1: ( '}' )
            // InternalBurst.g:1611:2: '}'
            {
             before(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Intersection__Group__8__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalBurst.g:1621:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1625:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:1626:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBurst.g:1633:1: rule__Line__Group__0__Impl : ( ( rule__Line__FirstAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1637:1: ( ( ( rule__Line__FirstAssignment_0 ) ) )
            // InternalBurst.g:1638:1: ( ( rule__Line__FirstAssignment_0 ) )
            {
            // InternalBurst.g:1638:1: ( ( rule__Line__FirstAssignment_0 ) )
            // InternalBurst.g:1639:2: ( rule__Line__FirstAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getFirstAssignment_0()); 
            // InternalBurst.g:1640:2: ( rule__Line__FirstAssignment_0 )
            // InternalBurst.g:1640:3: rule__Line__FirstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Line__FirstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getFirstAssignment_0()); 

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
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalBurst.g:1648:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1652:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBurst.g:1653:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBurst.g:1660:1: rule__Line__Group__1__Impl : ( ( rule__Line__ListAssignment_1 )* ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1664:1: ( ( ( rule__Line__ListAssignment_1 )* ) )
            // InternalBurst.g:1665:1: ( ( rule__Line__ListAssignment_1 )* )
            {
            // InternalBurst.g:1665:1: ( ( rule__Line__ListAssignment_1 )* )
            // InternalBurst.g:1666:2: ( rule__Line__ListAssignment_1 )*
            {
             before(grammarAccess.getLineAccess().getListAssignment_1()); 
            // InternalBurst.g:1667:2: ( rule__Line__ListAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1667:3: rule__Line__ListAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Line__ListAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getListAssignment_1()); 

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
    // InternalBurst.g:1675:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1679:1: ( rule__Line__Group__2__Impl )
            // InternalBurst.g:1680:2: rule__Line__Group__2__Impl
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
    // InternalBurst.g:1686:1: rule__Line__Group__2__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1690:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1691:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:1691:1: ( RULE_ENDLINE )
            // InternalBurst.g:1692:2: RULE_ENDLINE
            {
             before(grammarAccess.getLineAccess().getENDLINETerminalRuleCall_2()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getENDLINETerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Call__Group_0__0"
    // InternalBurst.g:1702:1: rule__Call__Group_0__0 : rule__Call__Group_0__0__Impl rule__Call__Group_0__1 ;
    public final void rule__Call__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1706:1: ( rule__Call__Group_0__0__Impl rule__Call__Group_0__1 )
            // InternalBurst.g:1707:2: rule__Call__Group_0__0__Impl rule__Call__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Call__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group_0__1();

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
    // $ANTLR end "rule__Call__Group_0__0"


    // $ANTLR start "rule__Call__Group_0__0__Impl"
    // InternalBurst.g:1714:1: rule__Call__Group_0__0__Impl : ( () ) ;
    public final void rule__Call__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1718:1: ( ( () ) )
            // InternalBurst.g:1719:1: ( () )
            {
            // InternalBurst.g:1719:1: ( () )
            // InternalBurst.g:1720:2: ()
            {
             before(grammarAccess.getCallAccess().getCallAction_0_0()); 
            // InternalBurst.g:1721:2: ()
            // InternalBurst.g:1721:3: 
            {
            }

             after(grammarAccess.getCallAccess().getCallAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_0__0__Impl"


    // $ANTLR start "rule__Call__Group_0__1"
    // InternalBurst.g:1729:1: rule__Call__Group_0__1 : rule__Call__Group_0__1__Impl ;
    public final void rule__Call__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1733:1: ( rule__Call__Group_0__1__Impl )
            // InternalBurst.g:1734:2: rule__Call__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group_0__1__Impl();

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
    // $ANTLR end "rule__Call__Group_0__1"


    // $ANTLR start "rule__Call__Group_0__1__Impl"
    // InternalBurst.g:1740:1: rule__Call__Group_0__1__Impl : ( ( rule__Call__NameAssignment_0_1 ) ) ;
    public final void rule__Call__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1744:1: ( ( ( rule__Call__NameAssignment_0_1 ) ) )
            // InternalBurst.g:1745:1: ( ( rule__Call__NameAssignment_0_1 ) )
            {
            // InternalBurst.g:1745:1: ( ( rule__Call__NameAssignment_0_1 ) )
            // InternalBurst.g:1746:2: ( rule__Call__NameAssignment_0_1 )
            {
             before(grammarAccess.getCallAccess().getNameAssignment_0_1()); 
            // InternalBurst.g:1747:2: ( rule__Call__NameAssignment_0_1 )
            // InternalBurst.g:1747:3: rule__Call__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Call__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Call__Group_0__1__Impl"


    // $ANTLR start "rule__MemberCall__Group__0"
    // InternalBurst.g:1756:1: rule__MemberCall__Group__0 : rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 ;
    public final void rule__MemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1760:1: ( rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 )
            // InternalBurst.g:1761:2: rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBurst.g:1768:1: rule__MemberCall__Group__0__Impl : ( () ) ;
    public final void rule__MemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1772:1: ( ( () ) )
            // InternalBurst.g:1773:1: ( () )
            {
            // InternalBurst.g:1773:1: ( () )
            // InternalBurst.g:1774:2: ()
            {
             before(grammarAccess.getMemberCallAccess().getMemberCallAction_0()); 
            // InternalBurst.g:1775:2: ()
            // InternalBurst.g:1775:3: 
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
    // InternalBurst.g:1783:1: rule__MemberCall__Group__1 : rule__MemberCall__Group__1__Impl ;
    public final void rule__MemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1787:1: ( rule__MemberCall__Group__1__Impl )
            // InternalBurst.g:1788:2: rule__MemberCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__Group__1__Impl();

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
    // InternalBurst.g:1794:1: rule__MemberCall__Group__1__Impl : ( ( rule__MemberCall__NameAssignment_1 ) ) ;
    public final void rule__MemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1798:1: ( ( ( rule__MemberCall__NameAssignment_1 ) ) )
            // InternalBurst.g:1799:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            {
            // InternalBurst.g:1799:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            // InternalBurst.g:1800:2: ( rule__MemberCall__NameAssignment_1 )
            {
             before(grammarAccess.getMemberCallAccess().getNameAssignment_1()); 
            // InternalBurst.g:1801:2: ( rule__MemberCall__NameAssignment_1 )
            // InternalBurst.g:1801:3: rule__MemberCall__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberCall__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberCallAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__MemberInConcern__Group__0"
    // InternalBurst.g:1810:1: rule__MemberInConcern__Group__0 : rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 ;
    public final void rule__MemberInConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1814:1: ( rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 )
            // InternalBurst.g:1815:2: rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MemberInConcern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberInConcern__Group__1();

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
    // $ANTLR end "rule__MemberInConcern__Group__0"


    // $ANTLR start "rule__MemberInConcern__Group__0__Impl"
    // InternalBurst.g:1822:1: rule__MemberInConcern__Group__0__Impl : ( () ) ;
    public final void rule__MemberInConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1826:1: ( ( () ) )
            // InternalBurst.g:1827:1: ( () )
            {
            // InternalBurst.g:1827:1: ( () )
            // InternalBurst.g:1828:2: ()
            {
             before(grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0()); 
            // InternalBurst.g:1829:2: ()
            // InternalBurst.g:1829:3: 
            {
            }

             after(grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberInConcern__Group__0__Impl"


    // $ANTLR start "rule__MemberInConcern__Group__1"
    // InternalBurst.g:1837:1: rule__MemberInConcern__Group__1 : rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 ;
    public final void rule__MemberInConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1841:1: ( rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 )
            // InternalBurst.g:1842:2: rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MemberInConcern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberInConcern__Group__2();

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
    // $ANTLR end "rule__MemberInConcern__Group__1"


    // $ANTLR start "rule__MemberInConcern__Group__1__Impl"
    // InternalBurst.g:1849:1: rule__MemberInConcern__Group__1__Impl : ( ( rule__MemberInConcern__TargetAssignment_1 ) ) ;
    public final void rule__MemberInConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1853:1: ( ( ( rule__MemberInConcern__TargetAssignment_1 ) ) )
            // InternalBurst.g:1854:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            {
            // InternalBurst.g:1854:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            // InternalBurst.g:1855:2: ( rule__MemberInConcern__TargetAssignment_1 )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetAssignment_1()); 
            // InternalBurst.g:1856:2: ( rule__MemberInConcern__TargetAssignment_1 )
            // InternalBurst.g:1856:3: rule__MemberInConcern__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberInConcern__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberInConcernAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__MemberInConcern__Group__1__Impl"


    // $ANTLR start "rule__MemberInConcern__Group__2"
    // InternalBurst.g:1864:1: rule__MemberInConcern__Group__2 : rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 ;
    public final void rule__MemberInConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1868:1: ( rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 )
            // InternalBurst.g:1869:2: rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MemberInConcern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberInConcern__Group__3();

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
    // $ANTLR end "rule__MemberInConcern__Group__2"


    // $ANTLR start "rule__MemberInConcern__Group__2__Impl"
    // InternalBurst.g:1876:1: rule__MemberInConcern__Group__2__Impl : ( '.' ) ;
    public final void rule__MemberInConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1880:1: ( ( '.' ) )
            // InternalBurst.g:1881:1: ( '.' )
            {
            // InternalBurst.g:1881:1: ( '.' )
            // InternalBurst.g:1882:2: '.'
            {
             before(grammarAccess.getMemberInConcernAccess().getFullStopKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemberInConcernAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__MemberInConcern__Group__2__Impl"


    // $ANTLR start "rule__MemberInConcern__Group__3"
    // InternalBurst.g:1891:1: rule__MemberInConcern__Group__3 : rule__MemberInConcern__Group__3__Impl ;
    public final void rule__MemberInConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1895:1: ( rule__MemberInConcern__Group__3__Impl )
            // InternalBurst.g:1896:2: rule__MemberInConcern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberInConcern__Group__3__Impl();

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
    // $ANTLR end "rule__MemberInConcern__Group__3"


    // $ANTLR start "rule__MemberInConcern__Group__3__Impl"
    // InternalBurst.g:1902:1: rule__MemberInConcern__Group__3__Impl : ( ( rule__MemberInConcern__NameAssignment_3 ) ) ;
    public final void rule__MemberInConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1906:1: ( ( ( rule__MemberInConcern__NameAssignment_3 ) ) )
            // InternalBurst.g:1907:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            {
            // InternalBurst.g:1907:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            // InternalBurst.g:1908:2: ( rule__MemberInConcern__NameAssignment_3 )
            {
             before(grammarAccess.getMemberInConcernAccess().getNameAssignment_3()); 
            // InternalBurst.g:1909:2: ( rule__MemberInConcern__NameAssignment_3 )
            // InternalBurst.g:1909:3: rule__MemberInConcern__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MemberInConcern__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberInConcernAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__MemberInConcern__Group__3__Impl"


    // $ANTLR start "rule__File__ElementsAssignment"
    // InternalBurst.g:1918:1: rule__File__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1922:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1923:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1923:2: ( ruleAbstractElement )
            // InternalBurst.g:1924:3: ruleAbstractElement
            {
             before(grammarAccess.getFileAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getFileAccess().getElementsAbstractElementParserRuleCall_0()); 

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


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalBurst.g:1933:1: rule__Package__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1937:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1938:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1938:2: ( ruleQualifiedName )
            // InternalBurst.g:1939:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ElementsAssignment_3"
    // InternalBurst.g:1948:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1952:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1953:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1953:2: ( ruleAbstractElement )
            // InternalBurst.g:1954:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Package__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalBurst.g:1963:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1967:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1968:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1968:2: ( ruleQualifiedName )
            // InternalBurst.g:1969:3: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Concern__NameAssignment_3"
    // InternalBurst.g:1978:1: rule__Concern__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1982:1: ( ( RULE_ID ) )
            // InternalBurst.g:1983:2: ( RULE_ID )
            {
            // InternalBurst.g:1983:2: ( RULE_ID )
            // InternalBurst.g:1984:3: RULE_ID
            {
             before(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Concern__NameAssignment_3"


    // $ANTLR start "rule__Concern__SupertypeAssignment_5_2"
    // InternalBurst.g:1993:1: rule__Concern__SupertypeAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Concern__SupertypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1997:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1998:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1998:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1999:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_5_2_0()); 
            // InternalBurst.g:2000:3: ( ruleQualifiedName )
            // InternalBurst.g:2001:4: ruleQualifiedName
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Concern__SupertypeAssignment_5_2"


    // $ANTLR start "rule__Concern__MembersAssignment_6_2_0"
    // InternalBurst.g:2012:1: rule__Concern__MembersAssignment_6_2_0 : ( ruleMember ) ;
    public final void rule__Concern__MembersAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2016:1: ( ( ruleMember ) )
            // InternalBurst.g:2017:2: ( ruleMember )
            {
            // InternalBurst.g:2017:2: ( ruleMember )
            // InternalBurst.g:2018:3: ruleMember
            {
             before(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_6_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_6_2_0_0()); 

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
    // $ANTLR end "rule__Concern__MembersAssignment_6_2_0"


    // $ANTLR start "rule__Concern__IntersectionsAssignment_6_2_1"
    // InternalBurst.g:2027:1: rule__Concern__IntersectionsAssignment_6_2_1 : ( ruleIntersection ) ;
    public final void rule__Concern__IntersectionsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2031:1: ( ( ruleIntersection ) )
            // InternalBurst.g:2032:2: ( ruleIntersection )
            {
            // InternalBurst.g:2032:2: ( ruleIntersection )
            // InternalBurst.g:2033:3: ruleIntersection
            {
             before(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersection();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end "rule__Concern__IntersectionsAssignment_6_2_1"


    // $ANTLR start "rule__Member__ConcernAssignment_1"
    // InternalBurst.g:2042:1: rule__Member__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2046:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:2047:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:2047:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:2048:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:2049:3: ( ruleQualifiedName )
            // InternalBurst.g:2050:4: ruleQualifiedName
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


    // $ANTLR start "rule__Member__NameAssignment_3"
    // InternalBurst.g:2061:1: rule__Member__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2065:1: ( ( RULE_ID ) )
            // InternalBurst.g:2066:2: ( RULE_ID )
            {
            // InternalBurst.g:2066:2: ( RULE_ID )
            // InternalBurst.g:2067:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment_3"


    // $ANTLR start "rule__Intersection__NameAssignment_1"
    // InternalBurst.g:2076:1: rule__Intersection__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__Intersection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2080:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:2081:2: ( ( 'when' ) )
            {
            // InternalBurst.g:2081:2: ( ( 'when' ) )
            // InternalBurst.g:2082:3: ( 'when' )
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:2083:3: ( 'when' )
            // InternalBurst.g:2084:4: 'when'
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 

            }

             after(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 

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
    // $ANTLR end "rule__Intersection__NameAssignment_1"


    // $ANTLR start "rule__Intersection__MembersAssignment_3"
    // InternalBurst.g:2095:1: rule__Intersection__MembersAssignment_3 : ( ruleMember ) ;
    public final void rule__Intersection__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2099:1: ( ( ruleMember ) )
            // InternalBurst.g:2100:2: ( ruleMember )
            {
            // InternalBurst.g:2100:2: ( ruleMember )
            // InternalBurst.g:2101:3: ruleMember
            {
             before(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Intersection__MembersAssignment_3"


    // $ANTLR start "rule__Intersection__LinesContentAssignment_6"
    // InternalBurst.g:2110:1: rule__Intersection__LinesContentAssignment_6 : ( ruleLine ) ;
    public final void rule__Intersection__LinesContentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2114:1: ( ( ruleLine ) )
            // InternalBurst.g:2115:2: ( ruleLine )
            {
            // InternalBurst.g:2115:2: ( ruleLine )
            // InternalBurst.g:2116:3: ruleLine
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Intersection__LinesContentAssignment_6"


    // $ANTLR start "rule__Line__FirstAssignment_0"
    // InternalBurst.g:2125:1: rule__Line__FirstAssignment_0 : ( ruleCall ) ;
    public final void rule__Line__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2129:1: ( ( ruleCall ) )
            // InternalBurst.g:2130:2: ( ruleCall )
            {
            // InternalBurst.g:2130:2: ( ruleCall )
            // InternalBurst.g:2131:3: ruleCall
            {
             before(grammarAccess.getLineAccess().getFirstCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getLineAccess().getFirstCallParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Line__FirstAssignment_0"


    // $ANTLR start "rule__Line__ListAssignment_1"
    // InternalBurst.g:2140:1: rule__Line__ListAssignment_1 : ( ruleCall ) ;
    public final void rule__Line__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2144:1: ( ( ruleCall ) )
            // InternalBurst.g:2145:2: ( ruleCall )
            {
            // InternalBurst.g:2145:2: ( ruleCall )
            // InternalBurst.g:2146:3: ruleCall
            {
             before(grammarAccess.getLineAccess().getListCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getLineAccess().getListCallParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Line__ListAssignment_1"


    // $ANTLR start "rule__Call__NameAssignment_0_1"
    // InternalBurst.g:2155:1: rule__Call__NameAssignment_0_1 : ( ruleMemberCall ) ;
    public final void rule__Call__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2159:1: ( ( ruleMemberCall ) )
            // InternalBurst.g:2160:2: ( ruleMemberCall )
            {
            // InternalBurst.g:2160:2: ( ruleMemberCall )
            // InternalBurst.g:2161:3: ruleMemberCall
            {
             before(grammarAccess.getCallAccess().getNameMemberCallParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberCall();

            state._fsp--;

             after(grammarAccess.getCallAccess().getNameMemberCallParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Call__NameAssignment_0_1"


    // $ANTLR start "rule__Call__NameAssignment_1"
    // InternalBurst.g:2170:1: rule__Call__NameAssignment_1 : ( ruleMemberInConcern ) ;
    public final void rule__Call__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2174:1: ( ( ruleMemberInConcern ) )
            // InternalBurst.g:2175:2: ( ruleMemberInConcern )
            {
            // InternalBurst.g:2175:2: ( ruleMemberInConcern )
            // InternalBurst.g:2176:3: ruleMemberInConcern
            {
             before(grammarAccess.getCallAccess().getNameMemberInConcernParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberInConcern();

            state._fsp--;

             after(grammarAccess.getCallAccess().getNameMemberInConcernParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Call__NameAssignment_1"


    // $ANTLR start "rule__MemberCall__NameAssignment_1"
    // InternalBurst.g:2185:1: rule__MemberCall__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2189:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2190:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2190:2: ( ( RULE_ID ) )
            // InternalBurst.g:2191:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_1_0()); 
            // InternalBurst.g:2192:3: ( RULE_ID )
            // InternalBurst.g:2193:4: RULE_ID
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberCallAccess().getNameMemberIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_1_0()); 

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
    // $ANTLR end "rule__MemberCall__NameAssignment_1"


    // $ANTLR start "rule__MemberInConcern__TargetAssignment_1"
    // InternalBurst.g:2204:1: rule__MemberInConcern__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberInConcern__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2208:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2209:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2209:2: ( ( RULE_ID ) )
            // InternalBurst.g:2210:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 
            // InternalBurst.g:2211:3: ( RULE_ID )
            // InternalBurst.g:2212:4: RULE_ID
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetConcernIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberInConcernAccess().getTargetConcernIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 

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
    // $ANTLR end "rule__MemberInConcern__TargetAssignment_1"


    // $ANTLR start "rule__MemberInConcern__NameAssignment_3"
    // InternalBurst.g:2223:1: rule__MemberInConcern__NameAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MemberInConcern__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2227:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2228:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2228:2: ( ( RULE_ID ) )
            // InternalBurst.g:2229:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberInConcernAccess().getNameMemberCrossReference_3_0()); 
            // InternalBurst.g:2230:3: ( RULE_ID )
            // InternalBurst.g:2231:4: RULE_ID
            {
             before(grammarAccess.getMemberInConcernAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberInConcernAccess().getNameMemberIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMemberInConcernAccess().getNameMemberCrossReference_3_0()); 

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
    // $ANTLR end "rule__MemberInConcern__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000B1012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000B5010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000084030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004030L});

}