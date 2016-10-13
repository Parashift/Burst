package org.xtext.burst.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'role'", "'package'", "'{'", "'}'", "'concern'", "'template'", "'<'", "','", "'>'", "'is'", "'when'", "'and'", "'with'", "'new'", "':'", "'='", "'('", "')'", "'.'"
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
    // InternalBurst.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalBurst.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalBurst.g:65:2: iv_ruleFile= ruleFile EOF
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
    // InternalBurst.g:71:1: ruleFile returns [EObject current=null] : ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_1=null;
        Token this_ENDLINE_3=null;
        Token this_ENDLINE_5=null;
        EObject lv_Imports_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:77:2: ( ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* ) )
            // InternalBurst.g:78:2: ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* )
            {
            // InternalBurst.g:78:2: ( () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )* )
            // InternalBurst.g:79:3: () (this_ENDLINE_1= RULE_ENDLINE )* ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )* ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )*
            {
            // InternalBurst.g:79:3: ()
            // InternalBurst.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalBurst.g:86:3: (this_ENDLINE_1= RULE_ENDLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENDLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:87:4: this_ENDLINE_1= RULE_ENDLINE
            	    {
            	    this_ENDLINE_1=(Token)match(input,RULE_ENDLINE,FOLLOW_3); 

            	    				newLeafNode(this_ENDLINE_1, grammarAccess.getFileAccess().getENDLINETerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBurst.g:92:3: ( ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:93:4: ( (lv_Imports_2_0= ruleImport ) ) (this_ENDLINE_3= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:93:4: ( (lv_Imports_2_0= ruleImport ) )
            	    // InternalBurst.g:94:5: (lv_Imports_2_0= ruleImport )
            	    {
            	    // InternalBurst.g:94:5: (lv_Imports_2_0= ruleImport )
            	    // InternalBurst.g:95:6: lv_Imports_2_0= ruleImport
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

            	    // InternalBurst.g:112:4: (this_ENDLINE_3= RULE_ENDLINE )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ENDLINE) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalBurst.g:113:5: this_ENDLINE_3= RULE_ENDLINE
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

            // InternalBurst.g:119:3: ( ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:120:4: ( (lv_elements_4_0= ruleFileElement ) ) (this_ENDLINE_5= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:120:4: ( (lv_elements_4_0= ruleFileElement ) )
            	    // InternalBurst.g:121:5: (lv_elements_4_0= ruleFileElement )
            	    {
            	    // InternalBurst.g:121:5: (lv_elements_4_0= ruleFileElement )
            	    // InternalBurst.g:122:6: lv_elements_4_0= ruleFileElement
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

            	    // InternalBurst.g:139:4: (this_ENDLINE_5= RULE_ENDLINE )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ENDLINE) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalBurst.g:140:5: this_ENDLINE_5= RULE_ENDLINE
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
    // InternalBurst.g:150:1: entryRuleFileElement returns [EObject current=null] : iv_ruleFileElement= ruleFileElement EOF ;
    public final EObject entryRuleFileElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileElement = null;


        try {
            // InternalBurst.g:150:52: (iv_ruleFileElement= ruleFileElement EOF )
            // InternalBurst.g:151:2: iv_ruleFileElement= ruleFileElement EOF
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
    // InternalBurst.g:157:1: ruleFileElement returns [EObject current=null] : (this_Roles_0= ruleRoles | this_Package_1= rulePackage ) ;
    public final EObject ruleFileElement() throws RecognitionException {
        EObject current = null;

        EObject this_Roles_0 = null;

        EObject this_Package_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:163:2: ( (this_Roles_0= ruleRoles | this_Package_1= rulePackage ) )
            // InternalBurst.g:164:2: (this_Roles_0= ruleRoles | this_Package_1= rulePackage )
            {
            // InternalBurst.g:164:2: (this_Roles_0= ruleRoles | this_Package_1= rulePackage )
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
                    // InternalBurst.g:165:3: this_Roles_0= ruleRoles
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
                    // InternalBurst.g:174:3: this_Package_1= rulePackage
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
    // InternalBurst.g:186:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBurst.g:186:47: (iv_ruleImport= ruleImport EOF )
            // InternalBurst.g:187:2: iv_ruleImport= ruleImport EOF
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
    // InternalBurst.g:193:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:199:2: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) )
            // InternalBurst.g:200:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            {
            // InternalBurst.g:200:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            // InternalBurst.g:201:3: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            {
            // InternalBurst.g:201:3: ()
            // InternalBurst.g:202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalBurst.g:212:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalBurst.g:213:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:213:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalBurst.g:214:5: lv_importedNamespace_2_0= ruleQualifiedName
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
    // InternalBurst.g:235:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalBurst.g:235:46: (iv_ruleRoles= ruleRoles EOF )
            // InternalBurst.g:236:2: iv_ruleRoles= ruleRoles EOF
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
    // InternalBurst.g:242:1: ruleRoles returns [EObject current=null] : ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:248:2: ( ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:249:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:249:2: ( () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:250:3: () otherlv_1= 'role' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:250:3: ()
            // InternalBurst.g:251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRolesAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRolesAccess().getRoleKeyword_1());
            		
            // InternalBurst.g:261:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:262:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:262:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:263:5: lv_name_2_0= RULE_ID
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
    // InternalBurst.g:283:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalBurst.g:283:48: (iv_rulePackage= rulePackage EOF )
            // InternalBurst.g:284:2: iv_rulePackage= rulePackage EOF
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
    // InternalBurst.g:290:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) ;
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
            // InternalBurst.g:296:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) )
            // InternalBurst.g:297:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            {
            // InternalBurst.g:297:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            // InternalBurst.g:298:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}'
            {
            // InternalBurst.g:298:3: ()
            // InternalBurst.g:299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalBurst.g:309:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalBurst.g:310:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:310:4: (lv_name_2_0= ruleQualifiedName )
            // InternalBurst.g:311:5: lv_name_2_0= ruleQualifiedName
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

            // InternalBurst.g:328:3: (this_ENDLINE_3= RULE_ENDLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ENDLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:329:4: this_ENDLINE_3= RULE_ENDLINE
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
            		
            // InternalBurst.g:338:3: (this_ENDLINE_5= RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ENDLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:339:4: this_ENDLINE_5= RULE_ENDLINE
            	    {
            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_7); 

            	    				newLeafNode(this_ENDLINE_5, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalBurst.g:344:3: ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=17 && LA10_0<=18)||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:345:4: ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:345:4: ( (lv_elements_6_0= rulePackageElement ) )
            	    // InternalBurst.g:346:5: (lv_elements_6_0= rulePackageElement )
            	    {
            	    // InternalBurst.g:346:5: (lv_elements_6_0= rulePackageElement )
            	    // InternalBurst.g:347:6: lv_elements_6_0= rulePackageElement
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

            	    // InternalBurst.g:364:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ENDLINE) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalBurst.g:365:5: this_ENDLINE_7= RULE_ENDLINE
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
    // InternalBurst.g:379:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalBurst.g:379:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalBurst.g:380:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalBurst.g:386:1: rulePackageElement returns [EObject current=null] : (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Concern_0 = null;

        EObject this_Template_1 = null;

        EObject this_RuleIntersect_2 = null;



        	enterRule();

        try {
            // InternalBurst.g:392:2: ( (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect ) )
            // InternalBurst.g:393:2: (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect )
            {
            // InternalBurst.g:393:2: (this_Concern_0= ruleConcern | this_Template_1= ruleTemplate | this_RuleIntersect_2= ruleRuleIntersect )
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
            case 23:
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
                    // InternalBurst.g:394:3: this_Concern_0= ruleConcern
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
                    // InternalBurst.g:403:3: this_Template_1= ruleTemplate
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
                    // InternalBurst.g:412:3: this_RuleIntersect_2= ruleRuleIntersect
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
    // InternalBurst.g:424:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalBurst.g:424:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalBurst.g:425:2: iv_ruleConcern= ruleConcern EOF
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
    // InternalBurst.g:431:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? ) ;
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
            // InternalBurst.g:437:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? ) )
            // InternalBurst.g:438:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? )
            {
            // InternalBurst.g:438:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )? )
            // InternalBurst.g:439:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?
            {
            // InternalBurst.g:439:3: ()
            // InternalBurst.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:450:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:451:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:451:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:452:5: lv_name_2_0= RULE_ID
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

            // InternalBurst.g:468:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:469:4: (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}'
                    {
                    // InternalBurst.g:469:4: (this_ENDLINE_3= RULE_ENDLINE )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ENDLINE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBurst.g:470:5: this_ENDLINE_3= RULE_ENDLINE
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
                    			
                    // InternalBurst.g:479:4: (this_ENDLINE_5= RULE_ENDLINE )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ENDLINE) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBurst.g:480:5: this_ENDLINE_5= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_5, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_3_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalBurst.g:485:4: ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||(LA15_0>=22 && LA15_0<=23)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalBurst.g:486:5: ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+
                    	    {
                    	    // InternalBurst.g:486:5: ( (lv_elements_6_0= ruleConcernElement ) )
                    	    // InternalBurst.g:487:6: (lv_elements_6_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:487:6: (lv_elements_6_0= ruleConcernElement )
                    	    // InternalBurst.g:488:7: lv_elements_6_0= ruleConcernElement
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

                    	    // InternalBurst.g:505:5: (this_ENDLINE_7= RULE_ENDLINE )+
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
                    	    	    // InternalBurst.g:506:6: this_ENDLINE_7= RULE_ENDLINE
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
    // InternalBurst.g:521:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalBurst.g:521:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalBurst.g:522:2: iv_ruleTemplate= ruleTemplate EOF
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
    // InternalBurst.g:528:1: ruleTemplate returns [EObject current=null] : ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? ) ;
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
            // InternalBurst.g:534:2: ( ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? ) )
            // InternalBurst.g:535:2: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? )
            {
            // InternalBurst.g:535:2: ( () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )? )
            // InternalBurst.g:536:3: () otherlv_1= 'template' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '>' ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?
            {
            // InternalBurst.g:536:3: ()
            // InternalBurst.g:537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateAccess().getTemplateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getTemplateKeyword_1());
            		
            // InternalBurst.g:547:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:548:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:548:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:549:5: lv_name_2_0= RULE_ID
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
            		
            // InternalBurst.g:569:3: ( (otherlv_4= RULE_ID ) )
            // InternalBurst.g:570:4: (otherlv_4= RULE_ID )
            {
            // InternalBurst.g:570:4: (otherlv_4= RULE_ID )
            // InternalBurst.g:571:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getTemplateArgumentsConcernCrossReference_4_0());
            				

            }


            }

            // InternalBurst.g:582:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:583:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTemplateAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBurst.g:587:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalBurst.g:588:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalBurst.g:588:5: (otherlv_6= RULE_ID )
            	    // InternalBurst.g:589:6: otherlv_6= RULE_ID
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
            		
            // InternalBurst.g:605:3: ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalBurst.g:606:4: (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}'
                    {
                    // InternalBurst.g:606:4: (this_ENDLINE_8= RULE_ENDLINE )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ENDLINE) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBurst.g:607:5: this_ENDLINE_8= RULE_ENDLINE
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
                    			
                    // InternalBurst.g:616:4: (this_ENDLINE_10= RULE_ENDLINE )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ENDLINE) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalBurst.g:617:5: this_ENDLINE_10= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_10, grammarAccess.getTemplateAccess().getENDLINETerminalRuleCall_7_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // InternalBurst.g:622:4: ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||(LA21_0>=22 && LA21_0<=23)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBurst.g:623:5: ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+
                    	    {
                    	    // InternalBurst.g:623:5: ( (lv_elements_11_0= ruleConcernElement ) )
                    	    // InternalBurst.g:624:6: (lv_elements_11_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:624:6: (lv_elements_11_0= ruleConcernElement )
                    	    // InternalBurst.g:625:7: lv_elements_11_0= ruleConcernElement
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

                    	    // InternalBurst.g:642:5: (this_ENDLINE_12= RULE_ENDLINE )+
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
                    	    	    // InternalBurst.g:643:6: this_ENDLINE_12= RULE_ENDLINE
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
    // InternalBurst.g:658:1: entryRuleConcernElement returns [EObject current=null] : iv_ruleConcernElement= ruleConcernElement EOF ;
    public final EObject entryRuleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcernElement = null;


        try {
            // InternalBurst.g:658:55: (iv_ruleConcernElement= ruleConcernElement EOF )
            // InternalBurst.g:659:2: iv_ruleConcernElement= ruleConcernElement EOF
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
    // InternalBurst.g:665:1: ruleConcernElement returns [EObject current=null] : (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) ;
    public final EObject ruleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject this_Member_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:671:2: ( (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) )
            // InternalBurst.g:672:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            {
            // InternalBurst.g:672:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==22) ) {
                alt23=1;
            }
            else if ( (LA23_0==23) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBurst.g:673:3: this_Member_0= ruleMember
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
                    // InternalBurst.g:682:3: this_RuleIntersect_1= ruleRuleIntersect
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
    // InternalBurst.g:694:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:694:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:695:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:701:1: ruleMember returns [EObject current=null] : ( () ( (lv_heritFrom_1_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_heritFrom_1_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalBurst.g:707:2: ( ( () ( (lv_heritFrom_1_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalBurst.g:708:2: ( () ( (lv_heritFrom_1_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalBurst.g:708:2: ( () ( (lv_heritFrom_1_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // InternalBurst.g:709:3: () ( (lv_heritFrom_1_0= 'is' ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalBurst.g:709:3: ()
            // InternalBurst.g:710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:716:3: ( (lv_heritFrom_1_0= 'is' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBurst.g:717:4: (lv_heritFrom_1_0= 'is' )
                    {
                    // InternalBurst.g:717:4: (lv_heritFrom_1_0= 'is' )
                    // InternalBurst.g:718:5: lv_heritFrom_1_0= 'is'
                    {
                    lv_heritFrom_1_0=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(lv_heritFrom_1_0, grammarAccess.getMemberAccess().getHeritFromIsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberRule());
                    					}
                    					setWithLastConsumed(current, "heritFrom", true, "is");
                    				

                    }


                    }
                    break;

            }

            // InternalBurst.g:730:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:731:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:731:4: ( ruleQualifiedName )
            // InternalBurst.g:732:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:746:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:747:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:747:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:748:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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
    // InternalBurst.g:768:1: entryRuleRuleIntersect returns [EObject current=null] : iv_ruleRuleIntersect= ruleRuleIntersect EOF ;
    public final EObject entryRuleRuleIntersect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIntersect = null;


        try {
            // InternalBurst.g:768:54: (iv_ruleRuleIntersect= ruleRuleIntersect EOF )
            // InternalBurst.g:769:2: iv_ruleRuleIntersect= ruleRuleIntersect EOF
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
    // InternalBurst.g:775:1: ruleRuleIntersect returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' ) ;
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

        EObject lv_params_11_0 = null;

        EObject lv_params_16_0 = null;

        EObject lv_lines_19_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:781:2: ( ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' ) )
            // InternalBurst.g:782:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' )
            {
            // InternalBurst.g:782:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}' )
            // InternalBurst.g:783:3: () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_params_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )* (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )? otherlv_17= '{' (this_ENDLINE_18= RULE_ENDLINE )* ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )* otherlv_21= '}'
            {
            // InternalBurst.g:783:3: ()
            // InternalBurst.g:784:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:790:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:791:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:791:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:792:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,23,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleIntersectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:804:3: (this_ENDLINE_2= RULE_ENDLINE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ENDLINE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:805:4: this_ENDLINE_2= RULE_ENDLINE
            	    {
            	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

            	    				newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalBurst.g:810:3: ( (lv_params_3_0= ruleParameter ) )
            // InternalBurst.g:811:4: (lv_params_3_0= ruleParameter )
            {
            // InternalBurst.g:811:4: (lv_params_3_0= ruleParameter )
            // InternalBurst.g:812:5: lv_params_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalBurst.g:829:3: ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ENDLINE||LA29_0==20||LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBurst.g:830:4: (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_params_8_0= ruleParameter ) )
            	    {
            	    // InternalBurst.g:830:4: (this_ENDLINE_4= RULE_ENDLINE )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==RULE_ENDLINE) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalBurst.g:831:5: this_ENDLINE_4= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_15); 

            	    	    					newLeafNode(this_ENDLINE_4, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    // InternalBurst.g:836:4: (otherlv_5= ',' | otherlv_6= 'and' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==20) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==24) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalBurst.g:837:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            	            					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalBurst.g:842:5: otherlv_6= 'and'
            	            {
            	            otherlv_6=(Token)match(input,24,FOLLOW_13); 

            	            					newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalBurst.g:847:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_ENDLINE) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalBurst.g:848:5: this_ENDLINE_7= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

            	    	    					newLeafNode(this_ENDLINE_7, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    // InternalBurst.g:853:4: ( (lv_params_8_0= ruleParameter ) )
            	    // InternalBurst.g:854:5: (lv_params_8_0= ruleParameter )
            	    {
            	    // InternalBurst.g:854:5: (lv_params_8_0= ruleParameter )
            	    // InternalBurst.g:855:6: lv_params_8_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsParameterParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop29;
                }
            } while (true);

            // InternalBurst.g:873:3: (otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBurst.g:874:4: otherlv_9= 'with' (this_ENDLINE_10= RULE_ENDLINE )* ( (lv_params_11_0= ruleWithParameter ) ) ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleIntersectAccess().getWithKeyword_5_0());
                    			
                    // InternalBurst.g:878:4: (this_ENDLINE_10= RULE_ENDLINE )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ENDLINE) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalBurst.g:879:5: this_ENDLINE_10= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

                    	    					newLeafNode(this_ENDLINE_10, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // InternalBurst.g:884:4: ( (lv_params_11_0= ruleWithParameter ) )
                    // InternalBurst.g:885:5: (lv_params_11_0= ruleWithParameter )
                    {
                    // InternalBurst.g:885:5: (lv_params_11_0= ruleWithParameter )
                    // InternalBurst.g:886:6: lv_params_11_0= ruleWithParameter
                    {

                    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_params_11_0=ruleWithParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_11_0,
                    							"org.xtext.burst.Burst.WithParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBurst.g:903:4: ( (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ENDLINE||LA34_0==20||LA34_0==24) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalBurst.g:904:5: (this_ENDLINE_12= RULE_ENDLINE )* (otherlv_13= ',' | otherlv_14= 'and' ) (this_ENDLINE_15= RULE_ENDLINE )* ( (lv_params_16_0= ruleWithParameter ) )
                    	    {
                    	    // InternalBurst.g:904:5: (this_ENDLINE_12= RULE_ENDLINE )*
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==RULE_ENDLINE) ) {
                    	            alt31=1;
                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:905:6: this_ENDLINE_12= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_12=(Token)match(input,RULE_ENDLINE,FOLLOW_15); 

                    	    	    						newLeafNode(this_ENDLINE_12, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_0());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop31;
                    	        }
                    	    } while (true);

                    	    // InternalBurst.g:910:5: (otherlv_13= ',' | otherlv_14= 'and' )
                    	    int alt32=2;
                    	    int LA32_0 = input.LA(1);

                    	    if ( (LA32_0==20) ) {
                    	        alt32=1;
                    	    }
                    	    else if ( (LA32_0==24) ) {
                    	        alt32=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 32, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt32) {
                    	        case 1 :
                    	            // InternalBurst.g:911:6: otherlv_13= ','
                    	            {
                    	            otherlv_13=(Token)match(input,20,FOLLOW_13); 

                    	            						newLeafNode(otherlv_13, grammarAccess.getRuleIntersectAccess().getCommaKeyword_5_3_1_0());
                    	            					

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalBurst.g:916:6: otherlv_14= 'and'
                    	            {
                    	            otherlv_14=(Token)match(input,24,FOLLOW_13); 

                    	            						newLeafNode(otherlv_14, grammarAccess.getRuleIntersectAccess().getAndKeyword_5_3_1_1());
                    	            					

                    	            }
                    	            break;

                    	    }

                    	    // InternalBurst.g:921:5: (this_ENDLINE_15= RULE_ENDLINE )*
                    	    loop33:
                    	    do {
                    	        int alt33=2;
                    	        int LA33_0 = input.LA(1);

                    	        if ( (LA33_0==RULE_ENDLINE) ) {
                    	            alt33=1;
                    	        }


                    	        switch (alt33) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:922:6: this_ENDLINE_15= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_15=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

                    	    	    						newLeafNode(this_ENDLINE_15, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_5_3_2());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop33;
                    	        }
                    	    } while (true);

                    	    // InternalBurst.g:927:5: ( (lv_params_16_0= ruleWithParameter ) )
                    	    // InternalBurst.g:928:6: (lv_params_16_0= ruleWithParameter )
                    	    {
                    	    // InternalBurst.g:928:6: (lv_params_16_0= ruleWithParameter )
                    	    // InternalBurst.g:929:7: lv_params_16_0= ruleWithParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleIntersectAccess().getParamsWithParameterParserRuleCall_5_3_3_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_16_0=ruleWithParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_16_0,
                    	    								"org.xtext.burst.Burst.WithParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            otherlv_17=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBurst.g:952:3: (this_ENDLINE_18= RULE_ENDLINE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ENDLINE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBurst.g:953:4: this_ENDLINE_18= RULE_ENDLINE
            	    {
            	    this_ENDLINE_18=(Token)match(input,RULE_ENDLINE,FOLLOW_17); 

            	    				newLeafNode(this_ENDLINE_18, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalBurst.g:958:3: ( ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+ )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==26||LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBurst.g:959:4: ( (lv_lines_19_0= ruleLine ) ) (this_ENDLINE_20= RULE_ENDLINE )+
            	    {
            	    // InternalBurst.g:959:4: ( (lv_lines_19_0= ruleLine ) )
            	    // InternalBurst.g:960:5: (lv_lines_19_0= ruleLine )
            	    {
            	    // InternalBurst.g:960:5: (lv_lines_19_0= ruleLine )
            	    // InternalBurst.g:961:6: lv_lines_19_0= ruleLine
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

            	    // InternalBurst.g:978:4: (this_ENDLINE_20= RULE_ENDLINE )+
            	    int cnt37=0;
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==RULE_ENDLINE) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalBurst.g:979:5: this_ENDLINE_20= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_20=(Token)match(input,RULE_ENDLINE,FOLLOW_17); 

            	    	    					newLeafNode(this_ENDLINE_20, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_8_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt37 >= 1 ) break loop37;
            	                EarlyExitException eee =
            	                    new EarlyExitException(37, input);
            	                throw eee;
            	        }
            	        cnt37++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop38;
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


    // $ANTLR start "entryRuleLocale"
    // InternalBurst.g:993:1: entryRuleLocale returns [EObject current=null] : iv_ruleLocale= ruleLocale EOF ;
    public final EObject entryRuleLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocale = null;


        try {
            // InternalBurst.g:993:47: (iv_ruleLocale= ruleLocale EOF )
            // InternalBurst.g:994:2: iv_ruleLocale= ruleLocale EOF
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
    // InternalBurst.g:1000:1: ruleLocale returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalBurst.g:1006:2: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalBurst.g:1007:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalBurst.g:1007:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) )
            // InternalBurst.g:1008:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalBurst.g:1008:3: ()
            // InternalBurst.g:1009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocaleAccess().getLocaleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLocaleAccess().getNewKeyword_1());
            		
            // InternalBurst.g:1019:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1020:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1020:4: ( ruleQualifiedName )
            // InternalBurst.g:1021:5: ruleQualifiedName
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

            // InternalBurst.g:1035:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:1036:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:1036:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:1037:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameter"
    // InternalBurst.g:1057:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBurst.g:1057:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBurst.g:1058:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalBurst.g:1064:1: ruleParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_usage_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBurst.g:1070:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalBurst.g:1071:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalBurst.g:1071:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )? )
            // InternalBurst.g:1072:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalBurst.g:1072:3: ()
            // InternalBurst.g:1073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1079:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1080:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1080:4: ( ruleQualifiedName )
            // InternalBurst.g:1081:5: ruleQualifiedName
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

            // InternalBurst.g:1095:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:1096:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:1096:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:1097:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalBurst.g:1113:3: ( ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBurst.g:1114:4: ( (lv_usage_3_0= ':' ) ) ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalBurst.g:1114:4: ( (lv_usage_3_0= ':' ) )
                    // InternalBurst.g:1115:5: (lv_usage_3_0= ':' )
                    {
                    // InternalBurst.g:1115:5: (lv_usage_3_0= ':' )
                    // InternalBurst.g:1116:6: lv_usage_3_0= ':'
                    {
                    lv_usage_3_0=(Token)match(input,27,FOLLOW_5); 

                    						newLeafNode(lv_usage_3_0, grammarAccess.getParameterAccess().getUsageColonKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(current, "usage", true, ":");
                    					

                    }


                    }

                    // InternalBurst.g:1128:4: ( (otherlv_4= RULE_ID ) )
                    // InternalBurst.g:1129:5: (otherlv_4= RULE_ID )
                    {
                    // InternalBurst.g:1129:5: (otherlv_4= RULE_ID )
                    // InternalBurst.g:1130:6: otherlv_4= RULE_ID
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
    // InternalBurst.g:1146:1: entryRuleWithParameter returns [EObject current=null] : iv_ruleWithParameter= ruleWithParameter EOF ;
    public final EObject entryRuleWithParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithParameter = null;


        try {
            // InternalBurst.g:1146:54: (iv_ruleWithParameter= ruleWithParameter EOF )
            // InternalBurst.g:1147:2: iv_ruleWithParameter= ruleWithParameter EOF
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
    // InternalBurst.g:1153:1: ruleWithParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleWithParameter() throws RecognitionException {
        EObject current = null;

        Token lv_usage_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBurst.g:1159:2: ( ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalBurst.g:1160:2: ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalBurst.g:1160:2: ( () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalBurst.g:1161:3: () ( ( ruleQualifiedName ) ) ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            // InternalBurst.g:1161:3: ()
            // InternalBurst.g:1162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWithParameterAccess().getWithParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1168:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:1169:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:1169:4: ( ruleQualifiedName )
            // InternalBurst.g:1170:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWithParameterAccess().getNameConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:1184:3: ( ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBurst.g:1185:4: ( (lv_usage_2_0= ':' ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalBurst.g:1185:4: ( (lv_usage_2_0= ':' ) )
                    // InternalBurst.g:1186:5: (lv_usage_2_0= ':' )
                    {
                    // InternalBurst.g:1186:5: (lv_usage_2_0= ':' )
                    // InternalBurst.g:1187:6: lv_usage_2_0= ':'
                    {
                    lv_usage_2_0=(Token)match(input,27,FOLLOW_5); 

                    						newLeafNode(lv_usage_2_0, grammarAccess.getWithParameterAccess().getUsageColonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWithParameterRule());
                    						}
                    						setWithLastConsumed(current, "usage", true, ":");
                    					

                    }


                    }

                    // InternalBurst.g:1199:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBurst.g:1200:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBurst.g:1200:5: (otherlv_3= RULE_ID )
                    // InternalBurst.g:1201:6: otherlv_3= RULE_ID
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
    // InternalBurst.g:1217:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:1217:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:1218:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:1224:1: ruleLine returns [EObject current=null] : this_CallExpr_0= ruleCallExpr ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_CallExpr_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1230:2: (this_CallExpr_0= ruleCallExpr )
            // InternalBurst.g:1231:2: this_CallExpr_0= ruleCallExpr
            {

            		newCompositeNode(grammarAccess.getLineAccess().getCallExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CallExpr_0=ruleCallExpr();

            state._fsp--;


            		current = this_CallExpr_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleCallExpr"
    // InternalBurst.g:1242:1: entryRuleCallExpr returns [EObject current=null] : iv_ruleCallExpr= ruleCallExpr EOF ;
    public final EObject entryRuleCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpr = null;


        try {
            // InternalBurst.g:1242:49: (iv_ruleCallExpr= ruleCallExpr EOF )
            // InternalBurst.g:1243:2: iv_ruleCallExpr= ruleCallExpr EOF
            {
             newCompositeNode(grammarAccess.getCallExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallExpr=ruleCallExpr();

            state._fsp--;

             current =iv_ruleCallExpr; 
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
    // $ANTLR end "entryRuleCallExpr"


    // $ANTLR start "ruleCallExpr"
    // InternalBurst.g:1249:1: ruleCallExpr returns [EObject current=null] : ( ( (lv_content_0_0= ruleCall ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )? ) ;
    public final EObject ruleCallExpr() throws RecognitionException {
        EObject current = null;

        Token lv_equality_1_0=null;
        EObject lv_content_0_0 = null;

        EObject lv_source_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1255:2: ( ( ( (lv_content_0_0= ruleCall ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )? ) )
            // InternalBurst.g:1256:2: ( ( (lv_content_0_0= ruleCall ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )? )
            {
            // InternalBurst.g:1256:2: ( ( (lv_content_0_0= ruleCall ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )? )
            // InternalBurst.g:1257:3: ( (lv_content_0_0= ruleCall ) )+ ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )?
            {
            // InternalBurst.g:1257:3: ( (lv_content_0_0= ruleCall ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==26||LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBurst.g:1258:4: (lv_content_0_0= ruleCall )
            	    {
            	    // InternalBurst.g:1258:4: (lv_content_0_0= ruleCall )
            	    // InternalBurst.g:1259:5: lv_content_0_0= ruleCall
            	    {

            	    					newCompositeNode(grammarAccess.getCallExprAccess().getContentCallParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_content_0_0=ruleCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCallExprRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_0_0,
            	    						"org.xtext.burst.Burst.Call");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // InternalBurst.g:1276:3: ( ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+ )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBurst.g:1277:4: ( (lv_equality_1_0= '=' ) ) ( (lv_source_2_0= ruleCall ) )+
                    {
                    // InternalBurst.g:1277:4: ( (lv_equality_1_0= '=' ) )
                    // InternalBurst.g:1278:5: (lv_equality_1_0= '=' )
                    {
                    // InternalBurst.g:1278:5: (lv_equality_1_0= '=' )
                    // InternalBurst.g:1279:6: lv_equality_1_0= '='
                    {
                    lv_equality_1_0=(Token)match(input,28,FOLLOW_20); 

                    						newLeafNode(lv_equality_1_0, grammarAccess.getCallExprAccess().getEqualityEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallExprRule());
                    						}
                    						setWithLastConsumed(current, "equality", true, "=");
                    					

                    }


                    }

                    // InternalBurst.g:1291:4: ( (lv_source_2_0= ruleCall ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID||LA42_0==26||LA42_0==29) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalBurst.g:1292:5: (lv_source_2_0= ruleCall )
                    	    {
                    	    // InternalBurst.g:1292:5: (lv_source_2_0= ruleCall )
                    	    // InternalBurst.g:1293:6: lv_source_2_0= ruleCall
                    	    {

                    	    						newCompositeNode(grammarAccess.getCallExprAccess().getSourceCallParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_source_2_0=ruleCall();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCallExprRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"source",
                    	    							lv_source_2_0,
                    	    							"org.xtext.burst.Burst.Call");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
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
    // $ANTLR end "ruleCallExpr"


    // $ANTLR start "entryRuleSubCall"
    // InternalBurst.g:1315:1: entryRuleSubCall returns [EObject current=null] : iv_ruleSubCall= ruleSubCall EOF ;
    public final EObject entryRuleSubCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCall = null;


        try {
            // InternalBurst.g:1315:48: (iv_ruleSubCall= ruleSubCall EOF )
            // InternalBurst.g:1316:2: iv_ruleSubCall= ruleSubCall EOF
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
    // InternalBurst.g:1322:1: ruleSubCall returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= ruleCallExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleSubCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:1328:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= ruleCallExpr ) ) otherlv_3= ')' ) )
            // InternalBurst.g:1329:2: ( () otherlv_1= '(' ( (lv_name_2_0= ruleCallExpr ) ) otherlv_3= ')' )
            {
            // InternalBurst.g:1329:2: ( () otherlv_1= '(' ( (lv_name_2_0= ruleCallExpr ) ) otherlv_3= ')' )
            // InternalBurst.g:1330:3: () otherlv_1= '(' ( (lv_name_2_0= ruleCallExpr ) ) otherlv_3= ')'
            {
            // InternalBurst.g:1330:3: ()
            // InternalBurst.g:1331:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubCallAccess().getSubCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSubCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBurst.g:1341:3: ( (lv_name_2_0= ruleCallExpr ) )
            // InternalBurst.g:1342:4: (lv_name_2_0= ruleCallExpr )
            {
            // InternalBurst.g:1342:4: (lv_name_2_0= ruleCallExpr )
            // InternalBurst.g:1343:5: lv_name_2_0= ruleCallExpr
            {

            					newCompositeNode(grammarAccess.getSubCallAccess().getNameCallExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleCallExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubCallRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.burst.Burst.CallExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSubCallAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:1368:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:1368:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:1369:2: iv_ruleCall= ruleCall EOF
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
    // InternalBurst.g:1375:1: ruleCall returns [EObject current=null] : (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_Locale_0 = null;

        EObject this_Access_1 = null;

        EObject this_SubCall_2 = null;



        	enterRule();

        try {
            // InternalBurst.g:1381:2: ( (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall ) )
            // InternalBurst.g:1382:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall )
            {
            // InternalBurst.g:1382:2: (this_Locale_0= ruleLocale | this_Access_1= ruleAccess | this_SubCall_2= ruleSubCall )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt44=1;
                }
                break;
            case RULE_ID:
                {
                alt44=2;
                }
                break;
            case 29:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalBurst.g:1383:3: this_Locale_0= ruleLocale
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getLocaleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locale_0=ruleLocale();

                    state._fsp--;


                    			current = this_Locale_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1392:3: this_Access_1= ruleAccess
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getAccessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Access_1=ruleAccess();

                    state._fsp--;


                    			current = this_Access_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:1401:3: this_SubCall_2= ruleSubCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getSubCallParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleAccess"
    // InternalBurst.g:1413:1: entryRuleAccess returns [EObject current=null] : iv_ruleAccess= ruleAccess EOF ;
    public final EObject entryRuleAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccess = null;


        try {
            // InternalBurst.g:1413:47: (iv_ruleAccess= ruleAccess EOF )
            // InternalBurst.g:1414:2: iv_ruleAccess= ruleAccess EOF
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
    // InternalBurst.g:1420:1: ruleAccess returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBurst.g:1426:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalBurst.g:1427:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalBurst.g:1427:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalBurst.g:1428:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalBurst.g:1428:3: ()
            // InternalBurst.g:1429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccessAccess().getAccessAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1435:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:1436:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:1436:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:1437:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccessRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getAccessAccess().getNameVariableCrossReference_1_0());
            				

            }


            }

            // InternalBurst.g:1448:3: (otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBurst.g:1449:4: otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAccessAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalBurst.g:1453:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBurst.g:1454:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBurst.g:1454:5: (otherlv_3= RULE_ID )
            	    // InternalBurst.g:1455:6: otherlv_3= RULE_ID
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
            	    break loop45;
                }
            } while (true);

            // InternalBurst.g:1467:3: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==27) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBurst.g:1468:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAccessAccess().getColonKeyword_3_0());
                    			
                    // InternalBurst.g:1472:4: ( (otherlv_5= RULE_ID ) )
                    // InternalBurst.g:1473:5: (otherlv_5= RULE_ID )
                    {
                    // InternalBurst.g:1473:5: (otherlv_5= RULE_ID )
                    // InternalBurst.g:1474:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccessRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getAccessAccess().getRoleRoleCrossReference_3_1_0());
                    					

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
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:1490:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:1490:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:1491:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBurst.g:1497:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:1503:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:1504:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:1504:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:1505:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:1512:3: (kw= '.' this_ID_2= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==31) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBurst.g:1513:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\27\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\2\3\3\4\uffff\1\3",
            "\1\1\12\uffff\1\2\3\3\4\uffff\1\3",
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
            return "468:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= ruleConcernElement ) ) (this_ENDLINE_7= RULE_ENDLINE )+ )* otherlv_8= '}' )?";
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
            return "605:3: ( (this_ENDLINE_8= RULE_ENDLINE )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_elements_11_0= ruleConcernElement ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000870010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C70030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003108010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001100010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001108010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000024010030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000034000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000024000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000024000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});

}