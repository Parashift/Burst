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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'and'", "'true'", "'false'", "'1'", "'0'", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "'>'", "'with'", "'stop'", "'if'", "'else'", "'new'", "':'", "'.'", "'('", "')'", "'as'", "'is'", "'when'", "'='", "'this'", "'null'"
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


    // $ANTLR start "entryRuleWithParameter"
    // InternalBurst.g:379:1: entryRuleWithParameter : ruleWithParameter EOF ;
    public final void entryRuleWithParameter() throws RecognitionException {
        try {
            // InternalBurst.g:380:1: ( ruleWithParameter EOF )
            // InternalBurst.g:381:1: ruleWithParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWithParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterRule()); 
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
    // $ANTLR end "entryRuleWithParameter"


    // $ANTLR start "ruleWithParameter"
    // InternalBurst.g:388:1: ruleWithParameter : ( ( rule__WithParameter__Group__0 ) ) ;
    public final void ruleWithParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:392:2: ( ( ( rule__WithParameter__Group__0 ) ) )
            // InternalBurst.g:393:2: ( ( rule__WithParameter__Group__0 ) )
            {
            // InternalBurst.g:393:2: ( ( rule__WithParameter__Group__0 ) )
            // InternalBurst.g:394:3: ( rule__WithParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getGroup()); 
            }
            // InternalBurst.g:395:3: ( rule__WithParameter__Group__0 )
            // InternalBurst.g:395:4: rule__WithParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleWithParameter"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:404:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:405:1: ( ruleLine EOF )
            // InternalBurst.g:406:1: ruleLine EOF
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
    // InternalBurst.g:413:1: ruleLine : ( ( rule__Line__Alternatives ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:417:2: ( ( ( rule__Line__Alternatives ) ) )
            // InternalBurst.g:418:2: ( ( rule__Line__Alternatives ) )
            {
            // InternalBurst.g:418:2: ( ( rule__Line__Alternatives ) )
            // InternalBurst.g:419:3: ( rule__Line__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineAccess().getAlternatives()); 
            }
            // InternalBurst.g:420:3: ( rule__Line__Alternatives )
            // InternalBurst.g:420:4: rule__Line__Alternatives
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
    // InternalBurst.g:429:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalBurst.g:430:1: ( ruleStop EOF )
            // InternalBurst.g:431:1: ruleStop EOF
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
    // InternalBurst.g:438:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:442:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalBurst.g:443:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalBurst.g:443:2: ( ( rule__Stop__Group__0 ) )
            // InternalBurst.g:444:3: ( rule__Stop__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getGroup()); 
            }
            // InternalBurst.g:445:3: ( rule__Stop__Group__0 )
            // InternalBurst.g:445:4: rule__Stop__Group__0
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
    // InternalBurst.g:454:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalBurst.g:455:1: ( ruleIf EOF )
            // InternalBurst.g:456:1: ruleIf EOF
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
    // InternalBurst.g:463:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:467:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalBurst.g:468:2: ( ( rule__If__Group__0 ) )
            {
            // InternalBurst.g:468:2: ( ( rule__If__Group__0 ) )
            // InternalBurst.g:469:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalBurst.g:470:3: ( rule__If__Group__0 )
            // InternalBurst.g:470:4: rule__If__Group__0
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
    // InternalBurst.g:479:1: entryRuleContextManagement : ruleContextManagement EOF ;
    public final void entryRuleContextManagement() throws RecognitionException {
        try {
            // InternalBurst.g:480:1: ( ruleContextManagement EOF )
            // InternalBurst.g:481:1: ruleContextManagement EOF
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
    // InternalBurst.g:488:1: ruleContextManagement : ( ( rule__ContextManagement__Group__0 ) ) ;
    public final void ruleContextManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:492:2: ( ( ( rule__ContextManagement__Group__0 ) ) )
            // InternalBurst.g:493:2: ( ( rule__ContextManagement__Group__0 ) )
            {
            // InternalBurst.g:493:2: ( ( rule__ContextManagement__Group__0 ) )
            // InternalBurst.g:494:3: ( rule__ContextManagement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getGroup()); 
            }
            // InternalBurst.g:495:3: ( rule__ContextManagement__Group__0 )
            // InternalBurst.g:495:4: rule__ContextManagement__Group__0
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
    // InternalBurst.g:504:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalBurst.g:505:1: ( ruleCall EOF )
            // InternalBurst.g:506:1: ruleCall EOF
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
    // InternalBurst.g:513:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:517:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalBurst.g:518:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalBurst.g:518:2: ( ( rule__Call__Group__0 ) )
            // InternalBurst.g:519:3: ( rule__Call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup()); 
            }
            // InternalBurst.g:520:3: ( rule__Call__Group__0 )
            // InternalBurst.g:520:4: rule__Call__Group__0
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
    // InternalBurst.g:529:1: entryRuleCallElement : ruleCallElement EOF ;
    public final void entryRuleCallElement() throws RecognitionException {
        try {
            // InternalBurst.g:530:1: ( ruleCallElement EOF )
            // InternalBurst.g:531:1: ruleCallElement EOF
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
    // InternalBurst.g:538:1: ruleCallElement : ( ( rule__CallElement__Alternatives ) ) ;
    public final void ruleCallElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:542:2: ( ( ( rule__CallElement__Alternatives ) ) )
            // InternalBurst.g:543:2: ( ( rule__CallElement__Alternatives ) )
            {
            // InternalBurst.g:543:2: ( ( rule__CallElement__Alternatives ) )
            // InternalBurst.g:544:3: ( rule__CallElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallElementAccess().getAlternatives()); 
            }
            // InternalBurst.g:545:3: ( rule__CallElement__Alternatives )
            // InternalBurst.g:545:4: rule__CallElement__Alternatives
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
    // InternalBurst.g:554:1: entryRuleLocale : ruleLocale EOF ;
    public final void entryRuleLocale() throws RecognitionException {
        try {
            // InternalBurst.g:555:1: ( ruleLocale EOF )
            // InternalBurst.g:556:1: ruleLocale EOF
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
    // InternalBurst.g:563:1: ruleLocale : ( ( rule__Locale__Group__0 ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:567:2: ( ( ( rule__Locale__Group__0 ) ) )
            // InternalBurst.g:568:2: ( ( rule__Locale__Group__0 ) )
            {
            // InternalBurst.g:568:2: ( ( rule__Locale__Group__0 ) )
            // InternalBurst.g:569:3: ( rule__Locale__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getGroup()); 
            }
            // InternalBurst.g:570:3: ( rule__Locale__Group__0 )
            // InternalBurst.g:570:4: rule__Locale__Group__0
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
    // InternalBurst.g:579:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalBurst.g:580:1: ( ruleAccess EOF )
            // InternalBurst.g:581:1: ruleAccess EOF
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
    // InternalBurst.g:588:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:592:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalBurst.g:593:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalBurst.g:593:2: ( ( rule__Access__Group__0 ) )
            // InternalBurst.g:594:3: ( rule__Access__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup()); 
            }
            // InternalBurst.g:595:3: ( rule__Access__Group__0 )
            // InternalBurst.g:595:4: rule__Access__Group__0
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
    // InternalBurst.g:604:1: entryRuleSubCall : ruleSubCall EOF ;
    public final void entryRuleSubCall() throws RecognitionException {
        try {
            // InternalBurst.g:605:1: ( ruleSubCall EOF )
            // InternalBurst.g:606:1: ruleSubCall EOF
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
    // InternalBurst.g:613:1: ruleSubCall : ( ( rule__SubCall__Group__0 ) ) ;
    public final void ruleSubCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:617:2: ( ( ( rule__SubCall__Group__0 ) ) )
            // InternalBurst.g:618:2: ( ( rule__SubCall__Group__0 ) )
            {
            // InternalBurst.g:618:2: ( ( rule__SubCall__Group__0 ) )
            // InternalBurst.g:619:3: ( rule__SubCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getGroup()); 
            }
            // InternalBurst.g:620:3: ( rule__SubCall__Group__0 )
            // InternalBurst.g:620:4: rule__SubCall__Group__0
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
    // InternalBurst.g:629:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalBurst.g:630:1: ( ruleTerminalExpression EOF )
            // InternalBurst.g:631:1: ruleTerminalExpression EOF
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
    // InternalBurst.g:638:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:642:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalBurst.g:643:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalBurst.g:643:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalBurst.g:644:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalBurst.g:645:3: ( rule__TerminalExpression__Alternatives )
            // InternalBurst.g:645:4: rule__TerminalExpression__Alternatives
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
    // InternalBurst.g:654:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBurst.g:655:1: ( ruleQualifiedName EOF )
            // InternalBurst.g:656:1: ruleQualifiedName EOF
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
    // InternalBurst.g:663:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:667:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBurst.g:668:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBurst.g:668:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBurst.g:669:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalBurst.g:670:3: ( rule__QualifiedName__Group__0 )
            // InternalBurst.g:670:4: rule__QualifiedName__Group__0
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
    // InternalBurst.g:679:1: ruleconcernManagment : ( ( rule__ConcernManagment__Alternatives ) ) ;
    public final void ruleconcernManagment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:683:1: ( ( ( rule__ConcernManagment__Alternatives ) ) )
            // InternalBurst.g:684:2: ( ( rule__ConcernManagment__Alternatives ) )
            {
            // InternalBurst.g:684:2: ( ( rule__ConcernManagment__Alternatives ) )
            // InternalBurst.g:685:3: ( rule__ConcernManagment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernManagmentAccess().getAlternatives()); 
            }
            // InternalBurst.g:686:3: ( rule__ConcernManagment__Alternatives )
            // InternalBurst.g:686:4: rule__ConcernManagment__Alternatives
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
    // InternalBurst.g:694:1: rule__FileElement__Alternatives : ( ( ruleRoles ) | ( rulePackage ) );
    public final void rule__FileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:698:1: ( ( ruleRoles ) | ( rulePackage ) )
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
                    // InternalBurst.g:699:2: ( ruleRoles )
                    {
                    // InternalBurst.g:699:2: ( ruleRoles )
                    // InternalBurst.g:700:3: ruleRoles
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
                    // InternalBurst.g:705:2: ( rulePackage )
                    {
                    // InternalBurst.g:705:2: ( rulePackage )
                    // InternalBurst.g:706:3: rulePackage
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
    // InternalBurst.g:715:1: rule__PackageElement__Alternatives : ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) );
    public final void rule__PackageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:719:1: ( ( ruleConcern ) | ( ruleTemplate ) | ( ruleRuleIntersect ) )
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
                    // InternalBurst.g:720:2: ( ruleConcern )
                    {
                    // InternalBurst.g:720:2: ( ruleConcern )
                    // InternalBurst.g:721:3: ruleConcern
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
                    // InternalBurst.g:726:2: ( ruleTemplate )
                    {
                    // InternalBurst.g:726:2: ( ruleTemplate )
                    // InternalBurst.g:727:3: ruleTemplate
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
                    // InternalBurst.g:732:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:732:2: ( ruleRuleIntersect )
                    // InternalBurst.g:733:3: ruleRuleIntersect
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
    // InternalBurst.g:742:1: rule__ConcernElement__Alternatives : ( ( ruleMember ) | ( ruleRuleIntersect ) );
    public final void rule__ConcernElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:746:1: ( ( ruleMember ) | ( ruleRuleIntersect ) )
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
                    // InternalBurst.g:747:2: ( ruleMember )
                    {
                    // InternalBurst.g:747:2: ( ruleMember )
                    // InternalBurst.g:748:3: ruleMember
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
                    // InternalBurst.g:753:2: ( ruleRuleIntersect )
                    {
                    // InternalBurst.g:753:2: ( ruleRuleIntersect )
                    // InternalBurst.g:754:3: ruleRuleIntersect
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
    // InternalBurst.g:763:1: rule__RuleIntersect__Alternatives_4_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:767:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalBurst.g:768:2: ( ',' )
                    {
                    // InternalBurst.g:768:2: ( ',' )
                    // InternalBurst.g:769:3: ','
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
                    // InternalBurst.g:774:2: ( 'and' )
                    {
                    // InternalBurst.g:774:2: ( 'and' )
                    // InternalBurst.g:775:3: 'and'
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


    // $ANTLR start "rule__RuleIntersect__Alternatives_5_3_1"
    // InternalBurst.g:784:1: rule__RuleIntersect__Alternatives_5_3_1 : ( ( ',' ) | ( 'and' ) );
    public final void rule__RuleIntersect__Alternatives_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:788:1: ( ( ',' ) | ( 'and' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBurst.g:789:2: ( ',' )
                    {
                    // InternalBurst.g:789:2: ( ',' )
                    // InternalBurst.g:790:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:795:2: ( 'and' )
                    {
                    // InternalBurst.g:795:2: ( 'and' )
                    // InternalBurst.g:796:3: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1()); 
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
    // $ANTLR end "rule__RuleIntersect__Alternatives_5_3_1"


    // $ANTLR start "rule__Line__Alternatives"
    // InternalBurst.g:805:1: rule__Line__Alternatives : ( ( ruleBlock ) | ( ruleCall ) | ( ruleContextManagement ) | ( ruleIf ) | ( ruleStop ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:809:1: ( ( ruleBlock ) | ( ruleCall ) | ( ruleContextManagement ) | ( ruleIf ) | ( ruleStop ) )
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
            case 31:
            case 34:
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
            case 29:
                {
                alt6=4;
                }
                break;
            case 28:
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
                    // InternalBurst.g:810:2: ( ruleBlock )
                    {
                    // InternalBurst.g:810:2: ( ruleBlock )
                    // InternalBurst.g:811:3: ruleBlock
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
                    // InternalBurst.g:816:2: ( ruleCall )
                    {
                    // InternalBurst.g:816:2: ( ruleCall )
                    // InternalBurst.g:817:3: ruleCall
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
                    // InternalBurst.g:822:2: ( ruleContextManagement )
                    {
                    // InternalBurst.g:822:2: ( ruleContextManagement )
                    // InternalBurst.g:823:3: ruleContextManagement
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
                    // InternalBurst.g:828:2: ( ruleIf )
                    {
                    // InternalBurst.g:828:2: ( ruleIf )
                    // InternalBurst.g:829:3: ruleIf
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
                    // InternalBurst.g:834:2: ( ruleStop )
                    {
                    // InternalBurst.g:834:2: ( ruleStop )
                    // InternalBurst.g:835:3: ruleStop
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
    // InternalBurst.g:844:1: rule__If__Alternatives_3 : ( ( ( rule__If__ThenBlockAssignment_3_0 ) ) | ( ( rule__If__Group_3_1__0 ) ) );
    public final void rule__If__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:848:1: ( ( ( rule__If__ThenBlockAssignment_3_0 ) ) | ( ( rule__If__Group_3_1__0 ) ) )
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
                    // InternalBurst.g:849:2: ( ( rule__If__ThenBlockAssignment_3_0 ) )
                    {
                    // InternalBurst.g:849:2: ( ( rule__If__ThenBlockAssignment_3_0 ) )
                    // InternalBurst.g:850:3: ( rule__If__ThenBlockAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getThenBlockAssignment_3_0()); 
                    }
                    // InternalBurst.g:851:3: ( rule__If__ThenBlockAssignment_3_0 )
                    // InternalBurst.g:851:4: rule__If__ThenBlockAssignment_3_0
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
                    // InternalBurst.g:855:2: ( ( rule__If__Group_3_1__0 ) )
                    {
                    // InternalBurst.g:855:2: ( ( rule__If__Group_3_1__0 ) )
                    // InternalBurst.g:856:3: ( rule__If__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIfAccess().getGroup_3_1()); 
                    }
                    // InternalBurst.g:857:3: ( rule__If__Group_3_1__0 )
                    // InternalBurst.g:857:4: rule__If__Group_3_1__0
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
    // InternalBurst.g:865:1: rule__CallElement__Alternatives : ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) | ( ruleTerminalExpression ) );
    public final void rule__CallElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:869:1: ( ( ruleLocale ) | ( ruleAccess ) | ( ruleSubCall ) | ( ruleTerminalExpression ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 34:
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
                    // InternalBurst.g:870:2: ( ruleLocale )
                    {
                    // InternalBurst.g:870:2: ( ruleLocale )
                    // InternalBurst.g:871:3: ruleLocale
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
                    // InternalBurst.g:876:2: ( ruleAccess )
                    {
                    // InternalBurst.g:876:2: ( ruleAccess )
                    // InternalBurst.g:877:3: ruleAccess
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
                    // InternalBurst.g:882:2: ( ruleSubCall )
                    {
                    // InternalBurst.g:882:2: ( ruleSubCall )
                    // InternalBurst.g:883:3: ruleSubCall
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
                    // InternalBurst.g:888:2: ( ruleTerminalExpression )
                    {
                    // InternalBurst.g:888:2: ( ruleTerminalExpression )
                    // InternalBurst.g:889:3: ruleTerminalExpression
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
    // InternalBurst.g:898:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:902:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==33) ) {
                    alt9=4;
                }
                else if ( (LA9_1==EOF||(LA9_1>=RULE_ENDLINE && LA9_1<=RULE_STRING)||(LA9_1>=14 && LA9_1<=15)||(LA9_1>=21 && LA9_1<=22)||(LA9_1>=30 && LA9_1<=31)||(LA9_1>=34 && LA9_1<=35)||(LA9_1>=39 && LA9_1<=41)) ) {
                    alt9=1;
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
                    // InternalBurst.g:903:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalBurst.g:903:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalBurst.g:904:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalBurst.g:905:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalBurst.g:905:4: rule__TerminalExpression__Group_0__0
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
                    // InternalBurst.g:909:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalBurst.g:909:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalBurst.g:910:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalBurst.g:911:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalBurst.g:911:4: rule__TerminalExpression__Group_1__0
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
                    // InternalBurst.g:915:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalBurst.g:915:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalBurst.g:916:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalBurst.g:917:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalBurst.g:917:4: rule__TerminalExpression__Group_2__0
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
                    // InternalBurst.g:921:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalBurst.g:921:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalBurst.g:922:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalBurst.g:923:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalBurst.g:923:4: rule__TerminalExpression__Group_3__0
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
                    // InternalBurst.g:927:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalBurst.g:927:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalBurst.g:928:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalBurst.g:929:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalBurst.g:929:4: rule__TerminalExpression__Group_4__0
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
                    // InternalBurst.g:933:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalBurst.g:933:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalBurst.g:934:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalBurst.g:935:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalBurst.g:935:4: rule__TerminalExpression__Group_5__0
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
    // InternalBurst.g:943:1: rule__TerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__TerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:947:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalBurst.g:948:2: ( 'true' )
                    {
                    // InternalBurst.g:948:2: ( 'true' )
                    // InternalBurst.g:949:3: 'true'
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
                    // InternalBurst.g:954:2: ( 'false' )
                    {
                    // InternalBurst.g:954:2: ( 'false' )
                    // InternalBurst.g:955:3: 'false'
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
    // InternalBurst.g:964:1: rule__ConcernManagment__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) );
    public final void rule__ConcernManagment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:968:1: ( ( ( '1' ) ) | ( ( '0' ) ) )
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
                    // InternalBurst.g:969:2: ( ( '1' ) )
                    {
                    // InternalBurst.g:969:2: ( ( '1' ) )
                    // InternalBurst.g:970:3: ( '1' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0()); 
                    }
                    // InternalBurst.g:971:3: ( '1' )
                    // InternalBurst.g:971:4: '1'
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
                    // InternalBurst.g:975:2: ( ( '0' ) )
                    {
                    // InternalBurst.g:975:2: ( ( '0' ) )
                    // InternalBurst.g:976:3: ( '0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1()); 
                    }
                    // InternalBurst.g:977:3: ( '0' )
                    // InternalBurst.g:977:4: '0'
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
    // InternalBurst.g:985:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:989:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalBurst.g:990:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalBurst.g:997:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1001:1: ( ( () ) )
            // InternalBurst.g:1002:1: ( () )
            {
            // InternalBurst.g:1002:1: ( () )
            // InternalBurst.g:1003:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getFileAction_0()); 
            }
            // InternalBurst.g:1004:2: ()
            // InternalBurst.g:1004:3: 
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
    // InternalBurst.g:1012:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1016:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalBurst.g:1017:2: rule__File__Group__1__Impl rule__File__Group__2
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
    // InternalBurst.g:1024:1: rule__File__Group__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1028:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1029:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1029:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1030:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1()); 
            }
            // InternalBurst.g:1031:2: ( RULE_ENDLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ENDLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:1031:3: RULE_ENDLINE
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
    // InternalBurst.g:1039:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1043:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalBurst.g:1044:2: rule__File__Group__2__Impl rule__File__Group__3
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
    // InternalBurst.g:1051:1: rule__File__Group__2__Impl : ( ( rule__File__Group_2__0 )* ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1055:1: ( ( ( rule__File__Group_2__0 )* ) )
            // InternalBurst.g:1056:1: ( ( rule__File__Group_2__0 )* )
            {
            // InternalBurst.g:1056:1: ( ( rule__File__Group_2__0 )* )
            // InternalBurst.g:1057:2: ( rule__File__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_2()); 
            }
            // InternalBurst.g:1058:2: ( rule__File__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBurst.g:1058:3: rule__File__Group_2__0
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
    // InternalBurst.g:1066:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1070:1: ( rule__File__Group__3__Impl )
            // InternalBurst.g:1071:2: rule__File__Group__3__Impl
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
    // InternalBurst.g:1077:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )* ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1081:1: ( ( ( rule__File__Group_3__0 )* ) )
            // InternalBurst.g:1082:1: ( ( rule__File__Group_3__0 )* )
            {
            // InternalBurst.g:1082:1: ( ( rule__File__Group_3__0 )* )
            // InternalBurst.g:1083:2: ( rule__File__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getGroup_3()); 
            }
            // InternalBurst.g:1084:2: ( rule__File__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:1084:3: rule__File__Group_3__0
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
    // InternalBurst.g:1093:1: rule__File__Group_2__0 : rule__File__Group_2__0__Impl rule__File__Group_2__1 ;
    public final void rule__File__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1097:1: ( rule__File__Group_2__0__Impl rule__File__Group_2__1 )
            // InternalBurst.g:1098:2: rule__File__Group_2__0__Impl rule__File__Group_2__1
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
    // InternalBurst.g:1105:1: rule__File__Group_2__0__Impl : ( ( rule__File__ImportsAssignment_2_0 ) ) ;
    public final void rule__File__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1109:1: ( ( ( rule__File__ImportsAssignment_2_0 ) ) )
            // InternalBurst.g:1110:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            {
            // InternalBurst.g:1110:1: ( ( rule__File__ImportsAssignment_2_0 ) )
            // InternalBurst.g:1111:2: ( rule__File__ImportsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getImportsAssignment_2_0()); 
            }
            // InternalBurst.g:1112:2: ( rule__File__ImportsAssignment_2_0 )
            // InternalBurst.g:1112:3: rule__File__ImportsAssignment_2_0
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
    // InternalBurst.g:1120:1: rule__File__Group_2__1 : rule__File__Group_2__1__Impl ;
    public final void rule__File__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1124:1: ( rule__File__Group_2__1__Impl )
            // InternalBurst.g:1125:2: rule__File__Group_2__1__Impl
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
    // InternalBurst.g:1131:1: rule__File__Group_2__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1135:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1136:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1136:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1137:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1()); 
            }
            // InternalBurst.g:1138:2: ( RULE_ENDLINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ENDLINE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:1138:3: RULE_ENDLINE
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
    // InternalBurst.g:1147:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1151:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // InternalBurst.g:1152:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
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
    // InternalBurst.g:1159:1: rule__File__Group_3__0__Impl : ( ( rule__File__ElementsAssignment_3_0 ) ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1163:1: ( ( ( rule__File__ElementsAssignment_3_0 ) ) )
            // InternalBurst.g:1164:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            {
            // InternalBurst.g:1164:1: ( ( rule__File__ElementsAssignment_3_0 ) )
            // InternalBurst.g:1165:2: ( rule__File__ElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getElementsAssignment_3_0()); 
            }
            // InternalBurst.g:1166:2: ( rule__File__ElementsAssignment_3_0 )
            // InternalBurst.g:1166:3: rule__File__ElementsAssignment_3_0
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
    // InternalBurst.g:1174:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1178:1: ( rule__File__Group_3__1__Impl )
            // InternalBurst.g:1179:2: rule__File__Group_3__1__Impl
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
    // InternalBurst.g:1185:1: rule__File__Group_3__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1189:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1190:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1190:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1191:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1()); 
            }
            // InternalBurst.g:1192:2: ( RULE_ENDLINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ENDLINE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:1192:3: RULE_ENDLINE
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
    // InternalBurst.g:1201:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1205:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:1206:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalBurst.g:1213:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1217:1: ( ( () ) )
            // InternalBurst.g:1218:1: ( () )
            {
            // InternalBurst.g:1218:1: ( () )
            // InternalBurst.g:1219:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportAction_0()); 
            }
            // InternalBurst.g:1220:2: ()
            // InternalBurst.g:1220:3: 
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
    // InternalBurst.g:1228:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1232:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:1233:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalBurst.g:1240:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1244:1: ( ( 'import' ) )
            // InternalBurst.g:1245:1: ( 'import' )
            {
            // InternalBurst.g:1245:1: ( 'import' )
            // InternalBurst.g:1246:2: 'import'
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
    // InternalBurst.g:1255:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1259:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:1260:2: rule__Import__Group__2__Impl
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
    // InternalBurst.g:1266:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1270:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // InternalBurst.g:1271:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // InternalBurst.g:1271:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // InternalBurst.g:1272:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            }
            // InternalBurst.g:1273:2: ( rule__Import__ImportedNamespaceAssignment_2 )
            // InternalBurst.g:1273:3: rule__Import__ImportedNamespaceAssignment_2
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
    // InternalBurst.g:1282:1: rule__Roles__Group__0 : rule__Roles__Group__0__Impl rule__Roles__Group__1 ;
    public final void rule__Roles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1286:1: ( rule__Roles__Group__0__Impl rule__Roles__Group__1 )
            // InternalBurst.g:1287:2: rule__Roles__Group__0__Impl rule__Roles__Group__1
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
    // InternalBurst.g:1294:1: rule__Roles__Group__0__Impl : ( () ) ;
    public final void rule__Roles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1298:1: ( ( () ) )
            // InternalBurst.g:1299:1: ( () )
            {
            // InternalBurst.g:1299:1: ( () )
            // InternalBurst.g:1300:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getRoleAction_0()); 
            }
            // InternalBurst.g:1301:2: ()
            // InternalBurst.g:1301:3: 
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
    // InternalBurst.g:1309:1: rule__Roles__Group__1 : rule__Roles__Group__1__Impl rule__Roles__Group__2 ;
    public final void rule__Roles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1313:1: ( rule__Roles__Group__1__Impl rule__Roles__Group__2 )
            // InternalBurst.g:1314:2: rule__Roles__Group__1__Impl rule__Roles__Group__2
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
    // InternalBurst.g:1321:1: rule__Roles__Group__1__Impl : ( 'role' ) ;
    public final void rule__Roles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1325:1: ( ( 'role' ) )
            // InternalBurst.g:1326:1: ( 'role' )
            {
            // InternalBurst.g:1326:1: ( 'role' )
            // InternalBurst.g:1327:2: 'role'
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
    // InternalBurst.g:1336:1: rule__Roles__Group__2 : rule__Roles__Group__2__Impl ;
    public final void rule__Roles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1340:1: ( rule__Roles__Group__2__Impl )
            // InternalBurst.g:1341:2: rule__Roles__Group__2__Impl
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
    // InternalBurst.g:1347:1: rule__Roles__Group__2__Impl : ( ( rule__Roles__NameAssignment_2 ) ) ;
    public final void rule__Roles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1351:1: ( ( ( rule__Roles__NameAssignment_2 ) ) )
            // InternalBurst.g:1352:1: ( ( rule__Roles__NameAssignment_2 ) )
            {
            // InternalBurst.g:1352:1: ( ( rule__Roles__NameAssignment_2 ) )
            // InternalBurst.g:1353:2: ( rule__Roles__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRolesAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1354:2: ( rule__Roles__NameAssignment_2 )
            // InternalBurst.g:1354:3: rule__Roles__NameAssignment_2
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
    // InternalBurst.g:1363:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1367:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalBurst.g:1368:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalBurst.g:1375:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1379:1: ( ( () ) )
            // InternalBurst.g:1380:1: ( () )
            {
            // InternalBurst.g:1380:1: ( () )
            // InternalBurst.g:1381:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            }
            // InternalBurst.g:1382:2: ()
            // InternalBurst.g:1382:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageAction_0()); 
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
    // InternalBurst.g:1390:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1394:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalBurst.g:1395:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalBurst.g:1402:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1406:1: ( ( 'package' ) )
            // InternalBurst.g:1407:1: ( 'package' )
            {
            // InternalBurst.g:1407:1: ( 'package' )
            // InternalBurst.g:1408:2: 'package'
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
    // InternalBurst.g:1417:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1421:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalBurst.g:1422:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalBurst.g:1429:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1433:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalBurst.g:1434:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalBurst.g:1434:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalBurst.g:1435:2: ( rule__Package__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1436:2: ( rule__Package__NameAssignment_2 )
            // InternalBurst.g:1436:3: rule__Package__NameAssignment_2
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
    // InternalBurst.g:1444:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1448:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalBurst.g:1449:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalBurst.g:1456:1: rule__Package__Group__3__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1460:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1461:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1461:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1462:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3()); 
            }
            // InternalBurst.g:1463:2: ( RULE_ENDLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ENDLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:1463:3: RULE_ENDLINE
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
    // InternalBurst.g:1471:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1475:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalBurst.g:1476:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalBurst.g:1483:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1487:1: ( ( '{' ) )
            // InternalBurst.g:1488:1: ( '{' )
            {
            // InternalBurst.g:1488:1: ( '{' )
            // InternalBurst.g:1489:2: '{'
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
    // InternalBurst.g:1498:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1502:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalBurst.g:1503:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalBurst.g:1510:1: rule__Package__Group__5__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1514:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1515:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1515:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1516:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5()); 
            }
            // InternalBurst.g:1517:2: ( RULE_ENDLINE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ENDLINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBurst.g:1517:3: RULE_ENDLINE
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
    // InternalBurst.g:1525:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1529:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalBurst.g:1530:2: rule__Package__Group__6__Impl rule__Package__Group__7
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
    // InternalBurst.g:1537:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1541:1: ( ( ( rule__Package__Group_6__0 )* ) )
            // InternalBurst.g:1542:1: ( ( rule__Package__Group_6__0 )* )
            {
            // InternalBurst.g:1542:1: ( ( rule__Package__Group_6__0 )* )
            // InternalBurst.g:1543:2: ( rule__Package__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup_6()); 
            }
            // InternalBurst.g:1544:2: ( rule__Package__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=23 && LA19_0<=24)||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:1544:3: rule__Package__Group_6__0
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
    // InternalBurst.g:1552:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1556:1: ( rule__Package__Group__7__Impl )
            // InternalBurst.g:1557:2: rule__Package__Group__7__Impl
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
    // InternalBurst.g:1563:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1567:1: ( ( '}' ) )
            // InternalBurst.g:1568:1: ( '}' )
            {
            // InternalBurst.g:1568:1: ( '}' )
            // InternalBurst.g:1569:2: '}'
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
    // InternalBurst.g:1579:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1583:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // InternalBurst.g:1584:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
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
    // InternalBurst.g:1591:1: rule__Package__Group_6__0__Impl : ( ( rule__Package__ElementsAssignment_6_0 ) ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1595:1: ( ( ( rule__Package__ElementsAssignment_6_0 ) ) )
            // InternalBurst.g:1596:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            {
            // InternalBurst.g:1596:1: ( ( rule__Package__ElementsAssignment_6_0 ) )
            // InternalBurst.g:1597:2: ( rule__Package__ElementsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getElementsAssignment_6_0()); 
            }
            // InternalBurst.g:1598:2: ( rule__Package__ElementsAssignment_6_0 )
            // InternalBurst.g:1598:3: rule__Package__ElementsAssignment_6_0
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
    // InternalBurst.g:1606:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1610:1: ( rule__Package__Group_6__1__Impl )
            // InternalBurst.g:1611:2: rule__Package__Group_6__1__Impl
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
    // InternalBurst.g:1617:1: rule__Package__Group_6__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1621:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1622:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1622:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1623:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1()); 
            }
            // InternalBurst.g:1624:2: ( RULE_ENDLINE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:1624:3: RULE_ENDLINE
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
    // InternalBurst.g:1633:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1637:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:1638:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
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
    // InternalBurst.g:1645:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1649:1: ( ( () ) )
            // InternalBurst.g:1650:1: ( () )
            {
            // InternalBurst.g:1650:1: ( () )
            // InternalBurst.g:1651:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            }
            // InternalBurst.g:1652:2: ()
            // InternalBurst.g:1652:3: 
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
    // InternalBurst.g:1660:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1664:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:1665:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
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
    // InternalBurst.g:1672:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1676:1: ( ( 'concern' ) )
            // InternalBurst.g:1677:1: ( 'concern' )
            {
            // InternalBurst.g:1677:1: ( 'concern' )
            // InternalBurst.g:1678:2: 'concern'
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
    // InternalBurst.g:1687:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1691:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:1692:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
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
    // InternalBurst.g:1699:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1703:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:1704:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:1704:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:1705:2: ( rule__Concern__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:1706:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:1706:3: rule__Concern__NameAssignment_2
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
    // InternalBurst.g:1714:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1718:1: ( rule__Concern__Group__3__Impl )
            // InternalBurst.g:1719:2: rule__Concern__Group__3__Impl
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
    // InternalBurst.g:1725:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1729:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:1730:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:1730:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:1731:2: ( rule__Concern__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getGroup_3()); 
            }
            // InternalBurst.g:1732:2: ( rule__Concern__Group_3__0 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalBurst.g:1732:3: rule__Concern__Group_3__0
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
    // InternalBurst.g:1741:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1745:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:1746:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
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
    // InternalBurst.g:1753:1: rule__Concern__Group_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1757:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1758:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1758:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1759:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0()); 
            }
            // InternalBurst.g:1760:2: ( RULE_ENDLINE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ENDLINE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBurst.g:1760:3: RULE_ENDLINE
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
    // InternalBurst.g:1768:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1772:1: ( rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2 )
            // InternalBurst.g:1773:2: rule__Concern__Group_3__1__Impl rule__Concern__Group_3__2
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
    // InternalBurst.g:1780:1: rule__Concern__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1784:1: ( ( '{' ) )
            // InternalBurst.g:1785:1: ( '{' )
            {
            // InternalBurst.g:1785:1: ( '{' )
            // InternalBurst.g:1786:2: '{'
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
    // InternalBurst.g:1795:1: rule__Concern__Group_3__2 : rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 ;
    public final void rule__Concern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1799:1: ( rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3 )
            // InternalBurst.g:1800:2: rule__Concern__Group_3__2__Impl rule__Concern__Group_3__3
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
    // InternalBurst.g:1807:1: rule__Concern__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Concern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1811:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1812:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1812:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1813:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2()); 
            }
            // InternalBurst.g:1814:2: ( RULE_ENDLINE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ENDLINE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:1814:3: RULE_ENDLINE
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
    // InternalBurst.g:1822:1: rule__Concern__Group_3__3 : rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 ;
    public final void rule__Concern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1826:1: ( rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4 )
            // InternalBurst.g:1827:2: rule__Concern__Group_3__3__Impl rule__Concern__Group_3__4
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
    // InternalBurst.g:1834:1: rule__Concern__Group_3__3__Impl : ( ( rule__Concern__Group_3_3__0 )* ) ;
    public final void rule__Concern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1838:1: ( ( ( rule__Concern__Group_3_3__0 )* ) )
            // InternalBurst.g:1839:1: ( ( rule__Concern__Group_3_3__0 )* )
            {
            // InternalBurst.g:1839:1: ( ( rule__Concern__Group_3_3__0 )* )
            // InternalBurst.g:1840:2: ( rule__Concern__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getGroup_3_3()); 
            }
            // InternalBurst.g:1841:2: ( rule__Concern__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=36 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBurst.g:1841:3: rule__Concern__Group_3_3__0
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
    // InternalBurst.g:1849:1: rule__Concern__Group_3__4 : rule__Concern__Group_3__4__Impl ;
    public final void rule__Concern__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1853:1: ( rule__Concern__Group_3__4__Impl )
            // InternalBurst.g:1854:2: rule__Concern__Group_3__4__Impl
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
    // InternalBurst.g:1860:1: rule__Concern__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Concern__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1864:1: ( ( '}' ) )
            // InternalBurst.g:1865:1: ( '}' )
            {
            // InternalBurst.g:1865:1: ( '}' )
            // InternalBurst.g:1866:2: '}'
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
    // InternalBurst.g:1876:1: rule__Concern__Group_3_3__0 : rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 ;
    public final void rule__Concern__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1880:1: ( rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1 )
            // InternalBurst.g:1881:2: rule__Concern__Group_3_3__0__Impl rule__Concern__Group_3_3__1
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
    // InternalBurst.g:1888:1: rule__Concern__Group_3_3__0__Impl : ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) ;
    public final void rule__Concern__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1892:1: ( ( ( rule__Concern__ElementsAssignment_3_3_0 ) ) )
            // InternalBurst.g:1893:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            {
            // InternalBurst.g:1893:1: ( ( rule__Concern__ElementsAssignment_3_3_0 ) )
            // InternalBurst.g:1894:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getElementsAssignment_3_3_0()); 
            }
            // InternalBurst.g:1895:2: ( rule__Concern__ElementsAssignment_3_3_0 )
            // InternalBurst.g:1895:3: rule__Concern__ElementsAssignment_3_3_0
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
    // InternalBurst.g:1903:1: rule__Concern__Group_3_3__1 : rule__Concern__Group_3_3__1__Impl ;
    public final void rule__Concern__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1907:1: ( rule__Concern__Group_3_3__1__Impl )
            // InternalBurst.g:1908:2: rule__Concern__Group_3_3__1__Impl
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
    // InternalBurst.g:1914:1: rule__Concern__Group_3_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Concern__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1918:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:1919:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:1919:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:1920:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:1920:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:1921:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }
            // InternalBurst.g:1922:3: ( RULE_ENDLINE )
            // InternalBurst.g:1922:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }

            }

            // InternalBurst.g:1925:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:1926:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1()); 
            }
            // InternalBurst.g:1927:3: ( RULE_ENDLINE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ENDLINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:1927:4: RULE_ENDLINE
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
    // InternalBurst.g:1937:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1941:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalBurst.g:1942:2: rule__Template__Group__0__Impl rule__Template__Group__1
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
    // InternalBurst.g:1949:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1953:1: ( ( () ) )
            // InternalBurst.g:1954:1: ( () )
            {
            // InternalBurst.g:1954:1: ( () )
            // InternalBurst.g:1955:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            }
            // InternalBurst.g:1956:2: ()
            // InternalBurst.g:1956:3: 
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
    // InternalBurst.g:1964:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1968:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalBurst.g:1969:2: rule__Template__Group__1__Impl rule__Template__Group__2
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
    // InternalBurst.g:1976:1: rule__Template__Group__1__Impl : ( 'template' ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1980:1: ( ( 'template' ) )
            // InternalBurst.g:1981:1: ( 'template' )
            {
            // InternalBurst.g:1981:1: ( 'template' )
            // InternalBurst.g:1982:2: 'template'
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
    // InternalBurst.g:1991:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1995:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalBurst.g:1996:2: rule__Template__Group__2__Impl rule__Template__Group__3
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
    // InternalBurst.g:2003:1: rule__Template__Group__2__Impl : ( ( rule__Template__NameAssignment_2 ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2007:1: ( ( ( rule__Template__NameAssignment_2 ) ) )
            // InternalBurst.g:2008:1: ( ( rule__Template__NameAssignment_2 ) )
            {
            // InternalBurst.g:2008:1: ( ( rule__Template__NameAssignment_2 ) )
            // InternalBurst.g:2009:2: ( rule__Template__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:2010:2: ( rule__Template__NameAssignment_2 )
            // InternalBurst.g:2010:3: rule__Template__NameAssignment_2
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
    // InternalBurst.g:2018:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2022:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // InternalBurst.g:2023:2: rule__Template__Group__3__Impl rule__Template__Group__4
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
    // InternalBurst.g:2030:1: rule__Template__Group__3__Impl : ( '<' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2034:1: ( ( '<' ) )
            // InternalBurst.g:2035:1: ( '<' )
            {
            // InternalBurst.g:2035:1: ( '<' )
            // InternalBurst.g:2036:2: '<'
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
    // InternalBurst.g:2045:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2049:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // InternalBurst.g:2050:2: rule__Template__Group__4__Impl rule__Template__Group__5
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
    // InternalBurst.g:2057:1: rule__Template__Group__4__Impl : ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2061:1: ( ( ( rule__Template__TemplateArgumentsAssignment_4 ) ) )
            // InternalBurst.g:2062:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            {
            // InternalBurst.g:2062:1: ( ( rule__Template__TemplateArgumentsAssignment_4 ) )
            // InternalBurst.g:2063:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_4()); 
            }
            // InternalBurst.g:2064:2: ( rule__Template__TemplateArgumentsAssignment_4 )
            // InternalBurst.g:2064:3: rule__Template__TemplateArgumentsAssignment_4
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
    // InternalBurst.g:2072:1: rule__Template__Group__5 : rule__Template__Group__5__Impl rule__Template__Group__6 ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2076:1: ( rule__Template__Group__5__Impl rule__Template__Group__6 )
            // InternalBurst.g:2077:2: rule__Template__Group__5__Impl rule__Template__Group__6
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
    // InternalBurst.g:2084:1: rule__Template__Group__5__Impl : ( ( rule__Template__Group_5__0 )* ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2088:1: ( ( ( rule__Template__Group_5__0 )* ) )
            // InternalBurst.g:2089:1: ( ( rule__Template__Group_5__0 )* )
            {
            // InternalBurst.g:2089:1: ( ( rule__Template__Group_5__0 )* )
            // InternalBurst.g:2090:2: ( rule__Template__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_5()); 
            }
            // InternalBurst.g:2091:2: ( rule__Template__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:2091:3: rule__Template__Group_5__0
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
    // InternalBurst.g:2099:1: rule__Template__Group__6 : rule__Template__Group__6__Impl rule__Template__Group__7 ;
    public final void rule__Template__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2103:1: ( rule__Template__Group__6__Impl rule__Template__Group__7 )
            // InternalBurst.g:2104:2: rule__Template__Group__6__Impl rule__Template__Group__7
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
    // InternalBurst.g:2111:1: rule__Template__Group__6__Impl : ( '>' ) ;
    public final void rule__Template__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2115:1: ( ( '>' ) )
            // InternalBurst.g:2116:1: ( '>' )
            {
            // InternalBurst.g:2116:1: ( '>' )
            // InternalBurst.g:2117:2: '>'
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
    // InternalBurst.g:2126:1: rule__Template__Group__7 : rule__Template__Group__7__Impl ;
    public final void rule__Template__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2130:1: ( rule__Template__Group__7__Impl )
            // InternalBurst.g:2131:2: rule__Template__Group__7__Impl
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
    // InternalBurst.g:2137:1: rule__Template__Group__7__Impl : ( ( rule__Template__Group_7__0 )? ) ;
    public final void rule__Template__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2141:1: ( ( ( rule__Template__Group_7__0 )? ) )
            // InternalBurst.g:2142:1: ( ( rule__Template__Group_7__0 )? )
            {
            // InternalBurst.g:2142:1: ( ( rule__Template__Group_7__0 )? )
            // InternalBurst.g:2143:2: ( rule__Template__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_7()); 
            }
            // InternalBurst.g:2144:2: ( rule__Template__Group_7__0 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalBurst.g:2144:3: rule__Template__Group_7__0
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
    // InternalBurst.g:2153:1: rule__Template__Group_5__0 : rule__Template__Group_5__0__Impl rule__Template__Group_5__1 ;
    public final void rule__Template__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2157:1: ( rule__Template__Group_5__0__Impl rule__Template__Group_5__1 )
            // InternalBurst.g:2158:2: rule__Template__Group_5__0__Impl rule__Template__Group_5__1
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
    // InternalBurst.g:2165:1: rule__Template__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Template__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2169:1: ( ( ',' ) )
            // InternalBurst.g:2170:1: ( ',' )
            {
            // InternalBurst.g:2170:1: ( ',' )
            // InternalBurst.g:2171:2: ','
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
    // InternalBurst.g:2180:1: rule__Template__Group_5__1 : rule__Template__Group_5__1__Impl ;
    public final void rule__Template__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2184:1: ( rule__Template__Group_5__1__Impl )
            // InternalBurst.g:2185:2: rule__Template__Group_5__1__Impl
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
    // InternalBurst.g:2191:1: rule__Template__Group_5__1__Impl : ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) ;
    public final void rule__Template__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2195:1: ( ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) ) )
            // InternalBurst.g:2196:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            {
            // InternalBurst.g:2196:1: ( ( rule__Template__TemplateArgumentsAssignment_5_1 ) )
            // InternalBurst.g:2197:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsAssignment_5_1()); 
            }
            // InternalBurst.g:2198:2: ( rule__Template__TemplateArgumentsAssignment_5_1 )
            // InternalBurst.g:2198:3: rule__Template__TemplateArgumentsAssignment_5_1
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
    // InternalBurst.g:2207:1: rule__Template__Group_7__0 : rule__Template__Group_7__0__Impl rule__Template__Group_7__1 ;
    public final void rule__Template__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2211:1: ( rule__Template__Group_7__0__Impl rule__Template__Group_7__1 )
            // InternalBurst.g:2212:2: rule__Template__Group_7__0__Impl rule__Template__Group_7__1
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
    // InternalBurst.g:2219:1: rule__Template__Group_7__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2223:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2224:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2224:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2225:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0()); 
            }
            // InternalBurst.g:2226:2: ( RULE_ENDLINE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ENDLINE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBurst.g:2226:3: RULE_ENDLINE
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
    // InternalBurst.g:2234:1: rule__Template__Group_7__1 : rule__Template__Group_7__1__Impl rule__Template__Group_7__2 ;
    public final void rule__Template__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2238:1: ( rule__Template__Group_7__1__Impl rule__Template__Group_7__2 )
            // InternalBurst.g:2239:2: rule__Template__Group_7__1__Impl rule__Template__Group_7__2
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
    // InternalBurst.g:2246:1: rule__Template__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Template__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2250:1: ( ( '{' ) )
            // InternalBurst.g:2251:1: ( '{' )
            {
            // InternalBurst.g:2251:1: ( '{' )
            // InternalBurst.g:2252:2: '{'
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
    // InternalBurst.g:2261:1: rule__Template__Group_7__2 : rule__Template__Group_7__2__Impl rule__Template__Group_7__3 ;
    public final void rule__Template__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2265:1: ( rule__Template__Group_7__2__Impl rule__Template__Group_7__3 )
            // InternalBurst.g:2266:2: rule__Template__Group_7__2__Impl rule__Template__Group_7__3
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
    // InternalBurst.g:2273:1: rule__Template__Group_7__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Template__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2277:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2278:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2278:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2279:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2()); 
            }
            // InternalBurst.g:2280:2: ( RULE_ENDLINE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ENDLINE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBurst.g:2280:3: RULE_ENDLINE
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
    // InternalBurst.g:2288:1: rule__Template__Group_7__3 : rule__Template__Group_7__3__Impl rule__Template__Group_7__4 ;
    public final void rule__Template__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2292:1: ( rule__Template__Group_7__3__Impl rule__Template__Group_7__4 )
            // InternalBurst.g:2293:2: rule__Template__Group_7__3__Impl rule__Template__Group_7__4
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
    // InternalBurst.g:2300:1: rule__Template__Group_7__3__Impl : ( ( rule__Template__Group_7_3__0 )* ) ;
    public final void rule__Template__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2304:1: ( ( ( rule__Template__Group_7_3__0 )* ) )
            // InternalBurst.g:2305:1: ( ( rule__Template__Group_7_3__0 )* )
            {
            // InternalBurst.g:2305:1: ( ( rule__Template__Group_7_3__0 )* )
            // InternalBurst.g:2306:2: ( rule__Template__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getGroup_7_3()); 
            }
            // InternalBurst.g:2307:2: ( rule__Template__Group_7_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=36 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBurst.g:2307:3: rule__Template__Group_7_3__0
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
    // InternalBurst.g:2315:1: rule__Template__Group_7__4 : rule__Template__Group_7__4__Impl ;
    public final void rule__Template__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2319:1: ( rule__Template__Group_7__4__Impl )
            // InternalBurst.g:2320:2: rule__Template__Group_7__4__Impl
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
    // InternalBurst.g:2326:1: rule__Template__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Template__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2330:1: ( ( '}' ) )
            // InternalBurst.g:2331:1: ( '}' )
            {
            // InternalBurst.g:2331:1: ( '}' )
            // InternalBurst.g:2332:2: '}'
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
    // InternalBurst.g:2342:1: rule__Template__Group_7_3__0 : rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 ;
    public final void rule__Template__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2346:1: ( rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1 )
            // InternalBurst.g:2347:2: rule__Template__Group_7_3__0__Impl rule__Template__Group_7_3__1
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
    // InternalBurst.g:2354:1: rule__Template__Group_7_3__0__Impl : ( ( rule__Template__ElementsAssignment_7_3_0 ) ) ;
    public final void rule__Template__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2358:1: ( ( ( rule__Template__ElementsAssignment_7_3_0 ) ) )
            // InternalBurst.g:2359:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            {
            // InternalBurst.g:2359:1: ( ( rule__Template__ElementsAssignment_7_3_0 ) )
            // InternalBurst.g:2360:2: ( rule__Template__ElementsAssignment_7_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getElementsAssignment_7_3_0()); 
            }
            // InternalBurst.g:2361:2: ( rule__Template__ElementsAssignment_7_3_0 )
            // InternalBurst.g:2361:3: rule__Template__ElementsAssignment_7_3_0
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
    // InternalBurst.g:2369:1: rule__Template__Group_7_3__1 : rule__Template__Group_7_3__1__Impl ;
    public final void rule__Template__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2373:1: ( rule__Template__Group_7_3__1__Impl )
            // InternalBurst.g:2374:2: rule__Template__Group_7_3__1__Impl
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
    // InternalBurst.g:2380:1: rule__Template__Group_7_3__1__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Template__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2384:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:2385:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:2385:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2386:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2386:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:2387:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }
            // InternalBurst.g:2388:3: ( RULE_ENDLINE )
            // InternalBurst.g:2388:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }

            }

            // InternalBurst.g:2391:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2392:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1()); 
            }
            // InternalBurst.g:2393:3: ( RULE_ENDLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENDLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBurst.g:2393:4: RULE_ENDLINE
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
    // InternalBurst.g:2403:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2407:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:2408:2: rule__Member__Group__0__Impl rule__Member__Group__1
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
    // InternalBurst.g:2415:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2419:1: ( ( () ) )
            // InternalBurst.g:2420:1: ( () )
            {
            // InternalBurst.g:2420:1: ( () )
            // InternalBurst.g:2421:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            }
            // InternalBurst.g:2422:2: ()
            // InternalBurst.g:2422:3: 
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
    // InternalBurst.g:2430:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2434:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:2435:2: rule__Member__Group__1__Impl rule__Member__Group__2
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
    // InternalBurst.g:2442:1: rule__Member__Group__1__Impl : ( ( rule__Member__ActAsAssignment_1 )? ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2446:1: ( ( ( rule__Member__ActAsAssignment_1 )? ) )
            // InternalBurst.g:2447:1: ( ( rule__Member__ActAsAssignment_1 )? )
            {
            // InternalBurst.g:2447:1: ( ( rule__Member__ActAsAssignment_1 )? )
            // InternalBurst.g:2448:2: ( rule__Member__ActAsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getActAsAssignment_1()); 
            }
            // InternalBurst.g:2449:2: ( rule__Member__ActAsAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBurst.g:2449:3: rule__Member__ActAsAssignment_1
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
    // InternalBurst.g:2457:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2461:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalBurst.g:2462:2: rule__Member__Group__2__Impl rule__Member__Group__3
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
    // InternalBurst.g:2469:1: rule__Member__Group__2__Impl : ( ( rule__Member__IsContentAssignment_2 )? ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2473:1: ( ( ( rule__Member__IsContentAssignment_2 )? ) )
            // InternalBurst.g:2474:1: ( ( rule__Member__IsContentAssignment_2 )? )
            {
            // InternalBurst.g:2474:1: ( ( rule__Member__IsContentAssignment_2 )? )
            // InternalBurst.g:2475:2: ( rule__Member__IsContentAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getIsContentAssignment_2()); 
            }
            // InternalBurst.g:2476:2: ( rule__Member__IsContentAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBurst.g:2476:3: rule__Member__IsContentAssignment_2
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
    // InternalBurst.g:2484:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2488:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalBurst.g:2489:2: rule__Member__Group__3__Impl rule__Member__Group__4
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
    // InternalBurst.g:2496:1: rule__Member__Group__3__Impl : ( ( rule__Member__ConcernAssignment_3 ) ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2500:1: ( ( ( rule__Member__ConcernAssignment_3 ) ) )
            // InternalBurst.g:2501:1: ( ( rule__Member__ConcernAssignment_3 ) )
            {
            // InternalBurst.g:2501:1: ( ( rule__Member__ConcernAssignment_3 ) )
            // InternalBurst.g:2502:2: ( rule__Member__ConcernAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getConcernAssignment_3()); 
            }
            // InternalBurst.g:2503:2: ( rule__Member__ConcernAssignment_3 )
            // InternalBurst.g:2503:3: rule__Member__ConcernAssignment_3
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
    // InternalBurst.g:2511:1: rule__Member__Group__4 : rule__Member__Group__4__Impl ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2515:1: ( rule__Member__Group__4__Impl )
            // InternalBurst.g:2516:2: rule__Member__Group__4__Impl
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
    // InternalBurst.g:2522:1: rule__Member__Group__4__Impl : ( ( rule__Member__NameAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2526:1: ( ( ( rule__Member__NameAssignment_4 ) ) )
            // InternalBurst.g:2527:1: ( ( rule__Member__NameAssignment_4 ) )
            {
            // InternalBurst.g:2527:1: ( ( rule__Member__NameAssignment_4 ) )
            // InternalBurst.g:2528:2: ( rule__Member__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getNameAssignment_4()); 
            }
            // InternalBurst.g:2529:2: ( rule__Member__NameAssignment_4 )
            // InternalBurst.g:2529:3: rule__Member__NameAssignment_4
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
    // InternalBurst.g:2538:1: rule__RuleIntersect__Group__0 : rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 ;
    public final void rule__RuleIntersect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2542:1: ( rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1 )
            // InternalBurst.g:2543:2: rule__RuleIntersect__Group__0__Impl rule__RuleIntersect__Group__1
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
    // InternalBurst.g:2550:1: rule__RuleIntersect__Group__0__Impl : ( () ) ;
    public final void rule__RuleIntersect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2554:1: ( ( () ) )
            // InternalBurst.g:2555:1: ( () )
            {
            // InternalBurst.g:2555:1: ( () )
            // InternalBurst.g:2556:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getIntersectionAction_0()); 
            }
            // InternalBurst.g:2557:2: ()
            // InternalBurst.g:2557:3: 
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
    // InternalBurst.g:2565:1: rule__RuleIntersect__Group__1 : rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 ;
    public final void rule__RuleIntersect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2569:1: ( rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2 )
            // InternalBurst.g:2570:2: rule__RuleIntersect__Group__1__Impl rule__RuleIntersect__Group__2
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
    // InternalBurst.g:2577:1: rule__RuleIntersect__Group__1__Impl : ( ( rule__RuleIntersect__NameAssignment_1 ) ) ;
    public final void rule__RuleIntersect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2581:1: ( ( ( rule__RuleIntersect__NameAssignment_1 ) ) )
            // InternalBurst.g:2582:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            {
            // InternalBurst.g:2582:1: ( ( rule__RuleIntersect__NameAssignment_1 ) )
            // InternalBurst.g:2583:2: ( rule__RuleIntersect__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getNameAssignment_1()); 
            }
            // InternalBurst.g:2584:2: ( rule__RuleIntersect__NameAssignment_1 )
            // InternalBurst.g:2584:3: rule__RuleIntersect__NameAssignment_1
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
    // InternalBurst.g:2592:1: rule__RuleIntersect__Group__2 : rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 ;
    public final void rule__RuleIntersect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2596:1: ( rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3 )
            // InternalBurst.g:2597:2: rule__RuleIntersect__Group__2__Impl rule__RuleIntersect__Group__3
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
    // InternalBurst.g:2604:1: rule__RuleIntersect__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2608:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2609:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2609:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2610:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2()); 
            }
            // InternalBurst.g:2611:2: ( RULE_ENDLINE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ENDLINE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBurst.g:2611:3: RULE_ENDLINE
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
    // InternalBurst.g:2619:1: rule__RuleIntersect__Group__3 : rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 ;
    public final void rule__RuleIntersect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2623:1: ( rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4 )
            // InternalBurst.g:2624:2: rule__RuleIntersect__Group__3__Impl rule__RuleIntersect__Group__4
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
    // InternalBurst.g:2631:1: rule__RuleIntersect__Group__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) ;
    public final void rule__RuleIntersect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2635:1: ( ( ( rule__RuleIntersect__ParamsAssignment_3 ) ) )
            // InternalBurst.g:2636:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            {
            // InternalBurst.g:2636:1: ( ( rule__RuleIntersect__ParamsAssignment_3 ) )
            // InternalBurst.g:2637:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_3()); 
            }
            // InternalBurst.g:2638:2: ( rule__RuleIntersect__ParamsAssignment_3 )
            // InternalBurst.g:2638:3: rule__RuleIntersect__ParamsAssignment_3
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
    // InternalBurst.g:2646:1: rule__RuleIntersect__Group__4 : rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 ;
    public final void rule__RuleIntersect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2650:1: ( rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5 )
            // InternalBurst.g:2651:2: rule__RuleIntersect__Group__4__Impl rule__RuleIntersect__Group__5
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
    // InternalBurst.g:2658:1: rule__RuleIntersect__Group__4__Impl : ( ( rule__RuleIntersect__Group_4__0 )* ) ;
    public final void rule__RuleIntersect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2662:1: ( ( ( rule__RuleIntersect__Group_4__0 )* ) )
            // InternalBurst.g:2663:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            {
            // InternalBurst.g:2663:1: ( ( rule__RuleIntersect__Group_4__0 )* )
            // InternalBurst.g:2664:2: ( rule__RuleIntersect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getGroup_4()); 
            }
            // InternalBurst.g:2665:2: ( rule__RuleIntersect__Group_4__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ENDLINE||(LA35_0>=12 && LA35_0<=13)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBurst.g:2665:3: rule__RuleIntersect__Group_4__0
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
    // InternalBurst.g:2673:1: rule__RuleIntersect__Group__5 : rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 ;
    public final void rule__RuleIntersect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2677:1: ( rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6 )
            // InternalBurst.g:2678:2: rule__RuleIntersect__Group__5__Impl rule__RuleIntersect__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__RuleIntersect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__6();

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
    // InternalBurst.g:2685:1: rule__RuleIntersect__Group__5__Impl : ( ( rule__RuleIntersect__Group_5__0 )? ) ;
    public final void rule__RuleIntersect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2689:1: ( ( ( rule__RuleIntersect__Group_5__0 )? ) )
            // InternalBurst.g:2690:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            {
            // InternalBurst.g:2690:1: ( ( rule__RuleIntersect__Group_5__0 )? )
            // InternalBurst.g:2691:2: ( rule__RuleIntersect__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getGroup_5()); 
            }
            // InternalBurst.g:2692:2: ( rule__RuleIntersect__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBurst.g:2692:3: rule__RuleIntersect__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleIntersect__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getGroup_5()); 
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


    // $ANTLR start "rule__RuleIntersect__Group__6"
    // InternalBurst.g:2700:1: rule__RuleIntersect__Group__6 : rule__RuleIntersect__Group__6__Impl ;
    public final void rule__RuleIntersect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2704:1: ( rule__RuleIntersect__Group__6__Impl )
            // InternalBurst.g:2705:2: rule__RuleIntersect__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group__6__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group__6"


    // $ANTLR start "rule__RuleIntersect__Group__6__Impl"
    // InternalBurst.g:2711:1: rule__RuleIntersect__Group__6__Impl : ( ( rule__RuleIntersect__BlockAssignment_6 ) ) ;
    public final void rule__RuleIntersect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2715:1: ( ( ( rule__RuleIntersect__BlockAssignment_6 ) ) )
            // InternalBurst.g:2716:1: ( ( rule__RuleIntersect__BlockAssignment_6 ) )
            {
            // InternalBurst.g:2716:1: ( ( rule__RuleIntersect__BlockAssignment_6 ) )
            // InternalBurst.g:2717:2: ( rule__RuleIntersect__BlockAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getBlockAssignment_6()); 
            }
            // InternalBurst.g:2718:2: ( rule__RuleIntersect__BlockAssignment_6 )
            // InternalBurst.g:2718:3: rule__RuleIntersect__BlockAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__BlockAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getBlockAssignment_6()); 
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
    // $ANTLR end "rule__RuleIntersect__Group__6__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_4__0"
    // InternalBurst.g:2727:1: rule__RuleIntersect__Group_4__0 : rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 ;
    public final void rule__RuleIntersect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2731:1: ( rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1 )
            // InternalBurst.g:2732:2: rule__RuleIntersect__Group_4__0__Impl rule__RuleIntersect__Group_4__1
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
    // InternalBurst.g:2739:1: rule__RuleIntersect__Group_4__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2743:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2744:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2744:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2745:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0()); 
            }
            // InternalBurst.g:2746:2: ( RULE_ENDLINE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ENDLINE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBurst.g:2746:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalBurst.g:2754:1: rule__RuleIntersect__Group_4__1 : rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 ;
    public final void rule__RuleIntersect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2758:1: ( rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2 )
            // InternalBurst.g:2759:2: rule__RuleIntersect__Group_4__1__Impl rule__RuleIntersect__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2766:1: rule__RuleIntersect__Group_4__1__Impl : ( ( rule__RuleIntersect__Alternatives_4_1 ) ) ;
    public final void rule__RuleIntersect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2770:1: ( ( ( rule__RuleIntersect__Alternatives_4_1 ) ) )
            // InternalBurst.g:2771:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            {
            // InternalBurst.g:2771:1: ( ( rule__RuleIntersect__Alternatives_4_1 ) )
            // InternalBurst.g:2772:2: ( rule__RuleIntersect__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getAlternatives_4_1()); 
            }
            // InternalBurst.g:2773:2: ( rule__RuleIntersect__Alternatives_4_1 )
            // InternalBurst.g:2773:3: rule__RuleIntersect__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Alternatives_4_1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalBurst.g:2781:1: rule__RuleIntersect__Group_4__2 : rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 ;
    public final void rule__RuleIntersect__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2785:1: ( rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3 )
            // InternalBurst.g:2786:2: rule__RuleIntersect__Group_4__2__Impl rule__RuleIntersect__Group_4__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBurst.g:2793:1: rule__RuleIntersect__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2797:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2798:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2798:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2799:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2()); 
            }
            // InternalBurst.g:2800:2: ( RULE_ENDLINE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ENDLINE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBurst.g:2800:3: RULE_ENDLINE
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
    // InternalBurst.g:2808:1: rule__RuleIntersect__Group_4__3 : rule__RuleIntersect__Group_4__3__Impl ;
    public final void rule__RuleIntersect__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2812:1: ( rule__RuleIntersect__Group_4__3__Impl )
            // InternalBurst.g:2813:2: rule__RuleIntersect__Group_4__3__Impl
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
    // InternalBurst.g:2819:1: rule__RuleIntersect__Group_4__3__Impl : ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) ;
    public final void rule__RuleIntersect__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2823:1: ( ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) ) )
            // InternalBurst.g:2824:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            {
            // InternalBurst.g:2824:1: ( ( rule__RuleIntersect__ParamsAssignment_4_3 ) )
            // InternalBurst.g:2825:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getParamsAssignment_4_3()); 
            }
            // InternalBurst.g:2826:2: ( rule__RuleIntersect__ParamsAssignment_4_3 )
            // InternalBurst.g:2826:3: rule__RuleIntersect__ParamsAssignment_4_3
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


    // $ANTLR start "rule__RuleIntersect__Group_5__0"
    // InternalBurst.g:2835:1: rule__RuleIntersect__Group_5__0 : rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 ;
    public final void rule__RuleIntersect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2839:1: ( rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1 )
            // InternalBurst.g:2840:2: rule__RuleIntersect__Group_5__0__Impl rule__RuleIntersect__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__1();

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
    // $ANTLR end "rule__RuleIntersect__Group_5__0"


    // $ANTLR start "rule__RuleIntersect__Group_5__0__Impl"
    // InternalBurst.g:2847:1: rule__RuleIntersect__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__RuleIntersect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2851:1: ( ( 'with' ) )
            // InternalBurst.g:2852:1: ( 'with' )
            {
            // InternalBurst.g:2852:1: ( 'with' )
            // InternalBurst.g:2853:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__1"
    // InternalBurst.g:2862:1: rule__RuleIntersect__Group_5__1 : rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 ;
    public final void rule__RuleIntersect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2866:1: ( rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2 )
            // InternalBurst.g:2867:2: rule__RuleIntersect__Group_5__1__Impl rule__RuleIntersect__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__2();

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
    // $ANTLR end "rule__RuleIntersect__Group_5__1"


    // $ANTLR start "rule__RuleIntersect__Group_5__1__Impl"
    // InternalBurst.g:2874:1: rule__RuleIntersect__Group_5__1__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2878:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2879:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2879:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2880:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1()); 
            }
            // InternalBurst.g:2881:2: ( RULE_ENDLINE )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ENDLINE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBurst.g:2881:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__2"
    // InternalBurst.g:2889:1: rule__RuleIntersect__Group_5__2 : rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 ;
    public final void rule__RuleIntersect__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2893:1: ( rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3 )
            // InternalBurst.g:2894:2: rule__RuleIntersect__Group_5__2__Impl rule__RuleIntersect__Group_5__3
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__3();

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
    // $ANTLR end "rule__RuleIntersect__Group_5__2"


    // $ANTLR start "rule__RuleIntersect__Group_5__2__Impl"
    // InternalBurst.g:2901:1: rule__RuleIntersect__Group_5__2__Impl : ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) ) ;
    public final void rule__RuleIntersect__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2905:1: ( ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) ) )
            // InternalBurst.g:2906:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) )
            {
            // InternalBurst.g:2906:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_2 ) )
            // InternalBurst.g:2907:2: ( rule__RuleIntersect__WithParamsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_2()); 
            }
            // InternalBurst.g:2908:2: ( rule__RuleIntersect__WithParamsAssignment_5_2 )
            // InternalBurst.g:2908:3: rule__RuleIntersect__WithParamsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__WithParamsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_2()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5__3"
    // InternalBurst.g:2916:1: rule__RuleIntersect__Group_5__3 : rule__RuleIntersect__Group_5__3__Impl ;
    public final void rule__RuleIntersect__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2920:1: ( rule__RuleIntersect__Group_5__3__Impl )
            // InternalBurst.g:2921:2: rule__RuleIntersect__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5__3__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group_5__3"


    // $ANTLR start "rule__RuleIntersect__Group_5__3__Impl"
    // InternalBurst.g:2927:1: rule__RuleIntersect__Group_5__3__Impl : ( ( rule__RuleIntersect__Group_5_3__0 )* ) ;
    public final void rule__RuleIntersect__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2931:1: ( ( ( rule__RuleIntersect__Group_5_3__0 )* ) )
            // InternalBurst.g:2932:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            {
            // InternalBurst.g:2932:1: ( ( rule__RuleIntersect__Group_5_3__0 )* )
            // InternalBurst.g:2933:2: ( rule__RuleIntersect__Group_5_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getGroup_5_3()); 
            }
            // InternalBurst.g:2934:2: ( rule__RuleIntersect__Group_5_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ENDLINE||(LA40_0>=12 && LA40_0<=13)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBurst.g:2934:3: rule__RuleIntersect__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RuleIntersect__Group_5_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getGroup_5_3()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5__3__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__0"
    // InternalBurst.g:2943:1: rule__RuleIntersect__Group_5_3__0 : rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 ;
    public final void rule__RuleIntersect__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2947:1: ( rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1 )
            // InternalBurst.g:2948:2: rule__RuleIntersect__Group_5_3__0__Impl rule__RuleIntersect__Group_5_3__1
            {
            pushFollow(FOLLOW_27);
            rule__RuleIntersect__Group_5_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__1();

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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__0"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__0__Impl"
    // InternalBurst.g:2955:1: rule__RuleIntersect__Group_5_3__0__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2959:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:2960:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:2960:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:2961:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0()); 
            }
            // InternalBurst.g:2962:2: ( RULE_ENDLINE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ENDLINE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBurst.g:2962:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__0__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__1"
    // InternalBurst.g:2970:1: rule__RuleIntersect__Group_5_3__1 : rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 ;
    public final void rule__RuleIntersect__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2974:1: ( rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2 )
            // InternalBurst.g:2975:2: rule__RuleIntersect__Group_5_3__1__Impl rule__RuleIntersect__Group_5_3__2
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__2();

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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__1"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__1__Impl"
    // InternalBurst.g:2982:1: rule__RuleIntersect__Group_5_3__1__Impl : ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:2986:1: ( ( ( rule__RuleIntersect__Alternatives_5_3_1 ) ) )
            // InternalBurst.g:2987:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            {
            // InternalBurst.g:2987:1: ( ( rule__RuleIntersect__Alternatives_5_3_1 ) )
            // InternalBurst.g:2988:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1()); 
            }
            // InternalBurst.g:2989:2: ( rule__RuleIntersect__Alternatives_5_3_1 )
            // InternalBurst.g:2989:3: rule__RuleIntersect__Alternatives_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Alternatives_5_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getAlternatives_5_3_1()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__1__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__2"
    // InternalBurst.g:2997:1: rule__RuleIntersect__Group_5_3__2 : rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 ;
    public final void rule__RuleIntersect__Group_5_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3001:1: ( rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3 )
            // InternalBurst.g:3002:2: rule__RuleIntersect__Group_5_3__2__Impl rule__RuleIntersect__Group_5_3__3
            {
            pushFollow(FOLLOW_24);
            rule__RuleIntersect__Group_5_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__3();

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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__2"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__2__Impl"
    // InternalBurst.g:3009:1: rule__RuleIntersect__Group_5_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__RuleIntersect__Group_5_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3013:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3014:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3014:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3015:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2()); 
            }
            // InternalBurst.g:3016:2: ( RULE_ENDLINE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ENDLINE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBurst.g:3016:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__2__Impl"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__3"
    // InternalBurst.g:3024:1: rule__RuleIntersect__Group_5_3__3 : rule__RuleIntersect__Group_5_3__3__Impl ;
    public final void rule__RuleIntersect__Group_5_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3028:1: ( rule__RuleIntersect__Group_5_3__3__Impl )
            // InternalBurst.g:3029:2: rule__RuleIntersect__Group_5_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__Group_5_3__3__Impl();

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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__3"


    // $ANTLR start "rule__RuleIntersect__Group_5_3__3__Impl"
    // InternalBurst.g:3035:1: rule__RuleIntersect__Group_5_3__3__Impl : ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) ) ;
    public final void rule__RuleIntersect__Group_5_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3039:1: ( ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) ) )
            // InternalBurst.g:3040:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) )
            {
            // InternalBurst.g:3040:1: ( ( rule__RuleIntersect__WithParamsAssignment_5_3_3 ) )
            // InternalBurst.g:3041:2: ( rule__RuleIntersect__WithParamsAssignment_5_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_3_3()); 
            }
            // InternalBurst.g:3042:2: ( rule__RuleIntersect__WithParamsAssignment_5_3_3 )
            // InternalBurst.g:3042:3: rule__RuleIntersect__WithParamsAssignment_5_3_3
            {
            pushFollow(FOLLOW_2);
            rule__RuleIntersect__WithParamsAssignment_5_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getWithParamsAssignment_5_3_3()); 
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
    // $ANTLR end "rule__RuleIntersect__Group_5_3__3__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalBurst.g:3051:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3055:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalBurst.g:3056:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalBurst.g:3063:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3067:1: ( ( () ) )
            // InternalBurst.g:3068:1: ( () )
            {
            // InternalBurst.g:3068:1: ( () )
            // InternalBurst.g:3069:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalBurst.g:3070:2: ()
            // InternalBurst.g:3070:3: 
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
    // InternalBurst.g:3078:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3082:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalBurst.g:3083:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalBurst.g:3090:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3094:1: ( ( '{' ) )
            // InternalBurst.g:3095:1: ( '{' )
            {
            // InternalBurst.g:3095:1: ( '{' )
            // InternalBurst.g:3096:2: '{'
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
    // InternalBurst.g:3105:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3109:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalBurst.g:3110:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalBurst.g:3117:1: rule__Block__Group__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3121:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3122:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3122:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3123:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_2()); 
            }
            // InternalBurst.g:3124:2: ( RULE_ENDLINE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ENDLINE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBurst.g:3124:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalBurst.g:3132:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3136:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalBurst.g:3137:2: rule__Block__Group__3__Impl rule__Block__Group__4
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
    // InternalBurst.g:3144:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3148:1: ( ( ( rule__Block__Group_3__0 )? ) )
            // InternalBurst.g:3149:1: ( ( rule__Block__Group_3__0 )? )
            {
            // InternalBurst.g:3149:1: ( ( rule__Block__Group_3__0 )? )
            // InternalBurst.g:3150:2: ( rule__Block__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup_3()); 
            }
            // InternalBurst.g:3151:2: ( rule__Block__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_INT && LA44_0<=RULE_STRING)||(LA44_0>=14 && LA44_0<=17)||LA44_0==21||(LA44_0>=28 && LA44_0<=29)||LA44_0==31||LA44_0==34||(LA44_0>=40 && LA44_0<=41)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBurst.g:3151:3: rule__Block__Group_3__0
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
    // InternalBurst.g:3159:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3163:1: ( rule__Block__Group__4__Impl )
            // InternalBurst.g:3164:2: rule__Block__Group__4__Impl
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
    // InternalBurst.g:3170:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3174:1: ( ( '}' ) )
            // InternalBurst.g:3175:1: ( '}' )
            {
            // InternalBurst.g:3175:1: ( '}' )
            // InternalBurst.g:3176:2: '}'
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
    // InternalBurst.g:3186:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3190:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalBurst.g:3191:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
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
    // InternalBurst.g:3198:1: rule__Block__Group_3__0__Impl : ( ( rule__Block__LinesAssignment_3_0 ) ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3202:1: ( ( ( rule__Block__LinesAssignment_3_0 ) ) )
            // InternalBurst.g:3203:1: ( ( rule__Block__LinesAssignment_3_0 ) )
            {
            // InternalBurst.g:3203:1: ( ( rule__Block__LinesAssignment_3_0 ) )
            // InternalBurst.g:3204:2: ( rule__Block__LinesAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesAssignment_3_0()); 
            }
            // InternalBurst.g:3205:2: ( rule__Block__LinesAssignment_3_0 )
            // InternalBurst.g:3205:3: rule__Block__LinesAssignment_3_0
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
    // InternalBurst.g:3213:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl rule__Block__Group_3__2 ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3217:1: ( rule__Block__Group_3__1__Impl rule__Block__Group_3__2 )
            // InternalBurst.g:3218:2: rule__Block__Group_3__1__Impl rule__Block__Group_3__2
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
    // InternalBurst.g:3225:1: rule__Block__Group_3__1__Impl : ( ( rule__Block__Group_3_1__0 )* ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3229:1: ( ( ( rule__Block__Group_3_1__0 )* ) )
            // InternalBurst.g:3230:1: ( ( rule__Block__Group_3_1__0 )* )
            {
            // InternalBurst.g:3230:1: ( ( rule__Block__Group_3_1__0 )* )
            // InternalBurst.g:3231:2: ( rule__Block__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup_3_1()); 
            }
            // InternalBurst.g:3232:2: ( rule__Block__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalBurst.g:3232:3: rule__Block__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Block__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalBurst.g:3240:1: rule__Block__Group_3__2 : rule__Block__Group_3__2__Impl ;
    public final void rule__Block__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3244:1: ( rule__Block__Group_3__2__Impl )
            // InternalBurst.g:3245:2: rule__Block__Group_3__2__Impl
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
    // InternalBurst.g:3251:1: rule__Block__Group_3__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__Block__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3255:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3256:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3256:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3257:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_2()); 
            }
            // InternalBurst.g:3258:2: ( RULE_ENDLINE )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ENDLINE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalBurst.g:3258:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalBurst.g:3267:1: rule__Block__Group_3_1__0 : rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1 ;
    public final void rule__Block__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3271:1: ( rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1 )
            // InternalBurst.g:3272:2: rule__Block__Group_3_1__0__Impl rule__Block__Group_3_1__1
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
    // InternalBurst.g:3279:1: rule__Block__Group_3_1__0__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__Block__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3283:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:3284:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:3284:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3285:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3285:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:3286:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3287:3: ( RULE_ENDLINE )
            // InternalBurst.g:3287:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

            }

            // InternalBurst.g:3290:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3291:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3292:3: ( RULE_ENDLINE )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ENDLINE) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:3292:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalBurst.g:3301:1: rule__Block__Group_3_1__1 : rule__Block__Group_3_1__1__Impl ;
    public final void rule__Block__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3305:1: ( rule__Block__Group_3_1__1__Impl )
            // InternalBurst.g:3306:2: rule__Block__Group_3_1__1__Impl
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
    // InternalBurst.g:3312:1: rule__Block__Group_3_1__1__Impl : ( ( rule__Block__LinesAssignment_3_1_1 ) ) ;
    public final void rule__Block__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3316:1: ( ( ( rule__Block__LinesAssignment_3_1_1 ) ) )
            // InternalBurst.g:3317:1: ( ( rule__Block__LinesAssignment_3_1_1 ) )
            {
            // InternalBurst.g:3317:1: ( ( rule__Block__LinesAssignment_3_1_1 ) )
            // InternalBurst.g:3318:2: ( rule__Block__LinesAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLinesAssignment_3_1_1()); 
            }
            // InternalBurst.g:3319:2: ( rule__Block__LinesAssignment_3_1_1 )
            // InternalBurst.g:3319:3: rule__Block__LinesAssignment_3_1_1
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
    // InternalBurst.g:3328:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3332:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalBurst.g:3333:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalBurst.g:3340:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3344:1: ( ( () ) )
            // InternalBurst.g:3345:1: ( () )
            {
            // InternalBurst.g:3345:1: ( () )
            // InternalBurst.g:3346:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            }
            // InternalBurst.g:3347:2: ()
            // InternalBurst.g:3347:3: 
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
    // InternalBurst.g:3355:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3359:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalBurst.g:3360:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // InternalBurst.g:3367:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3371:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // InternalBurst.g:3372:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // InternalBurst.g:3372:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // InternalBurst.g:3373:2: ( rule__Parameter__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            }
            // InternalBurst.g:3374:2: ( rule__Parameter__TypeAssignment_1 )
            // InternalBurst.g:3374:3: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
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


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalBurst.g:3382:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3386:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalBurst.g:3387:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalBurst.g:3394:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3398:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalBurst.g:3399:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalBurst.g:3399:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalBurst.g:3400:2: ( rule__Parameter__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            }
            // InternalBurst.g:3401:2: ( rule__Parameter__NameAssignment_2 )
            // InternalBurst.g:3401:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalBurst.g:3409:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3413:1: ( rule__Parameter__Group__3__Impl )
            // InternalBurst.g:3414:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalBurst.g:3420:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3424:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // InternalBurst.g:3425:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // InternalBurst.g:3425:1: ( ( rule__Parameter__Group_3__0 )? )
            // InternalBurst.g:3426:2: ( rule__Parameter__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_3()); 
            }
            // InternalBurst.g:3427:2: ( rule__Parameter__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBurst.g:3427:3: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // InternalBurst.g:3436:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3440:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // InternalBurst.g:3441:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1();

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
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // InternalBurst.g:3448:1: rule__Parameter__Group_3__0__Impl : ( ( rule__Parameter__UsageAssignment_3_0 ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3452:1: ( ( ( rule__Parameter__UsageAssignment_3_0 ) ) )
            // InternalBurst.g:3453:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            {
            // InternalBurst.g:3453:1: ( ( rule__Parameter__UsageAssignment_3_0 ) )
            // InternalBurst.g:3454:2: ( rule__Parameter__UsageAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getUsageAssignment_3_0()); 
            }
            // InternalBurst.g:3455:2: ( rule__Parameter__UsageAssignment_3_0 )
            // InternalBurst.g:3455:3: rule__Parameter__UsageAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UsageAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getUsageAssignment_3_0()); 
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
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // InternalBurst.g:3463:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3467:1: ( rule__Parameter__Group_3__1__Impl )
            // InternalBurst.g:3468:2: rule__Parameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // InternalBurst.g:3474:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__RoleAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3478:1: ( ( ( rule__Parameter__RoleAssignment_3_1 ) ) )
            // InternalBurst.g:3479:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            {
            // InternalBurst.g:3479:1: ( ( rule__Parameter__RoleAssignment_3_1 ) )
            // InternalBurst.g:3480:2: ( rule__Parameter__RoleAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleAssignment_3_1()); 
            }
            // InternalBurst.g:3481:2: ( rule__Parameter__RoleAssignment_3_1 )
            // InternalBurst.g:3481:3: rule__Parameter__RoleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__RoleAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleAssignment_3_1()); 
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
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__WithParameter__Group__0"
    // InternalBurst.g:3490:1: rule__WithParameter__Group__0 : rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 ;
    public final void rule__WithParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3494:1: ( rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1 )
            // InternalBurst.g:3495:2: rule__WithParameter__Group__0__Impl rule__WithParameter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__WithParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__1();

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
    // $ANTLR end "rule__WithParameter__Group__0"


    // $ANTLR start "rule__WithParameter__Group__0__Impl"
    // InternalBurst.g:3502:1: rule__WithParameter__Group__0__Impl : ( () ) ;
    public final void rule__WithParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3506:1: ( ( () ) )
            // InternalBurst.g:3507:1: ( () )
            {
            // InternalBurst.g:3507:1: ( () )
            // InternalBurst.g:3508:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getWithParameterAction_0()); 
            }
            // InternalBurst.g:3509:2: ()
            // InternalBurst.g:3509:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getWithParameterAction_0()); 
            }

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
    // InternalBurst.g:3517:1: rule__WithParameter__Group__1 : rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 ;
    public final void rule__WithParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3521:1: ( rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2 )
            // InternalBurst.g:3522:2: rule__WithParameter__Group__1__Impl rule__WithParameter__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__WithParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__2();

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
    // $ANTLR end "rule__WithParameter__Group__1"


    // $ANTLR start "rule__WithParameter__Group__1__Impl"
    // InternalBurst.g:3529:1: rule__WithParameter__Group__1__Impl : ( ( rule__WithParameter__NameAssignment_1 ) ) ;
    public final void rule__WithParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3533:1: ( ( ( rule__WithParameter__NameAssignment_1 ) ) )
            // InternalBurst.g:3534:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            {
            // InternalBurst.g:3534:1: ( ( rule__WithParameter__NameAssignment_1 ) )
            // InternalBurst.g:3535:2: ( rule__WithParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getNameAssignment_1()); 
            }
            // InternalBurst.g:3536:2: ( rule__WithParameter__NameAssignment_1 )
            // InternalBurst.g:3536:3: rule__WithParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__WithParameter__Group__1__Impl"


    // $ANTLR start "rule__WithParameter__Group__2"
    // InternalBurst.g:3544:1: rule__WithParameter__Group__2 : rule__WithParameter__Group__2__Impl ;
    public final void rule__WithParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3548:1: ( rule__WithParameter__Group__2__Impl )
            // InternalBurst.g:3549:2: rule__WithParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group__2__Impl();

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
    // $ANTLR end "rule__WithParameter__Group__2"


    // $ANTLR start "rule__WithParameter__Group__2__Impl"
    // InternalBurst.g:3555:1: rule__WithParameter__Group__2__Impl : ( ( rule__WithParameter__Group_2__0 )? ) ;
    public final void rule__WithParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3559:1: ( ( ( rule__WithParameter__Group_2__0 )? ) )
            // InternalBurst.g:3560:1: ( ( rule__WithParameter__Group_2__0 )? )
            {
            // InternalBurst.g:3560:1: ( ( rule__WithParameter__Group_2__0 )? )
            // InternalBurst.g:3561:2: ( rule__WithParameter__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getGroup_2()); 
            }
            // InternalBurst.g:3562:2: ( rule__WithParameter__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBurst.g:3562:3: rule__WithParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WithParameter__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getGroup_2()); 
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
    // $ANTLR end "rule__WithParameter__Group__2__Impl"


    // $ANTLR start "rule__WithParameter__Group_2__0"
    // InternalBurst.g:3571:1: rule__WithParameter__Group_2__0 : rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 ;
    public final void rule__WithParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3575:1: ( rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1 )
            // InternalBurst.g:3576:2: rule__WithParameter__Group_2__0__Impl rule__WithParameter__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__WithParameter__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group_2__1();

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
    // $ANTLR end "rule__WithParameter__Group_2__0"


    // $ANTLR start "rule__WithParameter__Group_2__0__Impl"
    // InternalBurst.g:3583:1: rule__WithParameter__Group_2__0__Impl : ( ( rule__WithParameter__UsageAssignment_2_0 ) ) ;
    public final void rule__WithParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3587:1: ( ( ( rule__WithParameter__UsageAssignment_2_0 ) ) )
            // InternalBurst.g:3588:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            {
            // InternalBurst.g:3588:1: ( ( rule__WithParameter__UsageAssignment_2_0 ) )
            // InternalBurst.g:3589:2: ( rule__WithParameter__UsageAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0()); 
            }
            // InternalBurst.g:3590:2: ( rule__WithParameter__UsageAssignment_2_0 )
            // InternalBurst.g:3590:3: rule__WithParameter__UsageAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__UsageAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getUsageAssignment_2_0()); 
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
    // $ANTLR end "rule__WithParameter__Group_2__0__Impl"


    // $ANTLR start "rule__WithParameter__Group_2__1"
    // InternalBurst.g:3598:1: rule__WithParameter__Group_2__1 : rule__WithParameter__Group_2__1__Impl ;
    public final void rule__WithParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3602:1: ( rule__WithParameter__Group_2__1__Impl )
            // InternalBurst.g:3603:2: rule__WithParameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__Group_2__1__Impl();

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
    // $ANTLR end "rule__WithParameter__Group_2__1"


    // $ANTLR start "rule__WithParameter__Group_2__1__Impl"
    // InternalBurst.g:3609:1: rule__WithParameter__Group_2__1__Impl : ( ( rule__WithParameter__RoleAssignment_2_1 ) ) ;
    public final void rule__WithParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3613:1: ( ( ( rule__WithParameter__RoleAssignment_2_1 ) ) )
            // InternalBurst.g:3614:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            {
            // InternalBurst.g:3614:1: ( ( rule__WithParameter__RoleAssignment_2_1 ) )
            // InternalBurst.g:3615:2: ( rule__WithParameter__RoleAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1()); 
            }
            // InternalBurst.g:3616:2: ( rule__WithParameter__RoleAssignment_2_1 )
            // InternalBurst.g:3616:3: rule__WithParameter__RoleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WithParameter__RoleAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getRoleAssignment_2_1()); 
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
    // $ANTLR end "rule__WithParameter__Group_2__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalBurst.g:3625:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3629:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalBurst.g:3630:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
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
    // InternalBurst.g:3637:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3641:1: ( ( () ) )
            // InternalBurst.g:3642:1: ( () )
            {
            // InternalBurst.g:3642:1: ( () )
            // InternalBurst.g:3643:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getStopAction_0()); 
            }
            // InternalBurst.g:3644:2: ()
            // InternalBurst.g:3644:3: 
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
    // InternalBurst.g:3652:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3656:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // InternalBurst.g:3657:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:3664:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3668:1: ( ( 'stop' ) )
            // InternalBurst.g:3669:1: ( 'stop' )
            {
            // InternalBurst.g:3669:1: ( 'stop' )
            // InternalBurst.g:3670:2: 'stop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:3679:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3683:1: ( rule__Stop__Group__2__Impl )
            // InternalBurst.g:3684:2: rule__Stop__Group__2__Impl
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
    // InternalBurst.g:3690:1: rule__Stop__Group__2__Impl : ( ( rule__Stop__ConditionAssignment_2 )? ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3694:1: ( ( ( rule__Stop__ConditionAssignment_2 )? ) )
            // InternalBurst.g:3695:1: ( ( rule__Stop__ConditionAssignment_2 )? )
            {
            // InternalBurst.g:3695:1: ( ( rule__Stop__ConditionAssignment_2 )? )
            // InternalBurst.g:3696:2: ( rule__Stop__ConditionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStopAccess().getConditionAssignment_2()); 
            }
            // InternalBurst.g:3697:2: ( rule__Stop__ConditionAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_INT && LA50_0<=RULE_STRING)||(LA50_0>=14 && LA50_0<=15)||LA50_0==31||LA50_0==34||(LA50_0>=40 && LA50_0<=41)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBurst.g:3697:3: rule__Stop__ConditionAssignment_2
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
    // InternalBurst.g:3706:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3710:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalBurst.g:3711:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalBurst.g:3718:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3722:1: ( ( () ) )
            // InternalBurst.g:3723:1: ( () )
            {
            // InternalBurst.g:3723:1: ( () )
            // InternalBurst.g:3724:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfAction_0()); 
            }
            // InternalBurst.g:3725:2: ()
            // InternalBurst.g:3725:3: 
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
    // InternalBurst.g:3733:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3737:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalBurst.g:3738:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:3745:1: rule__If__Group__1__Impl : ( 'if' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3749:1: ( ( 'if' ) )
            // InternalBurst.g:3750:1: ( 'if' )
            {
            // InternalBurst.g:3750:1: ( 'if' )
            // InternalBurst.g:3751:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:3760:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3764:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalBurst.g:3765:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalBurst.g:3772:1: rule__If__Group__2__Impl : ( ( rule__If__ExpressionAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3776:1: ( ( ( rule__If__ExpressionAssignment_2 ) ) )
            // InternalBurst.g:3777:1: ( ( rule__If__ExpressionAssignment_2 ) )
            {
            // InternalBurst.g:3777:1: ( ( rule__If__ExpressionAssignment_2 ) )
            // InternalBurst.g:3778:2: ( rule__If__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getExpressionAssignment_2()); 
            }
            // InternalBurst.g:3779:2: ( rule__If__ExpressionAssignment_2 )
            // InternalBurst.g:3779:3: rule__If__ExpressionAssignment_2
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
    // InternalBurst.g:3787:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3791:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalBurst.g:3792:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalBurst.g:3799:1: rule__If__Group__3__Impl : ( ( rule__If__Alternatives_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3803:1: ( ( ( rule__If__Alternatives_3 ) ) )
            // InternalBurst.g:3804:1: ( ( rule__If__Alternatives_3 ) )
            {
            // InternalBurst.g:3804:1: ( ( rule__If__Alternatives_3 ) )
            // InternalBurst.g:3805:2: ( rule__If__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAlternatives_3()); 
            }
            // InternalBurst.g:3806:2: ( rule__If__Alternatives_3 )
            // InternalBurst.g:3806:3: rule__If__Alternatives_3
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
    // InternalBurst.g:3814:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3818:1: ( rule__If__Group__4__Impl )
            // InternalBurst.g:3819:2: rule__If__Group__4__Impl
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
    // InternalBurst.g:3825:1: rule__If__Group__4__Impl : ( ( rule__If__Group_4__0 )? ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3829:1: ( ( ( rule__If__Group_4__0 )? ) )
            // InternalBurst.g:3830:1: ( ( rule__If__Group_4__0 )? )
            {
            // InternalBurst.g:3830:1: ( ( rule__If__Group_4__0 )? )
            // InternalBurst.g:3831:2: ( rule__If__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_4()); 
            }
            // InternalBurst.g:3832:2: ( rule__If__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ENDLINE) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred61_InternalBurst()) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==30) ) {
                int LA51_2 = input.LA(2);

                if ( (synpred61_InternalBurst()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalBurst.g:3832:3: rule__If__Group_4__0
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
    // InternalBurst.g:3841:1: rule__If__Group_3_1__0 : rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1 ;
    public final void rule__If__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3845:1: ( rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1 )
            // InternalBurst.g:3846:2: rule__If__Group_3_1__0__Impl rule__If__Group_3_1__1
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
    // InternalBurst.g:3853:1: rule__If__Group_3_1__0__Impl : ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) ;
    public final void rule__If__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3857:1: ( ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) ) )
            // InternalBurst.g:3858:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            {
            // InternalBurst.g:3858:1: ( ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3859:2: ( ( RULE_ENDLINE ) ) ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3859:2: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:3860:3: ( RULE_ENDLINE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3861:3: ( RULE_ENDLINE )
            // InternalBurst.g:3861:4: RULE_ENDLINE
            {
            match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }

            }

            // InternalBurst.g:3864:2: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3865:3: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0()); 
            }
            // InternalBurst.g:3866:3: ( RULE_ENDLINE )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ENDLINE) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBurst.g:3866:4: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalBurst.g:3875:1: rule__If__Group_3_1__1 : rule__If__Group_3_1__1__Impl ;
    public final void rule__If__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3879:1: ( rule__If__Group_3_1__1__Impl )
            // InternalBurst.g:3880:2: rule__If__Group_3_1__1__Impl
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
    // InternalBurst.g:3886:1: rule__If__Group_3_1__1__Impl : ( ( rule__If__ThenBlockAssignment_3_1_1 ) ) ;
    public final void rule__If__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3890:1: ( ( ( rule__If__ThenBlockAssignment_3_1_1 ) ) )
            // InternalBurst.g:3891:1: ( ( rule__If__ThenBlockAssignment_3_1_1 ) )
            {
            // InternalBurst.g:3891:1: ( ( rule__If__ThenBlockAssignment_3_1_1 ) )
            // InternalBurst.g:3892:2: ( rule__If__ThenBlockAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getThenBlockAssignment_3_1_1()); 
            }
            // InternalBurst.g:3893:2: ( rule__If__ThenBlockAssignment_3_1_1 )
            // InternalBurst.g:3893:3: rule__If__ThenBlockAssignment_3_1_1
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
    // InternalBurst.g:3902:1: rule__If__Group_4__0 : rule__If__Group_4__0__Impl rule__If__Group_4__1 ;
    public final void rule__If__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3906:1: ( rule__If__Group_4__0__Impl rule__If__Group_4__1 )
            // InternalBurst.g:3907:2: rule__If__Group_4__0__Impl rule__If__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBurst.g:3914:1: rule__If__Group_4__0__Impl : ( ( rule__If__Group_4_0__0 )* ) ;
    public final void rule__If__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3918:1: ( ( ( rule__If__Group_4_0__0 )* ) )
            // InternalBurst.g:3919:1: ( ( rule__If__Group_4_0__0 )* )
            {
            // InternalBurst.g:3919:1: ( ( rule__If__Group_4_0__0 )* )
            // InternalBurst.g:3920:2: ( rule__If__Group_4_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_4_0()); 
            }
            // InternalBurst.g:3921:2: ( rule__If__Group_4_0__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ENDLINE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBurst.g:3921:3: rule__If__Group_4_0__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__If__Group_4_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalBurst.g:3929:1: rule__If__Group_4__1 : rule__If__Group_4__1__Impl rule__If__Group_4__2 ;
    public final void rule__If__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3933:1: ( rule__If__Group_4__1__Impl rule__If__Group_4__2 )
            // InternalBurst.g:3934:2: rule__If__Group_4__1__Impl rule__If__Group_4__2
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
    // InternalBurst.g:3941:1: rule__If__Group_4__1__Impl : ( 'else' ) ;
    public final void rule__If__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3945:1: ( ( 'else' ) )
            // InternalBurst.g:3946:1: ( 'else' )
            {
            // InternalBurst.g:3946:1: ( 'else' )
            // InternalBurst.g:3947:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseKeyword_4_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:3956:1: rule__If__Group_4__2 : rule__If__Group_4__2__Impl rule__If__Group_4__3 ;
    public final void rule__If__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3960:1: ( rule__If__Group_4__2__Impl rule__If__Group_4__3 )
            // InternalBurst.g:3961:2: rule__If__Group_4__2__Impl rule__If__Group_4__3
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
    // InternalBurst.g:3968:1: rule__If__Group_4__2__Impl : ( ( RULE_ENDLINE )* ) ;
    public final void rule__If__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3972:1: ( ( ( RULE_ENDLINE )* ) )
            // InternalBurst.g:3973:1: ( ( RULE_ENDLINE )* )
            {
            // InternalBurst.g:3973:1: ( ( RULE_ENDLINE )* )
            // InternalBurst.g:3974:2: ( RULE_ENDLINE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_2()); 
            }
            // InternalBurst.g:3975:2: ( RULE_ENDLINE )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ENDLINE) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalBurst.g:3975:3: RULE_ENDLINE
            	    {
            	    match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalBurst.g:3983:1: rule__If__Group_4__3 : rule__If__Group_4__3__Impl ;
    public final void rule__If__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3987:1: ( rule__If__Group_4__3__Impl )
            // InternalBurst.g:3988:2: rule__If__Group_4__3__Impl
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
    // InternalBurst.g:3994:1: rule__If__Group_4__3__Impl : ( ( rule__If__ElseBlockAssignment_4_3 ) ) ;
    public final void rule__If__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:3998:1: ( ( ( rule__If__ElseBlockAssignment_4_3 ) ) )
            // InternalBurst.g:3999:1: ( ( rule__If__ElseBlockAssignment_4_3 ) )
            {
            // InternalBurst.g:3999:1: ( ( rule__If__ElseBlockAssignment_4_3 ) )
            // InternalBurst.g:4000:2: ( rule__If__ElseBlockAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getElseBlockAssignment_4_3()); 
            }
            // InternalBurst.g:4001:2: ( rule__If__ElseBlockAssignment_4_3 )
            // InternalBurst.g:4001:3: rule__If__ElseBlockAssignment_4_3
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
    // InternalBurst.g:4010:1: rule__If__Group_4_0__0 : rule__If__Group_4_0__0__Impl ;
    public final void rule__If__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4014:1: ( rule__If__Group_4_0__0__Impl )
            // InternalBurst.g:4015:2: rule__If__Group_4_0__0__Impl
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
    // InternalBurst.g:4021:1: rule__If__Group_4_0__0__Impl : ( RULE_ENDLINE ) ;
    public final void rule__If__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4025:1: ( ( RULE_ENDLINE ) )
            // InternalBurst.g:4026:1: ( RULE_ENDLINE )
            {
            // InternalBurst.g:4026:1: ( RULE_ENDLINE )
            // InternalBurst.g:4027:2: RULE_ENDLINE
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
    // InternalBurst.g:4037:1: rule__ContextManagement__Group__0 : rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 ;
    public final void rule__ContextManagement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4041:1: ( rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1 )
            // InternalBurst.g:4042:2: rule__ContextManagement__Group__0__Impl rule__ContextManagement__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBurst.g:4049:1: rule__ContextManagement__Group__0__Impl : ( () ) ;
    public final void rule__ContextManagement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4053:1: ( ( () ) )
            // InternalBurst.g:4054:1: ( () )
            {
            // InternalBurst.g:4054:1: ( () )
            // InternalBurst.g:4055:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getContextManagementAction_0()); 
            }
            // InternalBurst.g:4056:2: ()
            // InternalBurst.g:4056:3: 
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
    // InternalBurst.g:4064:1: rule__ContextManagement__Group__1 : rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 ;
    public final void rule__ContextManagement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4068:1: ( rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2 )
            // InternalBurst.g:4069:2: rule__ContextManagement__Group__1__Impl rule__ContextManagement__Group__2
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
    // InternalBurst.g:4076:1: rule__ContextManagement__Group__1__Impl : ( ( rule__ContextManagement__ActionAssignment_1 ) ) ;
    public final void rule__ContextManagement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4080:1: ( ( ( rule__ContextManagement__ActionAssignment_1 ) ) )
            // InternalBurst.g:4081:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            {
            // InternalBurst.g:4081:1: ( ( rule__ContextManagement__ActionAssignment_1 ) )
            // InternalBurst.g:4082:2: ( rule__ContextManagement__ActionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getActionAssignment_1()); 
            }
            // InternalBurst.g:4083:2: ( rule__ContextManagement__ActionAssignment_1 )
            // InternalBurst.g:4083:3: rule__ContextManagement__ActionAssignment_1
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
    // InternalBurst.g:4091:1: rule__ContextManagement__Group__2 : rule__ContextManagement__Group__2__Impl ;
    public final void rule__ContextManagement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4095:1: ( rule__ContextManagement__Group__2__Impl )
            // InternalBurst.g:4096:2: rule__ContextManagement__Group__2__Impl
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
    // InternalBurst.g:4102:1: rule__ContextManagement__Group__2__Impl : ( ( rule__ContextManagement__TargetAssignment_2 ) ) ;
    public final void rule__ContextManagement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4106:1: ( ( ( rule__ContextManagement__TargetAssignment_2 ) ) )
            // InternalBurst.g:4107:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            {
            // InternalBurst.g:4107:1: ( ( rule__ContextManagement__TargetAssignment_2 ) )
            // InternalBurst.g:4108:2: ( rule__ContextManagement__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContextManagementAccess().getTargetAssignment_2()); 
            }
            // InternalBurst.g:4109:2: ( rule__ContextManagement__TargetAssignment_2 )
            // InternalBurst.g:4109:3: rule__ContextManagement__TargetAssignment_2
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
    // InternalBurst.g:4118:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4122:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalBurst.g:4123:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:4130:1: rule__Call__Group__0__Impl : ( () ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4134:1: ( ( () ) )
            // InternalBurst.g:4135:1: ( () )
            {
            // InternalBurst.g:4135:1: ( () )
            // InternalBurst.g:4136:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getCallAction_0()); 
            }
            // InternalBurst.g:4137:2: ()
            // InternalBurst.g:4137:3: 
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
    // InternalBurst.g:4145:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4149:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalBurst.g:4150:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBurst.g:4157:1: rule__Call__Group__1__Impl : ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4161:1: ( ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) ) )
            // InternalBurst.g:4162:1: ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) )
            {
            // InternalBurst.g:4162:1: ( ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* ) )
            // InternalBurst.g:4163:2: ( ( rule__Call__ContentAssignment_1 ) ) ( ( rule__Call__ContentAssignment_1 )* )
            {
            // InternalBurst.g:4163:2: ( ( rule__Call__ContentAssignment_1 ) )
            // InternalBurst.g:4164:3: ( rule__Call__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }
            // InternalBurst.g:4165:3: ( rule__Call__ContentAssignment_1 )
            // InternalBurst.g:4165:4: rule__Call__ContentAssignment_1
            {
            pushFollow(FOLLOW_36);
            rule__Call__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }

            }

            // InternalBurst.g:4168:2: ( ( rule__Call__ContentAssignment_1 )* )
            // InternalBurst.g:4169:3: ( rule__Call__ContentAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getContentAssignment_1()); 
            }
            // InternalBurst.g:4170:3: ( rule__Call__ContentAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_INT && LA55_0<=RULE_STRING)||(LA55_0>=14 && LA55_0<=15)||LA55_0==31||LA55_0==34||(LA55_0>=40 && LA55_0<=41)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalBurst.g:4170:4: rule__Call__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Call__ContentAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalBurst.g:4179:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4183:1: ( rule__Call__Group__2__Impl )
            // InternalBurst.g:4184:2: rule__Call__Group__2__Impl
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
    // InternalBurst.g:4190:1: rule__Call__Group__2__Impl : ( ( rule__Call__Group_2__0 )? ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4194:1: ( ( ( rule__Call__Group_2__0 )? ) )
            // InternalBurst.g:4195:1: ( ( rule__Call__Group_2__0 )? )
            {
            // InternalBurst.g:4195:1: ( ( rule__Call__Group_2__0 )? )
            // InternalBurst.g:4196:2: ( rule__Call__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup_2()); 
            }
            // InternalBurst.g:4197:2: ( rule__Call__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBurst.g:4197:3: rule__Call__Group_2__0
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
    // InternalBurst.g:4206:1: rule__Call__Group_2__0 : rule__Call__Group_2__0__Impl rule__Call__Group_2__1 ;
    public final void rule__Call__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4210:1: ( rule__Call__Group_2__0__Impl rule__Call__Group_2__1 )
            // InternalBurst.g:4211:2: rule__Call__Group_2__0__Impl rule__Call__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:4218:1: rule__Call__Group_2__0__Impl : ( ( rule__Call__EqualityAssignment_2_0 ) ) ;
    public final void rule__Call__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4222:1: ( ( ( rule__Call__EqualityAssignment_2_0 ) ) )
            // InternalBurst.g:4223:1: ( ( rule__Call__EqualityAssignment_2_0 ) )
            {
            // InternalBurst.g:4223:1: ( ( rule__Call__EqualityAssignment_2_0 ) )
            // InternalBurst.g:4224:2: ( rule__Call__EqualityAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getEqualityAssignment_2_0()); 
            }
            // InternalBurst.g:4225:2: ( rule__Call__EqualityAssignment_2_0 )
            // InternalBurst.g:4225:3: rule__Call__EqualityAssignment_2_0
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
    // InternalBurst.g:4233:1: rule__Call__Group_2__1 : rule__Call__Group_2__1__Impl ;
    public final void rule__Call__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4237:1: ( rule__Call__Group_2__1__Impl )
            // InternalBurst.g:4238:2: rule__Call__Group_2__1__Impl
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
    // InternalBurst.g:4244:1: rule__Call__Group_2__1__Impl : ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) ) ;
    public final void rule__Call__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4248:1: ( ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) ) )
            // InternalBurst.g:4249:1: ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) )
            {
            // InternalBurst.g:4249:1: ( ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* ) )
            // InternalBurst.g:4250:2: ( ( rule__Call__SourceAssignment_2_1 ) ) ( ( rule__Call__SourceAssignment_2_1 )* )
            {
            // InternalBurst.g:4250:2: ( ( rule__Call__SourceAssignment_2_1 ) )
            // InternalBurst.g:4251:3: ( rule__Call__SourceAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }
            // InternalBurst.g:4252:3: ( rule__Call__SourceAssignment_2_1 )
            // InternalBurst.g:4252:4: rule__Call__SourceAssignment_2_1
            {
            pushFollow(FOLLOW_36);
            rule__Call__SourceAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }

            }

            // InternalBurst.g:4255:2: ( ( rule__Call__SourceAssignment_2_1 )* )
            // InternalBurst.g:4256:3: ( rule__Call__SourceAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getSourceAssignment_2_1()); 
            }
            // InternalBurst.g:4257:3: ( rule__Call__SourceAssignment_2_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_INT && LA57_0<=RULE_STRING)||(LA57_0>=14 && LA57_0<=15)||LA57_0==31||LA57_0==34||(LA57_0>=40 && LA57_0<=41)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBurst.g:4257:4: rule__Call__SourceAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Call__SourceAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalBurst.g:4267:1: rule__Locale__Group__0 : rule__Locale__Group__0__Impl rule__Locale__Group__1 ;
    public final void rule__Locale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4271:1: ( rule__Locale__Group__0__Impl rule__Locale__Group__1 )
            // InternalBurst.g:4272:2: rule__Locale__Group__0__Impl rule__Locale__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBurst.g:4279:1: rule__Locale__Group__0__Impl : ( () ) ;
    public final void rule__Locale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4283:1: ( ( () ) )
            // InternalBurst.g:4284:1: ( () )
            {
            // InternalBurst.g:4284:1: ( () )
            // InternalBurst.g:4285:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getLocaleAction_0()); 
            }
            // InternalBurst.g:4286:2: ()
            // InternalBurst.g:4286:3: 
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
    // InternalBurst.g:4294:1: rule__Locale__Group__1 : rule__Locale__Group__1__Impl rule__Locale__Group__2 ;
    public final void rule__Locale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4298:1: ( rule__Locale__Group__1__Impl rule__Locale__Group__2 )
            // InternalBurst.g:4299:2: rule__Locale__Group__1__Impl rule__Locale__Group__2
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
    // InternalBurst.g:4306:1: rule__Locale__Group__1__Impl : ( 'new' ) ;
    public final void rule__Locale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4310:1: ( ( 'new' ) )
            // InternalBurst.g:4311:1: ( 'new' )
            {
            // InternalBurst.g:4311:1: ( 'new' )
            // InternalBurst.g:4312:2: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getNewKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:4321:1: rule__Locale__Group__2 : rule__Locale__Group__2__Impl rule__Locale__Group__3 ;
    public final void rule__Locale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4325:1: ( rule__Locale__Group__2__Impl rule__Locale__Group__3 )
            // InternalBurst.g:4326:2: rule__Locale__Group__2__Impl rule__Locale__Group__3
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
    // InternalBurst.g:4333:1: rule__Locale__Group__2__Impl : ( ( rule__Locale__TypeAssignment_2 ) ) ;
    public final void rule__Locale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4337:1: ( ( ( rule__Locale__TypeAssignment_2 ) ) )
            // InternalBurst.g:4338:1: ( ( rule__Locale__TypeAssignment_2 ) )
            {
            // InternalBurst.g:4338:1: ( ( rule__Locale__TypeAssignment_2 ) )
            // InternalBurst.g:4339:2: ( rule__Locale__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getTypeAssignment_2()); 
            }
            // InternalBurst.g:4340:2: ( rule__Locale__TypeAssignment_2 )
            // InternalBurst.g:4340:3: rule__Locale__TypeAssignment_2
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
    // InternalBurst.g:4348:1: rule__Locale__Group__3 : rule__Locale__Group__3__Impl rule__Locale__Group__4 ;
    public final void rule__Locale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4352:1: ( rule__Locale__Group__3__Impl rule__Locale__Group__4 )
            // InternalBurst.g:4353:2: rule__Locale__Group__3__Impl rule__Locale__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBurst.g:4360:1: rule__Locale__Group__3__Impl : ( ( rule__Locale__NameAssignment_3 ) ) ;
    public final void rule__Locale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4364:1: ( ( ( rule__Locale__NameAssignment_3 ) ) )
            // InternalBurst.g:4365:1: ( ( rule__Locale__NameAssignment_3 ) )
            {
            // InternalBurst.g:4365:1: ( ( rule__Locale__NameAssignment_3 ) )
            // InternalBurst.g:4366:2: ( rule__Locale__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getNameAssignment_3()); 
            }
            // InternalBurst.g:4367:2: ( rule__Locale__NameAssignment_3 )
            // InternalBurst.g:4367:3: rule__Locale__NameAssignment_3
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
    // InternalBurst.g:4375:1: rule__Locale__Group__4 : rule__Locale__Group__4__Impl ;
    public final void rule__Locale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4379:1: ( rule__Locale__Group__4__Impl )
            // InternalBurst.g:4380:2: rule__Locale__Group__4__Impl
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
    // InternalBurst.g:4386:1: rule__Locale__Group__4__Impl : ( ( rule__Locale__Group_4__0 )* ) ;
    public final void rule__Locale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4390:1: ( ( ( rule__Locale__Group_4__0 )* ) )
            // InternalBurst.g:4391:1: ( ( rule__Locale__Group_4__0 )* )
            {
            // InternalBurst.g:4391:1: ( ( rule__Locale__Group_4__0 )* )
            // InternalBurst.g:4392:2: ( rule__Locale__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getGroup_4()); 
            }
            // InternalBurst.g:4393:2: ( rule__Locale__Group_4__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==32) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalBurst.g:4393:3: rule__Locale__Group_4__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Locale__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalBurst.g:4402:1: rule__Locale__Group_4__0 : rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 ;
    public final void rule__Locale__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4406:1: ( rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1 )
            // InternalBurst.g:4407:2: rule__Locale__Group_4__0__Impl rule__Locale__Group_4__1
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
    // InternalBurst.g:4414:1: rule__Locale__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Locale__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4418:1: ( ( ':' ) )
            // InternalBurst.g:4419:1: ( ':' )
            {
            // InternalBurst.g:4419:1: ( ':' )
            // InternalBurst.g:4420:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getColonKeyword_4_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:4429:1: rule__Locale__Group_4__1 : rule__Locale__Group_4__1__Impl ;
    public final void rule__Locale__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4433:1: ( rule__Locale__Group_4__1__Impl )
            // InternalBurst.g:4434:2: rule__Locale__Group_4__1__Impl
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
    // InternalBurst.g:4440:1: rule__Locale__Group_4__1__Impl : ( ( rule__Locale__RolesAssignment_4_1 ) ) ;
    public final void rule__Locale__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4444:1: ( ( ( rule__Locale__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:4445:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:4445:1: ( ( rule__Locale__RolesAssignment_4_1 ) )
            // InternalBurst.g:4446:2: ( rule__Locale__RolesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getRolesAssignment_4_1()); 
            }
            // InternalBurst.g:4447:2: ( rule__Locale__RolesAssignment_4_1 )
            // InternalBurst.g:4447:3: rule__Locale__RolesAssignment_4_1
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
    // InternalBurst.g:4456:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4460:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalBurst.g:4461:2: rule__Access__Group__0__Impl rule__Access__Group__1
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
    // InternalBurst.g:4468:1: rule__Access__Group__0__Impl : ( () ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4472:1: ( ( () ) )
            // InternalBurst.g:4473:1: ( () )
            {
            // InternalBurst.g:4473:1: ( () )
            // InternalBurst.g:4474:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getAccessAction_0()); 
            }
            // InternalBurst.g:4475:2: ()
            // InternalBurst.g:4475:3: 
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
    // InternalBurst.g:4483:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4487:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalBurst.g:4488:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalBurst.g:4495:1: rule__Access__Group__1__Impl : ( ( rule__Access__NameAssignment_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4499:1: ( ( ( rule__Access__NameAssignment_1 ) ) )
            // InternalBurst.g:4500:1: ( ( rule__Access__NameAssignment_1 ) )
            {
            // InternalBurst.g:4500:1: ( ( rule__Access__NameAssignment_1 ) )
            // InternalBurst.g:4501:2: ( rule__Access__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getNameAssignment_1()); 
            }
            // InternalBurst.g:4502:2: ( rule__Access__NameAssignment_1 )
            // InternalBurst.g:4502:3: rule__Access__NameAssignment_1
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
    // InternalBurst.g:4510:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4514:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalBurst.g:4515:2: rule__Access__Group__2__Impl rule__Access__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Access__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group__3();

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
    // InternalBurst.g:4522:1: rule__Access__Group__2__Impl : ( ( rule__Access__Group_2__0 )* ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4526:1: ( ( ( rule__Access__Group_2__0 )* ) )
            // InternalBurst.g:4527:1: ( ( rule__Access__Group_2__0 )* )
            {
            // InternalBurst.g:4527:1: ( ( rule__Access__Group_2__0 )* )
            // InternalBurst.g:4528:2: ( rule__Access__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup_2()); 
            }
            // InternalBurst.g:4529:2: ( rule__Access__Group_2__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==33) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalBurst.g:4529:3: rule__Access__Group_2__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Access__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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


    // $ANTLR start "rule__Access__Group__3"
    // InternalBurst.g:4537:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4541:1: ( rule__Access__Group__3__Impl )
            // InternalBurst.g:4542:2: rule__Access__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__3__Impl();

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
    // $ANTLR end "rule__Access__Group__3"


    // $ANTLR start "rule__Access__Group__3__Impl"
    // InternalBurst.g:4548:1: rule__Access__Group__3__Impl : ( ( rule__Access__Group_3__0 )* ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4552:1: ( ( ( rule__Access__Group_3__0 )* ) )
            // InternalBurst.g:4553:1: ( ( rule__Access__Group_3__0 )* )
            {
            // InternalBurst.g:4553:1: ( ( rule__Access__Group_3__0 )* )
            // InternalBurst.g:4554:2: ( rule__Access__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getGroup_3()); 
            }
            // InternalBurst.g:4555:2: ( rule__Access__Group_3__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==32) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalBurst.g:4555:3: rule__Access__Group_3__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Access__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Access__Group__3__Impl"


    // $ANTLR start "rule__Access__Group_2__0"
    // InternalBurst.g:4564:1: rule__Access__Group_2__0 : rule__Access__Group_2__0__Impl rule__Access__Group_2__1 ;
    public final void rule__Access__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4568:1: ( rule__Access__Group_2__0__Impl rule__Access__Group_2__1 )
            // InternalBurst.g:4569:2: rule__Access__Group_2__0__Impl rule__Access__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:4576:1: rule__Access__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Access__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4580:1: ( ( '.' ) )
            // InternalBurst.g:4581:1: ( '.' )
            {
            // InternalBurst.g:4581:1: ( '.' )
            // InternalBurst.g:4582:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getFullStopKeyword_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getFullStopKeyword_2_0()); 
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
    // $ANTLR end "rule__Access__Group_2__0__Impl"


    // $ANTLR start "rule__Access__Group_2__1"
    // InternalBurst.g:4591:1: rule__Access__Group_2__1 : rule__Access__Group_2__1__Impl ;
    public final void rule__Access__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4595:1: ( rule__Access__Group_2__1__Impl )
            // InternalBurst.g:4596:2: rule__Access__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_2__1__Impl();

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
    // InternalBurst.g:4602:1: rule__Access__Group_2__1__Impl : ( ( rule__Access__MembersAssignment_2_1 ) ) ;
    public final void rule__Access__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4606:1: ( ( ( rule__Access__MembersAssignment_2_1 ) ) )
            // InternalBurst.g:4607:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            {
            // InternalBurst.g:4607:1: ( ( rule__Access__MembersAssignment_2_1 ) )
            // InternalBurst.g:4608:2: ( rule__Access__MembersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMembersAssignment_2_1()); 
            }
            // InternalBurst.g:4609:2: ( rule__Access__MembersAssignment_2_1 )
            // InternalBurst.g:4609:3: rule__Access__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__MembersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMembersAssignment_2_1()); 
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


    // $ANTLR start "rule__Access__Group_3__0"
    // InternalBurst.g:4618:1: rule__Access__Group_3__0 : rule__Access__Group_3__0__Impl rule__Access__Group_3__1 ;
    public final void rule__Access__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4622:1: ( rule__Access__Group_3__0__Impl rule__Access__Group_3__1 )
            // InternalBurst.g:4623:2: rule__Access__Group_3__0__Impl rule__Access__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Access__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Access__Group_3__1();

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
    // $ANTLR end "rule__Access__Group_3__0"


    // $ANTLR start "rule__Access__Group_3__0__Impl"
    // InternalBurst.g:4630:1: rule__Access__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Access__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4634:1: ( ( ':' ) )
            // InternalBurst.g:4635:1: ( ':' )
            {
            // InternalBurst.g:4635:1: ( ':' )
            // InternalBurst.g:4636:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getColonKeyword_3_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getColonKeyword_3_0()); 
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
    // $ANTLR end "rule__Access__Group_3__0__Impl"


    // $ANTLR start "rule__Access__Group_3__1"
    // InternalBurst.g:4645:1: rule__Access__Group_3__1 : rule__Access__Group_3__1__Impl ;
    public final void rule__Access__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4649:1: ( rule__Access__Group_3__1__Impl )
            // InternalBurst.g:4650:2: rule__Access__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group_3__1__Impl();

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
    // $ANTLR end "rule__Access__Group_3__1"


    // $ANTLR start "rule__Access__Group_3__1__Impl"
    // InternalBurst.g:4656:1: rule__Access__Group_3__1__Impl : ( ( rule__Access__RolesAssignment_3_1 ) ) ;
    public final void rule__Access__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4660:1: ( ( ( rule__Access__RolesAssignment_3_1 ) ) )
            // InternalBurst.g:4661:1: ( ( rule__Access__RolesAssignment_3_1 ) )
            {
            // InternalBurst.g:4661:1: ( ( rule__Access__RolesAssignment_3_1 ) )
            // InternalBurst.g:4662:2: ( rule__Access__RolesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesAssignment_3_1()); 
            }
            // InternalBurst.g:4663:2: ( rule__Access__RolesAssignment_3_1 )
            // InternalBurst.g:4663:3: rule__Access__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__RolesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesAssignment_3_1()); 
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
    // $ANTLR end "rule__Access__Group_3__1__Impl"


    // $ANTLR start "rule__SubCall__Group__0"
    // InternalBurst.g:4672:1: rule__SubCall__Group__0 : rule__SubCall__Group__0__Impl rule__SubCall__Group__1 ;
    public final void rule__SubCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4676:1: ( rule__SubCall__Group__0__Impl rule__SubCall__Group__1 )
            // InternalBurst.g:4677:2: rule__SubCall__Group__0__Impl rule__SubCall__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalBurst.g:4684:1: rule__SubCall__Group__0__Impl : ( () ) ;
    public final void rule__SubCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4688:1: ( ( () ) )
            // InternalBurst.g:4689:1: ( () )
            {
            // InternalBurst.g:4689:1: ( () )
            // InternalBurst.g:4690:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getCallAction_0()); 
            }
            // InternalBurst.g:4691:2: ()
            // InternalBurst.g:4691:3: 
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
    // InternalBurst.g:4699:1: rule__SubCall__Group__1 : rule__SubCall__Group__1__Impl rule__SubCall__Group__2 ;
    public final void rule__SubCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4703:1: ( rule__SubCall__Group__1__Impl rule__SubCall__Group__2 )
            // InternalBurst.g:4704:2: rule__SubCall__Group__1__Impl rule__SubCall__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:4711:1: rule__SubCall__Group__1__Impl : ( '(' ) ;
    public final void rule__SubCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4715:1: ( ( '(' ) )
            // InternalBurst.g:4716:1: ( '(' )
            {
            // InternalBurst.g:4716:1: ( '(' )
            // InternalBurst.g:4717:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:4726:1: rule__SubCall__Group__2 : rule__SubCall__Group__2__Impl rule__SubCall__Group__3 ;
    public final void rule__SubCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4730:1: ( rule__SubCall__Group__2__Impl rule__SubCall__Group__3 )
            // InternalBurst.g:4731:2: rule__SubCall__Group__2__Impl rule__SubCall__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalBurst.g:4738:1: rule__SubCall__Group__2__Impl : ( ( rule__SubCall__ContentAssignment_2 ) ) ;
    public final void rule__SubCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4742:1: ( ( ( rule__SubCall__ContentAssignment_2 ) ) )
            // InternalBurst.g:4743:1: ( ( rule__SubCall__ContentAssignment_2 ) )
            {
            // InternalBurst.g:4743:1: ( ( rule__SubCall__ContentAssignment_2 ) )
            // InternalBurst.g:4744:2: ( rule__SubCall__ContentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getContentAssignment_2()); 
            }
            // InternalBurst.g:4745:2: ( rule__SubCall__ContentAssignment_2 )
            // InternalBurst.g:4745:3: rule__SubCall__ContentAssignment_2
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
    // InternalBurst.g:4753:1: rule__SubCall__Group__3 : rule__SubCall__Group__3__Impl rule__SubCall__Group__4 ;
    public final void rule__SubCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4757:1: ( rule__SubCall__Group__3__Impl rule__SubCall__Group__4 )
            // InternalBurst.g:4758:2: rule__SubCall__Group__3__Impl rule__SubCall__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalBurst.g:4765:1: rule__SubCall__Group__3__Impl : ( ')' ) ;
    public final void rule__SubCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4769:1: ( ( ')' ) )
            // InternalBurst.g:4770:1: ( ')' )
            {
            // InternalBurst.g:4770:1: ( ')' )
            // InternalBurst.g:4771:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:4780:1: rule__SubCall__Group__4 : rule__SubCall__Group__4__Impl ;
    public final void rule__SubCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4784:1: ( rule__SubCall__Group__4__Impl )
            // InternalBurst.g:4785:2: rule__SubCall__Group__4__Impl
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
    // InternalBurst.g:4791:1: rule__SubCall__Group__4__Impl : ( ( rule__SubCall__Group_4__0 )* ) ;
    public final void rule__SubCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4795:1: ( ( ( rule__SubCall__Group_4__0 )* ) )
            // InternalBurst.g:4796:1: ( ( rule__SubCall__Group_4__0 )* )
            {
            // InternalBurst.g:4796:1: ( ( rule__SubCall__Group_4__0 )* )
            // InternalBurst.g:4797:2: ( rule__SubCall__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getGroup_4()); 
            }
            // InternalBurst.g:4798:2: ( rule__SubCall__Group_4__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==32) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalBurst.g:4798:3: rule__SubCall__Group_4__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SubCall__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalBurst.g:4807:1: rule__SubCall__Group_4__0 : rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 ;
    public final void rule__SubCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4811:1: ( rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1 )
            // InternalBurst.g:4812:2: rule__SubCall__Group_4__0__Impl rule__SubCall__Group_4__1
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
    // InternalBurst.g:4819:1: rule__SubCall__Group_4__0__Impl : ( ':' ) ;
    public final void rule__SubCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4823:1: ( ( ':' ) )
            // InternalBurst.g:4824:1: ( ':' )
            {
            // InternalBurst.g:4824:1: ( ':' )
            // InternalBurst.g:4825:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getColonKeyword_4_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:4834:1: rule__SubCall__Group_4__1 : rule__SubCall__Group_4__1__Impl ;
    public final void rule__SubCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4838:1: ( rule__SubCall__Group_4__1__Impl )
            // InternalBurst.g:4839:2: rule__SubCall__Group_4__1__Impl
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
    // InternalBurst.g:4845:1: rule__SubCall__Group_4__1__Impl : ( ( rule__SubCall__RolesAssignment_4_1 ) ) ;
    public final void rule__SubCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4849:1: ( ( ( rule__SubCall__RolesAssignment_4_1 ) ) )
            // InternalBurst.g:4850:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            {
            // InternalBurst.g:4850:1: ( ( rule__SubCall__RolesAssignment_4_1 ) )
            // InternalBurst.g:4851:2: ( rule__SubCall__RolesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRolesAssignment_4_1()); 
            }
            // InternalBurst.g:4852:2: ( rule__SubCall__RolesAssignment_4_1 )
            // InternalBurst.g:4852:3: rule__SubCall__RolesAssignment_4_1
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
    // InternalBurst.g:4861:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4865:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalBurst.g:4866:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalBurst.g:4873:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4877:1: ( ( () ) )
            // InternalBurst.g:4878:1: ( () )
            {
            // InternalBurst.g:4878:1: ( () )
            // InternalBurst.g:4879:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntConstantAction_0_0()); 
            }
            // InternalBurst.g:4880:2: ()
            // InternalBurst.g:4880:3: 
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
    // InternalBurst.g:4888:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4892:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalBurst.g:4893:2: rule__TerminalExpression__Group_0__1__Impl
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
    // InternalBurst.g:4899:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4903:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalBurst.g:4904:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalBurst.g:4904:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalBurst.g:4905:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalBurst.g:4906:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalBurst.g:4906:3: rule__TerminalExpression__ValueAssignment_0_1
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
    // InternalBurst.g:4915:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4919:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalBurst.g:4920:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBurst.g:4927:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4931:1: ( ( () ) )
            // InternalBurst.g:4932:1: ( () )
            {
            // InternalBurst.g:4932:1: ( () )
            // InternalBurst.g:4933:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0()); 
            }
            // InternalBurst.g:4934:2: ()
            // InternalBurst.g:4934:3: 
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
    // InternalBurst.g:4942:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4946:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalBurst.g:4947:2: rule__TerminalExpression__Group_1__1__Impl
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
    // InternalBurst.g:4953:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4957:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalBurst.g:4958:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalBurst.g:4958:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalBurst.g:4959:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalBurst.g:4960:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalBurst.g:4960:3: rule__TerminalExpression__ValueAssignment_1_1
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
    // InternalBurst.g:4969:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4973:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalBurst.g:4974:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBurst.g:4981:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:4985:1: ( ( () ) )
            // InternalBurst.g:4986:1: ( () )
            {
            // InternalBurst.g:4986:1: ( () )
            // InternalBurst.g:4987:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0()); 
            }
            // InternalBurst.g:4988:2: ()
            // InternalBurst.g:4988:3: 
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
    // InternalBurst.g:4996:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5000:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalBurst.g:5001:2: rule__TerminalExpression__Group_2__1__Impl
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
    // InternalBurst.g:5007:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5011:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalBurst.g:5012:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalBurst.g:5012:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalBurst.g:5013:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalBurst.g:5014:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalBurst.g:5014:3: rule__TerminalExpression__ValueAssignment_2_1
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
    // InternalBurst.g:5023:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5027:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalBurst.g:5028:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalBurst.g:5035:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5039:1: ( ( () ) )
            // InternalBurst.g:5040:1: ( () )
            {
            // InternalBurst.g:5040:1: ( () )
            // InternalBurst.g:5041:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getDoubleConstantAction_3_0()); 
            }
            // InternalBurst.g:5042:2: ()
            // InternalBurst.g:5042:3: 
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
    // InternalBurst.g:5050:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5054:1: ( rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2 )
            // InternalBurst.g:5055:2: rule__TerminalExpression__Group_3__1__Impl rule__TerminalExpression__Group_3__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalBurst.g:5062:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5066:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalBurst.g:5067:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalBurst.g:5067:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalBurst.g:5068:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalBurst.g:5069:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalBurst.g:5069:3: rule__TerminalExpression__ValueAssignment_3_1
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
    // InternalBurst.g:5077:1: rule__TerminalExpression__Group_3__2 : rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3 ;
    public final void rule__TerminalExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5081:1: ( rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3 )
            // InternalBurst.g:5082:2: rule__TerminalExpression__Group_3__2__Impl rule__TerminalExpression__Group_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalBurst.g:5089:1: rule__TerminalExpression__Group_3__2__Impl : ( '.' ) ;
    public final void rule__TerminalExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5093:1: ( ( '.' ) )
            // InternalBurst.g:5094:1: ( '.' )
            {
            // InternalBurst.g:5094:1: ( '.' )
            // InternalBurst.g:5095:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getFullStopKeyword_3_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:5104:1: rule__TerminalExpression__Group_3__3 : rule__TerminalExpression__Group_3__3__Impl ;
    public final void rule__TerminalExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5108:1: ( rule__TerminalExpression__Group_3__3__Impl )
            // InternalBurst.g:5109:2: rule__TerminalExpression__Group_3__3__Impl
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
    // InternalBurst.g:5115:1: rule__TerminalExpression__Group_3__3__Impl : ( RULE_INT ) ;
    public final void rule__TerminalExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5119:1: ( ( RULE_INT ) )
            // InternalBurst.g:5120:1: ( RULE_INT )
            {
            // InternalBurst.g:5120:1: ( RULE_INT )
            // InternalBurst.g:5121:2: RULE_INT
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
    // InternalBurst.g:5131:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5135:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalBurst.g:5136:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
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
    // InternalBurst.g:5143:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5147:1: ( ( () ) )
            // InternalBurst.g:5148:1: ( () )
            {
            // InternalBurst.g:5148:1: ( () )
            // InternalBurst.g:5149:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getThisConstantAction_4_0()); 
            }
            // InternalBurst.g:5150:2: ()
            // InternalBurst.g:5150:3: 
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
    // InternalBurst.g:5158:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5162:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalBurst.g:5163:2: rule__TerminalExpression__Group_4__1__Impl
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
    // InternalBurst.g:5169:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5173:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // InternalBurst.g:5174:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // InternalBurst.g:5174:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // InternalBurst.g:5175:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            }
            // InternalBurst.g:5176:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // InternalBurst.g:5176:3: rule__TerminalExpression__ValueAssignment_4_1
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
    // InternalBurst.g:5185:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5189:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalBurst.g:5190:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBurst.g:5197:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5201:1: ( ( () ) )
            // InternalBurst.g:5202:1: ( () )
            {
            // InternalBurst.g:5202:1: ( () )
            // InternalBurst.g:5203:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getNullConstantAction_5_0()); 
            }
            // InternalBurst.g:5204:2: ()
            // InternalBurst.g:5204:3: 
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
    // InternalBurst.g:5212:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5216:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalBurst.g:5217:2: rule__TerminalExpression__Group_5__1__Impl
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
    // InternalBurst.g:5223:1: rule__TerminalExpression__Group_5__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5227:1: ( ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) )
            // InternalBurst.g:5228:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            {
            // InternalBurst.g:5228:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            // InternalBurst.g:5229:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1()); 
            }
            // InternalBurst.g:5230:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            // InternalBurst.g:5230:3: rule__TerminalExpression__ValueAssignment_5_1
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
    // InternalBurst.g:5239:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5243:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBurst.g:5244:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBurst.g:5251:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5255:1: ( ( RULE_ID ) )
            // InternalBurst.g:5256:1: ( RULE_ID )
            {
            // InternalBurst.g:5256:1: ( RULE_ID )
            // InternalBurst.g:5257:2: RULE_ID
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
    // InternalBurst.g:5266:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5270:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBurst.g:5271:2: rule__QualifiedName__Group__1__Impl
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
    // InternalBurst.g:5277:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5281:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBurst.g:5282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBurst.g:5282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBurst.g:5283:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalBurst.g:5284:2: ( rule__QualifiedName__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==33) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalBurst.g:5284:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalBurst.g:5293:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5297:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBurst.g:5298:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalBurst.g:5305:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5309:1: ( ( '.' ) )
            // InternalBurst.g:5310:1: ( '.' )
            {
            // InternalBurst.g:5310:1: ( '.' )
            // InternalBurst.g:5311:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalBurst.g:5320:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5324:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBurst.g:5325:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalBurst.g:5331:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5335:1: ( ( RULE_ID ) )
            // InternalBurst.g:5336:1: ( RULE_ID )
            {
            // InternalBurst.g:5336:1: ( RULE_ID )
            // InternalBurst.g:5337:2: RULE_ID
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
    // InternalBurst.g:5347:1: rule__File__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__File__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5351:1: ( ( ruleImport ) )
            // InternalBurst.g:5352:2: ( ruleImport )
            {
            // InternalBurst.g:5352:2: ( ruleImport )
            // InternalBurst.g:5353:3: ruleImport
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
    // InternalBurst.g:5362:1: rule__File__ElementsAssignment_3_0 : ( ruleFileElement ) ;
    public final void rule__File__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5366:1: ( ( ruleFileElement ) )
            // InternalBurst.g:5367:2: ( ruleFileElement )
            {
            // InternalBurst.g:5367:2: ( ruleFileElement )
            // InternalBurst.g:5368:3: ruleFileElement
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
    // InternalBurst.g:5377:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5381:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5382:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:5382:2: ( ruleQualifiedName )
            // InternalBurst.g:5383:3: ruleQualifiedName
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
    // InternalBurst.g:5392:1: rule__Roles__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Roles__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5396:1: ( ( RULE_ID ) )
            // InternalBurst.g:5397:2: ( RULE_ID )
            {
            // InternalBurst.g:5397:2: ( RULE_ID )
            // InternalBurst.g:5398:3: RULE_ID
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
    // InternalBurst.g:5407:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5411:1: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5412:2: ( ruleQualifiedName )
            {
            // InternalBurst.g:5412:2: ( ruleQualifiedName )
            // InternalBurst.g:5413:3: ruleQualifiedName
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
    // InternalBurst.g:5422:1: rule__Package__ElementsAssignment_6_0 : ( rulePackageElement ) ;
    public final void rule__Package__ElementsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5426:1: ( ( rulePackageElement ) )
            // InternalBurst.g:5427:2: ( rulePackageElement )
            {
            // InternalBurst.g:5427:2: ( rulePackageElement )
            // InternalBurst.g:5428:3: rulePackageElement
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
    // InternalBurst.g:5437:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5441:1: ( ( RULE_ID ) )
            // InternalBurst.g:5442:2: ( RULE_ID )
            {
            // InternalBurst.g:5442:2: ( RULE_ID )
            // InternalBurst.g:5443:3: RULE_ID
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
    // InternalBurst.g:5452:1: rule__Concern__ElementsAssignment_3_3_0 : ( ruleConcernElement ) ;
    public final void rule__Concern__ElementsAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5456:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:5457:2: ( ruleConcernElement )
            {
            // InternalBurst.g:5457:2: ( ruleConcernElement )
            // InternalBurst.g:5458:3: ruleConcernElement
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
    // InternalBurst.g:5467:1: rule__Template__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5471:1: ( ( RULE_ID ) )
            // InternalBurst.g:5472:2: ( RULE_ID )
            {
            // InternalBurst.g:5472:2: ( RULE_ID )
            // InternalBurst.g:5473:3: RULE_ID
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
    // InternalBurst.g:5482:1: rule__Template__TemplateArgumentsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5486:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5487:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5487:2: ( ( RULE_ID ) )
            // InternalBurst.g:5488:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0()); 
            }
            // InternalBurst.g:5489:3: ( RULE_ID )
            // InternalBurst.g:5490:4: RULE_ID
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
    // InternalBurst.g:5501:1: rule__Template__TemplateArgumentsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Template__TemplateArgumentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5505:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5506:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5506:2: ( ( RULE_ID ) )
            // InternalBurst.g:5507:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0()); 
            }
            // InternalBurst.g:5508:3: ( RULE_ID )
            // InternalBurst.g:5509:4: RULE_ID
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
    // InternalBurst.g:5520:1: rule__Template__ElementsAssignment_7_3_0 : ( ruleConcernElement ) ;
    public final void rule__Template__ElementsAssignment_7_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5524:1: ( ( ruleConcernElement ) )
            // InternalBurst.g:5525:2: ( ruleConcernElement )
            {
            // InternalBurst.g:5525:2: ( ruleConcernElement )
            // InternalBurst.g:5526:3: ruleConcernElement
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
    // InternalBurst.g:5535:1: rule__Member__ActAsAssignment_1 : ( ( 'as' ) ) ;
    public final void rule__Member__ActAsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5539:1: ( ( ( 'as' ) ) )
            // InternalBurst.g:5540:2: ( ( 'as' ) )
            {
            // InternalBurst.g:5540:2: ( ( 'as' ) )
            // InternalBurst.g:5541:3: ( 'as' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getActAsAsKeyword_1_0()); 
            }
            // InternalBurst.g:5542:3: ( 'as' )
            // InternalBurst.g:5543:4: 'as'
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
    // InternalBurst.g:5554:1: rule__Member__IsContentAssignment_2 : ( ( 'is' ) ) ;
    public final void rule__Member__IsContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5558:1: ( ( ( 'is' ) ) )
            // InternalBurst.g:5559:2: ( ( 'is' ) )
            {
            // InternalBurst.g:5559:2: ( ( 'is' ) )
            // InternalBurst.g:5560:3: ( 'is' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0()); 
            }
            // InternalBurst.g:5561:3: ( 'is' )
            // InternalBurst.g:5562:4: 'is'
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
    // InternalBurst.g:5573:1: rule__Member__ConcernAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Member__ConcernAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5577:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5578:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5578:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5579:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0()); 
            }
            // InternalBurst.g:5580:3: ( ruleQualifiedName )
            // InternalBurst.g:5581:4: ruleQualifiedName
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
    // InternalBurst.g:5592:1: rule__Member__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5596:1: ( ( RULE_ID ) )
            // InternalBurst.g:5597:2: ( RULE_ID )
            {
            // InternalBurst.g:5597:2: ( RULE_ID )
            // InternalBurst.g:5598:3: RULE_ID
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
    // InternalBurst.g:5607:1: rule__RuleIntersect__NameAssignment_1 : ( ( 'when' ) ) ;
    public final void rule__RuleIntersect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5611:1: ( ( ( 'when' ) ) )
            // InternalBurst.g:5612:2: ( ( 'when' ) )
            {
            // InternalBurst.g:5612:2: ( ( 'when' ) )
            // InternalBurst.g:5613:3: ( 'when' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0()); 
            }
            // InternalBurst.g:5614:3: ( 'when' )
            // InternalBurst.g:5615:4: 'when'
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
    // InternalBurst.g:5626:1: rule__RuleIntersect__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5630:1: ( ( ruleParameter ) )
            // InternalBurst.g:5631:2: ( ruleParameter )
            {
            // InternalBurst.g:5631:2: ( ruleParameter )
            // InternalBurst.g:5632:3: ruleParameter
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
    // InternalBurst.g:5641:1: rule__RuleIntersect__ParamsAssignment_4_3 : ( ruleParameter ) ;
    public final void rule__RuleIntersect__ParamsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5645:1: ( ( ruleParameter ) )
            // InternalBurst.g:5646:2: ( ruleParameter )
            {
            // InternalBurst.g:5646:2: ( ruleParameter )
            // InternalBurst.g:5647:3: ruleParameter
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


    // $ANTLR start "rule__RuleIntersect__WithParamsAssignment_5_2"
    // InternalBurst.g:5656:1: rule__RuleIntersect__WithParamsAssignment_5_2 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__WithParamsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5660:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:5661:2: ( ruleWithParameter )
            {
            // InternalBurst.g:5661:2: ( ruleWithParameter )
            // InternalBurst.g:5662:3: ruleWithParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__RuleIntersect__WithParamsAssignment_5_2"


    // $ANTLR start "rule__RuleIntersect__WithParamsAssignment_5_3_3"
    // InternalBurst.g:5671:1: rule__RuleIntersect__WithParamsAssignment_5_3_3 : ( ruleWithParameter ) ;
    public final void rule__RuleIntersect__WithParamsAssignment_5_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5675:1: ( ( ruleWithParameter ) )
            // InternalBurst.g:5676:2: ( ruleWithParameter )
            {
            // InternalBurst.g:5676:2: ( ruleWithParameter )
            // InternalBurst.g:5677:3: ruleWithParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWithParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_3_3_0()); 
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
    // $ANTLR end "rule__RuleIntersect__WithParamsAssignment_5_3_3"


    // $ANTLR start "rule__RuleIntersect__BlockAssignment_6"
    // InternalBurst.g:5686:1: rule__RuleIntersect__BlockAssignment_6 : ( ruleBlock ) ;
    public final void rule__RuleIntersect__BlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5690:1: ( ( ruleBlock ) )
            // InternalBurst.g:5691:2: ( ruleBlock )
            {
            // InternalBurst.g:5691:2: ( ruleBlock )
            // InternalBurst.g:5692:3: ruleBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleIntersectAccess().getBlockBlockParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleIntersectAccess().getBlockBlockParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__RuleIntersect__BlockAssignment_6"


    // $ANTLR start "rule__Block__LinesAssignment_3_0"
    // InternalBurst.g:5701:1: rule__Block__LinesAssignment_3_0 : ( ruleLine ) ;
    public final void rule__Block__LinesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5705:1: ( ( ruleLine ) )
            // InternalBurst.g:5706:2: ( ruleLine )
            {
            // InternalBurst.g:5706:2: ( ruleLine )
            // InternalBurst.g:5707:3: ruleLine
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
    // InternalBurst.g:5716:1: rule__Block__LinesAssignment_3_1_1 : ( ruleLine ) ;
    public final void rule__Block__LinesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5720:1: ( ( ruleLine ) )
            // InternalBurst.g:5721:2: ( ruleLine )
            {
            // InternalBurst.g:5721:2: ( ruleLine )
            // InternalBurst.g:5722:3: ruleLine
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


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // InternalBurst.g:5731:1: rule__Parameter__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5735:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:5736:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:5736:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:5737:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0()); 
            }
            // InternalBurst.g:5738:3: ( ruleQualifiedName )
            // InternalBurst.g:5739:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalBurst.g:5750:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5754:1: ( ( RULE_ID ) )
            // InternalBurst.g:5755:2: ( RULE_ID )
            {
            // InternalBurst.g:5755:2: ( RULE_ID )
            // InternalBurst.g:5756:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__UsageAssignment_3_0"
    // InternalBurst.g:5765:1: rule__Parameter__UsageAssignment_3_0 : ( ( ':' ) ) ;
    public final void rule__Parameter__UsageAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5769:1: ( ( ( ':' ) ) )
            // InternalBurst.g:5770:2: ( ( ':' ) )
            {
            // InternalBurst.g:5770:2: ( ( ':' ) )
            // InternalBurst.g:5771:3: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            }
            // InternalBurst.g:5772:3: ( ':' )
            // InternalBurst.g:5773:4: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0()); 
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
    // $ANTLR end "rule__Parameter__UsageAssignment_3_0"


    // $ANTLR start "rule__Parameter__RoleAssignment_3_1"
    // InternalBurst.g:5784:1: rule__Parameter__RoleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__RoleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5788:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5789:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5789:2: ( ( RULE_ID ) )
            // InternalBurst.g:5790:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0()); 
            }
            // InternalBurst.g:5791:3: ( RULE_ID )
            // InternalBurst.g:5792:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__Parameter__RoleAssignment_3_1"


    // $ANTLR start "rule__WithParameter__NameAssignment_1"
    // InternalBurst.g:5803:1: rule__WithParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WithParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5807:1: ( ( RULE_ID ) )
            // InternalBurst.g:5808:2: ( RULE_ID )
            {
            // InternalBurst.g:5808:2: ( RULE_ID )
            // InternalBurst.g:5809:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__WithParameter__NameAssignment_1"


    // $ANTLR start "rule__WithParameter__UsageAssignment_2_0"
    // InternalBurst.g:5818:1: rule__WithParameter__UsageAssignment_2_0 : ( ( ':' ) ) ;
    public final void rule__WithParameter__UsageAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5822:1: ( ( ( ':' ) ) )
            // InternalBurst.g:5823:2: ( ( ':' ) )
            {
            // InternalBurst.g:5823:2: ( ( ':' ) )
            // InternalBurst.g:5824:3: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            }
            // InternalBurst.g:5825:3: ( ':' )
            // InternalBurst.g:5826:4: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0()); 
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
    // $ANTLR end "rule__WithParameter__UsageAssignment_2_0"


    // $ANTLR start "rule__WithParameter__RoleAssignment_2_1"
    // InternalBurst.g:5837:1: rule__WithParameter__RoleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__WithParameter__RoleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5841:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:5842:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:5842:2: ( ( RULE_ID ) )
            // InternalBurst.g:5843:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0()); 
            }
            // InternalBurst.g:5844:3: ( RULE_ID )
            // InternalBurst.g:5845:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWithParameterAccess().getRoleRoleIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getRoleRoleIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__WithParameter__RoleAssignment_2_1"


    // $ANTLR start "rule__Stop__ConditionAssignment_2"
    // InternalBurst.g:5856:1: rule__Stop__ConditionAssignment_2 : ( ruleCall ) ;
    public final void rule__Stop__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5860:1: ( ( ruleCall ) )
            // InternalBurst.g:5861:2: ( ruleCall )
            {
            // InternalBurst.g:5861:2: ( ruleCall )
            // InternalBurst.g:5862:3: ruleCall
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
    // InternalBurst.g:5871:1: rule__If__ExpressionAssignment_2 : ( ruleCall ) ;
    public final void rule__If__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5875:1: ( ( ruleCall ) )
            // InternalBurst.g:5876:2: ( ruleCall )
            {
            // InternalBurst.g:5876:2: ( ruleCall )
            // InternalBurst.g:5877:3: ruleCall
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
    // InternalBurst.g:5886:1: rule__If__ThenBlockAssignment_3_0 : ( ruleBlock ) ;
    public final void rule__If__ThenBlockAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5890:1: ( ( ruleBlock ) )
            // InternalBurst.g:5891:2: ( ruleBlock )
            {
            // InternalBurst.g:5891:2: ( ruleBlock )
            // InternalBurst.g:5892:3: ruleBlock
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
    // InternalBurst.g:5901:1: rule__If__ThenBlockAssignment_3_1_1 : ( ruleLine ) ;
    public final void rule__If__ThenBlockAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5905:1: ( ( ruleLine ) )
            // InternalBurst.g:5906:2: ( ruleLine )
            {
            // InternalBurst.g:5906:2: ( ruleLine )
            // InternalBurst.g:5907:3: ruleLine
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
    // InternalBurst.g:5916:1: rule__If__ElseBlockAssignment_4_3 : ( ruleLine ) ;
    public final void rule__If__ElseBlockAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5920:1: ( ( ruleLine ) )
            // InternalBurst.g:5921:2: ( ruleLine )
            {
            // InternalBurst.g:5921:2: ( ruleLine )
            // InternalBurst.g:5922:3: ruleLine
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
    // InternalBurst.g:5931:1: rule__ContextManagement__ActionAssignment_1 : ( ruleconcernManagment ) ;
    public final void rule__ContextManagement__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5935:1: ( ( ruleconcernManagment ) )
            // InternalBurst.g:5936:2: ( ruleconcernManagment )
            {
            // InternalBurst.g:5936:2: ( ruleconcernManagment )
            // InternalBurst.g:5937:3: ruleconcernManagment
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
    // InternalBurst.g:5946:1: rule__ContextManagement__TargetAssignment_2 : ( ruleAccess ) ;
    public final void rule__ContextManagement__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5950:1: ( ( ruleAccess ) )
            // InternalBurst.g:5951:2: ( ruleAccess )
            {
            // InternalBurst.g:5951:2: ( ruleAccess )
            // InternalBurst.g:5952:3: ruleAccess
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
    // InternalBurst.g:5961:1: rule__Call__ContentAssignment_1 : ( ruleCallElement ) ;
    public final void rule__Call__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5965:1: ( ( ruleCallElement ) )
            // InternalBurst.g:5966:2: ( ruleCallElement )
            {
            // InternalBurst.g:5966:2: ( ruleCallElement )
            // InternalBurst.g:5967:3: ruleCallElement
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
    // InternalBurst.g:5976:1: rule__Call__EqualityAssignment_2_0 : ( ( '=' ) ) ;
    public final void rule__Call__EqualityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5980:1: ( ( ( '=' ) ) )
            // InternalBurst.g:5981:2: ( ( '=' ) )
            {
            // InternalBurst.g:5981:2: ( ( '=' ) )
            // InternalBurst.g:5982:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0()); 
            }
            // InternalBurst.g:5983:3: ( '=' )
            // InternalBurst.g:5984:4: '='
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
    // InternalBurst.g:5995:1: rule__Call__SourceAssignment_2_1 : ( ruleCallElement ) ;
    public final void rule__Call__SourceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:5999:1: ( ( ruleCallElement ) )
            // InternalBurst.g:6000:2: ( ruleCallElement )
            {
            // InternalBurst.g:6000:2: ( ruleCallElement )
            // InternalBurst.g:6001:3: ruleCallElement
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
    // InternalBurst.g:6010:1: rule__Locale__TypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Locale__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6014:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBurst.g:6015:2: ( ( ruleQualifiedName ) )
            {
            // InternalBurst.g:6015:2: ( ( ruleQualifiedName ) )
            // InternalBurst.g:6016:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0()); 
            }
            // InternalBurst.g:6017:3: ( ruleQualifiedName )
            // InternalBurst.g:6018:4: ruleQualifiedName
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
    // InternalBurst.g:6029:1: rule__Locale__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Locale__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6033:1: ( ( RULE_ID ) )
            // InternalBurst.g:6034:2: ( RULE_ID )
            {
            // InternalBurst.g:6034:2: ( RULE_ID )
            // InternalBurst.g:6035:3: RULE_ID
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
    // InternalBurst.g:6044:1: rule__Locale__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Locale__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6048:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:6049:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:6049:2: ( ( RULE_ID ) )
            // InternalBurst.g:6050:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0()); 
            }
            // InternalBurst.g:6051:3: ( RULE_ID )
            // InternalBurst.g:6052:4: RULE_ID
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
    // InternalBurst.g:6063:1: rule__Access__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6067:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:6068:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:6068:2: ( ( RULE_ID ) )
            // InternalBurst.g:6069:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0()); 
            }
            // InternalBurst.g:6070:3: ( RULE_ID )
            // InternalBurst.g:6071:4: RULE_ID
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


    // $ANTLR start "rule__Access__MembersAssignment_2_1"
    // InternalBurst.g:6082:1: rule__Access__MembersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6086:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:6087:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:6087:2: ( ( RULE_ID ) )
            // InternalBurst.g:6088:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0()); 
            }
            // InternalBurst.g:6089:3: ( RULE_ID )
            // InternalBurst.g:6090:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getMembersMemberIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMembersMemberIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Access__MembersAssignment_2_1"


    // $ANTLR start "rule__Access__RolesAssignment_3_1"
    // InternalBurst.g:6101:1: rule__Access__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Access__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6105:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:6106:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:6106:2: ( ( RULE_ID ) )
            // InternalBurst.g:6107:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0()); 
            }
            // InternalBurst.g:6108:3: ( RULE_ID )
            // InternalBurst.g:6109:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__Access__RolesAssignment_3_1"


    // $ANTLR start "rule__SubCall__ContentAssignment_2"
    // InternalBurst.g:6120:1: rule__SubCall__ContentAssignment_2 : ( ruleCall ) ;
    public final void rule__SubCall__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6124:1: ( ( ruleCall ) )
            // InternalBurst.g:6125:2: ( ruleCall )
            {
            // InternalBurst.g:6125:2: ( ruleCall )
            // InternalBurst.g:6126:3: ruleCall
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
    // InternalBurst.g:6135:1: rule__SubCall__RolesAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SubCall__RolesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6139:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:6140:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:6140:2: ( ( RULE_ID ) )
            // InternalBurst.g:6141:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0()); 
            }
            // InternalBurst.g:6142:3: ( RULE_ID )
            // InternalBurst.g:6143:4: RULE_ID
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
    // InternalBurst.g:6154:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6158:1: ( ( RULE_INT ) )
            // InternalBurst.g:6159:2: ( RULE_INT )
            {
            // InternalBurst.g:6159:2: ( RULE_INT )
            // InternalBurst.g:6160:3: RULE_INT
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
    // InternalBurst.g:6169:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6173:1: ( ( RULE_STRING ) )
            // InternalBurst.g:6174:2: ( RULE_STRING )
            {
            // InternalBurst.g:6174:2: ( RULE_STRING )
            // InternalBurst.g:6175:3: RULE_STRING
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
    // InternalBurst.g:6184:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6188:1: ( ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalBurst.g:6189:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalBurst.g:6189:2: ( ( rule__TerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalBurst.g:6190:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // InternalBurst.g:6191:3: ( rule__TerminalExpression__ValueAlternatives_2_1_0 )
            // InternalBurst.g:6191:4: rule__TerminalExpression__ValueAlternatives_2_1_0
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
    // InternalBurst.g:6199:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6203:1: ( ( RULE_INT ) )
            // InternalBurst.g:6204:2: ( RULE_INT )
            {
            // InternalBurst.g:6204:2: ( RULE_INT )
            // InternalBurst.g:6205:3: RULE_INT
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
    // InternalBurst.g:6214:1: rule__TerminalExpression__ValueAssignment_4_1 : ( ( 'this' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6218:1: ( ( ( 'this' ) ) )
            // InternalBurst.g:6219:2: ( ( 'this' ) )
            {
            // InternalBurst.g:6219:2: ( ( 'this' ) )
            // InternalBurst.g:6220:3: ( 'this' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0()); 
            }
            // InternalBurst.g:6221:3: ( 'this' )
            // InternalBurst.g:6222:4: 'this'
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
    // InternalBurst.g:6233:1: rule__TerminalExpression__ValueAssignment_5_1 : ( ( 'null' ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:6237:1: ( ( ( 'null' ) ) )
            // InternalBurst.g:6238:2: ( ( 'null' ) )
            {
            // InternalBurst.g:6238:2: ( ( 'null' ) )
            // InternalBurst.g:6239:3: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0()); 
            }
            // InternalBurst.g:6240:3: ( 'null' )
            // InternalBurst.g:6241:4: 'null'
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

    // $ANTLR start synpred61_InternalBurst
    public final void synpred61_InternalBurst_fragment() throws RecognitionException {   
        // InternalBurst.g:3832:3: ( rule__If__Group_4__0 )
        // InternalBurst.g:3832:3: rule__If__Group_4__0
        {
        pushFollow(FOLLOW_2);
        rule__If__Group_4__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalBurst

    // Delegated rules

    public final boolean synpred61_InternalBurst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalBurst_fragment(); // can never throw exception
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
    protected DFA45 dfa45 = new DFA45(this);
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
            return "1732:2: ( rule__Concern__Group_3__0 )?";
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
            return "2144:2: ( rule__Template__Group_7__0 )?";
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
            "\1\3\3\4\6\uffff\4\4\3\uffff\1\4\1\2\5\uffff\2\4\1\uffff\1\4\2\uffff\1\4\5\uffff\2\4",
            "",
            "\1\3\3\4\6\uffff\4\4\3\uffff\1\4\1\2\5\uffff\2\4\1\uffff\1\4\2\uffff\1\4\5\uffff\2\4",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3232:2: ( rule__Block__Group_3_1__0 )*";
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008203010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000304B863F0F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000304B823F0F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003048000C0E0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000003048000C0E2L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000000L});

}