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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "'>'", "'with'", "'new'", "'('", "')'", "'.'", "':'", "'is'", "'when'", "'='"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalBurst.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalBurst.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalBurst.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalBurst.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalBurst.g:69:3: ( rule__File__Group__0 )
            // InternalBurst.g:69:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleFileElement"
    // InternalBurst.g:78:1: entryRuleFileElement : ruleFileElement EOF ;
    public final void entryRuleFileElement() throws RecognitionException {
        try {
            // InternalBurst.g:79:1: ( ruleFileElement EOF )
            // InternalBurst.g:80:1: ruleFileElement EOF
            {
             before(grammarAccess.getFileElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFileElement();

            state._fsp--;

             after(grammarAccess.getFileElementRule()); 
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
    // $ANTLR end "entryRuleFileElement"


    // $ANTLR start "ruleFileElement"
    // InternalBurst.g:87:1: ruleFileElement : ( ( rule__FileElement__Alternatives ) ) ;
    public final void ruleFileElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:91:2: ( ( ( rule__FileElement__Alternatives ) ) )
            // InternalBurst.g:92:2: ( ( rule__FileElement__Alternatives ) )
            {
            // InternalBurst.g:92:2: ( ( rule__FileElement__Alternatives ) )
            // InternalBurst.g:93:3: ( rule__FileElement__Alternatives )
            {
             before(grammarAccess.getFileElementAccess().getAlternatives()); 
            // InternalBurst.g:94:3: ( rule__FileElement__Alternatives )
            // InternalBurst.g:94:4: rule__FileElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FileElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileElement"


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBurst.g:104:1: ( ruleImport EOF )
            // InternalBurst.g:105:1: ruleImport EOF
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
    // InternalBurst.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBurst.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalBurst.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalBurst.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalBurst.g:119:3: ( rule__Import__Group__0 )
            // InternalBurst.g:119:4: rule__Import__Group__0
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


    // $ANTLR start "entryRuleRoles"
    // InternalBurst.g:128:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalBurst.g:129:1: ( ruleRoles EOF )
            // InternalBurst.g:130:1: ruleRoles EOF
            {
             before(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            ruleRoles();

            state._fsp--;

             after(grammarAccess.getRolesRule()); 
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
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalBurst.g:137:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:141:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalBurst.g:142:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalBurst.g:142:2: ( ( rule__Roles__Group__0 ) )
            // InternalBurst.g:143:3: ( rule__Roles__Group__0 )
            {
             before(grammarAccess.getRolesAccess().getGroup()); 
            // InternalBurst.g:144:3: ( rule__Roles__Group__0 )
            // InternalBurst.g:144:4: rule__Roles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRulePackage"
    // InternalBurst.g:153:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalBurst.g:154:1: ( rulePackage EOF )
            // InternalBurst.g:155:1: rulePackage EOF
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
    // InternalBurst.g:162:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:166:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalBurst.g:167:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalBurst.g:167:2: ( ( rule__Package__Group__0 ) )
            // InternalBurst.g:168:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalBurst.g:169:3: ( rule__Package__Group__0 )
            // InternalBurst.g:169:4: rule__Package__Group__0
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


    // $ANTLR start "entryRulePackageElement"
    // InternalBurst.g:178:1: entryRulePackageElement : rulePackageElement EOF ;
    public final void entryRulePackageElement() throws RecognitionException {
        try {
            // InternalBurst.g:179:1: ( rulePackageElement EOF )
            // InternalBurst.g:180:1: rulePackageElement EOF
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
    // InternalBurst.g:187:1: rulePackageElement : ( ( rule__PackageElement__Alternatives ) ) ;
    public final void rulePackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:191:2: ( ( ( rule__PackageElement__Alternatives ) ) )
            // InternalBurst.g:192:2: ( ( rule__PackageElement__Alternatives ) )
            {
            // InternalBurst.g:192:2: ( ( rule__PackageElement__Alternatives ) )
            // InternalBurst.g:193:3: ( rule__PackageElement__Alternatives )
            {
             before(grammarAccess.getPackageElementAccess().getAlternatives()); 
            // InternalBurst.g:194:3: ( rule__PackageElement__Alternatives )
            // InternalBurst.g:194:4: rule__PackageElement__Alternatives
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


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:203:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // InternalBurst.g:204:1: ( ruleConcern EOF )
            // InternalBurst.g:205:1: ruleConcern EOF
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
    // InternalBurst.g:212:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:216:2: ( ( ( rule__Concern__Group__0 ) ) )
            // InternalBurst.g:217:2: ( ( rule__Concern__Group__0 ) )
            {
            // InternalBurst.g:217:2: ( ( rule__Concern__Group__0 ) )
            // InternalBurst.g:218:3: ( rule__Concern__Group__0 )
            {
             before(grammarAccess.getConcernAccess().getGroup()); 
            // InternalBurst.g:219:3: ( rule__Concern__Group__0 )
            // InternalBurst.g:219:4: rule__Concern__Group__0
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


    // $ANTLR start "entryRuleTemplate"
    // InternalBurst.g:228:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalBurst.g:229:1: ( ruleTemplate EOF )
            // InternalBurst.g:230:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalBurst.g:237:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:241:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalBurst.g:242:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalBurst.g:242:2: ( ( rule__Template__Group__0 ) )
            // InternalBurst.g:243:3: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // InternalBurst.g:244:3: ( rule__Template__Group__0 )
            // InternalBurst.g:244:4: rule__Template__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleConcernElement"
    // InternalBurst.g:253:1: entryRuleConcernElement : ruleConcernElement EOF ;
    public final void entryRuleConcernElement() throws RecognitionException {
        try {
            // InternalBurst.g:254:1: ( ruleConcernElement EOF )
            // InternalBurst.g:255:1: ruleConcernElement EOF
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
    // InternalBurst.g:262:1: ruleConcernElement : ( ( rule__ConcernElement__Alternatives ) ) ;
    public final void ruleConcernElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:266:2: ( ( ( rule__ConcernElement__Alternatives ) ) )
            // InternalBurst.g:267:2: ( ( rule__ConcernElement__Alternatives ) )
            {
            // InternalBurst.g:267:2: ( ( rule__ConcernElement__Alternatives ) )
            // InternalBurst.g:268:3: ( rule__ConcernElement__Alternatives )
            {
             before(grammarAccess.getConcernElementAccess().getAlternatives()); 
            // InternalBurst.g:269:3: ( rule__ConcernElement__Alternatives )
            // InternalBurst.g:269:4: rule__ConcernElement__Alternatives
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
    // InternalBurst.g:278:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:279:1: ( ruleMember EOF )
            // InternalBurst.g:280:1: ruleMember EOF
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
    // InternalBurst.g:287:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:291:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:292:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:292:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:293:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalBurst.g:294:3: ( rule__Member__Group__0 )
            // InternalBurst.g:294:4: rule__Member__Group__0
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
    // InternalBurst.g:303:1: entryRuleRuleIntersect : ruleRuleIntersect EOF ;
    public final void entryRuleRuleIntersect() throws RecognitionException {
        try {
            // InternalBurst.g:304:1: ( ruleRuleIntersect EOF )
            // InternalBurst.g:305:1: ruleRuleIntersect EOF
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
    // InternalBurst.g:312:1: ruleRuleIntersect : ( ( rule__RuleIntersect__Group__0 ) ) ;
    public final void ruleRuleIntersect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:316:2: ( ( ( rule__RuleIntersect__Group__0 ) ) )
            // InternalBurst.g:317:2: ( ( rule__RuleIntersect__Group__0 ) )
            {
            // InternalBurst.g:317:2: ( ( rule__RuleIntersect__Group__0 ) )
            // InternalBurst.g:318:3: ( rule__RuleIntersect__Group__0 )
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup()); 
            // InternalBurst.g:319:3: ( rule__RuleIntersect__Group__0 )
            // InternalBurst.g:319:4: rule__RuleIntersect__Group__0
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


    // $ANTLR start "entryRuleLocale"
    // InternalBurst.g:328:1: entryRuleLocale : ruleLocale EOF ;
    public final void entryRuleLocale() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleLocale EOF )
            // InternalBurst.g:330:1: ruleLocale EOF
            {
             before(grammarAccess.getLocaleRule()); 
            pushFollow(FOLLOW_1);
            ruleLocale();

            state._fsp--;

             after(grammarAccess.getLocaleRule()); 
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
    // $ANTLR end "entryRuleLocale"


    // $ANTLR start "ruleLocale"
    // InternalBurst.g:337:1: ruleLocale : ( ( rule__Locale__Group__0 ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__Locale__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__Locale__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__Locale__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__Locale__Group__0 )
            {
             before(grammarAccess.getLocaleAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__Locale__Group__0 )
            // InternalBurst.g:344:4: rule__Locale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleParameter EOF )
            // InternalBurst.g:355:1: ruleParameter EOF
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
    // InternalBurst.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalBurst.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalBurst.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalBurst.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalBurst.g:369:3: ( rule__Parameter__Group__0 )
            // InternalBurst.g:369:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleWithParameter"
    // InternalBurst.g:378:1: entryRuleWithParameter : ruleWithParameter EOF ;
    public final void entryRuleWithParameter() throws RecognitionException {
        try {
            // InternalBurst.g:379:1: ( ruleWithParameter EOF )
            // InternalBurst.g:380:1: ruleWithParameter EOF
            {
             before(grammarAccess.getWithParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleWithParameter();

            state._fsp--;

             after(grammarAccess.getWithParameterRule()); 
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
    // $ANTLR end "entryRuleWithParameter"


    // $ANTLR start "ruleWithParameter"
    // InternalBurst.g:387:1: ruleWithParameter : ( ( rule__WithParameter__Group__0 ) ) ;
    public final void ruleWithParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:391:2: ( ( ( rule__WithParameter__Group__0 ) ) )
            // InternalBurst.g:392:2: ( ( rule__WithParameter__Group__0 ) )
            {
            // InternalBurst.g:392:2: ( ( rule__WithParameter__Group__0 ) )
            // InternalBurst.g:393:3: ( rule__WithParameter__Group__0 )
            {
             before(grammarAccess.getWithParameterAccess().getGroup()); 
            // InternalBurst.g:394:3: ( rule__WithParameter__Group__0 )
            // InternalBurst.g:394:4: rule__WithParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWithParameter"


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
    // InternalBurst.g:412:1: ruleLine : ( ruleCallExpr ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:2: ( ( ruleCallExpr ) )
            // InternalBurst.g:417:2: ( ruleCallExpr )
            {
            // InternalBurst.g:417:2: ( ruleCallExpr )
            // InternalBurst.g:418:3: ruleCallExpr
            {
             before(grammarAccess.getLineAccess().getCallExprParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCallExpr();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCallExprParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCallExpr"
    // InternalBurst.g:428:1: entryRuleCallExpr : ruleCallExpr EOF ;
    public final void entryRuleCallExpr() throws RecognitionException {
        try {
            // InternalBurst.g:429:1: ( ruleCallExpr EOF )
            // InternalBurst.g:430:1: ruleCallExpr EOF
            {
             before(grammarAccess.getCallExprRule()); 
            pushFollow(FOLLOW_1);
            ruleCallExpr();

            state._fsp--;

             after(grammarAccess.getCallExprRule()); 
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
    // $ANTLR end "entryRuleCallExpr"


    // $ANTLR start "ruleCallExpr"
    // InternalBurst.g:437:1: ruleCallExpr : ( ( rule__CallExpr__Group__0 ) ) ;
    public final void ruleCallExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:2: ( ( ( rule__CallExpr__Group__0 ) ) )
            // InternalBurst.g:442:2: ( ( rule__CallExpr__Group__0 ) )
            {
            // InternalBurst.g:442:2: ( ( rule__CallExpr__Group__0 ) )
            // InternalBurst.g:443:3: ( rule__CallExpr__Group__0 )
            {
             before(grammarAccess.getCallExprAccess().getGroup()); 
            // InternalBurst.g:444:3: ( rule__CallExpr__Group__0 )
            // InternalBurst.g:444:4: rule__CallExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallExpr"


    // $ANTLR start "entryRuleSubCall"
    // InternalBurst.g:453:1: entryRuleSubCall : ruleSubCall EOF ;
    public final void entryRuleSubCall() throws RecognitionException {
        try {
            // InternalBurst.g:454:1: ( ruleSubCall EOF )
            // InternalBurst.g:455:1: ruleSubCall EOF
            {
             before(grammarAccess.getSubCallRule()); 
            pushFollow(FOLLOW_1);
            ruleSubCall();

            state._fsp--;

             after(grammarAccess.getSubCallRule()); 
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
    // $ANTLR end "entryRuleSubCall"


    // $ANTLR start "ruleSubCall"
    // InternalBurst.g:462:1: ruleSubCall : ( ( rule__SubCall__Group__0 ) ) ;
    public final void ruleSubCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:466:2: ( ( ( rule__SubCall__Group__0 ) ) )
            // InternalBurst.g:467:2: ( ( rule__SubCall__Group__0 ) )
            {
            // InternalBurst.g:467:2: ( ( rule__SubCall__Group__0 ) )
            // InternalBurst.g:468:3: ( rule__SubCall__Group__0 )
            {
             before(grammarAccess.getSubCallAccess().getGroup()); 
            // InternalBurst.g:469:3: ( rule__SubCall__Group__0 )
            // InternalBurst.g:469:4: rule__SubCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubCall"


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:478:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:479:1: ( ruleCall EOF )
            // InternalBurst.g:480:1: ruleCall EOF
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
    // InternalBurst.g:487:1: ruleCall : ( ( rule__Call__Alternatives ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:491:2: ( ( ( rule__Call__Alternatives ) ) )
            // InternalBurst.g:492:2: ( ( rule__Call__Alternatives ) )
            {
            // InternalBurst.g:492:2: ( ( rule__Call__Alternatives ) )
            // InternalBurst.g:493:3: ( rule__Call__Alternatives )
            {
             before(grammarAccess.getCallAccess().getAlternatives()); 
            // InternalBurst.g:494:3: ( rule__Call__Alternatives )
            // InternalBurst.g:494:4: rule__Call__Alternatives
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


    // $ANTLR start "entryRuleAccess"
    // InternalBurst.g:503:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalBurst.g:504:1: ( ruleAccess EOF )
            // InternalBurst.g:505:1: ruleAccess EOF
            {
             before(grammarAccess.getAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleAccess();

            state._fsp--;

             after(grammarAccess.getAccessRule()); 
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
    // $ANTLR end "entryRuleAccess"


    // $ANTLR start "ruleAccess"
    // InternalBurst.g:512:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:516:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalBurst.g:517:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalBurst.g:517:2: ( ( rule__Access__Group__0 ) )
            // InternalBurst.g:518:3: ( rule__Access__Group__0 )
            {
             before(grammarAccess.getAccessAccess().getGroup()); 
            // InternalBurst.g:519:3: ( rule__Access__Group__0 )
            // InternalBurst.g:519:4: rule__Access__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:528:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:529:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:530:1: ruleQualifiedName EOF
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
    // InternalBurst.g:537:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:541:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:542:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:542:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:543:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:544:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:544:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__FileElement__Alternatives"
    // InternalBurst.g:552:1: rule__FileElement__Alternatives : ( ( ruleRoles ) | ( rulePackage ) );
    public final void rule__FileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:556:1: ( ( ruleRoles ) | ( rulePackage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBurst.g:557:2: ( ruleRoles )
                    {
                    // InternalBurst.g:557:2: ( ruleRoles )
                    // InternalBurst.g:558:3: ruleRoles
                    {
                     before(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoles();

                    state._fsp--;

                     after(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:563:2: ( rulePackage )
                    {
                    // InternalBurst.g:563:2: ( rulePackage )
                    // InternalBurst.g:564:3: rulePackage
                    {
                     before(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1()); 

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
    // $ANTLR end "rule__FileElement__Alternatives"


    // $ANTLR start "rule__PackageElement__Alternatives"
    // InternalBurst.g:573:1: rule__PackageElement__Alternatives : ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:577:1: ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 30:
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
                    // InternalBurst.g:578:2: ( ruleConcern )
                    {
                    // InternalBurst.g:578:2: ( ruleConcern )
                    // InternalBurst.g:579:3: ruleConcern
                    {
                     before(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConcern();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:584:2: ( ruleTemplate )
                    {
                    // InternalBurst.g:584:2: ( ruleTemplate )
                    // InternalBurst.g:585:3: ruleTemplate
                    {
                     before(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplate();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:590:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:590:2: ( ruleRuleIntersect )
                    // InternalBurst.g:591:3: ruleRuleIntersect
                    {
                     before(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;

                     after(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2()); 

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
    // InternalBurst.g:600:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:604:1: ( ( ruleMember ) | ( ruleRuleIntersect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:605:2: ( ruleMember )
                    {
                    // InternalBurst.g:605:2: ( ruleMember )
                    // InternalBurst.g:606:3: ruleMember
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
                    // InternalBurst.g:611:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:611:2: ( ruleRuleIntersect )
                    // InternalBurst.g:612:3: ruleRuleIntersect
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
    // InternalBurst.g:621:1: rule__RuleIntersect__Alternatives_4_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:625:1: ( ( ',' ) | ( 'and' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBurst.g:626:2: ( ',' )
                    {
                    // InternalBurst.g:626:2: ( ',' )
                    // InternalBurst.g:627:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:632:2: ( 'and' )
                    {
                    // InternalBurst.g:632:2: ( 'and' )
                    // InternalBurst.g:633:3: 'and'
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


    // $ANTLR start "rule__RuleIntersect__Alternatives_5_3_1"
    // InternalBurst.g:642:1: rule__RuleIntersect__Alternatives_5_3_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:646:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:647:2: ( ',' )
                    {
                    // InternalBurst.g:647:2: ( ',' )
                    // InternalBurst.g:648:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:653:2: ( 'and' )
                    {
                    // InternalBurst.g:653:2: ( 'and' )
                    // InternalBurst.g:654:3: 'and'
                    {
                     before(grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1()); 

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
    // $ANTLR end "rule__RuleIntersect__Alternatives_5_3_1"


    // $ANTLR start "rule__Call__Alternatives"
    // InternalBurst.g:663:1: rule__Call__Alternatives : ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) );
    public final void rule__Call__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:667:1: ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBurst.g:668:2: ( ruleLocale )
                    {
                    // InternalBurst.g:668:2: ( ruleLocale )
                    // InternalBurst.g:669:3: ruleLocale
                    {
                     before(grammarAccess.getCallAccess().getLocaleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocale();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getLocaleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:674:2: ( ruleAccess )
                    {
                    // InternalBurst.g:674:2: ( ruleAccess )
                    // InternalBurst.g:675:3: ruleAccess
                    {
                     before(grammarAccess.getCallAccess().getAccessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccess();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getAccessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:680:2: ( ruleSubCall )
                    {
                    // InternalBurst.g:680:2: ( ruleSubCall )
                    // InternalBurst.g:681:3: ruleSubCall
                    {
                     before(grammarAccess.getCallAccess().getSubCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSubCall();

                    state._fsp--;

                     after(grammarAccess.getCallAccess().getSubCallParserRuleCall_2()); 

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


    // $ANTLR start "rule__File__Group__0"
    // InternalBurst.g:690:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:694:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalBurst.g:695:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalBurst.g:702:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:706:1: ( ( () ) )
            // InternalBurst.g:707:1: ( () )
            {
            // InternalBurst.g:707:1: ( () )
            // InternalBurst.g:708:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalBurst.g:709:2: ()
            // InternalBurst.g:709:3: 
            {
            }

             after(grammarAccess.getFileAccess().getFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalBurst.g:717:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:721:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalBurst.g:722:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalBurst.g:729:1: rule__File__Group__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:733:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:734:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:734:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:735:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 
            // InternalBurst.g:736:2: ( RULE_ENDLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ENDLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:736:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalBurst.g:744:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:748:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalBurst.g:749:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalBurst.g:756:1: rule__File__Group__2__Impl : ( ( rule__File__Group_2__0 )* ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:760:1: ( ( ( rule__File__Group_2__0 )* ) )
            // InternalBurst.g:761:1: ( ( rule__File__Group_2__0 )* )
            {
            // InternalBurst.g:761:1: ( ( rule__File__Group_2__0 )* )
            // InternalBurst.g:762:2: ( rule__File__Group_2__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_2()); 
            // InternalBurst.g:763:2: ( rule__File__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:763:3: rule__File__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__File__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalBurst.g:771:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:775:1: ( rule__File__Group__3__Impl )
            // InternalBurst.g:776:2: rule__File__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalBurst.g:782:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:786:1: ( ( ( rule__File__Group_3__0 )* ) )
            // InternalBurst.g:787:1: ( ( rule__File__Group_3__0 )* )
            {
            // InternalBurst.g:787:1: ( ( rule__File__Group_3__0 )* )
            // InternalBurst.g:788:2: ( rule__File__Group_3__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // InternalBurst.g:789:2: ( rule__File__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=15 && LA9_0<=16)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:789:3: rule__File__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group_2__0"
    // InternalBurst.g:798:1: rule__File__Group_2__0 : rule__File__Group_2__0__Impl rule__File__Group_2__1 ;
    public final void rule__File__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:802:1: ( rule__File__Group_2__0__Impl rule__File__Group_2__1 )
            // InternalBurst.g:803:2: rule__File__Group_2__0__Impl rule__File__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__File__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_2__0"


    // $ANTLR start "rule__File__Group_2__0__Impl"
    // InternalBurst.g:810:1: rule__File__Group_2__0__Impl : ( ( rule__File__ImportsAssignment_2_0 ) ) ;
    public final void rule__File__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:814:1: ( ( ( rule__File__ImportsAssignment_2_0 ) ) )
            // InternalBurst.g:815:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            {
            // InternalBurst.g:815:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            // InternalBurst.g:816:2: ( rule__File__ImportsAssignment_2_0 )
            {
             before(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 
            // InternalBurst.g:817:2: ( rule__File__ImportsAssignment_2_0 )
            // InternalBurst.g:817:3: rule__File__ImportsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__File__ImportsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_2__0__Impl"


    // $ANTLR start "rule__File__Group_2__1"
    // InternalBurst.g:825:1: rule__File__Group_2__1 : rule__File__Group_2__1__Impl ;
    public final void rule__File__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:829:1: ( rule__File__Group_2__1__Impl )
            // InternalBurst.g:830:2: rule__File__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_2__1"


    // $ANTLR start "rule__File__Group_2__1__Impl"
    // InternalBurst.g:836:1: rule__File__Group_2__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:840:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:841:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:841:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:842:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 
            // InternalBurst.g:843:2: ( RULE_ENDLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ENDLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:843:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_2__1__Impl"


    // $ANTLR start "rule__File__Group_3__0"
    // InternalBurst.g:852:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:856:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // InternalBurst.g:857:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0"


    // $ANTLR start "rule__File__Group_3__0__Impl"
    // InternalBurst.g:864:1: rule__File__Group_3__0__Impl : ( ( rule__File__ElementsAssignment_3_0 ) ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:868:1: ( ( ( rule__File__ElementsAssignment_3_0 ) ) )
            // InternalBurst.g:869:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            {
            // InternalBurst.g:869:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            // InternalBurst.g:870:2: ( rule__File__ElementsAssignment_3_0 )
            {
             before(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 
            // InternalBurst.g:871:2: ( rule__File__ElementsAssignment_3_0 )
            // InternalBurst.g:871:3: rule__File__ElementsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__File__ElementsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0__Impl"


    // $ANTLR start "rule__File__Group_3__1"
    // InternalBurst.g:879:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:883:1: ( rule__File__Group_3__1__Impl )
            // InternalBurst.g:884:2: rule__File__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1"


    // $ANTLR start "rule__File__Group_3__1__Impl"
    // InternalBurst.g:890:1: rule__File__Group_3__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:894:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:895:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:895:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:896:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 
            // InternalBurst.g:897:2: ( RULE_ENDLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ENDLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:897:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalBurst.g:906:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:910:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:911:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBurst.g:918:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:922:1: ( ( () ) )
            // InternalBurst.g:923:1: ( () )
            {
            // InternalBurst.g:923:1: ( () )
            // InternalBurst.g:924:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalBurst.g:925:2: ()
            // InternalBurst.g:925:3: 
            {
            }

             after(grammarAccess.getImportAccess().getImportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalBurst.g:933:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:937:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:938:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:945:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:949:1: ( ( 'import' ) )
            // InternalBurst.g:950:1: ( 'import' )
            {
            // InternalBurst.g:950:1: ( 'import' )
            // InternalBurst.g:951:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_1()); 

            }


            }

        }
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
    // InternalBurst.g:960:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:964:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:965:2: rule__Import__Group__2__Impl
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
    // InternalBurst.g:971:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:975:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:976:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:976:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:977:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // InternalBurst.g:978:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:978:3: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Roles__Group__0"
    // InternalBurst.g:987:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:991:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalBurst.g:992:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Roles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__0"


    // $ANTLR start "rule__Roles__Group__0__Impl"
    // InternalBurst.g:999:1: rule__Roles__Group__0__Impl : ( () ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1003:1: ( ( () ) )
            // InternalBurst.g:1004:1: ( () )
            {
            // InternalBurst.g:1004:1: ( () )
            // InternalBurst.g:1005:2: ()
            {
             before(grammarAccess.getRolesAccess().getRoleAction_0()); 
            // InternalBurst.g:1006:2: ()
            // InternalBurst.g:1006:3: 
            {
            }

             after(grammarAccess.getRolesAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__0__Impl"


    // $ANTLR start "rule__Roles__Group__1"
    // InternalBurst.g:1014:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl rule__Roles__Group__2 ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1018:1: ( rule__Roles__Group__1__Impl rule__Roles__Group__2 )
            // InternalBurst.g:1019:2: rule__Roles__Group__1__Impl rule__Roles__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Roles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Roles__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__1"


    // $ANTLR start "rule__Roles__Group__1__Impl"
    // InternalBurst.g:1026:1: rule__Roles__Group__1__Impl : ( 'role' ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1030:1: ( ( 'role' ) )
            // InternalBurst.g:1031:1: ( 'role' )
            {
            // InternalBurst.g:1031:1: ( 'role' )
            // InternalBurst.g:1032:2: 'role'
            {
             before(grammarAccess.getRolesAccess().getRoleKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRolesAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__1__Impl"


    // $ANTLR start "rule__Roles__Group__2"
    // InternalBurst.g:1041:1: rule__Roles__Group__2 : rule__Roles__Group__2__Impl ;
    public final void rule__Roles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1045:1: ( rule__Roles__Group__2__Impl )
            // InternalBurst.g:1046:2: rule__Roles__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__2"


    // $ANTLR start "rule__Roles__Group__2__Impl"
    // InternalBurst.g:1052:1: rule__Roles__Group__2__Impl : ( ( rule__Roles__NameAssignment_2 ) ) ;
    public final void rule__Roles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1056:1: ( ( ( rule__Roles__NameAssignment_2 ) ) )
            // InternalBurst.g:1057:1: ( ( rule__Roles__NameAssignment_2 ) )
            {
            // InternalBurst.g:1057:1: ( ( rule__Roles__NameAssignment_2 ) )
            // InternalBurst.g:1058:2: ( rule__Roles__NameAssignment_2 )
            {
             before(grammarAccess.getRolesAccess().getNameAssignment_2()); 
            // InternalBurst.g:1059:2: ( rule__Roles__NameAssignment_2 )
            // InternalBurst.g:1059:3: rule__Roles__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Roles__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRolesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalBurst.g:1068:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1072:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:1073:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBurst.g:1080:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1084:1: ( ( () ) )
            // InternalBurst.g:1085:1: ( () )
            {
            // InternalBurst.g:1085:1: ( () )
            // InternalBurst.g:1086:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalBurst.g:1087:2: ()
            // InternalBurst.g:1087:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalBurst.g:1095:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1099:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:1100:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:1107:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1111:1: ( ( 'package' ) )
            // InternalBurst.g:1112:1: ( 'package' )
            {
            // InternalBurst.g:1112:1: ( 'package' )
            // InternalBurst.g:1113:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
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
    // InternalBurst.g:1122:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1126:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:1127:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:1134:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1138:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalBurst.g:1139:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalBurst.g:1139:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalBurst.g:1140:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalBurst.g:1141:2: ( rule__Package__NameAssignment_2 )
            // InternalBurst.g:1141:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:1149:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1153:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:1154:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:1161:1: rule__Package__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1165:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1166:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1166:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1167:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 
            // InternalBurst.g:1168:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1168:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalBurst.g:1176:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1180:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalBurst.g:1181:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:1188:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1192:1: ( ( '{' ) )
            // InternalBurst.g:1193:1: ( '{' )
            {
            // InternalBurst.g:1193:1: ( '{' )
            // InternalBurst.g:1194:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalBurst.g:1203:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1207:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalBurst.g:1208:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:1215:1: rule__Package__Group__5__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1219:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1220:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1220:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1221:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
            // InternalBurst.g:1222:2: ( RULE_ENDLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ENDLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1222:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

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


    // $ANTLR start "rule__Package__Group__6"
    // InternalBurst.g:1230:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1234:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalBurst.g:1235:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalBurst.g:1242:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1246:1: ( ( ( rule__Package__Group_6__0 )* ) )
            // InternalBurst.g:1247:1: ( ( rule__Package__Group_6__0 )* )
            {
            // InternalBurst.g:1247:1: ( ( rule__Package__Group_6__0 )* )
            // InternalBurst.g:1248:2: ( rule__Package__Group_6__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // InternalBurst.g:1249:2: ( rule__Package__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=20)||LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1249:3: rule__Package__Group_6__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Package__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // InternalBurst.g:1257:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1261:1: ( rule__Package__Group__7__Impl )
            // InternalBurst.g:1262:2: rule__Package__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // InternalBurst.g:1268:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1272:1: ( ( '}' ) )
            // InternalBurst.g:1273:1: ( '}' )
            {
            // InternalBurst.g:1273:1: ( '}' )
            // InternalBurst.g:1274:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_6__0"
    // InternalBurst.g:1284:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1288:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // InternalBurst.g:1289:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0"


    // $ANTLR start "rule__Package__Group_6__0__Impl"
    // InternalBurst.g:1296:1: rule__Package__Group_6__0__Impl : ( ( rule__Package__ElementsAssignment_6_0 ) ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1300:1: ( ( ( rule__Package__ElementsAssignment_6_0 ) ) )
            // InternalBurst.g:1301:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            {
            // InternalBurst.g:1301:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            // InternalBurst.g:1302:2: ( rule__Package__ElementsAssignment_6_0 )
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 
            // InternalBurst.g:1303:2: ( rule__Package__ElementsAssignment_6_0 )
            // InternalBurst.g:1303:3: rule__Package__ElementsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__ElementsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0__Impl"


    // $ANTLR start "rule__Package__Group_6__1"
    // InternalBurst.g:1311:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1315:1: ( rule__Package__Group_6__1__Impl )
            // InternalBurst.g:1316:2: rule__Package__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1"


    // $ANTLR start "rule__Package__Group_6__1__Impl"
    // InternalBurst.g:1322:1: rule__Package__Group_6__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1326:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1327:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1327:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1328:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 
            // InternalBurst.g:1329:2: ( RULE_ENDLINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ENDLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1329:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1__Impl"


    // $ANTLR start "rule__Concern__Group__0"
    // InternalBurst.g:1338:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1342:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:1343:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalBurst.g:1350:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1354:1: ( ( () ) )
            // InternalBurst.g:1355:1: ( () )
            {
            // InternalBurst.g:1355:1: ( () )
            // InternalBurst.g:1356:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:1357:2: ()
            // InternalBurst.g:1357:3: 
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
    // InternalBurst.g:1365:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1369:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:1370:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:1377:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1381:1: ( ( 'concern' ) )
            // InternalBurst.g:1382:1: ( 'concern' )
            {
            // InternalBurst.g:1382:1: ( 'concern' )
            // InternalBurst.g:1383:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBurst.g:1392:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1396:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:1397:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:1404:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1408:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:1409:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:1409:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:1410:2: ( rule__Concern__NameAssignment_2 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:1411:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:1411:3: rule__Concern__NameAssignment_2
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
    // InternalBurst.g:1419:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1423:1: ( rule__Concern__Group__3__Impl )
            // InternalBurst.g:1424:2: rule__Concern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:1430:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1434:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:1435:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:1435:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:1436:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalBurst.g:1437:2: ( rule__Concern__Group_3__0 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:1437:3: rule__Concern__Group_3__0
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


    // $ANTLR start "rule__Concern__Group_3__0"
    // InternalBurst.g:1446:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1450:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:1451:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:1458:1: rule__Concern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1462:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1463:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1463:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1464:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            // InternalBurst.g:1465:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1465:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalBurst.g:1473:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1477:1: ( rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 )
            // InternalBurst.g:1478:2: rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:1485:1: rule__Concern__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1489:1: ( ( '{' ) )
            // InternalBurst.g:1490:1: ( '{' )
            {
            // InternalBurst.g:1490:1: ( '{' )
            // InternalBurst.g:1491:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Concern__Group_3__2"
    // InternalBurst.g:1500:1: rule__Concern__Group_3__2 : rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 ;
    public final void rule__Concern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1504:1: ( rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 )
            // InternalBurst.g:1505:2: rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__2"


    // $ANTLR start "rule__Concern__Group_3__2__Impl"
    // InternalBurst.g:1512:1: rule__Concern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1516:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1517:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1517:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1518:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            // InternalBurst.g:1519:2: ( RULE_ENDLINE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENDLINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBurst.g:1519:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__2__Impl"


    // $ANTLR start "rule__Concern__Group_3__3"
    // InternalBurst.g:1527:1: rule__Concern__Group_3__3 : rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 ;
    public final void rule__Concern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1531:1: ( rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 )
            // InternalBurst.g:1532:2: rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__3"


    // $ANTLR start "rule__Concern__Group_3__3__Impl"
    // InternalBurst.g:1539:1: rule__Concern__Group_3__3__Impl : ( ( rule__Concern__Group_3_3__0 )* ) ;
    public final void rule__Concern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1543:1: ( ( ( rule__Concern__Group_3_3__0 )* ) )
            // InternalBurst.g:1544:1: ( ( rule__Concern__Group_3_3__0 )* )
            {
            // InternalBurst.g:1544:1: ( ( rule__Concern__Group_3_3__0 )* )
            // InternalBurst.g:1545:2: ( rule__Concern__Group_3_3__0 )*
            {
             before(grammarAccess.getConcernAccess().getGroup_3_3()); 
            // InternalBurst.g:1546:2: ( rule__Concern__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1546:3: rule__Concern__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Concern__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__3__Impl"


    // $ANTLR start "rule__Concern__Group_3__4"
    // InternalBurst.g:1554:1: rule__Concern__Group_3__4 : rule__Concern__Group_3__4__Impl ;
    public final void rule__Concern__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1558:1: ( rule__Concern__Group_3__4__Impl )
            // InternalBurst.g:1559:2: rule__Concern__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__4"


    // $ANTLR start "rule__Concern__Group_3__4__Impl"
    // InternalBurst.g:1565:1: rule__Concern__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Concern__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1569:1: ( ( '}' ) )
            // InternalBurst.g:1570:1: ( '}' )
            {
            // InternalBurst.g:1570:1: ( '}' )
            // InternalBurst.g:1571:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3__4__Impl"


    // $ANTLR start "rule__Concern__Group_3_3__0"
    // InternalBurst.g:1581:1: rule__Concern__Group_3_3__0 : rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 ;
    public final void rule__Concern__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1585:1: ( rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 )
            // InternalBurst.g:1586:2: rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Concern__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3_3__0"


    // $ANTLR start "rule__Concern__Group_3_3__0__Impl"
    // InternalBurst.g:1593:1: rule__Concern__Group_3_3__0__Impl : ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) ;
    public final void rule__Concern__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1597:1: ( ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) )
            // InternalBurst.g:1598:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            {
            // InternalBurst.g:1598:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            // InternalBurst.g:1599:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            {
             before(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 
            // InternalBurst.g:1600:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            // InternalBurst.g:1600:3: rule__Concern__ElementsAssignment_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Concern__ElementsAssignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3_3__0__Impl"


    // $ANTLR start "rule__Concern__Group_3_3__1"
    // InternalBurst.g:1608:1: rule__Concern__Group_3_3__1 : rule__Concern__Group_3_3__1__Impl ;
    public final void rule__Concern__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1612:1: ( rule__Concern__Group_3_3__1__Impl )
            // InternalBurst.g:1613:2: rule__Concern__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__Group_3_3__1"


    // $ANTLR start "rule__Concern__Group_3_3__1__Impl"
    // InternalBurst.g:1619:1: rule__Concern__Group_3_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Concern__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1623:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1624:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1624:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1625:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1625:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1626:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            // InternalBurst.g:1627:3: ( RULE_ENDLINE )
            // InternalBurst.g:1627:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 

            }

            // InternalBurst.g:1630:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1631:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            // InternalBurst.g:1632:3: ( RULE_ENDLINE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1632:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 

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
    // $ANTLR end "rule__Concern__Group_3_3__1__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // InternalBurst.g:1642:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1646:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalBurst.g:1647:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // InternalBurst.g:1654:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1658:1: ( ( () ) )
            // InternalBurst.g:1659:1: ( () )
            {
            // InternalBurst.g:1659:1: ( () )
            // InternalBurst.g:1660:2: ()
            {
             before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            // InternalBurst.g:1661:2: ()
            // InternalBurst.g:1661:3: 
            {
            }

             after(grammarAccess.getTemplateAccess().getTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // InternalBurst.g:1669:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1673:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalBurst.g:1674:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // InternalBurst.g:1681:1: rule__Template__Group__1__Impl : ( 'template' ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1685:1: ( ( 'template' ) )
            // InternalBurst.g:1686:1: ( 'template' )
            {
            // InternalBurst.g:1686:1: ( 'template' )
            // InternalBurst.g:1687:2: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // InternalBurst.g:1696:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1700:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalBurst.g:1701:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // InternalBurst.g:1708:1: rule__Template__Group__2__Impl : ( ( rule__Template__NameAssignment_2 ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1712:1: ( ( ( rule__Template__NameAssignment_2 ) ) )
            // InternalBurst.g:1713:1: ( ( rule__Template__NameAssignment_2 ) )
            {
            // InternalBurst.g:1713:1: ( ( rule__Template__NameAssignment_2 ) )
            // InternalBurst.g:1714:2: ( rule__Template__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            // InternalBurst.g:1715:2: ( rule__Template__NameAssignment_2 )
            // InternalBurst.g:1715:3: rule__Template__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Template__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // InternalBurst.g:1723:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1727:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // InternalBurst.g:1728:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // InternalBurst.g:1735:1: rule__Template__Group__3__Impl : ( '<' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1739:1: ( ( '<' ) )
            // InternalBurst.g:1740:1: ( '<' )
            {
            // InternalBurst.g:1740:1: ( '<' )
            // InternalBurst.g:1741:2: '<'
            {
             before(grammarAccess.getTemplateAccess().getLessThanSignKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getLessThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__4"
    // InternalBurst.g:1750:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1754:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // InternalBurst.g:1755:2: rule__Template__Group__4__Impl rule__Template__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Template__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__4"


    // $ANTLR start "rule__Template__Group__4__Impl"
    // InternalBurst.g:1762:1: rule__Template__Group__4__Impl : ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1766:1: ( ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) )
            // InternalBurst.g:1767:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            {
            // InternalBurst.g:1767:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            // InternalBurst.g:1768:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 
            // InternalBurst.g:1769:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            // InternalBurst.g:1769:3: rule__Template__TemplateArgumentsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Template__TemplateArgumentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__4__Impl"


    // $ANTLR start "rule__Template__Group__5"
    // InternalBurst.g:1777:1: rule__Template__Group__5 : rule__Template__Group__5__Impl rule__Template__Group__6 ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1781:1: ( rule__Template__Group__5__Impl rule__Template__Group__6 )
            // InternalBurst.g:1782:2: rule__Template__Group__5__Impl rule__Template__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Template__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__5"


    // $ANTLR start "rule__Template__Group__5__Impl"
    // InternalBurst.g:1789:1: rule__Template__Group__5__Impl : ( ( rule__Template__Group_5__0 )* ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1793:1: ( ( ( rule__Template__Group_5__0 )* ) )
            // InternalBurst.g:1794:1: ( ( rule__Template__Group_5__0 )* )
            {
            // InternalBurst.g:1794:1: ( ( rule__Template__Group_5__0 )* )
            // InternalBurst.g:1795:2: ( rule__Template__Group_5__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_5()); 
            // InternalBurst.g:1796:2: ( rule__Template__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:1796:3: rule__Template__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Template__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__5__Impl"


    // $ANTLR start "rule__Template__Group__6"
    // InternalBurst.g:1804:1: rule__Template__Group__6 : rule__Template__Group__6__Impl rule__Template__Group__7 ;
    public final void rule__Template__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1808:1: ( rule__Template__Group__6__Impl rule__Template__Group__7 )
            // InternalBurst.g:1809:2: rule__Template__Group__6__Impl rule__Template__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Template__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__6"


    // $ANTLR start "rule__Template__Group__6__Impl"
    // InternalBurst.g:1816:1: rule__Template__Group__6__Impl : ( '>' ) ;
    public final void rule__Template__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1820:1: ( ( '>' ) )
            // InternalBurst.g:1821:1: ( '>' )
            {
            // InternalBurst.g:1821:1: ( '>' )
            // InternalBurst.g:1822:2: '>'
            {
             before(grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__6__Impl"


    // $ANTLR start "rule__Template__Group__7"
    // InternalBurst.g:1831:1: rule__Template__Group__7 : rule__Template__Group__7__Impl ;
    public final void rule__Template__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1835:1: ( rule__Template__Group__7__Impl )
            // InternalBurst.g:1836:2: rule__Template__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__7"


    // $ANTLR start "rule__Template__Group__7__Impl"
    // InternalBurst.g:1842:1: rule__Template__Group__7__Impl : ( ( rule__Template__Group_7__0 )? ) ;
    public final void rule__Template__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1846:1: ( ( ( rule__Template__Group_7__0 )? ) )
            // InternalBurst.g:1847:1: ( ( rule__Template__Group_7__0 )? )
            {
            // InternalBurst.g:1847:1: ( ( rule__Template__Group_7__0 )? )
            // InternalBurst.g:1848:2: ( rule__Template__Group_7__0 )?
            {
             before(grammarAccess.getTemplateAccess().getGroup_7()); 
            // InternalBurst.g:1849:2: ( rule__Template__Group_7__0 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalBurst.g:1849:3: rule__Template__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Template__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__7__Impl"


    // $ANTLR start "rule__Template__Group_5__0"
    // InternalBurst.g:1858:1: rule__Template__Group_5__0 : rule__Template__Group_5__0__Impl rule__Template__Group_5__1 ;
    public final void rule__Template__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1862:1: ( rule__Template__Group_5__0__Impl rule__Template__Group_5__1 )
            // InternalBurst.g:1863:2: rule__Template__Group_5__0__Impl rule__Template__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_5__0"


    // $ANTLR start "rule__Template__Group_5__0__Impl"
    // InternalBurst.g:1870:1: rule__Template__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Template__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1874:1: ( ( ',' ) )
            // InternalBurst.g:1875:1: ( ',' )
            {
            // InternalBurst.g:1875:1: ( ',' )
            // InternalBurst.g:1876:2: ','
            {
             before(grammarAccess.getTemplateAccess().getCommaKeyword_5_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_5__0__Impl"


    // $ANTLR start "rule__Template__Group_5__1"
    // InternalBurst.g:1885:1: rule__Template__Group_5__1 : rule__Template__Group_5__1__Impl ;
    public final void rule__Template__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1889:1: ( rule__Template__Group_5__1__Impl )
            // InternalBurst.g:1890:2: rule__Template__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_5__1"


    // $ANTLR start "rule__Template__Group_5__1__Impl"
    // InternalBurst.g:1896:1: rule__Template__Group_5__1__Impl : ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) ;
    public final void rule__Template__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1900:1: ( ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) )
            // InternalBurst.g:1901:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            {
            // InternalBurst.g:1901:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            // InternalBurst.g:1902:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 
            // InternalBurst.g:1903:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            // InternalBurst.g:1903:3: rule__Template__TemplateArgumentsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Template__TemplateArgumentsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_5__1__Impl"


    // $ANTLR start "rule__Template__Group_7__0"
    // InternalBurst.g:1912:1: rule__Template__Group_7__0 : rule__Template__Group_7__0__Impl rule__Template__Group_7__1 ;
    public final void rule__Template__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1916:1: ( rule__Template__Group_7__0__Impl rule__Template__Group_7__1 )
            // InternalBurst.g:1917:2: rule__Template__Group_7__0__Impl rule__Template__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Template__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__0"


    // $ANTLR start "rule__Template__Group_7__0__Impl"
    // InternalBurst.g:1924:1: rule__Template__Group_7__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1928:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1929:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1929:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1930:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 
            // InternalBurst.g:1931:2: ( RULE_ENDLINE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ENDLINE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1931:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__0__Impl"


    // $ANTLR start "rule__Template__Group_7__1"
    // InternalBurst.g:1939:1: rule__Template__Group_7__1 : rule__Template__Group_7__1__Impl rule__Template__Group_7__2 ;
    public final void rule__Template__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1943:1: ( rule__Template__Group_7__1__Impl rule__Template__Group_7__2 )
            // InternalBurst.g:1944:2: rule__Template__Group_7__1__Impl rule__Template__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__1"


    // $ANTLR start "rule__Template__Group_7__1__Impl"
    // InternalBurst.g:1951:1: rule__Template__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Template__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1955:1: ( ( '{' ) )
            // InternalBurst.g:1956:1: ( '{' )
            {
            // InternalBurst.g:1956:1: ( '{' )
            // InternalBurst.g:1957:2: '{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__1__Impl"


    // $ANTLR start "rule__Template__Group_7__2"
    // InternalBurst.g:1966:1: rule__Template__Group_7__2 : rule__Template__Group_7__2__Impl rule__Template__Group_7__3 ;
    public final void rule__Template__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1970:1: ( rule__Template__Group_7__2__Impl rule__Template__Group_7__3 )
            // InternalBurst.g:1971:2: rule__Template__Group_7__2__Impl rule__Template__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__2"


    // $ANTLR start "rule__Template__Group_7__2__Impl"
    // InternalBurst.g:1978:1: rule__Template__Group_7__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1982:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1983:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1983:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1984:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 
            // InternalBurst.g:1985:2: ( RULE_ENDLINE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ENDLINE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBurst.g:1985:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__2__Impl"


    // $ANTLR start "rule__Template__Group_7__3"
    // InternalBurst.g:1993:1: rule__Template__Group_7__3 : rule__Template__Group_7__3__Impl rule__Template__Group_7__4 ;
    public final void rule__Template__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1997:1: ( rule__Template__Group_7__3__Impl rule__Template__Group_7__4 )
            // InternalBurst.g:1998:2: rule__Template__Group_7__3__Impl rule__Template__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__3"


    // $ANTLR start "rule__Template__Group_7__3__Impl"
    // InternalBurst.g:2005:1: rule__Template__Group_7__3__Impl : ( ( rule__Template__Group_7_3__0 )* ) ;
    public final void rule__Template__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2009:1: ( ( ( rule__Template__Group_7_3__0 )* ) )
            // InternalBurst.g:2010:1: ( ( rule__Template__Group_7_3__0 )* )
            {
            // InternalBurst.g:2010:1: ( ( rule__Template__Group_7_3__0 )* )
            // InternalBurst.g:2011:2: ( rule__Template__Group_7_3__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_7_3()); 
            // InternalBurst.g:2012:2: ( rule__Template__Group_7_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=29 && LA25_0<=30)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:2012:3: rule__Template__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Template__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__3__Impl"


    // $ANTLR start "rule__Template__Group_7__4"
    // InternalBurst.g:2020:1: rule__Template__Group_7__4 : rule__Template__Group_7__4__Impl ;
    public final void rule__Template__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2024:1: ( rule__Template__Group_7__4__Impl )
            // InternalBurst.g:2025:2: rule__Template__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__4"


    // $ANTLR start "rule__Template__Group_7__4__Impl"
    // InternalBurst.g:2031:1: rule__Template__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Template__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2035:1: ( ( '}' ) )
            // InternalBurst.g:2036:1: ( '}' )
            {
            // InternalBurst.g:2036:1: ( '}' )
            // InternalBurst.g:2037:2: '}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7__4__Impl"


    // $ANTLR start "rule__Template__Group_7_3__0"
    // InternalBurst.g:2047:1: rule__Template__Group_7_3__0 : rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 ;
    public final void rule__Template__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2051:1: ( rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 )
            // InternalBurst.g:2052:2: rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Template__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7_3__0"


    // $ANTLR start "rule__Template__Group_7_3__0__Impl"
    // InternalBurst.g:2059:1: rule__Template__Group_7_3__0__Impl : ( ( rule__Template__ElementsAssignment_7_3_0 ) ) ;
    public final void rule__Template__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2063:1: ( ( ( rule__Template__ElementsAssignment_7_3_0 ) ) )
            // InternalBurst.g:2064:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            {
            // InternalBurst.g:2064:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            // InternalBurst.g:2065:2: ( rule__Template__ElementsAssignment_7_3_0 )
            {
             before(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 
            // InternalBurst.g:2066:2: ( rule__Template__ElementsAssignment_7_3_0 )
            // InternalBurst.g:2066:3: rule__Template__ElementsAssignment_7_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Template__ElementsAssignment_7_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7_3__0__Impl"


    // $ANTLR start "rule__Template__Group_7_3__1"
    // InternalBurst.g:2074:1: rule__Template__Group_7_3__1 : rule__Template__Group_7_3__1__Impl ;
    public final void rule__Template__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2078:1: ( rule__Template__Group_7_3__1__Impl )
            // InternalBurst.g:2079:2: rule__Template__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group_7_3__1"


    // $ANTLR start "rule__Template__Group_7_3__1__Impl"
    // InternalBurst.g:2085:1: rule__Template__Group_7_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Template__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2089:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2090:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2090:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2091:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2091:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2092:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            // InternalBurst.g:2093:3: ( RULE_ENDLINE )
            // InternalBurst.g:2093:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 

            }

            // InternalBurst.g:2096:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2097:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            // InternalBurst.g:2098:3: ( RULE_ENDLINE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ENDLINE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:2098:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 

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
    // $ANTLR end "rule__Template__Group_7_3__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:2108:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2112:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:2113:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBurst.g:2120:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2124:1: ( ( () ) )
            // InternalBurst.g:2125:1: ( () )
            {
            // InternalBurst.g:2125:1: ( () )
            // InternalBurst.g:2126:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:2127:2: ()
            // InternalBurst.g:2127:3: 
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
    // InternalBurst.g:2135:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2139:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:2140:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBurst.g:2147:1: rule__Member__Group__1__Impl : ( ( rule__Member__HeritFromAssignment_1 )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2151:1: ( ( ( rule__Member__HeritFromAssignment_1 )? ) )
            // InternalBurst.g:2152:1: ( ( rule__Member__HeritFromAssignment_1 )? )
            {
            // InternalBurst.g:2152:1: ( ( rule__Member__HeritFromAssignment_1 )? )
            // InternalBurst.g:2153:2: ( rule__Member__HeritFromAssignment_1 )?
            {
             before(grammarAccess.getMemberAccess().getHeritFromAssignment_1()); 
            // InternalBurst.g:2154:2: ( rule__Member__HeritFromAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBurst.g:2154:3: rule__Member__HeritFromAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__HeritFromAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getHeritFromAssignment_1()); 

            }


            }

        }
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
    // InternalBurst.g:2162:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2166:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalBurst.g:2167:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:2174:1: rule__Member__Group__2__Impl : ( ( rule__Member__ConcernAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2178:1: ( ( ( rule__Member__ConcernAssignment_2 ) ) )
            // InternalBurst.g:2179:1: ( ( rule__Member__ConcernAssignment_2 ) )
            {
            // InternalBurst.g:2179:1: ( ( rule__Member__ConcernAssignment_2 ) )
            // InternalBurst.g:2180:2: ( rule__Member__ConcernAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_2()); 
            // InternalBurst.g:2181:2: ( rule__Member__ConcernAssignment_2 )
            // InternalBurst.g:2181:3: rule__Member__ConcernAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Member__ConcernAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getConcernAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:2189:1: rule__Member__Group__3 : rule__Member__Group__3__Impl ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2193:1: ( rule__Member__Group__3__Impl )
            // InternalBurst.g:2194:2: rule__Member__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:2200:1: rule__Member__Group__3__Impl : ( ( rule__Member__NameAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2204:1: ( ( ( rule__Member__NameAssignment_3 ) ) )
            // InternalBurst.g:2205:1: ( ( rule__Member__NameAssignment_3 ) )
            {
            // InternalBurst.g:2205:1: ( ( rule__Member__NameAssignment_3 ) )
            // InternalBurst.g:2206:2: ( rule__Member__NameAssignment_3 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_3()); 
            // InternalBurst.g:2207:2: ( rule__Member__NameAssignment_3 )
            // InternalBurst.g:2207:3: rule__Member__NameAssignment_3
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


    // $ANTLR start "rule__RuleIntersect__Group__0"
    // InternalBurst.g:2216:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2220:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:2221:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBurst.g:2228:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2232:1: ( ( () ) )
            // InternalBurst.g:2233:1: ( () )
            {
            // InternalBurst.g:2233:1: ( () )
            // InternalBurst.g:2234:2: ()
            {
             before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            // InternalBurst.g:2235:2: ()
            // InternalBurst.g:2235:3: 
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
    // InternalBurst.g:2243:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2247:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:2248:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2255:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2259:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:2260:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:2260:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:2261:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            // InternalBurst.g:2262:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:2262:3: rule__RuleIntersect__NameAssignment_1
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
    // InternalBurst.g:2270:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2274:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:2275:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2282:1: rule__RuleIntersect__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2286:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2287:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2287:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2288:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:2289:2: ( RULE_ENDLINE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ENDLINE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBurst.g:2289:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBurst.g:2297:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2301:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:2302:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalBurst.g:2309:1: rule__RuleIntersect__Group__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2313:1: ( ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) )
            // InternalBurst.g:2314:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            {
            // InternalBurst.g:2314:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            // InternalBurst.g:2315:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 
            // InternalBurst.g:2316:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            // InternalBurst.g:2316:3: rule__RuleIntersect__ParamsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 

            }


            }

        }
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
    // InternalBurst.g:2324:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2328:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:2329:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalBurst.g:2336:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__Group_4__0 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2340:1: ( ( ( rule__RuleIntersect__Group_4__0 )* ) )
            // InternalBurst.g:2341:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            {
            // InternalBurst.g:2341:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            // InternalBurst.g:2342:2: ( rule__RuleIntersect__Group_4__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
            // InternalBurst.g:2343:2: ( rule__RuleIntersect__Group_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ENDLINE||(LA29_0>=12 && LA29_0<=13)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBurst.g:2343:3: rule__RuleIntersect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalBurst.g:2351:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2355:1: ( rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 )
            // InternalBurst.g:2356:2: rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalBurst.g:2363:1: rule__RuleIntersect__Group__5__Impl : ( ( rule__RuleIntersect__Group_5__0 )? ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2367:1: ( ( ( rule__RuleIntersect__Group_5__0 )? ) )
            // InternalBurst.g:2368:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            {
            // InternalBurst.g:2368:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            // InternalBurst.g:2369:2: ( rule__RuleIntersect__Group_5__0 )?
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_5()); 
            // InternalBurst.g:2370:2: ( rule__RuleIntersect__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBurst.g:2370:3: rule__RuleIntersect__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleIntersect__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleIntersectAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalBurst.g:2378:1: rule__RuleIntersect__Group__6 : rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 ;
    public final void rule__RuleIntersect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2382:1: ( rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 )
            // InternalBurst.g:2383:2: rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalBurst.g:2390:1: rule__RuleIntersect__Group__6__Impl : ( '{' ) ;
    public final void rule__RuleIntersect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2394:1: ( ( '{' ) )
            // InternalBurst.g:2395:1: ( '{' )
            {
            // InternalBurst.g:2395:1: ( '{' )
            // InternalBurst.g:2396:2: '{'
            {
             before(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalBurst.g:2405:1: rule__RuleIntersect__Group__7 : rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 ;
    public final void rule__RuleIntersect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2409:1: ( rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 )
            // InternalBurst.g:2410:2: rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalBurst.g:2417:1: rule__RuleIntersect__Group__7__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2421:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2422:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2422:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2423:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7()); 
            // InternalBurst.g:2424:2: ( RULE_ENDLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENDLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBurst.g:2424:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7()); 

            }


            }

        }
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
    // InternalBurst.g:2432:1: rule__RuleIntersect__Group__8 : rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9 ;
    public final void rule__RuleIntersect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2436:1: ( rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9 )
            // InternalBurst.g:2437:2: rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__9();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:2444:1: rule__RuleIntersect__Group__8__Impl : ( ( rule__RuleIntersect__Group_8__0 )* ) ;
    public final void rule__RuleIntersect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2448:1: ( ( ( rule__RuleIntersect__Group_8__0 )* ) )
            // InternalBurst.g:2449:1: ( ( rule__RuleIntersect__Group_8__0 )* )
            {
            // InternalBurst.g:2449:1: ( ( rule__RuleIntersect__Group_8__0 )* )
            // InternalBurst.g:2450:2: ( rule__RuleIntersect__Group_8__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_8()); 
            // InternalBurst.g:2451:2: ( rule__RuleIntersect__Group_8__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=24 && LA32_0<=25)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBurst.g:2451:3: rule__RuleIntersect__Group_8__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__RuleIntersect__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__RuleIntersect__Group__9"
    // InternalBurst.g:2459:1: rule__RuleIntersect__Group__9 : rule__RuleIntersect__Group__9__Impl ;
    public final void rule__RuleIntersect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2463:1: ( rule__RuleIntersect__Group__9__Impl )
            // InternalBurst.g:2464:2: rule__RuleIntersect__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__9"


    // $ANTLR start "rule__RuleIntersect__Group__9__Impl"
    // InternalBurst.g:2470:1: rule__RuleIntersect__Group__9__Impl : ( '}' ) ;
    public final void rule__RuleIntersect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2474:1: ( ( '}' ) )
            // InternalBurst.g:2475:1: ( '}' )
            {
            // InternalBurst.g:2475:1: ( '}' )
            // InternalBurst.g:2476:2: '}'
            {
             before(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group__9__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__0"
    // InternalBurst.g:2486:1: rule__RuleIntersect__Group_4__0 : rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 ;
    public final void rule__RuleIntersect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2490:1: ( rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 )
            // InternalBurst.g:2491:2: rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalBurst.g:2498:1: rule__RuleIntersect__Group_4__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2502:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2503:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2503:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2504:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
            // InternalBurst.g:2505:2: ( RULE_ENDLINE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ENDLINE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBurst.g:2505:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalBurst.g:2513:1: rule__RuleIntersect__Group_4__1 : rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 ;
    public final void rule__RuleIntersect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2517:1: ( rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 )
            // InternalBurst.g:2518:2: rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2525:1: rule__RuleIntersect__Group_4__1__Impl : ( ( rule__RuleIntersect__Alternatives_4_1 ) ) ;
    public final void rule__RuleIntersect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2529:1: ( ( ( rule__RuleIntersect__Alternatives_4_1 ) ) )
            // InternalBurst.g:2530:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            {
            // InternalBurst.g:2530:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            // InternalBurst.g:2531:2: ( rule__RuleIntersect__Alternatives_4_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
            // InternalBurst.g:2532:2: ( rule__RuleIntersect__Alternatives_4_1 )
            // InternalBurst.g:2532:3: rule__RuleIntersect__Alternatives_4_1
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
    // InternalBurst.g:2540:1: rule__RuleIntersect__Group_4__2 : rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 ;
    public final void rule__RuleIntersect__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2544:1: ( rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 )
            // InternalBurst.g:2545:2: rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2552:1: rule__RuleIntersect__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2556:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2557:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2557:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2558:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
            // InternalBurst.g:2559:2: ( RULE_ENDLINE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ENDLINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBurst.g:2559:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalBurst.g:2567:1: rule__RuleIntersect__Group_4__3 : rule__RuleIntersect__Group_4__3__Impl ;
    public final void rule__RuleIntersect__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2571:1: ( rule__RuleIntersect__Group_4__3__Impl )
            // InternalBurst.g:2572:2: rule__RuleIntersect__Group_4__3__Impl
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
    // InternalBurst.g:2578:1: rule__RuleIntersect__Group_4__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) ;
    public final void rule__RuleIntersect__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2582:1: ( ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) )
            // InternalBurst.g:2583:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            {
            // InternalBurst.g:2583:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            // InternalBurst.g:2584:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 
            // InternalBurst.g:2585:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            // InternalBurst.g:2585:3: rule__RuleIntersect__ParamsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RuleIntersect__Group_5__0"
    // InternalBurst.g:2594:1: rule__RuleIntersect__Group_5__0 : rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 ;
    public final void rule__RuleIntersect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2598:1: ( rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 )
            // InternalBurst.g:2599:2: rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__0"


    // $ANTLR start "rule__RuleIntersect__Group_5__0__Impl"
    // InternalBurst.g:2606:1: rule__RuleIntersect__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__RuleIntersect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2610:1: ( ( 'with' ) )
            // InternalBurst.g:2611:1: ( 'with' )
            {
            // InternalBurst.g:2611:1: ( 'with' )
            // InternalBurst.g:2612:2: 'with'
            {
             before(grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__1"
    // InternalBurst.g:2621:1: rule__RuleIntersect__Group_5__1 : rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 ;
    public final void rule__RuleIntersect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2625:1: ( rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 )
            // InternalBurst.g:2626:2: rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__1"


    // $ANTLR start "rule__RuleIntersect__Group_5__1__Impl"
    // InternalBurst.g:2633:1: rule__RuleIntersect__Group_5__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2637:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2638:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2638:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2639:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1()); 
            // InternalBurst.g:2640:2: ( RULE_ENDLINE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ENDLINE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBurst.g:2640:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__2"
    // InternalBurst.g:2648:1: rule__RuleIntersect__Group_5__2 : rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 ;
    public final void rule__RuleIntersect__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2652:1: ( rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 )
            // InternalBurst.g:2653:2: rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3
            {
            pushFollow(FOLLOW_29);
            rule__RuleIntersect__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__2"


    // $ANTLR start "rule__RuleIntersect__Group_5__2__Impl"
    // InternalBurst.g:2660:1: rule__RuleIntersect__Group_5__2__Impl : ( ( rule__RuleIntersect__ParamsAssignment_5_2 ) ) ;
    public final void rule__RuleIntersect__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2664:1: ( ( ( rule__RuleIntersect__ParamsAssignment_5_2 ) ) )
            // InternalBurst.g:2665:1: ( ( rule__RuleIntersect__ParamsAssignment_5_2 ) )
            {
            // InternalBurst.g:2665:1: ( ( rule__RuleIntersect__ParamsAssignment_5_2 ) )
            // InternalBurst.g:2666:2: ( rule__RuleIntersect__ParamsAssignment_5_2 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_5_2()); 
            // InternalBurst.g:2667:2: ( rule__RuleIntersect__ParamsAssignment_5_2 )
            // InternalBurst.g:2667:3: rule__RuleIntersect__ParamsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__3"
    // InternalBurst.g:2675:1: rule__RuleIntersect__Group_5__3 : rule__RuleIntersect__Group_5__3__Impl ;
    public final void rule__RuleIntersect__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2679:1: ( rule__RuleIntersect__Group_5__3__Impl )
            // InternalBurst.g:2680:2: rule__RuleIntersect__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__3"


    // $ANTLR start "rule__RuleIntersect__Group_5__3__Impl"
    // InternalBurst.g:2686:1: rule__RuleIntersect__Group_5__3__Impl : ( ( rule__RuleIntersect__Group_5_3__0 )* ) ;
    public final void rule__RuleIntersect__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2690:1: ( ( ( rule__RuleIntersect__Group_5_3__0 )* ) )
            // InternalBurst.g:2691:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            {
            // InternalBurst.g:2691:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            // InternalBurst.g:2692:2: ( rule__RuleIntersect__Group_5_3__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_5_3()); 
            // InternalBurst.g:2693:2: ( rule__RuleIntersect__Group_5_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ENDLINE||(LA36_0>=12 && LA36_0<=13)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBurst.g:2693:3: rule__RuleIntersect__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__0"
    // InternalBurst.g:2702:1: rule__RuleIntersect__Group_5_3__0 : rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 ;
    public final void rule__RuleIntersect__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2706:1: ( rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 )
            // InternalBurst.g:2707:2: rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__RuleIntersect__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__0"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__0__Impl"
    // InternalBurst.g:2714:1: rule__RuleIntersect__Group_5_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2718:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2719:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2719:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2720:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0()); 
            // InternalBurst.g:2721:2: ( RULE_ENDLINE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ENDLINE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBurst.g:2721:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__1"
    // InternalBurst.g:2729:1: rule__RuleIntersect__Group_5_3__1 : rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 ;
    public final void rule__RuleIntersect__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2733:1: ( rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 )
            // InternalBurst.g:2734:2: rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__1"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__1__Impl"
    // InternalBurst.g:2741:1: rule__RuleIntersect__Group_5_3__1__Impl : ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2745:1: ( ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) )
            // InternalBurst.g:2746:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            {
            // InternalBurst.g:2746:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            // InternalBurst.g:2747:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1()); 
            // InternalBurst.g:2748:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            // InternalBurst.g:2748:3: rule__RuleIntersect__Alternatives_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Alternatives_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__2"
    // InternalBurst.g:2756:1: rule__RuleIntersect__Group_5_3__2 : rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 ;
    public final void rule__RuleIntersect__Group_5_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2760:1: ( rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 )
            // InternalBurst.g:2761:2: rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__2"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__2__Impl"
    // InternalBurst.g:2768:1: rule__RuleIntersect__Group_5_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2772:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2773:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2773:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2774:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2()); 
            // InternalBurst.g:2775:2: ( RULE_ENDLINE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ENDLINE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBurst.g:2775:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__3"
    // InternalBurst.g:2783:1: rule__RuleIntersect__Group_5_3__3 : rule__RuleIntersect__Group_5_3__3__Impl ;
    public final void rule__RuleIntersect__Group_5_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2787:1: ( rule__RuleIntersect__Group_5_3__3__Impl )
            // InternalBurst.g:2788:2: rule__RuleIntersect__Group_5_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__3"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__3__Impl"
    // InternalBurst.g:2794:1: rule__RuleIntersect__Group_5_3__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_5_3_3 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2798:1: ( ( ( rule__RuleIntersect__ParamsAssignment_5_3_3 ) ) )
            // InternalBurst.g:2799:1: ( ( rule__RuleIntersect__ParamsAssignment_5_3_3 ) )
            {
            // InternalBurst.g:2799:1: ( ( rule__RuleIntersect__ParamsAssignment_5_3_3 ) )
            // InternalBurst.g:2800:2: ( rule__RuleIntersect__ParamsAssignment_5_3_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_5_3_3()); 
            // InternalBurst.g:2801:2: ( rule__RuleIntersect__ParamsAssignment_5_3_3 )
            // InternalBurst.g:2801:3: rule__RuleIntersect__ParamsAssignment_5_3_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_5_3_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_5_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_5_3__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_8__0"
    // InternalBurst.g:2810:1: rule__RuleIntersect__Group_8__0 : rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1 ;
    public final void rule__RuleIntersect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2814:1: ( rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1 )
            // InternalBurst.g:2815:2: rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__RuleIntersect__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_8__0"


    // $ANTLR start "rule__RuleIntersect__Group_8__0__Impl"
    // InternalBurst.g:2822:1: rule__RuleIntersect__Group_8__0__Impl : ( ( rule__RuleIntersect__LinesAssignment_8_0 ) ) ;
    public final void rule__RuleIntersect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2826:1: ( ( ( rule__RuleIntersect__LinesAssignment_8_0 ) ) )
            // InternalBurst.g:2827:1: ( ( rule__RuleIntersect__LinesAssignment_8_0 ) )
            {
            // InternalBurst.g:2827:1: ( ( rule__RuleIntersect__LinesAssignment_8_0 ) )
            // InternalBurst.g:2828:2: ( rule__RuleIntersect__LinesAssignment_8_0 )
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesAssignment_8_0()); 
            // InternalBurst.g:2829:2: ( rule__RuleIntersect__LinesAssignment_8_0 )
            // InternalBurst.g:2829:3: rule__RuleIntersect__LinesAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__LinesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getLinesAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_8__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_8__1"
    // InternalBurst.g:2837:1: rule__RuleIntersect__Group_8__1 : rule__RuleIntersect__Group_8__1__Impl ;
    public final void rule__RuleIntersect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2841:1: ( rule__RuleIntersect__Group_8__1__Impl )
            // InternalBurst.g:2842:2: rule__RuleIntersect__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__Group_8__1"


    // $ANTLR start "rule__RuleIntersect__Group_8__1__Impl"
    // InternalBurst.g:2848:1: rule__RuleIntersect__Group_8__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__RuleIntersect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2852:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2853:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2853:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2854:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2854:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2855:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 
            // InternalBurst.g:2856:3: ( RULE_ENDLINE )
            // InternalBurst.g:2856:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 

            }

            // InternalBurst.g:2859:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2860:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 
            // InternalBurst.g:2861:3: ( RULE_ENDLINE )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ENDLINE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBurst.g:2861:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 

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
    // $ANTLR end "rule__RuleIntersect__Group_8__1__Impl"


    // $ANTLR start "rule__Locale__Group__0"
    // InternalBurst.g:2871:1: rule__Locale__Group__0 : rule__Locale__Group__0__Impl rule__Locale__Group__1 ;
    public final void rule__Locale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2875:1: ( rule__Locale__Group__0__Impl rule__Locale__Group__1 )
            // InternalBurst.g:2876:2: rule__Locale__Group__0__Impl rule__Locale__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Locale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__0"


    // $ANTLR start "rule__Locale__Group__0__Impl"
    // InternalBurst.g:2883:1: rule__Locale__Group__0__Impl : ( () ) ;
    public final void rule__Locale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2887:1: ( ( () ) )
            // InternalBurst.g:2888:1: ( () )
            {
            // InternalBurst.g:2888:1: ( () )
            // InternalBurst.g:2889:2: ()
            {
             before(grammarAccess.getLocaleAccess().getLocaleAction_0()); 
            // InternalBurst.g:2890:2: ()
            // InternalBurst.g:2890:3: 
            {
            }

             after(grammarAccess.getLocaleAccess().getLocaleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__0__Impl"


    // $ANTLR start "rule__Locale__Group__1"
    // InternalBurst.g:2898:1: rule__Locale__Group__1 : rule__Locale__Group__1__Impl rule__Locale__Group__2 ;
    public final void rule__Locale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2902:1: ( rule__Locale__Group__1__Impl rule__Locale__Group__2 )
            // InternalBurst.g:2903:2: rule__Locale__Group__1__Impl rule__Locale__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locale__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__1"


    // $ANTLR start "rule__Locale__Group__1__Impl"
    // InternalBurst.g:2910:1: rule__Locale__Group__1__Impl : ( 'new' ) ;
    public final void rule__Locale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2914:1: ( ( 'new' ) )
            // InternalBurst.g:2915:1: ( 'new' )
            {
            // InternalBurst.g:2915:1: ( 'new' )
            // InternalBurst.g:2916:2: 'new'
            {
             before(grammarAccess.getLocaleAccess().getNewKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLocaleAccess().getNewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__1__Impl"


    // $ANTLR start "rule__Locale__Group__2"
    // InternalBurst.g:2925:1: rule__Locale__Group__2 : rule__Locale__Group__2__Impl rule__Locale__Group__3 ;
    public final void rule__Locale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2929:1: ( rule__Locale__Group__2__Impl rule__Locale__Group__3 )
            // InternalBurst.g:2930:2: rule__Locale__Group__2__Impl rule__Locale__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locale__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__2"


    // $ANTLR start "rule__Locale__Group__2__Impl"
    // InternalBurst.g:2937:1: rule__Locale__Group__2__Impl : ( ( rule__Locale__TypeAssignment_2 ) ) ;
    public final void rule__Locale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2941:1: ( ( ( rule__Locale__TypeAssignment_2 ) ) )
            // InternalBurst.g:2942:1: ( ( rule__Locale__TypeAssignment_2 ) )
            {
            // InternalBurst.g:2942:1: ( ( rule__Locale__TypeAssignment_2 ) )
            // InternalBurst.g:2943:2: ( rule__Locale__TypeAssignment_2 )
            {
             before(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 
            // InternalBurst.g:2944:2: ( rule__Locale__TypeAssignment_2 )
            // InternalBurst.g:2944:3: rule__Locale__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Locale__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__2__Impl"


    // $ANTLR start "rule__Locale__Group__3"
    // InternalBurst.g:2952:1: rule__Locale__Group__3 : rule__Locale__Group__3__Impl ;
    public final void rule__Locale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2956:1: ( rule__Locale__Group__3__Impl )
            // InternalBurst.g:2957:2: rule__Locale__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__3"


    // $ANTLR start "rule__Locale__Group__3__Impl"
    // InternalBurst.g:2963:1: rule__Locale__Group__3__Impl : ( ( rule__Locale__NameAssignment_3 ) ) ;
    public final void rule__Locale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2967:1: ( ( ( rule__Locale__NameAssignment_3 ) ) )
            // InternalBurst.g:2968:1: ( ( rule__Locale__NameAssignment_3 ) )
            {
            // InternalBurst.g:2968:1: ( ( rule__Locale__NameAssignment_3 ) )
            // InternalBurst.g:2969:2: ( rule__Locale__NameAssignment_3 )
            {
             before(grammarAccess.getLocaleAccess().getNameAssignment_3()); 
            // InternalBurst.g:2970:2: ( rule__Locale__NameAssignment_3 )
            // InternalBurst.g:2970:3: rule__Locale__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Locale__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocaleAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalBurst.g:2979:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2983:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalBurst.g:2984:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2991:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2995:1: ( ( () ) )
            // InternalBurst.g:2996:1: ( () )
            {
            // InternalBurst.g:2996:1: ( () )
            // InternalBurst.g:2997:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalBurst.g:2998:2: ()
            // InternalBurst.g:2998:3: 
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
    // InternalBurst.g:3006:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3010:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalBurst.g:3011:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:3018:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3022:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // InternalBurst.g:3023:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // InternalBurst.g:3023:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // InternalBurst.g:3024:2: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // InternalBurst.g:3025:2: ( rule__Parameter__TypeAssignment_1 )
            // InternalBurst.g:3025:3: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalBurst.g:3033:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3037:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalBurst.g:3038:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalBurst.g:3045:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3049:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalBurst.g:3050:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:3050:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalBurst.g:3051:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalBurst.g:3052:2: ( rule__Parameter__NameAssignment_2 )
            // InternalBurst.g:3052:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalBurst.g:3060:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3064:1: ( rule__Parameter__Group__3__Impl )
            // InternalBurst.g:3065:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalBurst.g:3071:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3075:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // InternalBurst.g:3076:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // InternalBurst.g:3076:1: ( ( rule__Parameter__Group_3__0 )? )
            // InternalBurst.g:3077:2: ( rule__Parameter__Group_3__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_3()); 
            // InternalBurst.g:3078:2: ( rule__Parameter__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBurst.g:3078:3: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // InternalBurst.g:3087:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3091:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // InternalBurst.g:3092:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // InternalBurst.g:3099:1: rule__Parameter__Group_3__0__Impl : ( ( rule__Parameter__UsageAssignment_3_0 ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3103:1: ( ( ( rule__Parameter__UsageAssignment_3_0 ) ) )
            // InternalBurst.g:3104:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            {
            // InternalBurst.g:3104:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            // InternalBurst.g:3105:2: ( rule__Parameter__UsageAssignment_3_0 )
            {
             before(grammarAccess.getParameterAccess().getUsageAssignment_3_0()); 
            // InternalBurst.g:3106:2: ( rule__Parameter__UsageAssignment_3_0 )
            // InternalBurst.g:3106:3: rule__Parameter__UsageAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UsageAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getUsageAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // InternalBurst.g:3114:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3118:1: ( rule__Parameter__Group_3__1__Impl )
            // InternalBurst.g:3119:2: rule__Parameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // InternalBurst.g:3125:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__RoleAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3129:1: ( ( ( rule__Parameter__RoleAssignment_3_1 ) ) )
            // InternalBurst.g:3130:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            {
            // InternalBurst.g:3130:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            // InternalBurst.g:3131:2: ( rule__Parameter__RoleAssignment_3_1 )
            {
             before(grammarAccess.getParameterAccess().getRoleAssignment_3_1()); 
            // InternalBurst.g:3132:2: ( rule__Parameter__RoleAssignment_3_1 )
            // InternalBurst.g:3132:3: rule__Parameter__RoleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__RoleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getRoleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__WithParameter__Group__0"
    // InternalBurst.g:3141:1: rule__WithParameter__Group__0 : rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 ;
    public final void rule__WithParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3145:1: ( rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 )
            // InternalBurst.g:3146:2: rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__WithParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__0"


    // $ANTLR start "rule__WithParameter__Group__0__Impl"
    // InternalBurst.g:3153:1: rule__WithParameter__Group__0__Impl : ( () ) ;
    public final void rule__WithParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3157:1: ( ( () ) )
            // InternalBurst.g:3158:1: ( () )
            {
            // InternalBurst.g:3158:1: ( () )
            // InternalBurst.g:3159:2: ()
            {
             before(grammarAccess.getWithParameterAccess().getWithParameterAction_0()); 
            // InternalBurst.g:3160:2: ()
            // InternalBurst.g:3160:3: 
            {
            }

             after(grammarAccess.getWithParameterAccess().getWithParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__0__Impl"


    // $ANTLR start "rule__WithParameter__Group__1"
    // InternalBurst.g:3168:1: rule__WithParameter__Group__1 : rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 ;
    public final void rule__WithParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3172:1: ( rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 )
            // InternalBurst.g:3173:2: rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__WithParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__1"


    // $ANTLR start "rule__WithParameter__Group__1__Impl"
    // InternalBurst.g:3180:1: rule__WithParameter__Group__1__Impl : ( ( rule__WithParameter__NameAssignment_1 ) ) ;
    public final void rule__WithParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3184:1: ( ( ( rule__WithParameter__NameAssignment_1 ) ) )
            // InternalBurst.g:3185:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            {
            // InternalBurst.g:3185:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            // InternalBurst.g:3186:2: ( rule__WithParameter__NameAssignment_1 )
            {
             before(grammarAccess.getWithParameterAccess().getNameAssignment_1()); 
            // InternalBurst.g:3187:2: ( rule__WithParameter__NameAssignment_1 )
            // InternalBurst.g:3187:3: rule__WithParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWithParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__1__Impl"


    // $ANTLR start "rule__WithParameter__Group__2"
    // InternalBurst.g:3195:1: rule__WithParameter__Group__2 : rule__WithParameter__Group__2__Impl ;
    public final void rule__WithParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3199:1: ( rule__WithParameter__Group__2__Impl )
            // InternalBurst.g:3200:2: rule__WithParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__2"


    // $ANTLR start "rule__WithParameter__Group__2__Impl"
    // InternalBurst.g:3206:1: rule__WithParameter__Group__2__Impl : ( ( rule__WithParameter__Group_2__0 )? ) ;
    public final void rule__WithParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3210:1: ( ( ( rule__WithParameter__Group_2__0 )? ) )
            // InternalBurst.g:3211:1: ( ( rule__WithParameter__Group_2__0 )? )
            {
            // InternalBurst.g:3211:1: ( ( rule__WithParameter__Group_2__0 )? )
            // InternalBurst.g:3212:2: ( rule__WithParameter__Group_2__0 )?
            {
             before(grammarAccess.getWithParameterAccess().getGroup_2()); 
            // InternalBurst.g:3213:2: ( rule__WithParameter__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBurst.g:3213:3: rule__WithParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WithParameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWithParameterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group__2__Impl"


    // $ANTLR start "rule__WithParameter__Group_2__0"
    // InternalBurst.g:3222:1: rule__WithParameter__Group_2__0 : rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 ;
    public final void rule__WithParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3226:1: ( rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 )
            // InternalBurst.g:3227:2: rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__WithParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithParameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group_2__0"


    // $ANTLR start "rule__WithParameter__Group_2__0__Impl"
    // InternalBurst.g:3234:1: rule__WithParameter__Group_2__0__Impl : ( ( rule__WithParameter__UsageAssignment_2_0 ) ) ;
    public final void rule__WithParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3238:1: ( ( ( rule__WithParameter__UsageAssignment_2_0 ) ) )
            // InternalBurst.g:3239:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            {
            // InternalBurst.g:3239:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            // InternalBurst.g:3240:2: ( rule__WithParameter__UsageAssignment_2_0 )
            {
             before(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0()); 
            // InternalBurst.g:3241:2: ( rule__WithParameter__UsageAssignment_2_0 )
            // InternalBurst.g:3241:3: rule__WithParameter__UsageAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__UsageAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group_2__0__Impl"


    // $ANTLR start "rule__WithParameter__Group_2__1"
    // InternalBurst.g:3249:1: rule__WithParameter__Group_2__1 : rule__WithParameter__Group_2__1__Impl ;
    public final void rule__WithParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3253:1: ( rule__WithParameter__Group_2__1__Impl )
            // InternalBurst.g:3254:2: rule__WithParameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group_2__1"


    // $ANTLR start "rule__WithParameter__Group_2__1__Impl"
    // InternalBurst.g:3260:1: rule__WithParameter__Group_2__1__Impl : ( ( rule__WithParameter__RoleAssignment_2_1 ) ) ;
    public final void rule__WithParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3264:1: ( ( ( rule__WithParameter__RoleAssignment_2_1 ) ) )
            // InternalBurst.g:3265:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            {
            // InternalBurst.g:3265:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            // InternalBurst.g:3266:2: ( rule__WithParameter__RoleAssignment_2_1 )
            {
             before(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1()); 
            // InternalBurst.g:3267:2: ( rule__WithParameter__RoleAssignment_2_1 )
            // InternalBurst.g:3267:3: rule__WithParameter__RoleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__RoleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__Group_2__1__Impl"


    // $ANTLR start "rule__CallExpr__Group__0"
    // InternalBurst.g:3276:1: rule__CallExpr__Group__0 : rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1 ;
    public final void rule__CallExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3280:1: ( rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1 )
            // InternalBurst.g:3281:2: rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CallExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__0"


    // $ANTLR start "rule__CallExpr__Group__0__Impl"
    // InternalBurst.g:3288:1: rule__CallExpr__Group__0__Impl : ( ( ( rule__CallExpr__ContentAssignment_0 ) ) ( ( rule__CallExpr__ContentAssignment_0 )* ) ) ;
    public final void rule__CallExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3292:1: ( ( ( ( rule__CallExpr__ContentAssignment_0 ) ) ( ( rule__CallExpr__ContentAssignment_0 )* ) ) )
            // InternalBurst.g:3293:1: ( ( ( rule__CallExpr__ContentAssignment_0 ) ) ( ( rule__CallExpr__ContentAssignment_0 )* ) )
            {
            // InternalBurst.g:3293:1: ( ( ( rule__CallExpr__ContentAssignment_0 ) ) ( ( rule__CallExpr__ContentAssignment_0 )* ) )
            // InternalBurst.g:3294:2: ( ( rule__CallExpr__ContentAssignment_0 ) ) ( ( rule__CallExpr__ContentAssignment_0 )* )
            {
            // InternalBurst.g:3294:2: ( ( rule__CallExpr__ContentAssignment_0 ) )
            // InternalBurst.g:3295:3: ( rule__CallExpr__ContentAssignment_0 )
            {
             before(grammarAccess.getCallExprAccess().getContentAssignment_0()); 
            // InternalBurst.g:3296:3: ( rule__CallExpr__ContentAssignment_0 )
            // InternalBurst.g:3296:4: rule__CallExpr__ContentAssignment_0
            {
            pushFollow(FOLLOW_28);
            rule__CallExpr__ContentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getContentAssignment_0()); 

            }

            // InternalBurst.g:3299:2: ( ( rule__CallExpr__ContentAssignment_0 )* )
            // InternalBurst.g:3300:3: ( rule__CallExpr__ContentAssignment_0 )*
            {
             before(grammarAccess.getCallExprAccess().getContentAssignment_0()); 
            // InternalBurst.g:3301:3: ( rule__CallExpr__ContentAssignment_0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||(LA42_0>=24 && LA42_0<=25)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBurst.g:3301:4: rule__CallExpr__ContentAssignment_0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__CallExpr__ContentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getCallExprAccess().getContentAssignment_0()); 

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
    // $ANTLR end "rule__CallExpr__Group__0__Impl"


    // $ANTLR start "rule__CallExpr__Group__1"
    // InternalBurst.g:3310:1: rule__CallExpr__Group__1 : rule__CallExpr__Group__1__Impl ;
    public final void rule__CallExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3314:1: ( rule__CallExpr__Group__1__Impl )
            // InternalBurst.g:3315:2: rule__CallExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__1"


    // $ANTLR start "rule__CallExpr__Group__1__Impl"
    // InternalBurst.g:3321:1: rule__CallExpr__Group__1__Impl : ( ( rule__CallExpr__Group_1__0 )? ) ;
    public final void rule__CallExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3325:1: ( ( ( rule__CallExpr__Group_1__0 )? ) )
            // InternalBurst.g:3326:1: ( ( rule__CallExpr__Group_1__0 )? )
            {
            // InternalBurst.g:3326:1: ( ( rule__CallExpr__Group_1__0 )? )
            // InternalBurst.g:3327:2: ( rule__CallExpr__Group_1__0 )?
            {
             before(grammarAccess.getCallExprAccess().getGroup_1()); 
            // InternalBurst.g:3328:2: ( rule__CallExpr__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBurst.g:3328:3: rule__CallExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExpr__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__1__Impl"


    // $ANTLR start "rule__CallExpr__Group_1__0"
    // InternalBurst.g:3337:1: rule__CallExpr__Group_1__0 : rule__CallExpr__Group_1__0__Impl rule__CallExpr__Group_1__1 ;
    public final void rule__CallExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3341:1: ( rule__CallExpr__Group_1__0__Impl rule__CallExpr__Group_1__1 )
            // InternalBurst.g:3342:2: rule__CallExpr__Group_1__0__Impl rule__CallExpr__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__CallExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_1__0"


    // $ANTLR start "rule__CallExpr__Group_1__0__Impl"
    // InternalBurst.g:3349:1: rule__CallExpr__Group_1__0__Impl : ( ( rule__CallExpr__EqualityAssignment_1_0 ) ) ;
    public final void rule__CallExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3353:1: ( ( ( rule__CallExpr__EqualityAssignment_1_0 ) ) )
            // InternalBurst.g:3354:1: ( ( rule__CallExpr__EqualityAssignment_1_0 ) )
            {
            // InternalBurst.g:3354:1: ( ( rule__CallExpr__EqualityAssignment_1_0 ) )
            // InternalBurst.g:3355:2: ( rule__CallExpr__EqualityAssignment_1_0 )
            {
             before(grammarAccess.getCallExprAccess().getEqualityAssignment_1_0()); 
            // InternalBurst.g:3356:2: ( rule__CallExpr__EqualityAssignment_1_0 )
            // InternalBurst.g:3356:3: rule__CallExpr__EqualityAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__EqualityAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getEqualityAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_1__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_1__1"
    // InternalBurst.g:3364:1: rule__CallExpr__Group_1__1 : rule__CallExpr__Group_1__1__Impl ;
    public final void rule__CallExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3368:1: ( rule__CallExpr__Group_1__1__Impl )
            // InternalBurst.g:3369:2: rule__CallExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_1__1"


    // $ANTLR start "rule__CallExpr__Group_1__1__Impl"
    // InternalBurst.g:3375:1: rule__CallExpr__Group_1__1__Impl : ( ( ( rule__CallExpr__SourceAssignment_1_1 ) ) ( ( rule__CallExpr__SourceAssignment_1_1 )* ) ) ;
    public final void rule__CallExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3379:1: ( ( ( ( rule__CallExpr__SourceAssignment_1_1 ) ) ( ( rule__CallExpr__SourceAssignment_1_1 )* ) ) )
            // InternalBurst.g:3380:1: ( ( ( rule__CallExpr__SourceAssignment_1_1 ) ) ( ( rule__CallExpr__SourceAssignment_1_1 )* ) )
            {
            // InternalBurst.g:3380:1: ( ( ( rule__CallExpr__SourceAssignment_1_1 ) ) ( ( rule__CallExpr__SourceAssignment_1_1 )* ) )
            // InternalBurst.g:3381:2: ( ( rule__CallExpr__SourceAssignment_1_1 ) ) ( ( rule__CallExpr__SourceAssignment_1_1 )* )
            {
            // InternalBurst.g:3381:2: ( ( rule__CallExpr__SourceAssignment_1_1 ) )
            // InternalBurst.g:3382:3: ( rule__CallExpr__SourceAssignment_1_1 )
            {
             before(grammarAccess.getCallExprAccess().getSourceAssignment_1_1()); 
            // InternalBurst.g:3383:3: ( rule__CallExpr__SourceAssignment_1_1 )
            // InternalBurst.g:3383:4: rule__CallExpr__SourceAssignment_1_1
            {
            pushFollow(FOLLOW_28);
            rule__CallExpr__SourceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getSourceAssignment_1_1()); 

            }

            // InternalBurst.g:3386:2: ( ( rule__CallExpr__SourceAssignment_1_1 )* )
            // InternalBurst.g:3387:3: ( rule__CallExpr__SourceAssignment_1_1 )*
            {
             before(grammarAccess.getCallExprAccess().getSourceAssignment_1_1()); 
            // InternalBurst.g:3388:3: ( rule__CallExpr__SourceAssignment_1_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=24 && LA44_0<=25)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalBurst.g:3388:4: rule__CallExpr__SourceAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__CallExpr__SourceAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getCallExprAccess().getSourceAssignment_1_1()); 

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
    // $ANTLR end "rule__CallExpr__Group_1__1__Impl"


    // $ANTLR start "rule__SubCall__Group__0"
    // InternalBurst.g:3398:1: rule__SubCall__Group__0 : rule__SubCall__Group__0__Impl rule__SubCall__Group__1 ;
    public final void rule__SubCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3402:1: ( rule__SubCall__Group__0__Impl rule__SubCall__Group__1 )
            // InternalBurst.g:3403:2: rule__SubCall__Group__0__Impl rule__SubCall__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SubCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__0"


    // $ANTLR start "rule__SubCall__Group__0__Impl"
    // InternalBurst.g:3410:1: rule__SubCall__Group__0__Impl : ( () ) ;
    public final void rule__SubCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3414:1: ( ( () ) )
            // InternalBurst.g:3415:1: ( () )
            {
            // InternalBurst.g:3415:1: ( () )
            // InternalBurst.g:3416:2: ()
            {
             before(grammarAccess.getSubCallAccess().getSubCallAction_0()); 
            // InternalBurst.g:3417:2: ()
            // InternalBurst.g:3417:3: 
            {
            }

             after(grammarAccess.getSubCallAccess().getSubCallAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__0__Impl"


    // $ANTLR start "rule__SubCall__Group__1"
    // InternalBurst.g:3425:1: rule__SubCall__Group__1 : rule__SubCall__Group__1__Impl rule__SubCall__Group__2 ;
    public final void rule__SubCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3429:1: ( rule__SubCall__Group__1__Impl rule__SubCall__Group__2 )
            // InternalBurst.g:3430:2: rule__SubCall__Group__1__Impl rule__SubCall__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SubCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__1"


    // $ANTLR start "rule__SubCall__Group__1__Impl"
    // InternalBurst.g:3437:1: rule__SubCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SubCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3441:1: ( ( '(' ) )
            // InternalBurst.g:3442:1: ( '(' )
            {
            // InternalBurst.g:3442:1: ( '(' )
            // InternalBurst.g:3443:2: '('
            {
             before(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__1__Impl"


    // $ANTLR start "rule__SubCall__Group__2"
    // InternalBurst.g:3452:1: rule__SubCall__Group__2 : rule__SubCall__Group__2__Impl rule__SubCall__Group__3 ;
    public final void rule__SubCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3456:1: ( rule__SubCall__Group__2__Impl rule__SubCall__Group__3 )
            // InternalBurst.g:3457:2: rule__SubCall__Group__2__Impl rule__SubCall__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SubCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__2"


    // $ANTLR start "rule__SubCall__Group__2__Impl"
    // InternalBurst.g:3464:1: rule__SubCall__Group__2__Impl : ( ( rule__SubCall__NameAssignment_2 ) ) ;
    public final void rule__SubCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3468:1: ( ( ( rule__SubCall__NameAssignment_2 ) ) )
            // InternalBurst.g:3469:1: ( ( rule__SubCall__NameAssignment_2 ) )
            {
            // InternalBurst.g:3469:1: ( ( rule__SubCall__NameAssignment_2 ) )
            // InternalBurst.g:3470:2: ( rule__SubCall__NameAssignment_2 )
            {
             before(grammarAccess.getSubCallAccess().getNameAssignment_2()); 
            // InternalBurst.g:3471:2: ( rule__SubCall__NameAssignment_2 )
            // InternalBurst.g:3471:3: rule__SubCall__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubCallAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__2__Impl"


    // $ANTLR start "rule__SubCall__Group__3"
    // InternalBurst.g:3479:1: rule__SubCall__Group__3 : rule__SubCall__Group__3__Impl ;
    public final void rule__SubCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3483:1: ( rule__SubCall__Group__3__Impl )
            // InternalBurst.g:3484:2: rule__SubCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__3"


    // $ANTLR start "rule__SubCall__Group__3__Impl"
    // InternalBurst.g:3490:1: rule__SubCall__Group__3__Impl : ( ')' ) ;
    public final void rule__SubCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3494:1: ( ( ')' ) )
            // InternalBurst.g:3495:1: ( ')' )
            {
            // InternalBurst.g:3495:1: ( ')' )
            // InternalBurst.g:3496:2: ')'
            {
             before(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__3__Impl"


    // $ANTLR start "rule__Access__Group__0"
    // InternalBurst.g:3506:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3510:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalBurst.g:3511:2: rule__Access__Group__0__Impl rule__Access__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__0"


    // $ANTLR start "rule__Access__Group__0__Impl"
    // InternalBurst.g:3518:1: rule__Access__Group__0__Impl : ( () ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3522:1: ( ( () ) )
            // InternalBurst.g:3523:1: ( () )
            {
            // InternalBurst.g:3523:1: ( () )
            // InternalBurst.g:3524:2: ()
            {
             before(grammarAccess.getAccessAccess().getAccessAction_0()); 
            // InternalBurst.g:3525:2: ()
            // InternalBurst.g:3525:3: 
            {
            }

             after(grammarAccess.getAccessAccess().getAccessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__0__Impl"


    // $ANTLR start "rule__Access__Group__1"
    // InternalBurst.g:3533:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3537:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalBurst.g:3538:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Access__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__1"


    // $ANTLR start "rule__Access__Group__1__Impl"
    // InternalBurst.g:3545:1: rule__Access__Group__1__Impl : ( ( rule__Access__NameAssignment_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3549:1: ( ( ( rule__Access__NameAssignment_1 ) ) )
            // InternalBurst.g:3550:1: ( ( rule__Access__NameAssignment_1 ) )
            {
            // InternalBurst.g:3550:1: ( ( rule__Access__NameAssignment_1 ) )
            // InternalBurst.g:3551:2: ( rule__Access__NameAssignment_1 )
            {
             before(grammarAccess.getAccessAccess().getNameAssignment_1()); 
            // InternalBurst.g:3552:2: ( rule__Access__NameAssignment_1 )
            // InternalBurst.g:3552:3: rule__Access__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__1__Impl"


    // $ANTLR start "rule__Access__Group__2"
    // InternalBurst.g:3560:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3564:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalBurst.g:3565:2: rule__Access__Group__2__Impl rule__Access__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Access__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__2"


    // $ANTLR start "rule__Access__Group__2__Impl"
    // InternalBurst.g:3572:1: rule__Access__Group__2__Impl : ( ( rule__Access__Group_2__0 )* ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3576:1: ( ( ( rule__Access__Group_2__0 )* ) )
            // InternalBurst.g:3577:1: ( ( rule__Access__Group_2__0 )* )
            {
            // InternalBurst.g:3577:1: ( ( rule__Access__Group_2__0 )* )
            // InternalBurst.g:3578:2: ( rule__Access__Group_2__0 )*
            {
             before(grammarAccess.getAccessAccess().getGroup_2()); 
            // InternalBurst.g:3579:2: ( rule__Access__Group_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBurst.g:3579:3: rule__Access__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Access__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getAccessAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__2__Impl"


    // $ANTLR start "rule__Access__Group__3"
    // InternalBurst.g:3587:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3591:1: ( rule__Access__Group__3__Impl )
            // InternalBurst.g:3592:2: rule__Access__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__3"


    // $ANTLR start "rule__Access__Group__3__Impl"
    // InternalBurst.g:3598:1: rule__Access__Group__3__Impl : ( ( rule__Access__Group_3__0 )? ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3602:1: ( ( ( rule__Access__Group_3__0 )? ) )
            // InternalBurst.g:3603:1: ( ( rule__Access__Group_3__0 )? )
            {
            // InternalBurst.g:3603:1: ( ( rule__Access__Group_3__0 )? )
            // InternalBurst.g:3604:2: ( rule__Access__Group_3__0 )?
            {
             before(grammarAccess.getAccessAccess().getGroup_3()); 
            // InternalBurst.g:3605:2: ( rule__Access__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBurst.g:3605:3: rule__Access__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Access__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccessAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group__3__Impl"


    // $ANTLR start "rule__Access__Group_2__0"
    // InternalBurst.g:3614:1: rule__Access__Group_2__0 : rule__Access__Group_2__0__Impl rule__Access__Group_2__1 ;
    public final void rule__Access__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3618:1: ( rule__Access__Group_2__0__Impl rule__Access__Group_2__1 )
            // InternalBurst.g:3619:2: rule__Access__Group_2__0__Impl rule__Access__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__0"


    // $ANTLR start "rule__Access__Group_2__0__Impl"
    // InternalBurst.g:3626:1: rule__Access__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Access__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3630:1: ( ( '.' ) )
            // InternalBurst.g:3631:1: ( '.' )
            {
            // InternalBurst.g:3631:1: ( '.' )
            // InternalBurst.g:3632:2: '.'
            {
             before(grammarAccess.getAccessAccess().getFullStopKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__0__Impl"


    // $ANTLR start "rule__Access__Group_2__1"
    // InternalBurst.g:3641:1: rule__Access__Group_2__1 : rule__Access__Group_2__1__Impl ;
    public final void rule__Access__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3645:1: ( rule__Access__Group_2__1__Impl )
            // InternalBurst.g:3646:2: rule__Access__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__1"


    // $ANTLR start "rule__Access__Group_2__1__Impl"
    // InternalBurst.g:3652:1: rule__Access__Group_2__1__Impl : ( ( rule__Access__MembersAssignment_2_1 ) ) ;
    public final void rule__Access__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3656:1: ( ( ( rule__Access__MembersAssignment_2_1 ) ) )
            // InternalBurst.g:3657:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            {
            // InternalBurst.g:3657:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            // InternalBurst.g:3658:2: ( rule__Access__MembersAssignment_2_1 )
            {
             before(grammarAccess.getAccessAccess().getMembersAssignment_2_1()); 
            // InternalBurst.g:3659:2: ( rule__Access__MembersAssignment_2_1 )
            // InternalBurst.g:3659:3: rule__Access__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getMembersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__1__Impl"


    // $ANTLR start "rule__Access__Group_3__0"
    // InternalBurst.g:3668:1: rule__Access__Group_3__0 : rule__Access__Group_3__0__Impl rule__Access__Group_3__1 ;
    public final void rule__Access__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3672:1: ( rule__Access__Group_3__0__Impl rule__Access__Group_3__1 )
            // InternalBurst.g:3673:2: rule__Access__Group_3__0__Impl rule__Access__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_3__0"


    // $ANTLR start "rule__Access__Group_3__0__Impl"
    // InternalBurst.g:3680:1: rule__Access__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Access__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3684:1: ( ( ':' ) )
            // InternalBurst.g:3685:1: ( ':' )
            {
            // InternalBurst.g:3685:1: ( ':' )
            // InternalBurst.g:3686:2: ':'
            {
             before(grammarAccess.getAccessAccess().getColonKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_3__0__Impl"


    // $ANTLR start "rule__Access__Group_3__1"
    // InternalBurst.g:3695:1: rule__Access__Group_3__1 : rule__Access__Group_3__1__Impl ;
    public final void rule__Access__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3699:1: ( rule__Access__Group_3__1__Impl )
            // InternalBurst.g:3700:2: rule__Access__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_3__1"


    // $ANTLR start "rule__Access__Group_3__1__Impl"
    // InternalBurst.g:3706:1: rule__Access__Group_3__1__Impl : ( ( rule__Access__RoleAssignment_3_1 ) ) ;
    public final void rule__Access__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3710:1: ( ( ( rule__Access__RoleAssignment_3_1 ) ) )
            // InternalBurst.g:3711:1: ( ( rule__Access__RoleAssignment_3_1 ) )
            {
            // InternalBurst.g:3711:1: ( ( rule__Access__RoleAssignment_3_1 ) )
            // InternalBurst.g:3712:2: ( rule__Access__RoleAssignment_3_1 )
            {
             before(grammarAccess.getAccessAccess().getRoleAssignment_3_1()); 
            // InternalBurst.g:3713:2: ( rule__Access__RoleAssignment_3_1 )
            // InternalBurst.g:3713:3: rule__Access__RoleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__RoleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getRoleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:3722:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3726:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:3727:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBurst.g:3734:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3738:1: ( ( RULE_ID ) )
            // InternalBurst.g:3739:1: ( RULE_ID )
            {
            // InternalBurst.g:3739:1: ( RULE_ID )
            // InternalBurst.g:3740:2: RULE_ID
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
    // InternalBurst.g:3749:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3753:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:3754:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:3760:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3764:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:3765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:3765:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:3766:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:3767:2: ( rule__QualifiedName__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==27) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:3767:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalBurst.g:3776:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3780:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:3781:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:3788:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3792:1: ( ( '.' ) )
            // InternalBurst.g:3793:1: ( '.' )
            {
            // InternalBurst.g:3793:1: ( '.' )
            // InternalBurst.g:3794:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBurst.g:3803:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3807:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:3808:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:3814:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3818:1: ( ( RULE_ID ) )
            // InternalBurst.g:3819:1: ( RULE_ID )
            {
            // InternalBurst.g:3819:1: ( RULE_ID )
            // InternalBurst.g:3820:2: RULE_ID
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


    // $ANTLR start "rule__File__ImportsAssignment_2_0"
    // InternalBurst.g:3830:1: rule__File__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__File__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3834:1: ( ( ruleImport ) )
            // InternalBurst.g:3835:2: ( ruleImport )
            {
            // InternalBurst.g:3835:2: ( ruleImport )
            // InternalBurst.g:3836:3: ruleImport
            {
             before(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ImportsAssignment_2_0"


    // $ANTLR start "rule__File__ElementsAssignment_3_0"
    // InternalBurst.g:3845:1: rule__File__ElementsAssignment_3_0 : ( ruleFileElement ) ;
    public final void rule__File__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3849:1: ( ( ruleFileElement ) )
            // InternalBurst.g:3850:2: ( ruleFileElement )
            {
            // InternalBurst.g:3850:2: ( ruleFileElement )
            // InternalBurst.g:3851:3: ruleFileElement
            {
             before(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFileElement();

            state._fsp--;

             after(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ElementsAssignment_3_0"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // InternalBurst.g:3860:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3864:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:3865:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:3865:2: ( ruleQualifiedName )
            // InternalBurst.g:3866:3: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__Roles__NameAssignment_2"
    // InternalBurst.g:3875:1: rule__Roles__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Roles__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3879:1: ( ( RULE_ID ) )
            // InternalBurst.g:3880:2: ( RULE_ID )
            {
            // InternalBurst.g:3880:2: ( RULE_ID )
            // InternalBurst.g:3881:3: RULE_ID
            {
             before(grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Roles__NameAssignment_2"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalBurst.g:3890:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3894:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:3895:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:3895:2: ( ruleQualifiedName )
            // InternalBurst.g:3896:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementsAssignment_6_0"
    // InternalBurst.g:3905:1: rule__Package__ElementsAssignment_6_0 : ( rulePackageElement ) ;
    public final void rule__Package__ElementsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3909:1: ( ( rulePackageElement ) )
            // InternalBurst.g:3910:2: ( rulePackageElement )
            {
            // InternalBurst.g:3910:2: ( rulePackageElement )
            // InternalBurst.g:3911:3: rulePackageElement
            {
             before(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_6_0"


    // $ANTLR start "rule__Concern__NameAssignment_2"
    // InternalBurst.g:3920:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3924:1: ( ( RULE_ID ) )
            // InternalBurst.g:3925:2: ( RULE_ID )
            {
            // InternalBurst.g:3925:2: ( RULE_ID )
            // InternalBurst.g:3926:3: RULE_ID
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


    // $ANTLR start "rule__Concern__ElementsAssignment_3_3_0"
    // InternalBurst.g:3935:1: rule__Concern__ElementsAssignment_3_3_0 : ( ruleConcernElement ) ;
    public final void rule__Concern__ElementsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3939:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:3940:2: ( ruleConcernElement )
            {
            // InternalBurst.g:3940:2: ( ruleConcernElement )
            // InternalBurst.g:3941:3: ruleConcernElement
            {
             before(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__ElementsAssignment_3_3_0"


    // $ANTLR start "rule__Template__NameAssignment_2"
    // InternalBurst.g:3950:1: rule__Template__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3954:1: ( ( RULE_ID ) )
            // InternalBurst.g:3955:2: ( RULE_ID )
            {
            // InternalBurst.g:3955:2: ( RULE_ID )
            // InternalBurst.g:3956:3: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__NameAssignment_2"


    // $ANTLR start "rule__Template__TemplateArgumentsAssignment_4"
    // InternalBurst.g:3965:1: rule__Template__TemplateArgumentsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3969:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:3970:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:3970:2: ( ( RULE_ID ) )
            // InternalBurst.g:3971:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 
            // InternalBurst.g:3972:3: ( RULE_ID )
            // InternalBurst.g:3973:4: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__TemplateArgumentsAssignment_4"


    // $ANTLR start "rule__Template__TemplateArgumentsAssignment_5_1"
    // InternalBurst.g:3984:1: rule__Template__TemplateArgumentsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3988:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:3989:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:3989:2: ( ( RULE_ID ) )
            // InternalBurst.g:3990:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 
            // InternalBurst.g:3991:3: ( RULE_ID )
            // InternalBurst.g:3992:4: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__TemplateArgumentsAssignment_5_1"


    // $ANTLR start "rule__Template__ElementsAssignment_7_3_0"
    // InternalBurst.g:4003:1: rule__Template__ElementsAssignment_7_3_0 : ( ruleConcernElement ) ;
    public final void rule__Template__ElementsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4007:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:4008:2: ( ruleConcernElement )
            {
            // InternalBurst.g:4008:2: ( ruleConcernElement )
            // InternalBurst.g:4009:3: ruleConcernElement
            {
             before(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__ElementsAssignment_7_3_0"


    // $ANTLR start "rule__Member__HeritFromAssignment_1"
    // InternalBurst.g:4018:1: rule__Member__HeritFromAssignment_1 : ( ( 'is' ) ) ;
    public final void rule__Member__HeritFromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4022:1: ( ( ( 'is' ) ) )
            // InternalBurst.g:4023:2: ( ( 'is' ) )
            {
            // InternalBurst.g:4023:2: ( ( 'is' ) )
            // InternalBurst.g:4024:3: ( 'is' )
            {
             before(grammarAccess.getMemberAccess().getHeritFromIsKeyword_1_0()); 
            // InternalBurst.g:4025:3: ( 'is' )
            // InternalBurst.g:4026:4: 'is'
            {
             before(grammarAccess.getMemberAccess().getHeritFromIsKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getHeritFromIsKeyword_1_0()); 

            }

             after(grammarAccess.getMemberAccess().getHeritFromIsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__HeritFromAssignment_1"


    // $ANTLR start "rule__Member__ConcernAssignment_2"
    // InternalBurst.g:4037:1: rule__Member__ConcernAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4041:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4042:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4042:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4043:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_2_0()); 
            // InternalBurst.g:4044:3: ( ruleQualifiedName )
            // InternalBurst.g:4045:4: ruleQualifiedName
            {
             before(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getConcernConcernCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__ConcernAssignment_2"


    // $ANTLR start "rule__Member__NameAssignment_3"
    // InternalBurst.g:4056:1: rule__Member__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4060:1: ( ( RULE_ID ) )
            // InternalBurst.g:4061:2: ( RULE_ID )
            {
            // InternalBurst.g:4061:2: ( RULE_ID )
            // InternalBurst.g:4062:3: RULE_ID
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


    // $ANTLR start "rule__RuleIntersect__NameAssignment_1"
    // InternalBurst.g:4071:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4075:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:4076:2: ( ( 'when' ) )
            {
            // InternalBurst.g:4076:2: ( ( 'when' ) )
            // InternalBurst.g:4077:3: ( 'when' )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:4078:3: ( 'when' )
            // InternalBurst.g:4079:4: 'when'
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_3"
    // InternalBurst.g:4090:1: rule__RuleIntersect__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4094:1: ( ( ruleParameter ) )
            // InternalBurst.g:4095:2: ( ruleParameter )
            {
            // InternalBurst.g:4095:2: ( ruleParameter )
            // InternalBurst.g:4096:3: ruleParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_3"


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_4_3"
    // InternalBurst.g:4105:1: rule__RuleIntersect__ParamsAssignment_4_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4109:1: ( ( ruleParameter ) )
            // InternalBurst.g:4110:2: ( ruleParameter )
            {
            // InternalBurst.g:4110:2: ( ruleParameter )
            // InternalBurst.g:4111:3: ruleParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_4_3"


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_5_2"
    // InternalBurst.g:4120:1: rule__RuleIntersect__ParamsAssignment_5_2 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4124:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:4125:2: ( ruleWithParameter )
            {
            // InternalBurst.g:4125:2: ( ruleWithParameter )
            // InternalBurst.g:4126:3: ruleWithParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_5_2"


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_5_3_3"
    // InternalBurst.g:4135:1: rule__RuleIntersect__ParamsAssignment_5_3_3 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_5_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4139:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:4140:2: ( ruleWithParameter )
            {
            // InternalBurst.g:4140:2: ( ruleWithParameter )
            // InternalBurst.g:4141:3: ruleWithParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_5_3_3"


    // $ANTLR start "rule__RuleIntersect__LinesAssignment_8_0"
    // InternalBurst.g:4150:1: rule__RuleIntersect__LinesAssignment_8_0 : ( ruleLine ) ;
    public final void rule__RuleIntersect__LinesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4154:1: ( ( ruleLine ) )
            // InternalBurst.g:4155:2: ( ruleLine )
            {
            // InternalBurst.g:4155:2: ( ruleLine )
            // InternalBurst.g:4156:3: ruleLine
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__LinesAssignment_8_0"


    // $ANTLR start "rule__Locale__TypeAssignment_2"
    // InternalBurst.g:4165:1: rule__Locale__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Locale__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4169:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4170:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4170:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4171:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 
            // InternalBurst.g:4172:3: ( ruleQualifiedName )
            // InternalBurst.g:4173:4: ruleQualifiedName
            {
             before(grammarAccess.getLocaleAccess().getTypeConcernQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLocaleAccess().getTypeConcernQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__TypeAssignment_2"


    // $ANTLR start "rule__Locale__NameAssignment_3"
    // InternalBurst.g:4184:1: rule__Locale__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Locale__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4188:1: ( ( RULE_ID ) )
            // InternalBurst.g:4189:2: ( RULE_ID )
            {
            // InternalBurst.g:4189:2: ( RULE_ID )
            // InternalBurst.g:4190:3: RULE_ID
            {
             before(grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__NameAssignment_3"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // InternalBurst.g:4199:1: rule__Parameter__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4203:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4204:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4204:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4205:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0()); 
            // InternalBurst.g:4206:3: ( ruleQualifiedName )
            // InternalBurst.g:4207:4: ruleQualifiedName
            {
             before(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalBurst.g:4218:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4222:1: ( ( RULE_ID ) )
            // InternalBurst.g:4223:2: ( RULE_ID )
            {
            // InternalBurst.g:4223:2: ( RULE_ID )
            // InternalBurst.g:4224:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__UsageAssignment_3_0"
    // InternalBurst.g:4233:1: rule__Parameter__UsageAssignment_3_0 : ( ( ':' ) ) ;
    public final void rule__Parameter__UsageAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4237:1: ( ( ( ':' ) ) )
            // InternalBurst.g:4238:2: ( ( ':' ) )
            {
            // InternalBurst.g:4238:2: ( ( ':' ) )
            // InternalBurst.g:4239:3: ( ':' )
            {
             before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            // InternalBurst.g:4240:3: ( ':' )
            // InternalBurst.g:4241:4: ':'
            {
             before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 

            }

             after(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__UsageAssignment_3_0"


    // $ANTLR start "rule__Parameter__RoleAssignment_3_1"
    // InternalBurst.g:4252:1: rule__Parameter__RoleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__RoleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4256:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4257:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4257:2: ( ( RULE_ID ) )
            // InternalBurst.g:4258:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0()); 
            // InternalBurst.g:4259:3: ( RULE_ID )
            // InternalBurst.g:4260:4: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__RoleAssignment_3_1"


    // $ANTLR start "rule__WithParameter__NameAssignment_1"
    // InternalBurst.g:4271:1: rule__WithParameter__NameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WithParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4275:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4276:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4276:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4277:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWithParameterAccess().getNameConcernCrossReference_1_0()); 
            // InternalBurst.g:4278:3: ( ruleQualifiedName )
            // InternalBurst.g:4279:4: ruleQualifiedName
            {
             before(grammarAccess.getWithParameterAccess().getNameConcernQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWithParameterAccess().getNameConcernQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getWithParameterAccess().getNameConcernCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__NameAssignment_1"


    // $ANTLR start "rule__WithParameter__UsageAssignment_2_0"
    // InternalBurst.g:4290:1: rule__WithParameter__UsageAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__WithParameter__UsageAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4294:1: ( ( ( ':' ) ) )
            // InternalBurst.g:4295:2: ( ( ':' ) )
            {
            // InternalBurst.g:4295:2: ( ( ':' ) )
            // InternalBurst.g:4296:3: ( ':' )
            {
             before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            // InternalBurst.g:4297:3: ( ':' )
            // InternalBurst.g:4298:4: ':'
            {
             before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 

            }

             after(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__UsageAssignment_2_0"


    // $ANTLR start "rule__WithParameter__RoleAssignment_2_1"
    // InternalBurst.g:4309:1: rule__WithParameter__RoleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WithParameter__RoleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4313:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4314:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4314:2: ( ( RULE_ID ) )
            // InternalBurst.g:4315:3: ( RULE_ID )
            {
             before(grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0()); 
            // InternalBurst.g:4316:3: ( RULE_ID )
            // InternalBurst.g:4317:4: RULE_ID
            {
             before(grammarAccess.getWithParameterAccess().getRoleRoleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWithParameterAccess().getRoleRoleIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithParameter__RoleAssignment_2_1"


    // $ANTLR start "rule__CallExpr__ContentAssignment_0"
    // InternalBurst.g:4328:1: rule__CallExpr__ContentAssignment_0 : ( ruleCall ) ;
    public final void rule__CallExpr__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4332:1: ( ( ruleCall ) )
            // InternalBurst.g:4333:2: ( ruleCall )
            {
            // InternalBurst.g:4333:2: ( ruleCall )
            // InternalBurst.g:4334:3: ruleCall
            {
             before(grammarAccess.getCallExprAccess().getContentCallParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getContentCallParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__ContentAssignment_0"


    // $ANTLR start "rule__CallExpr__EqualityAssignment_1_0"
    // InternalBurst.g:4343:1: rule__CallExpr__EqualityAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__CallExpr__EqualityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4347:1: ( ( ( '=' ) ) )
            // InternalBurst.g:4348:2: ( ( '=' ) )
            {
            // InternalBurst.g:4348:2: ( ( '=' ) )
            // InternalBurst.g:4349:3: ( '=' )
            {
             before(grammarAccess.getCallExprAccess().getEqualityEqualsSignKeyword_1_0_0()); 
            // InternalBurst.g:4350:3: ( '=' )
            // InternalBurst.g:4351:4: '='
            {
             before(grammarAccess.getCallExprAccess().getEqualityEqualsSignKeyword_1_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getEqualityEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getCallExprAccess().getEqualityEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__EqualityAssignment_1_0"


    // $ANTLR start "rule__CallExpr__SourceAssignment_1_1"
    // InternalBurst.g:4362:1: rule__CallExpr__SourceAssignment_1_1 : ( ruleCall ) ;
    public final void rule__CallExpr__SourceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4366:1: ( ( ruleCall ) )
            // InternalBurst.g:4367:2: ( ruleCall )
            {
            // InternalBurst.g:4367:2: ( ruleCall )
            // InternalBurst.g:4368:3: ruleCall
            {
             before(grammarAccess.getCallExprAccess().getSourceCallParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getSourceCallParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__SourceAssignment_1_1"


    // $ANTLR start "rule__SubCall__NameAssignment_2"
    // InternalBurst.g:4377:1: rule__SubCall__NameAssignment_2 : ( ruleCallExpr ) ;
    public final void rule__SubCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4381:1: ( ( ruleCallExpr ) )
            // InternalBurst.g:4382:2: ( ruleCallExpr )
            {
            // InternalBurst.g:4382:2: ( ruleCallExpr )
            // InternalBurst.g:4383:3: ruleCallExpr
            {
             before(grammarAccess.getSubCallAccess().getNameCallExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCallExpr();

            state._fsp--;

             after(grammarAccess.getSubCallAccess().getNameCallExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__NameAssignment_2"


    // $ANTLR start "rule__Access__NameAssignment_1"
    // InternalBurst.g:4392:1: rule__Access__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4396:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4397:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4397:2: ( ( RULE_ID ) )
            // InternalBurst.g:4398:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 
            // InternalBurst.g:4399:3: ( RULE_ID )
            // InternalBurst.g:4400:4: RULE_ID
            {
             before(grammarAccess.getAccessAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__NameAssignment_1"


    // $ANTLR start "rule__Access__MembersAssignment_2_1"
    // InternalBurst.g:4411:1: rule__Access__MembersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4415:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4416:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4416:2: ( ( RULE_ID ) )
            // InternalBurst.g:4417:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0()); 
            // InternalBurst.g:4418:3: ( RULE_ID )
            // InternalBurst.g:4419:4: RULE_ID
            {
             before(grammarAccess.getAccessAccess().getMembersMemberIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getMembersMemberIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__MembersAssignment_2_1"


    // $ANTLR start "rule__Access__RoleAssignment_3_1"
    // InternalBurst.g:4430:1: rule__Access__RoleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__RoleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4434:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4435:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4435:2: ( ( RULE_ID ) )
            // InternalBurst.g:4436:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getRoleRoleCrossReference_3_1_0()); 
            // InternalBurst.g:4437:3: ( RULE_ID )
            // InternalBurst.g:4438:4: RULE_ID
            {
             before(grammarAccess.getAccessAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAccessAccess().getRoleRoleCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__RoleAssignment_3_1"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\36\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\14\uffff\1\2\3\3\11\uffff\1\3",
            "\1\1\14\uffff\1\2\3\3\11\uffff\1\3",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1437:2: ( rule__Concern__Group_3__0 )?";
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1849:2: ( rule__Template__Group_7__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000401C0010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040180002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000601C0030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060180022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040180000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000823010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000003040030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000003000022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});

}