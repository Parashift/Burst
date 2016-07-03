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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'when'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||LA1_0==18) ) {
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


    // $ANTLR start "entryRuleMemberCall"
    // InternalBurst.g:278:1: entryRuleMemberCall : ruleMemberCall EOF ;
    public final void entryRuleMemberCall() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleMemberCall EOF )
            // InternalBurst.g:280:1: ruleMemberCall EOF
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
    // InternalBurst.g:287:1: ruleMemberCall : ( ( rule__MemberCall__Group__0 ) ) ;
    public final void ruleMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__MemberCall__Group__0 ) ) )
            // InternalBurst.g:292:2: ( ( rule__MemberCall__Group__0 ) )
            {
            // InternalBurst.g:292:2: ( ( rule__MemberCall__Group__0 ) )
            // InternalBurst.g:293:3: ( rule__MemberCall__Group__0 )
            {
             before(grammarAccess.getMemberCallAccess().getGroup()); 
            // InternalBurst.g:294:3: ( rule__MemberCall__Group__0 )
            // InternalBurst.g:294:4: rule__MemberCall__Group__0
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
    // InternalBurst.g:303:1: entryRuleMemberInConcern : ruleMemberInConcern EOF ;
    public final void entryRuleMemberInConcern() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleMemberInConcern EOF )
            // InternalBurst.g:305:1: ruleMemberInConcern EOF
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
    // InternalBurst.g:312:1: ruleMemberInConcern : ( ( rule__MemberInConcern__Group__0 ) ) ;
    public final void ruleMemberInConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__MemberInConcern__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__MemberInConcern__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__MemberInConcern__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__MemberInConcern__Group__0 )
            {
             before(grammarAccess.getMemberInConcernAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__MemberInConcern__Group__0 )
            // InternalBurst.g:319:4: rule__MemberInConcern__Group__0
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
    // InternalBurst.g:327:1: rule__AbstractElement__Alternatives : ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:331:1: ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBurst.g:332:2: ( ruleImport )
                    {
                    // InternalBurst.g:332:2: ( ruleImport )
                    // InternalBurst.g:333:3: ruleImport
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
                    // InternalBurst.g:338:2: ( ruleConcern )
                    {
                    // InternalBurst.g:338:2: ( ruleConcern )
                    // InternalBurst.g:339:3: ruleConcern
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
                    // InternalBurst.g:344:2: ( ruleIntersection )
                    {
                    // InternalBurst.g:344:2: ( ruleIntersection )
                    // InternalBurst.g:345:3: ruleIntersection
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
                    // InternalBurst.g:350:2: ( rulePackage )
                    {
                    // InternalBurst.g:350:2: ( rulePackage )
                    // InternalBurst.g:351:3: rulePackage
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_3()); 

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


    // $ANTLR start "rule__Concern__Alternatives_4_1"
    // InternalBurst.g:360:1: rule__Concern__Alternatives_4_1 : ( ( ( rule__Concern__MembersAssignment_4_1_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) ) );
    public final void rule__Concern__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:364:1: ( ( ( rule__Concern__MembersAssignment_4_1_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:365:2: ( ( rule__Concern__MembersAssignment_4_1_0 ) )
                    {
                    // InternalBurst.g:365:2: ( ( rule__Concern__MembersAssignment_4_1_0 ) )
                    // InternalBurst.g:366:3: ( rule__Concern__MembersAssignment_4_1_0 )
                    {
                     before(grammarAccess.getConcernAccess().getMembersAssignment_4_1_0()); 
                    // InternalBurst.g:367:3: ( rule__Concern__MembersAssignment_4_1_0 )
                    // InternalBurst.g:367:4: rule__Concern__MembersAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__MembersAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getMembersAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:371:2: ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) )
                    {
                    // InternalBurst.g:371:2: ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) )
                    // InternalBurst.g:372:3: ( rule__Concern__IntersectionsAssignment_4_1_1 )
                    {
                     before(grammarAccess.getConcernAccess().getIntersectionsAssignment_4_1_1()); 
                    // InternalBurst.g:373:3: ( rule__Concern__IntersectionsAssignment_4_1_1 )
                    // InternalBurst.g:373:4: rule__Concern__IntersectionsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__IntersectionsAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getIntersectionsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Concern__Alternatives_4_1"


    // $ANTLR start "rule__Line__Alternatives_0"
    // InternalBurst.g:381:1: rule__Line__Alternatives_0 : ( ( ( rule__Line__CalledAssignment_0_0 ) ) | ( ( rule__Line__Called2Assignment_0_1 ) ) );
    public final void rule__Line__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:385:1: ( ( ( rule__Line__CalledAssignment_0_0 ) ) | ( ( rule__Line__Called2Assignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID||LA4_1==19) ) {
                    alt4=1;
                }
                else if ( (LA4_1==14) ) {
                    alt4=2;
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
                    // InternalBurst.g:386:2: ( ( rule__Line__CalledAssignment_0_0 ) )
                    {
                    // InternalBurst.g:386:2: ( ( rule__Line__CalledAssignment_0_0 ) )
                    // InternalBurst.g:387:3: ( rule__Line__CalledAssignment_0_0 )
                    {
                     before(grammarAccess.getLineAccess().getCalledAssignment_0_0()); 
                    // InternalBurst.g:388:3: ( rule__Line__CalledAssignment_0_0 )
                    // InternalBurst.g:388:4: rule__Line__CalledAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__CalledAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getCalledAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:392:2: ( ( rule__Line__Called2Assignment_0_1 ) )
                    {
                    // InternalBurst.g:392:2: ( ( rule__Line__Called2Assignment_0_1 ) )
                    // InternalBurst.g:393:3: ( rule__Line__Called2Assignment_0_1 )
                    {
                     before(grammarAccess.getLineAccess().getCalled2Assignment_0_1()); 
                    // InternalBurst.g:394:3: ( rule__Line__Called2Assignment_0_1 )
                    // InternalBurst.g:394:4: rule__Line__Called2Assignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Called2Assignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getCalled2Assignment_0_1()); 

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
    // $ANTLR end "rule__Line__Alternatives_0"


    // $ANTLR start "rule__Package__Group__0"
    // InternalBurst.g:402:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:406:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:407:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalBurst.g:414:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:418:1: ( ( 'package' ) )
            // InternalBurst.g:419:1: ( 'package' )
            {
            // InternalBurst.g:419:1: ( 'package' )
            // InternalBurst.g:420:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalBurst.g:429:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:433:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:434:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalBurst.g:441:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:445:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalBurst.g:446:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalBurst.g:446:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalBurst.g:447:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalBurst.g:448:2: ( rule__Package__NameAssignment_1 )
            // InternalBurst.g:448:3: rule__Package__NameAssignment_1
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
    // InternalBurst.g:456:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:460:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:461:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalBurst.g:468:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:472:1: ( ( '{' ) )
            // InternalBurst.g:473:1: ( '{' )
            {
            // InternalBurst.g:473:1: ( '{' )
            // InternalBurst.g:474:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBurst.g:483:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:487:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:488:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalBurst.g:495:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:499:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalBurst.g:500:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalBurst.g:500:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalBurst.g:501:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalBurst.g:502:2: ( rule__Package__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||(LA5_0>=15 && LA5_0<=16)||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:502:3: rule__Package__ElementsAssignment_3
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
    // InternalBurst.g:510:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:514:1: ( rule__Package__Group__4__Impl )
            // InternalBurst.g:515:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__4__Impl();

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
    // InternalBurst.g:521:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:525:1: ( ( '}' ) )
            // InternalBurst.g:526:1: ( '}' )
            {
            // InternalBurst.g:526:1: ( '}' )
            // InternalBurst.g:527:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:537:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:541:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:542:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBurst.g:549:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:553:1: ( ( RULE_ID ) )
            // InternalBurst.g:554:1: ( RULE_ID )
            {
            // InternalBurst.g:554:1: ( RULE_ID )
            // InternalBurst.g:555:2: RULE_ID
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
    // InternalBurst.g:564:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:568:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:569:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:575:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:579:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:580:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:580:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:581:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:582:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBurst.g:582:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalBurst.g:591:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:595:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:596:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:603:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:607:1: ( ( '.' ) )
            // InternalBurst.g:608:1: ( '.' )
            {
            // InternalBurst.g:608:1: ( '.' )
            // InternalBurst.g:609:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBurst.g:618:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:622:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:623:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:629:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:633:1: ( ( RULE_ID ) )
            // InternalBurst.g:634:1: ( RULE_ID )
            {
            // InternalBurst.g:634:1: ( RULE_ID )
            // InternalBurst.g:635:2: RULE_ID
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
    // InternalBurst.g:645:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:649:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:650:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalBurst.g:657:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:661:1: ( ( 'import' ) )
            // InternalBurst.g:662:1: ( 'import' )
            {
            // InternalBurst.g:662:1: ( 'import' )
            // InternalBurst.g:663:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBurst.g:672:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:676:1: ( rule__Import__Group__1__Impl )
            // InternalBurst.g:677:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // InternalBurst.g:683:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:687:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalBurst.g:688:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalBurst.g:688:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalBurst.g:689:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalBurst.g:690:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalBurst.g:690:3: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__Concern__Group__0"
    // InternalBurst.g:699:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:703:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:704:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:711:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:715:1: ( ( () ) )
            // InternalBurst.g:716:1: ( () )
            {
            // InternalBurst.g:716:1: ( () )
            // InternalBurst.g:717:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:718:2: ()
            // InternalBurst.g:718:3: 
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
    // InternalBurst.g:726:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:730:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:731:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBurst.g:738:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:742:1: ( ( 'concern' ) )
            // InternalBurst.g:743:1: ( 'concern' )
            {
            // InternalBurst.g:743:1: ( 'concern' )
            // InternalBurst.g:744:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBurst.g:753:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:757:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:758:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBurst.g:765:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:769:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:770:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:770:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:771:2: ( rule__Concern__NameAssignment_2 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:772:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:772:3: rule__Concern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Concern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:780:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl rule__Concern__Group__4 ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:784:1: ( rule__Concern__Group__3__Impl rule__Concern__Group__4 )
            // InternalBurst.g:785:2: rule__Concern__Group__3__Impl rule__Concern__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalBurst.g:792:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:796:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:797:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:797:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:798:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalBurst.g:799:2: ( rule__Concern__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:799:3: rule__Concern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalBurst.g:807:1: rule__Concern__Group__4 : rule__Concern__Group__4__Impl ;
    public final void rule__Concern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:811:1: ( rule__Concern__Group__4__Impl )
            // InternalBurst.g:812:2: rule__Concern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__4__Impl();

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
    // InternalBurst.g:818:1: rule__Concern__Group__4__Impl : ( ( rule__Concern__Group_4__0 )? ) ;
    public final void rule__Concern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:822:1: ( ( ( rule__Concern__Group_4__0 )? ) )
            // InternalBurst.g:823:1: ( ( rule__Concern__Group_4__0 )? )
            {
            // InternalBurst.g:823:1: ( ( rule__Concern__Group_4__0 )? )
            // InternalBurst.g:824:2: ( rule__Concern__Group_4__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_4()); 
            // InternalBurst.g:825:2: ( rule__Concern__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:825:3: rule__Concern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Concern__Group_3__0"
    // InternalBurst.g:834:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:838:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:839:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Concern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__1();

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
    // $ANTLR end "rule__Concern__Group_3__0"


    // $ANTLR start "rule__Concern__Group_3__0__Impl"
    // InternalBurst.g:846:1: rule__Concern__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:850:1: ( ( 'extends' ) )
            // InternalBurst.g:851:1: ( 'extends' )
            {
            // InternalBurst.g:851:1: ( 'extends' )
            // InternalBurst.g:852:2: 'extends'
            {
             before(grammarAccess.getConcernAccess().getExtendsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__0__Impl"


    // $ANTLR start "rule__Concern__Group_3__1"
    // InternalBurst.g:861:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:865:1: ( rule__Concern__Group_3__1__Impl )
            // InternalBurst.g:866:2: rule__Concern__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__1__Impl();

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
    // $ANTLR end "rule__Concern__Group_3__1"


    // $ANTLR start "rule__Concern__Group_3__1__Impl"
    // InternalBurst.g:872:1: rule__Concern__Group_3__1__Impl : ( ( rule__Concern__SupertypeAssignment_3_1 ) ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:876:1: ( ( ( rule__Concern__SupertypeAssignment_3_1 ) ) )
            // InternalBurst.g:877:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            {
            // InternalBurst.g:877:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            // InternalBurst.g:878:2: ( rule__Concern__SupertypeAssignment_3_1 )
            {
             before(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); 
            // InternalBurst.g:879:2: ( rule__Concern__SupertypeAssignment_3_1 )
            // InternalBurst.g:879:3: rule__Concern__SupertypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Concern__SupertypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__1__Impl"


    // $ANTLR start "rule__Concern__Group_4__0"
    // InternalBurst.g:888:1: rule__Concern__Group_4__0 : rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1 ;
    public final void rule__Concern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:892:1: ( rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1 )
            // InternalBurst.g:893:2: rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_4__1();

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
    // $ANTLR end "rule__Concern__Group_4__0"


    // $ANTLR start "rule__Concern__Group_4__0__Impl"
    // InternalBurst.g:900:1: rule__Concern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Concern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:904:1: ( ( '{' ) )
            // InternalBurst.g:905:1: ( '{' )
            {
            // InternalBurst.g:905:1: ( '{' )
            // InternalBurst.g:906:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_4__0__Impl"


    // $ANTLR start "rule__Concern__Group_4__1"
    // InternalBurst.g:915:1: rule__Concern__Group_4__1 : rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2 ;
    public final void rule__Concern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:919:1: ( rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2 )
            // InternalBurst.g:920:2: rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Concern__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_4__2();

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
    // $ANTLR end "rule__Concern__Group_4__1"


    // $ANTLR start "rule__Concern__Group_4__1__Impl"
    // InternalBurst.g:927:1: rule__Concern__Group_4__1__Impl : ( ( rule__Concern__Alternatives_4_1 )* ) ;
    public final void rule__Concern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:931:1: ( ( ( rule__Concern__Alternatives_4_1 )* ) )
            // InternalBurst.g:932:1: ( ( rule__Concern__Alternatives_4_1 )* )
            {
            // InternalBurst.g:932:1: ( ( rule__Concern__Alternatives_4_1 )* )
            // InternalBurst.g:933:2: ( rule__Concern__Alternatives_4_1 )*
            {
             before(grammarAccess.getConcernAccess().getAlternatives_4_1()); 
            // InternalBurst.g:934:2: ( rule__Concern__Alternatives_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:934:3: rule__Concern__Alternatives_4_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Concern__Alternatives_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_4__1__Impl"


    // $ANTLR start "rule__Concern__Group_4__2"
    // InternalBurst.g:942:1: rule__Concern__Group_4__2 : rule__Concern__Group_4__2__Impl ;
    public final void rule__Concern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:946:1: ( rule__Concern__Group_4__2__Impl )
            // InternalBurst.g:947:2: rule__Concern__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_4__2__Impl();

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
    // $ANTLR end "rule__Concern__Group_4__2"


    // $ANTLR start "rule__Concern__Group_4__2__Impl"
    // InternalBurst.g:953:1: rule__Concern__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Concern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:957:1: ( ( '}' ) )
            // InternalBurst.g:958:1: ( '}' )
            {
            // InternalBurst.g:958:1: ( '}' )
            // InternalBurst.g:959:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_4__2__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:969:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:973:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:974:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalBurst.g:981:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:985:1: ( ( () ) )
            // InternalBurst.g:986:1: ( () )
            {
            // InternalBurst.g:986:1: ( () )
            // InternalBurst.g:987:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:988:2: ()
            // InternalBurst.g:988:3: 
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
    // InternalBurst.g:996:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1000:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:1001:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalBurst.g:1008:1: rule__Member__Group__1__Impl : ( ( rule__Member__ConcernAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1012:1: ( ( ( rule__Member__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1013:1: ( ( rule__Member__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1013:1: ( ( rule__Member__ConcernAssignment_1 ) )
            // InternalBurst.g:1014:2: ( rule__Member__ConcernAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1015:2: ( rule__Member__ConcernAssignment_1 )
            // InternalBurst.g:1015:3: rule__Member__ConcernAssignment_1
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
    // InternalBurst.g:1023:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1027:1: ( rule__Member__Group__2__Impl )
            // InternalBurst.g:1028:2: rule__Member__Group__2__Impl
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
    // InternalBurst.g:1034:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1038:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // InternalBurst.g:1039:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // InternalBurst.g:1039:1: ( ( rule__Member__NameAssignment_2 ) )
            // InternalBurst.g:1040:2: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:1041:2: ( rule__Member__NameAssignment_2 )
            // InternalBurst.g:1041:3: rule__Member__NameAssignment_2
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


    // $ANTLR start "rule__Intersection__Group__0"
    // InternalBurst.g:1050:1: rule__Intersection__Group__0 : rule__Intersection__Group__0__Impl rule__Intersection__Group__1 ;
    public final void rule__Intersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1054:1: ( rule__Intersection__Group__0__Impl rule__Intersection__Group__1 )
            // InternalBurst.g:1055:2: rule__Intersection__Group__0__Impl rule__Intersection__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:1062:1: rule__Intersection__Group__0__Impl : ( () ) ;
    public final void rule__Intersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1066:1: ( ( () ) )
            // InternalBurst.g:1067:1: ( () )
            {
            // InternalBurst.g:1067:1: ( () )
            // InternalBurst.g:1068:2: ()
            {
             before(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1069:2: ()
            // InternalBurst.g:1069:3: 
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
    // InternalBurst.g:1077:1: rule__Intersection__Group__1 : rule__Intersection__Group__1__Impl rule__Intersection__Group__2 ;
    public final void rule__Intersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1081:1: ( rule__Intersection__Group__1__Impl rule__Intersection__Group__2 )
            // InternalBurst.g:1082:2: rule__Intersection__Group__1__Impl rule__Intersection__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBurst.g:1089:1: rule__Intersection__Group__1__Impl : ( ( rule__Intersection__NameAssignment_1 ) ) ;
    public final void rule__Intersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1093:1: ( ( ( rule__Intersection__NameAssignment_1 ) ) )
            // InternalBurst.g:1094:1: ( ( rule__Intersection__NameAssignment_1 ) )
            {
            // InternalBurst.g:1094:1: ( ( rule__Intersection__NameAssignment_1 ) )
            // InternalBurst.g:1095:2: ( rule__Intersection__NameAssignment_1 )
            {
             before(grammarAccess.getIntersectionAccess().getNameAssignment_1()); 
            // InternalBurst.g:1096:2: ( rule__Intersection__NameAssignment_1 )
            // InternalBurst.g:1096:3: rule__Intersection__NameAssignment_1
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
    // InternalBurst.g:1104:1: rule__Intersection__Group__2 : rule__Intersection__Group__2__Impl rule__Intersection__Group__3 ;
    public final void rule__Intersection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1108:1: ( rule__Intersection__Group__2__Impl rule__Intersection__Group__3 )
            // InternalBurst.g:1109:2: rule__Intersection__Group__2__Impl rule__Intersection__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBurst.g:1116:1: rule__Intersection__Group__2__Impl : ( ( rule__Intersection__MembersAssignment_2 )* ) ;
    public final void rule__Intersection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1120:1: ( ( ( rule__Intersection__MembersAssignment_2 )* ) )
            // InternalBurst.g:1121:1: ( ( rule__Intersection__MembersAssignment_2 )* )
            {
            // InternalBurst.g:1121:1: ( ( rule__Intersection__MembersAssignment_2 )* )
            // InternalBurst.g:1122:2: ( rule__Intersection__MembersAssignment_2 )*
            {
             before(grammarAccess.getIntersectionAccess().getMembersAssignment_2()); 
            // InternalBurst.g:1123:2: ( rule__Intersection__MembersAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:1123:3: rule__Intersection__MembersAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Intersection__MembersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIntersectionAccess().getMembersAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:1131:1: rule__Intersection__Group__3 : rule__Intersection__Group__3__Impl rule__Intersection__Group__4 ;
    public final void rule__Intersection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1135:1: ( rule__Intersection__Group__3__Impl rule__Intersection__Group__4 )
            // InternalBurst.g:1136:2: rule__Intersection__Group__3__Impl rule__Intersection__Group__4
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
    // InternalBurst.g:1143:1: rule__Intersection__Group__3__Impl : ( '{' ) ;
    public final void rule__Intersection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1147:1: ( ( '{' ) )
            // InternalBurst.g:1148:1: ( '{' )
            {
            // InternalBurst.g:1148:1: ( '{' )
            // InternalBurst.g:1149:2: '{'
            {
             before(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalBurst.g:1158:1: rule__Intersection__Group__4 : rule__Intersection__Group__4__Impl rule__Intersection__Group__5 ;
    public final void rule__Intersection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1162:1: ( rule__Intersection__Group__4__Impl rule__Intersection__Group__5 )
            // InternalBurst.g:1163:2: rule__Intersection__Group__4__Impl rule__Intersection__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalBurst.g:1170:1: rule__Intersection__Group__4__Impl : ( ( rule__Intersection__LinesContentAssignment_4 )* ) ;
    public final void rule__Intersection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1174:1: ( ( ( rule__Intersection__LinesContentAssignment_4 )* ) )
            // InternalBurst.g:1175:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            {
            // InternalBurst.g:1175:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            // InternalBurst.g:1176:2: ( rule__Intersection__LinesContentAssignment_4 )*
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); 
            // InternalBurst.g:1177:2: ( rule__Intersection__LinesContentAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:1177:3: rule__Intersection__LinesContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Intersection__LinesContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); 

            }


            }

        }
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
    // InternalBurst.g:1185:1: rule__Intersection__Group__5 : rule__Intersection__Group__5__Impl ;
    public final void rule__Intersection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1189:1: ( rule__Intersection__Group__5__Impl )
            // InternalBurst.g:1190:2: rule__Intersection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intersection__Group__5__Impl();

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
    // InternalBurst.g:1196:1: rule__Intersection__Group__5__Impl : ( '}' ) ;
    public final void rule__Intersection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1200:1: ( ( '}' ) )
            // InternalBurst.g:1201:1: ( '}' )
            {
            // InternalBurst.g:1201:1: ( '}' )
            // InternalBurst.g:1202:2: '}'
            {
             before(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Line__Group__0"
    // InternalBurst.g:1212:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1216:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:1217:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBurst.g:1224:1: rule__Line__Group__0__Impl : ( ( rule__Line__Alternatives_0 )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1228:1: ( ( ( rule__Line__Alternatives_0 )* ) )
            // InternalBurst.g:1229:1: ( ( rule__Line__Alternatives_0 )* )
            {
            // InternalBurst.g:1229:1: ( ( rule__Line__Alternatives_0 )* )
            // InternalBurst.g:1230:2: ( rule__Line__Alternatives_0 )*
            {
             before(grammarAccess.getLineAccess().getAlternatives_0()); 
            // InternalBurst.g:1231:2: ( rule__Line__Alternatives_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1231:3: rule__Line__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Line__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalBurst.g:1239:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1243:1: ( rule__Line__Group__1__Impl )
            // InternalBurst.g:1244:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__1__Impl();

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
    // InternalBurst.g:1250:1: rule__Line__Group__1__Impl : ( ( rule__Line__NameAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1254:1: ( ( ( rule__Line__NameAssignment_1 ) ) )
            // InternalBurst.g:1255:1: ( ( rule__Line__NameAssignment_1 ) )
            {
            // InternalBurst.g:1255:1: ( ( rule__Line__NameAssignment_1 ) )
            // InternalBurst.g:1256:2: ( rule__Line__NameAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_1()); 
            // InternalBurst.g:1257:2: ( rule__Line__NameAssignment_1 )
            // InternalBurst.g:1257:3: rule__Line__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MemberCall__Group__0"
    // InternalBurst.g:1266:1: rule__MemberCall__Group__0 : rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 ;
    public final void rule__MemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1270:1: ( rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 )
            // InternalBurst.g:1271:2: rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1
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
    // InternalBurst.g:1278:1: rule__MemberCall__Group__0__Impl : ( () ) ;
    public final void rule__MemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1282:1: ( ( () ) )
            // InternalBurst.g:1283:1: ( () )
            {
            // InternalBurst.g:1283:1: ( () )
            // InternalBurst.g:1284:2: ()
            {
             before(grammarAccess.getMemberCallAccess().getMemberCallAction_0()); 
            // InternalBurst.g:1285:2: ()
            // InternalBurst.g:1285:3: 
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
    // InternalBurst.g:1293:1: rule__MemberCall__Group__1 : rule__MemberCall__Group__1__Impl ;
    public final void rule__MemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1297:1: ( rule__MemberCall__Group__1__Impl )
            // InternalBurst.g:1298:2: rule__MemberCall__Group__1__Impl
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
    // InternalBurst.g:1304:1: rule__MemberCall__Group__1__Impl : ( ( rule__MemberCall__NameAssignment_1 ) ) ;
    public final void rule__MemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1308:1: ( ( ( rule__MemberCall__NameAssignment_1 ) ) )
            // InternalBurst.g:1309:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            {
            // InternalBurst.g:1309:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            // InternalBurst.g:1310:2: ( rule__MemberCall__NameAssignment_1 )
            {
             before(grammarAccess.getMemberCallAccess().getNameAssignment_1()); 
            // InternalBurst.g:1311:2: ( rule__MemberCall__NameAssignment_1 )
            // InternalBurst.g:1311:3: rule__MemberCall__NameAssignment_1
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
    // InternalBurst.g:1320:1: rule__MemberInConcern__Group__0 : rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 ;
    public final void rule__MemberInConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1324:1: ( rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 )
            // InternalBurst.g:1325:2: rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1
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
    // InternalBurst.g:1332:1: rule__MemberInConcern__Group__0__Impl : ( () ) ;
    public final void rule__MemberInConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1336:1: ( ( () ) )
            // InternalBurst.g:1337:1: ( () )
            {
            // InternalBurst.g:1337:1: ( () )
            // InternalBurst.g:1338:2: ()
            {
             before(grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0()); 
            // InternalBurst.g:1339:2: ()
            // InternalBurst.g:1339:3: 
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
    // InternalBurst.g:1347:1: rule__MemberInConcern__Group__1 : rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 ;
    public final void rule__MemberInConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1351:1: ( rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 )
            // InternalBurst.g:1352:2: rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBurst.g:1359:1: rule__MemberInConcern__Group__1__Impl : ( ( rule__MemberInConcern__TargetAssignment_1 ) ) ;
    public final void rule__MemberInConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1363:1: ( ( ( rule__MemberInConcern__TargetAssignment_1 ) ) )
            // InternalBurst.g:1364:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            {
            // InternalBurst.g:1364:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            // InternalBurst.g:1365:2: ( rule__MemberInConcern__TargetAssignment_1 )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetAssignment_1()); 
            // InternalBurst.g:1366:2: ( rule__MemberInConcern__TargetAssignment_1 )
            // InternalBurst.g:1366:3: rule__MemberInConcern__TargetAssignment_1
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
    // InternalBurst.g:1374:1: rule__MemberInConcern__Group__2 : rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 ;
    public final void rule__MemberInConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1378:1: ( rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 )
            // InternalBurst.g:1379:2: rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3
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
    // InternalBurst.g:1386:1: rule__MemberInConcern__Group__2__Impl : ( '.' ) ;
    public final void rule__MemberInConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1390:1: ( ( '.' ) )
            // InternalBurst.g:1391:1: ( '.' )
            {
            // InternalBurst.g:1391:1: ( '.' )
            // InternalBurst.g:1392:2: '.'
            {
             before(grammarAccess.getMemberInConcernAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBurst.g:1401:1: rule__MemberInConcern__Group__3 : rule__MemberInConcern__Group__3__Impl ;
    public final void rule__MemberInConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1405:1: ( rule__MemberInConcern__Group__3__Impl )
            // InternalBurst.g:1406:2: rule__MemberInConcern__Group__3__Impl
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
    // InternalBurst.g:1412:1: rule__MemberInConcern__Group__3__Impl : ( ( rule__MemberInConcern__NameAssignment_3 ) ) ;
    public final void rule__MemberInConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1416:1: ( ( ( rule__MemberInConcern__NameAssignment_3 ) ) )
            // InternalBurst.g:1417:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            {
            // InternalBurst.g:1417:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            // InternalBurst.g:1418:2: ( rule__MemberInConcern__NameAssignment_3 )
            {
             before(grammarAccess.getMemberInConcernAccess().getNameAssignment_3()); 
            // InternalBurst.g:1419:2: ( rule__MemberInConcern__NameAssignment_3 )
            // InternalBurst.g:1419:3: rule__MemberInConcern__NameAssignment_3
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
    // InternalBurst.g:1428:1: rule__File__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1432:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1433:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1433:2: ( ruleAbstractElement )
            // InternalBurst.g:1434:3: ruleAbstractElement
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
    // InternalBurst.g:1443:1: rule__Package__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1447:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1448:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1448:2: ( ruleQualifiedName )
            // InternalBurst.g:1449:3: ruleQualifiedName
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
    // InternalBurst.g:1458:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1462:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1463:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1463:2: ( ruleAbstractElement )
            // InternalBurst.g:1464:3: ruleAbstractElement
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
    // InternalBurst.g:1473:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1477:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1478:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1478:2: ( ruleQualifiedName )
            // InternalBurst.g:1479:3: ruleQualifiedName
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


    // $ANTLR start "rule__Concern__NameAssignment_2"
    // InternalBurst.g:1488:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1492:1: ( ( RULE_ID ) )
            // InternalBurst.g:1493:2: ( RULE_ID )
            {
            // InternalBurst.g:1493:2: ( RULE_ID )
            // InternalBurst.g:1494:3: RULE_ID
            {
             before(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__NameAssignment_2"


    // $ANTLR start "rule__Concern__SupertypeAssignment_3_1"
    // InternalBurst.g:1503:1: rule__Concern__SupertypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Concern__SupertypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1507:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1508:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1508:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1509:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); 
            // InternalBurst.g:1510:3: ( ruleQualifiedName )
            // InternalBurst.g:1511:4: ruleQualifiedName
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getSupertypeConcernQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__SupertypeAssignment_3_1"


    // $ANTLR start "rule__Concern__MembersAssignment_4_1_0"
    // InternalBurst.g:1522:1: rule__Concern__MembersAssignment_4_1_0 : ( ruleMember ) ;
    public final void rule__Concern__MembersAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1526:1: ( ( ruleMember ) )
            // InternalBurst.g:1527:2: ( ruleMember )
            {
            // InternalBurst.g:1527:2: ( ruleMember )
            // InternalBurst.g:1528:3: ruleMember
            {
             before(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__MembersAssignment_4_1_0"


    // $ANTLR start "rule__Concern__IntersectionsAssignment_4_1_1"
    // InternalBurst.g:1537:1: rule__Concern__IntersectionsAssignment_4_1_1 : ( ruleIntersection ) ;
    public final void rule__Concern__IntersectionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1541:1: ( ( ruleIntersection ) )
            // InternalBurst.g:1542:2: ( ruleIntersection )
            {
            // InternalBurst.g:1542:2: ( ruleIntersection )
            // InternalBurst.g:1543:3: ruleIntersection
            {
             before(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersection();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__IntersectionsAssignment_4_1_1"


    // $ANTLR start "rule__Member__ConcernAssignment_1"
    // InternalBurst.g:1552:1: rule__Member__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1556:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1557:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1557:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1558:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:1559:3: ( ruleQualifiedName )
            // InternalBurst.g:1560:4: ruleQualifiedName
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
    // InternalBurst.g:1571:1: rule__Member__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1575:1: ( ( RULE_ID ) )
            // InternalBurst.g:1576:2: ( RULE_ID )
            {
            // InternalBurst.g:1576:2: ( RULE_ID )
            // InternalBurst.g:1577:3: RULE_ID
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


    // $ANTLR start "rule__Intersection__NameAssignment_1"
    // InternalBurst.g:1586:1: rule__Intersection__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__Intersection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1590:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:1591:2: ( ( 'when' ) )
            {
            // InternalBurst.g:1591:2: ( ( 'when' ) )
            // InternalBurst.g:1592:3: ( 'when' )
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:1593:3: ( 'when' )
            // InternalBurst.g:1594:4: 'when'
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__Intersection__MembersAssignment_2"
    // InternalBurst.g:1605:1: rule__Intersection__MembersAssignment_2 : ( ruleMember ) ;
    public final void rule__Intersection__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1609:1: ( ( ruleMember ) )
            // InternalBurst.g:1610:2: ( ruleMember )
            {
            // InternalBurst.g:1610:2: ( ruleMember )
            // InternalBurst.g:1611:3: ruleMember
            {
             before(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intersection__MembersAssignment_2"


    // $ANTLR start "rule__Intersection__LinesContentAssignment_4"
    // InternalBurst.g:1620:1: rule__Intersection__LinesContentAssignment_4 : ( ruleLine ) ;
    public final void rule__Intersection__LinesContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1624:1: ( ( ruleLine ) )
            // InternalBurst.g:1625:2: ( ruleLine )
            {
            // InternalBurst.g:1625:2: ( ruleLine )
            // InternalBurst.g:1626:3: ruleLine
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intersection__LinesContentAssignment_4"


    // $ANTLR start "rule__Line__CalledAssignment_0_0"
    // InternalBurst.g:1635:1: rule__Line__CalledAssignment_0_0 : ( ruleMemberCall ) ;
    public final void rule__Line__CalledAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1639:1: ( ( ruleMemberCall ) )
            // InternalBurst.g:1640:2: ( ruleMemberCall )
            {
            // InternalBurst.g:1640:2: ( ruleMemberCall )
            // InternalBurst.g:1641:3: ruleMemberCall
            {
             before(grammarAccess.getLineAccess().getCalledMemberCallParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberCall();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCalledMemberCallParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CalledAssignment_0_0"


    // $ANTLR start "rule__Line__Called2Assignment_0_1"
    // InternalBurst.g:1650:1: rule__Line__Called2Assignment_0_1 : ( ruleMemberInConcern ) ;
    public final void rule__Line__Called2Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1654:1: ( ( ruleMemberInConcern ) )
            // InternalBurst.g:1655:2: ( ruleMemberInConcern )
            {
            // InternalBurst.g:1655:2: ( ruleMemberInConcern )
            // InternalBurst.g:1656:3: ruleMemberInConcern
            {
             before(grammarAccess.getLineAccess().getCalled2MemberInConcernParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberInConcern();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCalled2MemberInConcernParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Called2Assignment_0_1"


    // $ANTLR start "rule__Line__NameAssignment_1"
    // InternalBurst.g:1665:1: rule__Line__NameAssignment_1 : ( ( ';' ) ) ;
    public final void rule__Line__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1669:1: ( ( ( ';' ) ) )
            // InternalBurst.g:1670:2: ( ( ';' ) )
            {
            // InternalBurst.g:1670:2: ( ( ';' ) )
            // InternalBurst.g:1671:3: ( ';' )
            {
             before(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 
            // InternalBurst.g:1672:3: ( ';' )
            // InternalBurst.g:1673:4: ';'
            {
             before(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 

            }

             after(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__NameAssignment_1"


    // $ANTLR start "rule__MemberCall__NameAssignment_1"
    // InternalBurst.g:1684:1: rule__MemberCall__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1688:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:1689:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:1689:2: ( ( RULE_ID ) )
            // InternalBurst.g:1690:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_1_0()); 
            // InternalBurst.g:1691:3: ( RULE_ID )
            // InternalBurst.g:1692:4: RULE_ID
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
    // InternalBurst.g:1703:1: rule__MemberInConcern__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberInConcern__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1707:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:1708:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:1708:2: ( ( RULE_ID ) )
            // InternalBurst.g:1709:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 
            // InternalBurst.g:1710:3: ( RULE_ID )
            // InternalBurst.g:1711:4: RULE_ID
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
    // InternalBurst.g:1722:1: rule__MemberInConcern__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MemberInConcern__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1726:1: ( ( RULE_ID ) )
            // InternalBurst.g:1727:2: ( RULE_ID )
            {
            // InternalBurst.g:1727:2: ( RULE_ID )
            // InternalBurst.g:1728:3: RULE_ID
            {
             before(grammarAccess.getMemberInConcernAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberInConcernAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000082010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080010L});

}