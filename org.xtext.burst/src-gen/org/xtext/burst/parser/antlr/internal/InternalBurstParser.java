package org.xtext.burst.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.burst.services.BurstGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBurstParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "','", "'>'", "'as'", "'is'", "'when'", "'and'", "'('", "')'", "'called'", "'stop'", "'if'", "'else'", "'='", "'new'", "':'", "'.'", "'true'", "'false'", "'this'", "'null'", "'1'", "'0'"
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

        public InternalBurstParser(TokenStream input, BurstGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected BurstGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalBurst.g:65:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalBurst.g:65:45: (iv_ruleFile= ruleFile EOF )
            // InternalBurst.g:66:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalBurst.g:72:1: ruleFile returns [EObject current=null] : ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_1=null;
        Token this_ENDLINE_3=null;
        Token this_ENDLINE_5=null;
        EObject lv_Imports_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:78:2: ( ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* ) )
            // InternalBurst.g:79:2: ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* )
            {
            // InternalBurst.g:79:2: ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* )
            // InternalBurst.g:80:3: () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )*
            {
            // InternalBurst.g:80:3: ()
            // InternalBurst.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFileAccess().getFileAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:87:3: (this_ENDLINE_1= RULE_ENDLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENDLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:88:4: this_ENDLINE_1= RULE_ENDLINE
            	    {
            	    this_ENDLINE_1=(Token)match(input,RULE_ENDLINE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ENDLINE_1, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBurst.g:93:3: ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:94:4: ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:94:4: ( (lv_Imports_2_0= ruleImport ) )
            	    // InternalBurst.g:95:5: (lv_Imports_2_0= ruleImport )
            	    {
            	    // InternalBurst.g:95:5: (lv_Imports_2_0= ruleImport )
            	    // InternalBurst.g:96:6: lv_Imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_Imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"Imports",
            	      							lv_Imports_2_0,
            	      							"org.xtext.burst.Burst.Import");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBurst.g:113:4: (this_ENDLINE_3= RULE_ENDLINE )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ENDLINE) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalBurst.g:114:5: this_ENDLINE_3= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_ENDLINE_3, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalBurst.g:120:3: ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:121:4: ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:121:4: ( (lv_elements_4_0= ruleFileElement ) )
            	    // InternalBurst.g:122:5: (lv_elements_4_0= ruleFileElement )
            	    {
            	    // InternalBurst.g:122:5: (lv_elements_4_0= ruleFileElement )
            	    // InternalBurst.g:123:6: lv_elements_4_0= ruleFileElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_elements_4_0=ruleFileElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFileRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_4_0,
            	      							"org.xtext.burst.Burst.FileElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBurst.g:140:4: (this_ENDLINE_5= RULE_ENDLINE )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ENDLINE) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalBurst.g:141:5: this_ENDLINE_5= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_ENDLINE_5, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleFileElement"
    // InternalBurst.g:151:1: entryRuleFileElement returns [EObject current=null] : iv_ruleFileElement= ruleFileElement EOF ;
    public final EObject entryRuleFileElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileElement = null;


        try {
            // InternalBurst.g:151:52: (iv_ruleFileElement= ruleFileElement EOF )
            // InternalBurst.g:152:2: iv_ruleFileElement= ruleFileElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFileElement=ruleFileElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileElement"


    // $ANTLR start "ruleFileElement"
    // InternalBurst.g:158:1: ruleFileElement returns [EObject current=null] : (this_Roles_0= ruleRoles | this_Package_1= rulePackage ) ;
    public final EObject ruleFileElement() throws RecognitionException {
        EObject current = null;

        EObject this_Roles_0 = null;

        EObject this_Package_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:164:2: ( (this_Roles_0= ruleRoles | this_Package_1= rulePackage ) )
            // InternalBurst.g:165:2: (this_Roles_0= ruleRoles | this_Package_1= rulePackage )
            {
            // InternalBurst.g:165:2: (this_Roles_0= ruleRoles | this_Package_1= rulePackage )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:166:3: this_Roles_0= ruleRoles
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Roles_0=ruleRoles();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Roles_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBurst.g:175:3: this_Package_1= rulePackage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Package_1=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Package_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileElement"


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:187:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBurst.g:187:47: (iv_ruleImport= ruleImport EOF )
            // InternalBurst.g:188:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBurst.g:194:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:200:2: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) )
            // InternalBurst.g:201:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            {
            // InternalBurst.g:201:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            // InternalBurst.g:202:3: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            {
            // InternalBurst.g:202:3: ()
            // InternalBurst.g:203:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImportAccess().getImportAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
              		
            }
            // InternalBurst.g:213:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalBurst.g:214:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:214:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalBurst.g:215:5: lv_importedNamespace_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_2_0,
              						"org.xtext.burst.Burst.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRoles"
    // InternalBurst.g:236:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalBurst.g:236:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalBurst.g:237:2: iv_ruleRoles= ruleRoles EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRolesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoles; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalBurst.g:243:1: ruleRoles returns [EObject current=null] : ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:249:2: ( ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:250:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:250:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:251:3: () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:251:3: ()
            // InternalBurst.g:252:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRolesAccess().getRoleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getRoleKeyword_1());
              		
            }
            // InternalBurst.g:262:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:263:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:263:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:264:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRolesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.burst.Burst.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRulePackage"
    // InternalBurst.g:284:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalBurst.g:284:48: (iv_rulePackage= rulePackage EOF )
            // InternalBurst.g:285:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalBurst.g:291:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ENDLINE_3=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        Token this_ENDLINE_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:297:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) )
            // InternalBurst.g:298:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            {
            // InternalBurst.g:298:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            // InternalBurst.g:299:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}'
            {
            // InternalBurst.g:299:3: ()
            // InternalBurst.g:300:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPackageAccess().getPackageAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
              		
            }
            // InternalBurst.g:310:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalBurst.g:311:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:311:4: (lv_name_2_0= ruleQualifiedName )
            // InternalBurst.g:312:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.burst.Burst.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:329:3: (this_ENDLINE_3= RULE_ENDLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ENDLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:330:4: this_ENDLINE_3= RULE_ENDLINE
            	    {
            	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ENDLINE_3, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalBurst.g:339:3: (this_ENDLINE_5= RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ENDLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:340:4: this_ENDLINE_5= RULE_ENDLINE
            	    {
            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ENDLINE_5, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalBurst.g:345:3: ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=17 && LA10_0<=18)||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:346:4: ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:346:4: ( (lv_elements_6_0= rulePackageElement ) )
            	    // InternalBurst.g:347:5: (lv_elements_6_0= rulePackageElement )
            	    {
            	    // InternalBurst.g:347:5: (lv_elements_6_0= rulePackageElement )
            	    // InternalBurst.g:348:6: lv_elements_6_0= rulePackageElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_elements_6_0=rulePackageElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_6_0,
            	      							"org.xtext.burst.Burst.PackageElement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBurst.g:365:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ENDLINE) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalBurst.g:366:5: this_ENDLINE_7= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_ENDLINE_7, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackageElement"
    // InternalBurst.g:380:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalBurst.g:380:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalBurst.g:381:2: iv_rulePackageElement= rulePackageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageElement=rulePackageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageElement"


    // $ANTLR start "rulePackageElement"
    // InternalBurst.g:387:1: rulePackageElement returns [EObject current=null] : (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Concern_0 = null;

        EObject this_Template_1 = null;

        EObject this_RuleIntersect_2 = null;



        	enterRule();

        try {
            // InternalBurst.g:393:2: ( (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect ) )
            // InternalBurst.g:394:2: (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect )
            {
            // InternalBurst.g:394:2: (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBurst.g:395:3: this_Concern_0= ruleConcern
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Concern_0=ruleConcern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Concern_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBurst.g:404:3: this_Template_1= ruleTemplate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Template_1=ruleTemplate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Template_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBurst.g:413:3: this_RuleIntersect_2= ruleRuleIntersect
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_2=ruleRuleIntersect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RuleIntersect_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:425:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalBurst.g:425:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalBurst.g:426:2: iv_ruleConcern= ruleConcern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcernRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcern=ruleConcern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcern"


    // $ANTLR start "ruleConcern"
    // InternalBurst.g:432:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_ENDLINE_3=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        Token this_ENDLINE_7=null;
        Token otherlv_8=null;
        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:438:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? ) )
            // InternalBurst.g:439:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? )
            {
            // InternalBurst.g:439:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? )
            // InternalBurst.g:440:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?
            {
            // InternalBurst.g:440:3: ()
            // InternalBurst.g:441:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConcernAccess().getConcernAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
              		
            }
            // InternalBurst.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConcernRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.burst.Burst.ID");
              				
            }

            }


            }

            // InternalBurst.g:469:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:470:4: (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}'
                    {
                    // InternalBurst.g:470:4: (this_ENDLINE_3= RULE_ENDLINE )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ENDLINE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBurst.g:471:5: this_ENDLINE_3= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_3, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1());
                      			
                    }
                    // InternalBurst.g:480:4: (this_ENDLINE_5= RULE_ENDLINE )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ENDLINE) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBurst.g:481:5: this_ENDLINE_5= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_5, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalBurst.g:486:4: ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||(LA15_0>=22 && LA15_0<=24)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBurst.g:487:5: ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+
                    	    {
                    	    // InternalBurst.g:487:5: ( (lv_elements_6_0= ruleConcernElement ) )
                    	    // InternalBurst.g:488:6: (lv_elements_6_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:488:6: (lv_elements_6_0= ruleConcernElement )
                    	    // InternalBurst.g:489:7: lv_elements_6_0= ruleConcernElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_elements_6_0=ruleConcernElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"org.xtext.burst.Burst.ConcernElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalBurst.g:506:5: (this_ENDLINE_7= RULE_ENDLINE )+
                    	    int cnt14=0;
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( (LA14_0==RULE_ENDLINE) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:507:6: this_ENDLINE_7= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_9); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_ENDLINE_7, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt14 >= 1 ) break loop14;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(14, input);
                    	                throw eee;
                    	        }
                    	        cnt14++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcern"


    // $ANTLR start "entryRuleTemplate"
    // InternalBurst.g:522:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalBurst.g:522:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalBurst.g:523:2: iv_ruleTemplate= ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalBurst.g:529:1: ruleTemplate returns [EObject current=null] : ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_ENDLINE_8=null;
        Token otherlv_9=null;
        Token this_ENDLINE_10=null;
        Token this_ENDLINE_12=null;
        Token otherlv_13=null;
        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:535:2: ( ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? ) )
            // InternalBurst.g:536:2: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? )
            {
            // InternalBurst.g:536:2: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? )
            // InternalBurst.g:537:3: () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?
            {
            // InternalBurst.g:537:3: ()
            // InternalBurst.g:538:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTemplateAccess().getTemplateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getTemplateKeyword_1());
              		
            }
            // InternalBurst.g:548:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:549:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:549:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:550:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTemplateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.xtext.burst.Burst.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTemplateAccess().getLessThanSignKeyword_3());
              		
            }
            // InternalBurst.g:570:3: ( (otherlv_4= RULE_ID ) )
            // InternalBurst.g:571:4: (otherlv_4= RULE_ID )
            {
            // InternalBurst.g:571:4: (otherlv_4= RULE_ID )
            // InternalBurst.g:572:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTemplateRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0());
              				
            }

            }


            }

            // InternalBurst.g:583:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:584:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getTemplateAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalBurst.g:588:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalBurst.g:589:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalBurst.g:589:5: (otherlv_6= RULE_ID )
            	    // InternalBurst.g:590:6: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTemplateRule());
            	      						}
            	      					
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_6, grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6());
              		
            }
            // InternalBurst.g:606:3: ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalBurst.g:607:4: (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}'
                    {
                    // InternalBurst.g:607:4: (this_ENDLINE_8= RULE_ENDLINE )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ENDLINE) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBurst.g:608:5: this_ENDLINE_8= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_8, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1());
                      			
                    }
                    // InternalBurst.g:617:4: (this_ENDLINE_10= RULE_ENDLINE )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ENDLINE) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalBurst.g:618:5: this_ENDLINE_10= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_10, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // InternalBurst.g:623:4: ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||(LA21_0>=22 && LA21_0<=24)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBurst.g:624:5: ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+
                    	    {
                    	    // InternalBurst.g:624:5: ( (lv_elements_11_0= ruleConcernElement ) )
                    	    // InternalBurst.g:625:6: (lv_elements_11_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:625:6: (lv_elements_11_0= ruleConcernElement )
                    	    // InternalBurst.g:626:7: lv_elements_11_0= ruleConcernElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_elements_11_0=ruleConcernElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTemplateRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_11_0,
                    	      								"org.xtext.burst.Burst.ConcernElement");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalBurst.g:643:5: (this_ENDLINE_12= RULE_ENDLINE )+
                    	    int cnt20=0;
                    	    loop20:
                    	    do {
                    	        int alt20=2;
                    	        int LA20_0 = input.LA(1);

                    	        if ( (LA20_0==RULE_ENDLINE) ) {
                    	            alt20=1;
                    	        }


                    	        switch (alt20) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:644:6: this_ENDLINE_12= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_12=(Token)match(input,RULE_ENDLINE,FOLLOW_9); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_ENDLINE_12, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt20 >= 1 ) break loop20;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(20, input);
                    	                throw eee;
                    	        }
                    	        cnt20++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleConcernElement"
    // InternalBurst.g:659:1: entryRuleConcernElement returns [EObject current=null] : iv_ruleConcernElement= ruleConcernElement EOF ;
    public final EObject entryRuleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcernElement = null;


        try {
            // InternalBurst.g:659:55: (iv_ruleConcernElement= ruleConcernElement EOF )
            // InternalBurst.g:660:2: iv_ruleConcernElement= ruleConcernElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcernElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcernElement=ruleConcernElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcernElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcernElement"


    // $ANTLR start "ruleConcernElement"
    // InternalBurst.g:666:1: ruleConcernElement returns [EObject current=null] : (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) ;
    public final EObject ruleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject this_Member_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:672:2: ( (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) )
            // InternalBurst.g:673:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            {
            // InternalBurst.g:673:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=22 && LA23_0<=23)) ) {
                alt23=1;
            }
            else if ( (LA23_0==24) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBurst.g:674:3: this_Member_0= ruleMember
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Member_0=ruleMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Member_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBurst.g:683:3: this_RuleIntersect_1= ruleRuleIntersect
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_1=ruleRuleIntersect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RuleIntersect_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcernElement"


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:695:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:695:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:696:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalBurst.g:702:1: ruleMember returns [EObject current=null] : ( () ( (lv_actAs_1_0= 'as' ) )? ( (lv_isContent_2_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_actAs_1_0=null;
        Token lv_isContent_2_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalBurst.g:708:2: ( ( () ( (lv_actAs_1_0= 'as' ) )? ( (lv_isContent_2_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalBurst.g:709:2: ( () ( (lv_actAs_1_0= 'as' ) )? ( (lv_isContent_2_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalBurst.g:709:2: ( () ( (lv_actAs_1_0= 'as' ) )? ( (lv_isContent_2_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) ) )
            // InternalBurst.g:710:3: () ( (lv_actAs_1_0= 'as' ) )? ( (lv_isContent_2_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalBurst.g:710:3: ()
            // InternalBurst.g:711:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMemberAccess().getMemberAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:717:3: ( (lv_actAs_1_0= 'as' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBurst.g:718:4: (lv_actAs_1_0= 'as' )
                    {
                    // InternalBurst.g:718:4: (lv_actAs_1_0= 'as' )
                    // InternalBurst.g:719:5: lv_actAs_1_0= 'as'
                    {
                    lv_actAs_1_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_actAs_1_0, grammarAccess.getMemberAccess().getActAsAsKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMemberRule());
                      					}
                      					setWithLastConsumed(current, "actAs", true, "as");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBurst.g:731:3: ( (lv_isContent_2_0= 'is' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBurst.g:732:4: (lv_isContent_2_0= 'is' )
                    {
                    // InternalBurst.g:732:4: (lv_isContent_2_0= 'is' )
                    // InternalBurst.g:733:5: lv_isContent_2_0= 'is'
                    {
                    lv_isContent_2_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isContent_2_0, grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMemberRule());
                      					}
                      					setWithLastConsumed(current, "isContent", true, "is");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBurst.g:745:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:746:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:746:4: ( ruleQualifiedName )
            // InternalBurst.g:747:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMemberRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:761:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBurst.g:762:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBurst.g:762:4: (lv_name_4_0= RULE_ID )
            // InternalBurst.g:763:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMemberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.xtext.burst.Burst.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleRuleIntersect"
    // InternalBurst.g:783:1: entryRuleRuleIntersect returns [EObject current=null] : iv_ruleRuleIntersect= ruleRuleIntersect EOF ;
    public final EObject entryRuleRuleIntersect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIntersect = null;


        try {
            // InternalBurst.g:783:54: (iv_ruleRuleIntersect= ruleRuleIntersect EOF )
            // InternalBurst.g:784:2: iv_ruleRuleIntersect= ruleRuleIntersect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleIntersectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleIntersect=ruleRuleIntersect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleIntersect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleIntersect"


    // $ANTLR start "ruleRuleIntersect"
    // InternalBurst.g:790:1: ruleRuleIntersect returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* ( (lv_block_9_0= ruleBlock ) ) ) ;
    public final EObject ruleRuleIntersect() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_ENDLINE_2=null;
        Token this_ENDLINE_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ENDLINE_7=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_block_9_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:796:2: ( ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* ( (lv_block_9_0= ruleBlock ) ) ) )
            // InternalBurst.g:797:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* ( (lv_block_9_0= ruleBlock ) ) )
            {
            // InternalBurst.g:797:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* ( (lv_block_9_0= ruleBlock ) ) )
            // InternalBurst.g:798:3: () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* ( (lv_block_9_0= ruleBlock ) )
            {
            // InternalBurst.g:798:3: ()
            // InternalBurst.g:799:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:805:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:806:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:806:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:807:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRuleIntersectRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "when");
              				
            }

            }


            }

            // InternalBurst.g:819:3: (this_ENDLINE_2= RULE_ENDLINE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ENDLINE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBurst.g:820:4: this_ENDLINE_2= RULE_ENDLINE
            	    {
            	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalBurst.g:825:3: ( (lv_params_3_0= ruleParameter ) )
            // InternalBurst.g:826:4: (lv_params_3_0= ruleParameter )
            {
            // InternalBurst.g:826:4: (lv_params_3_0= ruleParameter )
            // InternalBurst.g:827:5: lv_params_3_0= ruleParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_params_3_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
              					}
              					add(
              						current,
              						"params",
              						lv_params_3_0,
              						"org.xtext.burst.Burst.Parameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:844:3: ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ENDLINE && LA30_0<=RULE_ID)||LA30_0==20||LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBurst.g:845:4: (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' )? (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) )
            	    {
            	    // InternalBurst.g:845:4: (this_ENDLINE_4= RULE_ENDLINE )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==RULE_ENDLINE) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalBurst.g:846:5: this_ENDLINE_4= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_16); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_ENDLINE_4, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    // InternalBurst.g:851:4: (otherlv_5= ',' | otherlv_6= 'and' )?
            	    int alt28=3;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==20) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==25) ) {
            	        alt28=2;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalBurst.g:852:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBurst.g:857:5: otherlv_6= 'and'
            	            {
            	            otherlv_6=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalBurst.g:862:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==RULE_ENDLINE) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalBurst.g:863:5: this_ENDLINE_7= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_ENDLINE_7, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    // InternalBurst.g:868:4: ( (lv_params_8_0= ruleParameter ) )
            	    // InternalBurst.g:869:5: (lv_params_8_0= ruleParameter )
            	    {
            	    // InternalBurst.g:869:5: (lv_params_8_0= ruleParameter )
            	    // InternalBurst.g:870:6: lv_params_8_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_params_8_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"params",
            	      							lv_params_8_0,
            	      							"org.xtext.burst.Burst.Parameter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalBurst.g:888:3: ( (lv_block_9_0= ruleBlock ) )
            // InternalBurst.g:889:4: (lv_block_9_0= ruleBlock )
            {
            // InternalBurst.g:889:4: (lv_block_9_0= ruleBlock )
            // InternalBurst.g:890:5: lv_block_9_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleIntersectAccess().getBlockBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_9_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_9_0,
              						"org.xtext.burst.Burst.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleIntersect"


    // $ANTLR start "entryRuleBlock"
    // InternalBurst.g:911:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalBurst.g:911:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalBurst.g:912:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalBurst.g:918:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' (this_ENDLINE_2= RULE_ENDLINE )* ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )? otherlv_7= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ENDLINE_2=null;
        Token this_ENDLINE_4=null;
        Token this_ENDLINE_6=null;
        Token otherlv_7=null;
        EObject lv_lines_3_0 = null;

        EObject lv_lines_5_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:924:2: ( ( () otherlv_1= '{' (this_ENDLINE_2= RULE_ENDLINE )* ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )? otherlv_7= '}' ) )
            // InternalBurst.g:925:2: ( () otherlv_1= '{' (this_ENDLINE_2= RULE_ENDLINE )* ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )? otherlv_7= '}' )
            {
            // InternalBurst.g:925:2: ( () otherlv_1= '{' (this_ENDLINE_2= RULE_ENDLINE )* ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )? otherlv_7= '}' )
            // InternalBurst.g:926:3: () otherlv_1= '{' (this_ENDLINE_2= RULE_ENDLINE )* ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )? otherlv_7= '}'
            {
            // InternalBurst.g:926:3: ()
            // InternalBurst.g:927:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalBurst.g:937:3: (this_ENDLINE_2= RULE_ENDLINE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ENDLINE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBurst.g:938:4: this_ENDLINE_2= RULE_ENDLINE
            	    {
            	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ENDLINE_2, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalBurst.g:943:3: ( ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==15||LA35_0==26||(LA35_0>=29 && LA35_0<=30)||LA35_0==33||(LA35_0>=36 && LA35_0<=41)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBurst.g:944:4: ( (lv_lines_3_0= ruleLine ) ) ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )* (this_ENDLINE_6= RULE_ENDLINE )*
                    {
                    // InternalBurst.g:944:4: ( (lv_lines_3_0= ruleLine ) )
                    // InternalBurst.g:945:5: (lv_lines_3_0= ruleLine )
                    {
                    // InternalBurst.g:945:5: (lv_lines_3_0= ruleLine )
                    // InternalBurst.g:946:6: lv_lines_3_0= ruleLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_lines_3_0=ruleLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlockRule());
                      						}
                      						add(
                      							current,
                      							"lines",
                      							lv_lines_3_0,
                      							"org.xtext.burst.Burst.Line");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBurst.g:963:4: ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        alt33 = dfa33.predict(input);
                        switch (alt33) {
                    	case 1 :
                    	    // InternalBurst.g:964:5: (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) )
                    	    {
                    	    // InternalBurst.g:964:5: (this_ENDLINE_4= RULE_ENDLINE )+
                    	    int cnt32=0;
                    	    loop32:
                    	    do {
                    	        int alt32=2;
                    	        int LA32_0 = input.LA(1);

                    	        if ( (LA32_0==RULE_ENDLINE) ) {
                    	            alt32=1;
                    	        }


                    	        switch (alt32) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:965:6: this_ENDLINE_4= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_19); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_ENDLINE_4, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_1_0());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt32 >= 1 ) break loop32;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(32, input);
                    	                throw eee;
                    	        }
                    	        cnt32++;
                    	    } while (true);

                    	    // InternalBurst.g:970:5: ( (lv_lines_5_0= ruleLine ) )
                    	    // InternalBurst.g:971:6: (lv_lines_5_0= ruleLine )
                    	    {
                    	    // InternalBurst.g:971:6: (lv_lines_5_0= ruleLine )
                    	    // InternalBurst.g:972:7: lv_lines_5_0= ruleLine
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBlockAccess().getLinesLineParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_lines_5_0=ruleLine();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"lines",
                    	      								lv_lines_5_0,
                    	      								"org.xtext.burst.Burst.Line");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // InternalBurst.g:990:4: (this_ENDLINE_6= RULE_ENDLINE )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ENDLINE) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalBurst.g:991:5: this_ENDLINE_6= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_6, grammarAccess.getBlockAccess().getENDLINETerminalRuleCall_3_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:1005:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBurst.g:1005:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBurst.g:1006:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalBurst.g:1012:1: ruleParameter returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalBurst.g:1018:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) ) ) )
            // InternalBurst.g:1019:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) ) )
            {
            // InternalBurst.g:1019:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) ) )
            // InternalBurst.g:1020:3: () ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) )
            {
            // InternalBurst.g:1020:3: ()
            // InternalBurst.g:1021:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getParameterAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:1027:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) | ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' ) )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt36=2;
                    }
                    break;
                case 26:
                    {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==RULE_ID) ) {
                        int LA36_5 = input.LA(4);

                        if ( (LA36_5==27) ) {
                            alt36=2;
                        }
                        else if ( (LA36_5==28||LA36_5==35) ) {
                            alt36=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ENDLINE:
                case RULE_ID:
                case 15:
                case 20:
                case 25:
                    {
                    alt36=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalBurst.g:1028:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalBurst.g:1028:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalBurst.g:1029:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalBurst.g:1029:5: (lv_name_1_0= RULE_ID )
                    // InternalBurst.g:1030:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParameterRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.xtext.burst.Burst.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:1047:4: ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' )
                    {
                    // InternalBurst.g:1047:4: ( ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' )
                    // InternalBurst.g:1048:5: ( ( ruleQualifiedName ) ) otherlv_3= '(' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')'
                    {
                    // InternalBurst.g:1048:5: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:1049:6: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:1049:6: ( ruleQualifiedName )
                    // InternalBurst.g:1050:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParameterRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_1_1());
                      				
                    }
                    // InternalBurst.g:1068:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalBurst.g:1069:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalBurst.g:1069:6: (lv_name_4_0= RULE_ID )
                    // InternalBurst.g:1070:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_4_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParameterRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_4_0,
                      								"org.xtext.burst.Burst.ID");
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_1_3());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:1092:4: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' )
                    {
                    // InternalBurst.g:1092:4: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')' )
                    // InternalBurst.g:1093:5: ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( ruleQualifiedName ) ) otherlv_9= 'called' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ')'
                    {
                    // InternalBurst.g:1093:5: ( (otherlv_6= RULE_ID ) )
                    // InternalBurst.g:1094:6: (otherlv_6= RULE_ID )
                    {
                    // InternalBurst.g:1094:6: (otherlv_6= RULE_ID )
                    // InternalBurst.g:1095:7: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParameterRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRoleRoleCrossReference_1_2_0_0());
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_2_1());
                      				
                    }
                    // InternalBurst.g:1110:5: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:1111:6: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:1111:6: ( ruleQualifiedName )
                    // InternalBurst.g:1112:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParameterRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getCalledKeyword_1_2_3());
                      				
                    }
                    // InternalBurst.g:1130:5: ( (lv_name_10_0= RULE_ID ) )
                    // InternalBurst.g:1131:6: (lv_name_10_0= RULE_ID )
                    {
                    // InternalBurst.g:1131:6: (lv_name_10_0= RULE_ID )
                    // InternalBurst.g:1132:7: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_10_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_2_4_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getParameterRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_10_0,
                      								"org.xtext.burst.Burst.ID");
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_2_5());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:1158:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:1158:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:1159:2: iv_ruleLine= ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalBurst.g:1165:1: ruleLine returns [EObject current=null] : (this_Block_0= ruleBlock | this_Call_1= ruleCall | this_ContextManagement_2= ruleContextManagement | this_If_3= ruleIf | this_Stop_4= ruleStop ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Call_1 = null;

        EObject this_ContextManagement_2 = null;

        EObject this_If_3 = null;

        EObject this_Stop_4 = null;



        	enterRule();

        try {
            // InternalBurst.g:1171:2: ( (this_Block_0= ruleBlock | this_Call_1= ruleCall | this_ContextManagement_2= ruleContextManagement | this_If_3= ruleIf | this_Stop_4= ruleStop ) )
            // InternalBurst.g:1172:2: (this_Block_0= ruleBlock | this_Call_1= ruleCall | this_ContextManagement_2= ruleContextManagement | this_If_3= ruleIf | this_Stop_4= ruleStop )
            {
            // InternalBurst.g:1172:2: (this_Block_0= ruleBlock | this_Call_1= ruleCall | this_ContextManagement_2= ruleContextManagement | this_If_3= ruleIf | this_Stop_4= ruleStop )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt37=1;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 26:
            case 33:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt37=2;
                }
                break;
            case 40:
            case 41:
                {
                alt37=3;
                }
                break;
            case 30:
                {
                alt37=4;
                }
                break;
            case 29:
                {
                alt37=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalBurst.g:1173:3: this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLineAccess().getBlockParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1182:3: this_Call_1= ruleCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLineAccess().getCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Call_1=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Call_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBurst.g:1191:3: this_ContextManagement_2= ruleContextManagement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLineAccess().getContextManagementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContextManagement_2=ruleContextManagement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ContextManagement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBurst.g:1200:3: this_If_3= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLineAccess().getIfParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_3=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBurst.g:1209:3: this_Stop_4= ruleStop
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLineAccess().getStopParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Stop_4=ruleStop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Stop_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleStop"
    // InternalBurst.g:1221:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalBurst.g:1221:45: (iv_ruleStop= ruleStop EOF )
            // InternalBurst.g:1222:2: iv_ruleStop= ruleStop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalBurst.g:1228:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'stop' ( (lv_condition_2_0= ruleCall ) )? ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1234:2: ( ( () otherlv_1= 'stop' ( (lv_condition_2_0= ruleCall ) )? ) )
            // InternalBurst.g:1235:2: ( () otherlv_1= 'stop' ( (lv_condition_2_0= ruleCall ) )? )
            {
            // InternalBurst.g:1235:2: ( () otherlv_1= 'stop' ( (lv_condition_2_0= ruleCall ) )? )
            // InternalBurst.g:1236:3: () otherlv_1= 'stop' ( (lv_condition_2_0= ruleCall ) )?
            {
            // InternalBurst.g:1236:3: ()
            // InternalBurst.g:1237:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStopAccess().getStopAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
              		
            }
            // InternalBurst.g:1247:3: ( (lv_condition_2_0= ruleCall ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||LA38_0==26||LA38_0==33||(LA38_0>=36 && LA38_0<=39)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBurst.g:1248:4: (lv_condition_2_0= ruleCall )
                    {
                    // InternalBurst.g:1248:4: (lv_condition_2_0= ruleCall )
                    // InternalBurst.g:1249:5: lv_condition_2_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStopAccess().getConditionCallParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_condition_2_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStopRule());
                      					}
                      					set(
                      						current,
                      						"condition",
                      						lv_condition_2_0,
                      						"org.xtext.burst.Burst.Call");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleIf"
    // InternalBurst.g:1270:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalBurst.g:1270:43: (iv_ruleIf= ruleIf EOF )
            // InternalBurst.g:1271:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalBurst.g:1277:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_expression_2_0= ruleCall ) ) ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) ) ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ENDLINE_4=null;
        Token this_ENDLINE_6=null;
        Token otherlv_7=null;
        Token this_ENDLINE_8=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_3_0 = null;

        EObject lv_thenBlock_5_0 = null;

        EObject lv_elseBlock_9_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1283:2: ( ( () otherlv_1= 'if' ( (lv_expression_2_0= ruleCall ) ) ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) ) ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )? ) )
            // InternalBurst.g:1284:2: ( () otherlv_1= 'if' ( (lv_expression_2_0= ruleCall ) ) ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) ) ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )? )
            {
            // InternalBurst.g:1284:2: ( () otherlv_1= 'if' ( (lv_expression_2_0= ruleCall ) ) ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) ) ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )? )
            // InternalBurst.g:1285:3: () otherlv_1= 'if' ( (lv_expression_2_0= ruleCall ) ) ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) ) ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )?
            {
            // InternalBurst.g:1285:3: ()
            // InternalBurst.g:1286:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfAccess().getIfAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
              		
            }
            // InternalBurst.g:1296:3: ( (lv_expression_2_0= ruleCall ) )
            // InternalBurst.g:1297:4: (lv_expression_2_0= ruleCall )
            {
            // InternalBurst.g:1297:4: (lv_expression_2_0= ruleCall )
            // InternalBurst.g:1298:5: lv_expression_2_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getExpressionCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expression_2_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.burst.Burst.Call");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:1315:3: ( ( (lv_thenBlock_3_0= ruleBlock ) ) | ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ENDLINE) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalBurst.g:1316:4: ( (lv_thenBlock_3_0= ruleBlock ) )
                    {
                    // InternalBurst.g:1316:4: ( (lv_thenBlock_3_0= ruleBlock ) )
                    // InternalBurst.g:1317:5: (lv_thenBlock_3_0= ruleBlock )
                    {
                    // InternalBurst.g:1317:5: (lv_thenBlock_3_0= ruleBlock )
                    // InternalBurst.g:1318:6: lv_thenBlock_3_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getThenBlockBlockParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_thenBlock_3_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"thenBlock",
                      							lv_thenBlock_3_0,
                      							"org.xtext.burst.Burst.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:1336:4: ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) )
                    {
                    // InternalBurst.g:1336:4: ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) ) )
                    // InternalBurst.g:1337:5: (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_thenBlock_5_0= ruleLine ) )
                    {
                    // InternalBurst.g:1337:5: (this_ENDLINE_4= RULE_ENDLINE )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ENDLINE) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalBurst.g:1338:6: this_ENDLINE_4= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_ENDLINE_4, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_3_1_0());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    // InternalBurst.g:1343:5: ( (lv_thenBlock_5_0= ruleLine ) )
                    // InternalBurst.g:1344:6: (lv_thenBlock_5_0= ruleLine )
                    {
                    // InternalBurst.g:1344:6: (lv_thenBlock_5_0= ruleLine )
                    // InternalBurst.g:1345:7: lv_thenBlock_5_0= ruleLine
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getIfAccess().getThenBlockLineParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_25);
                    lv_thenBlock_5_0=ruleLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getIfRule());
                      							}
                      							set(
                      								current,
                      								"thenBlock",
                      								lv_thenBlock_5_0,
                      								"org.xtext.burst.Burst.Line");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBurst.g:1364:3: ( ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ENDLINE) ) {
                alt43=1;
            }
            else if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBurst.g:1365:4: ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )* otherlv_7= 'else' (this_ENDLINE_8= RULE_ENDLINE )* ( (lv_elseBlock_9_0= ruleLine ) )
                    {
                    // InternalBurst.g:1365:4: ( ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ENDLINE) && (synpred1_InternalBurst())) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalBurst.g:1366:5: ( RULE_ENDLINE )=>this_ENDLINE_6= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_6, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getIfAccess().getElseKeyword_4_1());
                      			
                    }
                    // InternalBurst.g:1377:4: (this_ENDLINE_8= RULE_ENDLINE )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ENDLINE) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalBurst.g:1378:5: this_ENDLINE_8= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ENDLINE_8, grammarAccess.getIfAccess().getENDLINETerminalRuleCall_4_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // InternalBurst.g:1383:4: ( (lv_elseBlock_9_0= ruleLine ) )
                    // InternalBurst.g:1384:5: (lv_elseBlock_9_0= ruleLine )
                    {
                    // InternalBurst.g:1384:5: (lv_elseBlock_9_0= ruleLine )
                    // InternalBurst.g:1385:6: lv_elseBlock_9_0= ruleLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getElseBlockLineParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_9_0=ruleLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_9_0,
                      							"org.xtext.burst.Burst.Line");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleContextManagement"
    // InternalBurst.g:1407:1: entryRuleContextManagement returns [EObject current=null] : iv_ruleContextManagement= ruleContextManagement EOF ;
    public final EObject entryRuleContextManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextManagement = null;


        try {
            // InternalBurst.g:1407:58: (iv_ruleContextManagement= ruleContextManagement EOF )
            // InternalBurst.g:1408:2: iv_ruleContextManagement= ruleContextManagement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextManagementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContextManagement=ruleContextManagement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextManagement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextManagement"


    // $ANTLR start "ruleContextManagement"
    // InternalBurst.g:1414:1: ruleContextManagement returns [EObject current=null] : ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) ) ;
    public final EObject ruleContextManagement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_action_1_0 = null;

        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1420:2: ( ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) ) )
            // InternalBurst.g:1421:2: ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) )
            {
            // InternalBurst.g:1421:2: ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) )
            // InternalBurst.g:1422:3: () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) )
            {
            // InternalBurst.g:1422:3: ()
            // InternalBurst.g:1423:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getContextManagementAccess().getContextManagementAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:1429:3: ( (lv_action_1_0= ruleconcernManagment ) )
            // InternalBurst.g:1430:4: (lv_action_1_0= ruleconcernManagment )
            {
            // InternalBurst.g:1430:4: (lv_action_1_0= ruleconcernManagment )
            // InternalBurst.g:1431:5: lv_action_1_0= ruleconcernManagment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_action_1_0=ruleconcernManagment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContextManagementRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_1_0,
              						"org.xtext.burst.Burst.concernManagment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:1448:3: ( (lv_target_2_0= ruleAccess ) )
            // InternalBurst.g:1449:4: (lv_target_2_0= ruleAccess )
            {
            // InternalBurst.g:1449:4: (lv_target_2_0= ruleAccess )
            // InternalBurst.g:1450:5: lv_target_2_0= ruleAccess
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getContextManagementRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_2_0,
              						"org.xtext.burst.Burst.Access");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextManagement"


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:1471:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:1471:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:1472:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalBurst.g:1478:1: ruleCall returns [EObject current=null] : ( () ( (lv_content_1_0= ruleCallElement ) )+ ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )? ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_equality_2_0=null;
        EObject lv_content_1_0 = null;

        EObject lv_source_3_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1484:2: ( ( () ( (lv_content_1_0= ruleCallElement ) )+ ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )? ) )
            // InternalBurst.g:1485:2: ( () ( (lv_content_1_0= ruleCallElement ) )+ ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )? )
            {
            // InternalBurst.g:1485:2: ( () ( (lv_content_1_0= ruleCallElement ) )+ ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )? )
            // InternalBurst.g:1486:3: () ( (lv_content_1_0= ruleCallElement ) )+ ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )?
            {
            // InternalBurst.g:1486:3: ()
            // InternalBurst.g:1487:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCallAccess().getCallAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:1493:3: ( (lv_content_1_0= ruleCallElement ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_STRING)||LA44_0==26||LA44_0==33||(LA44_0>=36 && LA44_0<=39)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalBurst.g:1494:4: (lv_content_1_0= ruleCallElement )
            	    {
            	    // InternalBurst.g:1494:4: (lv_content_1_0= ruleCallElement )
            	    // InternalBurst.g:1495:5: lv_content_1_0= ruleCallElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_content_1_0=ruleCallElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"content",
            	      						lv_content_1_0,
            	      						"org.xtext.burst.Burst.CallElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // InternalBurst.g:1512:3: ( ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBurst.g:1513:4: ( (lv_equality_2_0= '=' ) ) ( (lv_source_3_0= ruleCallElement ) )+
                    {
                    // InternalBurst.g:1513:4: ( (lv_equality_2_0= '=' ) )
                    // InternalBurst.g:1514:5: (lv_equality_2_0= '=' )
                    {
                    // InternalBurst.g:1514:5: (lv_equality_2_0= '=' )
                    // InternalBurst.g:1515:6: lv_equality_2_0= '='
                    {
                    lv_equality_2_0=(Token)match(input,32,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_equality_2_0, grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCallRule());
                      						}
                      						setWithLastConsumed(current, "equality", true, "=");
                      					
                    }

                    }


                    }

                    // InternalBurst.g:1527:4: ( (lv_source_3_0= ruleCallElement ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==26||LA45_0==33||(LA45_0>=36 && LA45_0<=39)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalBurst.g:1528:5: (lv_source_3_0= ruleCallElement )
                    	    {
                    	    // InternalBurst.g:1528:5: (lv_source_3_0= ruleCallElement )
                    	    // InternalBurst.g:1529:6: lv_source_3_0= ruleCallElement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_2_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_source_3_0=ruleCallElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getCallRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"source",
                    	      							lv_source_3_0,
                    	      							"org.xtext.burst.Burst.CallElement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleCallElement"
    // InternalBurst.g:1551:1: entryRuleCallElement returns [EObject current=null] : iv_ruleCallElement= ruleCallElement EOF ;
    public final EObject entryRuleCallElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallElement = null;


        try {
            // InternalBurst.g:1551:52: (iv_ruleCallElement= ruleCallElement EOF )
            // InternalBurst.g:1552:2: iv_ruleCallElement= ruleCallElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallElement=ruleCallElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallElement"


    // $ANTLR start "ruleCallElement"
    // InternalBurst.g:1558:1: ruleCallElement returns [EObject current=null] : (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall | this_TerminalExpression_3= ruleTerminalExpression ) ;
    public final EObject ruleCallElement() throws RecognitionException {
        EObject current = null;

        EObject this_Locale_0 = null;

        EObject this_Access_1 = null;

        EObject this_SubCall_2 = null;

        EObject this_TerminalExpression_3 = null;



        	enterRule();

        try {
            // InternalBurst.g:1564:2: ( (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall | this_TerminalExpression_3= ruleTerminalExpression ) )
            // InternalBurst.g:1565:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall | this_TerminalExpression_3= ruleTerminalExpression )
            {
            // InternalBurst.g:1565:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall | this_TerminalExpression_3= ruleTerminalExpression )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                alt47=2;
                }
                break;
            case 26:
                {
                alt47=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalBurst.g:1566:3: this_Locale_0= ruleLocale
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Locale_0=ruleLocale();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Locale_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1575:3: this_Access_1= ruleAccess
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Access_1=ruleAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Access_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBurst.g:1584:3: this_SubCall_2= ruleSubCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SubCall_2=ruleSubCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SubCall_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBurst.g:1593:3: this_TerminalExpression_3= ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCallElementAccess().getTerminalExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TerminalExpression_3=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TerminalExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallElement"


    // $ANTLR start "entryRuleLocale"
    // InternalBurst.g:1605:1: entryRuleLocale returns [EObject current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final EObject entryRuleLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocale = null;


        try {
            // InternalBurst.g:1605:47: (iv_ruleLocale= ruleLocale EOF )
            // InternalBurst.g:1606:2: iv_ruleLocale= ruleLocale EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocaleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocale=ruleLocale();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocale; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocale"


    // $ANTLR start "ruleLocale"
    // InternalBurst.g:1612:1: ruleLocale returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBurst.g:1618:2: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1619:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1619:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1620:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1620:3: ()
            // InternalBurst.g:1621:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLocaleAccess().getLocaleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocaleAccess().getNewKeyword_1());
              		
            }
            // InternalBurst.g:1631:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1632:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1632:4: ( ruleQualifiedName )
            // InternalBurst.g:1633:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLocaleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBurst.g:1647:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:1648:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:1648:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:1649:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLocaleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.xtext.burst.Burst.ID");
              				
            }

            }


            }

            // InternalBurst.g:1665:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==34) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBurst.g:1666:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getLocaleAccess().getColonKeyword_4_0());
            	      			
            	    }
            	    // InternalBurst.g:1670:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1671:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1671:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1672:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getLocaleRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocale"


    // $ANTLR start "entryRuleAccess"
    // InternalBurst.g:1688:1: entryRuleAccess returns [EObject current=null] : iv_ruleAccess= ruleAccess EOF ;
    public final EObject entryRuleAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccess = null;


        try {
            // InternalBurst.g:1688:47: (iv_ruleAccess= ruleAccess EOF )
            // InternalBurst.g:1689:2: iv_ruleAccess= ruleAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccess=ruleAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccess"


    // $ANTLR start "ruleAccess"
    // InternalBurst.g:1695:1: ruleAccess returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBurst.g:1701:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1702:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1702:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1703:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1703:3: ()
            // InternalBurst.g:1704:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAccessAccess().getAccessAction_0(),
              					current);
              			
            }

            }

            // InternalBurst.g:1710:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:1711:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:1711:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:1712:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAccessRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0());
              				
            }

            }


            }

            // InternalBurst.g:1723:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==35) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBurst.g:1724:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAccessAccess().getFullStopKeyword_2_0());
            	      			
            	    }
            	    // InternalBurst.g:1728:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBurst.g:1729:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBurst.g:1729:5: (otherlv_3= RULE_ID )
            	    // InternalBurst.g:1730:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAccessRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalBurst.g:1742:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBurst.g:1743:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getAccessAccess().getColonKeyword_3_0());
            	      			
            	    }
            	    // InternalBurst.g:1747:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1748:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1748:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1749:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAccessRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleSubCall"
    // InternalBurst.g:1765:1: entryRuleSubCall returns [EObject current=null] : iv_ruleSubCall= ruleSubCall EOF ;
    public final EObject entryRuleSubCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCall = null;


        try {
            // InternalBurst.g:1765:48: (iv_ruleSubCall= ruleSubCall EOF )
            // InternalBurst.g:1766:2: iv_ruleSubCall= ruleSubCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubCall=ruleSubCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubCall"


    // $ANTLR start "ruleSubCall"
    // InternalBurst.g:1772:1: ruleSubCall returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_content_2_0= ruleCall ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSubCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1778:2: ( ( () otherlv_1= '(' ( (lv_content_2_0= ruleCall ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1779:2: ( () otherlv_1= '(' ( (lv_content_2_0= ruleCall ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1779:2: ( () otherlv_1= '(' ( (lv_content_2_0= ruleCall ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1780:3: () otherlv_1= '(' ( (lv_content_2_0= ruleCall ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1780:3: ()
            // InternalBurst.g:1781:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSubCallAccess().getCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalBurst.g:1791:3: ( (lv_content_2_0= ruleCall ) )
            // InternalBurst.g:1792:4: (lv_content_2_0= ruleCall )
            {
            // InternalBurst.g:1792:4: (lv_content_2_0= ruleCall )
            // InternalBurst.g:1793:5: lv_content_2_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubCallAccess().getContentCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_content_2_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSubCallRule());
              					}
              					add(
              						current,
              						"content",
              						lv_content_2_0,
              						"org.xtext.burst.Burst.Call");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalBurst.g:1814:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==34) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBurst.g:1815:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSubCallAccess().getColonKeyword_4_0());
            	      			
            	    }
            	    // InternalBurst.g:1819:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1820:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1820:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1821:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSubCallRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubCall"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalBurst.g:1837:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalBurst.g:1837:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalBurst.g:1838:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalBurst.g:1844:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT ) | ( () ( (lv_value_11_0= 'this' ) ) ) | ( () ( (lv_value_13_0= 'null' ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token this_INT_9=null;
        Token lv_value_11_0=null;
        Token lv_value_13_0=null;


        	enterRule();

        try {
            // InternalBurst.g:1850:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT ) | ( () ( (lv_value_11_0= 'this' ) ) ) | ( () ( (lv_value_13_0= 'null' ) ) ) ) )
            // InternalBurst.g:1851:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT ) | ( () ( (lv_value_11_0= 'this' ) ) ) | ( () ( (lv_value_13_0= 'null' ) ) ) )
            {
            // InternalBurst.g:1851:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT ) | ( () ( (lv_value_11_0= 'this' ) ) ) | ( () ( (lv_value_13_0= 'null' ) ) ) )
            int alt53=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==EOF||(LA53_1>=RULE_ENDLINE && LA53_1<=RULE_STRING)||(LA53_1>=15 && LA53_1<=16)||(LA53_1>=26 && LA53_1<=27)||(LA53_1>=31 && LA53_1<=33)||(LA53_1>=36 && LA53_1<=39)) ) {
                    alt53=1;
                }
                else if ( (LA53_1==35) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case 36:
            case 37:
                {
                alt53=3;
                }
                break;
            case 38:
                {
                alt53=5;
                }
                break;
            case 39:
                {
                alt53=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalBurst.g:1852:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalBurst.g:1852:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalBurst.g:1853:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalBurst.g:1853:4: ()
                    // InternalBurst.g:1854:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:1860:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalBurst.g:1861:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalBurst.g:1861:5: (lv_value_1_0= RULE_INT )
                    // InternalBurst.g:1862:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.xtext.burst.Burst.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:1880:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalBurst.g:1880:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalBurst.g:1881:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalBurst.g:1881:4: ()
                    // InternalBurst.g:1882:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:1888:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalBurst.g:1889:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalBurst.g:1889:5: (lv_value_3_0= RULE_STRING )
                    // InternalBurst.g:1890:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.xtext.burst.Burst.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBurst.g:1908:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalBurst.g:1908:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalBurst.g:1909:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalBurst.g:1909:4: ()
                    // InternalBurst.g:1910:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:1916:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalBurst.g:1917:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalBurst.g:1917:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalBurst.g:1918:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalBurst.g:1918:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==36) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==37) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalBurst.g:1919:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalBurst.g:1930:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBurst.g:1945:3: ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT )
                    {
                    // InternalBurst.g:1945:3: ( () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT )
                    // InternalBurst.g:1946:4: () ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '.' this_INT_9= RULE_INT
                    {
                    // InternalBurst.g:1946:4: ()
                    // InternalBurst.g:1947:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getDoubleConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:1953:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalBurst.g:1954:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalBurst.g:1954:5: (lv_value_7_0= RULE_INT )
                    // InternalBurst.g:1955:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.xtext.burst.Burst.INT");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTerminalExpressionAccess().getFullStopKeyword_3_2());
                      			
                    }
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_9, grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBurst.g:1981:3: ( () ( (lv_value_11_0= 'this' ) ) )
                    {
                    // InternalBurst.g:1981:3: ( () ( (lv_value_11_0= 'this' ) ) )
                    // InternalBurst.g:1982:4: () ( (lv_value_11_0= 'this' ) )
                    {
                    // InternalBurst.g:1982:4: ()
                    // InternalBurst.g:1983:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getThisConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:1989:4: ( (lv_value_11_0= 'this' ) )
                    // InternalBurst.g:1990:5: (lv_value_11_0= 'this' )
                    {
                    // InternalBurst.g:1990:5: (lv_value_11_0= 'this' )
                    // InternalBurst.g:1991:6: lv_value_11_0= 'this'
                    {
                    lv_value_11_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getTerminalExpressionAccess().getValueThisKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_11_0, "this");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBurst.g:2005:3: ( () ( (lv_value_13_0= 'null' ) ) )
                    {
                    // InternalBurst.g:2005:3: ( () ( (lv_value_13_0= 'null' ) ) )
                    // InternalBurst.g:2006:4: () ( (lv_value_13_0= 'null' ) )
                    {
                    // InternalBurst.g:2006:4: ()
                    // InternalBurst.g:2007:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNullConstantAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBurst.g:2013:4: ( (lv_value_13_0= 'null' ) )
                    // InternalBurst.g:2014:5: (lv_value_13_0= 'null' )
                    {
                    // InternalBurst.g:2014:5: (lv_value_13_0= 'null' )
                    // InternalBurst.g:2015:6: lv_value_13_0= 'null'
                    {
                    lv_value_13_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_13_0, grammarAccess.getTerminalExpressionAccess().getValueNullKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_13_0, "null");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:2032:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:2032:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:2033:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBurst.g:2039:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:2045:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:2046:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:2046:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:2047:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalBurst.g:2054:3: (kw= '.' this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==35) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalBurst.g:2055:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleconcernManagment"
    // InternalBurst.g:2072:1: ruleconcernManagment returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) ) ;
    public final Enumerator ruleconcernManagment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBurst.g:2078:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) ) )
            // InternalBurst.g:2079:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) )
            {
            // InternalBurst.g:2079:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            else if ( (LA55_0==41) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalBurst.g:2080:3: (enumLiteral_0= '1' )
                    {
                    // InternalBurst.g:2080:3: (enumLiteral_0= '1' )
                    // InternalBurst.g:2081:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:2088:3: (enumLiteral_1= '0' )
                    {
                    // InternalBurst.g:2088:3: (enumLiteral_1= '0' )
                    // InternalBurst.g:2089:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconcernManagment"

    // $ANTLR start synpred1_InternalBurst
    public final void synpred1_InternalBurst_fragment() throws RecognitionException {   
        // InternalBurst.g:1366:5: ( RULE_ENDLINE )
        // InternalBurst.g:1366:6: RULE_ENDLINE
        {
        match(input,RULE_ENDLINE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBurst

    // Delegated rules

    public final boolean synpred1_InternalBurst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBurst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\30\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\2\3\3\5\uffff\1\3",
            "\1\1\12\uffff\1\2\3\3\5\uffff\1\3",
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
            return "469:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?";
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
            return "606:3: ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?";
        }
    }
    static final String dfa_8s = "\1\20\1\51\2\uffff";
    static final String dfa_9s = "\2\uffff\1\2\1\1";
    static final String[] dfa_10s = {
            "\1\1\13\uffff\1\2",
            "\1\1\3\3\7\uffff\1\3\1\2\11\uffff\1\3\2\uffff\2\3\2\uffff\1\3\2\uffff\6\3",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 963:4: ( (this_ENDLINE_4= RULE_ENDLINE )+ ( (lv_lines_5_0= ruleLine ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001070010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C70030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002108030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002100030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003F2661180F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003F2661080F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F2040000E2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000F2040000E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000F3040000E2L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});

}