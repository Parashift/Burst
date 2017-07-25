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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBurstParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'true'", "'false'", "'1'", "'0'", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "'>'", "'('", "')'", "'called'", "'stop'", "'if'", "'else'", "'new'", "':'", "'.'", "'as'", "'is'", "'when'", "'='", "'this'", "'null'"
    };
    public static final int RULE_ENDLINE=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalBurst.g:54:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalBurst.g:55:1: ( ruleFile EOF )
            // InternalBurst.g:56:1: ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:63:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:67:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalBurst.g:68:2: ( ( rule__File__Group__0 ) )
            {
            // InternalBurst.g:68:2: ( ( rule__File__Group__0 ) )
            // InternalBurst.g:69:3: ( rule__File__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup()); 
            }
            // InternalBurst.g:70:3: ( rule__File__Group__0 )
            // InternalBurst.g:70:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup()); 
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleFileElement"
    // InternalBurst.g:79:1: entryRuleFileElement : ruleFileElement EOF ;
    public final void entryRuleFileElement() throws RecognitionException {
        try {
            // InternalBurst.g:80:1: ( ruleFileElement EOF )
            // InternalBurst.g:81:1: ruleFileElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFileElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:88:1: ruleFileElement : ( ( rule__FileElement__Alternatives ) ) ;
    public final void ruleFileElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:92:2: ( ( ( rule__FileElement__Alternatives ) ) )
            // InternalBurst.g:93:2: ( ( rule__FileElement__Alternatives ) )
            {
            // InternalBurst.g:93:2: ( ( rule__FileElement__Alternatives ) )
            // InternalBurst.g:94:3: ( rule__FileElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileElementAccess().getAlternatives()); 
            }
            // InternalBurst.g:95:3: ( rule__FileElement__Alternatives )
            // InternalBurst.g:95:4: rule__FileElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FileElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFileElement"


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:104:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBurst.g:105:1: ( ruleImport EOF )
            // InternalBurst.g:106:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:113:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:117:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBurst.g:118:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalBurst.g:118:2: ( ( rule__Import__Group__0 ) )
            // InternalBurst.g:119:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalBurst.g:120:3: ( rule__Import__Group__0 )
            // InternalBurst.g:120:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRoles"
    // InternalBurst.g:129:1: entryRuleRoles : ruleRoles EOF ;
    public final void entryRuleRoles() throws RecognitionException {
        try {
            // InternalBurst.g:130:1: ( ruleRoles EOF )
            // InternalBurst.g:131:1: ruleRoles EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRoles();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:138:1: ruleRoles : ( ( rule__Roles__Group__0 ) ) ;
    public final void ruleRoles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:142:2: ( ( ( rule__Roles__Group__0 ) ) )
            // InternalBurst.g:143:2: ( ( rule__Roles__Group__0 ) )
            {
            // InternalBurst.g:143:2: ( ( rule__Roles__Group__0 ) )
            // InternalBurst.g:144:3: ( rule__Roles__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getGroup()); 
            }
            // InternalBurst.g:145:3: ( rule__Roles__Group__0 )
            // InternalBurst.g:145:4: rule__Roles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesAccess().getGroup()); 
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
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRulePackage"
    // InternalBurst.g:154:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalBurst.g:155:1: ( rulePackage EOF )
            // InternalBurst.g:156:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:163:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:167:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalBurst.g:168:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalBurst.g:168:2: ( ( rule__Package__Group__0 ) )
            // InternalBurst.g:169:3: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // InternalBurst.g:170:3: ( rule__Package__Group__0 )
            // InternalBurst.g:170:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageElement"
    // InternalBurst.g:179:1: entryRulePackageElement : rulePackageElement EOF ;
    public final void entryRulePackageElement() throws RecognitionException {
        try {
            // InternalBurst.g:180:1: ( rulePackageElement EOF )
            // InternalBurst.g:181:1: rulePackageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:188:1: rulePackageElement : ( ( rule__PackageElement__Alternatives ) ) ;
    public final void rulePackageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:192:2: ( ( ( rule__PackageElement__Alternatives ) ) )
            // InternalBurst.g:193:2: ( ( rule__PackageElement__Alternatives ) )
            {
            // InternalBurst.g:193:2: ( ( rule__PackageElement__Alternatives ) )
            // InternalBurst.g:194:3: ( rule__PackageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageElementAccess().getAlternatives()); 
            }
            // InternalBurst.g:195:3: ( rule__PackageElement__Alternatives )
            // InternalBurst.g:195:4: rule__PackageElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PackageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageElementAccess().getAlternatives()); 
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
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:204:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // InternalBurst.g:205:1: ( ruleConcern EOF )
            // InternalBurst.g:206:1: ruleConcern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConcern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:213:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:217:2: ( ( ( rule__Concern__Group__0 ) ) )
            // InternalBurst.g:218:2: ( ( rule__Concern__Group__0 ) )
            {
            // InternalBurst.g:218:2: ( ( rule__Concern__Group__0 ) )
            // InternalBurst.g:219:3: ( rule__Concern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getGroup()); 
            }
            // InternalBurst.g:220:3: ( rule__Concern__Group__0 )
            // InternalBurst.g:220:4: rule__Concern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getGroup()); 
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
    // $ANTLR end "ruleConcern"


    // $ANTLR start "entryRuleTemplate"
    // InternalBurst.g:229:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalBurst.g:230:1: ( ruleTemplate EOF )
            // InternalBurst.g:231:1: ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:238:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:242:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalBurst.g:243:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalBurst.g:243:2: ( ( rule__Template__Group__0 ) )
            // InternalBurst.g:244:3: ( rule__Template__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup()); 
            }
            // InternalBurst.g:245:3: ( rule__Template__Group__0 )
            // InternalBurst.g:245:4: rule__Template__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGroup()); 
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleConcernElement"
    // InternalBurst.g:254:1: entryRuleConcernElement : ruleConcernElement EOF ;
    public final void entryRuleConcernElement() throws RecognitionException {
        try {
            // InternalBurst.g:255:1: ( ruleConcernElement EOF )
            // InternalBurst.g:256:1: ruleConcernElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConcernElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:263:1: ruleConcernElement : ( ( rule__ConcernElement__Alternatives ) ) ;
    public final void ruleConcernElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:267:2: ( ( ( rule__ConcernElement__Alternatives ) ) )
            // InternalBurst.g:268:2: ( ( rule__ConcernElement__Alternatives ) )
            {
            // InternalBurst.g:268:2: ( ( rule__ConcernElement__Alternatives ) )
            // InternalBurst.g:269:3: ( rule__ConcernElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernElementAccess().getAlternatives()); 
            }
            // InternalBurst.g:270:3: ( rule__ConcernElement__Alternatives )
            // InternalBurst.g:270:4: rule__ConcernElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConcernElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConcernElement"


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:279:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:280:1: ( ruleMember EOF )
            // InternalBurst.g:281:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:288:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:292:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:293:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:293:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:294:3: ( rule__Member__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getGroup()); 
            }
            // InternalBurst.g:295:3: ( rule__Member__Group__0 )
            // InternalBurst.g:295:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getGroup()); 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleRuleIntersect"
    // InternalBurst.g:304:1: entryRuleRuleIntersect : ruleRuleIntersect EOF ;
    public final void entryRuleRuleIntersect() throws RecognitionException {
        try {
            // InternalBurst.g:305:1: ( ruleRuleIntersect EOF )
            // InternalBurst.g:306:1: ruleRuleIntersect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleIntersect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:313:1: ruleRuleIntersect : ( ( rule__RuleIntersect__Group__0 ) ) ;
    public final void ruleRuleIntersect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:317:2: ( ( ( rule__RuleIntersect__Group__0 ) ) )
            // InternalBurst.g:318:2: ( ( rule__RuleIntersect__Group__0 ) )
            {
            // InternalBurst.g:318:2: ( ( rule__RuleIntersect__Group__0 ) )
            // InternalBurst.g:319:3: ( rule__RuleIntersect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getGroup()); 
            }
            // InternalBurst.g:320:3: ( rule__RuleIntersect__Group__0 )
            // InternalBurst.g:320:4: rule__RuleIntersect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getGroup()); 
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
    // $ANTLR end "ruleRuleIntersect"


    // $ANTLR start "entryRuleBlock"
    // InternalBurst.g:329:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalBurst.g:330:1: ( ruleBlock EOF )
            // InternalBurst.g:331:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalBurst.g:338:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:342:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalBurst.g:343:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalBurst.g:343:2: ( ( rule__Block__Group__0 ) )
            // InternalBurst.g:344:3: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalBurst.g:345:3: ( rule__Block__Group__0 )
            // InternalBurst.g:345:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:354:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalBurst.g:355:1: ( ruleParameter EOF )
            // InternalBurst.g:356:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:363:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:367:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalBurst.g:368:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalBurst.g:368:2: ( ( rule__Parameter__Group__0 ) )
            // InternalBurst.g:369:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalBurst.g:370:3: ( rule__Parameter__Group__0 )
            // InternalBurst.g:370:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:379:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:380:1: ( ruleLine EOF )
            // InternalBurst.g:381:1: ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:388:1: ruleLine : ( ( rule__Line__Alternatives ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:392:2: ( ( ( rule__Line__Alternatives ) ) )
            // InternalBurst.g:393:2: ( ( rule__Line__Alternatives ) )
            {
            // InternalBurst.g:393:2: ( ( rule__Line__Alternatives ) )
            // InternalBurst.g:394:3: ( rule__Line__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineAccess().getAlternatives()); 
            }
            // InternalBurst.g:395:3: ( rule__Line__Alternatives )
            // InternalBurst.g:395:4: rule__Line__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Line__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleStop"
    // InternalBurst.g:404:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalBurst.g:405:1: ( ruleStop EOF )
            // InternalBurst.g:406:1: ruleStop EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalBurst.g:413:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:417:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalBurst.g:418:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalBurst.g:418:2: ( ( rule__Stop__Group__0 ) )
            // InternalBurst.g:419:3: ( rule__Stop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getGroup()); 
            }
            // InternalBurst.g:420:3: ( rule__Stop__Group__0 )
            // InternalBurst.g:420:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopAccess().getGroup()); 
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
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleIf"
    // InternalBurst.g:429:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalBurst.g:430:1: ( ruleIf EOF )
            // InternalBurst.g:431:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalBurst.g:438:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:442:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalBurst.g:443:2: ( ( rule__If__Group__0 ) )
            {
            // InternalBurst.g:443:2: ( ( rule__If__Group__0 ) )
            // InternalBurst.g:444:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalBurst.g:445:3: ( rule__If__Group__0 )
            // InternalBurst.g:445:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleContextManagement"
    // InternalBurst.g:454:1: entryRuleContextManagement : ruleContextManagement EOF ;
    public final void entryRuleContextManagement() throws RecognitionException {
        try {
            // InternalBurst.g:455:1: ( ruleContextManagement EOF )
            // InternalBurst.g:456:1: ruleContextManagement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleContextManagement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:463:1: ruleContextManagement : ( ( rule__ContextManagement__Group__0 ) ) ;
    public final void ruleContextManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:467:2: ( ( ( rule__ContextManagement__Group__0 ) ) )
            // InternalBurst.g:468:2: ( ( rule__ContextManagement__Group__0 ) )
            {
            // InternalBurst.g:468:2: ( ( rule__ContextManagement__Group__0 ) )
            // InternalBurst.g:469:3: ( rule__ContextManagement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getGroup()); 
            }
            // InternalBurst.g:470:3: ( rule__ContextManagement__Group__0 )
            // InternalBurst.g:470:4: rule__ContextManagement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getGroup()); 
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
    // $ANTLR end "ruleContextManagement"


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:479:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:480:1: ( ruleCall EOF )
            // InternalBurst.g:481:1: ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:488:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:492:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalBurst.g:493:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalBurst.g:493:2: ( ( rule__Call__Group__0 ) )
            // InternalBurst.g:494:3: ( rule__Call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup()); 
            }
            // InternalBurst.g:495:3: ( rule__Call__Group__0 )
            // InternalBurst.g:495:4: rule__Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup()); 
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleCallElement"
    // InternalBurst.g:504:1: entryRuleCallElement : ruleCallElement EOF ;
    public final void entryRuleCallElement() throws RecognitionException {
        try {
            // InternalBurst.g:505:1: ( ruleCallElement EOF )
            // InternalBurst.g:506:1: ruleCallElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCallElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:513:1: ruleCallElement : ( ( rule__CallElement__Alternatives ) ) ;
    public final void ruleCallElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:517:2: ( ( ( rule__CallElement__Alternatives ) ) )
            // InternalBurst.g:518:2: ( ( rule__CallElement__Alternatives ) )
            {
            // InternalBurst.g:518:2: ( ( rule__CallElement__Alternatives ) )
            // InternalBurst.g:519:3: ( rule__CallElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallElementAccess().getAlternatives()); 
            }
            // InternalBurst.g:520:3: ( rule__CallElement__Alternatives )
            // InternalBurst.g:520:4: rule__CallElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CallElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCallElement"


    // $ANTLR start "entryRuleLocale"
    // InternalBurst.g:529:1: entryRuleLocale : ruleLocale EOF ;
    public final void entryRuleLocale() throws RecognitionException {
        try {
            // InternalBurst.g:530:1: ( ruleLocale EOF )
            // InternalBurst.g:531:1: ruleLocale EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocale();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:538:1: ruleLocale : ( ( rule__Locale__Group__0 ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:542:2: ( ( ( rule__Locale__Group__0 ) ) )
            // InternalBurst.g:543:2: ( ( rule__Locale__Group__0 ) )
            {
            // InternalBurst.g:543:2: ( ( rule__Locale__Group__0 ) )
            // InternalBurst.g:544:3: ( rule__Locale__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getGroup()); 
            }
            // InternalBurst.g:545:3: ( rule__Locale__Group__0 )
            // InternalBurst.g:545:4: rule__Locale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getGroup()); 
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
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleAccess"
    // InternalBurst.g:554:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalBurst.g:555:1: ( ruleAccess EOF )
            // InternalBurst.g:556:1: ruleAccess EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:563:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:567:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalBurst.g:568:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalBurst.g:568:2: ( ( rule__Access__Group__0 ) )
            // InternalBurst.g:569:3: ( rule__Access__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup()); 
            }
            // InternalBurst.g:570:3: ( rule__Access__Group__0 )
            // InternalBurst.g:570:4: rule__Access__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getGroup()); 
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
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleSubCall"
    // InternalBurst.g:579:1: entryRuleSubCall : ruleSubCall EOF ;
    public final void entryRuleSubCall() throws RecognitionException {
        try {
            // InternalBurst.g:580:1: ( ruleSubCall EOF )
            // InternalBurst.g:581:1: ruleSubCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:588:1: ruleSubCall : ( ( rule__SubCall__Group__0 ) ) ;
    public final void ruleSubCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:592:2: ( ( ( rule__SubCall__Group__0 ) ) )
            // InternalBurst.g:593:2: ( ( rule__SubCall__Group__0 ) )
            {
            // InternalBurst.g:593:2: ( ( rule__SubCall__Group__0 ) )
            // InternalBurst.g:594:3: ( rule__SubCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getGroup()); 
            }
            // InternalBurst.g:595:3: ( rule__SubCall__Group__0 )
            // InternalBurst.g:595:4: rule__SubCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getGroup()); 
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
    // $ANTLR end "ruleSubCall"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalBurst.g:604:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalBurst.g:605:1: ( ruleTerminalExpression EOF )
            // InternalBurst.g:606:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalBurst.g:613:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:617:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalBurst.g:618:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalBurst.g:618:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalBurst.g:619:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalBurst.g:620:3: ( rule__TerminalExpression__Alternatives )
            // InternalBurst.g:620:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:629:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:630:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:631:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalBurst.g:638:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:642:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:643:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:643:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:644:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalBurst.g:645:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:645:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleconcernManagment"
    // InternalBurst.g:654:1: ruleconcernManagment : ( ( rule__ConcernManagment__Alternatives ) ) ;
    public final void ruleconcernManagment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:658:1: ( ( ( rule__ConcernManagment__Alternatives ) ) )
            // InternalBurst.g:659:2: ( ( rule__ConcernManagment__Alternatives ) )
            {
            // InternalBurst.g:659:2: ( ( rule__ConcernManagment__Alternatives ) )
            // InternalBurst.g:660:3: ( rule__ConcernManagment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernManagmentAccess().getAlternatives()); 
            }
            // InternalBurst.g:661:3: ( rule__ConcernManagment__Alternatives )
            // InternalBurst.g:661:4: rule__ConcernManagment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConcernManagment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernManagmentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleconcernManagment"


    // $ANTLR start "rule__FileElement__Alternatives"
    // InternalBurst.g:669:1: rule__FileElement__Alternatives : ( ( ruleRoles ) | ( rulePackage ) );
    public final void rule__FileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:673:1: ( ( ruleRoles ) | ( rulePackage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBurst.g:674:2: ( ruleRoles )
                    {
                    // InternalBurst.g:674:2: ( ruleRoles )
                    // InternalBurst.g:675:3: ruleRoles
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRoles();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:680:2: ( rulePackage )
                    {
                    // InternalBurst.g:680:2: ( rulePackage )
                    // InternalBurst.g:681:3: rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1()); 
                    }

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
    // InternalBurst.g:690:1: rule__PackageElement__Alternatives : ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:694:1: ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBurst.g:695:2: ( ruleConcern )
                    {
                    // InternalBurst.g:695:2: ( ruleConcern )
                    // InternalBurst.g:696:3: ruleConcern
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConcern();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:701:2: ( ruleTemplate )
                    {
                    // InternalBurst.g:701:2: ( ruleTemplate )
                    // InternalBurst.g:702:3: ruleTemplate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTemplate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:707:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:707:2: ( ruleRuleIntersect )
                    // InternalBurst.g:708:3: ruleRuleIntersect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2()); 
                    }

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
    // InternalBurst.g:717:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:721:1: ( ( ruleMember ) | ( ruleRuleIntersect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=36 && LA3_0<=37)) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:722:2: ( ruleMember )
                    {
                    // InternalBurst.g:722:2: ( ruleMember )
                    // InternalBurst.g:723:3: ruleMember
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMember();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:728:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:728:2: ( ruleRuleIntersect )
                    // InternalBurst.g:729:3: ruleRuleIntersect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRuleIntersect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1()); 
                    }

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
    // InternalBurst.g:738:1: rule__RuleIntersect__Alternatives_4_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:742:1: ( ( ',' ) | ( 'and' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBurst.g:743:2: ( ',' )
                    {
                    // InternalBurst.g:743:2: ( ',' )
                    // InternalBurst.g:744:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:749:2: ( 'and' )
                    {
                    // InternalBurst.g:749:2: ( 'and' )
                    // InternalBurst.g:750:3: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1()); 
                    }

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


    // $ANTLR start "rule__Parameter__Alternatives_1"
    // InternalBurst.g:759:1: rule__Parameter__Alternatives_1 : ( ( ( rule__Parameter__NameAssignment_1_0 ) ) | ( ( rule__Parameter__Group_1_1__0 ) ) | ( ( rule__Parameter__Group_1_2__0 ) ) );
    public final void rule__Parameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:763:1: ( ( ( rule__Parameter__NameAssignment_1_0 ) ) | ( ( rule__Parameter__Group_1_1__0 ) ) | ( ( rule__Parameter__Group_1_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt5=2;
                    }
                    break;
                case 27:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_ID) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==28) ) {
                            alt5=2;
                        }
                        else if ( (LA5_5==29||LA5_5==35) ) {
                            alt5=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ENDLINE:
                case RULE_ID:
                case 12:
                case 13:
                case 21:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBurst.g:764:2: ( ( rule__Parameter__NameAssignment_1_0 ) )
                    {
                    // InternalBurst.g:764:2: ( ( rule__Parameter__NameAssignment_1_0 ) )
                    // InternalBurst.g:765:3: ( rule__Parameter__NameAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getNameAssignment_1_0()); 
                    }
                    // InternalBurst.g:766:3: ( rule__Parameter__NameAssignment_1_0 )
                    // InternalBurst.g:766:4: rule__Parameter__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__NameAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getNameAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:770:2: ( ( rule__Parameter__Group_1_1__0 ) )
                    {
                    // InternalBurst.g:770:2: ( ( rule__Parameter__Group_1_1__0 ) )
                    // InternalBurst.g:771:3: ( rule__Parameter__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getGroup_1_1()); 
                    }
                    // InternalBurst.g:772:3: ( rule__Parameter__Group_1_1__0 )
                    // InternalBurst.g:772:4: rule__Parameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:776:2: ( ( rule__Parameter__Group_1_2__0 ) )
                    {
                    // InternalBurst.g:776:2: ( ( rule__Parameter__Group_1_2__0 ) )
                    // InternalBurst.g:777:3: ( rule__Parameter__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getGroup_1_2()); 
                    }
                    // InternalBurst.g:778:3: ( rule__Parameter__Group_1_2__0 )
                    // InternalBurst.g:778:4: rule__Parameter__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getGroup_1_2()); 
                    }

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
    // $ANTLR end "rule__Parameter__Alternatives_1"


    // $ANTLR start "rule__Line__Alternatives"
    // InternalBurst.g:786:1: rule__Line__Alternatives : ( ( ruleBlock ) | ( ruleCall ) | ( ruleContextManagement ) | ( ruleIf ) | ( ruleStop ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:790:1: ( ( ruleBlock ) | ( ruleCall ) | ( ruleContextManagement ) | ( ruleIf ) | ( ruleStop ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 14:
            case 15:
            case 27:
            case 33:
            case 40:
            case 41:
                {
                alt6=2;
                }
                break;
            case 16:
            case 17:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBurst.g:791:2: ( ruleBlock )
                    {
                    // InternalBurst.g:791:2: ( ruleBlock )
                    // InternalBurst.g:792:3: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineAccess().getBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineAccess().getBlockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:797:2: ( ruleCall )
                    {
                    // InternalBurst.g:797:2: ( ruleCall )
                    // InternalBurst.g:798:3: ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineAccess().getCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineAccess().getCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:803:2: ( ruleContextManagement )
                    {
                    // InternalBurst.g:803:2: ( ruleContextManagement )
                    // InternalBurst.g:804:3: ruleContextManagement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineAccess().getContextManagementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleContextManagement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineAccess().getContextManagementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:809:2: ( ruleIf )
                    {
                    // InternalBurst.g:809:2: ( ruleIf )
                    // InternalBurst.g:810:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineAccess().getIfParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineAccess().getIfParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBurst.g:815:2: ( ruleStop )
                    {
                    // InternalBurst.g:815:2: ( ruleStop )
                    // InternalBurst.g:816:3: ruleStop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineAccess().getStopParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineAccess().getStopParserRuleCall_4()); 
                    }

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


    // $ANTLR start "rule__If__Alternatives_3"
    // InternalBurst.g:825:1: rule__If__Alternatives_3 : ( ( ( rule__If__ThenBlockAssignment_3_0 ) ) | ( ( rule__If__Group_3_1__0 ) ) );
    public final void rule__If__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:829:1: ( ( ( rule__If__ThenBlockAssignment_3_0 ) ) | ( ( rule__If__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ENDLINE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:830:2: ( ( rule__If__ThenBlockAssignment_3_0 ) )
                    {
                    // InternalBurst.g:830:2: ( ( rule__If__ThenBlockAssignment_3_0 ) )
                    // InternalBurst.g:831:3: ( rule__If__ThenBlockAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getThenBlockAssignment_3_0()); 
                    }
                    // InternalBurst.g:832:3: ( rule__If__ThenBlockAssignment_3_0 )
                    // InternalBurst.g:832:4: rule__If__ThenBlockAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__ThenBlockAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getThenBlockAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:836:2: ( ( rule__If__Group_3_1__0 ) )
                    {
                    // InternalBurst.g:836:2: ( ( rule__If__Group_3_1__0 ) )
                    // InternalBurst.g:837:3: ( rule__If__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_3_1()); 
                    }
                    // InternalBurst.g:838:3: ( rule__If__Group_3_1__0 )
                    // InternalBurst.g:838:4: rule__If__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIfAccess().getGroup_3_1()); 
                    }

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
    // $ANTLR end "rule__If__Alternatives_3"


    // $ANTLR start "rule__CallElement__Alternatives"
    // InternalBurst.g:846:1: rule__CallElement__Alternatives : ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) | ( ruleTerminalExpression ) );
    public final void rule__CallElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:850:1: ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) | ( ruleTerminalExpression ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 14:
            case 15:
            case 40:
            case 41:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBurst.g:851:2: ( ruleLocale )
                    {
                    // InternalBurst.g:851:2: ( ruleLocale )
                    // InternalBurst.g:852:3: ruleLocale
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocale();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:857:2: ( ruleAccess )
                    {
                    // InternalBurst.g:857:2: ( ruleAccess )
                    // InternalBurst.g:858:3: ruleAccess
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAccess();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:863:2: ( ruleSubCall )
                    {
                    // InternalBurst.g:863:2: ( ruleSubCall )
                    // InternalBurst.g:864:3: ruleSubCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSubCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:869:2: ( ruleTerminalExpression )
                    {
                    // InternalBurst.g:869:2: ( ruleTerminalExpression )
                    // InternalBurst.g:870:3: ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallElementAccess().getTerminalExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallElementAccess().getTerminalExpressionParserRuleCall_3()); 
                    }

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


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalBurst.g:879:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:883:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_ENDLINE && LA9_1<=RULE_STRING)||(LA9_1>=14 && LA9_1<=15)||(LA9_1>=21 && LA9_1<=22)||(LA9_1>=27 && LA9_1<=28)||(LA9_1>=32 && LA9_1<=33)||(LA9_1>=39 && LA9_1<=41)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==35) ) {
                    alt9=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 14:
            case 15:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=5;
                }
                break;
            case 41:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBurst.g:884:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalBurst.g:884:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalBurst.g:885:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalBurst.g:886:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalBurst.g:886:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:890:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalBurst.g:890:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalBurst.g:891:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalBurst.g:892:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalBurst.g:892:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:896:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalBurst.g:896:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalBurst.g:897:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalBurst.g:898:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalBurst.g:898:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:902:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalBurst.g:902:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalBurst.g:903:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalBurst.g:904:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalBurst.g:904:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBurst.g:908:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalBurst.g:908:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalBurst.g:909:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalBurst.g:910:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalBurst.g:910:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBurst.g:914:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalBurst.g:914:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalBurst.g:915:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalBurst.g:916:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalBurst.g:916:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__ValueAlternatives_2_1_0"
    // InternalBurst.g:924:1: rule__TerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__TerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:928:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:929:2: ( 'true' )
                    {
                    // InternalBurst.g:929:2: ( 'true' )
                    // InternalBurst.g:930:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:935:2: ( 'false' )
                    {
                    // InternalBurst.g:935:2: ( 'false' )
                    // InternalBurst.g:936:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__TerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__ConcernManagment__Alternatives"
    // InternalBurst.g:945:1: rule__ConcernManagment__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) );
    public final void rule__ConcernManagment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:949:1: ( ( ( '1' ) ) | ( ( '0' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBurst.g:950:2: ( ( '1' ) )
                    {
                    // InternalBurst.g:950:2: ( ( '1' ) )
                    // InternalBurst.g:951:3: ( '1' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0()); 
                    }
                    // InternalBurst.g:952:3: ( '1' )
                    // InternalBurst.g:952:4: '1'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:956:2: ( ( '0' ) )
                    {
                    // InternalBurst.g:956:2: ( ( '0' ) )
                    // InternalBurst.g:957:3: ( '0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1()); 
                    }
                    // InternalBurst.g:958:3: ( '0' )
                    // InternalBurst.g:958:4: '0'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1()); 
                    }

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
    // InternalBurst.g:966:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:970:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalBurst.g:971:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:978:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:982:1: ( ( () ) )
            // InternalBurst.g:983:1: ( () )
            {
            // InternalBurst.g:983:1: ( () )
            // InternalBurst.g:984:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalBurst.g:985:2: ()
            // InternalBurst.g:985:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getFileAction_0()); 
            }

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
    // InternalBurst.g:993:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:997:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalBurst.g:998:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1005:1: rule__File__Group__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1009:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1010:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1010:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1011:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 
            }
            // InternalBurst.g:1012:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1012:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalBurst.g:1020:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1024:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalBurst.g:1025:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1032:1: rule__File__Group__2__Impl : ( ( rule__File__Group_2__0 )* ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1036:1: ( ( ( rule__File__Group_2__0 )* ) )
            // InternalBurst.g:1037:1: ( ( rule__File__Group_2__0 )* )
            {
            // InternalBurst.g:1037:1: ( ( rule__File__Group_2__0 )* )
            // InternalBurst.g:1038:2: ( rule__File__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_2()); 
            }
            // InternalBurst.g:1039:2: ( rule__File__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1039:3: rule__File__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__File__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_2()); 
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
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalBurst.g:1047:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1051:1: ( rule__File__Group__3__Impl )
            // InternalBurst.g:1052:2: rule__File__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1058:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1062:1: ( ( ( rule__File__Group_3__0 )* ) )
            // InternalBurst.g:1063:1: ( ( rule__File__Group_3__0 )* )
            {
            // InternalBurst.g:1063:1: ( ( rule__File__Group_3__0 )* )
            // InternalBurst.g:1064:2: ( rule__File__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_3()); 
            }
            // InternalBurst.g:1065:2: ( rule__File__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1065:3: rule__File__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__File__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getGroup_3()); 
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
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group_2__0"
    // InternalBurst.g:1074:1: rule__File__Group_2__0 : rule__File__Group_2__0__Impl rule__File__Group_2__1 ;
    public final void rule__File__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1078:1: ( rule__File__Group_2__0__Impl rule__File__Group_2__1 )
            // InternalBurst.g:1079:2: rule__File__Group_2__0__Impl rule__File__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__File__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1086:1: rule__File__Group_2__0__Impl : ( ( rule__File__ImportsAssignment_2_0 ) ) ;
    public final void rule__File__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1090:1: ( ( ( rule__File__ImportsAssignment_2_0 ) ) )
            // InternalBurst.g:1091:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            {
            // InternalBurst.g:1091:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            // InternalBurst.g:1092:2: ( rule__File__ImportsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 
            }
            // InternalBurst.g:1093:2: ( rule__File__ImportsAssignment_2_0 )
            // InternalBurst.g:1093:3: rule__File__ImportsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__File__ImportsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 
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
    // $ANTLR end "rule__File__Group_2__0__Impl"


    // $ANTLR start "rule__File__Group_2__1"
    // InternalBurst.g:1101:1: rule__File__Group_2__1 : rule__File__Group_2__1__Impl ;
    public final void rule__File__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1105:1: ( rule__File__Group_2__1__Impl )
            // InternalBurst.g:1106:2: rule__File__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1112:1: rule__File__Group_2__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1116:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1117:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1117:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1118:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 
            }
            // InternalBurst.g:1119:2: ( RULE_ENDLINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ENDLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1119:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__File__Group_2__1__Impl"


    // $ANTLR start "rule__File__Group_3__0"
    // InternalBurst.g:1128:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1132:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // InternalBurst.g:1133:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__File__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__File__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1140:1: rule__File__Group_3__0__Impl : ( ( rule__File__ElementsAssignment_3_0 ) ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1144:1: ( ( ( rule__File__ElementsAssignment_3_0 ) ) )
            // InternalBurst.g:1145:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            {
            // InternalBurst.g:1145:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            // InternalBurst.g:1146:2: ( rule__File__ElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 
            }
            // InternalBurst.g:1147:2: ( rule__File__ElementsAssignment_3_0 )
            // InternalBurst.g:1147:3: rule__File__ElementsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__File__ElementsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 
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
    // $ANTLR end "rule__File__Group_3__0__Impl"


    // $ANTLR start "rule__File__Group_3__1"
    // InternalBurst.g:1155:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1159:1: ( rule__File__Group_3__1__Impl )
            // InternalBurst.g:1160:2: rule__File__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1166:1: rule__File__Group_3__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1170:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1171:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1171:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1172:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 
            }
            // InternalBurst.g:1173:2: ( RULE_ENDLINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ENDLINE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1173:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__File__Group_3__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalBurst.g:1182:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1186:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:1187:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1194:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1198:1: ( ( () ) )
            // InternalBurst.g:1199:1: ( () )
            {
            // InternalBurst.g:1199:1: ( () )
            // InternalBurst.g:1200:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportAction_0()); 
            }
            // InternalBurst.g:1201:2: ()
            // InternalBurst.g:1201:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportAction_0()); 
            }

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
    // InternalBurst.g:1209:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1213:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:1214:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1221:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1225:1: ( ( 'import' ) )
            // InternalBurst.g:1226:1: ( 'import' )
            {
            // InternalBurst.g:1226:1: ( 'import' )
            // InternalBurst.g:1227:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalBurst.g:1236:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1240:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:1241:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1247:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1251:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:1252:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:1252:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:1253:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            }
            // InternalBurst.g:1254:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:1254:3: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Roles__Group__0"
    // InternalBurst.g:1263:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1267:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalBurst.g:1268:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Roles__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Roles__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1275:1: rule__Roles__Group__0__Impl : ( () ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1279:1: ( ( () ) )
            // InternalBurst.g:1280:1: ( () )
            {
            // InternalBurst.g:1280:1: ( () )
            // InternalBurst.g:1281:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getRoleAction_0()); 
            }
            // InternalBurst.g:1282:2: ()
            // InternalBurst.g:1282:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesAccess().getRoleAction_0()); 
            }

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
    // InternalBurst.g:1290:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl rule__Roles__Group__2 ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1294:1: ( rule__Roles__Group__1__Impl rule__Roles__Group__2 )
            // InternalBurst.g:1295:2: rule__Roles__Group__1__Impl rule__Roles__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Roles__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Roles__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1302:1: rule__Roles__Group__1__Impl : ( 'role' ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1306:1: ( ( 'role' ) )
            // InternalBurst.g:1307:1: ( 'role' )
            {
            // InternalBurst.g:1307:1: ( 'role' )
            // InternalBurst.g:1308:2: 'role'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getRoleKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesAccess().getRoleKeyword_1()); 
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
    // $ANTLR end "rule__Roles__Group__1__Impl"


    // $ANTLR start "rule__Roles__Group__2"
    // InternalBurst.g:1317:1: rule__Roles__Group__2 : rule__Roles__Group__2__Impl ;
    public final void rule__Roles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1321:1: ( rule__Roles__Group__2__Impl )
            // InternalBurst.g:1322:2: rule__Roles__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Roles__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1328:1: rule__Roles__Group__2__Impl : ( ( rule__Roles__NameAssignment_2 ) ) ;
    public final void rule__Roles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1332:1: ( ( ( rule__Roles__NameAssignment_2 ) ) )
            // InternalBurst.g:1333:1: ( ( rule__Roles__NameAssignment_2 ) )
            {
            // InternalBurst.g:1333:1: ( ( rule__Roles__NameAssignment_2 ) )
            // InternalBurst.g:1334:2: ( rule__Roles__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1335:2: ( rule__Roles__NameAssignment_2 )
            // InternalBurst.g:1335:3: rule__Roles__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Roles__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Roles__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalBurst.g:1344:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1348:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:1349:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1356:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1360:1: ( ( () ) )
            // InternalBurst.g:1361:1: ( () )
            {
            // InternalBurst.g:1361:1: ( () )
            // InternalBurst.g:1362:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getBPackageAction_0()); 
            }
            // InternalBurst.g:1363:2: ()
            // InternalBurst.g:1363:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getBPackageAction_0()); 
            }

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
    // InternalBurst.g:1371:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1375:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:1376:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1383:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1387:1: ( ( 'package' ) )
            // InternalBurst.g:1388:1: ( 'package' )
            {
            // InternalBurst.g:1388:1: ( 'package' )
            // InternalBurst.g:1389:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalBurst.g:1398:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1402:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:1403:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Package__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1410:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1414:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalBurst.g:1415:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalBurst.g:1415:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalBurst.g:1416:2: ( rule__Package__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1417:2: ( rule__Package__NameAssignment_2 )
            // InternalBurst.g:1417:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalBurst.g:1425:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1429:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:1430:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Package__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1437:1: rule__Package__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1441:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1442:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1442:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1443:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 
            }
            // InternalBurst.g:1444:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1444:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalBurst.g:1452:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1456:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalBurst.g:1457:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1464:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1468:1: ( ( '{' ) )
            // InternalBurst.g:1469:1: ( '{' )
            {
            // InternalBurst.g:1469:1: ( '{' )
            // InternalBurst.g:1470:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalBurst.g:1479:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1483:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalBurst.g:1484:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1491:1: rule__Package__Group__5__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1495:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1496:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1496:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1497:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
            }
            // InternalBurst.g:1498:2: ( RULE_ENDLINE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENDLINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBurst.g:1498:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // InternalBurst.g:1506:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1510:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalBurst.g:1511:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1518:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1522:1: ( ( ( rule__Package__Group_6__0 )* ) )
            // InternalBurst.g:1523:1: ( ( rule__Package__Group_6__0 )* )
            {
            // InternalBurst.g:1523:1: ( ( rule__Package__Group_6__0 )* )
            // InternalBurst.g:1524:2: ( rule__Package__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup_6()); 
            }
            // InternalBurst.g:1525:2: ( rule__Package__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=23 && LA19_0<=24)||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1525:3: rule__Package__Group_6__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Package__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // InternalBurst.g:1533:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1537:1: ( rule__Package__Group__7__Impl )
            // InternalBurst.g:1538:2: rule__Package__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1544:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1548:1: ( ( '}' ) )
            // InternalBurst.g:1549:1: ( '}' )
            {
            // InternalBurst.g:1549:1: ( '}' )
            // InternalBurst.g:1550:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_6__0"
    // InternalBurst.g:1560:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1564:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // InternalBurst.g:1565:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Package__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1572:1: rule__Package__Group_6__0__Impl : ( ( rule__Package__ElementsAssignment_6_0 ) ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1576:1: ( ( ( rule__Package__ElementsAssignment_6_0 ) ) )
            // InternalBurst.g:1577:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            {
            // InternalBurst.g:1577:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            // InternalBurst.g:1578:2: ( rule__Package__ElementsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 
            }
            // InternalBurst.g:1579:2: ( rule__Package__ElementsAssignment_6_0 )
            // InternalBurst.g:1579:3: rule__Package__ElementsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__ElementsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 
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
    // $ANTLR end "rule__Package__Group_6__0__Impl"


    // $ANTLR start "rule__Package__Group_6__1"
    // InternalBurst.g:1587:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1591:1: ( rule__Package__Group_6__1__Impl )
            // InternalBurst.g:1592:2: rule__Package__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1598:1: rule__Package__Group_6__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1602:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1603:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1603:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1604:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 
            }
            // InternalBurst.g:1605:2: ( RULE_ENDLINE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1605:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 
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
    // $ANTLR end "rule__Package__Group_6__1__Impl"


    // $ANTLR start "rule__Concern__Group__0"
    // InternalBurst.g:1614:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1618:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:1619:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Concern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1626:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1630:1: ( ( () ) )
            // InternalBurst.g:1631:1: ( () )
            {
            // InternalBurst.g:1631:1: ( () )
            // InternalBurst.g:1632:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            }
            // InternalBurst.g:1633:2: ()
            // InternalBurst.g:1633:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getConcernAction_0()); 
            }

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
    // InternalBurst.g:1641:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1645:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:1646:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Concern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1653:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1657:1: ( ( 'concern' ) )
            // InternalBurst.g:1658:1: ( 'concern' )
            {
            // InternalBurst.g:1658:1: ( 'concern' )
            // InternalBurst.g:1659:2: 'concern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
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
    // $ANTLR end "rule__Concern__Group__1__Impl"


    // $ANTLR start "rule__Concern__Group__2"
    // InternalBurst.g:1668:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1672:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:1673:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1680:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1684:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:1685:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:1685:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:1686:2: ( rule__Concern__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1687:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:1687:3: rule__Concern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Concern__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Concern__Group__2__Impl"


    // $ANTLR start "rule__Concern__Group__3"
    // InternalBurst.g:1695:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1699:1: ( rule__Concern__Group__3__Impl )
            // InternalBurst.g:1700:2: rule__Concern__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1706:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1710:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:1711:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:1711:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:1712:2: ( rule__Concern__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getGroup_3()); 
            }
            // InternalBurst.g:1713:2: ( rule__Concern__Group_3__0 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalBurst.g:1713:3: rule__Concern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Concern__Group__3__Impl"


    // $ANTLR start "rule__Concern__Group_3__0"
    // InternalBurst.g:1722:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1726:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:1727:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Concern__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1734:1: rule__Concern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1738:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1739:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1739:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1740:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            }
            // InternalBurst.g:1741:2: ( RULE_ENDLINE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ENDLINE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBurst.g:1741:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Concern__Group_3__0__Impl"


    // $ANTLR start "rule__Concern__Group_3__1"
    // InternalBurst.g:1749:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1753:1: ( rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 )
            // InternalBurst.g:1754:2: rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1761:1: rule__Concern__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1765:1: ( ( '{' ) )
            // InternalBurst.g:1766:1: ( '{' )
            {
            // InternalBurst.g:1766:1: ( '{' )
            // InternalBurst.g:1767:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1()); 
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
    // $ANTLR end "rule__Concern__Group_3__1__Impl"


    // $ANTLR start "rule__Concern__Group_3__2"
    // InternalBurst.g:1776:1: rule__Concern__Group_3__2 : rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 ;
    public final void rule__Concern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1780:1: ( rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 )
            // InternalBurst.g:1781:2: rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1788:1: rule__Concern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1792:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1793:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1793:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1794:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            }
            // InternalBurst.g:1795:2: ( RULE_ENDLINE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ENDLINE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1795:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 
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
    // $ANTLR end "rule__Concern__Group_3__2__Impl"


    // $ANTLR start "rule__Concern__Group_3__3"
    // InternalBurst.g:1803:1: rule__Concern__Group_3__3 : rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 ;
    public final void rule__Concern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1807:1: ( rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 )
            // InternalBurst.g:1808:2: rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Concern__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1815:1: rule__Concern__Group_3__3__Impl : ( ( rule__Concern__Group_3_3__0 )* ) ;
    public final void rule__Concern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1819:1: ( ( ( rule__Concern__Group_3_3__0 )* ) )
            // InternalBurst.g:1820:1: ( ( rule__Concern__Group_3_3__0 )* )
            {
            // InternalBurst.g:1820:1: ( ( rule__Concern__Group_3_3__0 )* )
            // InternalBurst.g:1821:2: ( rule__Concern__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getGroup_3_3()); 
            }
            // InternalBurst.g:1822:2: ( rule__Concern__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=36 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBurst.g:1822:3: rule__Concern__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Concern__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getGroup_3_3()); 
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
    // $ANTLR end "rule__Concern__Group_3__3__Impl"


    // $ANTLR start "rule__Concern__Group_3__4"
    // InternalBurst.g:1830:1: rule__Concern__Group_3__4 : rule__Concern__Group_3__4__Impl ;
    public final void rule__Concern__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1834:1: ( rule__Concern__Group_3__4__Impl )
            // InternalBurst.g:1835:2: rule__Concern__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1841:1: rule__Concern__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Concern__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1845:1: ( ( '}' ) )
            // InternalBurst.g:1846:1: ( '}' )
            {
            // InternalBurst.g:1846:1: ( '}' )
            // InternalBurst.g:1847:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4()); 
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
    // $ANTLR end "rule__Concern__Group_3__4__Impl"


    // $ANTLR start "rule__Concern__Group_3_3__0"
    // InternalBurst.g:1857:1: rule__Concern__Group_3_3__0 : rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 ;
    public final void rule__Concern__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1861:1: ( rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 )
            // InternalBurst.g:1862:2: rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Concern__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1869:1: rule__Concern__Group_3_3__0__Impl : ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) ;
    public final void rule__Concern__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1873:1: ( ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) )
            // InternalBurst.g:1874:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            {
            // InternalBurst.g:1874:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            // InternalBurst.g:1875:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 
            }
            // InternalBurst.g:1876:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            // InternalBurst.g:1876:3: rule__Concern__ElementsAssignment_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Concern__ElementsAssignment_3_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 
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
    // $ANTLR end "rule__Concern__Group_3_3__0__Impl"


    // $ANTLR start "rule__Concern__Group_3_3__1"
    // InternalBurst.g:1884:1: rule__Concern__Group_3_3__1 : rule__Concern__Group_3_3__1__Impl ;
    public final void rule__Concern__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1888:1: ( rule__Concern__Group_3_3__1__Impl )
            // InternalBurst.g:1889:2: rule__Concern__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1895:1: rule__Concern__Group_3_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Concern__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1899:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1900:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1900:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1901:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1901:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1902:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }
            // InternalBurst.g:1903:3: ( RULE_ENDLINE )
            // InternalBurst.g:1903:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }

            }

            // InternalBurst.g:1906:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1907:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }
            // InternalBurst.g:1908:3: ( RULE_ENDLINE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ENDLINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:1908:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }

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
    // InternalBurst.g:1918:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1922:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalBurst.g:1923:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Template__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1930:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1934:1: ( ( () ) )
            // InternalBurst.g:1935:1: ( () )
            {
            // InternalBurst.g:1935:1: ( () )
            // InternalBurst.g:1936:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            }
            // InternalBurst.g:1937:2: ()
            // InternalBurst.g:1937:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            }

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
    // InternalBurst.g:1945:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1949:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalBurst.g:1950:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1957:1: rule__Template__Group__1__Impl : ( 'template' ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1961:1: ( ( 'template' ) )
            // InternalBurst.g:1962:1: ( 'template' )
            {
            // InternalBurst.g:1962:1: ( 'template' )
            // InternalBurst.g:1963:2: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateKeyword_1()); 
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
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // InternalBurst.g:1972:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1976:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalBurst.g:1977:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Template__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:1984:1: rule__Template__Group__2__Impl : ( ( rule__Template__NameAssignment_2 ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1988:1: ( ( ( rule__Template__NameAssignment_2 ) ) )
            // InternalBurst.g:1989:1: ( ( rule__Template__NameAssignment_2 ) )
            {
            // InternalBurst.g:1989:1: ( ( rule__Template__NameAssignment_2 ) )
            // InternalBurst.g:1990:2: ( rule__Template__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1991:2: ( rule__Template__NameAssignment_2 )
            // InternalBurst.g:1991:3: rule__Template__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Template__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // InternalBurst.g:1999:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2003:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // InternalBurst.g:2004:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2011:1: rule__Template__Group__3__Impl : ( '<' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2015:1: ( ( '<' ) )
            // InternalBurst.g:2016:1: ( '<' )
            {
            // InternalBurst.g:2016:1: ( '<' )
            // InternalBurst.g:2017:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getLessThanSignKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getLessThanSignKeyword_3()); 
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
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__4"
    // InternalBurst.g:2026:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2030:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // InternalBurst.g:2031:2: rule__Template__Group__4__Impl rule__Template__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Template__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2038:1: rule__Template__Group__4__Impl : ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2042:1: ( ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) )
            // InternalBurst.g:2043:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            {
            // InternalBurst.g:2043:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            // InternalBurst.g:2044:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 
            }
            // InternalBurst.g:2045:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            // InternalBurst.g:2045:3: rule__Template__TemplateArgumentsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Template__TemplateArgumentsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 
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
    // $ANTLR end "rule__Template__Group__4__Impl"


    // $ANTLR start "rule__Template__Group__5"
    // InternalBurst.g:2053:1: rule__Template__Group__5 : rule__Template__Group__5__Impl rule__Template__Group__6 ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2057:1: ( rule__Template__Group__5__Impl rule__Template__Group__6 )
            // InternalBurst.g:2058:2: rule__Template__Group__5__Impl rule__Template__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Template__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2065:1: rule__Template__Group__5__Impl : ( ( rule__Template__Group_5__0 )* ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2069:1: ( ( ( rule__Template__Group_5__0 )* ) )
            // InternalBurst.g:2070:1: ( ( rule__Template__Group_5__0 )* )
            {
            // InternalBurst.g:2070:1: ( ( rule__Template__Group_5__0 )* )
            // InternalBurst.g:2071:2: ( rule__Template__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_5()); 
            }
            // InternalBurst.g:2072:2: ( rule__Template__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:2072:3: rule__Template__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Template__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Template__Group__5__Impl"


    // $ANTLR start "rule__Template__Group__6"
    // InternalBurst.g:2080:1: rule__Template__Group__6 : rule__Template__Group__6__Impl rule__Template__Group__7 ;
    public final void rule__Template__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2084:1: ( rule__Template__Group__6__Impl rule__Template__Group__7 )
            // InternalBurst.g:2085:2: rule__Template__Group__6__Impl rule__Template__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Template__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2092:1: rule__Template__Group__6__Impl : ( '>' ) ;
    public final void rule__Template__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2096:1: ( ( '>' ) )
            // InternalBurst.g:2097:1: ( '>' )
            {
            // InternalBurst.g:2097:1: ( '>' )
            // InternalBurst.g:2098:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6()); 
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
    // $ANTLR end "rule__Template__Group__6__Impl"


    // $ANTLR start "rule__Template__Group__7"
    // InternalBurst.g:2107:1: rule__Template__Group__7 : rule__Template__Group__7__Impl ;
    public final void rule__Template__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2111:1: ( rule__Template__Group__7__Impl )
            // InternalBurst.g:2112:2: rule__Template__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2118:1: rule__Template__Group__7__Impl : ( ( rule__Template__Group_7__0 )? ) ;
    public final void rule__Template__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2122:1: ( ( ( rule__Template__Group_7__0 )? ) )
            // InternalBurst.g:2123:1: ( ( rule__Template__Group_7__0 )? )
            {
            // InternalBurst.g:2123:1: ( ( rule__Template__Group_7__0 )? )
            // InternalBurst.g:2124:2: ( rule__Template__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_7()); 
            }
            // InternalBurst.g:2125:2: ( rule__Template__Group_7__0 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalBurst.g:2125:3: rule__Template__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Template__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGroup_7()); 
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
    // $ANTLR end "rule__Template__Group__7__Impl"


    // $ANTLR start "rule__Template__Group_5__0"
    // InternalBurst.g:2134:1: rule__Template__Group_5__0 : rule__Template__Group_5__0__Impl rule__Template__Group_5__1 ;
    public final void rule__Template__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2138:1: ( rule__Template__Group_5__0__Impl rule__Template__Group_5__1 )
            // InternalBurst.g:2139:2: rule__Template__Group_5__0__Impl rule__Template__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Template__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2146:1: rule__Template__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Template__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2150:1: ( ( ',' ) )
            // InternalBurst.g:2151:1: ( ',' )
            {
            // InternalBurst.g:2151:1: ( ',' )
            // InternalBurst.g:2152:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getCommaKeyword_5_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__Template__Group_5__0__Impl"


    // $ANTLR start "rule__Template__Group_5__1"
    // InternalBurst.g:2161:1: rule__Template__Group_5__1 : rule__Template__Group_5__1__Impl ;
    public final void rule__Template__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2165:1: ( rule__Template__Group_5__1__Impl )
            // InternalBurst.g:2166:2: rule__Template__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2172:1: rule__Template__Group_5__1__Impl : ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) ;
    public final void rule__Template__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2176:1: ( ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) )
            // InternalBurst.g:2177:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            {
            // InternalBurst.g:2177:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            // InternalBurst.g:2178:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 
            }
            // InternalBurst.g:2179:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            // InternalBurst.g:2179:3: rule__Template__TemplateArgumentsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Template__TemplateArgumentsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 
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
    // $ANTLR end "rule__Template__Group_5__1__Impl"


    // $ANTLR start "rule__Template__Group_7__0"
    // InternalBurst.g:2188:1: rule__Template__Group_7__0 : rule__Template__Group_7__0__Impl rule__Template__Group_7__1 ;
    public final void rule__Template__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2192:1: ( rule__Template__Group_7__0__Impl rule__Template__Group_7__1 )
            // InternalBurst.g:2193:2: rule__Template__Group_7__0__Impl rule__Template__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Template__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2200:1: rule__Template__Group_7__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2204:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2205:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2205:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2206:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 
            }
            // InternalBurst.g:2207:2: ( RULE_ENDLINE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ENDLINE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBurst.g:2207:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 
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
    // $ANTLR end "rule__Template__Group_7__0__Impl"


    // $ANTLR start "rule__Template__Group_7__1"
    // InternalBurst.g:2215:1: rule__Template__Group_7__1 : rule__Template__Group_7__1__Impl rule__Template__Group_7__2 ;
    public final void rule__Template__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2219:1: ( rule__Template__Group_7__1__Impl rule__Template__Group_7__2 )
            // InternalBurst.g:2220:2: rule__Template__Group_7__1__Impl rule__Template__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2227:1: rule__Template__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Template__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2231:1: ( ( '{' ) )
            // InternalBurst.g:2232:1: ( '{' )
            {
            // InternalBurst.g:2232:1: ( '{' )
            // InternalBurst.g:2233:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1()); 
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
    // $ANTLR end "rule__Template__Group_7__1__Impl"


    // $ANTLR start "rule__Template__Group_7__2"
    // InternalBurst.g:2242:1: rule__Template__Group_7__2 : rule__Template__Group_7__2__Impl rule__Template__Group_7__3 ;
    public final void rule__Template__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2246:1: ( rule__Template__Group_7__2__Impl rule__Template__Group_7__3 )
            // InternalBurst.g:2247:2: rule__Template__Group_7__2__Impl rule__Template__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2254:1: rule__Template__Group_7__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2258:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2259:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2259:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2260:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 
            }
            // InternalBurst.g:2261:2: ( RULE_ENDLINE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ENDLINE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBurst.g:2261:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 
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
    // $ANTLR end "rule__Template__Group_7__2__Impl"


    // $ANTLR start "rule__Template__Group_7__3"
    // InternalBurst.g:2269:1: rule__Template__Group_7__3 : rule__Template__Group_7__3__Impl rule__Template__Group_7__4 ;
    public final void rule__Template__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2273:1: ( rule__Template__Group_7__3__Impl rule__Template__Group_7__4 )
            // InternalBurst.g:2274:2: rule__Template__Group_7__3__Impl rule__Template__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__Template__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2281:1: rule__Template__Group_7__3__Impl : ( ( rule__Template__Group_7_3__0 )* ) ;
    public final void rule__Template__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2285:1: ( ( ( rule__Template__Group_7_3__0 )* ) )
            // InternalBurst.g:2286:1: ( ( rule__Template__Group_7_3__0 )* )
            {
            // InternalBurst.g:2286:1: ( ( rule__Template__Group_7_3__0 )* )
            // InternalBurst.g:2287:2: ( rule__Template__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_7_3()); 
            }
            // InternalBurst.g:2288:2: ( rule__Template__Group_7_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=36 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBurst.g:2288:3: rule__Template__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Template__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getGroup_7_3()); 
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
    // $ANTLR end "rule__Template__Group_7__3__Impl"


    // $ANTLR start "rule__Template__Group_7__4"
    // InternalBurst.g:2296:1: rule__Template__Group_7__4 : rule__Template__Group_7__4__Impl ;
    public final void rule__Template__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2300:1: ( rule__Template__Group_7__4__Impl )
            // InternalBurst.g:2301:2: rule__Template__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2307:1: rule__Template__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Template__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2311:1: ( ( '}' ) )
            // InternalBurst.g:2312:1: ( '}' )
            {
            // InternalBurst.g:2312:1: ( '}' )
            // InternalBurst.g:2313:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4()); 
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
    // $ANTLR end "rule__Template__Group_7__4__Impl"


    // $ANTLR start "rule__Template__Group_7_3__0"
    // InternalBurst.g:2323:1: rule__Template__Group_7_3__0 : rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 ;
    public final void rule__Template__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2327:1: ( rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 )
            // InternalBurst.g:2328:2: rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Template__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Template__Group_7_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2335:1: rule__Template__Group_7_3__0__Impl : ( ( rule__Template__ElementsAssignment_7_3_0 ) ) ;
    public final void rule__Template__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2339:1: ( ( ( rule__Template__ElementsAssignment_7_3_0 ) ) )
            // InternalBurst.g:2340:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            {
            // InternalBurst.g:2340:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            // InternalBurst.g:2341:2: ( rule__Template__ElementsAssignment_7_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 
            }
            // InternalBurst.g:2342:2: ( rule__Template__ElementsAssignment_7_3_0 )
            // InternalBurst.g:2342:3: rule__Template__ElementsAssignment_7_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Template__ElementsAssignment_7_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 
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
    // $ANTLR end "rule__Template__Group_7_3__0__Impl"


    // $ANTLR start "rule__Template__Group_7_3__1"
    // InternalBurst.g:2350:1: rule__Template__Group_7_3__1 : rule__Template__Group_7_3__1__Impl ;
    public final void rule__Template__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2354:1: ( rule__Template__Group_7_3__1__Impl )
            // InternalBurst.g:2355:2: rule__Template__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group_7_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2361:1: rule__Template__Group_7_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Template__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2365:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2366:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2366:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2367:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2367:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2368:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }
            // InternalBurst.g:2369:3: ( RULE_ENDLINE )
            // InternalBurst.g:2369:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }

            }

            // InternalBurst.g:2372:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2373:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }
            // InternalBurst.g:2374:3: ( RULE_ENDLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENDLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBurst.g:2374:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }

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
    // InternalBurst.g:2384:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2388:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:2389:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Member__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2396:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2400:1: ( ( () ) )
            // InternalBurst.g:2401:1: ( () )
            {
            // InternalBurst.g:2401:1: ( () )
            // InternalBurst.g:2402:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            }
            // InternalBurst.g:2403:2: ()
            // InternalBurst.g:2403:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getMemberAction_0()); 
            }

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
    // InternalBurst.g:2411:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2415:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:2416:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Member__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2423:1: rule__Member__Group__1__Impl : ( ( rule__Member__ActAsAssignment_1 )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2427:1: ( ( ( rule__Member__ActAsAssignment_1 )? ) )
            // InternalBurst.g:2428:1: ( ( rule__Member__ActAsAssignment_1 )? )
            {
            // InternalBurst.g:2428:1: ( ( rule__Member__ActAsAssignment_1 )? )
            // InternalBurst.g:2429:2: ( rule__Member__ActAsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getActAsAssignment_1()); 
            }
            // InternalBurst.g:2430:2: ( rule__Member__ActAsAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBurst.g:2430:3: rule__Member__ActAsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__ActAsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getActAsAssignment_1()); 
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
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalBurst.g:2438:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2442:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalBurst.g:2443:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Member__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Member__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2450:1: rule__Member__Group__2__Impl : ( ( rule__Member__IsContentAssignment_2 )? ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2454:1: ( ( ( rule__Member__IsContentAssignment_2 )? ) )
            // InternalBurst.g:2455:1: ( ( rule__Member__IsContentAssignment_2 )? )
            {
            // InternalBurst.g:2455:1: ( ( rule__Member__IsContentAssignment_2 )? )
            // InternalBurst.g:2456:2: ( rule__Member__IsContentAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getIsContentAssignment_2()); 
            }
            // InternalBurst.g:2457:2: ( rule__Member__IsContentAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBurst.g:2457:3: rule__Member__IsContentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__IsContentAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getIsContentAssignment_2()); 
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
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__3"
    // InternalBurst.g:2465:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2469:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalBurst.g:2470:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Member__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Member__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2477:1: rule__Member__Group__3__Impl : ( ( rule__Member__ConcernAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2481:1: ( ( ( rule__Member__ConcernAssignment_3 ) ) )
            // InternalBurst.g:2482:1: ( ( rule__Member__ConcernAssignment_3 ) )
            {
            // InternalBurst.g:2482:1: ( ( rule__Member__ConcernAssignment_3 ) )
            // InternalBurst.g:2483:2: ( rule__Member__ConcernAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getConcernAssignment_3()); 
            }
            // InternalBurst.g:2484:2: ( rule__Member__ConcernAssignment_3 )
            // InternalBurst.g:2484:3: rule__Member__ConcernAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Member__ConcernAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getConcernAssignment_3()); 
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
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group__4"
    // InternalBurst.g:2492:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2496:1: ( rule__Member__Group__4__Impl )
            // InternalBurst.g:2497:2: rule__Member__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2503:1: rule__Member__Group__4__Impl : ( ( rule__Member__NameAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2507:1: ( ( ( rule__Member__NameAssignment_4 ) ) )
            // InternalBurst.g:2508:1: ( ( rule__Member__NameAssignment_4 ) )
            {
            // InternalBurst.g:2508:1: ( ( rule__Member__NameAssignment_4 ) )
            // InternalBurst.g:2509:2: ( rule__Member__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getNameAssignment_4()); 
            }
            // InternalBurst.g:2510:2: ( rule__Member__NameAssignment_4 )
            // InternalBurst.g:2510:3: rule__Member__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getNameAssignment_4()); 
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
    // $ANTLR end "rule__Member__Group__4__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__0"
    // InternalBurst.g:2519:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2523:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:2524:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RuleIntersect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2531:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2535:1: ( ( () ) )
            // InternalBurst.g:2536:1: ( () )
            {
            // InternalBurst.g:2536:1: ( () )
            // InternalBurst.g:2537:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            }
            // InternalBurst.g:2538:2: ()
            // InternalBurst.g:2538:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            }

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
    // InternalBurst.g:2546:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2550:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:2551:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2558:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2562:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:2563:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:2563:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:2564:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            }
            // InternalBurst.g:2565:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:2565:3: rule__RuleIntersect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__2"
    // InternalBurst.g:2573:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2577:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:2578:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2585:1: rule__RuleIntersect__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2589:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2590:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2590:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2591:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
            }
            // InternalBurst.g:2592:2: ( RULE_ENDLINE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ENDLINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBurst.g:2592:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__3"
    // InternalBurst.g:2600:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2604:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:2605:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RuleIntersect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2612:1: rule__RuleIntersect__Group__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2616:1: ( ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) )
            // InternalBurst.g:2617:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            {
            // InternalBurst.g:2617:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            // InternalBurst.g:2618:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 
            }
            // InternalBurst.g:2619:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            // InternalBurst.g:2619:3: rule__RuleIntersect__ParamsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__4"
    // InternalBurst.g:2627:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2631:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:2632:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__RuleIntersect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2639:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__Group_4__0 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2643:1: ( ( ( rule__RuleIntersect__Group_4__0 )* ) )
            // InternalBurst.g:2644:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            {
            // InternalBurst.g:2644:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            // InternalBurst.g:2645:2: ( rule__RuleIntersect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
            }
            // InternalBurst.g:2646:2: ( rule__RuleIntersect__Group_4__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ENDLINE||LA35_0==RULE_ID||(LA35_0>=12 && LA35_0<=13)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBurst.g:2646:3: rule__RuleIntersect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__4__Impl"


    // $ANTLR start "rule__RuleIntersect__Group__5"
    // InternalBurst.g:2654:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2658:1: ( rule__RuleIntersect__Group__5__Impl )
            // InternalBurst.g:2659:2: rule__RuleIntersect__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2665:1: rule__RuleIntersect__Group__5__Impl : ( ( rule__RuleIntersect__BlockAssignment_5 ) ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2669:1: ( ( ( rule__RuleIntersect__BlockAssignment_5 ) ) )
            // InternalBurst.g:2670:1: ( ( rule__RuleIntersect__BlockAssignment_5 ) )
            {
            // InternalBurst.g:2670:1: ( ( rule__RuleIntersect__BlockAssignment_5 ) )
            // InternalBurst.g:2671:2: ( rule__RuleIntersect__BlockAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getBlockAssignment_5()); 
            }
            // InternalBurst.g:2672:2: ( rule__RuleIntersect__BlockAssignment_5 )
            // InternalBurst.g:2672:3: rule__RuleIntersect__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__BlockAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getBlockAssignment_5()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__5__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__0"
    // InternalBurst.g:2681:1: rule__RuleIntersect__Group_4__0 : rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 ;
    public final void rule__RuleIntersect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2685:1: ( rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 )
            // InternalBurst.g:2686:2: rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2693:1: rule__RuleIntersect__Group_4__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2697:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2698:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2698:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2699:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
            }
            // InternalBurst.g:2700:2: ( RULE_ENDLINE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ENDLINE) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred47_InternalBurst()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalBurst.g:2700:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_4__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__1"
    // InternalBurst.g:2708:1: rule__RuleIntersect__Group_4__1 : rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 ;
    public final void rule__RuleIntersect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2712:1: ( rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 )
            // InternalBurst.g:2713:2: rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2720:1: rule__RuleIntersect__Group_4__1__Impl : ( ( rule__RuleIntersect__Alternatives_4_1 )? ) ;
    public final void rule__RuleIntersect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2724:1: ( ( ( rule__RuleIntersect__Alternatives_4_1 )? ) )
            // InternalBurst.g:2725:1: ( ( rule__RuleIntersect__Alternatives_4_1 )? )
            {
            // InternalBurst.g:2725:1: ( ( rule__RuleIntersect__Alternatives_4_1 )? )
            // InternalBurst.g:2726:2: ( rule__RuleIntersect__Alternatives_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
            }
            // InternalBurst.g:2727:2: ( rule__RuleIntersect__Alternatives_4_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=12 && LA37_0<=13)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBurst.g:2727:3: rule__RuleIntersect__Alternatives_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleIntersect__Alternatives_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_4__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__2"
    // InternalBurst.g:2735:1: rule__RuleIntersect__Group_4__2 : rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 ;
    public final void rule__RuleIntersect__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2739:1: ( rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 )
            // InternalBurst.g:2740:2: rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2747:1: rule__RuleIntersect__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2751:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2752:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2752:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2753:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
            }
            // InternalBurst.g:2754:2: ( RULE_ENDLINE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ENDLINE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBurst.g:2754:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_4__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__3"
    // InternalBurst.g:2762:1: rule__RuleIntersect__Group_4__3 : rule__RuleIntersect__Group_4__3__Impl ;
    public final void rule__RuleIntersect__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2766:1: ( rule__RuleIntersect__Group_4__3__Impl )
            // InternalBurst.g:2767:2: rule__RuleIntersect__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:2773:1: rule__RuleIntersect__Group_4__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) ;
    public final void rule__RuleIntersect__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2777:1: ( ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) )
            // InternalBurst.g:2778:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            {
            // InternalBurst.g:2778:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            // InternalBurst.g:2779:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 
            }
            // InternalBurst.g:2780:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            // InternalBurst.g:2780:3: rule__RuleIntersect__ParamsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__ParamsAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_4__3__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalBurst.g:2789:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2793:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalBurst.g:2794:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalBurst.g:2801:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2805:1: ( ( () ) )
            // InternalBurst.g:2806:1: ( () )
            {
            // InternalBurst.g:2806:1: ( () )
            // InternalBurst.g:2807:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalBurst.g:2808:2: ()
            // InternalBurst.g:2808:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalBurst.g:2816:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2820:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalBurst.g:2821:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalBurst.g:2828:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2832:1: ( ( '{' ) )
            // InternalBurst.g:2833:1: ( '{' )
            {
            // InternalBurst.g:2833:1: ( '{' )
            // InternalBurst.g:2834:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalBurst.g:2843:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2847:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalBurst.g:2848:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalBurst.g:2855:1: rule__Block__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2859:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2860:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2860:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2861:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_2()); 
            }
            // InternalBurst.g:2862:2: ( RULE_ENDLINE )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ENDLINE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBurst.g:2862:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalBurst.g:2870:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2874:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalBurst.g:2875:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalBurst.g:2882:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2886:1: ( ( ( rule__Block__Group_3__0 )? ) )
            // InternalBurst.g:2887:1: ( ( rule__Block__Group_3__0 )? )
            {
            // InternalBurst.g:2887:1: ( ( rule__Block__Group_3__0 )? )
            // InternalBurst.g:2888:2: ( rule__Block__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup_3()); 
            }
            // InternalBurst.g:2889:2: ( rule__Block__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)||(LA40_0>=14 && LA40_0<=17)||LA40_0==21||LA40_0==27||(LA40_0>=30 && LA40_0<=31)||LA40_0==33||(LA40_0>=40 && LA40_0<=41)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBurst.g:2889:3: rule__Block__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalBurst.g:2897:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2901:1: ( rule__Block__Group__4__Impl )
            // InternalBurst.g:2902:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalBurst.g:2908:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2912:1: ( ( '}' ) )
            // InternalBurst.g:2913:1: ( '}' )
            {
            // InternalBurst.g:2913:1: ( '}' )
            // InternalBurst.g:2914:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group_3__0"
    // InternalBurst.g:2924:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2928:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalBurst.g:2929:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Block__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0"


    // $ANTLR start "rule__Block__Group_3__0__Impl"
    // InternalBurst.g:2936:1: rule__Block__Group_3__0__Impl : ( ( rule__Block__LinesAssignment_3_0 ) ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2940:1: ( ( ( rule__Block__LinesAssignment_3_0 ) ) )
            // InternalBurst.g:2941:1: ( ( rule__Block__LinesAssignment_3_0 ) )
            {
            // InternalBurst.g:2941:1: ( ( rule__Block__LinesAssignment_3_0 ) )
            // InternalBurst.g:2942:2: ( rule__Block__LinesAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesAssignment_3_0()); 
            }
            // InternalBurst.g:2943:2: ( rule__Block__LinesAssignment_3_0 )
            // InternalBurst.g:2943:3: rule__Block__LinesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Block__LinesAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLinesAssignment_3_0()); 
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
    // $ANTLR end "rule__Block__Group_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3__1"
    // InternalBurst.g:2951:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl rule__Block__Group_3__2 ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2955:1: ( rule__Block__Group_3__1__Impl rule__Block__Group_3__2 )
            // InternalBurst.g:2956:2: rule__Block__Group_3__1__Impl rule__Block__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Block__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1"


    // $ANTLR start "rule__Block__Group_3__1__Impl"
    // InternalBurst.g:2963:1: rule__Block__Group_3__1__Impl : ( ( rule__Block__Group_3_1__0 )* ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2967:1: ( ( ( rule__Block__Group_3_1__0 )* ) )
            // InternalBurst.g:2968:1: ( ( rule__Block__Group_3_1__0 )* )
            {
            // InternalBurst.g:2968:1: ( ( rule__Block__Group_3_1__0 )* )
            // InternalBurst.g:2969:2: ( rule__Block__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup_3_1()); 
            }
            // InternalBurst.g:2970:2: ( rule__Block__Group_3_1__0 )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalBurst.g:2970:3: rule__Block__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Block__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Block__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group_3__2"
    // InternalBurst.g:2978:1: rule__Block__Group_3__2 : rule__Block__Group_3__2__Impl ;
    public final void rule__Block__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2982:1: ( rule__Block__Group_3__2__Impl )
            // InternalBurst.g:2983:2: rule__Block__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__2"


    // $ANTLR start "rule__Block__Group_3__2__Impl"
    // InternalBurst.g:2989:1: rule__Block__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Block__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2993:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2994:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2994:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2995:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_2()); 
            }
            // InternalBurst.g:2996:2: ( RULE_ENDLINE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ENDLINE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBurst.g:2996:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_2()); 
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
    // $ANTLR end "rule__Block__Group_3__2__Impl"


    // $ANTLR start "rule__Block__Group_3_1__0"
    // InternalBurst.g:3005:1: rule__Block__Group_3_1__0 : rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1 ;
    public final void rule__Block__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3009:1: ( rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1 )
            // InternalBurst.g:3010:2: rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Block__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Block__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_1__0"


    // $ANTLR start "rule__Block__Group_3_1__0__Impl"
    // InternalBurst.g:3017:1: rule__Block__Group_3_1__0__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Block__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3021:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:3022:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:3022:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3023:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3023:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:3024:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3025:3: ( RULE_ENDLINE )
            // InternalBurst.g:3025:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

            }

            // InternalBurst.g:3028:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3029:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3030:3: ( RULE_ENDLINE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ENDLINE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBurst.g:3030:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__Block__Group_3_1__0__Impl"


    // $ANTLR start "rule__Block__Group_3_1__1"
    // InternalBurst.g:3039:1: rule__Block__Group_3_1__1 : rule__Block__Group_3_1__1__Impl ;
    public final void rule__Block__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3043:1: ( rule__Block__Group_3_1__1__Impl )
            // InternalBurst.g:3044:2: rule__Block__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3_1__1"


    // $ANTLR start "rule__Block__Group_3_1__1__Impl"
    // InternalBurst.g:3050:1: rule__Block__Group_3_1__1__Impl : ( ( rule__Block__LinesAssignment_3_1_1 ) ) ;
    public final void rule__Block__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3054:1: ( ( ( rule__Block__LinesAssignment_3_1_1 ) ) )
            // InternalBurst.g:3055:1: ( ( rule__Block__LinesAssignment_3_1_1 ) )
            {
            // InternalBurst.g:3055:1: ( ( rule__Block__LinesAssignment_3_1_1 ) )
            // InternalBurst.g:3056:2: ( rule__Block__LinesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesAssignment_3_1_1()); 
            }
            // InternalBurst.g:3057:2: ( rule__Block__LinesAssignment_3_1_1 )
            // InternalBurst.g:3057:3: rule__Block__LinesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__LinesAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLinesAssignment_3_1_1()); 
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
    // $ANTLR end "rule__Block__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalBurst.g:3066:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3070:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalBurst.g:3071:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3078:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3082:1: ( ( () ) )
            // InternalBurst.g:3083:1: ( () )
            {
            // InternalBurst.g:3083:1: ( () )
            // InternalBurst.g:3084:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            }
            // InternalBurst.g:3085:2: ()
            // InternalBurst.g:3085:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getParameterAction_0()); 
            }

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
    // InternalBurst.g:3093:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3097:1: ( rule__Parameter__Group__1__Impl )
            // InternalBurst.g:3098:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3104:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Alternatives_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3108:1: ( ( ( rule__Parameter__Alternatives_1 ) ) )
            // InternalBurst.g:3109:1: ( ( rule__Parameter__Alternatives_1 ) )
            {
            // InternalBurst.g:3109:1: ( ( rule__Parameter__Alternatives_1 ) )
            // InternalBurst.g:3110:2: ( rule__Parameter__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives_1()); 
            }
            // InternalBurst.g:3111:2: ( rule__Parameter__Alternatives_1 )
            // InternalBurst.g:3111:3: rule__Parameter__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__0"
    // InternalBurst.g:3120:1: rule__Parameter__Group_1_1__0 : rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 ;
    public final void rule__Parameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3124:1: ( rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1 )
            // InternalBurst.g:3125:2: rule__Parameter__Group_1_1__0__Impl rule__Parameter__Group_1_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__0"


    // $ANTLR start "rule__Parameter__Group_1_1__0__Impl"
    // InternalBurst.g:3132:1: rule__Parameter__Group_1_1__0__Impl : ( ( rule__Parameter__TypeAssignment_1_1_0 ) ) ;
    public final void rule__Parameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3136:1: ( ( ( rule__Parameter__TypeAssignment_1_1_0 ) ) )
            // InternalBurst.g:3137:1: ( ( rule__Parameter__TypeAssignment_1_1_0 ) )
            {
            // InternalBurst.g:3137:1: ( ( rule__Parameter__TypeAssignment_1_1_0 ) )
            // InternalBurst.g:3138:2: ( rule__Parameter__TypeAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_1_1_0()); 
            }
            // InternalBurst.g:3139:2: ( rule__Parameter__TypeAssignment_1_1_0 )
            // InternalBurst.g:3139:3: rule__Parameter__TypeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_1_1_0()); 
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
    // $ANTLR end "rule__Parameter__Group_1_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__1"
    // InternalBurst.g:3147:1: rule__Parameter__Group_1_1__1 : rule__Parameter__Group_1_1__1__Impl rule__Parameter__Group_1_1__2 ;
    public final void rule__Parameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3151:1: ( rule__Parameter__Group_1_1__1__Impl rule__Parameter__Group_1_1__2 )
            // InternalBurst.g:3152:2: rule__Parameter__Group_1_1__1__Impl rule__Parameter__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__1"


    // $ANTLR start "rule__Parameter__Group_1_1__1__Impl"
    // InternalBurst.g:3159:1: rule__Parameter__Group_1_1__1__Impl : ( '(' ) ;
    public final void rule__Parameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3163:1: ( ( '(' ) )
            // InternalBurst.g:3164:1: ( '(' )
            {
            // InternalBurst.g:3164:1: ( '(' )
            // InternalBurst.g:3165:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_1_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_1_1()); 
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
    // $ANTLR end "rule__Parameter__Group_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__2"
    // InternalBurst.g:3174:1: rule__Parameter__Group_1_1__2 : rule__Parameter__Group_1_1__2__Impl rule__Parameter__Group_1_1__3 ;
    public final void rule__Parameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3178:1: ( rule__Parameter__Group_1_1__2__Impl rule__Parameter__Group_1_1__3 )
            // InternalBurst.g:3179:2: rule__Parameter__Group_1_1__2__Impl rule__Parameter__Group_1_1__3
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__2"


    // $ANTLR start "rule__Parameter__Group_1_1__2__Impl"
    // InternalBurst.g:3186:1: rule__Parameter__Group_1_1__2__Impl : ( ( rule__Parameter__NameAssignment_1_1_2 ) ) ;
    public final void rule__Parameter__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3190:1: ( ( ( rule__Parameter__NameAssignment_1_1_2 ) ) )
            // InternalBurst.g:3191:1: ( ( rule__Parameter__NameAssignment_1_1_2 ) )
            {
            // InternalBurst.g:3191:1: ( ( rule__Parameter__NameAssignment_1_1_2 ) )
            // InternalBurst.g:3192:2: ( rule__Parameter__NameAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1_1_2()); 
            }
            // InternalBurst.g:3193:2: ( rule__Parameter__NameAssignment_1_1_2 )
            // InternalBurst.g:3193:3: rule__Parameter__NameAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1_1_2()); 
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
    // $ANTLR end "rule__Parameter__Group_1_1__2__Impl"


    // $ANTLR start "rule__Parameter__Group_1_1__3"
    // InternalBurst.g:3201:1: rule__Parameter__Group_1_1__3 : rule__Parameter__Group_1_1__3__Impl ;
    public final void rule__Parameter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3205:1: ( rule__Parameter__Group_1_1__3__Impl )
            // InternalBurst.g:3206:2: rule__Parameter__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_1__3"


    // $ANTLR start "rule__Parameter__Group_1_1__3__Impl"
    // InternalBurst.g:3212:1: rule__Parameter__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3216:1: ( ( ')' ) )
            // InternalBurst.g:3217:1: ( ')' )
            {
            // InternalBurst.g:3217:1: ( ')' )
            // InternalBurst.g:3218:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_1_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_1_3()); 
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
    // $ANTLR end "rule__Parameter__Group_1_1__3__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__0"
    // InternalBurst.g:3228:1: rule__Parameter__Group_1_2__0 : rule__Parameter__Group_1_2__0__Impl rule__Parameter__Group_1_2__1 ;
    public final void rule__Parameter__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3232:1: ( rule__Parameter__Group_1_2__0__Impl rule__Parameter__Group_1_2__1 )
            // InternalBurst.g:3233:2: rule__Parameter__Group_1_2__0__Impl rule__Parameter__Group_1_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__0"


    // $ANTLR start "rule__Parameter__Group_1_2__0__Impl"
    // InternalBurst.g:3240:1: rule__Parameter__Group_1_2__0__Impl : ( ( rule__Parameter__RoleAssignment_1_2_0 ) ) ;
    public final void rule__Parameter__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3244:1: ( ( ( rule__Parameter__RoleAssignment_1_2_0 ) ) )
            // InternalBurst.g:3245:1: ( ( rule__Parameter__RoleAssignment_1_2_0 ) )
            {
            // InternalBurst.g:3245:1: ( ( rule__Parameter__RoleAssignment_1_2_0 ) )
            // InternalBurst.g:3246:2: ( rule__Parameter__RoleAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleAssignment_1_2_0()); 
            }
            // InternalBurst.g:3247:2: ( rule__Parameter__RoleAssignment_1_2_0 )
            // InternalBurst.g:3247:3: rule__Parameter__RoleAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__RoleAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleAssignment_1_2_0()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__1"
    // InternalBurst.g:3255:1: rule__Parameter__Group_1_2__1 : rule__Parameter__Group_1_2__1__Impl rule__Parameter__Group_1_2__2 ;
    public final void rule__Parameter__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3259:1: ( rule__Parameter__Group_1_2__1__Impl rule__Parameter__Group_1_2__2 )
            // InternalBurst.g:3260:2: rule__Parameter__Group_1_2__1__Impl rule__Parameter__Group_1_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__1"


    // $ANTLR start "rule__Parameter__Group_1_2__1__Impl"
    // InternalBurst.g:3267:1: rule__Parameter__Group_1_2__1__Impl : ( '(' ) ;
    public final void rule__Parameter__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3271:1: ( ( '(' ) )
            // InternalBurst.g:3272:1: ( '(' )
            {
            // InternalBurst.g:3272:1: ( '(' )
            // InternalBurst.g:3273:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_2_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_2_1()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__2"
    // InternalBurst.g:3282:1: rule__Parameter__Group_1_2__2 : rule__Parameter__Group_1_2__2__Impl rule__Parameter__Group_1_2__3 ;
    public final void rule__Parameter__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3286:1: ( rule__Parameter__Group_1_2__2__Impl rule__Parameter__Group_1_2__3 )
            // InternalBurst.g:3287:2: rule__Parameter__Group_1_2__2__Impl rule__Parameter__Group_1_2__3
            {
            pushFollow(FOLLOW_32);
            rule__Parameter__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__2"


    // $ANTLR start "rule__Parameter__Group_1_2__2__Impl"
    // InternalBurst.g:3294:1: rule__Parameter__Group_1_2__2__Impl : ( ( rule__Parameter__TypeAssignment_1_2_2 ) ) ;
    public final void rule__Parameter__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3298:1: ( ( ( rule__Parameter__TypeAssignment_1_2_2 ) ) )
            // InternalBurst.g:3299:1: ( ( rule__Parameter__TypeAssignment_1_2_2 ) )
            {
            // InternalBurst.g:3299:1: ( ( rule__Parameter__TypeAssignment_1_2_2 ) )
            // InternalBurst.g:3300:2: ( rule__Parameter__TypeAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_1_2_2()); 
            }
            // InternalBurst.g:3301:2: ( rule__Parameter__TypeAssignment_1_2_2 )
            // InternalBurst.g:3301:3: rule__Parameter__TypeAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_1_2_2()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__2__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__3"
    // InternalBurst.g:3309:1: rule__Parameter__Group_1_2__3 : rule__Parameter__Group_1_2__3__Impl rule__Parameter__Group_1_2__4 ;
    public final void rule__Parameter__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3313:1: ( rule__Parameter__Group_1_2__3__Impl rule__Parameter__Group_1_2__4 )
            // InternalBurst.g:3314:2: rule__Parameter__Group_1_2__3__Impl rule__Parameter__Group_1_2__4
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group_1_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__3"


    // $ANTLR start "rule__Parameter__Group_1_2__3__Impl"
    // InternalBurst.g:3321:1: rule__Parameter__Group_1_2__3__Impl : ( 'called' ) ;
    public final void rule__Parameter__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3325:1: ( ( 'called' ) )
            // InternalBurst.g:3326:1: ( 'called' )
            {
            // InternalBurst.g:3326:1: ( 'called' )
            // InternalBurst.g:3327:2: 'called'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCalledKeyword_1_2_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCalledKeyword_1_2_3()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__3__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__4"
    // InternalBurst.g:3336:1: rule__Parameter__Group_1_2__4 : rule__Parameter__Group_1_2__4__Impl rule__Parameter__Group_1_2__5 ;
    public final void rule__Parameter__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3340:1: ( rule__Parameter__Group_1_2__4__Impl rule__Parameter__Group_1_2__5 )
            // InternalBurst.g:3341:2: rule__Parameter__Group_1_2__4__Impl rule__Parameter__Group_1_2__5
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group_1_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__4"


    // $ANTLR start "rule__Parameter__Group_1_2__4__Impl"
    // InternalBurst.g:3348:1: rule__Parameter__Group_1_2__4__Impl : ( ( rule__Parameter__NameAssignment_1_2_4 ) ) ;
    public final void rule__Parameter__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3352:1: ( ( ( rule__Parameter__NameAssignment_1_2_4 ) ) )
            // InternalBurst.g:3353:1: ( ( rule__Parameter__NameAssignment_1_2_4 ) )
            {
            // InternalBurst.g:3353:1: ( ( rule__Parameter__NameAssignment_1_2_4 ) )
            // InternalBurst.g:3354:2: ( rule__Parameter__NameAssignment_1_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_1_2_4()); 
            }
            // InternalBurst.g:3355:2: ( rule__Parameter__NameAssignment_1_2_4 )
            // InternalBurst.g:3355:3: rule__Parameter__NameAssignment_1_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_1_2_4()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__4__Impl"


    // $ANTLR start "rule__Parameter__Group_1_2__5"
    // InternalBurst.g:3363:1: rule__Parameter__Group_1_2__5 : rule__Parameter__Group_1_2__5__Impl ;
    public final void rule__Parameter__Group_1_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3367:1: ( rule__Parameter__Group_1_2__5__Impl )
            // InternalBurst.g:3368:2: rule__Parameter__Group_1_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_1_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_2__5"


    // $ANTLR start "rule__Parameter__Group_1_2__5__Impl"
    // InternalBurst.g:3374:1: rule__Parameter__Group_1_2__5__Impl : ( ')' ) ;
    public final void rule__Parameter__Group_1_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3378:1: ( ( ')' ) )
            // InternalBurst.g:3379:1: ( ')' )
            {
            // InternalBurst.g:3379:1: ( ')' )
            // InternalBurst.g:3380:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_2_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_2_5()); 
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
    // $ANTLR end "rule__Parameter__Group_1_2__5__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalBurst.g:3390:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3394:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalBurst.g:3395:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Stop__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalBurst.g:3402:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3406:1: ( ( () ) )
            // InternalBurst.g:3407:1: ( () )
            {
            // InternalBurst.g:3407:1: ( () )
            // InternalBurst.g:3408:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getStopAction_0()); 
            }
            // InternalBurst.g:3409:2: ()
            // InternalBurst.g:3409:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopAccess().getStopAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalBurst.g:3417:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3421:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // InternalBurst.g:3422:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Stop__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Stop__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalBurst.g:3429:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3433:1: ( ( 'stop' ) )
            // InternalBurst.g:3434:1: ( 'stop' )
            {
            // InternalBurst.g:3434:1: ( 'stop' )
            // InternalBurst.g:3435:2: 'stop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopAccess().getStopKeyword_1()); 
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
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Stop__Group__2"
    // InternalBurst.g:3444:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3448:1: ( rule__Stop__Group__2__Impl )
            // InternalBurst.g:3449:2: rule__Stop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__2"


    // $ANTLR start "rule__Stop__Group__2__Impl"
    // InternalBurst.g:3455:1: rule__Stop__Group__2__Impl : ( ( rule__Stop__ConditionAssignment_2 )? ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3459:1: ( ( ( rule__Stop__ConditionAssignment_2 )? ) )
            // InternalBurst.g:3460:1: ( ( rule__Stop__ConditionAssignment_2 )? )
            {
            // InternalBurst.g:3460:1: ( ( rule__Stop__ConditionAssignment_2 )? )
            // InternalBurst.g:3461:2: ( rule__Stop__ConditionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getConditionAssignment_2()); 
            }
            // InternalBurst.g:3462:2: ( rule__Stop__ConditionAssignment_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||(LA44_0>=14 && LA44_0<=15)||LA44_0==27||LA44_0==33||(LA44_0>=40 && LA44_0<=41)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBurst.g:3462:3: rule__Stop__ConditionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stop__ConditionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopAccess().getConditionAssignment_2()); 
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
    // $ANTLR end "rule__Stop__Group__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalBurst.g:3471:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3475:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalBurst.g:3476:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalBurst.g:3483:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3487:1: ( ( () ) )
            // InternalBurst.g:3488:1: ( () )
            {
            // InternalBurst.g:3488:1: ( () )
            // InternalBurst.g:3489:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfAction_0()); 
            }
            // InternalBurst.g:3490:2: ()
            // InternalBurst.g:3490:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalBurst.g:3498:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3502:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalBurst.g:3503:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalBurst.g:3510:1: rule__If__Group__1__Impl : ( 'if' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3514:1: ( ( 'if' ) )
            // InternalBurst.g:3515:1: ( 'if' )
            {
            // InternalBurst.g:3515:1: ( 'if' )
            // InternalBurst.g:3516:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_1()); 
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
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalBurst.g:3525:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3529:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalBurst.g:3530:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalBurst.g:3537:1: rule__If__Group__2__Impl : ( ( rule__If__ExpressionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3541:1: ( ( ( rule__If__ExpressionAssignment_2 ) ) )
            // InternalBurst.g:3542:1: ( ( rule__If__ExpressionAssignment_2 ) )
            {
            // InternalBurst.g:3542:1: ( ( rule__If__ExpressionAssignment_2 ) )
            // InternalBurst.g:3543:2: ( rule__If__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExpressionAssignment_2()); 
            }
            // InternalBurst.g:3544:2: ( rule__If__ExpressionAssignment_2 )
            // InternalBurst.g:3544:3: rule__If__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalBurst.g:3552:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3556:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalBurst.g:3557:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__If__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalBurst.g:3564:1: rule__If__Group__3__Impl : ( ( rule__If__Alternatives_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3568:1: ( ( ( rule__If__Alternatives_3 ) ) )
            // InternalBurst.g:3569:1: ( ( rule__If__Alternatives_3 ) )
            {
            // InternalBurst.g:3569:1: ( ( rule__If__Alternatives_3 ) )
            // InternalBurst.g:3570:2: ( rule__If__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_3()); 
            }
            // InternalBurst.g:3571:2: ( rule__If__Alternatives_3 )
            // InternalBurst.g:3571:3: rule__If__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalBurst.g:3579:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3583:1: ( rule__If__Group__4__Impl )
            // InternalBurst.g:3584:2: rule__If__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalBurst.g:3590:1: rule__If__Group__4__Impl : ( ( rule__If__Group_4__0 )? ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3594:1: ( ( ( rule__If__Group_4__0 )? ) )
            // InternalBurst.g:3595:1: ( ( rule__If__Group_4__0 )? )
            {
            // InternalBurst.g:3595:1: ( ( rule__If__Group_4__0 )? )
            // InternalBurst.g:3596:2: ( rule__If__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_4()); 
            }
            // InternalBurst.g:3597:2: ( rule__If__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ENDLINE) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred56_InternalBurst()) ) {
                    alt45=1;
                }
            }
            else if ( (LA45_0==32) ) {
                int LA45_2 = input.LA(2);

                if ( (synpred56_InternalBurst()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalBurst.g:3597:3: rule__If__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_4()); 
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
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group_3_1__0"
    // InternalBurst.g:3606:1: rule__If__Group_3_1__0 : rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1 ;
    public final void rule__If__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3610:1: ( rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1 )
            // InternalBurst.g:3611:2: rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1
            {
            pushFollow(FOLLOW_29);
            rule__If__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_3_1__0"


    // $ANTLR start "rule__If__Group_3_1__0__Impl"
    // InternalBurst.g:3618:1: rule__If__Group_3_1__0__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__If__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3622:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:3623:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:3623:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3624:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3624:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:3625:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3626:3: ( RULE_ENDLINE )
            // InternalBurst.g:3626:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

            }

            // InternalBurst.g:3629:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3630:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3631:3: ( RULE_ENDLINE )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ENDLINE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalBurst.g:3631:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__If__Group_3_1__0__Impl"


    // $ANTLR start "rule__If__Group_3_1__1"
    // InternalBurst.g:3640:1: rule__If__Group_3_1__1 : rule__If__Group_3_1__1__Impl ;
    public final void rule__If__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3644:1: ( rule__If__Group_3_1__1__Impl )
            // InternalBurst.g:3645:2: rule__If__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_3_1__1"


    // $ANTLR start "rule__If__Group_3_1__1__Impl"
    // InternalBurst.g:3651:1: rule__If__Group_3_1__1__Impl : ( ( rule__If__ThenBlockAssignment_3_1_1 ) ) ;
    public final void rule__If__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3655:1: ( ( ( rule__If__ThenBlockAssignment_3_1_1 ) ) )
            // InternalBurst.g:3656:1: ( ( rule__If__ThenBlockAssignment_3_1_1 ) )
            {
            // InternalBurst.g:3656:1: ( ( rule__If__ThenBlockAssignment_3_1_1 ) )
            // InternalBurst.g:3657:2: ( rule__If__ThenBlockAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenBlockAssignment_3_1_1()); 
            }
            // InternalBurst.g:3658:2: ( rule__If__ThenBlockAssignment_3_1_1 )
            // InternalBurst.g:3658:3: rule__If__ThenBlockAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ThenBlockAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenBlockAssignment_3_1_1()); 
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
    // $ANTLR end "rule__If__Group_3_1__1__Impl"


    // $ANTLR start "rule__If__Group_4__0"
    // InternalBurst.g:3667:1: rule__If__Group_4__0 : rule__If__Group_4__0__Impl rule__If__Group_4__1 ;
    public final void rule__If__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3671:1: ( rule__If__Group_4__0__Impl rule__If__Group_4__1 )
            // InternalBurst.g:3672:2: rule__If__Group_4__0__Impl rule__If__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__If__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_4__0"


    // $ANTLR start "rule__If__Group_4__0__Impl"
    // InternalBurst.g:3679:1: rule__If__Group_4__0__Impl : ( ( rule__If__Group_4_0__0 )* ) ;
    public final void rule__If__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3683:1: ( ( ( rule__If__Group_4_0__0 )* ) )
            // InternalBurst.g:3684:1: ( ( rule__If__Group_4_0__0 )* )
            {
            // InternalBurst.g:3684:1: ( ( rule__If__Group_4_0__0 )* )
            // InternalBurst.g:3685:2: ( rule__If__Group_4_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_4_0()); 
            }
            // InternalBurst.g:3686:2: ( rule__If__Group_4_0__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ENDLINE) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:3686:3: rule__If__Group_4_0__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__If__Group_4_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_4_0()); 
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
    // $ANTLR end "rule__If__Group_4__0__Impl"


    // $ANTLR start "rule__If__Group_4__1"
    // InternalBurst.g:3694:1: rule__If__Group_4__1 : rule__If__Group_4__1__Impl rule__If__Group_4__2 ;
    public final void rule__If__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3698:1: ( rule__If__Group_4__1__Impl rule__If__Group_4__2 )
            // InternalBurst.g:3699:2: rule__If__Group_4__1__Impl rule__If__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__If__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_4__1"


    // $ANTLR start "rule__If__Group_4__1__Impl"
    // InternalBurst.g:3706:1: rule__If__Group_4__1__Impl : ( 'else' ) ;
    public final void rule__If__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3710:1: ( ( 'else' ) )
            // InternalBurst.g:3711:1: ( 'else' )
            {
            // InternalBurst.g:3711:1: ( 'else' )
            // InternalBurst.g:3712:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_4_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseKeyword_4_1()); 
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
    // $ANTLR end "rule__If__Group_4__1__Impl"


    // $ANTLR start "rule__If__Group_4__2"
    // InternalBurst.g:3721:1: rule__If__Group_4__2 : rule__If__Group_4__2__Impl rule__If__Group_4__3 ;
    public final void rule__If__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3725:1: ( rule__If__Group_4__2__Impl rule__If__Group_4__3 )
            // InternalBurst.g:3726:2: rule__If__Group_4__2__Impl rule__If__Group_4__3
            {
            pushFollow(FOLLOW_29);
            rule__If__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_4__2"


    // $ANTLR start "rule__If__Group_4__2__Impl"
    // InternalBurst.g:3733:1: rule__If__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__If__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3737:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3738:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3738:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3739:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_2()); 
            }
            // InternalBurst.g:3740:2: ( RULE_ENDLINE )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ENDLINE) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBurst.g:3740:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_2()); 
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
    // $ANTLR end "rule__If__Group_4__2__Impl"


    // $ANTLR start "rule__If__Group_4__3"
    // InternalBurst.g:3748:1: rule__If__Group_4__3 : rule__If__Group_4__3__Impl ;
    public final void rule__If__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3752:1: ( rule__If__Group_4__3__Impl )
            // InternalBurst.g:3753:2: rule__If__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_4__3"


    // $ANTLR start "rule__If__Group_4__3__Impl"
    // InternalBurst.g:3759:1: rule__If__Group_4__3__Impl : ( ( rule__If__ElseBlockAssignment_4_3 ) ) ;
    public final void rule__If__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3763:1: ( ( ( rule__If__ElseBlockAssignment_4_3 ) ) )
            // InternalBurst.g:3764:1: ( ( rule__If__ElseBlockAssignment_4_3 ) )
            {
            // InternalBurst.g:3764:1: ( ( rule__If__ElseBlockAssignment_4_3 ) )
            // InternalBurst.g:3765:2: ( rule__If__ElseBlockAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseBlockAssignment_4_3()); 
            }
            // InternalBurst.g:3766:2: ( rule__If__ElseBlockAssignment_4_3 )
            // InternalBurst.g:3766:3: rule__If__ElseBlockAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseBlockAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseBlockAssignment_4_3()); 
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
    // $ANTLR end "rule__If__Group_4__3__Impl"


    // $ANTLR start "rule__If__Group_4_0__0"
    // InternalBurst.g:3775:1: rule__If__Group_4_0__0 : rule__If__Group_4_0__0__Impl ;
    public final void rule__If__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3779:1: ( rule__If__Group_4_0__0__Impl )
            // InternalBurst.g:3780:2: rule__If__Group_4_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_4_0__0"


    // $ANTLR start "rule__If__Group_4_0__0__Impl"
    // InternalBurst.g:3786:1: rule__If__Group_4_0__0__Impl : ( RULE_ENDLINE ) ;
    public final void rule__If__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3790:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:3791:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:3791:1: ( RULE_ENDLINE )
            // InternalBurst.g:3792:2: RULE_ENDLINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_ENDLINE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__If__Group_4_0__0__Impl"


    // $ANTLR start "rule__ContextManagement__Group__0"
    // InternalBurst.g:3802:1: rule__ContextManagement__Group__0 : rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 ;
    public final void rule__ContextManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3806:1: ( rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 )
            // InternalBurst.g:3807:2: rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ContextManagement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3814:1: rule__ContextManagement__Group__0__Impl : ( () ) ;
    public final void rule__ContextManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3818:1: ( ( () ) )
            // InternalBurst.g:3819:1: ( () )
            {
            // InternalBurst.g:3819:1: ( () )
            // InternalBurst.g:3820:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getContextManagementAction_0()); 
            }
            // InternalBurst.g:3821:2: ()
            // InternalBurst.g:3821:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getContextManagementAction_0()); 
            }

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
    // InternalBurst.g:3829:1: rule__ContextManagement__Group__1 : rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 ;
    public final void rule__ContextManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3833:1: ( rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 )
            // InternalBurst.g:3834:2: rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ContextManagement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3841:1: rule__ContextManagement__Group__1__Impl : ( ( rule__ContextManagement__ActionAssignment_1 ) ) ;
    public final void rule__ContextManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3845:1: ( ( ( rule__ContextManagement__ActionAssignment_1 ) ) )
            // InternalBurst.g:3846:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            {
            // InternalBurst.g:3846:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            // InternalBurst.g:3847:2: ( rule__ContextManagement__ActionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getActionAssignment_1()); 
            }
            // InternalBurst.g:3848:2: ( rule__ContextManagement__ActionAssignment_1 )
            // InternalBurst.g:3848:3: rule__ContextManagement__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__ActionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getActionAssignment_1()); 
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
    // $ANTLR end "rule__ContextManagement__Group__1__Impl"


    // $ANTLR start "rule__ContextManagement__Group__2"
    // InternalBurst.g:3856:1: rule__ContextManagement__Group__2 : rule__ContextManagement__Group__2__Impl ;
    public final void rule__ContextManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3860:1: ( rule__ContextManagement__Group__2__Impl )
            // InternalBurst.g:3861:2: rule__ContextManagement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3867:1: rule__ContextManagement__Group__2__Impl : ( ( rule__ContextManagement__TargetAssignment_2 ) ) ;
    public final void rule__ContextManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3871:1: ( ( ( rule__ContextManagement__TargetAssignment_2 ) ) )
            // InternalBurst.g:3872:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            {
            // InternalBurst.g:3872:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            // InternalBurst.g:3873:2: ( rule__ContextManagement__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getTargetAssignment_2()); 
            }
            // InternalBurst.g:3874:2: ( rule__ContextManagement__TargetAssignment_2 )
            // InternalBurst.g:3874:3: rule__ContextManagement__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextManagement__TargetAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getTargetAssignment_2()); 
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
    // $ANTLR end "rule__ContextManagement__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // InternalBurst.g:3883:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3887:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalBurst.g:3888:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Call__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3895:1: rule__Call__Group__0__Impl : ( () ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3899:1: ( ( () ) )
            // InternalBurst.g:3900:1: ( () )
            {
            // InternalBurst.g:3900:1: ( () )
            // InternalBurst.g:3901:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCallAction_0()); 
            }
            // InternalBurst.g:3902:2: ()
            // InternalBurst.g:3902:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // InternalBurst.g:3910:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3914:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalBurst.g:3915:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Call__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:3922:1: rule__Call__Group__1__Impl : ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3926:1: ( ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) ) )
            // InternalBurst.g:3927:1: ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) )
            {
            // InternalBurst.g:3927:1: ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) )
            // InternalBurst.g:3928:2: ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* )
            {
            // InternalBurst.g:3928:2: ( ( rule__Call__ContentAssignment_1 ) )
            // InternalBurst.g:3929:3: ( rule__Call__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }
            // InternalBurst.g:3930:3: ( rule__Call__ContentAssignment_1 )
            // InternalBurst.g:3930:4: rule__Call__ContentAssignment_1
            {
            pushFollow(FOLLOW_38);
            rule__Call__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }

            }

            // InternalBurst.g:3933:2: ( ( rule__Call__ContentAssignment_1 )* )
            // InternalBurst.g:3934:3: ( rule__Call__ContentAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }
            // InternalBurst.g:3935:3: ( rule__Call__ContentAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_STRING)||(LA49_0>=14 && LA49_0<=15)||LA49_0==27||LA49_0==33||(LA49_0>=40 && LA49_0<=41)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBurst.g:3935:4: rule__Call__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Call__ContentAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }

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
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // InternalBurst.g:3944:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3948:1: ( rule__Call__Group__2__Impl )
            // InternalBurst.g:3949:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // InternalBurst.g:3955:1: rule__Call__Group__2__Impl : ( ( rule__Call__Group_2__0 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3959:1: ( ( ( rule__Call__Group_2__0 )? ) )
            // InternalBurst.g:3960:1: ( ( rule__Call__Group_2__0 )? )
            {
            // InternalBurst.g:3960:1: ( ( rule__Call__Group_2__0 )? )
            // InternalBurst.g:3961:2: ( rule__Call__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_2()); 
            }
            // InternalBurst.g:3962:2: ( rule__Call__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBurst.g:3962:3: rule__Call__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Call__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Call__Group_2__0"
    // InternalBurst.g:3971:1: rule__Call__Group_2__0 : rule__Call__Group_2__0__Impl rule__Call__Group_2__1 ;
    public final void rule__Call__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3975:1: ( rule__Call__Group_2__0__Impl rule__Call__Group_2__1 )
            // InternalBurst.g:3976:2: rule__Call__Group_2__0__Impl rule__Call__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__Call__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Call__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__0"


    // $ANTLR start "rule__Call__Group_2__0__Impl"
    // InternalBurst.g:3983:1: rule__Call__Group_2__0__Impl : ( ( rule__Call__EqualityAssignment_2_0 ) ) ;
    public final void rule__Call__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3987:1: ( ( ( rule__Call__EqualityAssignment_2_0 ) ) )
            // InternalBurst.g:3988:1: ( ( rule__Call__EqualityAssignment_2_0 ) )
            {
            // InternalBurst.g:3988:1: ( ( rule__Call__EqualityAssignment_2_0 ) )
            // InternalBurst.g:3989:2: ( rule__Call__EqualityAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getEqualityAssignment_2_0()); 
            }
            // InternalBurst.g:3990:2: ( rule__Call__EqualityAssignment_2_0 )
            // InternalBurst.g:3990:3: rule__Call__EqualityAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Call__EqualityAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getEqualityAssignment_2_0()); 
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
    // $ANTLR end "rule__Call__Group_2__0__Impl"


    // $ANTLR start "rule__Call__Group_2__1"
    // InternalBurst.g:3998:1: rule__Call__Group_2__1 : rule__Call__Group_2__1__Impl ;
    public final void rule__Call__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4002:1: ( rule__Call__Group_2__1__Impl )
            // InternalBurst.g:4003:2: rule__Call__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_2__1"


    // $ANTLR start "rule__Call__Group_2__1__Impl"
    // InternalBurst.g:4009:1: rule__Call__Group_2__1__Impl : ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) ) ;
    public final void rule__Call__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4013:1: ( ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) ) )
            // InternalBurst.g:4014:1: ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) )
            {
            // InternalBurst.g:4014:1: ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) )
            // InternalBurst.g:4015:2: ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* )
            {
            // InternalBurst.g:4015:2: ( ( rule__Call__SourceAssignment_2_1 ) )
            // InternalBurst.g:4016:3: ( rule__Call__SourceAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }
            // InternalBurst.g:4017:3: ( rule__Call__SourceAssignment_2_1 )
            // InternalBurst.g:4017:4: rule__Call__SourceAssignment_2_1
            {
            pushFollow(FOLLOW_38);
            rule__Call__SourceAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }

            }

            // InternalBurst.g:4020:2: ( ( rule__Call__SourceAssignment_2_1 )* )
            // InternalBurst.g:4021:3: ( rule__Call__SourceAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }
            // InternalBurst.g:4022:3: ( rule__Call__SourceAssignment_2_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_INT && LA51_0<=RULE_STRING)||(LA51_0>=14 && LA51_0<=15)||LA51_0==27||LA51_0==33||(LA51_0>=40 && LA51_0<=41)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBurst.g:4022:4: rule__Call__SourceAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Call__SourceAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__Call__Group_2__1__Impl"


    // $ANTLR start "rule__Locale__Group__0"
    // InternalBurst.g:4032:1: rule__Locale__Group__0 : rule__Locale__Group__0__Impl rule__Locale__Group__1 ;
    public final void rule__Locale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4036:1: ( rule__Locale__Group__0__Impl rule__Locale__Group__1 )
            // InternalBurst.g:4037:2: rule__Locale__Group__0__Impl rule__Locale__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Locale__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Locale__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4044:1: rule__Locale__Group__0__Impl : ( () ) ;
    public final void rule__Locale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4048:1: ( ( () ) )
            // InternalBurst.g:4049:1: ( () )
            {
            // InternalBurst.g:4049:1: ( () )
            // InternalBurst.g:4050:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getLocaleAction_0()); 
            }
            // InternalBurst.g:4051:2: ()
            // InternalBurst.g:4051:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getLocaleAction_0()); 
            }

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
    // InternalBurst.g:4059:1: rule__Locale__Group__1 : rule__Locale__Group__1__Impl rule__Locale__Group__2 ;
    public final void rule__Locale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4063:1: ( rule__Locale__Group__1__Impl rule__Locale__Group__2 )
            // InternalBurst.g:4064:2: rule__Locale__Group__1__Impl rule__Locale__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Locale__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4071:1: rule__Locale__Group__1__Impl : ( 'new' ) ;
    public final void rule__Locale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4075:1: ( ( 'new' ) )
            // InternalBurst.g:4076:1: ( 'new' )
            {
            // InternalBurst.g:4076:1: ( 'new' )
            // InternalBurst.g:4077:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getNewKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getNewKeyword_1()); 
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
    // $ANTLR end "rule__Locale__Group__1__Impl"


    // $ANTLR start "rule__Locale__Group__2"
    // InternalBurst.g:4086:1: rule__Locale__Group__2 : rule__Locale__Group__2__Impl rule__Locale__Group__3 ;
    public final void rule__Locale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4090:1: ( rule__Locale__Group__2__Impl rule__Locale__Group__3 )
            // InternalBurst.g:4091:2: rule__Locale__Group__2__Impl rule__Locale__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Locale__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4098:1: rule__Locale__Group__2__Impl : ( ( rule__Locale__TypeAssignment_2 ) ) ;
    public final void rule__Locale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4102:1: ( ( ( rule__Locale__TypeAssignment_2 ) ) )
            // InternalBurst.g:4103:1: ( ( rule__Locale__TypeAssignment_2 ) )
            {
            // InternalBurst.g:4103:1: ( ( rule__Locale__TypeAssignment_2 ) )
            // InternalBurst.g:4104:2: ( rule__Locale__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 
            }
            // InternalBurst.g:4105:2: ( rule__Locale__TypeAssignment_2 )
            // InternalBurst.g:4105:3: rule__Locale__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Locale__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__Locale__Group__2__Impl"


    // $ANTLR start "rule__Locale__Group__3"
    // InternalBurst.g:4113:1: rule__Locale__Group__3 : rule__Locale__Group__3__Impl rule__Locale__Group__4 ;
    public final void rule__Locale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4117:1: ( rule__Locale__Group__3__Impl rule__Locale__Group__4 )
            // InternalBurst.g:4118:2: rule__Locale__Group__3__Impl rule__Locale__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Locale__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Locale__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4125:1: rule__Locale__Group__3__Impl : ( ( rule__Locale__NameAssignment_3 ) ) ;
    public final void rule__Locale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4129:1: ( ( ( rule__Locale__NameAssignment_3 ) ) )
            // InternalBurst.g:4130:1: ( ( rule__Locale__NameAssignment_3 ) )
            {
            // InternalBurst.g:4130:1: ( ( rule__Locale__NameAssignment_3 ) )
            // InternalBurst.g:4131:2: ( rule__Locale__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getNameAssignment_3()); 
            }
            // InternalBurst.g:4132:2: ( rule__Locale__NameAssignment_3 )
            // InternalBurst.g:4132:3: rule__Locale__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Locale__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__Locale__Group__3__Impl"


    // $ANTLR start "rule__Locale__Group__4"
    // InternalBurst.g:4140:1: rule__Locale__Group__4 : rule__Locale__Group__4__Impl ;
    public final void rule__Locale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4144:1: ( rule__Locale__Group__4__Impl )
            // InternalBurst.g:4145:2: rule__Locale__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4151:1: rule__Locale__Group__4__Impl : ( ( rule__Locale__Group_4__0 )* ) ;
    public final void rule__Locale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4155:1: ( ( ( rule__Locale__Group_4__0 )* ) )
            // InternalBurst.g:4156:1: ( ( rule__Locale__Group_4__0 )* )
            {
            // InternalBurst.g:4156:1: ( ( rule__Locale__Group_4__0 )* )
            // InternalBurst.g:4157:2: ( rule__Locale__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getGroup_4()); 
            }
            // InternalBurst.g:4158:2: ( rule__Locale__Group_4__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBurst.g:4158:3: rule__Locale__Group_4__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Locale__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Locale__Group__4__Impl"


    // $ANTLR start "rule__Locale__Group_4__0"
    // InternalBurst.g:4167:1: rule__Locale__Group_4__0 : rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 ;
    public final void rule__Locale__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4171:1: ( rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 )
            // InternalBurst.g:4172:2: rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Locale__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Locale__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4179:1: rule__Locale__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Locale__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4183:1: ( ( ':' ) )
            // InternalBurst.g:4184:1: ( ':' )
            {
            // InternalBurst.g:4184:1: ( ':' )
            // InternalBurst.g:4185:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getColonKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getColonKeyword_4_0()); 
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
    // $ANTLR end "rule__Locale__Group_4__0__Impl"


    // $ANTLR start "rule__Locale__Group_4__1"
    // InternalBurst.g:4194:1: rule__Locale__Group_4__1 : rule__Locale__Group_4__1__Impl ;
    public final void rule__Locale__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4198:1: ( rule__Locale__Group_4__1__Impl )
            // InternalBurst.g:4199:2: rule__Locale__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4205:1: rule__Locale__Group_4__1__Impl : ( ( rule__Locale__RolesAssignment_4_1 ) ) ;
    public final void rule__Locale__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4209:1: ( ( ( rule__Locale__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:4210:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:4210:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            // InternalBurst.g:4211:2: ( rule__Locale__RolesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getRolesAssignment_4_1()); 
            }
            // InternalBurst.g:4212:2: ( rule__Locale__RolesAssignment_4_1 )
            // InternalBurst.g:4212:3: rule__Locale__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Locale__RolesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getRolesAssignment_4_1()); 
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
    // $ANTLR end "rule__Locale__Group_4__1__Impl"


    // $ANTLR start "rule__Access__Group__0"
    // InternalBurst.g:4221:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4225:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalBurst.g:4226:2: rule__Access__Group__0__Impl rule__Access__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4233:1: rule__Access__Group__0__Impl : ( () ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4237:1: ( ( () ) )
            // InternalBurst.g:4238:1: ( () )
            {
            // InternalBurst.g:4238:1: ( () )
            // InternalBurst.g:4239:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getAccessAction_0()); 
            }
            // InternalBurst.g:4240:2: ()
            // InternalBurst.g:4240:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getAccessAction_0()); 
            }

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
    // InternalBurst.g:4248:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4252:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalBurst.g:4253:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Access__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4260:1: rule__Access__Group__1__Impl : ( ( rule__Access__NameAssignment_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4264:1: ( ( ( rule__Access__NameAssignment_1 ) ) )
            // InternalBurst.g:4265:1: ( ( rule__Access__NameAssignment_1 ) )
            {
            // InternalBurst.g:4265:1: ( ( rule__Access__NameAssignment_1 ) )
            // InternalBurst.g:4266:2: ( rule__Access__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getNameAssignment_1()); 
            }
            // InternalBurst.g:4267:2: ( rule__Access__NameAssignment_1 )
            // InternalBurst.g:4267:3: rule__Access__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Access__Group__1__Impl"


    // $ANTLR start "rule__Access__Group__2"
    // InternalBurst.g:4275:1: rule__Access__Group__2 : rule__Access__Group__2__Impl ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4279:1: ( rule__Access__Group__2__Impl )
            // InternalBurst.g:4280:2: rule__Access__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4286:1: rule__Access__Group__2__Impl : ( ( rule__Access__Group_2__0 )* ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4290:1: ( ( ( rule__Access__Group_2__0 )* ) )
            // InternalBurst.g:4291:1: ( ( rule__Access__Group_2__0 )* )
            {
            // InternalBurst.g:4291:1: ( ( rule__Access__Group_2__0 )* )
            // InternalBurst.g:4292:2: ( rule__Access__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup_2()); 
            }
            // InternalBurst.g:4293:2: ( rule__Access__Group_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==35) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBurst.g:4293:3: rule__Access__Group_2__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Access__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Access__Group__2__Impl"


    // $ANTLR start "rule__Access__Group_2__0"
    // InternalBurst.g:4302:1: rule__Access__Group_2__0 : rule__Access__Group_2__0__Impl rule__Access__Group_2__1 ;
    public final void rule__Access__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4306:1: ( rule__Access__Group_2__0__Impl rule__Access__Group_2__1 )
            // InternalBurst.g:4307:2: rule__Access__Group_2__0__Impl rule__Access__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__Access__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4314:1: rule__Access__Group_2__0__Impl : ( () ) ;
    public final void rule__Access__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4318:1: ( ( () ) )
            // InternalBurst.g:4319:1: ( () )
            {
            // InternalBurst.g:4319:1: ( () )
            // InternalBurst.g:4320:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getAccessBaseAction_2_0()); 
            }
            // InternalBurst.g:4321:2: ()
            // InternalBurst.g:4321:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getAccessBaseAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__0__Impl"


    // $ANTLR start "rule__Access__Group_2__1"
    // InternalBurst.g:4329:1: rule__Access__Group_2__1 : rule__Access__Group_2__1__Impl rule__Access__Group_2__2 ;
    public final void rule__Access__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4333:1: ( rule__Access__Group_2__1__Impl rule__Access__Group_2__2 )
            // InternalBurst.g:4334:2: rule__Access__Group_2__1__Impl rule__Access__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4341:1: rule__Access__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Access__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4345:1: ( ( '.' ) )
            // InternalBurst.g:4346:1: ( '.' )
            {
            // InternalBurst.g:4346:1: ( '.' )
            // InternalBurst.g:4347:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getFullStopKeyword_2_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getFullStopKeyword_2_1()); 
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
    // $ANTLR end "rule__Access__Group_2__1__Impl"


    // $ANTLR start "rule__Access__Group_2__2"
    // InternalBurst.g:4356:1: rule__Access__Group_2__2 : rule__Access__Group_2__2__Impl rule__Access__Group_2__3 ;
    public final void rule__Access__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4360:1: ( rule__Access__Group_2__2__Impl rule__Access__Group_2__3 )
            // InternalBurst.g:4361:2: rule__Access__Group_2__2__Impl rule__Access__Group_2__3
            {
            pushFollow(FOLLOW_40);
            rule__Access__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__2"


    // $ANTLR start "rule__Access__Group_2__2__Impl"
    // InternalBurst.g:4368:1: rule__Access__Group_2__2__Impl : ( ( rule__Access__MemberAssignment_2_2 ) ) ;
    public final void rule__Access__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4372:1: ( ( ( rule__Access__MemberAssignment_2_2 ) ) )
            // InternalBurst.g:4373:1: ( ( rule__Access__MemberAssignment_2_2 ) )
            {
            // InternalBurst.g:4373:1: ( ( rule__Access__MemberAssignment_2_2 ) )
            // InternalBurst.g:4374:2: ( rule__Access__MemberAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMemberAssignment_2_2()); 
            }
            // InternalBurst.g:4375:2: ( rule__Access__MemberAssignment_2_2 )
            // InternalBurst.g:4375:3: rule__Access__MemberAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Access__MemberAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMemberAssignment_2_2()); 
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
    // $ANTLR end "rule__Access__Group_2__2__Impl"


    // $ANTLR start "rule__Access__Group_2__3"
    // InternalBurst.g:4383:1: rule__Access__Group_2__3 : rule__Access__Group_2__3__Impl ;
    public final void rule__Access__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4387:1: ( rule__Access__Group_2__3__Impl )
            // InternalBurst.g:4388:2: rule__Access__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2__3"


    // $ANTLR start "rule__Access__Group_2__3__Impl"
    // InternalBurst.g:4394:1: rule__Access__Group_2__3__Impl : ( ( rule__Access__Group_2_3__0 )* ) ;
    public final void rule__Access__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4398:1: ( ( ( rule__Access__Group_2_3__0 )* ) )
            // InternalBurst.g:4399:1: ( ( rule__Access__Group_2_3__0 )* )
            {
            // InternalBurst.g:4399:1: ( ( rule__Access__Group_2_3__0 )* )
            // InternalBurst.g:4400:2: ( rule__Access__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup_2_3()); 
            }
            // InternalBurst.g:4401:2: ( rule__Access__Group_2_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalBurst.g:4401:3: rule__Access__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Access__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getGroup_2_3()); 
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
    // $ANTLR end "rule__Access__Group_2__3__Impl"


    // $ANTLR start "rule__Access__Group_2_3__0"
    // InternalBurst.g:4410:1: rule__Access__Group_2_3__0 : rule__Access__Group_2_3__0__Impl rule__Access__Group_2_3__1 ;
    public final void rule__Access__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4414:1: ( rule__Access__Group_2_3__0__Impl rule__Access__Group_2_3__1 )
            // InternalBurst.g:4415:2: rule__Access__Group_2_3__0__Impl rule__Access__Group_2_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2_3__0"


    // $ANTLR start "rule__Access__Group_2_3__0__Impl"
    // InternalBurst.g:4422:1: rule__Access__Group_2_3__0__Impl : ( ':' ) ;
    public final void rule__Access__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4426:1: ( ( ':' ) )
            // InternalBurst.g:4427:1: ( ':' )
            {
            // InternalBurst.g:4427:1: ( ':' )
            // InternalBurst.g:4428:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getColonKeyword_2_3_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getColonKeyword_2_3_0()); 
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
    // $ANTLR end "rule__Access__Group_2_3__0__Impl"


    // $ANTLR start "rule__Access__Group_2_3__1"
    // InternalBurst.g:4437:1: rule__Access__Group_2_3__1 : rule__Access__Group_2_3__1__Impl ;
    public final void rule__Access__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4441:1: ( rule__Access__Group_2_3__1__Impl )
            // InternalBurst.g:4442:2: rule__Access__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Access__Group_2_3__1"


    // $ANTLR start "rule__Access__Group_2_3__1__Impl"
    // InternalBurst.g:4448:1: rule__Access__Group_2_3__1__Impl : ( ( rule__Access__RolesAssignment_2_3_1 ) ) ;
    public final void rule__Access__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4452:1: ( ( ( rule__Access__RolesAssignment_2_3_1 ) ) )
            // InternalBurst.g:4453:1: ( ( rule__Access__RolesAssignment_2_3_1 ) )
            {
            // InternalBurst.g:4453:1: ( ( rule__Access__RolesAssignment_2_3_1 ) )
            // InternalBurst.g:4454:2: ( rule__Access__RolesAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesAssignment_2_3_1()); 
            }
            // InternalBurst.g:4455:2: ( rule__Access__RolesAssignment_2_3_1 )
            // InternalBurst.g:4455:3: rule__Access__RolesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__RolesAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesAssignment_2_3_1()); 
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
    // $ANTLR end "rule__Access__Group_2_3__1__Impl"


    // $ANTLR start "rule__SubCall__Group__0"
    // InternalBurst.g:4464:1: rule__SubCall__Group__0 : rule__SubCall__Group__0__Impl rule__SubCall__Group__1 ;
    public final void rule__SubCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4468:1: ( rule__SubCall__Group__0__Impl rule__SubCall__Group__1 )
            // InternalBurst.g:4469:2: rule__SubCall__Group__0__Impl rule__SubCall__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SubCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4476:1: rule__SubCall__Group__0__Impl : ( () ) ;
    public final void rule__SubCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4480:1: ( ( () ) )
            // InternalBurst.g:4481:1: ( () )
            {
            // InternalBurst.g:4481:1: ( () )
            // InternalBurst.g:4482:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getCallAction_0()); 
            }
            // InternalBurst.g:4483:2: ()
            // InternalBurst.g:4483:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getCallAction_0()); 
            }

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
    // InternalBurst.g:4491:1: rule__SubCall__Group__1 : rule__SubCall__Group__1__Impl rule__SubCall__Group__2 ;
    public final void rule__SubCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4495:1: ( rule__SubCall__Group__1__Impl rule__SubCall__Group__2 )
            // InternalBurst.g:4496:2: rule__SubCall__Group__1__Impl rule__SubCall__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SubCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4503:1: rule__SubCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SubCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4507:1: ( ( '(' ) )
            // InternalBurst.g:4508:1: ( '(' )
            {
            // InternalBurst.g:4508:1: ( '(' )
            // InternalBurst.g:4509:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__SubCall__Group__1__Impl"


    // $ANTLR start "rule__SubCall__Group__2"
    // InternalBurst.g:4518:1: rule__SubCall__Group__2 : rule__SubCall__Group__2__Impl rule__SubCall__Group__3 ;
    public final void rule__SubCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4522:1: ( rule__SubCall__Group__2__Impl rule__SubCall__Group__3 )
            // InternalBurst.g:4523:2: rule__SubCall__Group__2__Impl rule__SubCall__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__SubCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4530:1: rule__SubCall__Group__2__Impl : ( ( rule__SubCall__ContentAssignment_2 ) ) ;
    public final void rule__SubCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4534:1: ( ( ( rule__SubCall__ContentAssignment_2 ) ) )
            // InternalBurst.g:4535:1: ( ( rule__SubCall__ContentAssignment_2 ) )
            {
            // InternalBurst.g:4535:1: ( ( rule__SubCall__ContentAssignment_2 ) )
            // InternalBurst.g:4536:2: ( rule__SubCall__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getContentAssignment_2()); 
            }
            // InternalBurst.g:4537:2: ( rule__SubCall__ContentAssignment_2 )
            // InternalBurst.g:4537:3: rule__SubCall__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__ContentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getContentAssignment_2()); 
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
    // $ANTLR end "rule__SubCall__Group__2__Impl"


    // $ANTLR start "rule__SubCall__Group__3"
    // InternalBurst.g:4545:1: rule__SubCall__Group__3 : rule__SubCall__Group__3__Impl rule__SubCall__Group__4 ;
    public final void rule__SubCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4549:1: ( rule__SubCall__Group__3__Impl rule__SubCall__Group__4 )
            // InternalBurst.g:4550:2: rule__SubCall__Group__3__Impl rule__SubCall__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__SubCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4557:1: rule__SubCall__Group__3__Impl : ( ')' ) ;
    public final void rule__SubCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4561:1: ( ( ')' ) )
            // InternalBurst.g:4562:1: ( ')' )
            {
            // InternalBurst.g:4562:1: ( ')' )
            // InternalBurst.g:4563:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__SubCall__Group__3__Impl"


    // $ANTLR start "rule__SubCall__Group__4"
    // InternalBurst.g:4572:1: rule__SubCall__Group__4 : rule__SubCall__Group__4__Impl ;
    public final void rule__SubCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4576:1: ( rule__SubCall__Group__4__Impl )
            // InternalBurst.g:4577:2: rule__SubCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4583:1: rule__SubCall__Group__4__Impl : ( ( rule__SubCall__Group_4__0 )* ) ;
    public final void rule__SubCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4587:1: ( ( ( rule__SubCall__Group_4__0 )* ) )
            // InternalBurst.g:4588:1: ( ( rule__SubCall__Group_4__0 )* )
            {
            // InternalBurst.g:4588:1: ( ( rule__SubCall__Group_4__0 )* )
            // InternalBurst.g:4589:2: ( rule__SubCall__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getGroup_4()); 
            }
            // InternalBurst.g:4590:2: ( rule__SubCall__Group_4__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==34) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBurst.g:4590:3: rule__SubCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__SubCall__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getGroup_4()); 
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
    // $ANTLR end "rule__SubCall__Group__4__Impl"


    // $ANTLR start "rule__SubCall__Group_4__0"
    // InternalBurst.g:4599:1: rule__SubCall__Group_4__0 : rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 ;
    public final void rule__SubCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4603:1: ( rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 )
            // InternalBurst.g:4604:2: rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__SubCall__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubCall__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4611:1: rule__SubCall__Group_4__0__Impl : ( ':' ) ;
    public final void rule__SubCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4615:1: ( ( ':' ) )
            // InternalBurst.g:4616:1: ( ':' )
            {
            // InternalBurst.g:4616:1: ( ':' )
            // InternalBurst.g:4617:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getColonKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getColonKeyword_4_0()); 
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
    // $ANTLR end "rule__SubCall__Group_4__0__Impl"


    // $ANTLR start "rule__SubCall__Group_4__1"
    // InternalBurst.g:4626:1: rule__SubCall__Group_4__1 : rule__SubCall__Group_4__1__Impl ;
    public final void rule__SubCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4630:1: ( rule__SubCall__Group_4__1__Impl )
            // InternalBurst.g:4631:2: rule__SubCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:4637:1: rule__SubCall__Group_4__1__Impl : ( ( rule__SubCall__RolesAssignment_4_1 ) ) ;
    public final void rule__SubCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4641:1: ( ( ( rule__SubCall__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:4642:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:4642:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            // InternalBurst.g:4643:2: ( rule__SubCall__RolesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRolesAssignment_4_1()); 
            }
            // InternalBurst.g:4644:2: ( rule__SubCall__RolesAssignment_4_1 )
            // InternalBurst.g:4644:3: rule__SubCall__RolesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SubCall__RolesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getRolesAssignment_4_1()); 
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
    // $ANTLR end "rule__SubCall__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalBurst.g:4653:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4657:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalBurst.g:4658:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalBurst.g:4665:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4669:1: ( ( () ) )
            // InternalBurst.g:4670:1: ( () )
            {
            // InternalBurst.g:4670:1: ( () )
            // InternalBurst.g:4671:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_0_0()); 
            }
            // InternalBurst.g:4672:2: ()
            // InternalBurst.g:4672:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalBurst.g:4680:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4684:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalBurst.g:4685:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalBurst.g:4691:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4695:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalBurst.g:4696:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalBurst.g:4696:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalBurst.g:4697:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalBurst.g:4698:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalBurst.g:4698:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalBurst.g:4707:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4711:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalBurst.g:4712:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalBurst.g:4719:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4723:1: ( ( () ) )
            // InternalBurst.g:4724:1: ( () )
            {
            // InternalBurst.g:4724:1: ( () )
            // InternalBurst.g:4725:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0()); 
            }
            // InternalBurst.g:4726:2: ()
            // InternalBurst.g:4726:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalBurst.g:4734:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4738:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalBurst.g:4739:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalBurst.g:4745:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4749:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalBurst.g:4750:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalBurst.g:4750:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalBurst.g:4751:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalBurst.g:4752:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalBurst.g:4752:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalBurst.g:4761:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4765:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalBurst.g:4766:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalBurst.g:4773:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4777:1: ( ( () ) )
            // InternalBurst.g:4778:1: ( () )
            {
            // InternalBurst.g:4778:1: ( () )
            // InternalBurst.g:4779:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }
            // InternalBurst.g:4780:2: ()
            // InternalBurst.g:4780:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalBurst.g:4788:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4792:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalBurst.g:4793:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalBurst.g:4799:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4803:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalBurst.g:4804:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalBurst.g:4804:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalBurst.g:4805:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalBurst.g:4806:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalBurst.g:4806:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalBurst.g:4815:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4819:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalBurst.g:4820:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalBurst.g:4827:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4831:1: ( ( () ) )
            // InternalBurst.g:4832:1: ( () )
            {
            // InternalBurst.g:4832:1: ( () )
            // InternalBurst.g:4833:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getDoubleConstantAction_3_0()); 
            }
            // InternalBurst.g:4834:2: ()
            // InternalBurst.g:4834:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getDoubleConstantAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalBurst.g:4842:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4846:1: ( rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 )
            // InternalBurst.g:4847:2: rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_42);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalBurst.g:4854:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4858:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalBurst.g:4859:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalBurst.g:4859:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalBurst.g:4860:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalBurst.g:4861:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalBurst.g:4861:3: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__2"
    // InternalBurst.g:4869:1: rule__TerminalExpression__Group_3__2 : rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3 ;
    public final void rule__TerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4873:1: ( rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3 )
            // InternalBurst.g:4874:2: rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3
            {
            pushFollow(FOLLOW_44);
            rule__TerminalExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__2"


    // $ANTLR start "rule__TerminalExpression__Group_3__2__Impl"
    // InternalBurst.g:4881:1: rule__TerminalExpression__Group_3__2__Impl : ( '.' ) ;
    public final void rule__TerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4885:1: ( ( '.' ) )
            // InternalBurst.g:4886:1: ( '.' )
            {
            // InternalBurst.g:4886:1: ( '.' )
            // InternalBurst.g:4887:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getFullStopKeyword_3_2()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getFullStopKeyword_3_2()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_3__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__3"
    // InternalBurst.g:4896:1: rule__TerminalExpression__Group_3__3 : rule__TerminalExpression__Group_3__3__Impl ;
    public final void rule__TerminalExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4900:1: ( rule__TerminalExpression__Group_3__3__Impl )
            // InternalBurst.g:4901:2: rule__TerminalExpression__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__3"


    // $ANTLR start "rule__TerminalExpression__Group_3__3__Impl"
    // InternalBurst.g:4907:1: rule__TerminalExpression__Group_3__3__Impl : ( RULE_INT ) ;
    public final void rule__TerminalExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4911:1: ( ( RULE_INT ) )
            // InternalBurst.g:4912:1: ( RULE_INT )
            {
            // InternalBurst.g:4912:1: ( RULE_INT )
            // InternalBurst.g:4913:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_3_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_3_3()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_3__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalBurst.g:4923:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4927:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalBurst.g:4928:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_47);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalBurst.g:4935:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4939:1: ( ( () ) )
            // InternalBurst.g:4940:1: ( () )
            {
            // InternalBurst.g:4940:1: ( () )
            // InternalBurst.g:4941:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisConstantAction_4_0()); 
            }
            // InternalBurst.g:4942:2: ()
            // InternalBurst.g:4942:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getThisConstantAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalBurst.g:4950:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4954:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalBurst.g:4955:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalBurst.g:4961:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4965:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // InternalBurst.g:4966:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // InternalBurst.g:4966:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // InternalBurst.g:4967:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            }
            // InternalBurst.g:4968:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // InternalBurst.g:4968:3: rule__TerminalExpression__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalBurst.g:4977:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4981:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalBurst.g:4982:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalBurst.g:4989:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4993:1: ( ( () ) )
            // InternalBurst.g:4994:1: ( () )
            {
            // InternalBurst.g:4994:1: ( () )
            // InternalBurst.g:4995:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullConstantAction_5_0()); 
            }
            // InternalBurst.g:4996:2: ()
            // InternalBurst.g:4996:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getNullConstantAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalBurst.g:5004:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5008:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalBurst.g:5009:2: rule__TerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalBurst.g:5015:1: rule__TerminalExpression__Group_5__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5019:1: ( ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) )
            // InternalBurst.g:5020:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            {
            // InternalBurst.g:5020:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            // InternalBurst.g:5021:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1()); 
            }
            // InternalBurst.g:5022:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            // InternalBurst.g:5022:3: rule__TerminalExpression__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1()); 
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
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBurst.g:5031:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5035:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:5036:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:5043:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5047:1: ( ( RULE_ID ) )
            // InternalBurst.g:5048:1: ( RULE_ID )
            {
            // InternalBurst.g:5048:1: ( RULE_ID )
            // InternalBurst.g:5049:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBurst.g:5058:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5062:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:5063:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:5069:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5073:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:5074:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:5074:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:5075:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalBurst.g:5076:2: ( rule__QualifiedName__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==35) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalBurst.g:5076:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBurst.g:5085:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5089:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:5090:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:5097:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5101:1: ( ( '.' ) )
            // InternalBurst.g:5102:1: ( '.' )
            {
            // InternalBurst.g:5102:1: ( '.' )
            // InternalBurst.g:5103:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBurst.g:5112:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5116:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:5117:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalBurst.g:5123:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5127:1: ( ( RULE_ID ) )
            // InternalBurst.g:5128:1: ( RULE_ID )
            {
            // InternalBurst.g:5128:1: ( RULE_ID )
            // InternalBurst.g:5129:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__File__ImportsAssignment_2_0"
    // InternalBurst.g:5139:1: rule__File__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__File__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5143:1: ( ( ruleImport ) )
            // InternalBurst.g:5144:2: ( ruleImport )
            {
            // InternalBurst.g:5144:2: ( ruleImport )
            // InternalBurst.g:5145:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__File__ImportsAssignment_2_0"


    // $ANTLR start "rule__File__ElementsAssignment_3_0"
    // InternalBurst.g:5154:1: rule__File__ElementsAssignment_3_0 : ( ruleFileElement ) ;
    public final void rule__File__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5158:1: ( ( ruleFileElement ) )
            // InternalBurst.g:5159:2: ( ruleFileElement )
            {
            // InternalBurst.g:5159:2: ( ruleFileElement )
            // InternalBurst.g:5160:3: ruleFileElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFileElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__File__ElementsAssignment_3_0"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // InternalBurst.g:5169:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5173:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5174:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:5174:2: ( ruleQualifiedName )
            // InternalBurst.g:5175:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__Roles__NameAssignment_2"
    // InternalBurst.g:5184:1: rule__Roles__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Roles__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5188:1: ( ( RULE_ID ) )
            // InternalBurst.g:5189:2: ( RULE_ID )
            {
            // InternalBurst.g:5189:2: ( RULE_ID )
            // InternalBurst.g:5190:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Roles__NameAssignment_2"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalBurst.g:5199:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5203:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5204:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:5204:2: ( ruleQualifiedName )
            // InternalBurst.g:5205:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementsAssignment_6_0"
    // InternalBurst.g:5214:1: rule__Package__ElementsAssignment_6_0 : ( rulePackageElement ) ;
    public final void rule__Package__ElementsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5218:1: ( ( rulePackageElement ) )
            // InternalBurst.g:5219:2: ( rulePackageElement )
            {
            // InternalBurst.g:5219:2: ( rulePackageElement )
            // InternalBurst.g:5220:3: rulePackageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__Package__ElementsAssignment_6_0"


    // $ANTLR start "rule__Concern__NameAssignment_2"
    // InternalBurst.g:5229:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5233:1: ( ( RULE_ID ) )
            // InternalBurst.g:5234:2: ( RULE_ID )
            {
            // InternalBurst.g:5234:2: ( RULE_ID )
            // InternalBurst.g:5235:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Concern__NameAssignment_2"


    // $ANTLR start "rule__Concern__ElementsAssignment_3_3_0"
    // InternalBurst.g:5244:1: rule__Concern__ElementsAssignment_3_3_0 : ( ruleConcernElement ) ;
    public final void rule__Concern__ElementsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5248:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:5249:2: ( ruleConcernElement )
            {
            // InternalBurst.g:5249:2: ( ruleConcernElement )
            // InternalBurst.g:5250:3: ruleConcernElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0()); 
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
    // $ANTLR end "rule__Concern__ElementsAssignment_3_3_0"


    // $ANTLR start "rule__Template__NameAssignment_2"
    // InternalBurst.g:5259:1: rule__Template__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5263:1: ( ( RULE_ID ) )
            // InternalBurst.g:5264:2: ( RULE_ID )
            {
            // InternalBurst.g:5264:2: ( RULE_ID )
            // InternalBurst.g:5265:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Template__NameAssignment_2"


    // $ANTLR start "rule__Template__TemplateArgumentsAssignment_4"
    // InternalBurst.g:5274:1: rule__Template__TemplateArgumentsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5278:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5279:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5279:2: ( ( RULE_ID ) )
            // InternalBurst.g:5280:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 
            }
            // InternalBurst.g:5281:3: ( RULE_ID )
            // InternalBurst.g:5282:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 
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
    // $ANTLR end "rule__Template__TemplateArgumentsAssignment_4"


    // $ANTLR start "rule__Template__TemplateArgumentsAssignment_5_1"
    // InternalBurst.g:5293:1: rule__Template__TemplateArgumentsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5297:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5298:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5298:2: ( ( RULE_ID ) )
            // InternalBurst.g:5299:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 
            }
            // InternalBurst.g:5300:3: ( RULE_ID )
            // InternalBurst.g:5301:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__Template__TemplateArgumentsAssignment_5_1"


    // $ANTLR start "rule__Template__ElementsAssignment_7_3_0"
    // InternalBurst.g:5312:1: rule__Template__ElementsAssignment_7_3_0 : ( ruleConcernElement ) ;
    public final void rule__Template__ElementsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5316:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:5317:2: ( ruleConcernElement )
            {
            // InternalBurst.g:5317:2: ( ruleConcernElement )
            // InternalBurst.g:5318:3: ruleConcernElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConcernElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0()); 
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
    // $ANTLR end "rule__Template__ElementsAssignment_7_3_0"


    // $ANTLR start "rule__Member__ActAsAssignment_1"
    // InternalBurst.g:5327:1: rule__Member__ActAsAssignment_1 : ( ( 'as' ) ) ;
    public final void rule__Member__ActAsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5331:1: ( ( ( 'as' ) ) )
            // InternalBurst.g:5332:2: ( ( 'as' ) )
            {
            // InternalBurst.g:5332:2: ( ( 'as' ) )
            // InternalBurst.g:5333:3: ( 'as' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            }
            // InternalBurst.g:5334:3: ( 'as' )
            // InternalBurst.g:5335:4: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
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
    // $ANTLR end "rule__Member__ActAsAssignment_1"


    // $ANTLR start "rule__Member__IsContentAssignment_2"
    // InternalBurst.g:5346:1: rule__Member__IsContentAssignment_2 : ( ( 'is' ) ) ;
    public final void rule__Member__IsContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5350:1: ( ( ( 'is' ) ) )
            // InternalBurst.g:5351:2: ( ( 'is' ) )
            {
            // InternalBurst.g:5351:2: ( ( 'is' ) )
            // InternalBurst.g:5352:3: ( 'is' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            }
            // InternalBurst.g:5353:3: ( 'is' )
            // InternalBurst.g:5354:4: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
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
    // $ANTLR end "rule__Member__IsContentAssignment_2"


    // $ANTLR start "rule__Member__ConcernAssignment_3"
    // InternalBurst.g:5365:1: rule__Member__ConcernAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5369:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5370:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5370:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5371:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0()); 
            }
            // InternalBurst.g:5372:3: ( ruleQualifiedName )
            // InternalBurst.g:5373:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getConcernConcernQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0()); 
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
    // $ANTLR end "rule__Member__ConcernAssignment_3"


    // $ANTLR start "rule__Member__NameAssignment_4"
    // InternalBurst.g:5384:1: rule__Member__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5388:1: ( ( RULE_ID ) )
            // InternalBurst.g:5389:2: ( RULE_ID )
            {
            // InternalBurst.g:5389:2: ( RULE_ID )
            // InternalBurst.g:5390:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Member__NameAssignment_4"


    // $ANTLR start "rule__RuleIntersect__NameAssignment_1"
    // InternalBurst.g:5399:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5403:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:5404:2: ( ( 'when' ) )
            {
            // InternalBurst.g:5404:2: ( ( 'when' ) )
            // InternalBurst.g:5405:3: ( 'when' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            }
            // InternalBurst.g:5406:3: ( 'when' )
            // InternalBurst.g:5407:4: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
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
    // $ANTLR end "rule__RuleIntersect__NameAssignment_1"


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_3"
    // InternalBurst.g:5418:1: rule__RuleIntersect__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5422:1: ( ( ruleParameter ) )
            // InternalBurst.g:5423:2: ( ruleParameter )
            {
            // InternalBurst.g:5423:2: ( ruleParameter )
            // InternalBurst.g:5424:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_3"


    // $ANTLR start "rule__RuleIntersect__ParamsAssignment_4_3"
    // InternalBurst.g:5433:1: rule__RuleIntersect__ParamsAssignment_4_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5437:1: ( ( ruleParameter ) )
            // InternalBurst.g:5438:2: ( ruleParameter )
            {
            // InternalBurst.g:5438:2: ( ruleParameter )
            // InternalBurst.g:5439:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0()); 
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
    // $ANTLR end "rule__RuleIntersect__ParamsAssignment_4_3"


    // $ANTLR start "rule__RuleIntersect__BlockAssignment_5"
    // InternalBurst.g:5448:1: rule__RuleIntersect__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__RuleIntersect__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5452:1: ( ( ruleBlock ) )
            // InternalBurst.g:5453:2: ( ruleBlock )
            {
            // InternalBurst.g:5453:2: ( ruleBlock )
            // InternalBurst.g:5454:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getBlockBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getBlockBlockParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__RuleIntersect__BlockAssignment_5"


    // $ANTLR start "rule__Block__LinesAssignment_3_0"
    // InternalBurst.g:5463:1: rule__Block__LinesAssignment_3_0 : ( ruleLine ) ;
    public final void rule__Block__LinesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5467:1: ( ( ruleLine ) )
            // InternalBurst.g:5468:2: ( ruleLine )
            {
            // InternalBurst.g:5468:2: ( ruleLine )
            // InternalBurst.g:5469:3: ruleLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Block__LinesAssignment_3_0"


    // $ANTLR start "rule__Block__LinesAssignment_3_1_1"
    // InternalBurst.g:5478:1: rule__Block__LinesAssignment_3_1_1 : ( ruleLine ) ;
    public final void rule__Block__LinesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5482:1: ( ( ruleLine ) )
            // InternalBurst.g:5483:2: ( ruleLine )
            {
            // InternalBurst.g:5483:2: ( ruleLine )
            // InternalBurst.g:5484:3: ruleLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__Block__LinesAssignment_3_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1_0"
    // InternalBurst.g:5493:1: rule__Parameter__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5497:1: ( ( RULE_ID ) )
            // InternalBurst.g:5498:2: ( RULE_ID )
            {
            // InternalBurst.g:5498:2: ( RULE_ID )
            // InternalBurst.g:5499:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_1_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_1_0"
    // InternalBurst.g:5508:1: rule__Parameter__TypeAssignment_1_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__TypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5512:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5513:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5513:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5514:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_1_0_0()); 
            }
            // InternalBurst.g:5515:3: ( ruleQualifiedName )
            // InternalBurst.g:5516:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_1_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_1_0_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_1_1_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1_1_2"
    // InternalBurst.g:5527:1: rule__Parameter__NameAssignment_1_1_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5531:1: ( ( RULE_ID ) )
            // InternalBurst.g:5532:2: ( RULE_ID )
            {
            // InternalBurst.g:5532:2: ( RULE_ID )
            // InternalBurst.g:5533:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_1_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_1_1_2"


    // $ANTLR start "rule__Parameter__RoleAssignment_1_2_0"
    // InternalBurst.g:5542:1: rule__Parameter__RoleAssignment_1_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__RoleAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5546:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5547:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5547:2: ( ( RULE_ID ) )
            // InternalBurst.g:5548:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleRoleCrossReference_1_2_0_0()); 
            }
            // InternalBurst.g:5549:3: ( RULE_ID )
            // InternalBurst.g:5550:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_1_2_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_1_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleRoleCrossReference_1_2_0_0()); 
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
    // $ANTLR end "rule__Parameter__RoleAssignment_1_2_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_2_2"
    // InternalBurst.g:5561:1: rule__Parameter__TypeAssignment_1_2_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__TypeAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5565:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5566:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5566:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5567:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_2_2_0()); 
            }
            // InternalBurst.g:5568:3: ( ruleQualifiedName )
            // InternalBurst.g:5569:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_2_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_2_2_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_1_2_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1_2_4"
    // InternalBurst.g:5580:1: rule__Parameter__NameAssignment_1_2_4 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5584:1: ( ( RULE_ID ) )
            // InternalBurst.g:5585:2: ( RULE_ID )
            {
            // InternalBurst.g:5585:2: ( RULE_ID )
            // InternalBurst.g:5586:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_2_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_2_4_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_1_2_4"


    // $ANTLR start "rule__Stop__ConditionAssignment_2"
    // InternalBurst.g:5595:1: rule__Stop__ConditionAssignment_2 : ( ruleCall ) ;
    public final void rule__Stop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5599:1: ( ( ruleCall ) )
            // InternalBurst.g:5600:2: ( ruleCall )
            {
            // InternalBurst.g:5600:2: ( ruleCall )
            // InternalBurst.g:5601:3: ruleCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getConditionCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStopAccess().getConditionCallParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Stop__ConditionAssignment_2"


    // $ANTLR start "rule__If__ExpressionAssignment_2"
    // InternalBurst.g:5610:1: rule__If__ExpressionAssignment_2 : ( ruleCall ) ;
    public final void rule__If__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5614:1: ( ( ruleCall ) )
            // InternalBurst.g:5615:2: ( ruleCall )
            {
            // InternalBurst.g:5615:2: ( ruleCall )
            // InternalBurst.g:5616:3: ruleCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExpressionCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getExpressionCallParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__If__ExpressionAssignment_2"


    // $ANTLR start "rule__If__ThenBlockAssignment_3_0"
    // InternalBurst.g:5625:1: rule__If__ThenBlockAssignment_3_0 : ( ruleBlock ) ;
    public final void rule__If__ThenBlockAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5629:1: ( ( ruleBlock ) )
            // InternalBurst.g:5630:2: ( ruleBlock )
            {
            // InternalBurst.g:5630:2: ( ruleBlock )
            // InternalBurst.g:5631:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenBlockBlockParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenBlockBlockParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__If__ThenBlockAssignment_3_0"


    // $ANTLR start "rule__If__ThenBlockAssignment_3_1_1"
    // InternalBurst.g:5640:1: rule__If__ThenBlockAssignment_3_1_1 : ( ruleLine ) ;
    public final void rule__If__ThenBlockAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5644:1: ( ( ruleLine ) )
            // InternalBurst.g:5645:2: ( ruleLine )
            {
            // InternalBurst.g:5645:2: ( ruleLine )
            // InternalBurst.g:5646:3: ruleLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenBlockLineParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getThenBlockLineParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__If__ThenBlockAssignment_3_1_1"


    // $ANTLR start "rule__If__ElseBlockAssignment_4_3"
    // InternalBurst.g:5655:1: rule__If__ElseBlockAssignment_4_3 : ( ruleLine ) ;
    public final void rule__If__ElseBlockAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5659:1: ( ( ruleLine ) )
            // InternalBurst.g:5660:2: ( ruleLine )
            {
            // InternalBurst.g:5660:2: ( ruleLine )
            // InternalBurst.g:5661:3: ruleLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseBlockLineParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getElseBlockLineParserRuleCall_4_3_0()); 
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
    // $ANTLR end "rule__If__ElseBlockAssignment_4_3"


    // $ANTLR start "rule__ContextManagement__ActionAssignment_1"
    // InternalBurst.g:5670:1: rule__ContextManagement__ActionAssignment_1 : ( ruleconcernManagment ) ;
    public final void rule__ContextManagement__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5674:1: ( ( ruleconcernManagment ) )
            // InternalBurst.g:5675:2: ( ruleconcernManagment )
            {
            // InternalBurst.g:5675:2: ( ruleconcernManagment )
            // InternalBurst.g:5676:3: ruleconcernManagment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleconcernManagment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__ContextManagement__ActionAssignment_1"


    // $ANTLR start "rule__ContextManagement__TargetAssignment_2"
    // InternalBurst.g:5685:1: rule__ContextManagement__TargetAssignment_2 : ( ruleAccess ) ;
    public final void rule__ContextManagement__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5689:1: ( ( ruleAccess ) )
            // InternalBurst.g:5690:2: ( ruleAccess )
            {
            // InternalBurst.g:5690:2: ( ruleAccess )
            // InternalBurst.g:5691:3: ruleAccess
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAccess();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ContextManagement__TargetAssignment_2"


    // $ANTLR start "rule__Call__ContentAssignment_1"
    // InternalBurst.g:5700:1: rule__Call__ContentAssignment_1 : ( ruleCallElement ) ;
    public final void rule__Call__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5704:1: ( ( ruleCallElement ) )
            // InternalBurst.g:5705:2: ( ruleCallElement )
            {
            // InternalBurst.g:5705:2: ( ruleCallElement )
            // InternalBurst.g:5706:3: ruleCallElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCallElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Call__ContentAssignment_1"


    // $ANTLR start "rule__Call__EqualityAssignment_2_0"
    // InternalBurst.g:5715:1: rule__Call__EqualityAssignment_2_0 : ( ( '=' ) ) ;
    public final void rule__Call__EqualityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5719:1: ( ( ( '=' ) ) )
            // InternalBurst.g:5720:2: ( ( '=' ) )
            {
            // InternalBurst.g:5720:2: ( ( '=' ) )
            // InternalBurst.g:5721:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0()); 
            }
            // InternalBurst.g:5722:3: ( '=' )
            // InternalBurst.g:5723:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Call__EqualityAssignment_2_0"


    // $ANTLR start "rule__Call__SourceAssignment_2_1"
    // InternalBurst.g:5734:1: rule__Call__SourceAssignment_2_1 : ( ruleCallElement ) ;
    public final void rule__Call__SourceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5738:1: ( ( ruleCallElement ) )
            // InternalBurst.g:5739:2: ( ruleCallElement )
            {
            // InternalBurst.g:5739:2: ( ruleCallElement )
            // InternalBurst.g:5740:3: ruleCallElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCallElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Call__SourceAssignment_2_1"


    // $ANTLR start "rule__Locale__TypeAssignment_2"
    // InternalBurst.g:5749:1: rule__Locale__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Locale__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5753:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5754:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5754:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5755:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 
            }
            // InternalBurst.g:5756:3: ( ruleQualifiedName )
            // InternalBurst.g:5757:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getTypeConcernQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getTypeConcernQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 
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
    // $ANTLR end "rule__Locale__TypeAssignment_2"


    // $ANTLR start "rule__Locale__NameAssignment_3"
    // InternalBurst.g:5768:1: rule__Locale__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Locale__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5772:1: ( ( RULE_ID ) )
            // InternalBurst.g:5773:2: ( RULE_ID )
            {
            // InternalBurst.g:5773:2: ( RULE_ID )
            // InternalBurst.g:5774:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Locale__NameAssignment_3"


    // $ANTLR start "rule__Locale__RolesAssignment_4_1"
    // InternalBurst.g:5783:1: rule__Locale__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Locale__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5787:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5788:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5788:2: ( ( RULE_ID ) )
            // InternalBurst.g:5789:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0()); 
            }
            // InternalBurst.g:5790:3: ( RULE_ID )
            // InternalBurst.g:5791:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__Locale__RolesAssignment_4_1"


    // $ANTLR start "rule__Access__NameAssignment_1"
    // InternalBurst.g:5802:1: rule__Access__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5806:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5807:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5807:2: ( ( RULE_ID ) )
            // InternalBurst.g:5808:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 
            }
            // InternalBurst.g:5809:3: ( RULE_ID )
            // InternalBurst.g:5810:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getNameVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 
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
    // $ANTLR end "rule__Access__NameAssignment_1"


    // $ANTLR start "rule__Access__MemberAssignment_2_2"
    // InternalBurst.g:5821:1: rule__Access__MemberAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Access__MemberAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5825:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5826:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5826:2: ( ( RULE_ID ) )
            // InternalBurst.g:5827:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMemberMemberCrossReference_2_2_0()); 
            }
            // InternalBurst.g:5828:3: ( RULE_ID )
            // InternalBurst.g:5829:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMemberMemberIDTerminalRuleCall_2_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMemberMemberIDTerminalRuleCall_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMemberMemberCrossReference_2_2_0()); 
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
    // $ANTLR end "rule__Access__MemberAssignment_2_2"


    // $ANTLR start "rule__Access__RolesAssignment_2_3_1"
    // InternalBurst.g:5840:1: rule__Access__RolesAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__RolesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5844:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5845:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5845:2: ( ( RULE_ID ) )
            // InternalBurst.g:5846:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesRoleCrossReference_2_3_1_0()); 
            }
            // InternalBurst.g:5847:3: ( RULE_ID )
            // InternalBurst.g:5848:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_2_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_2_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesRoleCrossReference_2_3_1_0()); 
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
    // $ANTLR end "rule__Access__RolesAssignment_2_3_1"


    // $ANTLR start "rule__SubCall__ContentAssignment_2"
    // InternalBurst.g:5859:1: rule__SubCall__ContentAssignment_2 : ( ruleCall ) ;
    public final void rule__SubCall__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5863:1: ( ( ruleCall ) )
            // InternalBurst.g:5864:2: ( ruleCall )
            {
            // InternalBurst.g:5864:2: ( ruleCall )
            // InternalBurst.g:5865:3: ruleCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getContentCallParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getContentCallParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SubCall__ContentAssignment_2"


    // $ANTLR start "rule__SubCall__RolesAssignment_4_1"
    // InternalBurst.g:5874:1: rule__SubCall__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubCall__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5878:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5879:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5879:2: ( ( RULE_ID ) )
            // InternalBurst.g:5880:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0()); 
            }
            // InternalBurst.g:5881:3: ( RULE_ID )
            // InternalBurst.g:5882:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getRolesRoleIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__SubCall__RolesAssignment_4_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalBurst.g:5893:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5897:1: ( ( RULE_INT ) )
            // InternalBurst.g:5898:2: ( RULE_INT )
            {
            // InternalBurst.g:5898:2: ( RULE_INT )
            // InternalBurst.g:5899:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalBurst.g:5908:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5912:1: ( ( RULE_STRING ) )
            // InternalBurst.g:5913:2: ( RULE_STRING )
            {
            // InternalBurst.g:5913:2: ( RULE_STRING )
            // InternalBurst.g:5914:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalBurst.g:5923:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5927:1: ( ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalBurst.g:5928:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalBurst.g:5928:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalBurst.g:5929:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // InternalBurst.g:5930:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            // InternalBurst.g:5930:4: rule__TerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_3_1"
    // InternalBurst.g:5938:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5942:1: ( ( RULE_INT ) )
            // InternalBurst.g:5943:2: ( RULE_INT )
            {
            // InternalBurst.g:5943:2: ( RULE_INT )
            // InternalBurst.g:5944:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_4_1"
    // InternalBurst.g:5953:1: rule__TerminalExpression__ValueAssignment_4_1 : ( ( 'this' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5957:1: ( ( ( 'this' ) ) )
            // InternalBurst.g:5958:2: ( ( 'this' ) )
            {
            // InternalBurst.g:5958:2: ( ( 'this' ) )
            // InternalBurst.g:5959:3: ( 'this' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0()); 
            }
            // InternalBurst.g:5960:3: ( 'this' )
            // InternalBurst.g:5961:4: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_4_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_5_1"
    // InternalBurst.g:5972:1: rule__TerminalExpression__ValueAssignment_5_1 : ( ( 'null' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5976:1: ( ( ( 'null' ) ) )
            // InternalBurst.g:5977:2: ( ( 'null' ) )
            {
            // InternalBurst.g:5977:2: ( ( 'null' ) )
            // InternalBurst.g:5978:3: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0()); 
            }
            // InternalBurst.g:5979:3: ( 'null' )
            // InternalBurst.g:5980:4: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0()); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_5_1"

    // $ANTLR start synpred47_InternalBurst
    public final void synpred47_InternalBurst_fragment() throws RecognitionException {   
        // InternalBurst.g:2700:3: ( RULE_ENDLINE )
        // InternalBurst.g:2700:3: RULE_ENDLINE
        {
        match(input,RULE_ENDLINE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalBurst

    // $ANTLR start synpred56_InternalBurst
    public final void synpred56_InternalBurst_fragment() throws RecognitionException {   
        // InternalBurst.g:3597:3: ( rule__If__Group_4__0 )
        // InternalBurst.g:3597:3: rule__If__Group_4__0
        {
        pushFollow(FOLLOW_2);
        rule__If__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalBurst

    // Delegated rules

    public final boolean synpred56_InternalBurst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalBurst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalBurst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalBurst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\3\2\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\46\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\20\uffff\1\2\3\3\15\uffff\1\3",
            "\1\1\20\uffff\1\2\3\3\15\uffff\1\3",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1713:2: ( rule__Concern__Group_3__0 )?";
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2125:2: ( rule__Template__Group_7__0 )?";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\2\2\1\uffff\1\2\1\uffff";
    static final String dfa_10s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_11s = "\1\26\1\51\1\uffff\1\51\1\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_13s = "\5\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\21\uffff\1\2",
            "\1\3\3\4\6\uffff\4\4\3\uffff\1\4\1\2\4\uffff\1\4\2\uffff\2\4\1\uffff\1\4\6\uffff\2\4",
            "",
            "\1\3\3\4\6\uffff\4\4\3\uffff\1\4\1\2\4\uffff\1\4\2\uffff\2\4\1\uffff\1\4\6\uffff\2\4",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2970:2: ( rule__Block__Group_3_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004001C00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004001800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007001C00050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007001800042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000203050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003052L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000302C863F0F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000302C823F0F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003020800C0E0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000003020800C0E2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000000L});

}