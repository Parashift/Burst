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

@SuppressWarnings("all")
public class InternalBurstParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "','", "'>'", "'as'", "'is'", "'when'", "'and'", "'with'", "':'", "'='", "'new'", "'.'", "'('", "')'", "'1'", "'0'"
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
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

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
            	    this_ENDLINE_1=(Token)match(input,RULE_ENDLINE,FOLLOW_3); 

            	    				newLeafNode(this_ENDLINE_1, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1());
            	    			

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

            	    						newCompositeNode(grammarAccess.getFileAccess().getImportsImportParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_Imports_2_0=ruleImport();

            	    state._fsp--;


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
            	    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_3); 

            	    	    					newLeafNode(this_ENDLINE_3, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_2_1());
            	    	    				

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

            	    						newCompositeNode(grammarAccess.getFileAccess().getElementsFileElementParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_elements_4_0=ruleFileElement();

            	    state._fsp--;


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
            	    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_4); 

            	    	    					newLeafNode(this_ENDLINE_5, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_3_1());
            	    	    				

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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getFileElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileElement=ruleFileElement();

            state._fsp--;

             current =iv_ruleFileElement; 
            match(input,EOF,FOLLOW_2); 

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
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:166:3: this_Roles_0= ruleRoles
                    {

                    			newCompositeNode(grammarAccess.getFileElementAccess().getRolesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Roles_0=ruleRoles();

                    state._fsp--;


                    			current = this_Roles_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:175:3: this_Package_1= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getFileElementAccess().getPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_1=rulePackage();

                    state._fsp--;


                    			current = this_Package_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalBurst.g:213:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalBurst.g:214:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:214:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalBurst.g:215:5: lv_importedNamespace_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;


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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRolesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;

             current =iv_ruleRoles; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getRolesAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getRoleKeyword_1());
            		
            // InternalBurst.g:262:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:263:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:263:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:264:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRolesAccess().getNameIDTerminalRuleCall_2_0());
            				

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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalBurst.g:310:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalBurst.g:311:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:311:4: (lv_name_2_0= ruleQualifiedName )
            // InternalBurst.g:312:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


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
            	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_6); 

            	    				newLeafNode(this_ENDLINE_3, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4());
            		
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
            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_7); 

            	    				newLeafNode(this_ENDLINE_5, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5());
            	    			

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

            	    						newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_elements_6_0=rulePackageElement();

            	    state._fsp--;


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
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_7); 

            	    	    					newLeafNode(this_ENDLINE_7, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_6_1());
            	    	    				

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

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getPackageElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageElement=rulePackageElement();

            state._fsp--;

             current =iv_rulePackageElement; 
            match(input,EOF,FOLLOW_2); 

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
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBurst.g:395:3: this_Concern_0= ruleConcern
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getConcernParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concern_0=ruleConcern();

                    state._fsp--;


                    			current = this_Concern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:404:3: this_Template_1= ruleTemplate
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getTemplateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Template_1=ruleTemplate();

                    state._fsp--;


                    			current = this_Template_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:413:3: this_RuleIntersect_2= ruleRuleIntersect
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_2=ruleRuleIntersect();

                    state._fsp--;


                    			current = this_RuleIntersect_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getConcernRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcern=ruleConcern();

            state._fsp--;

             current =iv_ruleConcern; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_2_0());
            				

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
                    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_6); 

                    	    					newLeafNode(this_ENDLINE_3, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_3_1());
                    			
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
                    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_5, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2());
                    	    				

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

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getElementsConcernElementParserRuleCall_3_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_elements_6_0=ruleConcernElement();

                    	    state._fsp--;


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
                    	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    	    						newLeafNode(this_ENDLINE_7, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_3_1());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt14 >= 1 ) break loop14;
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

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateAccess().getTemplateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getTemplateKeyword_1());
            		
            // InternalBurst.g:548:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:549:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:549:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:550:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_3=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateAccess().getLessThanSignKeyword_3());
            		
            // InternalBurst.g:570:3: ( (otherlv_4= RULE_ID ) )
            // InternalBurst.g:571:4: (otherlv_4= RULE_ID )
            {
            // InternalBurst.g:571:4: (otherlv_4= RULE_ID )
            // InternalBurst.g:572:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0());
            				

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
            	    otherlv_5=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTemplateAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBurst.g:588:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalBurst.g:589:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalBurst.g:589:5: (otherlv_6= RULE_ID )
            	    // InternalBurst.g:590:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTemplateRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_6, grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getTemplateAccess().getGreaterThanSignKeyword_6());
            		
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
                    	    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_6); 

                    	    					newLeafNode(this_ENDLINE_8, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
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
                    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_10, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2());
                    	    				

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

                    	    							newCompositeNode(grammarAccess.getTemplateAccess().getElementsConcernElementParserRuleCall_7_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_elements_11_0=ruleConcernElement();

                    	    state._fsp--;


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
                    	    	    this_ENDLINE_12=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    	    						newLeafNode(this_ENDLINE_12, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_3_1());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt20 >= 1 ) break loop20;
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

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getConcernElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcernElement=ruleConcernElement();

            state._fsp--;

             current =iv_ruleConcernElement; 
            match(input,EOF,FOLLOW_2); 

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
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBurst.g:674:3: this_Member_0= ruleMember
                    {

                    			newCompositeNode(grammarAccess.getConcernElementAccess().getMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Member_0=ruleMember();

                    state._fsp--;


                    			current = this_Member_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:683:3: this_RuleIntersect_1= ruleRuleIntersect
                    {

                    			newCompositeNode(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_1=ruleRuleIntersect();

                    state._fsp--;


                    			current = this_RuleIntersect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

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
                    lv_actAs_1_0=(Token)match(input,22,FOLLOW_13); 

                    					newLeafNode(lv_actAs_1_0, grammarAccess.getMemberAccess().getActAsAsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberRule());
                    					}
                    					setWithLastConsumed(current, "actAs", true, "as");
                    				

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
                    lv_isContent_2_0=(Token)match(input,23,FOLLOW_5); 

                    					newLeafNode(lv_isContent_2_0, grammarAccess.getMemberAccess().getIsContentIsKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberRule());
                    					}
                    					setWithLastConsumed(current, "isContent", true, "is");
                    				

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

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:761:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBurst.g:762:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBurst.g:762:4: (lv_name_4_0= RULE_ID )
            // InternalBurst.g:763:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_4_0());
            				

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


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRuleIntersectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleIntersect=ruleRuleIntersect();

            state._fsp--;

             current =iv_ruleRuleIntersect; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:790:1: ruleRuleIntersect returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' ) ;
    public final EObject ruleRuleIntersect() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_ENDLINE_2=null;
        Token this_ENDLINE_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ENDLINE_7=null;
        Token otherlv_9=null;
        Token this_ENDLINE_10=null;
        Token this_ENDLINE_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_ENDLINE_15=null;
        Token otherlv_17=null;
        Token this_ENDLINE_18=null;
        Token this_ENDLINE_20=null;
        Token otherlv_21=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_withParams_11_0 = null;

        EObject lv_withParams_16_0 = null;

        EObject lv_lines_19_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:796:2: ( ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' ) )
            // InternalBurst.g:797:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' )
            {
            // InternalBurst.g:797:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' )
            // InternalBurst.g:798:3: () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}'
            {
            // InternalBurst.g:798:3: ()
            // InternalBurst.g:799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:805:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:806:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:806:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:807:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,24,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleIntersectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

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
            	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_14); 

            	    				newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
            	    			

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

            					newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_params_3_0=ruleParameter();

            state._fsp--;


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

            // InternalBurst.g:844:3: ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ENDLINE||LA30_0==20||LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBurst.g:845:4: (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) )
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
            	    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_16); 

            	    	    					newLeafNode(this_ENDLINE_4, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    // InternalBurst.g:851:4: (otherlv_5= ',' | otherlv_6= 'and' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==20) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==25) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalBurst.g:852:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            	            					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalBurst.g:857:5: otherlv_6= 'and'
            	            {
            	            otherlv_6=(Token)match(input,25,FOLLOW_14); 

            	            					newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1());
            	            				

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
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_14); 

            	    	    					newLeafNode(this_ENDLINE_7, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
            	    	    				

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

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_params_8_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalBurst.g:888:3: (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBurst.g:889:4: otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_withParams_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0());
                    			
                    // InternalBurst.g:893:4: (this_ENDLINE_10= RULE_ENDLINE )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ENDLINE) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalBurst.g:894:5: this_ENDLINE_10= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_14); 

                    	    					newLeafNode(this_ENDLINE_10, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalBurst.g:899:4: ( (lv_withParams_11_0= ruleWithParameter ) )
                    // InternalBurst.g:900:5: (lv_withParams_11_0= ruleWithParameter )
                    {
                    // InternalBurst.g:900:5: (lv_withParams_11_0= ruleWithParameter )
                    // InternalBurst.g:901:6: lv_withParams_11_0= ruleWithParameter
                    {

                    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_withParams_11_0=ruleWithParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
                    						}
                    						add(
                    							current,
                    							"withParams",
                    							lv_withParams_11_0,
                    							"org.xtext.burst.Burst.WithParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBurst.g:918:4: ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ENDLINE||LA35_0==20||LA35_0==25) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalBurst.g:919:5: (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_withParams_16_0= ruleWithParameter ) )
                    	    {
                    	    // InternalBurst.g:919:5: (this_ENDLINE_12= RULE_ENDLINE )*
                    	    loop32:
                    	    do {
                    	        int alt32=2;
                    	        int LA32_0 = input.LA(1);

                    	        if ( (LA32_0==RULE_ENDLINE) ) {
                    	            alt32=1;
                    	        }


                    	        switch (alt32) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:920:6: this_ENDLINE_12= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_12=(Token)match(input,RULE_ENDLINE,FOLLOW_16); 

                    	    	    						newLeafNode(this_ENDLINE_12, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop32;
                    	        }
                    	    } while (true);

                    	    // InternalBurst.g:925:5: (otherlv_13= ',' | otherlv_14= 'and' )
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==20) ) {
                    	        alt33=1;
                    	    }
                    	    else if ( (LA33_0==25) ) {
                    	        alt33=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 33, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // InternalBurst.g:926:6: otherlv_13= ','
                    	            {
                    	            otherlv_13=(Token)match(input,20,FOLLOW_14); 

                    	            						newLeafNode(otherlv_13, grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBurst.g:931:6: otherlv_14= 'and'
                    	            {
                    	            otherlv_14=(Token)match(input,25,FOLLOW_14); 

                    	            						newLeafNode(otherlv_14, grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBurst.g:936:5: (this_ENDLINE_15= RULE_ENDLINE )*
                    	    loop34:
                    	    do {
                    	        int alt34=2;
                    	        int LA34_0 = input.LA(1);

                    	        if ( (LA34_0==RULE_ENDLINE) ) {
                    	            alt34=1;
                    	        }


                    	        switch (alt34) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:937:6: this_ENDLINE_15= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_15=(Token)match(input,RULE_ENDLINE,FOLLOW_14); 

                    	    	    						newLeafNode(this_ENDLINE_15, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop34;
                    	        }
                    	    } while (true);

                    	    // InternalBurst.g:942:5: ( (lv_withParams_16_0= ruleWithParameter ) )
                    	    // InternalBurst.g:943:6: (lv_withParams_16_0= ruleWithParameter )
                    	    {
                    	    // InternalBurst.g:943:6: (lv_withParams_16_0= ruleWithParameter )
                    	    // InternalBurst.g:944:7: lv_withParams_16_0= ruleWithParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleIntersectAccess().getWithParamsWithParameterParserRuleCall_5_3_3_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_withParams_16_0=ruleWithParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"withParams",
                    	    								lv_withParams_16_0,
                    	    								"org.xtext.burst.Burst.WithParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_17, grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBurst.g:967:3: (this_ENDLINE_18= RULE_ENDLINE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ENDLINE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBurst.g:968:4: this_ENDLINE_18= RULE_ENDLINE
            	    {
            	    this_ENDLINE_18=(Token)match(input,RULE_ENDLINE,FOLLOW_18); 

            	    				newLeafNode(this_ENDLINE_18, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalBurst.g:973:3: ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==29||LA39_0==31||(LA39_0>=33 && LA39_0<=34)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBurst.g:974:4: ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+
            	    {
            	    // InternalBurst.g:974:4: ( (lv_lines_19_0= ruleLine ) )
            	    // InternalBurst.g:975:5: (lv_lines_19_0= ruleLine )
            	    {
            	    // InternalBurst.g:975:5: (lv_lines_19_0= ruleLine )
            	    // InternalBurst.g:976:6: lv_lines_19_0= ruleLine
            	    {

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_lines_19_0=ruleLine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_19_0,
            	    							"org.xtext.burst.Burst.Line");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBurst.g:993:4: (this_ENDLINE_20= RULE_ENDLINE )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==RULE_ENDLINE) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalBurst.g:994:5: this_ENDLINE_20= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_20=(Token)match(input,RULE_ENDLINE,FOLLOW_18); 

            	    	    					newLeafNode(this_ENDLINE_20, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt38 >= 1 ) break loop38;
            	                EarlyExitException eee =
            	                    new EarlyExitException(38, input);
            	                throw eee;
            	        }
            	        cnt38++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:1008:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBurst.g:1008:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBurst.g:1009:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1015:1: ruleParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_usage_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBurst.g:1021:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalBurst.g:1022:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalBurst.g:1022:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // InternalBurst.g:1023:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalBurst.g:1023:3: ()
            // InternalBurst.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1030:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1031:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1031:4: ( ruleQualifiedName )
            // InternalBurst.g:1032:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:1046:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:1047:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:1047:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:1048:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.burst.Burst.ID");
            				

            }


            }

            // InternalBurst.g:1064:3: ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBurst.g:1065:4: ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalBurst.g:1065:4: ( (lv_usage_3_0= ':' ) )
                    // InternalBurst.g:1066:5: (lv_usage_3_0= ':' )
                    {
                    // InternalBurst.g:1066:5: (lv_usage_3_0= ':' )
                    // InternalBurst.g:1067:6: lv_usage_3_0= ':'
                    {
                    lv_usage_3_0=(Token)match(input,27,FOLLOW_5); 

                    						newLeafNode(lv_usage_3_0, grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(current, "usage", true, ":");
                    					

                    }


                    }

                    // InternalBurst.g:1079:4: ( (otherlv_4= RULE_ID ) )
                    // InternalBurst.g:1080:5: (otherlv_4= RULE_ID )
                    {
                    // InternalBurst.g:1080:5: (otherlv_4= RULE_ID )
                    // InternalBurst.g:1081:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getRoleRoleCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleWithParameter"
    // InternalBurst.g:1097:1: entryRuleWithParameter returns [EObject current=null] : iv_ruleWithParameter= ruleWithParameter EOF ;
    public final EObject entryRuleWithParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithParameter = null;


        try {
            // InternalBurst.g:1097:54: (iv_ruleWithParameter= ruleWithParameter EOF )
            // InternalBurst.g:1098:2: iv_ruleWithParameter= ruleWithParameter EOF
            {
             newCompositeNode(grammarAccess.getWithParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithParameter=ruleWithParameter();

            state._fsp--;

             current =iv_ruleWithParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWithParameter"


    // $ANTLR start "ruleWithParameter"
    // InternalBurst.g:1104:1: ruleWithParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleWithParameter() throws RecognitionException {
        EObject current = null;

        Token lv_usage_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBurst.g:1110:2: ( ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalBurst.g:1111:2: ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalBurst.g:1111:2: ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalBurst.g:1112:3: () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            // InternalBurst.g:1112:3: ()
            // InternalBurst.g:1113:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWithParameterAccess().getWithParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1119:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1120:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1120:4: ( ruleQualifiedName )
            // InternalBurst.g:1121:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWithParameterAccess().getNameConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:1135:3: ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBurst.g:1136:4: ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalBurst.g:1136:4: ( (lv_usage_2_0= ':' ) )
                    // InternalBurst.g:1137:5: (lv_usage_2_0= ':' )
                    {
                    // InternalBurst.g:1137:5: (lv_usage_2_0= ':' )
                    // InternalBurst.g:1138:6: lv_usage_2_0= ':'
                    {
                    lv_usage_2_0=(Token)match(input,27,FOLLOW_5); 

                    						newLeafNode(lv_usage_2_0, grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWithParameterRule());
                    						}
                    						setWithLastConsumed(current, "usage", true, ":");
                    					

                    }


                    }

                    // InternalBurst.g:1150:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBurst.g:1151:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBurst.g:1151:5: (otherlv_3= RULE_ID )
                    // InternalBurst.g:1152:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWithParameterRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getWithParameterAccess().getRoleRoleCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWithParameter"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:1168:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:1168:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:1169:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1175:1: ruleLine returns [EObject current=null] : (this_Call_0= ruleCall | this_ContextManagement_1= ruleContextManagement ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;

        EObject this_ContextManagement_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:1181:2: ( (this_Call_0= ruleCall | this_ContextManagement_1= ruleContextManagement ) )
            // InternalBurst.g:1182:2: (this_Call_0= ruleCall | this_ContextManagement_1= ruleContextManagement )
            {
            // InternalBurst.g:1182:2: (this_Call_0= ruleCall | this_ContextManagement_1= ruleContextManagement )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==29||LA42_0==31) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=33 && LA42_0<=34)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalBurst.g:1183:3: this_Call_0= ruleCall
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Call_0=ruleCall();

                    state._fsp--;


                    			current = this_Call_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1192:3: this_ContextManagement_1= ruleContextManagement
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getContextManagementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextManagement_1=ruleContextManagement();

                    state._fsp--;


                    			current = this_ContextManagement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleContextManagement"
    // InternalBurst.g:1204:1: entryRuleContextManagement returns [EObject current=null] : iv_ruleContextManagement= ruleContextManagement EOF ;
    public final EObject entryRuleContextManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextManagement = null;


        try {
            // InternalBurst.g:1204:58: (iv_ruleContextManagement= ruleContextManagement EOF )
            // InternalBurst.g:1205:2: iv_ruleContextManagement= ruleContextManagement EOF
            {
             newCompositeNode(grammarAccess.getContextManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextManagement=ruleContextManagement();

            state._fsp--;

             current =iv_ruleContextManagement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1211:1: ruleContextManagement returns [EObject current=null] : ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) ) ;
    public final EObject ruleContextManagement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_action_1_0 = null;

        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1217:2: ( ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) ) )
            // InternalBurst.g:1218:2: ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) )
            {
            // InternalBurst.g:1218:2: ( () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) ) )
            // InternalBurst.g:1219:3: () ( (lv_action_1_0= ruleconcernManagment ) ) ( (lv_target_2_0= ruleAccess ) )
            {
            // InternalBurst.g:1219:3: ()
            // InternalBurst.g:1220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextManagementAccess().getContextManagementAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1226:3: ( (lv_action_1_0= ruleconcernManagment ) )
            // InternalBurst.g:1227:4: (lv_action_1_0= ruleconcernManagment )
            {
            // InternalBurst.g:1227:4: (lv_action_1_0= ruleconcernManagment )
            // InternalBurst.g:1228:5: lv_action_1_0= ruleconcernManagment
            {

            					newCompositeNode(grammarAccess.getContextManagementAccess().getActionConcernManagmentEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_action_1_0=ruleconcernManagment();

            state._fsp--;


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

            // InternalBurst.g:1245:3: ( (lv_target_2_0= ruleAccess ) )
            // InternalBurst.g:1246:4: (lv_target_2_0= ruleAccess )
            {
            // InternalBurst.g:1246:4: (lv_target_2_0= ruleAccess )
            // InternalBurst.g:1247:5: lv_target_2_0= ruleAccess
            {

            					newCompositeNode(grammarAccess.getContextManagementAccess().getTargetAccessParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleAccess();

            state._fsp--;


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


            	leaveRule();

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
    // InternalBurst.g:1268:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:1268:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:1269:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1275:1: ruleCall returns [EObject current=null] : ( ( (lv_content_0_0= ruleCallElement ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )? ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_equality_1_0=null;
        EObject lv_content_0_0 = null;

        EObject lv_source_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1281:2: ( ( ( (lv_content_0_0= ruleCallElement ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )? ) )
            // InternalBurst.g:1282:2: ( ( (lv_content_0_0= ruleCallElement ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )? )
            {
            // InternalBurst.g:1282:2: ( ( (lv_content_0_0= ruleCallElement ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )? )
            // InternalBurst.g:1283:3: ( (lv_content_0_0= ruleCallElement ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )?
            {
            // InternalBurst.g:1283:3: ( (lv_content_0_0= ruleCallElement ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==29||LA43_0==31) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBurst.g:1284:4: (lv_content_0_0= ruleCallElement )
            	    {
            	    // InternalBurst.g:1284:4: (lv_content_0_0= ruleCallElement )
            	    // InternalBurst.g:1285:5: lv_content_0_0= ruleCallElement
            	    {

            	    					newCompositeNode(grammarAccess.getCallAccess().getContentCallElementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_content_0_0=ruleCallElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCallRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_0_0,
            	    						"org.xtext.burst.Burst.CallElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // InternalBurst.g:1302:3: ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+ )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBurst.g:1303:4: ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCallElement ) )+
                    {
                    // InternalBurst.g:1303:4: ( (lv_equality_1_0= '=' ) )
                    // InternalBurst.g:1304:5: (lv_equality_1_0= '=' )
                    {
                    // InternalBurst.g:1304:5: (lv_equality_1_0= '=' )
                    // InternalBurst.g:1305:6: lv_equality_1_0= '='
                    {
                    lv_equality_1_0=(Token)match(input,28,FOLLOW_21); 

                    						newLeafNode(lv_equality_1_0, grammarAccess.getCallAccess().getEqualityEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallRule());
                    						}
                    						setWithLastConsumed(current, "equality", true, "=");
                    					

                    }


                    }

                    // InternalBurst.g:1317:4: ( (lv_source_2_0= ruleCallElement ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ID||LA44_0==29||LA44_0==31) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalBurst.g:1318:5: (lv_source_2_0= ruleCallElement )
                    	    {
                    	    // InternalBurst.g:1318:5: (lv_source_2_0= ruleCallElement )
                    	    // InternalBurst.g:1319:6: lv_source_2_0= ruleCallElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getCallAccess().getSourceCallElementParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_source_2_0=ruleCallElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"source",
                    	    							lv_source_2_0,
                    	    							"org.xtext.burst.Burst.CallElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalBurst.g:1341:1: entryRuleCallElement returns [EObject current=null] : iv_ruleCallElement= ruleCallElement EOF ;
    public final EObject entryRuleCallElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallElement = null;


        try {
            // InternalBurst.g:1341:52: (iv_ruleCallElement= ruleCallElement EOF )
            // InternalBurst.g:1342:2: iv_ruleCallElement= ruleCallElement EOF
            {
             newCompositeNode(grammarAccess.getCallElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallElement=ruleCallElement();

            state._fsp--;

             current =iv_ruleCallElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1348:1: ruleCallElement returns [EObject current=null] : (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall ) ;
    public final EObject ruleCallElement() throws RecognitionException {
        EObject current = null;

        EObject this_Locale_0 = null;

        EObject this_Access_1 = null;

        EObject this_SubCall_2 = null;



        	enterRule();

        try {
            // InternalBurst.g:1354:2: ( (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall ) )
            // InternalBurst.g:1355:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall )
            {
            // InternalBurst.g:1355:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
                {
                alt46=2;
                }
                break;
            case 31:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalBurst.g:1356:3: this_Locale_0= ruleLocale
                    {

                    			newCompositeNode(grammarAccess.getCallElementAccess().getLocaleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locale_0=ruleLocale();

                    state._fsp--;


                    			current = this_Locale_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1365:3: this_Access_1= ruleAccess
                    {

                    			newCompositeNode(grammarAccess.getCallElementAccess().getAccessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Access_1=ruleAccess();

                    state._fsp--;


                    			current = this_Access_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:1374:3: this_SubCall_2= ruleSubCall
                    {

                    			newCompositeNode(grammarAccess.getCallElementAccess().getSubCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubCall_2=ruleSubCall();

                    state._fsp--;


                    			current = this_SubCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalBurst.g:1386:1: entryRuleLocale returns [EObject current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final EObject entryRuleLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocale = null;


        try {
            // InternalBurst.g:1386:47: (iv_ruleLocale= ruleLocale EOF )
            // InternalBurst.g:1387:2: iv_ruleLocale= ruleLocale EOF
            {
             newCompositeNode(grammarAccess.getLocaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocale=ruleLocale();

            state._fsp--;

             current =iv_ruleLocale; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1393:1: ruleLocale returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBurst.g:1399:2: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1400:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1400:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1401:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1401:3: ()
            // InternalBurst.g:1402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocaleAccess().getLocaleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLocaleAccess().getNewKeyword_1());
            		
            // InternalBurst.g:1412:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1413:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1413:4: ( ruleQualifiedName )
            // InternalBurst.g:1414:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocaleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLocaleAccess().getTypeConcernCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:1428:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:1429:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:1429:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:1430:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLocaleAccess().getNameIDTerminalRuleCall_3_0());
            				

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

            // InternalBurst.g:1446:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==27) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:1447:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getLocaleAccess().getColonKeyword_4_0());
            	    			
            	    // InternalBurst.g:1451:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1452:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1452:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1453:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLocaleRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_5, grammarAccess.getLocaleAccess().getRolesRoleCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalBurst.g:1469:1: entryRuleAccess returns [EObject current=null] : iv_ruleAccess= ruleAccess EOF ;
    public final EObject entryRuleAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccess = null;


        try {
            // InternalBurst.g:1469:47: (iv_ruleAccess= ruleAccess EOF )
            // InternalBurst.g:1470:2: iv_ruleAccess= ruleAccess EOF
            {
             newCompositeNode(grammarAccess.getAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccess=ruleAccess();

            state._fsp--;

             current =iv_ruleAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1476:1: ruleAccess returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBurst.g:1482:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1483:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1483:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1484:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1484:3: ()
            // InternalBurst.g:1485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessAccess().getAccessAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1491:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:1492:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:1492:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:1493:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0());
            				

            }


            }

            // InternalBurst.g:1504:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==30) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalBurst.g:1505:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAccessAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalBurst.g:1509:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBurst.g:1510:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBurst.g:1510:5: (otherlv_3= RULE_ID )
            	    // InternalBurst.g:1511:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAccessRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_3, grammarAccess.getAccessAccess().getMembersMemberCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalBurst.g:1523:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==27) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBurst.g:1524:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAccessAccess().getColonKeyword_3_0());
            	    			
            	    // InternalBurst.g:1528:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1529:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1529:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1530:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAccessRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_5, grammarAccess.getAccessAccess().getRolesRoleCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalBurst.g:1546:1: entryRuleSubCall returns [EObject current=null] : iv_ruleSubCall= ruleSubCall EOF ;
    public final EObject entryRuleSubCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCall = null;


        try {
            // InternalBurst.g:1546:48: (iv_ruleSubCall= ruleSubCall EOF )
            // InternalBurst.g:1547:2: iv_ruleSubCall= ruleSubCall EOF
            {
             newCompositeNode(grammarAccess.getSubCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubCall=ruleSubCall();

            state._fsp--;

             current =iv_ruleSubCall; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1553:1: ruleSubCall returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= ruleLine ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSubCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1559:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= ruleLine ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalBurst.g:1560:2: ( () otherlv_1= '(' ( (lv_name_2_0= ruleLine ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalBurst.g:1560:2: ( () otherlv_1= '(' ( (lv_name_2_0= ruleLine ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalBurst.g:1561:3: () otherlv_1= '(' ( (lv_name_2_0= ruleLine ) ) otherlv_3= ')' (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalBurst.g:1561:3: ()
            // InternalBurst.g:1562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubCallAccess().getSubCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBurst.g:1572:3: ( (lv_name_2_0= ruleLine ) )
            // InternalBurst.g:1573:4: (lv_name_2_0= ruleLine )
            {
            // InternalBurst.g:1573:4: (lv_name_2_0= ruleLine )
            // InternalBurst.g:1574:5: lv_name_2_0= ruleLine
            {

            					newCompositeNode(grammarAccess.getSubCallAccess().getNameLineParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_2_0=ruleLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.burst.Burst.Line");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3());
            		
            // InternalBurst.g:1595:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBurst.g:1596:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSubCallAccess().getColonKeyword_4_0());
            	    			
            	    // InternalBurst.g:1600:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalBurst.g:1601:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalBurst.g:1601:5: (otherlv_5= RULE_ID )
            	    // InternalBurst.g:1602:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubCallRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSubCallAccess().getRolesRoleCrossReference_4_1_0());
            	    					

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


            	leaveRule();

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:1618:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:1618:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:1619:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBurst.g:1625:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:1631:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:1632:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:1632:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:1633:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:1640:3: (kw= '.' this_ID_2= RULE_ID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==30) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBurst.g:1641:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalBurst.g:1658:1: ruleconcernManagment returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) ) ;
    public final Enumerator ruleconcernManagment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBurst.g:1664:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) ) )
            // InternalBurst.g:1665:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) )
            {
            // InternalBurst.g:1665:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            else if ( (LA52_0==34) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalBurst.g:1666:3: (enumLiteral_0= '1' )
                    {
                    // InternalBurst.g:1666:3: (enumLiteral_0= '1' )
                    // InternalBurst.g:1667:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConcernManagmentAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:1674:3: (enumLiteral_1= '0' )
                    {
                    // InternalBurst.g:1674:3: (enumLiteral_1= '0' )
                    // InternalBurst.g:1675:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConcernManagmentAccess().getRemoveEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006108010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002108010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000006A0010030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000B0000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000A0000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000006A0000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});

}