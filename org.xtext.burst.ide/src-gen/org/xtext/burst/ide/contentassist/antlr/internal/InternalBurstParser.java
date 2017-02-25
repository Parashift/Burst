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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'1'", "'0'", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "'>'", "'with'", "'new'", "':'", "'.'", "'('", "')'", "'as'", "'is'", "'when'", "'='"
    };
    public static final int RULE_ENDLINE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalBurst.g:329:1: ( ruleParameter EOF )
            // InternalBurst.g:330:1: ruleParameter EOF
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
    // InternalBurst.g:337:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:341:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalBurst.g:342:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalBurst.g:342:2: ( ( rule__Parameter__Group__0 ) )
            // InternalBurst.g:343:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalBurst.g:344:3: ( rule__Parameter__Group__0 )
            // InternalBurst.g:344:4: rule__Parameter__Group__0
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
    // InternalBurst.g:353:1: entryRuleWithParameter : ruleWithParameter EOF ;
    public final void entryRuleWithParameter() throws RecognitionException {
        try {
            // InternalBurst.g:354:1: ( ruleWithParameter EOF )
            // InternalBurst.g:355:1: ruleWithParameter EOF
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
    // InternalBurst.g:362:1: ruleWithParameter : ( ( rule__WithParameter__Group__0 ) ) ;
    public final void ruleWithParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:366:2: ( ( ( rule__WithParameter__Group__0 ) ) )
            // InternalBurst.g:367:2: ( ( rule__WithParameter__Group__0 ) )
            {
            // InternalBurst.g:367:2: ( ( rule__WithParameter__Group__0 ) )
            // InternalBurst.g:368:3: ( rule__WithParameter__Group__0 )
            {
             before(grammarAccess.getWithParameterAccess().getGroup()); 
            // InternalBurst.g:369:3: ( rule__WithParameter__Group__0 )
            // InternalBurst.g:369:4: rule__WithParameter__Group__0
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
    // InternalBurst.g:378:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:379:1: ( ruleLine EOF )
            // InternalBurst.g:380:1: ruleLine EOF
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
    // InternalBurst.g:387:1: ruleLine : ( ( rule__Line__Alternatives ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:391:2: ( ( ( rule__Line__Alternatives ) ) )
            // InternalBurst.g:392:2: ( ( rule__Line__Alternatives ) )
            {
            // InternalBurst.g:392:2: ( ( rule__Line__Alternatives ) )
            // InternalBurst.g:393:3: ( rule__Line__Alternatives )
            {
             before(grammarAccess.getLineAccess().getAlternatives()); 
            // InternalBurst.g:394:3: ( rule__Line__Alternatives )
            // InternalBurst.g:394:4: rule__Line__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Line__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleContextManagement"
    // InternalBurst.g:403:1: entryRuleContextManagement : ruleContextManagement EOF ;
    public final void entryRuleContextManagement() throws RecognitionException {
        try {
            // InternalBurst.g:404:1: ( ruleContextManagement EOF )
            // InternalBurst.g:405:1: ruleContextManagement EOF
            {
             before(grammarAccess.getContextManagementRule()); 
            pushFollow(FOLLOW_1);
            ruleContextManagement();

            state._fsp--;

             after(grammarAccess.getContextManagementRule()); 
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
    // $ANTLR end "entryRuleContextManagement"


    // $ANTLR start "ruleContextManagement"
    // InternalBurst.g:412:1: ruleContextManagement : ( ( rule__ContextManagement__Group__0 ) ) ;
    public final void ruleContextManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:416:2: ( ( ( rule__ContextManagement__Group__0 ) ) )
            // InternalBurst.g:417:2: ( ( rule__ContextManagement__Group__0 ) )
            {
            // InternalBurst.g:417:2: ( ( rule__ContextManagement__Group__0 ) )
            // InternalBurst.g:418:3: ( rule__ContextManagement__Group__0 )
            {
             before(grammarAccess.getContextManagementAccess().getGroup()); 
            // InternalBurst.g:419:3: ( rule__ContextManagement__Group__0 )
            // InternalBurst.g:419:4: rule__ContextManagement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextManagementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextManagement"


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
    // InternalBurst.g:437:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalBurst.g:442:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalBurst.g:442:2: ( ( rule__Call__Group__0 ) )
            // InternalBurst.g:443:3: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // InternalBurst.g:444:3: ( rule__Call__Group__0 )
            // InternalBurst.g:444:4: rule__Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCallElement"
    // InternalBurst.g:453:1: entryRuleCallElement : ruleCallElement EOF ;
    public final void entryRuleCallElement() throws RecognitionException {
        try {
            // InternalBurst.g:454:1: ( ruleCallElement EOF )
            // InternalBurst.g:455:1: ruleCallElement EOF
            {
             before(grammarAccess.getCallElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCallElement();

            state._fsp--;

             after(grammarAccess.getCallElementRule()); 
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
    // $ANTLR end "entryRuleCallElement"


    // $ANTLR start "ruleCallElement"
    // InternalBurst.g:462:1: ruleCallElement : ( ( rule__CallElement__Alternatives ) ) ;
    public final void ruleCallElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:466:2: ( ( ( rule__CallElement__Alternatives ) ) )
            // InternalBurst.g:467:2: ( ( rule__CallElement__Alternatives ) )
            {
            // InternalBurst.g:467:2: ( ( rule__CallElement__Alternatives ) )
            // InternalBurst.g:468:3: ( rule__CallElement__Alternatives )
            {
             before(grammarAccess.getCallElementAccess().getAlternatives()); 
            // InternalBurst.g:469:3: ( rule__CallElement__Alternatives )
            // InternalBurst.g:469:4: rule__CallElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CallElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallElement"


    // $ANTLR start "entryRuleLocale"
    // InternalBurst.g:478:1: entryRuleLocale : ruleLocale EOF ;
    public final void entryRuleLocale() throws RecognitionException {
        try {
            // InternalBurst.g:479:1: ( ruleLocale EOF )
            // InternalBurst.g:480:1: ruleLocale EOF
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
    // InternalBurst.g:487:1: ruleLocale : ( ( rule__Locale__Group__0 ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:491:2: ( ( ( rule__Locale__Group__0 ) ) )
            // InternalBurst.g:492:2: ( ( rule__Locale__Group__0 ) )
            {
            // InternalBurst.g:492:2: ( ( rule__Locale__Group__0 ) )
            // InternalBurst.g:493:3: ( rule__Locale__Group__0 )
            {
             before(grammarAccess.getLocaleAccess().getGroup()); 
            // InternalBurst.g:494:3: ( rule__Locale__Group__0 )
            // InternalBurst.g:494:4: rule__Locale__Group__0
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


    // $ANTLR start "entryRuleSubCall"
    // InternalBurst.g:528:1: entryRuleSubCall : ruleSubCall EOF ;
    public final void entryRuleSubCall() throws RecognitionException {
        try {
            // InternalBurst.g:529:1: ( ruleSubCall EOF )
            // InternalBurst.g:530:1: ruleSubCall EOF
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
    // InternalBurst.g:537:1: ruleSubCall : ( ( rule__SubCall__Group__0 ) ) ;
    public final void ruleSubCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:541:2: ( ( ( rule__SubCall__Group__0 ) ) )
            // InternalBurst.g:542:2: ( ( rule__SubCall__Group__0 ) )
            {
            // InternalBurst.g:542:2: ( ( rule__SubCall__Group__0 ) )
            // InternalBurst.g:543:3: ( rule__SubCall__Group__0 )
            {
             before(grammarAccess.getSubCallAccess().getGroup()); 
            // InternalBurst.g:544:3: ( rule__SubCall__Group__0 )
            // InternalBurst.g:544:4: rule__SubCall__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:553:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:554:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:555:1: ruleQualifiedName EOF
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
    // InternalBurst.g:562:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:566:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:568:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalBurst.g:569:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:569:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleconcernManagment"
    // InternalBurst.g:578:1: ruleconcernManagment : ( ( rule__ConcernManagment__Alternatives ) ) ;
    public final void ruleconcernManagment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:582:1: ( ( ( rule__ConcernManagment__Alternatives ) ) )
            // InternalBurst.g:583:2: ( ( rule__ConcernManagment__Alternatives ) )
            {
            // InternalBurst.g:583:2: ( ( rule__ConcernManagment__Alternatives ) )
            // InternalBurst.g:584:3: ( rule__ConcernManagment__Alternatives )
            {
             before(grammarAccess.getConcernManagmentAccess().getAlternatives()); 
            // InternalBurst.g:585:3: ( rule__ConcernManagment__Alternatives )
            // InternalBurst.g:585:4: rule__ConcernManagment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConcernManagment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConcernManagmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconcernManagment"


    // $ANTLR start "rule__FileElement__Alternatives"
    // InternalBurst.g:593:1: rule__FileElement__Alternatives : ( ( ruleRoles ) | ( rulePackage ) );
    public final void rule__FileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:597:1: ( ( ruleRoles ) | ( rulePackage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBurst.g:598:2: ( ruleRoles )
                    {
                    // InternalBurst.g:598:2: ( ruleRoles )
                    // InternalBurst.g:599:3: ruleRoles
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
                    // InternalBurst.g:604:2: ( rulePackage )
                    {
                    // InternalBurst.g:604:2: ( rulePackage )
                    // InternalBurst.g:605:3: rulePackage
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
    // InternalBurst.g:614:1: rule__PackageElement__Alternatives : ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:618:1: ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 33:
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
                    // InternalBurst.g:619:2: ( ruleConcern )
                    {
                    // InternalBurst.g:619:2: ( ruleConcern )
                    // InternalBurst.g:620:3: ruleConcern
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
                    // InternalBurst.g:625:2: ( ruleTemplate )
                    {
                    // InternalBurst.g:625:2: ( ruleTemplate )
                    // InternalBurst.g:626:3: ruleTemplate
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
                    // InternalBurst.g:631:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:631:2: ( ruleRuleIntersect )
                    // InternalBurst.g:632:3: ruleRuleIntersect
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
    // InternalBurst.g:641:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:645:1: ( ( ruleMember ) | ( ruleRuleIntersect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=31 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:646:2: ( ruleMember )
                    {
                    // InternalBurst.g:646:2: ( ruleMember )
                    // InternalBurst.g:647:3: ruleMember
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
                    // InternalBurst.g:652:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:652:2: ( ruleRuleIntersect )
                    // InternalBurst.g:653:3: ruleRuleIntersect
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
    // InternalBurst.g:662:1: rule__RuleIntersect__Alternatives_4_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:666:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:667:2: ( ',' )
                    {
                    // InternalBurst.g:667:2: ( ',' )
                    // InternalBurst.g:668:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:673:2: ( 'and' )
                    {
                    // InternalBurst.g:673:2: ( 'and' )
                    // InternalBurst.g:674:3: 'and'
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
    // InternalBurst.g:683:1: rule__RuleIntersect__Alternatives_5_3_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:687:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:688:2: ( ',' )
                    {
                    // InternalBurst.g:688:2: ( ',' )
                    // InternalBurst.g:689:3: ','
                    {
                     before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:694:2: ( 'and' )
                    {
                    // InternalBurst.g:694:2: ( 'and' )
                    // InternalBurst.g:695:3: 'and'
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


    // $ANTLR start "rule__Line__Alternatives"
    // InternalBurst.g:704:1: rule__Line__Alternatives : ( ( ruleCall ) | ( ruleContextManagement ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:708:1: ( ( ruleCall ) | ( ruleContextManagement ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==26||LA6_0==29) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:709:2: ( ruleCall )
                    {
                    // InternalBurst.g:709:2: ( ruleCall )
                    // InternalBurst.g:710:3: ruleCall
                    {
                     before(grammarAccess.getLineAccess().getCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getLineAccess().getCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:715:2: ( ruleContextManagement )
                    {
                    // InternalBurst.g:715:2: ( ruleContextManagement )
                    // InternalBurst.g:716:3: ruleContextManagement
                    {
                     before(grammarAccess.getLineAccess().getContextManagementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContextManagement();

                    state._fsp--;

                     after(grammarAccess.getLineAccess().getContextManagementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Line__Alternatives"


    // $ANTLR start "rule__CallElement__Alternatives"
    // InternalBurst.g:725:1: rule__CallElement__Alternatives : ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) );
    public final void rule__CallElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:729:1: ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBurst.g:730:2: ( ruleLocale )
                    {
                    // InternalBurst.g:730:2: ( ruleLocale )
                    // InternalBurst.g:731:3: ruleLocale
                    {
                     before(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocale();

                    state._fsp--;

                     after(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:736:2: ( ruleAccess )
                    {
                    // InternalBurst.g:736:2: ( ruleAccess )
                    // InternalBurst.g:737:3: ruleAccess
                    {
                     before(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccess();

                    state._fsp--;

                     after(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:742:2: ( ruleSubCall )
                    {
                    // InternalBurst.g:742:2: ( ruleSubCall )
                    // InternalBurst.g:743:3: ruleSubCall
                    {
                     before(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSubCall();

                    state._fsp--;

                     after(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2()); 

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
    // $ANTLR end "rule__CallElement__Alternatives"


    // $ANTLR start "rule__ConcernManagment__Alternatives"
    // InternalBurst.g:752:1: rule__ConcernManagment__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) );
    public final void rule__ConcernManagment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:756:1: ( ( ( '1' ) ) | ( ( '0' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:757:2: ( ( '1' ) )
                    {
                    // InternalBurst.g:757:2: ( ( '1' ) )
                    // InternalBurst.g:758:3: ( '1' )
                    {
                     before(grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalBurst.g:759:3: ( '1' )
                    // InternalBurst.g:759:4: '1'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:763:2: ( ( '0' ) )
                    {
                    // InternalBurst.g:763:2: ( ( '0' ) )
                    // InternalBurst.g:764:3: ( '0' )
                    {
                     before(grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1()); 
                    // InternalBurst.g:765:3: ( '0' )
                    // InternalBurst.g:765:4: '0'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ConcernManagment__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalBurst.g:773:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:777:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalBurst.g:778:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalBurst.g:785:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:789:1: ( ( () ) )
            // InternalBurst.g:790:1: ( () )
            {
            // InternalBurst.g:790:1: ( () )
            // InternalBurst.g:791:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalBurst.g:792:2: ()
            // InternalBurst.g:792:3: 
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
    // InternalBurst.g:800:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:804:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalBurst.g:805:2: rule__File__Group__1__Impl rule__File__Group__2
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
    // InternalBurst.g:812:1: rule__File__Group__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:816:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:817:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:817:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:818:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 
            // InternalBurst.g:819:2: ( RULE_ENDLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ENDLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:819:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBurst.g:827:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:831:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalBurst.g:832:2: rule__File__Group__2__Impl rule__File__Group__3
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
    // InternalBurst.g:839:1: rule__File__Group__2__Impl : ( ( rule__File__Group_2__0 )* ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:843:1: ( ( ( rule__File__Group_2__0 )* ) )
            // InternalBurst.g:844:1: ( ( rule__File__Group_2__0 )* )
            {
            // InternalBurst.g:844:1: ( ( rule__File__Group_2__0 )* )
            // InternalBurst.g:845:2: ( rule__File__Group_2__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_2()); 
            // InternalBurst.g:846:2: ( rule__File__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:846:3: rule__File__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__File__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBurst.g:854:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:858:1: ( rule__File__Group__3__Impl )
            // InternalBurst.g:859:2: rule__File__Group__3__Impl
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
    // InternalBurst.g:865:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:869:1: ( ( ( rule__File__Group_3__0 )* ) )
            // InternalBurst.g:870:1: ( ( rule__File__Group_3__0 )* )
            {
            // InternalBurst.g:870:1: ( ( rule__File__Group_3__0 )* )
            // InternalBurst.g:871:2: ( rule__File__Group_3__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // InternalBurst.g:872:2: ( rule__File__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=17 && LA11_0<=18)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:872:3: rule__File__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBurst.g:881:1: rule__File__Group_2__0 : rule__File__Group_2__0__Impl rule__File__Group_2__1 ;
    public final void rule__File__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:885:1: ( rule__File__Group_2__0__Impl rule__File__Group_2__1 )
            // InternalBurst.g:886:2: rule__File__Group_2__0__Impl rule__File__Group_2__1
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
    // InternalBurst.g:893:1: rule__File__Group_2__0__Impl : ( ( rule__File__ImportsAssignment_2_0 ) ) ;
    public final void rule__File__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:897:1: ( ( ( rule__File__ImportsAssignment_2_0 ) ) )
            // InternalBurst.g:898:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            {
            // InternalBurst.g:898:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            // InternalBurst.g:899:2: ( rule__File__ImportsAssignment_2_0 )
            {
             before(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 
            // InternalBurst.g:900:2: ( rule__File__ImportsAssignment_2_0 )
            // InternalBurst.g:900:3: rule__File__ImportsAssignment_2_0
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
    // InternalBurst.g:908:1: rule__File__Group_2__1 : rule__File__Group_2__1__Impl ;
    public final void rule__File__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:912:1: ( rule__File__Group_2__1__Impl )
            // InternalBurst.g:913:2: rule__File__Group_2__1__Impl
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
    // InternalBurst.g:919:1: rule__File__Group_2__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:923:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:924:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:924:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:925:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 
            // InternalBurst.g:926:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:926:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalBurst.g:935:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:939:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // InternalBurst.g:940:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
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
    // InternalBurst.g:947:1: rule__File__Group_3__0__Impl : ( ( rule__File__ElementsAssignment_3_0 ) ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:951:1: ( ( ( rule__File__ElementsAssignment_3_0 ) ) )
            // InternalBurst.g:952:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            {
            // InternalBurst.g:952:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            // InternalBurst.g:953:2: ( rule__File__ElementsAssignment_3_0 )
            {
             before(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 
            // InternalBurst.g:954:2: ( rule__File__ElementsAssignment_3_0 )
            // InternalBurst.g:954:3: rule__File__ElementsAssignment_3_0
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
    // InternalBurst.g:962:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:966:1: ( rule__File__Group_3__1__Impl )
            // InternalBurst.g:967:2: rule__File__Group_3__1__Impl
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
    // InternalBurst.g:973:1: rule__File__Group_3__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:977:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:978:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:978:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:979:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 
            // InternalBurst.g:980:2: ( RULE_ENDLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ENDLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:980:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalBurst.g:989:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:993:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:994:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalBurst.g:1001:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1005:1: ( ( () ) )
            // InternalBurst.g:1006:1: ( () )
            {
            // InternalBurst.g:1006:1: ( () )
            // InternalBurst.g:1007:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalBurst.g:1008:2: ()
            // InternalBurst.g:1008:3: 
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
    // InternalBurst.g:1016:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1020:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:1021:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalBurst.g:1028:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1032:1: ( ( 'import' ) )
            // InternalBurst.g:1033:1: ( 'import' )
            {
            // InternalBurst.g:1033:1: ( 'import' )
            // InternalBurst.g:1034:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBurst.g:1043:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1047:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:1048:2: rule__Import__Group__2__Impl
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
    // InternalBurst.g:1054:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1058:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:1059:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:1059:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:1060:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // InternalBurst.g:1061:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:1061:3: rule__Import__ImportedNamespaceAssignment_2
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
    // InternalBurst.g:1070:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1074:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalBurst.g:1075:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalBurst.g:1082:1: rule__Roles__Group__0__Impl : ( () ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1086:1: ( ( () ) )
            // InternalBurst.g:1087:1: ( () )
            {
            // InternalBurst.g:1087:1: ( () )
            // InternalBurst.g:1088:2: ()
            {
             before(grammarAccess.getRolesAccess().getRoleAction_0()); 
            // InternalBurst.g:1089:2: ()
            // InternalBurst.g:1089:3: 
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
    // InternalBurst.g:1097:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl rule__Roles__Group__2 ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1101:1: ( rule__Roles__Group__1__Impl rule__Roles__Group__2 )
            // InternalBurst.g:1102:2: rule__Roles__Group__1__Impl rule__Roles__Group__2
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
    // InternalBurst.g:1109:1: rule__Roles__Group__1__Impl : ( 'role' ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1113:1: ( ( 'role' ) )
            // InternalBurst.g:1114:1: ( 'role' )
            {
            // InternalBurst.g:1114:1: ( 'role' )
            // InternalBurst.g:1115:2: 'role'
            {
             before(grammarAccess.getRolesAccess().getRoleKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalBurst.g:1124:1: rule__Roles__Group__2 : rule__Roles__Group__2__Impl ;
    public final void rule__Roles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1128:1: ( rule__Roles__Group__2__Impl )
            // InternalBurst.g:1129:2: rule__Roles__Group__2__Impl
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
    // InternalBurst.g:1135:1: rule__Roles__Group__2__Impl : ( ( rule__Roles__NameAssignment_2 ) ) ;
    public final void rule__Roles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1139:1: ( ( ( rule__Roles__NameAssignment_2 ) ) )
            // InternalBurst.g:1140:1: ( ( rule__Roles__NameAssignment_2 ) )
            {
            // InternalBurst.g:1140:1: ( ( rule__Roles__NameAssignment_2 ) )
            // InternalBurst.g:1141:2: ( rule__Roles__NameAssignment_2 )
            {
             before(grammarAccess.getRolesAccess().getNameAssignment_2()); 
            // InternalBurst.g:1142:2: ( rule__Roles__NameAssignment_2 )
            // InternalBurst.g:1142:3: rule__Roles__NameAssignment_2
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
    // InternalBurst.g:1151:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1155:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:1156:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalBurst.g:1163:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1167:1: ( ( () ) )
            // InternalBurst.g:1168:1: ( () )
            {
            // InternalBurst.g:1168:1: ( () )
            // InternalBurst.g:1169:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalBurst.g:1170:2: ()
            // InternalBurst.g:1170:3: 
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
    // InternalBurst.g:1178:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1182:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:1183:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalBurst.g:1190:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1194:1: ( ( 'package' ) )
            // InternalBurst.g:1195:1: ( 'package' )
            {
            // InternalBurst.g:1195:1: ( 'package' )
            // InternalBurst.g:1196:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalBurst.g:1205:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1209:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:1210:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalBurst.g:1217:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1221:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalBurst.g:1222:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalBurst.g:1222:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalBurst.g:1223:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalBurst.g:1224:2: ( rule__Package__NameAssignment_2 )
            // InternalBurst.g:1224:3: rule__Package__NameAssignment_2
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
    // InternalBurst.g:1232:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1236:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:1237:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalBurst.g:1244:1: rule__Package__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1248:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1249:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1249:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1250:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 
            // InternalBurst.g:1251:2: ( RULE_ENDLINE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ENDLINE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1251:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalBurst.g:1259:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1263:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalBurst.g:1264:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalBurst.g:1271:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1275:1: ( ( '{' ) )
            // InternalBurst.g:1276:1: ( '{' )
            {
            // InternalBurst.g:1276:1: ( '{' )
            // InternalBurst.g:1277:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBurst.g:1286:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1290:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalBurst.g:1291:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalBurst.g:1298:1: rule__Package__Group__5__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1302:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1303:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1303:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1304:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
            // InternalBurst.g:1305:2: ( RULE_ENDLINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ENDLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1305:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalBurst.g:1313:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1317:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalBurst.g:1318:2: rule__Package__Group__6__Impl rule__Package__Group__7
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
    // InternalBurst.g:1325:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1329:1: ( ( ( rule__Package__Group_6__0 )* ) )
            // InternalBurst.g:1330:1: ( ( rule__Package__Group_6__0 )* )
            {
            // InternalBurst.g:1330:1: ( ( rule__Package__Group_6__0 )* )
            // InternalBurst.g:1331:2: ( rule__Package__Group_6__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // InternalBurst.g:1332:2: ( rule__Package__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=21 && LA16_0<=22)||LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1332:3: rule__Package__Group_6__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Package__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalBurst.g:1340:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1344:1: ( rule__Package__Group__7__Impl )
            // InternalBurst.g:1345:2: rule__Package__Group__7__Impl
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
    // InternalBurst.g:1351:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1355:1: ( ( '}' ) )
            // InternalBurst.g:1356:1: ( '}' )
            {
            // InternalBurst.g:1356:1: ( '}' )
            // InternalBurst.g:1357:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBurst.g:1367:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1371:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // InternalBurst.g:1372:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
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
    // InternalBurst.g:1379:1: rule__Package__Group_6__0__Impl : ( ( rule__Package__ElementsAssignment_6_0 ) ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1383:1: ( ( ( rule__Package__ElementsAssignment_6_0 ) ) )
            // InternalBurst.g:1384:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            {
            // InternalBurst.g:1384:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            // InternalBurst.g:1385:2: ( rule__Package__ElementsAssignment_6_0 )
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 
            // InternalBurst.g:1386:2: ( rule__Package__ElementsAssignment_6_0 )
            // InternalBurst.g:1386:3: rule__Package__ElementsAssignment_6_0
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
    // InternalBurst.g:1394:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1398:1: ( rule__Package__Group_6__1__Impl )
            // InternalBurst.g:1399:2: rule__Package__Group_6__1__Impl
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
    // InternalBurst.g:1405:1: rule__Package__Group_6__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1409:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1410:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1410:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1411:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 
            // InternalBurst.g:1412:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1412:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBurst.g:1421:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1425:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:1426:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
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
    // InternalBurst.g:1433:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1437:1: ( ( () ) )
            // InternalBurst.g:1438:1: ( () )
            {
            // InternalBurst.g:1438:1: ( () )
            // InternalBurst.g:1439:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:1440:2: ()
            // InternalBurst.g:1440:3: 
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
    // InternalBurst.g:1448:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1452:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:1453:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
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
    // InternalBurst.g:1460:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1464:1: ( ( 'concern' ) )
            // InternalBurst.g:1465:1: ( 'concern' )
            {
            // InternalBurst.g:1465:1: ( 'concern' )
            // InternalBurst.g:1466:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBurst.g:1475:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1479:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:1480:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
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
    // InternalBurst.g:1487:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1491:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:1492:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:1492:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:1493:2: ( rule__Concern__NameAssignment_2 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:1494:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:1494:3: rule__Concern__NameAssignment_2
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
    // InternalBurst.g:1502:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1506:1: ( rule__Concern__Group__3__Impl )
            // InternalBurst.g:1507:2: rule__Concern__Group__3__Impl
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
    // InternalBurst.g:1513:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1517:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:1518:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:1518:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:1519:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalBurst.g:1520:2: ( rule__Concern__Group_3__0 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:1520:3: rule__Concern__Group_3__0
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
    // InternalBurst.g:1529:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1533:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:1534:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
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
    // InternalBurst.g:1541:1: rule__Concern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1545:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1546:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1546:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1547:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            // InternalBurst.g:1548:2: ( RULE_ENDLINE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ENDLINE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1548:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBurst.g:1556:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1560:1: ( rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 )
            // InternalBurst.g:1561:2: rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2
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
    // InternalBurst.g:1568:1: rule__Concern__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1572:1: ( ( '{' ) )
            // InternalBurst.g:1573:1: ( '{' )
            {
            // InternalBurst.g:1573:1: ( '{' )
            // InternalBurst.g:1574:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBurst.g:1583:1: rule__Concern__Group_3__2 : rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 ;
    public final void rule__Concern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1587:1: ( rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 )
            // InternalBurst.g:1588:2: rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3
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
    // InternalBurst.g:1595:1: rule__Concern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1599:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1600:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1600:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1601:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            // InternalBurst.g:1602:2: ( RULE_ENDLINE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1602:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalBurst.g:1610:1: rule__Concern__Group_3__3 : rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 ;
    public final void rule__Concern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1614:1: ( rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 )
            // InternalBurst.g:1615:2: rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4
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
    // InternalBurst.g:1622:1: rule__Concern__Group_3__3__Impl : ( ( rule__Concern__Group_3_3__0 )* ) ;
    public final void rule__Concern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1626:1: ( ( ( rule__Concern__Group_3_3__0 )* ) )
            // InternalBurst.g:1627:1: ( ( rule__Concern__Group_3_3__0 )* )
            {
            // InternalBurst.g:1627:1: ( ( rule__Concern__Group_3_3__0 )* )
            // InternalBurst.g:1628:2: ( rule__Concern__Group_3_3__0 )*
            {
             before(grammarAccess.getConcernAccess().getGroup_3_3()); 
            // InternalBurst.g:1629:2: ( rule__Concern__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=31 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:1629:3: rule__Concern__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Concern__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalBurst.g:1637:1: rule__Concern__Group_3__4 : rule__Concern__Group_3__4__Impl ;
    public final void rule__Concern__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1641:1: ( rule__Concern__Group_3__4__Impl )
            // InternalBurst.g:1642:2: rule__Concern__Group_3__4__Impl
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
    // InternalBurst.g:1648:1: rule__Concern__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Concern__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1652:1: ( ( '}' ) )
            // InternalBurst.g:1653:1: ( '}' )
            {
            // InternalBurst.g:1653:1: ( '}' )
            // InternalBurst.g:1654:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBurst.g:1664:1: rule__Concern__Group_3_3__0 : rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 ;
    public final void rule__Concern__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1668:1: ( rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 )
            // InternalBurst.g:1669:2: rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1
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
    // InternalBurst.g:1676:1: rule__Concern__Group_3_3__0__Impl : ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) ;
    public final void rule__Concern__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1680:1: ( ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) )
            // InternalBurst.g:1681:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            {
            // InternalBurst.g:1681:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            // InternalBurst.g:1682:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            {
             before(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 
            // InternalBurst.g:1683:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            // InternalBurst.g:1683:3: rule__Concern__ElementsAssignment_3_3_0
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
    // InternalBurst.g:1691:1: rule__Concern__Group_3_3__1 : rule__Concern__Group_3_3__1__Impl ;
    public final void rule__Concern__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1695:1: ( rule__Concern__Group_3_3__1__Impl )
            // InternalBurst.g:1696:2: rule__Concern__Group_3_3__1__Impl
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
    // InternalBurst.g:1702:1: rule__Concern__Group_3_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Concern__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1706:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1707:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1707:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1708:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1708:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1709:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            // InternalBurst.g:1710:3: ( RULE_ENDLINE )
            // InternalBurst.g:1710:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 

            }

            // InternalBurst.g:1713:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1714:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            // InternalBurst.g:1715:3: ( RULE_ENDLINE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ENDLINE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBurst.g:1715:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBurst.g:1725:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1729:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalBurst.g:1730:2: rule__Template__Group__0__Impl rule__Template__Group__1
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
    // InternalBurst.g:1737:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1741:1: ( ( () ) )
            // InternalBurst.g:1742:1: ( () )
            {
            // InternalBurst.g:1742:1: ( () )
            // InternalBurst.g:1743:2: ()
            {
             before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            // InternalBurst.g:1744:2: ()
            // InternalBurst.g:1744:3: 
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
    // InternalBurst.g:1752:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1756:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalBurst.g:1757:2: rule__Template__Group__1__Impl rule__Template__Group__2
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
    // InternalBurst.g:1764:1: rule__Template__Group__1__Impl : ( 'template' ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1768:1: ( ( 'template' ) )
            // InternalBurst.g:1769:1: ( 'template' )
            {
            // InternalBurst.g:1769:1: ( 'template' )
            // InternalBurst.g:1770:2: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBurst.g:1779:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1783:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalBurst.g:1784:2: rule__Template__Group__2__Impl rule__Template__Group__3
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
    // InternalBurst.g:1791:1: rule__Template__Group__2__Impl : ( ( rule__Template__NameAssignment_2 ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1795:1: ( ( ( rule__Template__NameAssignment_2 ) ) )
            // InternalBurst.g:1796:1: ( ( rule__Template__NameAssignment_2 ) )
            {
            // InternalBurst.g:1796:1: ( ( rule__Template__NameAssignment_2 ) )
            // InternalBurst.g:1797:2: ( rule__Template__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            // InternalBurst.g:1798:2: ( rule__Template__NameAssignment_2 )
            // InternalBurst.g:1798:3: rule__Template__NameAssignment_2
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
    // InternalBurst.g:1806:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1810:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // InternalBurst.g:1811:2: rule__Template__Group__3__Impl rule__Template__Group__4
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
    // InternalBurst.g:1818:1: rule__Template__Group__3__Impl : ( '<' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1822:1: ( ( '<' ) )
            // InternalBurst.g:1823:1: ( '<' )
            {
            // InternalBurst.g:1823:1: ( '<' )
            // InternalBurst.g:1824:2: '<'
            {
             before(grammarAccess.getTemplateAccess().getLessThanSignKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBurst.g:1833:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1837:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // InternalBurst.g:1838:2: rule__Template__Group__4__Impl rule__Template__Group__5
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
    // InternalBurst.g:1845:1: rule__Template__Group__4__Impl : ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1849:1: ( ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) )
            // InternalBurst.g:1850:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            {
            // InternalBurst.g:1850:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            // InternalBurst.g:1851:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 
            // InternalBurst.g:1852:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            // InternalBurst.g:1852:3: rule__Template__TemplateArgumentsAssignment_4
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
    // InternalBurst.g:1860:1: rule__Template__Group__5 : rule__Template__Group__5__Impl rule__Template__Group__6 ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1864:1: ( rule__Template__Group__5__Impl rule__Template__Group__6 )
            // InternalBurst.g:1865:2: rule__Template__Group__5__Impl rule__Template__Group__6
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
    // InternalBurst.g:1872:1: rule__Template__Group__5__Impl : ( ( rule__Template__Group_5__0 )* ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1876:1: ( ( ( rule__Template__Group_5__0 )* ) )
            // InternalBurst.g:1877:1: ( ( rule__Template__Group_5__0 )* )
            {
            // InternalBurst.g:1877:1: ( ( rule__Template__Group_5__0 )* )
            // InternalBurst.g:1878:2: ( rule__Template__Group_5__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_5()); 
            // InternalBurst.g:1879:2: ( rule__Template__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==12) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1879:3: rule__Template__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Template__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalBurst.g:1887:1: rule__Template__Group__6 : rule__Template__Group__6__Impl rule__Template__Group__7 ;
    public final void rule__Template__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1891:1: ( rule__Template__Group__6__Impl rule__Template__Group__7 )
            // InternalBurst.g:1892:2: rule__Template__Group__6__Impl rule__Template__Group__7
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
    // InternalBurst.g:1899:1: rule__Template__Group__6__Impl : ( '>' ) ;
    public final void rule__Template__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1903:1: ( ( '>' ) )
            // InternalBurst.g:1904:1: ( '>' )
            {
            // InternalBurst.g:1904:1: ( '>' )
            // InternalBurst.g:1905:2: '>'
            {
             before(grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBurst.g:1914:1: rule__Template__Group__7 : rule__Template__Group__7__Impl ;
    public final void rule__Template__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1918:1: ( rule__Template__Group__7__Impl )
            // InternalBurst.g:1919:2: rule__Template__Group__7__Impl
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
    // InternalBurst.g:1925:1: rule__Template__Group__7__Impl : ( ( rule__Template__Group_7__0 )? ) ;
    public final void rule__Template__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1929:1: ( ( ( rule__Template__Group_7__0 )? ) )
            // InternalBurst.g:1930:1: ( ( rule__Template__Group_7__0 )? )
            {
            // InternalBurst.g:1930:1: ( ( rule__Template__Group_7__0 )? )
            // InternalBurst.g:1931:2: ( rule__Template__Group_7__0 )?
            {
             before(grammarAccess.getTemplateAccess().getGroup_7()); 
            // InternalBurst.g:1932:2: ( rule__Template__Group_7__0 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalBurst.g:1932:3: rule__Template__Group_7__0
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
    // InternalBurst.g:1941:1: rule__Template__Group_5__0 : rule__Template__Group_5__0__Impl rule__Template__Group_5__1 ;
    public final void rule__Template__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1945:1: ( rule__Template__Group_5__0__Impl rule__Template__Group_5__1 )
            // InternalBurst.g:1946:2: rule__Template__Group_5__0__Impl rule__Template__Group_5__1
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
    // InternalBurst.g:1953:1: rule__Template__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Template__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1957:1: ( ( ',' ) )
            // InternalBurst.g:1958:1: ( ',' )
            {
            // InternalBurst.g:1958:1: ( ',' )
            // InternalBurst.g:1959:2: ','
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
    // InternalBurst.g:1968:1: rule__Template__Group_5__1 : rule__Template__Group_5__1__Impl ;
    public final void rule__Template__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1972:1: ( rule__Template__Group_5__1__Impl )
            // InternalBurst.g:1973:2: rule__Template__Group_5__1__Impl
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
    // InternalBurst.g:1979:1: rule__Template__Group_5__1__Impl : ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) ;
    public final void rule__Template__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1983:1: ( ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) )
            // InternalBurst.g:1984:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            {
            // InternalBurst.g:1984:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            // InternalBurst.g:1985:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 
            // InternalBurst.g:1986:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            // InternalBurst.g:1986:3: rule__Template__TemplateArgumentsAssignment_5_1
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
    // InternalBurst.g:1995:1: rule__Template__Group_7__0 : rule__Template__Group_7__0__Impl rule__Template__Group_7__1 ;
    public final void rule__Template__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1999:1: ( rule__Template__Group_7__0__Impl rule__Template__Group_7__1 )
            // InternalBurst.g:2000:2: rule__Template__Group_7__0__Impl rule__Template__Group_7__1
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
    // InternalBurst.g:2007:1: rule__Template__Group_7__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2011:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2012:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2012:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2013:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 
            // InternalBurst.g:2014:2: ( RULE_ENDLINE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ENDLINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:2014:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalBurst.g:2022:1: rule__Template__Group_7__1 : rule__Template__Group_7__1__Impl rule__Template__Group_7__2 ;
    public final void rule__Template__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2026:1: ( rule__Template__Group_7__1__Impl rule__Template__Group_7__2 )
            // InternalBurst.g:2027:2: rule__Template__Group_7__1__Impl rule__Template__Group_7__2
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
    // InternalBurst.g:2034:1: rule__Template__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Template__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2038:1: ( ( '{' ) )
            // InternalBurst.g:2039:1: ( '{' )
            {
            // InternalBurst.g:2039:1: ( '{' )
            // InternalBurst.g:2040:2: '{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBurst.g:2049:1: rule__Template__Group_7__2 : rule__Template__Group_7__2__Impl rule__Template__Group_7__3 ;
    public final void rule__Template__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2053:1: ( rule__Template__Group_7__2__Impl rule__Template__Group_7__3 )
            // InternalBurst.g:2054:2: rule__Template__Group_7__2__Impl rule__Template__Group_7__3
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
    // InternalBurst.g:2061:1: rule__Template__Group_7__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2065:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2066:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2066:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2067:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 
            // InternalBurst.g:2068:2: ( RULE_ENDLINE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ENDLINE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:2068:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalBurst.g:2076:1: rule__Template__Group_7__3 : rule__Template__Group_7__3__Impl rule__Template__Group_7__4 ;
    public final void rule__Template__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2080:1: ( rule__Template__Group_7__3__Impl rule__Template__Group_7__4 )
            // InternalBurst.g:2081:2: rule__Template__Group_7__3__Impl rule__Template__Group_7__4
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
    // InternalBurst.g:2088:1: rule__Template__Group_7__3__Impl : ( ( rule__Template__Group_7_3__0 )* ) ;
    public final void rule__Template__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2092:1: ( ( ( rule__Template__Group_7_3__0 )* ) )
            // InternalBurst.g:2093:1: ( ( rule__Template__Group_7_3__0 )* )
            {
            // InternalBurst.g:2093:1: ( ( rule__Template__Group_7_3__0 )* )
            // InternalBurst.g:2094:2: ( rule__Template__Group_7_3__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_7_3()); 
            // InternalBurst.g:2095:2: ( rule__Template__Group_7_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=31 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBurst.g:2095:3: rule__Template__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Template__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalBurst.g:2103:1: rule__Template__Group_7__4 : rule__Template__Group_7__4__Impl ;
    public final void rule__Template__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2107:1: ( rule__Template__Group_7__4__Impl )
            // InternalBurst.g:2108:2: rule__Template__Group_7__4__Impl
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
    // InternalBurst.g:2114:1: rule__Template__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Template__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2118:1: ( ( '}' ) )
            // InternalBurst.g:2119:1: ( '}' )
            {
            // InternalBurst.g:2119:1: ( '}' )
            // InternalBurst.g:2120:2: '}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBurst.g:2130:1: rule__Template__Group_7_3__0 : rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 ;
    public final void rule__Template__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2134:1: ( rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 )
            // InternalBurst.g:2135:2: rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1
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
    // InternalBurst.g:2142:1: rule__Template__Group_7_3__0__Impl : ( ( rule__Template__ElementsAssignment_7_3_0 ) ) ;
    public final void rule__Template__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2146:1: ( ( ( rule__Template__ElementsAssignment_7_3_0 ) ) )
            // InternalBurst.g:2147:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            {
            // InternalBurst.g:2147:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            // InternalBurst.g:2148:2: ( rule__Template__ElementsAssignment_7_3_0 )
            {
             before(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 
            // InternalBurst.g:2149:2: ( rule__Template__ElementsAssignment_7_3_0 )
            // InternalBurst.g:2149:3: rule__Template__ElementsAssignment_7_3_0
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
    // InternalBurst.g:2157:1: rule__Template__Group_7_3__1 : rule__Template__Group_7_3__1__Impl ;
    public final void rule__Template__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2161:1: ( rule__Template__Group_7_3__1__Impl )
            // InternalBurst.g:2162:2: rule__Template__Group_7_3__1__Impl
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
    // InternalBurst.g:2168:1: rule__Template__Group_7_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Template__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2172:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2173:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2173:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2174:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2174:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2175:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            // InternalBurst.g:2176:3: ( RULE_ENDLINE )
            // InternalBurst.g:2176:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 

            }

            // InternalBurst.g:2179:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2180:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            // InternalBurst.g:2181:3: ( RULE_ENDLINE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ENDLINE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBurst.g:2181:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBurst.g:2191:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2195:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:2196:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalBurst.g:2203:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2207:1: ( ( () ) )
            // InternalBurst.g:2208:1: ( () )
            {
            // InternalBurst.g:2208:1: ( () )
            // InternalBurst.g:2209:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:2210:2: ()
            // InternalBurst.g:2210:3: 
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
    // InternalBurst.g:2218:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2222:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:2223:2: rule__Member__Group__1__Impl rule__Member__Group__2
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
    // InternalBurst.g:2230:1: rule__Member__Group__1__Impl : ( ( rule__Member__ActAsAssignment_1 )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2234:1: ( ( ( rule__Member__ActAsAssignment_1 )? ) )
            // InternalBurst.g:2235:1: ( ( rule__Member__ActAsAssignment_1 )? )
            {
            // InternalBurst.g:2235:1: ( ( rule__Member__ActAsAssignment_1 )? )
            // InternalBurst.g:2236:2: ( rule__Member__ActAsAssignment_1 )?
            {
             before(grammarAccess.getMemberAccess().getActAsAssignment_1()); 
            // InternalBurst.g:2237:2: ( rule__Member__ActAsAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBurst.g:2237:3: rule__Member__ActAsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__ActAsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getActAsAssignment_1()); 

            }


            }

        }
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
    // InternalBurst.g:2245:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2249:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalBurst.g:2250:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBurst.g:2257:1: rule__Member__Group__2__Impl : ( ( rule__Member__IsContentAssignment_2 )? ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2261:1: ( ( ( rule__Member__IsContentAssignment_2 )? ) )
            // InternalBurst.g:2262:1: ( ( rule__Member__IsContentAssignment_2 )? )
            {
            // InternalBurst.g:2262:1: ( ( rule__Member__IsContentAssignment_2 )? )
            // InternalBurst.g:2263:2: ( rule__Member__IsContentAssignment_2 )?
            {
             before(grammarAccess.getMemberAccess().getIsContentAssignment_2()); 
            // InternalBurst.g:2264:2: ( rule__Member__IsContentAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBurst.g:2264:3: rule__Member__IsContentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__IsContentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getIsContentAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:2272:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2276:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalBurst.g:2277:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:2284:1: rule__Member__Group__3__Impl : ( ( rule__Member__ConcernAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2288:1: ( ( ( rule__Member__ConcernAssignment_3 ) ) )
            // InternalBurst.g:2289:1: ( ( rule__Member__ConcernAssignment_3 ) )
            {
            // InternalBurst.g:2289:1: ( ( rule__Member__ConcernAssignment_3 ) )
            // InternalBurst.g:2290:2: ( rule__Member__ConcernAssignment_3 )
            {
             before(grammarAccess.getMemberAccess().getConcernAssignment_3()); 
            // InternalBurst.g:2291:2: ( rule__Member__ConcernAssignment_3 )
            // InternalBurst.g:2291:3: rule__Member__ConcernAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Member__ConcernAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getConcernAssignment_3()); 

            }


            }

        }
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
    // InternalBurst.g:2299:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2303:1: ( rule__Member__Group__4__Impl )
            // InternalBurst.g:2304:2: rule__Member__Group__4__Impl
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
    // InternalBurst.g:2310:1: rule__Member__Group__4__Impl : ( ( rule__Member__NameAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2314:1: ( ( ( rule__Member__NameAssignment_4 ) ) )
            // InternalBurst.g:2315:1: ( ( rule__Member__NameAssignment_4 ) )
            {
            // InternalBurst.g:2315:1: ( ( rule__Member__NameAssignment_4 ) )
            // InternalBurst.g:2316:2: ( rule__Member__NameAssignment_4 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_4()); 
            // InternalBurst.g:2317:2: ( rule__Member__NameAssignment_4 )
            // InternalBurst.g:2317:3: rule__Member__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RuleIntersect__Group__0"
    // InternalBurst.g:2326:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2330:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:2331:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
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
    // InternalBurst.g:2338:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2342:1: ( ( () ) )
            // InternalBurst.g:2343:1: ( () )
            {
            // InternalBurst.g:2343:1: ( () )
            // InternalBurst.g:2344:2: ()
            {
             before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            // InternalBurst.g:2345:2: ()
            // InternalBurst.g:2345:3: 
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
    // InternalBurst.g:2353:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2357:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:2358:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
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
    // InternalBurst.g:2365:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2369:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:2370:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:2370:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:2371:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            // InternalBurst.g:2372:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:2372:3: rule__RuleIntersect__NameAssignment_1
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
    // InternalBurst.g:2380:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2384:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:2385:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
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
    // InternalBurst.g:2392:1: rule__RuleIntersect__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2396:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2397:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2397:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2398:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
            // InternalBurst.g:2399:2: ( RULE_ENDLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENDLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBurst.g:2399:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBurst.g:2407:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2411:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:2412:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
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
    // InternalBurst.g:2419:1: rule__RuleIntersect__Group__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2423:1: ( ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) )
            // InternalBurst.g:2424:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            {
            // InternalBurst.g:2424:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            // InternalBurst.g:2425:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 
            // InternalBurst.g:2426:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            // InternalBurst.g:2426:3: rule__RuleIntersect__ParamsAssignment_3
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
    // InternalBurst.g:2434:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2438:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:2439:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
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
    // InternalBurst.g:2446:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__Group_4__0 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2450:1: ( ( ( rule__RuleIntersect__Group_4__0 )* ) )
            // InternalBurst.g:2451:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            {
            // InternalBurst.g:2451:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            // InternalBurst.g:2452:2: ( rule__RuleIntersect__Group_4__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
            // InternalBurst.g:2453:2: ( rule__RuleIntersect__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ENDLINE||(LA32_0>=12 && LA32_0<=13)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBurst.g:2453:3: rule__RuleIntersect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalBurst.g:2461:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2465:1: ( rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 )
            // InternalBurst.g:2466:2: rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6
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
    // InternalBurst.g:2473:1: rule__RuleIntersect__Group__5__Impl : ( ( rule__RuleIntersect__Group_5__0 )? ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2477:1: ( ( ( rule__RuleIntersect__Group_5__0 )? ) )
            // InternalBurst.g:2478:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            {
            // InternalBurst.g:2478:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            // InternalBurst.g:2479:2: ( rule__RuleIntersect__Group_5__0 )?
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_5()); 
            // InternalBurst.g:2480:2: ( rule__RuleIntersect__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBurst.g:2480:3: rule__RuleIntersect__Group_5__0
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
    // InternalBurst.g:2488:1: rule__RuleIntersect__Group__6 : rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 ;
    public final void rule__RuleIntersect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2492:1: ( rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7 )
            // InternalBurst.g:2493:2: rule__RuleIntersect__Group__6__Impl rule__RuleIntersect__Group__7
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
    // InternalBurst.g:2500:1: rule__RuleIntersect__Group__6__Impl : ( '{' ) ;
    public final void rule__RuleIntersect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2504:1: ( ( '{' ) )
            // InternalBurst.g:2505:1: ( '{' )
            {
            // InternalBurst.g:2505:1: ( '{' )
            // InternalBurst.g:2506:2: '{'
            {
             before(grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBurst.g:2515:1: rule__RuleIntersect__Group__7 : rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 ;
    public final void rule__RuleIntersect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2519:1: ( rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8 )
            // InternalBurst.g:2520:2: rule__RuleIntersect__Group__7__Impl rule__RuleIntersect__Group__8
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
    // InternalBurst.g:2527:1: rule__RuleIntersect__Group__7__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2531:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2532:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2532:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2533:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7()); 
            // InternalBurst.g:2534:2: ( RULE_ENDLINE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ENDLINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBurst.g:2534:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalBurst.g:2542:1: rule__RuleIntersect__Group__8 : rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9 ;
    public final void rule__RuleIntersect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2546:1: ( rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9 )
            // InternalBurst.g:2547:2: rule__RuleIntersect__Group__8__Impl rule__RuleIntersect__Group__9
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
    // InternalBurst.g:2554:1: rule__RuleIntersect__Group__8__Impl : ( ( rule__RuleIntersect__Group_8__0 )* ) ;
    public final void rule__RuleIntersect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2558:1: ( ( ( rule__RuleIntersect__Group_8__0 )* ) )
            // InternalBurst.g:2559:1: ( ( rule__RuleIntersect__Group_8__0 )* )
            {
            // InternalBurst.g:2559:1: ( ( rule__RuleIntersect__Group_8__0 )* )
            // InternalBurst.g:2560:2: ( rule__RuleIntersect__Group_8__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_8()); 
            // InternalBurst.g:2561:2: ( rule__RuleIntersect__Group_8__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||(LA35_0>=14 && LA35_0<=15)||LA35_0==26||LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBurst.g:2561:3: rule__RuleIntersect__Group_8__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__RuleIntersect__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalBurst.g:2569:1: rule__RuleIntersect__Group__9 : rule__RuleIntersect__Group__9__Impl ;
    public final void rule__RuleIntersect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2573:1: ( rule__RuleIntersect__Group__9__Impl )
            // InternalBurst.g:2574:2: rule__RuleIntersect__Group__9__Impl
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
    // InternalBurst.g:2580:1: rule__RuleIntersect__Group__9__Impl : ( '}' ) ;
    public final void rule__RuleIntersect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2584:1: ( ( '}' ) )
            // InternalBurst.g:2585:1: ( '}' )
            {
            // InternalBurst.g:2585:1: ( '}' )
            // InternalBurst.g:2586:2: '}'
            {
             before(grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBurst.g:2596:1: rule__RuleIntersect__Group_4__0 : rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 ;
    public final void rule__RuleIntersect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2600:1: ( rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 )
            // InternalBurst.g:2601:2: rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1
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
    // InternalBurst.g:2608:1: rule__RuleIntersect__Group_4__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2612:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2613:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2613:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2614:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
            // InternalBurst.g:2615:2: ( RULE_ENDLINE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ENDLINE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBurst.g:2615:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalBurst.g:2623:1: rule__RuleIntersect__Group_4__1 : rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 ;
    public final void rule__RuleIntersect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2627:1: ( rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 )
            // InternalBurst.g:2628:2: rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2
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
    // InternalBurst.g:2635:1: rule__RuleIntersect__Group_4__1__Impl : ( ( rule__RuleIntersect__Alternatives_4_1 ) ) ;
    public final void rule__RuleIntersect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2639:1: ( ( ( rule__RuleIntersect__Alternatives_4_1 ) ) )
            // InternalBurst.g:2640:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            {
            // InternalBurst.g:2640:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            // InternalBurst.g:2641:2: ( rule__RuleIntersect__Alternatives_4_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
            // InternalBurst.g:2642:2: ( rule__RuleIntersect__Alternatives_4_1 )
            // InternalBurst.g:2642:3: rule__RuleIntersect__Alternatives_4_1
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
    // InternalBurst.g:2650:1: rule__RuleIntersect__Group_4__2 : rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 ;
    public final void rule__RuleIntersect__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2654:1: ( rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 )
            // InternalBurst.g:2655:2: rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3
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
    // InternalBurst.g:2662:1: rule__RuleIntersect__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2666:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2667:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2667:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2668:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
            // InternalBurst.g:2669:2: ( RULE_ENDLINE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ENDLINE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBurst.g:2669:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalBurst.g:2677:1: rule__RuleIntersect__Group_4__3 : rule__RuleIntersect__Group_4__3__Impl ;
    public final void rule__RuleIntersect__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2681:1: ( rule__RuleIntersect__Group_4__3__Impl )
            // InternalBurst.g:2682:2: rule__RuleIntersect__Group_4__3__Impl
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
    // InternalBurst.g:2688:1: rule__RuleIntersect__Group_4__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) ;
    public final void rule__RuleIntersect__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2692:1: ( ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) )
            // InternalBurst.g:2693:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            {
            // InternalBurst.g:2693:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            // InternalBurst.g:2694:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 
            // InternalBurst.g:2695:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            // InternalBurst.g:2695:3: rule__RuleIntersect__ParamsAssignment_4_3
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
    // InternalBurst.g:2704:1: rule__RuleIntersect__Group_5__0 : rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 ;
    public final void rule__RuleIntersect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2708:1: ( rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 )
            // InternalBurst.g:2709:2: rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1
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
    // InternalBurst.g:2716:1: rule__RuleIntersect__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__RuleIntersect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2720:1: ( ( 'with' ) )
            // InternalBurst.g:2721:1: ( 'with' )
            {
            // InternalBurst.g:2721:1: ( 'with' )
            // InternalBurst.g:2722:2: 'with'
            {
             before(grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBurst.g:2731:1: rule__RuleIntersect__Group_5__1 : rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 ;
    public final void rule__RuleIntersect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2735:1: ( rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 )
            // InternalBurst.g:2736:2: rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2
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
    // InternalBurst.g:2743:1: rule__RuleIntersect__Group_5__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2747:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2748:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2748:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2749:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1()); 
            // InternalBurst.g:2750:2: ( RULE_ENDLINE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ENDLINE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBurst.g:2750:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalBurst.g:2758:1: rule__RuleIntersect__Group_5__2 : rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 ;
    public final void rule__RuleIntersect__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2762:1: ( rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 )
            // InternalBurst.g:2763:2: rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3
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
    // InternalBurst.g:2770:1: rule__RuleIntersect__Group_5__2__Impl : ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) ) ;
    public final void rule__RuleIntersect__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2774:1: ( ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) ) )
            // InternalBurst.g:2775:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) )
            {
            // InternalBurst.g:2775:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) )
            // InternalBurst.g:2776:2: ( rule__RuleIntersect__WithParamsAssignment_5_2 )
            {
             before(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_2()); 
            // InternalBurst.g:2777:2: ( rule__RuleIntersect__WithParamsAssignment_5_2 )
            // InternalBurst.g:2777:3: rule__RuleIntersect__WithParamsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__WithParamsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_2()); 

            }


            }

        }
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
    // InternalBurst.g:2785:1: rule__RuleIntersect__Group_5__3 : rule__RuleIntersect__Group_5__3__Impl ;
    public final void rule__RuleIntersect__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2789:1: ( rule__RuleIntersect__Group_5__3__Impl )
            // InternalBurst.g:2790:2: rule__RuleIntersect__Group_5__3__Impl
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
    // InternalBurst.g:2796:1: rule__RuleIntersect__Group_5__3__Impl : ( ( rule__RuleIntersect__Group_5_3__0 )* ) ;
    public final void rule__RuleIntersect__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2800:1: ( ( ( rule__RuleIntersect__Group_5_3__0 )* ) )
            // InternalBurst.g:2801:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            {
            // InternalBurst.g:2801:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            // InternalBurst.g:2802:2: ( rule__RuleIntersect__Group_5_3__0 )*
            {
             before(grammarAccess.getRuleIntersectAccess().getGroup_5_3()); 
            // InternalBurst.g:2803:2: ( rule__RuleIntersect__Group_5_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ENDLINE||(LA39_0>=12 && LA39_0<=13)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBurst.g:2803:3: rule__RuleIntersect__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalBurst.g:2812:1: rule__RuleIntersect__Group_5_3__0 : rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 ;
    public final void rule__RuleIntersect__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2816:1: ( rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 )
            // InternalBurst.g:2817:2: rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1
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
    // InternalBurst.g:2824:1: rule__RuleIntersect__Group_5_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2828:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2829:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2829:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2830:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0()); 
            // InternalBurst.g:2831:2: ( RULE_ENDLINE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ENDLINE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBurst.g:2831:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalBurst.g:2839:1: rule__RuleIntersect__Group_5_3__1 : rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 ;
    public final void rule__RuleIntersect__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2843:1: ( rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 )
            // InternalBurst.g:2844:2: rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2
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
    // InternalBurst.g:2851:1: rule__RuleIntersect__Group_5_3__1__Impl : ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2855:1: ( ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) )
            // InternalBurst.g:2856:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            {
            // InternalBurst.g:2856:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            // InternalBurst.g:2857:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            {
             before(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1()); 
            // InternalBurst.g:2858:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            // InternalBurst.g:2858:3: rule__RuleIntersect__Alternatives_5_3_1
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
    // InternalBurst.g:2866:1: rule__RuleIntersect__Group_5_3__2 : rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 ;
    public final void rule__RuleIntersect__Group_5_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2870:1: ( rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 )
            // InternalBurst.g:2871:2: rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3
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
    // InternalBurst.g:2878:1: rule__RuleIntersect__Group_5_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2882:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2883:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2883:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2884:2: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2()); 
            // InternalBurst.g:2885:2: ( RULE_ENDLINE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ENDLINE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBurst.g:2885:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalBurst.g:2893:1: rule__RuleIntersect__Group_5_3__3 : rule__RuleIntersect__Group_5_3__3__Impl ;
    public final void rule__RuleIntersect__Group_5_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2897:1: ( rule__RuleIntersect__Group_5_3__3__Impl )
            // InternalBurst.g:2898:2: rule__RuleIntersect__Group_5_3__3__Impl
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
    // InternalBurst.g:2904:1: rule__RuleIntersect__Group_5_3__3__Impl : ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2908:1: ( ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) ) )
            // InternalBurst.g:2909:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) )
            {
            // InternalBurst.g:2909:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) )
            // InternalBurst.g:2910:2: ( rule__RuleIntersect__WithParamsAssignment_5_3_3 )
            {
             before(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_3_3()); 
            // InternalBurst.g:2911:2: ( rule__RuleIntersect__WithParamsAssignment_5_3_3 )
            // InternalBurst.g:2911:3: rule__RuleIntersect__WithParamsAssignment_5_3_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__WithParamsAssignment_5_3_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_3_3()); 

            }


            }

        }
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
    // InternalBurst.g:2920:1: rule__RuleIntersect__Group_8__0 : rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1 ;
    public final void rule__RuleIntersect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2924:1: ( rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1 )
            // InternalBurst.g:2925:2: rule__RuleIntersect__Group_8__0__Impl rule__RuleIntersect__Group_8__1
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
    // InternalBurst.g:2932:1: rule__RuleIntersect__Group_8__0__Impl : ( ( rule__RuleIntersect__LinesAssignment_8_0 ) ) ;
    public final void rule__RuleIntersect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2936:1: ( ( ( rule__RuleIntersect__LinesAssignment_8_0 ) ) )
            // InternalBurst.g:2937:1: ( ( rule__RuleIntersect__LinesAssignment_8_0 ) )
            {
            // InternalBurst.g:2937:1: ( ( rule__RuleIntersect__LinesAssignment_8_0 ) )
            // InternalBurst.g:2938:2: ( rule__RuleIntersect__LinesAssignment_8_0 )
            {
             before(grammarAccess.getRuleIntersectAccess().getLinesAssignment_8_0()); 
            // InternalBurst.g:2939:2: ( rule__RuleIntersect__LinesAssignment_8_0 )
            // InternalBurst.g:2939:3: rule__RuleIntersect__LinesAssignment_8_0
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
    // InternalBurst.g:2947:1: rule__RuleIntersect__Group_8__1 : rule__RuleIntersect__Group_8__1__Impl ;
    public final void rule__RuleIntersect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2951:1: ( rule__RuleIntersect__Group_8__1__Impl )
            // InternalBurst.g:2952:2: rule__RuleIntersect__Group_8__1__Impl
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
    // InternalBurst.g:2958:1: rule__RuleIntersect__Group_8__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__RuleIntersect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2962:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2963:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2963:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2964:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2964:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2965:3: ( RULE_ENDLINE )
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 
            // InternalBurst.g:2966:3: ( RULE_ENDLINE )
            // InternalBurst.g:2966:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); 

            }

             after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 

            }

            // InternalBurst.g:2969:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2970:3: ( RULE_ENDLINE )*
            {
             before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1()); 
            // InternalBurst.g:2971:3: ( RULE_ENDLINE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ENDLINE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBurst.g:2971:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop42;
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalBurst.g:2981:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2985:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalBurst.g:2986:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalBurst.g:2993:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2997:1: ( ( () ) )
            // InternalBurst.g:2998:1: ( () )
            {
            // InternalBurst.g:2998:1: ( () )
            // InternalBurst.g:2999:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalBurst.g:3000:2: ()
            // InternalBurst.g:3000:3: 
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
    // InternalBurst.g:3008:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3012:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalBurst.g:3013:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalBurst.g:3020:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3024:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // InternalBurst.g:3025:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // InternalBurst.g:3025:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // InternalBurst.g:3026:2: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // InternalBurst.g:3027:2: ( rule__Parameter__TypeAssignment_1 )
            // InternalBurst.g:3027:3: rule__Parameter__TypeAssignment_1
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
    // InternalBurst.g:3035:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3039:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalBurst.g:3040:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBurst.g:3047:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3051:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalBurst.g:3052:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:3052:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalBurst.g:3053:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalBurst.g:3054:2: ( rule__Parameter__NameAssignment_2 )
            // InternalBurst.g:3054:3: rule__Parameter__NameAssignment_2
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
    // InternalBurst.g:3062:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3066:1: ( rule__Parameter__Group__3__Impl )
            // InternalBurst.g:3067:2: rule__Parameter__Group__3__Impl
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
    // InternalBurst.g:3073:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3077:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // InternalBurst.g:3078:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // InternalBurst.g:3078:1: ( ( rule__Parameter__Group_3__0 )? )
            // InternalBurst.g:3079:2: ( rule__Parameter__Group_3__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_3()); 
            // InternalBurst.g:3080:2: ( rule__Parameter__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBurst.g:3080:3: rule__Parameter__Group_3__0
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
    // InternalBurst.g:3089:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3093:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // InternalBurst.g:3094:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
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
    // InternalBurst.g:3101:1: rule__Parameter__Group_3__0__Impl : ( ( rule__Parameter__UsageAssignment_3_0 ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3105:1: ( ( ( rule__Parameter__UsageAssignment_3_0 ) ) )
            // InternalBurst.g:3106:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            {
            // InternalBurst.g:3106:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            // InternalBurst.g:3107:2: ( rule__Parameter__UsageAssignment_3_0 )
            {
             before(grammarAccess.getParameterAccess().getUsageAssignment_3_0()); 
            // InternalBurst.g:3108:2: ( rule__Parameter__UsageAssignment_3_0 )
            // InternalBurst.g:3108:3: rule__Parameter__UsageAssignment_3_0
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
    // InternalBurst.g:3116:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3120:1: ( rule__Parameter__Group_3__1__Impl )
            // InternalBurst.g:3121:2: rule__Parameter__Group_3__1__Impl
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
    // InternalBurst.g:3127:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__RoleAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3131:1: ( ( ( rule__Parameter__RoleAssignment_3_1 ) ) )
            // InternalBurst.g:3132:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            {
            // InternalBurst.g:3132:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            // InternalBurst.g:3133:2: ( rule__Parameter__RoleAssignment_3_1 )
            {
             before(grammarAccess.getParameterAccess().getRoleAssignment_3_1()); 
            // InternalBurst.g:3134:2: ( rule__Parameter__RoleAssignment_3_1 )
            // InternalBurst.g:3134:3: rule__Parameter__RoleAssignment_3_1
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
    // InternalBurst.g:3143:1: rule__WithParameter__Group__0 : rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 ;
    public final void rule__WithParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3147:1: ( rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 )
            // InternalBurst.g:3148:2: rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1
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
    // InternalBurst.g:3155:1: rule__WithParameter__Group__0__Impl : ( () ) ;
    public final void rule__WithParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3159:1: ( ( () ) )
            // InternalBurst.g:3160:1: ( () )
            {
            // InternalBurst.g:3160:1: ( () )
            // InternalBurst.g:3161:2: ()
            {
             before(grammarAccess.getWithParameterAccess().getWithParameterAction_0()); 
            // InternalBurst.g:3162:2: ()
            // InternalBurst.g:3162:3: 
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
    // InternalBurst.g:3170:1: rule__WithParameter__Group__1 : rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 ;
    public final void rule__WithParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3174:1: ( rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 )
            // InternalBurst.g:3175:2: rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalBurst.g:3182:1: rule__WithParameter__Group__1__Impl : ( ( rule__WithParameter__NameAssignment_1 ) ) ;
    public final void rule__WithParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3186:1: ( ( ( rule__WithParameter__NameAssignment_1 ) ) )
            // InternalBurst.g:3187:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            {
            // InternalBurst.g:3187:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            // InternalBurst.g:3188:2: ( rule__WithParameter__NameAssignment_1 )
            {
             before(grammarAccess.getWithParameterAccess().getNameAssignment_1()); 
            // InternalBurst.g:3189:2: ( rule__WithParameter__NameAssignment_1 )
            // InternalBurst.g:3189:3: rule__WithParameter__NameAssignment_1
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
    // InternalBurst.g:3197:1: rule__WithParameter__Group__2 : rule__WithParameter__Group__2__Impl ;
    public final void rule__WithParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3201:1: ( rule__WithParameter__Group__2__Impl )
            // InternalBurst.g:3202:2: rule__WithParameter__Group__2__Impl
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
    // InternalBurst.g:3208:1: rule__WithParameter__Group__2__Impl : ( ( rule__WithParameter__Group_2__0 )? ) ;
    public final void rule__WithParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3212:1: ( ( ( rule__WithParameter__Group_2__0 )? ) )
            // InternalBurst.g:3213:1: ( ( rule__WithParameter__Group_2__0 )? )
            {
            // InternalBurst.g:3213:1: ( ( rule__WithParameter__Group_2__0 )? )
            // InternalBurst.g:3214:2: ( rule__WithParameter__Group_2__0 )?
            {
             before(grammarAccess.getWithParameterAccess().getGroup_2()); 
            // InternalBurst.g:3215:2: ( rule__WithParameter__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBurst.g:3215:3: rule__WithParameter__Group_2__0
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
    // InternalBurst.g:3224:1: rule__WithParameter__Group_2__0 : rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 ;
    public final void rule__WithParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3228:1: ( rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 )
            // InternalBurst.g:3229:2: rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1
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
    // InternalBurst.g:3236:1: rule__WithParameter__Group_2__0__Impl : ( ( rule__WithParameter__UsageAssignment_2_0 ) ) ;
    public final void rule__WithParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3240:1: ( ( ( rule__WithParameter__UsageAssignment_2_0 ) ) )
            // InternalBurst.g:3241:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            {
            // InternalBurst.g:3241:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            // InternalBurst.g:3242:2: ( rule__WithParameter__UsageAssignment_2_0 )
            {
             before(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0()); 
            // InternalBurst.g:3243:2: ( rule__WithParameter__UsageAssignment_2_0 )
            // InternalBurst.g:3243:3: rule__WithParameter__UsageAssignment_2_0
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
    // InternalBurst.g:3251:1: rule__WithParameter__Group_2__1 : rule__WithParameter__Group_2__1__Impl ;
    public final void rule__WithParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3255:1: ( rule__WithParameter__Group_2__1__Impl )
            // InternalBurst.g:3256:2: rule__WithParameter__Group_2__1__Impl
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
    // InternalBurst.g:3262:1: rule__WithParameter__Group_2__1__Impl : ( ( rule__WithParameter__RoleAssignment_2_1 ) ) ;
    public final void rule__WithParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3266:1: ( ( ( rule__WithParameter__RoleAssignment_2_1 ) ) )
            // InternalBurst.g:3267:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            {
            // InternalBurst.g:3267:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            // InternalBurst.g:3268:2: ( rule__WithParameter__RoleAssignment_2_1 )
            {
             before(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1()); 
            // InternalBurst.g:3269:2: ( rule__WithParameter__RoleAssignment_2_1 )
            // InternalBurst.g:3269:3: rule__WithParameter__RoleAssignment_2_1
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


    // $ANTLR start "rule__ContextManagement__Group__0"
    // InternalBurst.g:3278:1: rule__ContextManagement__Group__0 : rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 ;
    public final void rule__ContextManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3282:1: ( rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 )
            // InternalBurst.g:3283:2: rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ContextManagement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__0"


    // $ANTLR start "rule__ContextManagement__Group__0__Impl"
    // InternalBurst.g:3290:1: rule__ContextManagement__Group__0__Impl : ( () ) ;
    public final void rule__ContextManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3294:1: ( ( () ) )
            // InternalBurst.g:3295:1: ( () )
            {
            // InternalBurst.g:3295:1: ( () )
            // InternalBurst.g:3296:2: ()
            {
             before(grammarAccess.getContextManagementAccess().getContextManagementAction_0()); 
            // InternalBurst.g:3297:2: ()
            // InternalBurst.g:3297:3: 
            {
            }

             after(grammarAccess.getContextManagementAccess().getContextManagementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__0__Impl"


    // $ANTLR start "rule__ContextManagement__Group__1"
    // InternalBurst.g:3305:1: rule__ContextManagement__Group__1 : rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 ;
    public final void rule__ContextManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3309:1: ( rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 )
            // InternalBurst.g:3310:2: rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ContextManagement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__1"


    // $ANTLR start "rule__ContextManagement__Group__1__Impl"
    // InternalBurst.g:3317:1: rule__ContextManagement__Group__1__Impl : ( ( rule__ContextManagement__ActionAssignment_1 ) ) ;
    public final void rule__ContextManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3321:1: ( ( ( rule__ContextManagement__ActionAssignment_1 ) ) )
            // InternalBurst.g:3322:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            {
            // InternalBurst.g:3322:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            // InternalBurst.g:3323:2: ( rule__ContextManagement__ActionAssignment_1 )
            {
             before(grammarAccess.getContextManagementAccess().getActionAssignment_1()); 
            // InternalBurst.g:3324:2: ( rule__ContextManagement__ActionAssignment_1 )
            // InternalBurst.g:3324:3: rule__ContextManagement__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextManagementAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__1__Impl"


    // $ANTLR start "rule__ContextManagement__Group__2"
    // InternalBurst.g:3332:1: rule__ContextManagement__Group__2 : rule__ContextManagement__Group__2__Impl ;
    public final void rule__ContextManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3336:1: ( rule__ContextManagement__Group__2__Impl )
            // InternalBurst.g:3337:2: rule__ContextManagement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__2"


    // $ANTLR start "rule__ContextManagement__Group__2__Impl"
    // InternalBurst.g:3343:1: rule__ContextManagement__Group__2__Impl : ( ( rule__ContextManagement__TargetAssignment_2 ) ) ;
    public final void rule__ContextManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3347:1: ( ( ( rule__ContextManagement__TargetAssignment_2 ) ) )
            // InternalBurst.g:3348:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            {
            // InternalBurst.g:3348:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            // InternalBurst.g:3349:2: ( rule__ContextManagement__TargetAssignment_2 )
            {
             before(grammarAccess.getContextManagementAccess().getTargetAssignment_2()); 
            // InternalBurst.g:3350:2: ( rule__ContextManagement__TargetAssignment_2 )
            // InternalBurst.g:3350:3: rule__ContextManagement__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextManagementAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // InternalBurst.g:3359:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3363:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalBurst.g:3364:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // InternalBurst.g:3371:1: rule__Call__Group__0__Impl : ( ( ( rule__Call__ContentAssignment_0 ) ) ( ( rule__Call__ContentAssignment_0 )* ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3375:1: ( ( ( ( rule__Call__ContentAssignment_0 ) ) ( ( rule__Call__ContentAssignment_0 )* ) ) )
            // InternalBurst.g:3376:1: ( ( ( rule__Call__ContentAssignment_0 ) ) ( ( rule__Call__ContentAssignment_0 )* ) )
            {
            // InternalBurst.g:3376:1: ( ( ( rule__Call__ContentAssignment_0 ) ) ( ( rule__Call__ContentAssignment_0 )* ) )
            // InternalBurst.g:3377:2: ( ( rule__Call__ContentAssignment_0 ) ) ( ( rule__Call__ContentAssignment_0 )* )
            {
            // InternalBurst.g:3377:2: ( ( rule__Call__ContentAssignment_0 ) )
            // InternalBurst.g:3378:3: ( rule__Call__ContentAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getContentAssignment_0()); 
            // InternalBurst.g:3379:3: ( rule__Call__ContentAssignment_0 )
            // InternalBurst.g:3379:4: rule__Call__ContentAssignment_0
            {
            pushFollow(FOLLOW_33);
            rule__Call__ContentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getContentAssignment_0()); 

            }

            // InternalBurst.g:3382:2: ( ( rule__Call__ContentAssignment_0 )* )
            // InternalBurst.g:3383:3: ( rule__Call__ContentAssignment_0 )*
            {
             before(grammarAccess.getCallAccess().getContentAssignment_0()); 
            // InternalBurst.g:3384:3: ( rule__Call__ContentAssignment_0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID||LA45_0==26||LA45_0==29) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBurst.g:3384:4: rule__Call__ContentAssignment_0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Call__ContentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getContentAssignment_0()); 

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
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // InternalBurst.g:3393:1: rule__Call__Group__1 : rule__Call__Group__1__Impl ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3397:1: ( rule__Call__Group__1__Impl )
            // InternalBurst.g:3398:2: rule__Call__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // InternalBurst.g:3404:1: rule__Call__Group__1__Impl : ( ( rule__Call__Group_1__0 )? ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3408:1: ( ( ( rule__Call__Group_1__0 )? ) )
            // InternalBurst.g:3409:1: ( ( rule__Call__Group_1__0 )? )
            {
            // InternalBurst.g:3409:1: ( ( rule__Call__Group_1__0 )? )
            // InternalBurst.g:3410:2: ( rule__Call__Group_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_1()); 
            // InternalBurst.g:3411:2: ( rule__Call__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBurst.g:3411:3: rule__Call__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Call__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group_1__0"
    // InternalBurst.g:3420:1: rule__Call__Group_1__0 : rule__Call__Group_1__0__Impl rule__Call__Group_1__1 ;
    public final void rule__Call__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3424:1: ( rule__Call__Group_1__0__Impl rule__Call__Group_1__1 )
            // InternalBurst.g:3425:2: rule__Call__Group_1__0__Impl rule__Call__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Call__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_1__0"


    // $ANTLR start "rule__Call__Group_1__0__Impl"
    // InternalBurst.g:3432:1: rule__Call__Group_1__0__Impl : ( ( rule__Call__EqualityAssignment_1_0 ) ) ;
    public final void rule__Call__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3436:1: ( ( ( rule__Call__EqualityAssignment_1_0 ) ) )
            // InternalBurst.g:3437:1: ( ( rule__Call__EqualityAssignment_1_0 ) )
            {
            // InternalBurst.g:3437:1: ( ( rule__Call__EqualityAssignment_1_0 ) )
            // InternalBurst.g:3438:2: ( rule__Call__EqualityAssignment_1_0 )
            {
             before(grammarAccess.getCallAccess().getEqualityAssignment_1_0()); 
            // InternalBurst.g:3439:2: ( rule__Call__EqualityAssignment_1_0 )
            // InternalBurst.g:3439:3: rule__Call__EqualityAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Call__EqualityAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getEqualityAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_1__0__Impl"


    // $ANTLR start "rule__Call__Group_1__1"
    // InternalBurst.g:3447:1: rule__Call__Group_1__1 : rule__Call__Group_1__1__Impl ;
    public final void rule__Call__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3451:1: ( rule__Call__Group_1__1__Impl )
            // InternalBurst.g:3452:2: rule__Call__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_1__1"


    // $ANTLR start "rule__Call__Group_1__1__Impl"
    // InternalBurst.g:3458:1: rule__Call__Group_1__1__Impl : ( ( ( rule__Call__SourceAssignment_1_1 ) ) ( ( rule__Call__SourceAssignment_1_1 )* ) ) ;
    public final void rule__Call__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3462:1: ( ( ( ( rule__Call__SourceAssignment_1_1 ) ) ( ( rule__Call__SourceAssignment_1_1 )* ) ) )
            // InternalBurst.g:3463:1: ( ( ( rule__Call__SourceAssignment_1_1 ) ) ( ( rule__Call__SourceAssignment_1_1 )* ) )
            {
            // InternalBurst.g:3463:1: ( ( ( rule__Call__SourceAssignment_1_1 ) ) ( ( rule__Call__SourceAssignment_1_1 )* ) )
            // InternalBurst.g:3464:2: ( ( rule__Call__SourceAssignment_1_1 ) ) ( ( rule__Call__SourceAssignment_1_1 )* )
            {
            // InternalBurst.g:3464:2: ( ( rule__Call__SourceAssignment_1_1 ) )
            // InternalBurst.g:3465:3: ( rule__Call__SourceAssignment_1_1 )
            {
             before(grammarAccess.getCallAccess().getSourceAssignment_1_1()); 
            // InternalBurst.g:3466:3: ( rule__Call__SourceAssignment_1_1 )
            // InternalBurst.g:3466:4: rule__Call__SourceAssignment_1_1
            {
            pushFollow(FOLLOW_33);
            rule__Call__SourceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getSourceAssignment_1_1()); 

            }

            // InternalBurst.g:3469:2: ( ( rule__Call__SourceAssignment_1_1 )* )
            // InternalBurst.g:3470:3: ( rule__Call__SourceAssignment_1_1 )*
            {
             before(grammarAccess.getCallAccess().getSourceAssignment_1_1()); 
            // InternalBurst.g:3471:3: ( rule__Call__SourceAssignment_1_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==26||LA47_0==29) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:3471:4: rule__Call__SourceAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Call__SourceAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getSourceAssignment_1_1()); 

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
    // $ANTLR end "rule__Call__Group_1__1__Impl"


    // $ANTLR start "rule__Locale__Group__0"
    // InternalBurst.g:3481:1: rule__Locale__Group__0 : rule__Locale__Group__0__Impl rule__Locale__Group__1 ;
    public final void rule__Locale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3485:1: ( rule__Locale__Group__0__Impl rule__Locale__Group__1 )
            // InternalBurst.g:3486:2: rule__Locale__Group__0__Impl rule__Locale__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBurst.g:3493:1: rule__Locale__Group__0__Impl : ( () ) ;
    public final void rule__Locale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3497:1: ( ( () ) )
            // InternalBurst.g:3498:1: ( () )
            {
            // InternalBurst.g:3498:1: ( () )
            // InternalBurst.g:3499:2: ()
            {
             before(grammarAccess.getLocaleAccess().getLocaleAction_0()); 
            // InternalBurst.g:3500:2: ()
            // InternalBurst.g:3500:3: 
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
    // InternalBurst.g:3508:1: rule__Locale__Group__1 : rule__Locale__Group__1__Impl rule__Locale__Group__2 ;
    public final void rule__Locale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3512:1: ( rule__Locale__Group__1__Impl rule__Locale__Group__2 )
            // InternalBurst.g:3513:2: rule__Locale__Group__1__Impl rule__Locale__Group__2
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
    // InternalBurst.g:3520:1: rule__Locale__Group__1__Impl : ( 'new' ) ;
    public final void rule__Locale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3524:1: ( ( 'new' ) )
            // InternalBurst.g:3525:1: ( 'new' )
            {
            // InternalBurst.g:3525:1: ( 'new' )
            // InternalBurst.g:3526:2: 'new'
            {
             before(grammarAccess.getLocaleAccess().getNewKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBurst.g:3535:1: rule__Locale__Group__2 : rule__Locale__Group__2__Impl rule__Locale__Group__3 ;
    public final void rule__Locale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3539:1: ( rule__Locale__Group__2__Impl rule__Locale__Group__3 )
            // InternalBurst.g:3540:2: rule__Locale__Group__2__Impl rule__Locale__Group__3
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
    // InternalBurst.g:3547:1: rule__Locale__Group__2__Impl : ( ( rule__Locale__TypeAssignment_2 ) ) ;
    public final void rule__Locale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3551:1: ( ( ( rule__Locale__TypeAssignment_2 ) ) )
            // InternalBurst.g:3552:1: ( ( rule__Locale__TypeAssignment_2 ) )
            {
            // InternalBurst.g:3552:1: ( ( rule__Locale__TypeAssignment_2 ) )
            // InternalBurst.g:3553:2: ( rule__Locale__TypeAssignment_2 )
            {
             before(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 
            // InternalBurst.g:3554:2: ( rule__Locale__TypeAssignment_2 )
            // InternalBurst.g:3554:3: rule__Locale__TypeAssignment_2
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
    // InternalBurst.g:3562:1: rule__Locale__Group__3 : rule__Locale__Group__3__Impl rule__Locale__Group__4 ;
    public final void rule__Locale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3566:1: ( rule__Locale__Group__3__Impl rule__Locale__Group__4 )
            // InternalBurst.g:3567:2: rule__Locale__Group__3__Impl rule__Locale__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Locale__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locale__Group__4();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:3574:1: rule__Locale__Group__3__Impl : ( ( rule__Locale__NameAssignment_3 ) ) ;
    public final void rule__Locale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3578:1: ( ( ( rule__Locale__NameAssignment_3 ) ) )
            // InternalBurst.g:3579:1: ( ( rule__Locale__NameAssignment_3 ) )
            {
            // InternalBurst.g:3579:1: ( ( rule__Locale__NameAssignment_3 ) )
            // InternalBurst.g:3580:2: ( rule__Locale__NameAssignment_3 )
            {
             before(grammarAccess.getLocaleAccess().getNameAssignment_3()); 
            // InternalBurst.g:3581:2: ( rule__Locale__NameAssignment_3 )
            // InternalBurst.g:3581:3: rule__Locale__NameAssignment_3
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


    // $ANTLR start "rule__Locale__Group__4"
    // InternalBurst.g:3589:1: rule__Locale__Group__4 : rule__Locale__Group__4__Impl ;
    public final void rule__Locale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3593:1: ( rule__Locale__Group__4__Impl )
            // InternalBurst.g:3594:2: rule__Locale__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__4"


    // $ANTLR start "rule__Locale__Group__4__Impl"
    // InternalBurst.g:3600:1: rule__Locale__Group__4__Impl : ( ( rule__Locale__Group_4__0 )* ) ;
    public final void rule__Locale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3604:1: ( ( ( rule__Locale__Group_4__0 )* ) )
            // InternalBurst.g:3605:1: ( ( rule__Locale__Group_4__0 )* )
            {
            // InternalBurst.g:3605:1: ( ( rule__Locale__Group_4__0 )* )
            // InternalBurst.g:3606:2: ( rule__Locale__Group_4__0 )*
            {
             before(grammarAccess.getLocaleAccess().getGroup_4()); 
            // InternalBurst.g:3607:2: ( rule__Locale__Group_4__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==27) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBurst.g:3607:3: rule__Locale__Group_4__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Locale__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getLocaleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group__4__Impl"


    // $ANTLR start "rule__Locale__Group_4__0"
    // InternalBurst.g:3616:1: rule__Locale__Group_4__0 : rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 ;
    public final void rule__Locale__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3620:1: ( rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 )
            // InternalBurst.g:3621:2: rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locale__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group_4__0"


    // $ANTLR start "rule__Locale__Group_4__0__Impl"
    // InternalBurst.g:3628:1: rule__Locale__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Locale__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3632:1: ( ( ':' ) )
            // InternalBurst.g:3633:1: ( ':' )
            {
            // InternalBurst.g:3633:1: ( ':' )
            // InternalBurst.g:3634:2: ':'
            {
             before(grammarAccess.getLocaleAccess().getColonKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocaleAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group_4__0__Impl"


    // $ANTLR start "rule__Locale__Group_4__1"
    // InternalBurst.g:3643:1: rule__Locale__Group_4__1 : rule__Locale__Group_4__1__Impl ;
    public final void rule__Locale__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3647:1: ( rule__Locale__Group_4__1__Impl )
            // InternalBurst.g:3648:2: rule__Locale__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group_4__1"


    // $ANTLR start "rule__Locale__Group_4__1__Impl"
    // InternalBurst.g:3654:1: rule__Locale__Group_4__1__Impl : ( ( rule__Locale__RolesAssignment_4_1 ) ) ;
    public final void rule__Locale__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3658:1: ( ( ( rule__Locale__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:3659:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:3659:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            // InternalBurst.g:3660:2: ( rule__Locale__RolesAssignment_4_1 )
            {
             before(grammarAccess.getLocaleAccess().getRolesAssignment_4_1()); 
            // InternalBurst.g:3661:2: ( rule__Locale__RolesAssignment_4_1 )
            // InternalBurst.g:3661:3: rule__Locale__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Locale__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLocaleAccess().getRolesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Group_4__1__Impl"


    // $ANTLR start "rule__Access__Group__0"
    // InternalBurst.g:3670:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3674:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalBurst.g:3675:2: rule__Access__Group__0__Impl rule__Access__Group__1
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
    // InternalBurst.g:3682:1: rule__Access__Group__0__Impl : ( () ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3686:1: ( ( () ) )
            // InternalBurst.g:3687:1: ( () )
            {
            // InternalBurst.g:3687:1: ( () )
            // InternalBurst.g:3688:2: ()
            {
             before(grammarAccess.getAccessAccess().getAccessAction_0()); 
            // InternalBurst.g:3689:2: ()
            // InternalBurst.g:3689:3: 
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
    // InternalBurst.g:3697:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3701:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalBurst.g:3702:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalBurst.g:3709:1: rule__Access__Group__1__Impl : ( ( rule__Access__NameAssignment_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3713:1: ( ( ( rule__Access__NameAssignment_1 ) ) )
            // InternalBurst.g:3714:1: ( ( rule__Access__NameAssignment_1 ) )
            {
            // InternalBurst.g:3714:1: ( ( rule__Access__NameAssignment_1 ) )
            // InternalBurst.g:3715:2: ( rule__Access__NameAssignment_1 )
            {
             before(grammarAccess.getAccessAccess().getNameAssignment_1()); 
            // InternalBurst.g:3716:2: ( rule__Access__NameAssignment_1 )
            // InternalBurst.g:3716:3: rule__Access__NameAssignment_1
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
    // InternalBurst.g:3724:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3728:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalBurst.g:3729:2: rule__Access__Group__2__Impl rule__Access__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBurst.g:3736:1: rule__Access__Group__2__Impl : ( ( rule__Access__Group_2__0 )* ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3740:1: ( ( ( rule__Access__Group_2__0 )* ) )
            // InternalBurst.g:3741:1: ( ( rule__Access__Group_2__0 )* )
            {
            // InternalBurst.g:3741:1: ( ( rule__Access__Group_2__0 )* )
            // InternalBurst.g:3742:2: ( rule__Access__Group_2__0 )*
            {
             before(grammarAccess.getAccessAccess().getGroup_2()); 
            // InternalBurst.g:3743:2: ( rule__Access__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==28) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBurst.g:3743:3: rule__Access__Group_2__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Access__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalBurst.g:3751:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3755:1: ( rule__Access__Group__3__Impl )
            // InternalBurst.g:3756:2: rule__Access__Group__3__Impl
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
    // InternalBurst.g:3762:1: rule__Access__Group__3__Impl : ( ( rule__Access__Group_3__0 )* ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3766:1: ( ( ( rule__Access__Group_3__0 )* ) )
            // InternalBurst.g:3767:1: ( ( rule__Access__Group_3__0 )* )
            {
            // InternalBurst.g:3767:1: ( ( rule__Access__Group_3__0 )* )
            // InternalBurst.g:3768:2: ( rule__Access__Group_3__0 )*
            {
             before(grammarAccess.getAccessAccess().getGroup_3()); 
            // InternalBurst.g:3769:2: ( rule__Access__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBurst.g:3769:3: rule__Access__Group_3__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Access__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

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
    // InternalBurst.g:3778:1: rule__Access__Group_2__0 : rule__Access__Group_2__0__Impl rule__Access__Group_2__1 ;
    public final void rule__Access__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3782:1: ( rule__Access__Group_2__0__Impl rule__Access__Group_2__1 )
            // InternalBurst.g:3783:2: rule__Access__Group_2__0__Impl rule__Access__Group_2__1
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
    // InternalBurst.g:3790:1: rule__Access__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Access__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3794:1: ( ( '.' ) )
            // InternalBurst.g:3795:1: ( '.' )
            {
            // InternalBurst.g:3795:1: ( '.' )
            // InternalBurst.g:3796:2: '.'
            {
             before(grammarAccess.getAccessAccess().getFullStopKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBurst.g:3805:1: rule__Access__Group_2__1 : rule__Access__Group_2__1__Impl ;
    public final void rule__Access__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3809:1: ( rule__Access__Group_2__1__Impl )
            // InternalBurst.g:3810:2: rule__Access__Group_2__1__Impl
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
    // InternalBurst.g:3816:1: rule__Access__Group_2__1__Impl : ( ( rule__Access__MembersAssignment_2_1 ) ) ;
    public final void rule__Access__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3820:1: ( ( ( rule__Access__MembersAssignment_2_1 ) ) )
            // InternalBurst.g:3821:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            {
            // InternalBurst.g:3821:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            // InternalBurst.g:3822:2: ( rule__Access__MembersAssignment_2_1 )
            {
             before(grammarAccess.getAccessAccess().getMembersAssignment_2_1()); 
            // InternalBurst.g:3823:2: ( rule__Access__MembersAssignment_2_1 )
            // InternalBurst.g:3823:3: rule__Access__MembersAssignment_2_1
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
    // InternalBurst.g:3832:1: rule__Access__Group_3__0 : rule__Access__Group_3__0__Impl rule__Access__Group_3__1 ;
    public final void rule__Access__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3836:1: ( rule__Access__Group_3__0__Impl rule__Access__Group_3__1 )
            // InternalBurst.g:3837:2: rule__Access__Group_3__0__Impl rule__Access__Group_3__1
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
    // InternalBurst.g:3844:1: rule__Access__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Access__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3848:1: ( ( ':' ) )
            // InternalBurst.g:3849:1: ( ':' )
            {
            // InternalBurst.g:3849:1: ( ':' )
            // InternalBurst.g:3850:2: ':'
            {
             before(grammarAccess.getAccessAccess().getColonKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBurst.g:3859:1: rule__Access__Group_3__1 : rule__Access__Group_3__1__Impl ;
    public final void rule__Access__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3863:1: ( rule__Access__Group_3__1__Impl )
            // InternalBurst.g:3864:2: rule__Access__Group_3__1__Impl
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
    // InternalBurst.g:3870:1: rule__Access__Group_3__1__Impl : ( ( rule__Access__RolesAssignment_3_1 ) ) ;
    public final void rule__Access__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3874:1: ( ( ( rule__Access__RolesAssignment_3_1 ) ) )
            // InternalBurst.g:3875:1: ( ( rule__Access__RolesAssignment_3_1 ) )
            {
            // InternalBurst.g:3875:1: ( ( rule__Access__RolesAssignment_3_1 ) )
            // InternalBurst.g:3876:2: ( rule__Access__RolesAssignment_3_1 )
            {
             before(grammarAccess.getAccessAccess().getRolesAssignment_3_1()); 
            // InternalBurst.g:3877:2: ( rule__Access__RolesAssignment_3_1 )
            // InternalBurst.g:3877:3: rule__Access__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__RolesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getRolesAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubCall__Group__0"
    // InternalBurst.g:3886:1: rule__SubCall__Group__0 : rule__SubCall__Group__0__Impl rule__SubCall__Group__1 ;
    public final void rule__SubCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3890:1: ( rule__SubCall__Group__0__Impl rule__SubCall__Group__1 )
            // InternalBurst.g:3891:2: rule__SubCall__Group__0__Impl rule__SubCall__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBurst.g:3898:1: rule__SubCall__Group__0__Impl : ( () ) ;
    public final void rule__SubCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3902:1: ( ( () ) )
            // InternalBurst.g:3903:1: ( () )
            {
            // InternalBurst.g:3903:1: ( () )
            // InternalBurst.g:3904:2: ()
            {
             before(grammarAccess.getSubCallAccess().getSubCallAction_0()); 
            // InternalBurst.g:3905:2: ()
            // InternalBurst.g:3905:3: 
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
    // InternalBurst.g:3913:1: rule__SubCall__Group__1 : rule__SubCall__Group__1__Impl rule__SubCall__Group__2 ;
    public final void rule__SubCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3917:1: ( rule__SubCall__Group__1__Impl rule__SubCall__Group__2 )
            // InternalBurst.g:3918:2: rule__SubCall__Group__1__Impl rule__SubCall__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:3925:1: rule__SubCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SubCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3929:1: ( ( '(' ) )
            // InternalBurst.g:3930:1: ( '(' )
            {
            // InternalBurst.g:3930:1: ( '(' )
            // InternalBurst.g:3931:2: '('
            {
             before(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBurst.g:3940:1: rule__SubCall__Group__2 : rule__SubCall__Group__2__Impl rule__SubCall__Group__3 ;
    public final void rule__SubCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3944:1: ( rule__SubCall__Group__2__Impl rule__SubCall__Group__3 )
            // InternalBurst.g:3945:2: rule__SubCall__Group__2__Impl rule__SubCall__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalBurst.g:3952:1: rule__SubCall__Group__2__Impl : ( ( rule__SubCall__NameAssignment_2 ) ) ;
    public final void rule__SubCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3956:1: ( ( ( rule__SubCall__NameAssignment_2 ) ) )
            // InternalBurst.g:3957:1: ( ( rule__SubCall__NameAssignment_2 ) )
            {
            // InternalBurst.g:3957:1: ( ( rule__SubCall__NameAssignment_2 ) )
            // InternalBurst.g:3958:2: ( rule__SubCall__NameAssignment_2 )
            {
             before(grammarAccess.getSubCallAccess().getNameAssignment_2()); 
            // InternalBurst.g:3959:2: ( rule__SubCall__NameAssignment_2 )
            // InternalBurst.g:3959:3: rule__SubCall__NameAssignment_2
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
    // InternalBurst.g:3967:1: rule__SubCall__Group__3 : rule__SubCall__Group__3__Impl rule__SubCall__Group__4 ;
    public final void rule__SubCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3971:1: ( rule__SubCall__Group__3__Impl rule__SubCall__Group__4 )
            // InternalBurst.g:3972:2: rule__SubCall__Group__3__Impl rule__SubCall__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__SubCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCall__Group__4();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:3979:1: rule__SubCall__Group__3__Impl : ( ')' ) ;
    public final void rule__SubCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3983:1: ( ( ')' ) )
            // InternalBurst.g:3984:1: ( ')' )
            {
            // InternalBurst.g:3984:1: ( ')' )
            // InternalBurst.g:3985:2: ')'
            {
             before(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__SubCall__Group__4"
    // InternalBurst.g:3994:1: rule__SubCall__Group__4 : rule__SubCall__Group__4__Impl ;
    public final void rule__SubCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3998:1: ( rule__SubCall__Group__4__Impl )
            // InternalBurst.g:3999:2: rule__SubCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__4"


    // $ANTLR start "rule__SubCall__Group__4__Impl"
    // InternalBurst.g:4005:1: rule__SubCall__Group__4__Impl : ( ( rule__SubCall__Group_4__0 )* ) ;
    public final void rule__SubCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4009:1: ( ( ( rule__SubCall__Group_4__0 )* ) )
            // InternalBurst.g:4010:1: ( ( rule__SubCall__Group_4__0 )* )
            {
            // InternalBurst.g:4010:1: ( ( rule__SubCall__Group_4__0 )* )
            // InternalBurst.g:4011:2: ( rule__SubCall__Group_4__0 )*
            {
             before(grammarAccess.getSubCallAccess().getGroup_4()); 
            // InternalBurst.g:4012:2: ( rule__SubCall__Group_4__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==27) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBurst.g:4012:3: rule__SubCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__SubCall__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getSubCallAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group__4__Impl"


    // $ANTLR start "rule__SubCall__Group_4__0"
    // InternalBurst.g:4021:1: rule__SubCall__Group_4__0 : rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 ;
    public final void rule__SubCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4025:1: ( rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 )
            // InternalBurst.g:4026:2: rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__SubCall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubCall__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group_4__0"


    // $ANTLR start "rule__SubCall__Group_4__0__Impl"
    // InternalBurst.g:4033:1: rule__SubCall__Group_4__0__Impl : ( ':' ) ;
    public final void rule__SubCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4037:1: ( ( ':' ) )
            // InternalBurst.g:4038:1: ( ':' )
            {
            // InternalBurst.g:4038:1: ( ':' )
            // InternalBurst.g:4039:2: ':'
            {
             before(grammarAccess.getSubCallAccess().getColonKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubCallAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group_4__0__Impl"


    // $ANTLR start "rule__SubCall__Group_4__1"
    // InternalBurst.g:4048:1: rule__SubCall__Group_4__1 : rule__SubCall__Group_4__1__Impl ;
    public final void rule__SubCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4052:1: ( rule__SubCall__Group_4__1__Impl )
            // InternalBurst.g:4053:2: rule__SubCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group_4__1"


    // $ANTLR start "rule__SubCall__Group_4__1__Impl"
    // InternalBurst.g:4059:1: rule__SubCall__Group_4__1__Impl : ( ( rule__SubCall__RolesAssignment_4_1 ) ) ;
    public final void rule__SubCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4063:1: ( ( ( rule__SubCall__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:4064:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:4064:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            // InternalBurst.g:4065:2: ( rule__SubCall__RolesAssignment_4_1 )
            {
             before(grammarAccess.getSubCallAccess().getRolesAssignment_4_1()); 
            // InternalBurst.g:4066:2: ( rule__SubCall__RolesAssignment_4_1 )
            // InternalBurst.g:4066:3: rule__SubCall__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__RolesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubCallAccess().getRolesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:4075:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4079:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:4080:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBurst.g:4087:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4091:1: ( ( RULE_ID ) )
            // InternalBurst.g:4092:1: ( RULE_ID )
            {
            // InternalBurst.g:4092:1: ( RULE_ID )
            // InternalBurst.g:4093:2: RULE_ID
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
    // InternalBurst.g:4102:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4106:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:4107:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:4113:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4117:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:4118:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:4118:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:4119:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalBurst.g:4120:2: ( rule__QualifiedName__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBurst.g:4120:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalBurst.g:4129:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4133:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:4134:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:4141:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4145:1: ( ( '.' ) )
            // InternalBurst.g:4146:1: ( '.' )
            {
            // InternalBurst.g:4146:1: ( '.' )
            // InternalBurst.g:4147:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBurst.g:4156:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4160:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:4161:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:4167:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4171:1: ( ( RULE_ID ) )
            // InternalBurst.g:4172:1: ( RULE_ID )
            {
            // InternalBurst.g:4172:1: ( RULE_ID )
            // InternalBurst.g:4173:2: RULE_ID
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
    // InternalBurst.g:4183:1: rule__File__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__File__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4187:1: ( ( ruleImport ) )
            // InternalBurst.g:4188:2: ( ruleImport )
            {
            // InternalBurst.g:4188:2: ( ruleImport )
            // InternalBurst.g:4189:3: ruleImport
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
    // InternalBurst.g:4198:1: rule__File__ElementsAssignment_3_0 : ( ruleFileElement ) ;
    public final void rule__File__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4202:1: ( ( ruleFileElement ) )
            // InternalBurst.g:4203:2: ( ruleFileElement )
            {
            // InternalBurst.g:4203:2: ( ruleFileElement )
            // InternalBurst.g:4204:3: ruleFileElement
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
    // InternalBurst.g:4213:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4217:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4218:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:4218:2: ( ruleQualifiedName )
            // InternalBurst.g:4219:3: ruleQualifiedName
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
    // InternalBurst.g:4228:1: rule__Roles__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Roles__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4232:1: ( ( RULE_ID ) )
            // InternalBurst.g:4233:2: ( RULE_ID )
            {
            // InternalBurst.g:4233:2: ( RULE_ID )
            // InternalBurst.g:4234:3: RULE_ID
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
    // InternalBurst.g:4243:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4247:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4248:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:4248:2: ( ruleQualifiedName )
            // InternalBurst.g:4249:3: ruleQualifiedName
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
    // InternalBurst.g:4258:1: rule__Package__ElementsAssignment_6_0 : ( rulePackageElement ) ;
    public final void rule__Package__ElementsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4262:1: ( ( rulePackageElement ) )
            // InternalBurst.g:4263:2: ( rulePackageElement )
            {
            // InternalBurst.g:4263:2: ( rulePackageElement )
            // InternalBurst.g:4264:3: rulePackageElement
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
    // InternalBurst.g:4273:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4277:1: ( ( RULE_ID ) )
            // InternalBurst.g:4278:2: ( RULE_ID )
            {
            // InternalBurst.g:4278:2: ( RULE_ID )
            // InternalBurst.g:4279:3: RULE_ID
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
    // InternalBurst.g:4288:1: rule__Concern__ElementsAssignment_3_3_0 : ( ruleConcernElement ) ;
    public final void rule__Concern__ElementsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4292:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:4293:2: ( ruleConcernElement )
            {
            // InternalBurst.g:4293:2: ( ruleConcernElement )
            // InternalBurst.g:4294:3: ruleConcernElement
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
    // InternalBurst.g:4303:1: rule__Template__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4307:1: ( ( RULE_ID ) )
            // InternalBurst.g:4308:2: ( RULE_ID )
            {
            // InternalBurst.g:4308:2: ( RULE_ID )
            // InternalBurst.g:4309:3: RULE_ID
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
    // InternalBurst.g:4318:1: rule__Template__TemplateArgumentsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4322:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4323:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4323:2: ( ( RULE_ID ) )
            // InternalBurst.g:4324:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 
            // InternalBurst.g:4325:3: ( RULE_ID )
            // InternalBurst.g:4326:4: RULE_ID
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
    // InternalBurst.g:4337:1: rule__Template__TemplateArgumentsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4341:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4342:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4342:2: ( ( RULE_ID ) )
            // InternalBurst.g:4343:3: ( RULE_ID )
            {
             before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 
            // InternalBurst.g:4344:3: ( RULE_ID )
            // InternalBurst.g:4345:4: RULE_ID
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
    // InternalBurst.g:4356:1: rule__Template__ElementsAssignment_7_3_0 : ( ruleConcernElement ) ;
    public final void rule__Template__ElementsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4360:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:4361:2: ( ruleConcernElement )
            {
            // InternalBurst.g:4361:2: ( ruleConcernElement )
            // InternalBurst.g:4362:3: ruleConcernElement
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


    // $ANTLR start "rule__Member__ActAsAssignment_1"
    // InternalBurst.g:4371:1: rule__Member__ActAsAssignment_1 : ( ( 'as' ) ) ;
    public final void rule__Member__ActAsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4375:1: ( ( ( 'as' ) ) )
            // InternalBurst.g:4376:2: ( ( 'as' ) )
            {
            // InternalBurst.g:4376:2: ( ( 'as' ) )
            // InternalBurst.g:4377:3: ( 'as' )
            {
             before(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            // InternalBurst.g:4378:3: ( 'as' )
            // InternalBurst.g:4379:4: 'as'
            {
             before(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 

            }

             after(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__ActAsAssignment_1"


    // $ANTLR start "rule__Member__IsContentAssignment_2"
    // InternalBurst.g:4390:1: rule__Member__IsContentAssignment_2 : ( ( 'is' ) ) ;
    public final void rule__Member__IsContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4394:1: ( ( ( 'is' ) ) )
            // InternalBurst.g:4395:2: ( ( 'is' ) )
            {
            // InternalBurst.g:4395:2: ( ( 'is' ) )
            // InternalBurst.g:4396:3: ( 'is' )
            {
             before(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            // InternalBurst.g:4397:3: ( 'is' )
            // InternalBurst.g:4398:4: 'is'
            {
             before(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 

            }

             after(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__IsContentAssignment_2"


    // $ANTLR start "rule__Member__ConcernAssignment_3"
    // InternalBurst.g:4409:1: rule__Member__ConcernAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4413:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4414:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4414:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4415:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0()); 
            // InternalBurst.g:4416:3: ( ruleQualifiedName )
            // InternalBurst.g:4417:4: ruleQualifiedName
            {
             before(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__ConcernAssignment_3"


    // $ANTLR start "rule__Member__NameAssignment_4"
    // InternalBurst.g:4428:1: rule__Member__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4432:1: ( ( RULE_ID ) )
            // InternalBurst.g:4433:2: ( RULE_ID )
            {
            // InternalBurst.g:4433:2: ( RULE_ID )
            // InternalBurst.g:4434:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_4"


    // $ANTLR start "rule__RuleIntersect__NameAssignment_1"
    // InternalBurst.g:4443:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4447:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:4448:2: ( ( 'when' ) )
            {
            // InternalBurst.g:4448:2: ( ( 'when' ) )
            // InternalBurst.g:4449:3: ( 'when' )
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            // InternalBurst.g:4450:3: ( 'when' )
            // InternalBurst.g:4451:4: 'when'
            {
             before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBurst.g:4462:1: rule__RuleIntersect__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4466:1: ( ( ruleParameter ) )
            // InternalBurst.g:4467:2: ( ruleParameter )
            {
            // InternalBurst.g:4467:2: ( ruleParameter )
            // InternalBurst.g:4468:3: ruleParameter
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
    // InternalBurst.g:4477:1: rule__RuleIntersect__ParamsAssignment_4_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4481:1: ( ( ruleParameter ) )
            // InternalBurst.g:4482:2: ( ruleParameter )
            {
            // InternalBurst.g:4482:2: ( ruleParameter )
            // InternalBurst.g:4483:3: ruleParameter
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


    // $ANTLR start "rule__RuleIntersect__WithParamsAssignment_5_2"
    // InternalBurst.g:4492:1: rule__RuleIntersect__WithParamsAssignment_5_2 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__WithParamsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4496:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:4497:2: ( ruleWithParameter )
            {
            // InternalBurst.g:4497:2: ( ruleWithParameter )
            // InternalBurst.g:4498:3: ruleWithParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__WithParamsAssignment_5_2"


    // $ANTLR start "rule__RuleIntersect__WithParamsAssignment_5_3_3"
    // InternalBurst.g:4507:1: rule__RuleIntersect__WithParamsAssignment_5_3_3 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__WithParamsAssignment_5_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4511:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:4512:2: ( ruleWithParameter )
            {
            // InternalBurst.g:4512:2: ( ruleWithParameter )
            // InternalBurst.g:4513:3: ruleWithParameter
            {
             before(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;

             after(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleIntersect__WithParamsAssignment_5_3_3"


    // $ANTLR start "rule__RuleIntersect__LinesAssignment_8_0"
    // InternalBurst.g:4522:1: rule__RuleIntersect__LinesAssignment_8_0 : ( ruleLine ) ;
    public final void rule__RuleIntersect__LinesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4526:1: ( ( ruleLine ) )
            // InternalBurst.g:4527:2: ( ruleLine )
            {
            // InternalBurst.g:4527:2: ( ruleLine )
            // InternalBurst.g:4528:3: ruleLine
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


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // InternalBurst.g:4537:1: rule__Parameter__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4541:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4542:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4542:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4543:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0()); 
            // InternalBurst.g:4544:3: ( ruleQualifiedName )
            // InternalBurst.g:4545:4: ruleQualifiedName
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
    // InternalBurst.g:4556:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4560:1: ( ( RULE_ID ) )
            // InternalBurst.g:4561:2: ( RULE_ID )
            {
            // InternalBurst.g:4561:2: ( RULE_ID )
            // InternalBurst.g:4562:3: RULE_ID
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
    // InternalBurst.g:4571:1: rule__Parameter__UsageAssignment_3_0 : ( ( ':' ) ) ;
    public final void rule__Parameter__UsageAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4575:1: ( ( ( ':' ) ) )
            // InternalBurst.g:4576:2: ( ( ':' ) )
            {
            // InternalBurst.g:4576:2: ( ( ':' ) )
            // InternalBurst.g:4577:3: ( ':' )
            {
             before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            // InternalBurst.g:4578:3: ( ':' )
            // InternalBurst.g:4579:4: ':'
            {
             before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBurst.g:4590:1: rule__Parameter__RoleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__RoleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4594:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4595:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4595:2: ( ( RULE_ID ) )
            // InternalBurst.g:4596:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0()); 
            // InternalBurst.g:4597:3: ( RULE_ID )
            // InternalBurst.g:4598:4: RULE_ID
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
    // InternalBurst.g:4609:1: rule__WithParameter__NameAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WithParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4613:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4614:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4614:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4615:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWithParameterAccess().getNameConcernCrossReference_1_0()); 
            // InternalBurst.g:4616:3: ( ruleQualifiedName )
            // InternalBurst.g:4617:4: ruleQualifiedName
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
    // InternalBurst.g:4628:1: rule__WithParameter__UsageAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__WithParameter__UsageAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4632:1: ( ( ( ':' ) ) )
            // InternalBurst.g:4633:2: ( ( ':' ) )
            {
            // InternalBurst.g:4633:2: ( ( ':' ) )
            // InternalBurst.g:4634:3: ( ':' )
            {
             before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            // InternalBurst.g:4635:3: ( ':' )
            // InternalBurst.g:4636:4: ':'
            {
             before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBurst.g:4647:1: rule__WithParameter__RoleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WithParameter__RoleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4651:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4652:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4652:2: ( ( RULE_ID ) )
            // InternalBurst.g:4653:3: ( RULE_ID )
            {
             before(grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0()); 
            // InternalBurst.g:4654:3: ( RULE_ID )
            // InternalBurst.g:4655:4: RULE_ID
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


    // $ANTLR start "rule__ContextManagement__ActionAssignment_1"
    // InternalBurst.g:4666:1: rule__ContextManagement__ActionAssignment_1 : ( ruleconcernManagment ) ;
    public final void rule__ContextManagement__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4670:1: ( ( ruleconcernManagment ) )
            // InternalBurst.g:4671:2: ( ruleconcernManagment )
            {
            // InternalBurst.g:4671:2: ( ruleconcernManagment )
            // InternalBurst.g:4672:3: ruleconcernManagment
            {
             before(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconcernManagment();

            state._fsp--;

             after(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__ActionAssignment_1"


    // $ANTLR start "rule__ContextManagement__TargetAssignment_2"
    // InternalBurst.g:4681:1: rule__ContextManagement__TargetAssignment_2 : ( ruleAccess ) ;
    public final void rule__ContextManagement__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4685:1: ( ( ruleAccess ) )
            // InternalBurst.g:4686:2: ( ruleAccess )
            {
            // InternalBurst.g:4686:2: ( ruleAccess )
            // InternalBurst.g:4687:3: ruleAccess
            {
             before(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccess();

            state._fsp--;

             after(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextManagement__TargetAssignment_2"


    // $ANTLR start "rule__Call__ContentAssignment_0"
    // InternalBurst.g:4696:1: rule__Call__ContentAssignment_0 : ( ruleCallElement ) ;
    public final void rule__Call__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4700:1: ( ( ruleCallElement ) )
            // InternalBurst.g:4701:2: ( ruleCallElement )
            {
            // InternalBurst.g:4701:2: ( ruleCallElement )
            // InternalBurst.g:4702:3: ruleCallElement
            {
             before(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCallElement();

            state._fsp--;

             after(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ContentAssignment_0"


    // $ANTLR start "rule__Call__EqualityAssignment_1_0"
    // InternalBurst.g:4711:1: rule__Call__EqualityAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__Call__EqualityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4715:1: ( ( ( '=' ) ) )
            // InternalBurst.g:4716:2: ( ( '=' ) )
            {
            // InternalBurst.g:4716:2: ( ( '=' ) )
            // InternalBurst.g:4717:3: ( '=' )
            {
             before(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_1_0_0()); 
            // InternalBurst.g:4718:3: ( '=' )
            // InternalBurst.g:4719:4: '='
            {
             before(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__EqualityAssignment_1_0"


    // $ANTLR start "rule__Call__SourceAssignment_1_1"
    // InternalBurst.g:4730:1: rule__Call__SourceAssignment_1_1 : ( ruleCallElement ) ;
    public final void rule__Call__SourceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4734:1: ( ( ruleCallElement ) )
            // InternalBurst.g:4735:2: ( ruleCallElement )
            {
            // InternalBurst.g:4735:2: ( ruleCallElement )
            // InternalBurst.g:4736:3: ruleCallElement
            {
             before(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCallElement();

            state._fsp--;

             after(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__SourceAssignment_1_1"


    // $ANTLR start "rule__Locale__TypeAssignment_2"
    // InternalBurst.g:4745:1: rule__Locale__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Locale__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4749:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:4750:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:4750:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:4751:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 
            // InternalBurst.g:4752:3: ( ruleQualifiedName )
            // InternalBurst.g:4753:4: ruleQualifiedName
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
    // InternalBurst.g:4764:1: rule__Locale__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Locale__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4768:1: ( ( RULE_ID ) )
            // InternalBurst.g:4769:2: ( RULE_ID )
            {
            // InternalBurst.g:4769:2: ( RULE_ID )
            // InternalBurst.g:4770:3: RULE_ID
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


    // $ANTLR start "rule__Locale__RolesAssignment_4_1"
    // InternalBurst.g:4779:1: rule__Locale__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Locale__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4783:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4784:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4784:2: ( ( RULE_ID ) )
            // InternalBurst.g:4785:3: ( RULE_ID )
            {
             before(grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalBurst.g:4786:3: ( RULE_ID )
            // InternalBurst.g:4787:4: RULE_ID
            {
             before(grammarAccess.getLocaleAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocaleAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__RolesAssignment_4_1"


    // $ANTLR start "rule__Access__NameAssignment_1"
    // InternalBurst.g:4798:1: rule__Access__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4802:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4803:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4803:2: ( ( RULE_ID ) )
            // InternalBurst.g:4804:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 
            // InternalBurst.g:4805:3: ( RULE_ID )
            // InternalBurst.g:4806:4: RULE_ID
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
    // InternalBurst.g:4817:1: rule__Access__MembersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4821:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4822:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4822:2: ( ( RULE_ID ) )
            // InternalBurst.g:4823:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0()); 
            // InternalBurst.g:4824:3: ( RULE_ID )
            // InternalBurst.g:4825:4: RULE_ID
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


    // $ANTLR start "rule__Access__RolesAssignment_3_1"
    // InternalBurst.g:4836:1: rule__Access__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4840:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4841:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4841:2: ( ( RULE_ID ) )
            // InternalBurst.g:4842:3: ( RULE_ID )
            {
             before(grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0()); 
            // InternalBurst.g:4843:3: ( RULE_ID )
            // InternalBurst.g:4844:4: RULE_ID
            {
             before(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__RolesAssignment_3_1"


    // $ANTLR start "rule__SubCall__NameAssignment_2"
    // InternalBurst.g:4855:1: rule__SubCall__NameAssignment_2 : ( ruleLine ) ;
    public final void rule__SubCall__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4859:1: ( ( ruleLine ) )
            // InternalBurst.g:4860:2: ( ruleLine )
            {
            // InternalBurst.g:4860:2: ( ruleLine )
            // InternalBurst.g:4861:3: ruleLine
            {
             before(grammarAccess.getSubCallAccess().getNameLineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getSubCallAccess().getNameLineParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubCall__RolesAssignment_4_1"
    // InternalBurst.g:4870:1: rule__SubCall__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubCall__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4874:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:4875:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:4875:2: ( ( RULE_ID ) )
            // InternalBurst.g:4876:3: ( RULE_ID )
            {
             before(grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0()); 
            // InternalBurst.g:4877:3: ( RULE_ID )
            // InternalBurst.g:4878:4: RULE_ID
            {
             before(grammarAccess.getSubCallAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubCallAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubCall__RolesAssignment_4_1"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\41\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\16\uffff\1\2\3\3\12\uffff\1\3",
            "\1\1\16\uffff\1\2\3\3\12\uffff\1\3",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1520:2: ( rule__Concern__Group_3__0 )?";
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1932:2: ( rule__Template__Group_7__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200700010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200600002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000380700030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000380600022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200600000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002083010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000002410C030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000002400C022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000002400C020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000024000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000024000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});

}