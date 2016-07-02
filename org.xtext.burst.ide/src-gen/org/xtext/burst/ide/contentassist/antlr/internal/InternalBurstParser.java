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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LINE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'import'", "'concern'", "'{'", "'}'", "'extends'", "'int'", "'when'", "'call'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_LINE_END=5;
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

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


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBurst.g:79:1: ( ruleImport EOF )
            // InternalBurst.g:80:1: ruleImport EOF
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
    // InternalBurst.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBurst.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalBurst.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalBurst.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalBurst.g:94:3: ( rule__Import__Group__0 )
            // InternalBurst.g:94:4: rule__Import__Group__0
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
    // InternalBurst.g:103:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // InternalBurst.g:104:1: ( ruleConcern EOF )
            // InternalBurst.g:105:1: ruleConcern EOF
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
    // InternalBurst.g:112:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:116:2: ( ( ( rule__Concern__Group__0 ) ) )
            // InternalBurst.g:117:2: ( ( rule__Concern__Group__0 ) )
            {
            // InternalBurst.g:117:2: ( ( rule__Concern__Group__0 ) )
            // InternalBurst.g:118:3: ( rule__Concern__Group__0 )
            {
             before(grammarAccess.getConcernAccess().getGroup()); 
            // InternalBurst.g:119:3: ( rule__Concern__Group__0 )
            // InternalBurst.g:119:4: rule__Concern__Group__0
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
    // InternalBurst.g:128:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalBurst.g:129:1: ( ruleMember EOF )
            // InternalBurst.g:130:1: ruleMember EOF
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
    // InternalBurst.g:137:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:141:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalBurst.g:142:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalBurst.g:142:2: ( ( rule__Member__Group__0 ) )
            // InternalBurst.g:143:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalBurst.g:144:3: ( rule__Member__Group__0 )
            // InternalBurst.g:144:4: rule__Member__Group__0
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
    // InternalBurst.g:153:1: entryRuleIntersection : ruleIntersection EOF ;
    public final void entryRuleIntersection() throws RecognitionException {
        try {
            // InternalBurst.g:154:1: ( ruleIntersection EOF )
            // InternalBurst.g:155:1: ruleIntersection EOF
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
    // InternalBurst.g:162:1: ruleIntersection : ( ( rule__Intersection__Group__0 ) ) ;
    public final void ruleIntersection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:166:2: ( ( ( rule__Intersection__Group__0 ) ) )
            // InternalBurst.g:167:2: ( ( rule__Intersection__Group__0 ) )
            {
            // InternalBurst.g:167:2: ( ( rule__Intersection__Group__0 ) )
            // InternalBurst.g:168:3: ( rule__Intersection__Group__0 )
            {
             before(grammarAccess.getIntersectionAccess().getGroup()); 
            // InternalBurst.g:169:3: ( rule__Intersection__Group__0 )
            // InternalBurst.g:169:4: rule__Intersection__Group__0
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
    // InternalBurst.g:178:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalBurst.g:179:1: ( ruleLine EOF )
            // InternalBurst.g:180:1: ruleLine EOF
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
    // InternalBurst.g:187:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:191:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalBurst.g:192:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalBurst.g:192:2: ( ( rule__Line__Group__0 ) )
            // InternalBurst.g:193:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalBurst.g:194:3: ( rule__Line__Group__0 )
            // InternalBurst.g:194:4: rule__Line__Group__0
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


    // $ANTLR start "entryRuleQualifier"
    // InternalBurst.g:203:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // InternalBurst.g:204:1: ( ruleQualifier EOF )
            // InternalBurst.g:205:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getQualifierRule()); 
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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalBurst.g:212:1: ruleQualifier : ( ( rule__Qualifier__Alternatives ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:216:2: ( ( ( rule__Qualifier__Alternatives ) ) )
            // InternalBurst.g:217:2: ( ( rule__Qualifier__Alternatives ) )
            {
            // InternalBurst.g:217:2: ( ( rule__Qualifier__Alternatives ) )
            // InternalBurst.g:218:3: ( rule__Qualifier__Alternatives )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives()); 
            // InternalBurst.g:219:3: ( rule__Qualifier__Alternatives )
            // InternalBurst.g:219:4: rule__Qualifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "rule__File__Alternatives_1"
    // InternalBurst.g:227:1: rule__File__Alternatives_1 : ( ( ( rule__File__ConcernsAssignment_1_0 ) ) | ( ( rule__File__ExternIntersectionsAssignment_1_1 ) ) );
    public final void rule__File__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:231:1: ( ( ( rule__File__ConcernsAssignment_1_0 ) ) | ( ( rule__File__ExternIntersectionsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBurst.g:232:2: ( ( rule__File__ConcernsAssignment_1_0 ) )
                    {
                    // InternalBurst.g:232:2: ( ( rule__File__ConcernsAssignment_1_0 ) )
                    // InternalBurst.g:233:3: ( rule__File__ConcernsAssignment_1_0 )
                    {
                     before(grammarAccess.getFileAccess().getConcernsAssignment_1_0()); 
                    // InternalBurst.g:234:3: ( rule__File__ConcernsAssignment_1_0 )
                    // InternalBurst.g:234:4: rule__File__ConcernsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__ConcernsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFileAccess().getConcernsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:238:2: ( ( rule__File__ExternIntersectionsAssignment_1_1 ) )
                    {
                    // InternalBurst.g:238:2: ( ( rule__File__ExternIntersectionsAssignment_1_1 ) )
                    // InternalBurst.g:239:3: ( rule__File__ExternIntersectionsAssignment_1_1 )
                    {
                     before(grammarAccess.getFileAccess().getExternIntersectionsAssignment_1_1()); 
                    // InternalBurst.g:240:3: ( rule__File__ExternIntersectionsAssignment_1_1 )
                    // InternalBurst.g:240:4: rule__File__ExternIntersectionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__File__ExternIntersectionsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFileAccess().getExternIntersectionsAssignment_1_1()); 

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
    // $ANTLR end "rule__File__Alternatives_1"


    // $ANTLR start "rule__Concern__Alternatives_5"
    // InternalBurst.g:248:1: rule__Concern__Alternatives_5 : ( ( ( rule__Concern__MembersAssignment_5_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_5_1 ) ) );
    public final void rule__Concern__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:252:1: ( ( ( rule__Concern__MembersAssignment_5_0 ) ) | ( ( rule__Concern__IntersectionsAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBurst.g:253:2: ( ( rule__Concern__MembersAssignment_5_0 ) )
                    {
                    // InternalBurst.g:253:2: ( ( rule__Concern__MembersAssignment_5_0 ) )
                    // InternalBurst.g:254:3: ( rule__Concern__MembersAssignment_5_0 )
                    {
                     before(grammarAccess.getConcernAccess().getMembersAssignment_5_0()); 
                    // InternalBurst.g:255:3: ( rule__Concern__MembersAssignment_5_0 )
                    // InternalBurst.g:255:4: rule__Concern__MembersAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__MembersAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getMembersAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:259:2: ( ( rule__Concern__IntersectionsAssignment_5_1 ) )
                    {
                    // InternalBurst.g:259:2: ( ( rule__Concern__IntersectionsAssignment_5_1 ) )
                    // InternalBurst.g:260:3: ( rule__Concern__IntersectionsAssignment_5_1 )
                    {
                     before(grammarAccess.getConcernAccess().getIntersectionsAssignment_5_1()); 
                    // InternalBurst.g:261:3: ( rule__Concern__IntersectionsAssignment_5_1 )
                    // InternalBurst.g:261:4: rule__Concern__IntersectionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__IntersectionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getIntersectionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Concern__Alternatives_5"


    // $ANTLR start "rule__Qualifier__Alternatives"
    // InternalBurst.g:269:1: rule__Qualifier__Alternatives : ( ( ( rule__Qualifier__Group_0__0 ) ) | ( 'none' ) );
    public final void rule__Qualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:273:1: ( ( ( rule__Qualifier__Group_0__0 ) ) | ( 'none' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:274:2: ( ( rule__Qualifier__Group_0__0 ) )
                    {
                    // InternalBurst.g:274:2: ( ( rule__Qualifier__Group_0__0 ) )
                    // InternalBurst.g:275:3: ( rule__Qualifier__Group_0__0 )
                    {
                     before(grammarAccess.getQualifierAccess().getGroup_0()); 
                    // InternalBurst.g:276:3: ( rule__Qualifier__Group_0__0 )
                    // InternalBurst.g:276:4: rule__Qualifier__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qualifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:280:2: ( 'none' )
                    {
                    // InternalBurst.g:280:2: ( 'none' )
                    // InternalBurst.g:281:3: 'none'
                    {
                     before(grammarAccess.getQualifierAccess().getNoneKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getQualifierAccess().getNoneKeyword_1()); 

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
    // $ANTLR end "rule__Qualifier__Alternatives"


    // $ANTLR start "rule__File__Group__0"
    // InternalBurst.g:290:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:294:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalBurst.g:295:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalBurst.g:302:1: rule__File__Group__0__Impl : ( ( rule__File__ImportsAssignment_0 )* ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:306:1: ( ( ( rule__File__ImportsAssignment_0 )* ) )
            // InternalBurst.g:307:1: ( ( rule__File__ImportsAssignment_0 )* )
            {
            // InternalBurst.g:307:1: ( ( rule__File__ImportsAssignment_0 )* )
            // InternalBurst.g:308:2: ( rule__File__ImportsAssignment_0 )*
            {
             before(grammarAccess.getFileAccess().getImportsAssignment_0()); 
            // InternalBurst.g:309:2: ( rule__File__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:309:3: rule__File__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalBurst.g:317:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:321:1: ( rule__File__Group__1__Impl )
            // InternalBurst.g:322:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:328:1: rule__File__Group__1__Impl : ( ( rule__File__Alternatives_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:332:1: ( ( ( rule__File__Alternatives_1 )* ) )
            // InternalBurst.g:333:1: ( ( rule__File__Alternatives_1 )* )
            {
            // InternalBurst.g:333:1: ( ( rule__File__Alternatives_1 )* )
            // InternalBurst.g:334:2: ( rule__File__Alternatives_1 )*
            {
             before(grammarAccess.getFileAccess().getAlternatives_1()); 
            // InternalBurst.g:335:2: ( rule__File__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:335:3: rule__File__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__File__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalBurst.g:344:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:348:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBurst.g:349:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBurst.g:356:1: rule__Import__Group__0__Impl : ( () ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:360:1: ( ( () ) )
            // InternalBurst.g:361:1: ( () )
            {
            // InternalBurst.g:361:1: ( () )
            // InternalBurst.g:362:2: ()
            {
             before(grammarAccess.getImportAccess().getImportAction_0()); 
            // InternalBurst.g:363:2: ()
            // InternalBurst.g:363:3: 
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
    // InternalBurst.g:371:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:375:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalBurst.g:376:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalBurst.g:383:1: rule__Import__Group__1__Impl : ( 'import' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:387:1: ( ( 'import' ) )
            // InternalBurst.g:388:1: ( 'import' )
            {
            // InternalBurst.g:388:1: ( 'import' )
            // InternalBurst.g:389:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBurst.g:398:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:402:1: ( rule__Import__Group__2__Impl )
            // InternalBurst.g:403:2: rule__Import__Group__2__Impl
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
    // InternalBurst.g:409:1: rule__Import__Group__2__Impl : ( ( rule__Import__NameAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:413:1: ( ( ( rule__Import__NameAssignment_2 ) ) )
            // InternalBurst.g:414:1: ( ( rule__Import__NameAssignment_2 ) )
            {
            // InternalBurst.g:414:1: ( ( rule__Import__NameAssignment_2 ) )
            // InternalBurst.g:415:2: ( rule__Import__NameAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_2()); 
            // InternalBurst.g:416:2: ( rule__Import__NameAssignment_2 )
            // InternalBurst.g:416:3: rule__Import__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:425:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:429:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalBurst.g:430:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBurst.g:437:1: rule__Concern__Group__0__Impl : ( () ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:441:1: ( ( () ) )
            // InternalBurst.g:442:1: ( () )
            {
            // InternalBurst.g:442:1: ( () )
            // InternalBurst.g:443:2: ()
            {
             before(grammarAccess.getConcernAccess().getConcernAction_0()); 
            // InternalBurst.g:444:2: ()
            // InternalBurst.g:444:3: 
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
    // InternalBurst.g:452:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:456:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalBurst.g:457:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBurst.g:464:1: rule__Concern__Group__1__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:468:1: ( ( 'concern' ) )
            // InternalBurst.g:469:1: ( 'concern' )
            {
            // InternalBurst.g:469:1: ( 'concern' )
            // InternalBurst.g:470:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBurst.g:479:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:483:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalBurst.g:484:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:491:1: rule__Concern__Group__2__Impl : ( ( rule__Concern__NameAssignment_2 ) ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:495:1: ( ( ( rule__Concern__NameAssignment_2 ) ) )
            // InternalBurst.g:496:1: ( ( rule__Concern__NameAssignment_2 ) )
            {
            // InternalBurst.g:496:1: ( ( rule__Concern__NameAssignment_2 ) )
            // InternalBurst.g:497:2: ( rule__Concern__NameAssignment_2 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_2()); 
            // InternalBurst.g:498:2: ( rule__Concern__NameAssignment_2 )
            // InternalBurst.g:498:3: rule__Concern__NameAssignment_2
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
    // InternalBurst.g:506:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl rule__Concern__Group__4 ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:510:1: ( rule__Concern__Group__3__Impl rule__Concern__Group__4 )
            // InternalBurst.g:511:2: rule__Concern__Group__3__Impl rule__Concern__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalBurst.g:518:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:522:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalBurst.g:523:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalBurst.g:523:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalBurst.g:524:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalBurst.g:525:2: ( rule__Concern__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:525:3: rule__Concern__Group_3__0
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
    // InternalBurst.g:533:1: rule__Concern__Group__4 : rule__Concern__Group__4__Impl rule__Concern__Group__5 ;
    public final void rule__Concern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:537:1: ( rule__Concern__Group__4__Impl rule__Concern__Group__5 )
            // InternalBurst.g:538:2: rule__Concern__Group__4__Impl rule__Concern__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalBurst.g:545:1: rule__Concern__Group__4__Impl : ( '{' ) ;
    public final void rule__Concern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:549:1: ( ( '{' ) )
            // InternalBurst.g:550:1: ( '{' )
            {
            // InternalBurst.g:550:1: ( '{' )
            // InternalBurst.g:551:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalBurst.g:560:1: rule__Concern__Group__5 : rule__Concern__Group__5__Impl rule__Concern__Group__6 ;
    public final void rule__Concern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:564:1: ( rule__Concern__Group__5__Impl rule__Concern__Group__6 )
            // InternalBurst.g:565:2: rule__Concern__Group__5__Impl rule__Concern__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalBurst.g:572:1: rule__Concern__Group__5__Impl : ( ( rule__Concern__Alternatives_5 )* ) ;
    public final void rule__Concern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:576:1: ( ( ( rule__Concern__Alternatives_5 )* ) )
            // InternalBurst.g:577:1: ( ( rule__Concern__Alternatives_5 )* )
            {
            // InternalBurst.g:577:1: ( ( rule__Concern__Alternatives_5 )* )
            // InternalBurst.g:578:2: ( rule__Concern__Alternatives_5 )*
            {
             before(grammarAccess.getConcernAccess().getAlternatives_5()); 
            // InternalBurst.g:579:2: ( rule__Concern__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:579:3: rule__Concern__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Concern__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getAlternatives_5()); 

            }


            }

        }
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
    // InternalBurst.g:587:1: rule__Concern__Group__6 : rule__Concern__Group__6__Impl ;
    public final void rule__Concern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:591:1: ( rule__Concern__Group__6__Impl )
            // InternalBurst.g:592:2: rule__Concern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalBurst.g:598:1: rule__Concern__Group__6__Impl : ( '}' ) ;
    public final void rule__Concern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:602:1: ( ( '}' ) )
            // InternalBurst.g:603:1: ( '}' )
            {
            // InternalBurst.g:603:1: ( '}' )
            // InternalBurst.g:604:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Concern__Group_3__0"
    // InternalBurst.g:614:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:618:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalBurst.g:619:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBurst.g:626:1: rule__Concern__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:630:1: ( ( 'extends' ) )
            // InternalBurst.g:631:1: ( 'extends' )
            {
            // InternalBurst.g:631:1: ( 'extends' )
            // InternalBurst.g:632:2: 'extends'
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
    // InternalBurst.g:641:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:645:1: ( rule__Concern__Group_3__1__Impl )
            // InternalBurst.g:646:2: rule__Concern__Group_3__1__Impl
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
    // InternalBurst.g:652:1: rule__Concern__Group_3__1__Impl : ( ( rule__Concern__SupertypeAssignment_3_1 ) ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:656:1: ( ( ( rule__Concern__SupertypeAssignment_3_1 ) ) )
            // InternalBurst.g:657:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            {
            // InternalBurst.g:657:1: ( ( rule__Concern__SupertypeAssignment_3_1 ) )
            // InternalBurst.g:658:2: ( rule__Concern__SupertypeAssignment_3_1 )
            {
             before(grammarAccess.getConcernAccess().getSupertypeAssignment_3_1()); 
            // InternalBurst.g:659:2: ( rule__Concern__SupertypeAssignment_3_1 )
            // InternalBurst.g:659:3: rule__Concern__SupertypeAssignment_3_1
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


    // $ANTLR start "rule__Member__Group__0"
    // InternalBurst.g:668:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:672:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalBurst.g:673:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBurst.g:680:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:684:1: ( ( () ) )
            // InternalBurst.g:685:1: ( () )
            {
            // InternalBurst.g:685:1: ( () )
            // InternalBurst.g:686:2: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // InternalBurst.g:687:2: ()
            // InternalBurst.g:687:3: 
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
    // InternalBurst.g:695:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:699:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalBurst.g:700:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBurst.g:707:1: rule__Member__Group__1__Impl : ( 'int' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:711:1: ( ( 'int' ) )
            // InternalBurst.g:712:1: ( 'int' )
            {
            // InternalBurst.g:712:1: ( 'int' )
            // InternalBurst.g:713:2: 'int'
            {
             before(grammarAccess.getMemberAccess().getIntKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getIntKeyword_1()); 

            }


            }

        }
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
    // InternalBurst.g:722:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:726:1: ( rule__Member__Group__2__Impl )
            // InternalBurst.g:727:2: rule__Member__Group__2__Impl
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
    // InternalBurst.g:733:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:737:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // InternalBurst.g:738:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // InternalBurst.g:738:1: ( ( rule__Member__NameAssignment_2 ) )
            // InternalBurst.g:739:2: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // InternalBurst.g:740:2: ( rule__Member__NameAssignment_2 )
            // InternalBurst.g:740:3: rule__Member__NameAssignment_2
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
    // InternalBurst.g:749:1: rule__Intersection__Group__0 : rule__Intersection__Group__0__Impl rule__Intersection__Group__1 ;
    public final void rule__Intersection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:753:1: ( rule__Intersection__Group__0__Impl rule__Intersection__Group__1 )
            // InternalBurst.g:754:2: rule__Intersection__Group__0__Impl rule__Intersection__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalBurst.g:761:1: rule__Intersection__Group__0__Impl : ( () ) ;
    public final void rule__Intersection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:765:1: ( ( () ) )
            // InternalBurst.g:766:1: ( () )
            {
            // InternalBurst.g:766:1: ( () )
            // InternalBurst.g:767:2: ()
            {
             before(grammarAccess.getIntersectionAccess().getIntersectionAction_0()); 
            // InternalBurst.g:768:2: ()
            // InternalBurst.g:768:3: 
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
    // InternalBurst.g:776:1: rule__Intersection__Group__1 : rule__Intersection__Group__1__Impl rule__Intersection__Group__2 ;
    public final void rule__Intersection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:780:1: ( rule__Intersection__Group__1__Impl rule__Intersection__Group__2 )
            // InternalBurst.g:781:2: rule__Intersection__Group__1__Impl rule__Intersection__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:788:1: rule__Intersection__Group__1__Impl : ( 'when' ) ;
    public final void rule__Intersection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:792:1: ( ( 'when' ) )
            // InternalBurst.g:793:1: ( 'when' )
            {
            // InternalBurst.g:793:1: ( 'when' )
            // InternalBurst.g:794:2: 'when'
            {
             before(grammarAccess.getIntersectionAccess().getWhenKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getWhenKeyword_1()); 

            }


            }

        }
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
    // InternalBurst.g:803:1: rule__Intersection__Group__2 : rule__Intersection__Group__2__Impl rule__Intersection__Group__3 ;
    public final void rule__Intersection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:807:1: ( rule__Intersection__Group__2__Impl rule__Intersection__Group__3 )
            // InternalBurst.g:808:2: rule__Intersection__Group__2__Impl rule__Intersection__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalBurst.g:815:1: rule__Intersection__Group__2__Impl : ( ( rule__Intersection__QualifiersAssignment_2 )* ) ;
    public final void rule__Intersection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:819:1: ( ( ( rule__Intersection__QualifiersAssignment_2 )* ) )
            // InternalBurst.g:820:1: ( ( rule__Intersection__QualifiersAssignment_2 )* )
            {
            // InternalBurst.g:820:1: ( ( rule__Intersection__QualifiersAssignment_2 )* )
            // InternalBurst.g:821:2: ( rule__Intersection__QualifiersAssignment_2 )*
            {
             before(grammarAccess.getIntersectionAccess().getQualifiersAssignment_2()); 
            // InternalBurst.g:822:2: ( rule__Intersection__QualifiersAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:822:3: rule__Intersection__QualifiersAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Intersection__QualifiersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntersectionAccess().getQualifiersAssignment_2()); 

            }


            }

        }
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
    // InternalBurst.g:830:1: rule__Intersection__Group__3 : rule__Intersection__Group__3__Impl rule__Intersection__Group__4 ;
    public final void rule__Intersection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:834:1: ( rule__Intersection__Group__3__Impl rule__Intersection__Group__4 )
            // InternalBurst.g:835:2: rule__Intersection__Group__3__Impl rule__Intersection__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBurst.g:842:1: rule__Intersection__Group__3__Impl : ( '{' ) ;
    public final void rule__Intersection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:846:1: ( ( '{' ) )
            // InternalBurst.g:847:1: ( '{' )
            {
            // InternalBurst.g:847:1: ( '{' )
            // InternalBurst.g:848:2: '{'
            {
             before(grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalBurst.g:857:1: rule__Intersection__Group__4 : rule__Intersection__Group__4__Impl rule__Intersection__Group__5 ;
    public final void rule__Intersection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:861:1: ( rule__Intersection__Group__4__Impl rule__Intersection__Group__5 )
            // InternalBurst.g:862:2: rule__Intersection__Group__4__Impl rule__Intersection__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalBurst.g:869:1: rule__Intersection__Group__4__Impl : ( ( rule__Intersection__LinesContentAssignment_4 )* ) ;
    public final void rule__Intersection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:873:1: ( ( ( rule__Intersection__LinesContentAssignment_4 )* ) )
            // InternalBurst.g:874:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            {
            // InternalBurst.g:874:1: ( ( rule__Intersection__LinesContentAssignment_4 )* )
            // InternalBurst.g:875:2: ( rule__Intersection__LinesContentAssignment_4 )*
            {
             before(grammarAccess.getIntersectionAccess().getLinesContentAssignment_4()); 
            // InternalBurst.g:876:2: ( rule__Intersection__LinesContentAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:876:3: rule__Intersection__LinesContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Intersection__LinesContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBurst.g:884:1: rule__Intersection__Group__5 : rule__Intersection__Group__5__Impl ;
    public final void rule__Intersection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:888:1: ( rule__Intersection__Group__5__Impl )
            // InternalBurst.g:889:2: rule__Intersection__Group__5__Impl
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
    // InternalBurst.g:895:1: rule__Intersection__Group__5__Impl : ( '}' ) ;
    public final void rule__Intersection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:899:1: ( ( '}' ) )
            // InternalBurst.g:900:1: ( '}' )
            {
            // InternalBurst.g:900:1: ( '}' )
            // InternalBurst.g:901:2: '}'
            {
             before(grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalBurst.g:911:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:915:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalBurst.g:916:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBurst.g:923:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:927:1: ( ( () ) )
            // InternalBurst.g:928:1: ( () )
            {
            // InternalBurst.g:928:1: ( () )
            // InternalBurst.g:929:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalBurst.g:930:2: ()
            // InternalBurst.g:930:3: 
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
    // InternalBurst.g:938:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:942:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalBurst.g:943:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBurst.g:950:1: rule__Line__Group__1__Impl : ( 'call' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:954:1: ( ( 'call' ) )
            // InternalBurst.g:955:1: ( 'call' )
            {
            // InternalBurst.g:955:1: ( 'call' )
            // InternalBurst.g:956:2: 'call'
            {
             before(grammarAccess.getLineAccess().getCallKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getCallKeyword_1()); 

            }


            }

        }
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
    // InternalBurst.g:965:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:969:1: ( rule__Line__Group__2__Impl )
            // InternalBurst.g:970:2: rule__Line__Group__2__Impl
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
    // InternalBurst.g:976:1: rule__Line__Group__2__Impl : ( ( rule__Line__CalledAssignment_2 )* ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:980:1: ( ( ( rule__Line__CalledAssignment_2 )* ) )
            // InternalBurst.g:981:1: ( ( rule__Line__CalledAssignment_2 )* )
            {
            // InternalBurst.g:981:1: ( ( rule__Line__CalledAssignment_2 )* )
            // InternalBurst.g:982:2: ( rule__Line__CalledAssignment_2 )*
            {
             before(grammarAccess.getLineAccess().getCalledAssignment_2()); 
            // InternalBurst.g:983:2: ( rule__Line__CalledAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:983:3: rule__Line__CalledAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Line__CalledAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getCalledAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Qualifier__Group_0__0"
    // InternalBurst.g:992:1: rule__Qualifier__Group_0__0 : rule__Qualifier__Group_0__0__Impl rule__Qualifier__Group_0__1 ;
    public final void rule__Qualifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:996:1: ( rule__Qualifier__Group_0__0__Impl rule__Qualifier__Group_0__1 )
            // InternalBurst.g:997:2: rule__Qualifier__Group_0__0__Impl rule__Qualifier__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Qualifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_0__0"


    // $ANTLR start "rule__Qualifier__Group_0__0__Impl"
    // InternalBurst.g:1004:1: rule__Qualifier__Group_0__0__Impl : ( () ) ;
    public final void rule__Qualifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1008:1: ( ( () ) )
            // InternalBurst.g:1009:1: ( () )
            {
            // InternalBurst.g:1009:1: ( () )
            // InternalBurst.g:1010:2: ()
            {
             before(grammarAccess.getQualifierAccess().getQualifierAction_0_0()); 
            // InternalBurst.g:1011:2: ()
            // InternalBurst.g:1011:3: 
            {
            }

             after(grammarAccess.getQualifierAccess().getQualifierAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_0__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_0__1"
    // InternalBurst.g:1019:1: rule__Qualifier__Group_0__1 : rule__Qualifier__Group_0__1__Impl ;
    public final void rule__Qualifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1023:1: ( rule__Qualifier__Group_0__1__Impl )
            // InternalBurst.g:1024:2: rule__Qualifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_0__1"


    // $ANTLR start "rule__Qualifier__Group_0__1__Impl"
    // InternalBurst.g:1030:1: rule__Qualifier__Group_0__1__Impl : ( ( rule__Qualifier__NameAssignment_0_1 ) ) ;
    public final void rule__Qualifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1034:1: ( ( ( rule__Qualifier__NameAssignment_0_1 ) ) )
            // InternalBurst.g:1035:1: ( ( rule__Qualifier__NameAssignment_0_1 ) )
            {
            // InternalBurst.g:1035:1: ( ( rule__Qualifier__NameAssignment_0_1 ) )
            // InternalBurst.g:1036:2: ( rule__Qualifier__NameAssignment_0_1 )
            {
             before(grammarAccess.getQualifierAccess().getNameAssignment_0_1()); 
            // InternalBurst.g:1037:2: ( rule__Qualifier__NameAssignment_0_1 )
            // InternalBurst.g:1037:3: rule__Qualifier__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_0__1__Impl"


    // $ANTLR start "rule__File__ImportsAssignment_0"
    // InternalBurst.g:1046:1: rule__File__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__File__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1050:1: ( ( ruleImport ) )
            // InternalBurst.g:1051:2: ( ruleImport )
            {
            // InternalBurst.g:1051:2: ( ruleImport )
            // InternalBurst.g:1052:3: ruleImport
            {
             before(grammarAccess.getFileAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFileAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ImportsAssignment_0"


    // $ANTLR start "rule__File__ConcernsAssignment_1_0"
    // InternalBurst.g:1061:1: rule__File__ConcernsAssignment_1_0 : ( ruleConcern ) ;
    public final void rule__File__ConcernsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1065:1: ( ( ruleConcern ) )
            // InternalBurst.g:1066:2: ( ruleConcern )
            {
            // InternalBurst.g:1066:2: ( ruleConcern )
            // InternalBurst.g:1067:3: ruleConcern
            {
             before(grammarAccess.getFileAccess().getConcernsConcernParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcern();

            state._fsp--;

             after(grammarAccess.getFileAccess().getConcernsConcernParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ConcernsAssignment_1_0"


    // $ANTLR start "rule__File__ExternIntersectionsAssignment_1_1"
    // InternalBurst.g:1076:1: rule__File__ExternIntersectionsAssignment_1_1 : ( ruleIntersection ) ;
    public final void rule__File__ExternIntersectionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1080:1: ( ( ruleIntersection ) )
            // InternalBurst.g:1081:2: ( ruleIntersection )
            {
            // InternalBurst.g:1081:2: ( ruleIntersection )
            // InternalBurst.g:1082:3: ruleIntersection
            {
             before(grammarAccess.getFileAccess().getExternIntersectionsIntersectionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersection();

            state._fsp--;

             after(grammarAccess.getFileAccess().getExternIntersectionsIntersectionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ExternIntersectionsAssignment_1_1"


    // $ANTLR start "rule__Import__NameAssignment_2"
    // InternalBurst.g:1091:1: rule__Import__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Import__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1095:1: ( ( RULE_ID ) )
            // InternalBurst.g:1096:2: ( RULE_ID )
            {
            // InternalBurst.g:1096:2: ( RULE_ID )
            // InternalBurst.g:1097:3: RULE_ID
            {
             before(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_2"


    // $ANTLR start "rule__Concern__NameAssignment_2"
    // InternalBurst.g:1106:1: rule__Concern__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1110:1: ( ( RULE_ID ) )
            // InternalBurst.g:1111:2: ( RULE_ID )
            {
            // InternalBurst.g:1111:2: ( RULE_ID )
            // InternalBurst.g:1112:3: RULE_ID
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
    // InternalBurst.g:1121:1: rule__Concern__SupertypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Concern__SupertypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1125:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:1126:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:1126:2: ( ( RULE_ID ) )
            // InternalBurst.g:1127:3: ( RULE_ID )
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0()); 
            // InternalBurst.g:1128:3: ( RULE_ID )
            // InternalBurst.g:1129:4: RULE_ID
            {
             before(grammarAccess.getConcernAccess().getSupertypeConcernIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getSupertypeConcernIDTerminalRuleCall_3_1_0_1()); 

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


    // $ANTLR start "rule__Concern__MembersAssignment_5_0"
    // InternalBurst.g:1140:1: rule__Concern__MembersAssignment_5_0 : ( ruleMember ) ;
    public final void rule__Concern__MembersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1144:1: ( ( ruleMember ) )
            // InternalBurst.g:1145:2: ( ruleMember )
            {
            // InternalBurst.g:1145:2: ( ruleMember )
            // InternalBurst.g:1146:3: ruleMember
            {
             before(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__MembersAssignment_5_0"


    // $ANTLR start "rule__Concern__IntersectionsAssignment_5_1"
    // InternalBurst.g:1155:1: rule__Concern__IntersectionsAssignment_5_1 : ( ruleIntersection ) ;
    public final void rule__Concern__IntersectionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1159:1: ( ( ruleIntersection ) )
            // InternalBurst.g:1160:2: ( ruleIntersection )
            {
            // InternalBurst.g:1160:2: ( ruleIntersection )
            // InternalBurst.g:1161:3: ruleIntersection
            {
             before(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntersection();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concern__IntersectionsAssignment_5_1"


    // $ANTLR start "rule__Member__NameAssignment_2"
    // InternalBurst.g:1170:1: rule__Member__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1174:1: ( ( RULE_ID ) )
            // InternalBurst.g:1175:2: ( RULE_ID )
            {
            // InternalBurst.g:1175:2: ( RULE_ID )
            // InternalBurst.g:1176:3: RULE_ID
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


    // $ANTLR start "rule__Intersection__QualifiersAssignment_2"
    // InternalBurst.g:1185:1: rule__Intersection__QualifiersAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Intersection__QualifiersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1189:1: ( ( ( RULE_ID ) ) )
            // InternalBurst.g:1190:2: ( ( RULE_ID ) )
            {
            // InternalBurst.g:1190:2: ( ( RULE_ID ) )
            // InternalBurst.g:1191:3: ( RULE_ID )
            {
             before(grammarAccess.getIntersectionAccess().getQualifiersConcernCrossReference_2_0()); 
            // InternalBurst.g:1192:3: ( RULE_ID )
            // InternalBurst.g:1193:4: RULE_ID
            {
             before(grammarAccess.getIntersectionAccess().getQualifiersConcernIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntersectionAccess().getQualifiersConcernIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIntersectionAccess().getQualifiersConcernCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intersection__QualifiersAssignment_2"


    // $ANTLR start "rule__Intersection__LinesContentAssignment_4"
    // InternalBurst.g:1204:1: rule__Intersection__LinesContentAssignment_4 : ( ruleLine ) ;
    public final void rule__Intersection__LinesContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1208:1: ( ( ruleLine ) )
            // InternalBurst.g:1209:2: ( ruleLine )
            {
            // InternalBurst.g:1209:2: ( ruleLine )
            // InternalBurst.g:1210:3: ruleLine
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


    // $ANTLR start "rule__Line__CalledAssignment_2"
    // InternalBurst.g:1219:1: rule__Line__CalledAssignment_2 : ( ruleQualifier ) ;
    public final void rule__Line__CalledAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1223:1: ( ( ruleQualifier ) )
            // InternalBurst.g:1224:2: ( ruleQualifier )
            {
            // InternalBurst.g:1224:2: ( ruleQualifier )
            // InternalBurst.g:1225:3: ruleQualifier
            {
             before(grammarAccess.getLineAccess().getCalledQualifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCalledQualifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__CalledAssignment_2"


    // $ANTLR start "rule__Qualifier__NameAssignment_0_1"
    // InternalBurst.g:1234:1: rule__Qualifier__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Qualifier__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBurst.g:1238:1: ( ( RULE_ID ) )
            // InternalBurst.g:1239:2: ( RULE_ID )
            {
            // InternalBurst.g:1239:2: ( RULE_ID )
            // InternalBurst.g:1240:3: RULE_ID
            {
             before(grammarAccess.getQualifierAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__NameAssignment_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001012L});

}