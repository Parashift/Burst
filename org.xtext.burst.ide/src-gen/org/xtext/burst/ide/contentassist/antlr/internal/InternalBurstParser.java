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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'dispose'", "'new'", "'when'", "';'"
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||LA1_0==20) ) {
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


    // $ANTLR start "entryRuleDestruct"
    // InternalBurst.g:203:1: entryRuleDestruct : ruleDestruct EOF ;
    public final void entryRuleDestruct() throws RecognitionException {
        try {
            // InternalBurst.g:204:1: ( ruleDestruct EOF )
            // InternalBurst.g:205:1: ruleDestruct EOF
            {
             before(grammarAccess.getDestructRule()); 
            pushFollow(FOLLOW_1);
            ruleDestruct();

            state._fsp--;

             after(grammarAccess.getDestructRule()); 
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
    // $ANTLR end "entryRuleDestruct"


    // $ANTLR start "ruleDestruct"
    // InternalBurst.g:212:1: ruleDestruct : ( ( rule__Destruct__Group__0 ) ) ;
    public final void ruleDestruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:216:2: ( ( ( rule__Destruct__Group__0 ) ) )
            // InternalBurst.g:217:2: ( ( rule__Destruct__Group__0 ) )
            {
            // InternalBurst.g:217:2: ( ( rule__Destruct__Group__0 ) )
            // InternalBurst.g:218:3: ( rule__Destruct__Group__0 )
            {
             before(grammarAccess.getDestructAccess().getGroup()); 
            // InternalBurst.g:219:3: ( rule__Destruct__Group__0 )
            // InternalBurst.g:219:4: rule__Destruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestruct"


    // $ANTLR start "entryRuleBuild"
    // InternalBurst.g:228:1: entryRuleBuild : ruleBuild EOF ;
    public final void entryRuleBuild() throws RecognitionException {
        try {
            // InternalBurst.g:229:1: ( ruleBuild EOF )
            // InternalBurst.g:230:1: ruleBuild EOF
            {
             before(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            ruleBuild();

            state._fsp--;

             after(grammarAccess.getBuildRule()); 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalBurst.g:237:1: ruleBuild : ( ( rule__Build__Group__0 ) ) ;
    public final void ruleBuild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:241:2: ( ( ( rule__Build__Group__0 ) ) )
            // InternalBurst.g:242:2: ( ( rule__Build__Group__0 ) )
            {
            // InternalBurst.g:242:2: ( ( rule__Build__Group__0 ) )
            // InternalBurst.g:243:3: ( rule__Build__Group__0 )
            {
             before(grammarAccess.getBuildAccess().getGroup()); 
            // InternalBurst.g:244:3: ( rule__Build__Group__0 )
            // InternalBurst.g:244:4: rule__Build__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Build__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:253:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:254:1: ( ruleMember EOF )
            // InternalBurst.g:255:1: ruleMember EOF
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
    // InternalBurst.g:262:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:266:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:267:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:267:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:268:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalBurst.g:269:3: ( rule__Member__Group__0 )
            // InternalBurst.g:269:4: rule__Member__Group__0
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
    // InternalBurst.g:278:1: entryRuleIntersection : ruleIntersection EOF ;
    public final void entryRuleIntersection() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleIntersection EOF )
            // InternalBurst.g:280:1: ruleIntersection EOF
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
    // InternalBurst.g:287:1: ruleIntersection : ( ( rule__Intersection__Group__0 ) ) ;
    public final void ruleIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__Intersection__Group__0 ) ) )
            // InternalBurst.g:292:2: ( ( rule__Intersection__Group__0 ) )
            {
            // InternalBurst.g:292:2: ( ( rule__Intersection__Group__0 ) )
            // InternalBurst.g:293:3: ( rule__Intersection__Group__0 )
            {
             before(grammarAccess.getIntersectionAccess().getGroup()); 
            // InternalBurst.g:294:3: ( rule__Intersection__Group__0 )
            // InternalBurst.g:294:4: rule__Intersection__Group__0
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
    // InternalBurst.g:303:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleLine EOF )
            // InternalBurst.g:305:1: ruleLine EOF
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
    // InternalBurst.g:312:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__Line__Group__0 )
            // InternalBurst.g:319:4: rule__Line__Group__0
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
    // InternalBurst.g:328:1: entryRuleMemberCall : ruleMemberCall EOF ;
    public final void entryRuleMemberCall() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleMemberCall EOF )
            // InternalBurst.g:330:1: ruleMemberCall EOF
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
    // InternalBurst.g:337:1: ruleMemberCall : ( ( rule__MemberCall__Group__0 ) ) ;
    public final void ruleMemberCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__MemberCall__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__MemberCall__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__MemberCall__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__MemberCall__Group__0 )
            {
             before(grammarAccess.getMemberCallAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__MemberCall__Group__0 )
            // InternalBurst.g:344:4: rule__MemberCall__Group__0
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
    // InternalBurst.g:353:1: entryRuleMemberInConcern : ruleMemberInConcern EOF ;
    public final void entryRuleMemberInConcern() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleMemberInConcern EOF )
            // InternalBurst.g:355:1: ruleMemberInConcern EOF
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
    // InternalBurst.g:362:1: ruleMemberInConcern : ( ( rule__MemberInConcern__Group__0 ) ) ;
    public final void ruleMemberInConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__MemberInConcern__Group__0 ) ) )
            // InternalBurst.g:367:2: ( ( rule__MemberInConcern__Group__0 ) )
            {
            // InternalBurst.g:367:2: ( ( rule__MemberInConcern__Group__0 ) )
            // InternalBurst.g:368:3: ( rule__MemberInConcern__Group__0 )
            {
             before(grammarAccess.getMemberInConcernAccess().getGroup()); 
            // InternalBurst.g:369:3: ( rule__MemberInConcern__Group__0 )
            // InternalBurst.g:369:4: rule__MemberInConcern__Group__0
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
    // InternalBurst.g:377:1: rule__AbstractElement__Alternatives : ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:381:1: ( ( ruleImport ) | ( ruleConcern ) | ( ruleIntersection ) | ( rulePackage ) )
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
            case 20:
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
                    // InternalBurst.g:382:2: ( ruleImport )
                    {
                    // InternalBurst.g:382:2: ( ruleImport )
                    // InternalBurst.g:383:3: ruleImport
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
                    // InternalBurst.g:388:2: ( ruleConcern )
                    {
                    // InternalBurst.g:388:2: ( ruleConcern )
                    // InternalBurst.g:389:3: ruleConcern
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
                    // InternalBurst.g:394:2: ( ruleIntersection )
                    {
                    // InternalBurst.g:394:2: ( ruleIntersection )
                    // InternalBurst.g:395:3: ruleIntersection
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
                    // InternalBurst.g:400:2: ( rulePackage )
                    {
                    // InternalBurst.g:400:2: ( rulePackage )
                    // InternalBurst.g:401:3: rulePackage
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
    // InternalBurst.g:410:1: rule__Concern__Alternatives_4_1 : ( ( ( rule__Concern__MembersAssignment_4_1_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) ) | ( ( rule__Concern__BuildAssignment_4_1_2 ) ) | ( ( rule__Concern__DestructAssignment_4_1_3 ) ) );
    public final void rule__Concern__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:414:1: ( ( ( rule__Concern__MembersAssignment_4_1_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) ) | ( ( rule__Concern__BuildAssignment_4_1_2 ) ) | ( ( rule__Concern__DestructAssignment_4_1_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBurst.g:415:2: ( ( rule__Concern__MembersAssignment_4_1_0 ) )
                    {
                    // InternalBurst.g:415:2: ( ( rule__Concern__MembersAssignment_4_1_0 ) )
                    // InternalBurst.g:416:3: ( rule__Concern__MembersAssignment_4_1_0 )
                    {
                     before(grammarAccess.getConcernAccess().getMembersAssignment_4_1_0()); 
                    // InternalBurst.g:417:3: ( rule__Concern__MembersAssignment_4_1_0 )
                    // InternalBurst.g:417:4: rule__Concern__MembersAssignment_4_1_0
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
                    // InternalBurst.g:421:2: ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) )
                    {
                    // InternalBurst.g:421:2: ( ( rule__Concern__IntersectionsAssignment_4_1_1 ) )
                    // InternalBurst.g:422:3: ( rule__Concern__IntersectionsAssignment_4_1_1 )
                    {
                     before(grammarAccess.getConcernAccess().getIntersectionsAssignment_4_1_1()); 
                    // InternalBurst.g:423:3: ( rule__Concern__IntersectionsAssignment_4_1_1 )
                    // InternalBurst.g:423:4: rule__Concern__IntersectionsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__IntersectionsAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getIntersectionsAssignment_4_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:427:2: ( ( rule__Concern__BuildAssignment_4_1_2 ) )
                    {
                    // InternalBurst.g:427:2: ( ( rule__Concern__BuildAssignment_4_1_2 ) )
                    // InternalBurst.g:428:3: ( rule__Concern__BuildAssignment_4_1_2 )
                    {
                     before(grammarAccess.getConcernAccess().getBuildAssignment_4_1_2()); 
                    // InternalBurst.g:429:3: ( rule__Concern__BuildAssignment_4_1_2 )
                    // InternalBurst.g:429:4: rule__Concern__BuildAssignment_4_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__BuildAssignment_4_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getBuildAssignment_4_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:433:2: ( ( rule__Concern__DestructAssignment_4_1_3 ) )
                    {
                    // InternalBurst.g:433:2: ( ( rule__Concern__DestructAssignment_4_1_3 ) )
                    // InternalBurst.g:434:3: ( rule__Concern__DestructAssignment_4_1_3 )
                    {
                     before(grammarAccess.getConcernAccess().getDestructAssignment_4_1_3()); 
                    // InternalBurst.g:435:3: ( rule__Concern__DestructAssignment_4_1_3 )
                    // InternalBurst.g:435:4: rule__Concern__DestructAssignment_4_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__DestructAssignment_4_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getDestructAssignment_4_1_3()); 

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
    // InternalBurst.g:443:1: rule__Line__Alternatives_0 : ( ( ( rule__Line__CalledAssignment_0_0 ) ) | ( ( rule__Line__Called2Assignment_0_1 ) ) );
    public final void rule__Line__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:447:1: ( ( ( rule__Line__CalledAssignment_0_0 ) ) | ( ( rule__Line__Called2Assignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID||LA4_1==21) ) {
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
                    // InternalBurst.g:448:2: ( ( rule__Line__CalledAssignment_0_0 ) )
                    {
                    // InternalBurst.g:448:2: ( ( rule__Line__CalledAssignment_0_0 ) )
                    // InternalBurst.g:449:3: ( rule__Line__CalledAssignment_0_0 )
                    {
                     before(grammarAccess.getLineAccess().getCalledAssignment_0_0()); 
                    // InternalBurst.g:450:3: ( rule__Line__CalledAssignment_0_0 )
                    // InternalBurst.g:450:4: rule__Line__CalledAssignment_0_0
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
                    // InternalBurst.g:454:2: ( ( rule__Line__Called2Assignment_0_1 ) )
                    {
                    // InternalBurst.g:454:2: ( ( rule__Line__Called2Assignment_0_1 ) )
                    // InternalBurst.g:455:3: ( rule__Line__Called2Assignment_0_1 )
                    {
                     before(grammarAccess.getLineAccess().getCalled2Assignment_0_1()); 
                    // InternalBurst.g:456:3: ( rule__Line__Called2Assignment_0_1 )
                    // InternalBurst.g:456:4: rule__Line__Called2Assignment_0_1
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
    // InternalBurst.g:464:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:468:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:469:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalBurst.g:476:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:480:1: ( ( 'package' ) )
            // InternalBurst.g:481:1: ( 'package' )
            {
            // InternalBurst.g:481:1: ( 'package' )
            // InternalBurst.g:482:2: 'package'
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
    // InternalBurst.g:491:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:495:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:496:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalBurst.g:503:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:507:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalBurst.g:508:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalBurst.g:508:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalBurst.g:509:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalBurst.g:510:2: ( rule__Package__NameAssignment_1 )
            // InternalBurst.g:510:3: rule__Package__NameAssignment_1
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
    // InternalBurst.g:518:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:522:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:523:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalBurst.g:530:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:534:1: ( ( '{' ) )
            // InternalBurst.g:535:1: ( '{' )
            {
            // InternalBurst.g:535:1: ( '{' )
            // InternalBurst.g:536:2: '{'
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
    // InternalBurst.g:545:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:549:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:550:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalBurst.g:557:1: rule__Package__Group__3__Impl : ( ( rule__Package__ElementsAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:561:1: ( ( ( rule__Package__ElementsAssignment_3 )* ) )
            // InternalBurst.g:562:1: ( ( rule__Package__ElementsAssignment_3 )* )
            {
            // InternalBurst.g:562:1: ( ( rule__Package__ElementsAssignment_3 )* )
            // InternalBurst.g:563:2: ( rule__Package__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_3()); 
            // InternalBurst.g:564:2: ( rule__Package__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||(LA5_0>=15 && LA5_0<=16)||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:564:3: rule__Package__ElementsAssignment_3
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
    // InternalBurst.g:572:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:576:1: ( rule__Package__Group__4__Impl )
            // InternalBurst.g:577:2: rule__Package__Group__4__Impl
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
    // InternalBurst.g:583:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:587:1: ( ( '}' ) )
            // InternalBurst.g:588:1: ( '}' )
            {
            // InternalBurst.g:588:1: ( '}' )
            // InternalBurst.g:589:2: '}'
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
    // InternalBurst.g:599:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:603:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:604:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalBurst.g:611:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:615:1: ( ( RULE_ID ) )
            // InternalBurst.g:616:1: ( RULE_ID )
            {
            // InternalBurst.g:616:1: ( RULE_ID )
            // InternalBurst.g:617:2: RULE_ID
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
    // InternalBurst.g:626:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:630:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:631:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:637:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:641:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:642:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:642:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:643:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:644:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBurst.g:644:3: rule__QualifiedName__Group_1__0
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
    // InternalBurst.g:653:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:657:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:658:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:665:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:669:1: ( ( '.' ) )
            // InternalBurst.g:670:1: ( '.' )
            {
            // InternalBurst.g:670:1: ( '.' )
            // InternalBurst.g:671:2: '.'
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
    // InternalBurst.g:680:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:684:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:685:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:691:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:695:1: ( ( RULE_ID ) )
            // InternalBurst.g:696:1: ( RULE_ID )
            {
            // InternalBurst.g:696:1: ( RULE_ID )
            // InternalBurst.g:697:2: RULE_ID
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
    // InternalBurst.g:707:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:711:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:712:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalBurst.g:719:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:723:1: ( ( 'import' ) )
            // InternalBurst.g:724:1: ( 'import' )
            {
            // InternalBurst.g:724:1: ( 'import' )
            // InternalBurst.g:725:2: 'import'
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
    // InternalBurst.g:734:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:738:1: ( rule__Import__Group__1__Impl )
            // InternalBurst.g:739:2: rule__Import__Group__1__Impl
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
    // InternalBurst.g:745:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:749:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalBurst.g:750:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalBurst.g:750:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalBurst.g:751:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalBurst.g:752:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalBurst.g:752:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalBurst.g:761:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:765:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:766:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
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
    // InternalBurst.g:773:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:777:1: ( ( () ) )
            // InternalBurst.g:778:1: ( () )
            {
            // InternalBurst.g:778:1: ( () )
            // InternalBurst.g:779:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:780:2: ()
            // InternalBurst.g:780:3: 
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
    // InternalBurst.g:788:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:792:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:793:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
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
    // InternalBurst.g:800:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:804:1: ( ( 'concern' ) )
            // InternalBurst.g:805:1: ( 'concern' )
            {
            // InternalBurst.g:805:1: ( 'concern' )
            // InternalBurst.g:806:2: 'concern'
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
    // InternalBurst.g:815:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:819:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:820:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
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
    // InternalBurst.g:827:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:831:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:832:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:832:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:833:2: ( rule__Concern__NameAssignment_2 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:834:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:834:3: rule__Concern__NameAssignment_2
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
    // InternalBurst.g:842:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl rule__Concern__Group__4 ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:846:1: ( rule__Concern__Group__3__Impl rule__Concern__Group__4 )
            // InternalBurst.g:847:2: rule__Concern__Group__3__Impl rule__Concern__Group__4
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
    // InternalBurst.g:854:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:858:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:859:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:859:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:860:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalBurst.g:861:2: ( rule__Concern__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:861:3: rule__Concern__Group_3__0
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
    // InternalBurst.g:869:1: rule__Concern__Group__4 : rule__Concern__Group__4__Impl ;
    public final void rule__Concern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:873:1: ( rule__Concern__Group__4__Impl )
            // InternalBurst.g:874:2: rule__Concern__Group__4__Impl
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
    // InternalBurst.g:880:1: rule__Concern__Group__4__Impl : ( ( rule__Concern__Group_4__0 )? ) ;
    public final void rule__Concern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:884:1: ( ( ( rule__Concern__Group_4__0 )? ) )
            // InternalBurst.g:885:1: ( ( rule__Concern__Group_4__0 )? )
            {
            // InternalBurst.g:885:1: ( ( rule__Concern__Group_4__0 )? )
            // InternalBurst.g:886:2: ( rule__Concern__Group_4__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_4()); 
            // InternalBurst.g:887:2: ( rule__Concern__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:887:3: rule__Concern__Group_4__0
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
    // InternalBurst.g:896:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:900:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:901:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
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
    // InternalBurst.g:908:1: rule__Concern__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:912:1: ( ( 'extends' ) )
            // InternalBurst.g:913:1: ( 'extends' )
            {
            // InternalBurst.g:913:1: ( 'extends' )
            // InternalBurst.g:914:2: 'extends'
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
    // InternalBurst.g:923:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:927:1: ( rule__Concern__Group_3__1__Impl )
            // InternalBurst.g:928:2: rule__Concern__Group_3__1__Impl
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
    // InternalBurst.g:934:1: rule__Concern__Group_3__1__Impl : ( ( rule__Concern__SupertypeAssignment_3_1 ) ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:938:1: ( ( ( rule__Concern__SupertypeAssignment_3_1 ) ) )
            // InternalBurst.g:939:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            {
            // InternalBurst.g:939:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            // InternalBurst.g:940:2: ( rule__Concern__SupertypeAssignment_3_1 )
            {
             before(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); 
            // InternalBurst.g:941:2: ( rule__Concern__SupertypeAssignment_3_1 )
            // InternalBurst.g:941:3: rule__Concern__SupertypeAssignment_3_1
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
    // InternalBurst.g:950:1: rule__Concern__Group_4__0 : rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1 ;
    public final void rule__Concern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:954:1: ( rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1 )
            // InternalBurst.g:955:2: rule__Concern__Group_4__0__Impl rule__Concern__Group_4__1
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
    // InternalBurst.g:962:1: rule__Concern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Concern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:966:1: ( ( '{' ) )
            // InternalBurst.g:967:1: ( '{' )
            {
            // InternalBurst.g:967:1: ( '{' )
            // InternalBurst.g:968:2: '{'
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
    // InternalBurst.g:977:1: rule__Concern__Group_4__1 : rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2 ;
    public final void rule__Concern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:981:1: ( rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2 )
            // InternalBurst.g:982:2: rule__Concern__Group_4__1__Impl rule__Concern__Group_4__2
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
    // InternalBurst.g:989:1: rule__Concern__Group_4__1__Impl : ( ( rule__Concern__Alternatives_4_1 )* ) ;
    public final void rule__Concern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:993:1: ( ( ( rule__Concern__Alternatives_4_1 )* ) )
            // InternalBurst.g:994:1: ( ( rule__Concern__Alternatives_4_1 )* )
            {
            // InternalBurst.g:994:1: ( ( rule__Concern__Alternatives_4_1 )* )
            // InternalBurst.g:995:2: ( rule__Concern__Alternatives_4_1 )*
            {
             before(grammarAccess.getConcernAccess().getAlternatives_4_1()); 
            // InternalBurst.g:996:2: ( rule__Concern__Alternatives_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=18 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:996:3: rule__Concern__Alternatives_4_1
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
    // InternalBurst.g:1004:1: rule__Concern__Group_4__2 : rule__Concern__Group_4__2__Impl ;
    public final void rule__Concern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1008:1: ( rule__Concern__Group_4__2__Impl )
            // InternalBurst.g:1009:2: rule__Concern__Group_4__2__Impl
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
    // InternalBurst.g:1015:1: rule__Concern__Group_4__2__Impl : ( '}' ) ;
    public final void rule__Concern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1019:1: ( ( '}' ) )
            // InternalBurst.g:1020:1: ( '}' )
            {
            // InternalBurst.g:1020:1: ( '}' )
            // InternalBurst.g:1021:2: '}'
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


    // $ANTLR start "rule__Destruct__Group__0"
    // InternalBurst.g:1031:1: rule__Destruct__Group__0 : rule__Destruct__Group__0__Impl rule__Destruct__Group__1 ;
    public final void rule__Destruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1035:1: ( rule__Destruct__Group__0__Impl rule__Destruct__Group__1 )
            // InternalBurst.g:1036:2: rule__Destruct__Group__0__Impl rule__Destruct__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Destruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destruct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__0"


    // $ANTLR start "rule__Destruct__Group__0__Impl"
    // InternalBurst.g:1043:1: rule__Destruct__Group__0__Impl : ( () ) ;
    public final void rule__Destruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1047:1: ( ( () ) )
            // InternalBurst.g:1048:1: ( () )
            {
            // InternalBurst.g:1048:1: ( () )
            // InternalBurst.g:1049:2: ()
            {
             before(grammarAccess.getDestructAccess().getDestructAction_0()); 
            // InternalBurst.g:1050:2: ()
            // InternalBurst.g:1050:3: 
            {
            }

             after(grammarAccess.getDestructAccess().getDestructAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__0__Impl"


    // $ANTLR start "rule__Destruct__Group__1"
    // InternalBurst.g:1058:1: rule__Destruct__Group__1 : rule__Destruct__Group__1__Impl rule__Destruct__Group__2 ;
    public final void rule__Destruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1062:1: ( rule__Destruct__Group__1__Impl rule__Destruct__Group__2 )
            // InternalBurst.g:1063:2: rule__Destruct__Group__1__Impl rule__Destruct__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Destruct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destruct__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__1"


    // $ANTLR start "rule__Destruct__Group__1__Impl"
    // InternalBurst.g:1070:1: rule__Destruct__Group__1__Impl : ( ( rule__Destruct__NameAssignment_1 ) ) ;
    public final void rule__Destruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1074:1: ( ( ( rule__Destruct__NameAssignment_1 ) ) )
            // InternalBurst.g:1075:1: ( ( rule__Destruct__NameAssignment_1 ) )
            {
            // InternalBurst.g:1075:1: ( ( rule__Destruct__NameAssignment_1 ) )
            // InternalBurst.g:1076:2: ( rule__Destruct__NameAssignment_1 )
            {
             before(grammarAccess.getDestructAccess().getNameAssignment_1()); 
            // InternalBurst.g:1077:2: ( rule__Destruct__NameAssignment_1 )
            // InternalBurst.g:1077:3: rule__Destruct__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destruct__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestructAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__1__Impl"


    // $ANTLR start "rule__Destruct__Group__2"
    // InternalBurst.g:1085:1: rule__Destruct__Group__2 : rule__Destruct__Group__2__Impl rule__Destruct__Group__3 ;
    public final void rule__Destruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1089:1: ( rule__Destruct__Group__2__Impl rule__Destruct__Group__3 )
            // InternalBurst.g:1090:2: rule__Destruct__Group__2__Impl rule__Destruct__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Destruct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destruct__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__2"


    // $ANTLR start "rule__Destruct__Group__2__Impl"
    // InternalBurst.g:1097:1: rule__Destruct__Group__2__Impl : ( '{' ) ;
    public final void rule__Destruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1101:1: ( ( '{' ) )
            // InternalBurst.g:1102:1: ( '{' )
            {
            // InternalBurst.g:1102:1: ( '{' )
            // InternalBurst.g:1103:2: '{'
            {
             before(grammarAccess.getDestructAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDestructAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__2__Impl"


    // $ANTLR start "rule__Destruct__Group__3"
    // InternalBurst.g:1112:1: rule__Destruct__Group__3 : rule__Destruct__Group__3__Impl rule__Destruct__Group__4 ;
    public final void rule__Destruct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1116:1: ( rule__Destruct__Group__3__Impl rule__Destruct__Group__4 )
            // InternalBurst.g:1117:2: rule__Destruct__Group__3__Impl rule__Destruct__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Destruct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destruct__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__3"


    // $ANTLR start "rule__Destruct__Group__3__Impl"
    // InternalBurst.g:1124:1: rule__Destruct__Group__3__Impl : ( ( rule__Destruct__LinesContentAssignment_3 )* ) ;
    public final void rule__Destruct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1128:1: ( ( ( rule__Destruct__LinesContentAssignment_3 )* ) )
            // InternalBurst.g:1129:1: ( ( rule__Destruct__LinesContentAssignment_3 )* )
            {
            // InternalBurst.g:1129:1: ( ( rule__Destruct__LinesContentAssignment_3 )* )
            // InternalBurst.g:1130:2: ( rule__Destruct__LinesContentAssignment_3 )*
            {
             before(grammarAccess.getDestructAccess().getLinesContentAssignment_3()); 
            // InternalBurst.g:1131:2: ( rule__Destruct__LinesContentAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:1131:3: rule__Destruct__LinesContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Destruct__LinesContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDestructAccess().getLinesContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__3__Impl"


    // $ANTLR start "rule__Destruct__Group__4"
    // InternalBurst.g:1139:1: rule__Destruct__Group__4 : rule__Destruct__Group__4__Impl ;
    public final void rule__Destruct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1143:1: ( rule__Destruct__Group__4__Impl )
            // InternalBurst.g:1144:2: rule__Destruct__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destruct__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__4"


    // $ANTLR start "rule__Destruct__Group__4__Impl"
    // InternalBurst.g:1150:1: rule__Destruct__Group__4__Impl : ( '}' ) ;
    public final void rule__Destruct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1154:1: ( ( '}' ) )
            // InternalBurst.g:1155:1: ( '}' )
            {
            // InternalBurst.g:1155:1: ( '}' )
            // InternalBurst.g:1156:2: '}'
            {
             before(grammarAccess.getDestructAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDestructAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__Group__4__Impl"


    // $ANTLR start "rule__Build__Group__0"
    // InternalBurst.g:1166:1: rule__Build__Group__0 : rule__Build__Group__0__Impl rule__Build__Group__1 ;
    public final void rule__Build__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1170:1: ( rule__Build__Group__0__Impl rule__Build__Group__1 )
            // InternalBurst.g:1171:2: rule__Build__Group__0__Impl rule__Build__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Build__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Build__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__0"


    // $ANTLR start "rule__Build__Group__0__Impl"
    // InternalBurst.g:1178:1: rule__Build__Group__0__Impl : ( () ) ;
    public final void rule__Build__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1182:1: ( ( () ) )
            // InternalBurst.g:1183:1: ( () )
            {
            // InternalBurst.g:1183:1: ( () )
            // InternalBurst.g:1184:2: ()
            {
             before(grammarAccess.getBuildAccess().getBuildAction_0()); 
            // InternalBurst.g:1185:2: ()
            // InternalBurst.g:1185:3: 
            {
            }

             after(grammarAccess.getBuildAccess().getBuildAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__0__Impl"


    // $ANTLR start "rule__Build__Group__1"
    // InternalBurst.g:1193:1: rule__Build__Group__1 : rule__Build__Group__1__Impl rule__Build__Group__2 ;
    public final void rule__Build__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1197:1: ( rule__Build__Group__1__Impl rule__Build__Group__2 )
            // InternalBurst.g:1198:2: rule__Build__Group__1__Impl rule__Build__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Build__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Build__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__1"


    // $ANTLR start "rule__Build__Group__1__Impl"
    // InternalBurst.g:1205:1: rule__Build__Group__1__Impl : ( ( rule__Build__NameAssignment_1 ) ) ;
    public final void rule__Build__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1209:1: ( ( ( rule__Build__NameAssignment_1 ) ) )
            // InternalBurst.g:1210:1: ( ( rule__Build__NameAssignment_1 ) )
            {
            // InternalBurst.g:1210:1: ( ( rule__Build__NameAssignment_1 ) )
            // InternalBurst.g:1211:2: ( rule__Build__NameAssignment_1 )
            {
             before(grammarAccess.getBuildAccess().getNameAssignment_1()); 
            // InternalBurst.g:1212:2: ( rule__Build__NameAssignment_1 )
            // InternalBurst.g:1212:3: rule__Build__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Build__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__1__Impl"


    // $ANTLR start "rule__Build__Group__2"
    // InternalBurst.g:1220:1: rule__Build__Group__2 : rule__Build__Group__2__Impl rule__Build__Group__3 ;
    public final void rule__Build__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1224:1: ( rule__Build__Group__2__Impl rule__Build__Group__3 )
            // InternalBurst.g:1225:2: rule__Build__Group__2__Impl rule__Build__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Build__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Build__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__2"


    // $ANTLR start "rule__Build__Group__2__Impl"
    // InternalBurst.g:1232:1: rule__Build__Group__2__Impl : ( '{' ) ;
    public final void rule__Build__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1236:1: ( ( '{' ) )
            // InternalBurst.g:1237:1: ( '{' )
            {
            // InternalBurst.g:1237:1: ( '{' )
            // InternalBurst.g:1238:2: '{'
            {
             before(grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__2__Impl"


    // $ANTLR start "rule__Build__Group__3"
    // InternalBurst.g:1247:1: rule__Build__Group__3 : rule__Build__Group__3__Impl rule__Build__Group__4 ;
    public final void rule__Build__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1251:1: ( rule__Build__Group__3__Impl rule__Build__Group__4 )
            // InternalBurst.g:1252:2: rule__Build__Group__3__Impl rule__Build__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Build__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Build__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__3"


    // $ANTLR start "rule__Build__Group__3__Impl"
    // InternalBurst.g:1259:1: rule__Build__Group__3__Impl : ( ( rule__Build__LinesContentAssignment_3 )* ) ;
    public final void rule__Build__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1263:1: ( ( ( rule__Build__LinesContentAssignment_3 )* ) )
            // InternalBurst.g:1264:1: ( ( rule__Build__LinesContentAssignment_3 )* )
            {
            // InternalBurst.g:1264:1: ( ( rule__Build__LinesContentAssignment_3 )* )
            // InternalBurst.g:1265:2: ( rule__Build__LinesContentAssignment_3 )*
            {
             before(grammarAccess.getBuildAccess().getLinesContentAssignment_3()); 
            // InternalBurst.g:1266:2: ( rule__Build__LinesContentAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:1266:3: rule__Build__LinesContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Build__LinesContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBuildAccess().getLinesContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__3__Impl"


    // $ANTLR start "rule__Build__Group__4"
    // InternalBurst.g:1274:1: rule__Build__Group__4 : rule__Build__Group__4__Impl ;
    public final void rule__Build__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1278:1: ( rule__Build__Group__4__Impl )
            // InternalBurst.g:1279:2: rule__Build__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Build__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__4"


    // $ANTLR start "rule__Build__Group__4__Impl"
    // InternalBurst.g:1285:1: rule__Build__Group__4__Impl : ( '}' ) ;
    public final void rule__Build__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1289:1: ( ( '}' ) )
            // InternalBurst.g:1290:1: ( '}' )
            {
            // InternalBurst.g:1290:1: ( '}' )
            // InternalBurst.g:1291:2: '}'
            {
             before(grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__Group__4__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:1301:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1305:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:1306:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalBurst.g:1313:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1317:1: ( ( () ) )
            // InternalBurst.g:1318:1: ( () )
            {
            // InternalBurst.g:1318:1: ( () )
            // InternalBurst.g:1319:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:1320:2: ()
            // InternalBurst.g:1320:3: 
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
    // InternalBurst.g:1328:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1332:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:1333:2: rule__Member__Group__1__Impl rule__Member__Group__2
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
    // InternalBurst.g:1340:1: rule__Member__Group__1__Impl : ( ( rule__Member__ConcernAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1344:1: ( ( ( rule__Member__ConcernAssignment_1 ) ) )
            // InternalBurst.g:1345:1: ( ( rule__Member__ConcernAssignment_1 ) )
            {
            // InternalBurst.g:1345:1: ( ( rule__Member__ConcernAssignment_1 ) )
            // InternalBurst.g:1346:2: ( rule__Member__ConcernAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_1()); 
            // InternalBurst.g:1347:2: ( rule__Member__ConcernAssignment_1 )
            // InternalBurst.g:1347:3: rule__Member__ConcernAssignment_1
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
    // InternalBurst.g:1355:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1359:1: ( rule__Member__Group__2__Impl )
            // InternalBurst.g:1360:2: rule__Member__Group__2__Impl
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
    // InternalBurst.g:1366:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1370:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // InternalBurst.g:1371:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // InternalBurst.g:1371:1: ( ( rule__Member__NameAssignment_2 ) )
            // InternalBurst.g:1372:2: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:1373:2: ( rule__Member__NameAssignment_2 )
            // InternalBurst.g:1373:3: rule__Member__NameAssignment_2
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
    // InternalBurst.g:1382:1: rule__Intersection__Group__0 : rule__Intersection__Group__0__Impl rule__Intersection__Group__1 ;
    public final void rule__Intersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1386:1: ( rule__Intersection__Group__0__Impl rule__Intersection__Group__1 )
            // InternalBurst.g:1387:2: rule__Intersection__Group__0__Impl rule__Intersection__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBurst.g:1394:1: rule__Intersection__Group__0__Impl : ( () ) ;
    public final void rule__Intersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1398:1: ( ( () ) )
            // InternalBurst.g:1399:1: ( () )
            {
            // InternalBurst.g:1399:1: ( () )
            // InternalBurst.g:1400:2: ()
            {
             before(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); 
            // InternalBurst.g:1401:2: ()
            // InternalBurst.g:1401:3: 
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
    // InternalBurst.g:1409:1: rule__Intersection__Group__1 : rule__Intersection__Group__1__Impl rule__Intersection__Group__2 ;
    public final void rule__Intersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1413:1: ( rule__Intersection__Group__1__Impl rule__Intersection__Group__2 )
            // InternalBurst.g:1414:2: rule__Intersection__Group__1__Impl rule__Intersection__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBurst.g:1421:1: rule__Intersection__Group__1__Impl : ( ( rule__Intersection__NameAssignment_1 ) ) ;
    public final void rule__Intersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1425:1: ( ( ( rule__Intersection__NameAssignment_1 ) ) )
            // InternalBurst.g:1426:1: ( ( rule__Intersection__NameAssignment_1 ) )
            {
            // InternalBurst.g:1426:1: ( ( rule__Intersection__NameAssignment_1 ) )
            // InternalBurst.g:1427:2: ( rule__Intersection__NameAssignment_1 )
            {
             before(grammarAccess.getIntersectionAccess().getNameAssignment_1()); 
            // InternalBurst.g:1428:2: ( rule__Intersection__NameAssignment_1 )
            // InternalBurst.g:1428:3: rule__Intersection__NameAssignment_1
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
    // InternalBurst.g:1436:1: rule__Intersection__Group__2 : rule__Intersection__Group__2__Impl rule__Intersection__Group__3 ;
    public final void rule__Intersection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1440:1: ( rule__Intersection__Group__2__Impl rule__Intersection__Group__3 )
            // InternalBurst.g:1441:2: rule__Intersection__Group__2__Impl rule__Intersection__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBurst.g:1448:1: rule__Intersection__Group__2__Impl : ( ( rule__Intersection__MembersAssignment_2 )* ) ;
    public final void rule__Intersection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1452:1: ( ( ( rule__Intersection__MembersAssignment_2 )* ) )
            // InternalBurst.g:1453:1: ( ( rule__Intersection__MembersAssignment_2 )* )
            {
            // InternalBurst.g:1453:1: ( ( rule__Intersection__MembersAssignment_2 )* )
            // InternalBurst.g:1454:2: ( rule__Intersection__MembersAssignment_2 )*
            {
             before(grammarAccess.getIntersectionAccess().getMembersAssignment_2()); 
            // InternalBurst.g:1455:2: ( rule__Intersection__MembersAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1455:3: rule__Intersection__MembersAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Intersection__MembersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBurst.g:1463:1: rule__Intersection__Group__3 : rule__Intersection__Group__3__Impl rule__Intersection__Group__4 ;
    public final void rule__Intersection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1467:1: ( rule__Intersection__Group__3__Impl rule__Intersection__Group__4 )
            // InternalBurst.g:1468:2: rule__Intersection__Group__3__Impl rule__Intersection__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBurst.g:1475:1: rule__Intersection__Group__3__Impl : ( '{' ) ;
    public final void rule__Intersection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1479:1: ( ( '{' ) )
            // InternalBurst.g:1480:1: ( '{' )
            {
            // InternalBurst.g:1480:1: ( '{' )
            // InternalBurst.g:1481:2: '{'
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
    // InternalBurst.g:1490:1: rule__Intersection__Group__4 : rule__Intersection__Group__4__Impl rule__Intersection__Group__5 ;
    public final void rule__Intersection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1494:1: ( rule__Intersection__Group__4__Impl rule__Intersection__Group__5 )
            // InternalBurst.g:1495:2: rule__Intersection__Group__4__Impl rule__Intersection__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalBurst.g:1502:1: rule__Intersection__Group__4__Impl : ( ( rule__Intersection__LinesContentAssignment_4 )* ) ;
    public final void rule__Intersection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1506:1: ( ( ( rule__Intersection__LinesContentAssignment_4 )* ) )
            // InternalBurst.g:1507:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            {
            // InternalBurst.g:1507:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            // InternalBurst.g:1508:2: ( rule__Intersection__LinesContentAssignment_4 )*
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); 
            // InternalBurst.g:1509:2: ( rule__Intersection__LinesContentAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1509:3: rule__Intersection__LinesContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Intersection__LinesContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalBurst.g:1517:1: rule__Intersection__Group__5 : rule__Intersection__Group__5__Impl ;
    public final void rule__Intersection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1521:1: ( rule__Intersection__Group__5__Impl )
            // InternalBurst.g:1522:2: rule__Intersection__Group__5__Impl
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
    // InternalBurst.g:1528:1: rule__Intersection__Group__5__Impl : ( '}' ) ;
    public final void rule__Intersection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1532:1: ( ( '}' ) )
            // InternalBurst.g:1533:1: ( '}' )
            {
            // InternalBurst.g:1533:1: ( '}' )
            // InternalBurst.g:1534:2: '}'
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
    // InternalBurst.g:1544:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1548:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:1549:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBurst.g:1556:1: rule__Line__Group__0__Impl : ( ( rule__Line__Alternatives_0 )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1560:1: ( ( ( rule__Line__Alternatives_0 )* ) )
            // InternalBurst.g:1561:1: ( ( rule__Line__Alternatives_0 )* )
            {
            // InternalBurst.g:1561:1: ( ( rule__Line__Alternatives_0 )* )
            // InternalBurst.g:1562:2: ( rule__Line__Alternatives_0 )*
            {
             before(grammarAccess.getLineAccess().getAlternatives_0()); 
            // InternalBurst.g:1563:2: ( rule__Line__Alternatives_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1563:3: rule__Line__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Line__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBurst.g:1571:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1575:1: ( rule__Line__Group__1__Impl )
            // InternalBurst.g:1576:2: rule__Line__Group__1__Impl
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
    // InternalBurst.g:1582:1: rule__Line__Group__1__Impl : ( ( rule__Line__NameAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1586:1: ( ( ( rule__Line__NameAssignment_1 ) ) )
            // InternalBurst.g:1587:1: ( ( rule__Line__NameAssignment_1 ) )
            {
            // InternalBurst.g:1587:1: ( ( rule__Line__NameAssignment_1 ) )
            // InternalBurst.g:1588:2: ( rule__Line__NameAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_1()); 
            // InternalBurst.g:1589:2: ( rule__Line__NameAssignment_1 )
            // InternalBurst.g:1589:3: rule__Line__NameAssignment_1
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
    // InternalBurst.g:1598:1: rule__MemberCall__Group__0 : rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 ;
    public final void rule__MemberCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1602:1: ( rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1 )
            // InternalBurst.g:1603:2: rule__MemberCall__Group__0__Impl rule__MemberCall__Group__1
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
    // InternalBurst.g:1610:1: rule__MemberCall__Group__0__Impl : ( () ) ;
    public final void rule__MemberCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1614:1: ( ( () ) )
            // InternalBurst.g:1615:1: ( () )
            {
            // InternalBurst.g:1615:1: ( () )
            // InternalBurst.g:1616:2: ()
            {
             before(grammarAccess.getMemberCallAccess().getMemberCallAction_0()); 
            // InternalBurst.g:1617:2: ()
            // InternalBurst.g:1617:3: 
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
    // InternalBurst.g:1625:1: rule__MemberCall__Group__1 : rule__MemberCall__Group__1__Impl ;
    public final void rule__MemberCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1629:1: ( rule__MemberCall__Group__1__Impl )
            // InternalBurst.g:1630:2: rule__MemberCall__Group__1__Impl
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
    // InternalBurst.g:1636:1: rule__MemberCall__Group__1__Impl : ( ( rule__MemberCall__NameAssignment_1 ) ) ;
    public final void rule__MemberCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1640:1: ( ( ( rule__MemberCall__NameAssignment_1 ) ) )
            // InternalBurst.g:1641:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            {
            // InternalBurst.g:1641:1: ( ( rule__MemberCall__NameAssignment_1 ) )
            // InternalBurst.g:1642:2: ( rule__MemberCall__NameAssignment_1 )
            {
             before(grammarAccess.getMemberCallAccess().getNameAssignment_1()); 
            // InternalBurst.g:1643:2: ( rule__MemberCall__NameAssignment_1 )
            // InternalBurst.g:1643:3: rule__MemberCall__NameAssignment_1
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
    // InternalBurst.g:1652:1: rule__MemberInConcern__Group__0 : rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 ;
    public final void rule__MemberInConcern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1656:1: ( rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1 )
            // InternalBurst.g:1657:2: rule__MemberInConcern__Group__0__Impl rule__MemberInConcern__Group__1
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
    // InternalBurst.g:1664:1: rule__MemberInConcern__Group__0__Impl : ( () ) ;
    public final void rule__MemberInConcern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1668:1: ( ( () ) )
            // InternalBurst.g:1669:1: ( () )
            {
            // InternalBurst.g:1669:1: ( () )
            // InternalBurst.g:1670:2: ()
            {
             before(grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0()); 
            // InternalBurst.g:1671:2: ()
            // InternalBurst.g:1671:3: 
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
    // InternalBurst.g:1679:1: rule__MemberInConcern__Group__1 : rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 ;
    public final void rule__MemberInConcern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1683:1: ( rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2 )
            // InternalBurst.g:1684:2: rule__MemberInConcern__Group__1__Impl rule__MemberInConcern__Group__2
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
    // InternalBurst.g:1691:1: rule__MemberInConcern__Group__1__Impl : ( ( rule__MemberInConcern__TargetAssignment_1 ) ) ;
    public final void rule__MemberInConcern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1695:1: ( ( ( rule__MemberInConcern__TargetAssignment_1 ) ) )
            // InternalBurst.g:1696:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            {
            // InternalBurst.g:1696:1: ( ( rule__MemberInConcern__TargetAssignment_1 ) )
            // InternalBurst.g:1697:2: ( rule__MemberInConcern__TargetAssignment_1 )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetAssignment_1()); 
            // InternalBurst.g:1698:2: ( rule__MemberInConcern__TargetAssignment_1 )
            // InternalBurst.g:1698:3: rule__MemberInConcern__TargetAssignment_1
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
    // InternalBurst.g:1706:1: rule__MemberInConcern__Group__2 : rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 ;
    public final void rule__MemberInConcern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1710:1: ( rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3 )
            // InternalBurst.g:1711:2: rule__MemberInConcern__Group__2__Impl rule__MemberInConcern__Group__3
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
    // InternalBurst.g:1718:1: rule__MemberInConcern__Group__2__Impl : ( '.' ) ;
    public final void rule__MemberInConcern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1722:1: ( ( '.' ) )
            // InternalBurst.g:1723:1: ( '.' )
            {
            // InternalBurst.g:1723:1: ( '.' )
            // InternalBurst.g:1724:2: '.'
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
    // InternalBurst.g:1733:1: rule__MemberInConcern__Group__3 : rule__MemberInConcern__Group__3__Impl ;
    public final void rule__MemberInConcern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1737:1: ( rule__MemberInConcern__Group__3__Impl )
            // InternalBurst.g:1738:2: rule__MemberInConcern__Group__3__Impl
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
    // InternalBurst.g:1744:1: rule__MemberInConcern__Group__3__Impl : ( ( rule__MemberInConcern__NameAssignment_3 ) ) ;
    public final void rule__MemberInConcern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1748:1: ( ( ( rule__MemberInConcern__NameAssignment_3 ) ) )
            // InternalBurst.g:1749:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            {
            // InternalBurst.g:1749:1: ( ( rule__MemberInConcern__NameAssignment_3 ) )
            // InternalBurst.g:1750:2: ( rule__MemberInConcern__NameAssignment_3 )
            {
             before(grammarAccess.getMemberInConcernAccess().getNameAssignment_3()); 
            // InternalBurst.g:1751:2: ( rule__MemberInConcern__NameAssignment_3 )
            // InternalBurst.g:1751:3: rule__MemberInConcern__NameAssignment_3
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
    // InternalBurst.g:1760:1: rule__File__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__File__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1764:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1765:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1765:2: ( ruleAbstractElement )
            // InternalBurst.g:1766:3: ruleAbstractElement
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
    // InternalBurst.g:1775:1: rule__Package__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1779:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1780:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1780:2: ( ruleQualifiedName )
            // InternalBurst.g:1781:3: ruleQualifiedName
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
    // InternalBurst.g:1790:1: rule__Package__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__Package__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1794:1: ( ( ruleAbstractElement ) )
            // InternalBurst.g:1795:2: ( ruleAbstractElement )
            {
            // InternalBurst.g:1795:2: ( ruleAbstractElement )
            // InternalBurst.g:1796:3: ruleAbstractElement
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
    // InternalBurst.g:1805:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1809:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1810:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:1810:2: ( ruleQualifiedName )
            // InternalBurst.g:1811:3: ruleQualifiedName
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
    // InternalBurst.g:1820:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1824:1: ( ( RULE_ID ) )
            // InternalBurst.g:1825:2: ( RULE_ID )
            {
            // InternalBurst.g:1825:2: ( RULE_ID )
            // InternalBurst.g:1826:3: RULE_ID
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
    // InternalBurst.g:1835:1: rule__Concern__SupertypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Concern__SupertypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1839:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1840:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1840:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1841:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); 
            // InternalBurst.g:1842:3: ( ruleQualifiedName )
            // InternalBurst.g:1843:4: ruleQualifiedName
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
    // InternalBurst.g:1854:1: rule__Concern__MembersAssignment_4_1_0 : ( ruleMember ) ;
    public final void rule__Concern__MembersAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1858:1: ( ( ruleMember ) )
            // InternalBurst.g:1859:2: ( ruleMember )
            {
            // InternalBurst.g:1859:2: ( ruleMember )
            // InternalBurst.g:1860:3: ruleMember
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
    // InternalBurst.g:1869:1: rule__Concern__IntersectionsAssignment_4_1_1 : ( ruleIntersection ) ;
    public final void rule__Concern__IntersectionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1873:1: ( ( ruleIntersection ) )
            // InternalBurst.g:1874:2: ( ruleIntersection )
            {
            // InternalBurst.g:1874:2: ( ruleIntersection )
            // InternalBurst.g:1875:3: ruleIntersection
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


    // $ANTLR start "rule__Concern__BuildAssignment_4_1_2"
    // InternalBurst.g:1884:1: rule__Concern__BuildAssignment_4_1_2 : ( ruleBuild ) ;
    public final void rule__Concern__BuildAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1888:1: ( ( ruleBuild ) )
            // InternalBurst.g:1889:2: ( ruleBuild )
            {
            // InternalBurst.g:1889:2: ( ruleBuild )
            // InternalBurst.g:1890:3: ruleBuild
            {
             before(grammarAccess.getConcernAccess().getBuildBuildParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBuild();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getBuildBuildParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__BuildAssignment_4_1_2"


    // $ANTLR start "rule__Concern__DestructAssignment_4_1_3"
    // InternalBurst.g:1899:1: rule__Concern__DestructAssignment_4_1_3 : ( ruleDestruct ) ;
    public final void rule__Concern__DestructAssignment_4_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1903:1: ( ( ruleDestruct ) )
            // InternalBurst.g:1904:2: ( ruleDestruct )
            {
            // InternalBurst.g:1904:2: ( ruleDestruct )
            // InternalBurst.g:1905:3: ruleDestruct
            {
             before(grammarAccess.getConcernAccess().getDestructDestructParserRuleCall_4_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDestruct();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getDestructDestructParserRuleCall_4_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__DestructAssignment_4_1_3"


    // $ANTLR start "rule__Destruct__NameAssignment_1"
    // InternalBurst.g:1914:1: rule__Destruct__NameAssignment_1 : ( ( 'dispose' ) ) ;
    public final void rule__Destruct__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1918:1: ( ( ( 'dispose' ) ) )
            // InternalBurst.g:1919:2: ( ( 'dispose' ) )
            {
            // InternalBurst.g:1919:2: ( ( 'dispose' ) )
            // InternalBurst.g:1920:3: ( 'dispose' )
            {
             before(grammarAccess.getDestructAccess().getNameDisposeKeyword_1_0()); 
            // InternalBurst.g:1921:3: ( 'dispose' )
            // InternalBurst.g:1922:4: 'dispose'
            {
             before(grammarAccess.getDestructAccess().getNameDisposeKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDestructAccess().getNameDisposeKeyword_1_0()); 

            }

             after(grammarAccess.getDestructAccess().getNameDisposeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__NameAssignment_1"


    // $ANTLR start "rule__Destruct__LinesContentAssignment_3"
    // InternalBurst.g:1933:1: rule__Destruct__LinesContentAssignment_3 : ( ruleLine ) ;
    public final void rule__Destruct__LinesContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1937:1: ( ( ruleLine ) )
            // InternalBurst.g:1938:2: ( ruleLine )
            {
            // InternalBurst.g:1938:2: ( ruleLine )
            // InternalBurst.g:1939:3: ruleLine
            {
             before(grammarAccess.getDestructAccess().getLinesContentLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getDestructAccess().getLinesContentLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destruct__LinesContentAssignment_3"


    // $ANTLR start "rule__Build__NameAssignment_1"
    // InternalBurst.g:1948:1: rule__Build__NameAssignment_1 : ( ( 'new' ) ) ;
    public final void rule__Build__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1952:1: ( ( ( 'new' ) ) )
            // InternalBurst.g:1953:2: ( ( 'new' ) )
            {
            // InternalBurst.g:1953:2: ( ( 'new' ) )
            // InternalBurst.g:1954:3: ( 'new' )
            {
             before(grammarAccess.getBuildAccess().getNameNewKeyword_1_0()); 
            // InternalBurst.g:1955:3: ( 'new' )
            // InternalBurst.g:1956:4: 'new'
            {
             before(grammarAccess.getBuildAccess().getNameNewKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBuildAccess().getNameNewKeyword_1_0()); 

            }

             after(grammarAccess.getBuildAccess().getNameNewKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__NameAssignment_1"


    // $ANTLR start "rule__Build__LinesContentAssignment_3"
    // InternalBurst.g:1967:1: rule__Build__LinesContentAssignment_3 : ( ruleLine ) ;
    public final void rule__Build__LinesContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1971:1: ( ( ruleLine ) )
            // InternalBurst.g:1972:2: ( ruleLine )
            {
            // InternalBurst.g:1972:2: ( ruleLine )
            // InternalBurst.g:1973:3: ruleLine
            {
             before(grammarAccess.getBuildAccess().getLinesContentLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getBuildAccess().getLinesContentLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Build__LinesContentAssignment_3"


    // $ANTLR start "rule__Member__ConcernAssignment_1"
    // InternalBurst.g:1982:1: rule__Member__ConcernAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1986:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:1987:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:1987:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1988:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0()); 
            // InternalBurst.g:1989:3: ( ruleQualifiedName )
            // InternalBurst.g:1990:4: ruleQualifiedName
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
    // InternalBurst.g:2001:1: rule__Member__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2005:1: ( ( RULE_ID ) )
            // InternalBurst.g:2006:2: ( RULE_ID )
            {
            // InternalBurst.g:2006:2: ( RULE_ID )
            // InternalBurst.g:2007:3: RULE_ID
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
    // InternalBurst.g:2016:1: rule__Intersection__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__Intersection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2020:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:2021:2: ( ( 'when' ) )
            {
            // InternalBurst.g:2021:2: ( ( 'when' ) )
            // InternalBurst.g:2022:3: ( 'when' )
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:2023:3: ( 'when' )
            // InternalBurst.g:2024:4: 'when'
            {
             before(grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBurst.g:2035:1: rule__Intersection__MembersAssignment_2 : ( ruleMember ) ;
    public final void rule__Intersection__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2039:1: ( ( ruleMember ) )
            // InternalBurst.g:2040:2: ( ruleMember )
            {
            // InternalBurst.g:2040:2: ( ruleMember )
            // InternalBurst.g:2041:3: ruleMember
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
    // InternalBurst.g:2050:1: rule__Intersection__LinesContentAssignment_4 : ( ruleLine ) ;
    public final void rule__Intersection__LinesContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2054:1: ( ( ruleLine ) )
            // InternalBurst.g:2055:2: ( ruleLine )
            {
            // InternalBurst.g:2055:2: ( ruleLine )
            // InternalBurst.g:2056:3: ruleLine
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
    // InternalBurst.g:2065:1: rule__Line__CalledAssignment_0_0 : ( ruleMemberCall ) ;
    public final void rule__Line__CalledAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2069:1: ( ( ruleMemberCall ) )
            // InternalBurst.g:2070:2: ( ruleMemberCall )
            {
            // InternalBurst.g:2070:2: ( ruleMemberCall )
            // InternalBurst.g:2071:3: ruleMemberCall
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
    // InternalBurst.g:2080:1: rule__Line__Called2Assignment_0_1 : ( ruleMemberInConcern ) ;
    public final void rule__Line__Called2Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2084:1: ( ( ruleMemberInConcern ) )
            // InternalBurst.g:2085:2: ( ruleMemberInConcern )
            {
            // InternalBurst.g:2085:2: ( ruleMemberInConcern )
            // InternalBurst.g:2086:3: ruleMemberInConcern
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
    // InternalBurst.g:2095:1: rule__Line__NameAssignment_1 : ( ( ';' ) ) ;
    public final void rule__Line__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2099:1: ( ( ( ';' ) ) )
            // InternalBurst.g:2100:2: ( ( ';' ) )
            {
            // InternalBurst.g:2100:2: ( ( ';' ) )
            // InternalBurst.g:2101:3: ( ';' )
            {
             before(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 
            // InternalBurst.g:2102:3: ( ';' )
            // InternalBurst.g:2103:4: ';'
            {
             before(grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBurst.g:2114:1: rule__MemberCall__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2118:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2119:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2119:2: ( ( RULE_ID ) )
            // InternalBurst.g:2120:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberCallAccess().getNameMemberCrossReference_1_0()); 
            // InternalBurst.g:2121:3: ( RULE_ID )
            // InternalBurst.g:2122:4: RULE_ID
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
    // InternalBurst.g:2133:1: rule__MemberInConcern__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MemberInConcern__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2137:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:2138:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:2138:2: ( ( RULE_ID ) )
            // InternalBurst.g:2139:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0()); 
            // InternalBurst.g:2140:3: ( RULE_ID )
            // InternalBurst.g:2141:4: RULE_ID
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
    // InternalBurst.g:2152:1: rule__MemberInConcern__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MemberInConcern__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2156:1: ( ( RULE_ID ) )
            // InternalBurst.g:2157:2: ( RULE_ID )
            {
            // InternalBurst.g:2157:2: ( RULE_ID )
            // InternalBurst.g:2158:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000118802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000011A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C2010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200010L});

}