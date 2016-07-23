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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'concern'", "'extends'", "'when'", "','", "'and'", "'with'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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
    // InternalBurst.g:71:1: ruleFile returns [EObject current=null] : ( (lv_elements_0_0= ruleRuleFileElement ) )* ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:77:2: ( ( (lv_elements_0_0= ruleRuleFileElement ) )* )
            // InternalBurst.g:78:2: ( (lv_elements_0_0= ruleRuleFileElement ) )*
            {
            // InternalBurst.g:78:2: ( (lv_elements_0_0= ruleRuleFileElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENDLINE||(LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:79:3: (lv_elements_0_0= ruleRuleFileElement )
            	    {
            	    // InternalBurst.g:79:3: (lv_elements_0_0= ruleRuleFileElement )
            	    // InternalBurst.g:80:4: lv_elements_0_0= ruleRuleFileElement
            	    {

            	    				newCompositeNode(grammarAccess.getFileAccess().getElementsRuleFileElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleRuleFileElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.burst.Burst.RuleFileElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleRuleFileElement"
    // InternalBurst.g:100:1: entryRuleRuleFileElement returns [EObject current=null] : iv_ruleRuleFileElement= ruleRuleFileElement EOF ;
    public final EObject entryRuleRuleFileElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleFileElement = null;


        try {
            // InternalBurst.g:100:56: (iv_ruleRuleFileElement= ruleRuleFileElement EOF )
            // InternalBurst.g:101:2: iv_ruleRuleFileElement= ruleRuleFileElement EOF
            {
             newCompositeNode(grammarAccess.getRuleFileElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleFileElement=ruleRuleFileElement();

            state._fsp--;

             current =iv_ruleRuleFileElement; 
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
    // $ANTLR end "entryRuleRuleFileElement"


    // $ANTLR start "ruleRuleFileElement"
    // InternalBurst.g:107:1: ruleRuleFileElement returns [EObject current=null] : (this_RuleImport_0= ruleRuleImport | this_RulePackage_1= ruleRulePackage | this_ENDLINE_2= RULE_ENDLINE ) ;
    public final EObject ruleRuleFileElement() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_2=null;
        EObject this_RuleImport_0 = null;

        EObject this_RulePackage_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:113:2: ( (this_RuleImport_0= ruleRuleImport | this_RulePackage_1= ruleRulePackage | this_ENDLINE_2= RULE_ENDLINE ) )
            // InternalBurst.g:114:2: (this_RuleImport_0= ruleRuleImport | this_RulePackage_1= ruleRulePackage | this_ENDLINE_2= RULE_ENDLINE )
            {
            // InternalBurst.g:114:2: (this_RuleImport_0= ruleRuleImport | this_RulePackage_1= ruleRulePackage | this_ENDLINE_2= RULE_ENDLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case RULE_ENDLINE:
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
                    // InternalBurst.g:115:3: this_RuleImport_0= ruleRuleImport
                    {

                    			newCompositeNode(grammarAccess.getRuleFileElementAccess().getRuleImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleImport_0=ruleRuleImport();

                    state._fsp--;


                    			current = this_RuleImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:124:3: this_RulePackage_1= ruleRulePackage
                    {

                    			newCompositeNode(grammarAccess.getRuleFileElementAccess().getRulePackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RulePackage_1=ruleRulePackage();

                    state._fsp--;


                    			current = this_RulePackage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:133:3: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    			newLeafNode(this_ENDLINE_2, grammarAccess.getRuleFileElementAccess().getENDLINETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleRuleFileElement"


    // $ANTLR start "entryRuleRuleImport"
    // InternalBurst.g:141:1: entryRuleRuleImport returns [EObject current=null] : iv_ruleRuleImport= ruleRuleImport EOF ;
    public final EObject entryRuleRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleImport = null;


        try {
            // InternalBurst.g:141:51: (iv_ruleRuleImport= ruleRuleImport EOF )
            // InternalBurst.g:142:2: iv_ruleRuleImport= ruleRuleImport EOF
            {
             newCompositeNode(grammarAccess.getRuleImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleImport=ruleRuleImport();

            state._fsp--;

             current =iv_ruleRuleImport; 
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
    // $ANTLR end "entryRuleRuleImport"


    // $ANTLR start "ruleRuleImport"
    // InternalBurst.g:148:1: ruleRuleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleRuleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:154:2: ( ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) )
            // InternalBurst.g:155:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            {
            // InternalBurst.g:155:2: ( () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            // InternalBurst.g:156:3: () otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            {
            // InternalBurst.g:156:3: ()
            // InternalBurst.g:157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleImportAccess().getImportKeyword_1());
            		
            // InternalBurst.g:167:3: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // InternalBurst.g:168:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:168:4: (lv_importedNamespace_2_0= ruleQualifiedName )
            // InternalBurst.g:169:5: lv_importedNamespace_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getRuleImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleImportRule());
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
    // $ANTLR end "ruleRuleImport"


    // $ANTLR start "entryRuleRulePackage"
    // InternalBurst.g:190:1: entryRuleRulePackage returns [EObject current=null] : iv_ruleRulePackage= ruleRulePackage EOF ;
    public final EObject entryRuleRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePackage = null;


        try {
            // InternalBurst.g:190:52: (iv_ruleRulePackage= ruleRulePackage EOF )
            // InternalBurst.g:191:2: iv_ruleRulePackage= ruleRulePackage EOF
            {
             newCompositeNode(grammarAccess.getRulePackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulePackage=ruleRulePackage();

            state._fsp--;

             current =iv_ruleRulePackage; 
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
    // $ANTLR end "entryRuleRulePackage"


    // $ANTLR start "ruleRulePackage"
    // InternalBurst.g:197:1: ruleRulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) ;
    public final EObject ruleRulePackage() throws RecognitionException {
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
            // InternalBurst.g:203:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' ) )
            // InternalBurst.g:204:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            {
            // InternalBurst.g:204:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}' )
            // InternalBurst.g:205:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )* ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )* otherlv_8= '}'
            {
            // InternalBurst.g:205:3: ()
            // InternalBurst.g:206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRulePackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRulePackageAccess().getPackageKeyword_1());
            		
            // InternalBurst.g:216:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalBurst.g:217:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalBurst.g:217:4: (lv_name_2_0= ruleQualifiedName )
            // InternalBurst.g:218:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getRulePackageAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRulePackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.burst.Burst.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:235:3: (this_ENDLINE_3= RULE_ENDLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ENDLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:236:4: this_ENDLINE_3= RULE_ENDLINE
            	    {
            	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_5); 

            	    				newLeafNode(this_ENDLINE_3, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRulePackageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBurst.g:245:3: (this_ENDLINE_5= RULE_ENDLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ENDLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:246:4: this_ENDLINE_5= RULE_ENDLINE
            	    {
            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_6); 

            	    				newLeafNode(this_ENDLINE_5, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBurst.g:251:3: ( ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBurst.g:252:4: ( (lv_elements_6_0= rulePackageElement ) ) (this_ENDLINE_7= RULE_ENDLINE )*
            	    {
            	    // InternalBurst.g:252:4: ( (lv_elements_6_0= rulePackageElement ) )
            	    // InternalBurst.g:253:5: (lv_elements_6_0= rulePackageElement )
            	    {
            	    // InternalBurst.g:253:5: (lv_elements_6_0= rulePackageElement )
            	    // InternalBurst.g:254:6: lv_elements_6_0= rulePackageElement
            	    {

            	    						newCompositeNode(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_elements_6_0=rulePackageElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRulePackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_6_0,
            	    							"org.xtext.burst.Burst.PackageElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBurst.g:271:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ENDLINE) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalBurst.g:272:5: this_ENDLINE_7= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_6); 

            	    	    					newLeafNode(this_ENDLINE_7, grammarAccess.getRulePackageAccess().getENDLINETerminalRuleCall_6_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRulePackage"


    // $ANTLR start "entryRulePackageElement"
    // InternalBurst.g:286:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalBurst.g:286:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalBurst.g:287:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalBurst.g:293:1: rulePackageElement returns [EObject current=null] : (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_RuleConcern_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:299:2: ( (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect ) )
            // InternalBurst.g:300:2: (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect )
            {
            // InternalBurst.g:300:2: (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:301:3: this_RuleConcern_0= ruleRuleConcern
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleConcernParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleConcern_0=ruleRuleConcern();

                    state._fsp--;


                    			current = this_RuleConcern_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:310:3: this_RuleIntersect_1= ruleRuleIntersect
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1());
                    		
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
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRuleRuleConcern"
    // InternalBurst.g:322:1: entryRuleRuleConcern returns [EObject current=null] : iv_ruleRuleConcern= ruleRuleConcern EOF ;
    public final EObject entryRuleRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleConcern = null;


        try {
            // InternalBurst.g:322:52: (iv_ruleRuleConcern= ruleRuleConcern EOF )
            // InternalBurst.g:323:2: iv_ruleRuleConcern= ruleRuleConcern EOF
            {
             newCompositeNode(grammarAccess.getRuleConcernRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleConcern=ruleRuleConcern();

            state._fsp--;

             current =iv_ruleRuleConcern; 
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
    // $ANTLR end "entryRuleRuleConcern"


    // $ANTLR start "ruleRuleConcern"
    // InternalBurst.g:329:1: ruleRuleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )? ) ;
    public final EObject ruleRuleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_ENDLINE_3=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        Token otherlv_7=null;
        Token this_ENDLINE_8=null;
        Token this_ENDLINE_10=null;
        Token otherlv_11=null;
        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:335:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )? ) )
            // InternalBurst.g:336:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )? )
            {
            // InternalBurst.g:336:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )? )
            // InternalBurst.g:337:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )?
            {
            // InternalBurst.g:337:3: ()
            // InternalBurst.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:348:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:349:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:349:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:350:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRuleConcernAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleConcernRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.burst.Burst.ID");
            				

            }


            }

            // InternalBurst.g:366:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:367:4: (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) )
                    {
                    // InternalBurst.g:367:4: (this_ENDLINE_3= RULE_ENDLINE )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ENDLINE) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBurst.g:368:5: this_ENDLINE_3= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_8); 

                    	    					newLeafNode(this_ENDLINE_3, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleConcernAccess().getExtendsKeyword_3_1());
                    			
                    // InternalBurst.g:377:4: (this_ENDLINE_5= RULE_ENDLINE )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ENDLINE) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBurst.g:378:5: this_ENDLINE_5= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_5, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalBurst.g:383:4: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:384:5: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:384:5: ( ruleQualifiedName )
                    // InternalBurst.g:385:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleConcernRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleConcernAccess().getSupertypeConcernCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBurst.g:400:3: (otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBurst.g:401:4: otherlv_7= '{' (this_ENDLINE_8= RULE_ENDLINE )* ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBurst.g:405:4: (this_ENDLINE_8= RULE_ENDLINE )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ENDLINE) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBurst.g:406:5: this_ENDLINE_8= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_11); 

                    	    					newLeafNode(this_ENDLINE_8, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalBurst.g:411:4: ( ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+ )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBurst.g:412:5: ( (lv_elements_9_0= ruleConcernElement ) ) (this_ENDLINE_10= RULE_ENDLINE )+
                    	    {
                    	    // InternalBurst.g:412:5: ( (lv_elements_9_0= ruleConcernElement ) )
                    	    // InternalBurst.g:413:6: (lv_elements_9_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:413:6: (lv_elements_9_0= ruleConcernElement )
                    	    // InternalBurst.g:414:7: lv_elements_9_0= ruleConcernElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_9_0=ruleConcernElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleConcernRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_9_0,
                    	    								"org.xtext.burst.Burst.ConcernElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalBurst.g:431:5: (this_ENDLINE_10= RULE_ENDLINE )+
                    	    int cnt12=0;
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( (LA12_0==RULE_ENDLINE) ) {
                    	            alt12=1;
                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // InternalBurst.g:432:6: this_ENDLINE_10= RULE_ENDLINE
                    	    	    {
                    	    	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_11); 

                    	    	    						newLeafNode(this_ENDLINE_10, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_4_2_1());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt12 >= 1 ) break loop12;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(12, input);
                    	                throw eee;
                    	        }
                    	        cnt12++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleRuleConcern"


    // $ANTLR start "entryRuleConcernElement"
    // InternalBurst.g:447:1: entryRuleConcernElement returns [EObject current=null] : iv_ruleConcernElement= ruleConcernElement EOF ;
    public final EObject entryRuleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcernElement = null;


        try {
            // InternalBurst.g:447:55: (iv_ruleConcernElement= ruleConcernElement EOF )
            // InternalBurst.g:448:2: iv_ruleConcernElement= ruleConcernElement EOF
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
    // InternalBurst.g:454:1: ruleConcernElement returns [EObject current=null] : (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) ;
    public final EObject ruleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject this_Member_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:460:2: ( (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect ) )
            // InternalBurst.g:461:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            {
            // InternalBurst.g:461:2: (this_Member_0= ruleMember | this_RuleIntersect_1= ruleRuleIntersect )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBurst.g:462:3: this_Member_0= ruleMember
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
                    // InternalBurst.g:471:3: this_RuleIntersect_1= ruleRuleIntersect
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
    // InternalBurst.g:483:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:483:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:484:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:490:1: ruleMember returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:496:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:497:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:497:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:498:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:498:3: ()
            // InternalBurst.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:505:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:506:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:506:4: ( ruleQualifiedName )
            // InternalBurst.g:507:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:521:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:522:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:522:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:523:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleRuleIntersect"
    // InternalBurst.g:543:1: entryRuleRuleIntersect returns [EObject current=null] : iv_ruleRuleIntersect= ruleRuleIntersect EOF ;
    public final EObject entryRuleRuleIntersect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIntersect = null;


        try {
            // InternalBurst.g:543:54: (iv_ruleRuleIntersect= ruleRuleIntersect EOF )
            // InternalBurst.g:544:2: iv_ruleRuleIntersect= ruleRuleIntersect EOF
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
    // InternalBurst.g:550:1: ruleRuleIntersect returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' ) ;
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
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_lines_11_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:556:2: ( ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' ) )
            // InternalBurst.g:557:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )
            {
            // InternalBurst.g:557:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}' )
            // InternalBurst.g:558:3: () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleParameter ) ) ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )* ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )* otherlv_13= '}'
            {
            // InternalBurst.g:558:3: ()
            // InternalBurst.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:565:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:566:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:566:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:567:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleIntersectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:579:3: (this_ENDLINE_2= RULE_ENDLINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ENDLINE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBurst.g:580:4: this_ENDLINE_2= RULE_ENDLINE
            	    {
            	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

            	    				newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalBurst.g:585:3: ( (lv_parameters_3_0= ruleParameter ) )
            // InternalBurst.g:586:4: (lv_parameters_3_0= ruleParameter )
            {
            // InternalBurst.g:586:4: (lv_parameters_3_0= ruleParameter )
            // InternalBurst.g:587:5: lv_parameters_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_parameters_3_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"org.xtext.burst.Burst.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:604:3: ( (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ENDLINE||(LA20_0>=19 && LA20_0<=20)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBurst.g:605:4: (this_ENDLINE_4= RULE_ENDLINE )* (otherlv_5= ',' | otherlv_6= 'and' ) (this_ENDLINE_7= RULE_ENDLINE )* ( (lv_parameters_8_0= ruleParameter ) )
            	    {
            	    // InternalBurst.g:605:4: (this_ENDLINE_4= RULE_ENDLINE )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_ENDLINE) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalBurst.g:606:5: this_ENDLINE_4= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_15); 

            	    	    					newLeafNode(this_ENDLINE_4, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    // InternalBurst.g:611:4: (otherlv_5= ',' | otherlv_6= 'and' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==19) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==20) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalBurst.g:612:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            	            					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getCommaKeyword_4_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalBurst.g:617:5: otherlv_6= 'and'
            	            {
            	            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	            					newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getAndKeyword_4_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalBurst.g:622:4: (this_ENDLINE_7= RULE_ENDLINE )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_ENDLINE) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalBurst.g:623:5: this_ENDLINE_7= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

            	    	    					newLeafNode(this_ENDLINE_7, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_4_2());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    // InternalBurst.g:628:4: ( (lv_parameters_8_0= ruleParameter ) )
            	    // InternalBurst.g:629:5: (lv_parameters_8_0= ruleParameter )
            	    {
            	    // InternalBurst.g:629:5: (lv_parameters_8_0= ruleParameter )
            	    // InternalBurst.g:630:6: lv_parameters_8_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParametersParameterParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_parameters_8_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_8_0,
            	    							"org.xtext.burst.Burst.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBurst.g:652:3: (this_ENDLINE_10= RULE_ENDLINE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ENDLINE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:653:4: this_ENDLINE_10= RULE_ENDLINE
            	    {
            	    this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_16); 

            	    				newLeafNode(this_ENDLINE_10, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalBurst.g:658:3: ( ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+ )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBurst.g:659:4: ( (lv_lines_11_0= ruleLine ) ) (this_ENDLINE_12= RULE_ENDLINE )+
            	    {
            	    // InternalBurst.g:659:4: ( (lv_lines_11_0= ruleLine ) )
            	    // InternalBurst.g:660:5: (lv_lines_11_0= ruleLine )
            	    {
            	    // InternalBurst.g:660:5: (lv_lines_11_0= ruleLine )
            	    // InternalBurst.g:661:6: lv_lines_11_0= ruleLine
            	    {

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getLinesLineParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_lines_11_0=ruleLine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_11_0,
            	    							"org.xtext.burst.Burst.Line");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBurst.g:678:4: (this_ENDLINE_12= RULE_ENDLINE )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_ENDLINE) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalBurst.g:679:5: this_ENDLINE_12= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_12=(Token)match(input,RULE_ENDLINE,FOLLOW_16); 

            	    	    					newLeafNode(this_ENDLINE_12, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_7_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalBurst.g:693:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBurst.g:693:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBurst.g:694:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalBurst.g:700:1: ruleParameter returns [EObject current=null] : (this_NamedParameter_0= ruleNamedParameter | this_StaticParameter_1= ruleStaticParameter | this_UsageParameter_2= ruleUsageParameter ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_NamedParameter_0 = null;

        EObject this_StaticParameter_1 = null;

        EObject this_UsageParameter_2 = null;



        	enterRule();

        try {
            // InternalBurst.g:706:2: ( (this_NamedParameter_0= ruleNamedParameter | this_StaticParameter_1= ruleStaticParameter | this_UsageParameter_2= ruleUsageParameter ) )
            // InternalBurst.g:707:2: (this_NamedParameter_0= ruleNamedParameter | this_StaticParameter_1= ruleStaticParameter | this_UsageParameter_2= ruleUsageParameter )
            {
            // InternalBurst.g:707:2: (this_NamedParameter_0= ruleNamedParameter | this_StaticParameter_1= ruleStaticParameter | this_UsageParameter_2= ruleUsageParameter )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    alt24=1;
                }
                else if ( (LA24_1==22) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBurst.g:708:3: this_NamedParameter_0= ruleNamedParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getNamedParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedParameter_0=ruleNamedParameter();

                    state._fsp--;


                    			current = this_NamedParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:717:3: this_StaticParameter_1= ruleStaticParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getStaticParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticParameter_1=ruleStaticParameter();

                    state._fsp--;


                    			current = this_StaticParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:726:3: this_UsageParameter_2= ruleUsageParameter
                    {

                    			newCompositeNode(grammarAccess.getParameterAccess().getUsageParameterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UsageParameter_2=ruleUsageParameter();

                    state._fsp--;


                    			current = this_UsageParameter_2;
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamedParameter"
    // InternalBurst.g:738:1: entryRuleNamedParameter returns [EObject current=null] : iv_ruleNamedParameter= ruleNamedParameter EOF ;
    public final EObject entryRuleNamedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedParameter = null;


        try {
            // InternalBurst.g:738:55: (iv_ruleNamedParameter= ruleNamedParameter EOF )
            // InternalBurst.g:739:2: iv_ruleNamedParameter= ruleNamedParameter EOF
            {
             newCompositeNode(grammarAccess.getNamedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedParameter=ruleNamedParameter();

            state._fsp--;

             current =iv_ruleNamedParameter; 
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
    // $ANTLR end "entryRuleNamedParameter"


    // $ANTLR start "ruleNamedParameter"
    // InternalBurst.g:745:1: ruleNamedParameter returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNamedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:751:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:752:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:752:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:753:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:753:3: ()
            // InternalBurst.g:754:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedParameterAccess().getNamedParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:760:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:761:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:761:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:762:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedParameterRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getNamedParameterAccess().getTypeConcernCrossReference_1_0());
            				

            }


            }

            // InternalBurst.g:773:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:774:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:774:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:775:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNamedParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedParameterRule());
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
    // $ANTLR end "ruleNamedParameter"


    // $ANTLR start "entryRuleStaticParameter"
    // InternalBurst.g:795:1: entryRuleStaticParameter returns [EObject current=null] : iv_ruleStaticParameter= ruleStaticParameter EOF ;
    public final EObject entryRuleStaticParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticParameter = null;


        try {
            // InternalBurst.g:795:56: (iv_ruleStaticParameter= ruleStaticParameter EOF )
            // InternalBurst.g:796:2: iv_ruleStaticParameter= ruleStaticParameter EOF
            {
             newCompositeNode(grammarAccess.getStaticParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticParameter=ruleStaticParameter();

            state._fsp--;

             current =iv_ruleStaticParameter; 
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
    // $ANTLR end "entryRuleStaticParameter"


    // $ANTLR start "ruleStaticParameter"
    // InternalBurst.g:802:1: ruleStaticParameter returns [EObject current=null] : ( () otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStaticParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBurst.g:808:2: ( ( () otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBurst.g:809:2: ( () otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBurst.g:809:2: ( () otherlv_1= 'with' ( (otherlv_2= RULE_ID ) ) )
            // InternalBurst.g:810:3: () otherlv_1= 'with' ( (otherlv_2= RULE_ID ) )
            {
            // InternalBurst.g:810:3: ()
            // InternalBurst.g:811:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaticParameterAccess().getStaticParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticParameterAccess().getWithKeyword_1());
            		
            // InternalBurst.g:821:3: ( (otherlv_2= RULE_ID ) )
            // InternalBurst.g:822:4: (otherlv_2= RULE_ID )
            {
            // InternalBurst.g:822:4: (otherlv_2= RULE_ID )
            // InternalBurst.g:823:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getStaticParameterAccess().getNameConcernCrossReference_2_0());
            				

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
    // $ANTLR end "ruleStaticParameter"


    // $ANTLR start "entryRuleUsageParameter"
    // InternalBurst.g:838:1: entryRuleUsageParameter returns [EObject current=null] : iv_ruleUsageParameter= ruleUsageParameter EOF ;
    public final EObject entryRuleUsageParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsageParameter = null;


        try {
            // InternalBurst.g:838:55: (iv_ruleUsageParameter= ruleUsageParameter EOF )
            // InternalBurst.g:839:2: iv_ruleUsageParameter= ruleUsageParameter EOF
            {
             newCompositeNode(grammarAccess.getUsageParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsageParameter=ruleUsageParameter();

            state._fsp--;

             current =iv_ruleUsageParameter; 
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
    // $ANTLR end "entryRuleUsageParameter"


    // $ANTLR start "ruleUsageParameter"
    // InternalBurst.g:845:1: ruleUsageParameter returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ruleusage ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleUsageParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalBurst.g:851:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ruleusage ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalBurst.g:852:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ruleusage ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalBurst.g:852:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ruleusage ( (lv_name_4_0= RULE_ID ) ) )
            // InternalBurst.g:853:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ruleusage ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalBurst.g:853:3: ()
            // InternalBurst.g:854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUsageParameterAccess().getUsageParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:860:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:861:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:861:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:862:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsageParameterRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getUsageParameterAccess().getTypeConcernCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUsageParameterAccess().getFullStopKeyword_2());
            		

            			newCompositeNode(grammarAccess.getUsageParameterAccess().getUsageParserRuleCall_3());
            		
            pushFollow(FOLLOW_4);
            ruleusage();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBurst.g:884:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBurst.g:885:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBurst.g:885:4: (lv_name_4_0= RULE_ID )
            // InternalBurst.g:886:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getUsageParameterAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsageParameterRule());
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
    // $ANTLR end "ruleUsageParameter"


    // $ANTLR start "entryRuleusage"
    // InternalBurst.g:906:1: entryRuleusage returns [String current=null] : iv_ruleusage= ruleusage EOF ;
    public final String entryRuleusage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleusage = null;


        try {
            // InternalBurst.g:906:45: (iv_ruleusage= ruleusage EOF )
            // InternalBurst.g:907:2: iv_ruleusage= ruleusage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusage=ruleusage();

            state._fsp--;

             current =iv_ruleusage.getText(); 
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
    // $ANTLR end "entryRuleusage"


    // $ANTLR start "ruleusage"
    // InternalBurst.g:913:1: ruleusage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleusage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalBurst.g:919:2: (this_ID_0= RULE_ID )
            // InternalBurst.g:920:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getUsageAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleusage"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:930:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:930:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:931:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:937:1: ruleLine returns [EObject current=null] : ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject lv_calls_1_0 = null;

        EObject lv_calls_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:943:2: ( ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* ) )
            // InternalBurst.g:944:2: ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* )
            {
            // InternalBurst.g:944:2: ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* )
            // InternalBurst.g:945:3: () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )*
            {
            // InternalBurst.g:945:3: ()
            // InternalBurst.g:946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalBurst.g:952:3: ( (lv_calls_1_0= ruleCall ) )
            // InternalBurst.g:953:4: (lv_calls_1_0= ruleCall )
            {
            // InternalBurst.g:953:4: (lv_calls_1_0= ruleCall )
            // InternalBurst.g:954:5: lv_calls_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_calls_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					add(
            						current,
            						"calls",
            						lv_calls_1_0,
            						"org.xtext.burst.Burst.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:971:3: ( (lv_calls_2_0= ruleCall ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBurst.g:972:4: (lv_calls_2_0= ruleCall )
            	    {
            	    // InternalBurst.g:972:4: (lv_calls_2_0= ruleCall )
            	    // InternalBurst.g:973:5: lv_calls_2_0= ruleCall
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_calls_2_0=ruleCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"calls",
            	    						lv_calls_2_0,
            	    						"org.xtext.burst.Burst.Call");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleCall"
    // InternalBurst.g:994:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:994:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:995:2: iv_ruleCall= ruleCall EOF
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
    // InternalBurst.g:1001:1: ruleCall returns [EObject current=null] : (this_VariableCall_0= ruleVariableCall | this_MemberCall_1= ruleMemberCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_VariableCall_0 = null;

        EObject this_MemberCall_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:1007:2: ( (this_VariableCall_0= ruleVariableCall | this_MemberCall_1= ruleMemberCall ) )
            // InternalBurst.g:1008:2: (this_VariableCall_0= ruleVariableCall | this_MemberCall_1= ruleMemberCall )
            {
            // InternalBurst.g:1008:2: (this_VariableCall_0= ruleVariableCall | this_MemberCall_1= ruleMemberCall )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==22) ) {
                    alt26=2;
                }
                else if ( (LA26_1==EOF||(LA26_1>=RULE_ENDLINE && LA26_1<=RULE_ID)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBurst.g:1009:3: this_VariableCall_0= ruleVariableCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getVariableCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableCall_0=ruleVariableCall();

                    state._fsp--;


                    			current = this_VariableCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:1018:3: this_MemberCall_1= ruleMemberCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getMemberCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemberCall_1=ruleMemberCall();

                    state._fsp--;


                    			current = this_MemberCall_1;
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


    // $ANTLR start "entryRuleMemberCall"
    // InternalBurst.g:1030:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalBurst.g:1030:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalBurst.g:1031:2: iv_ruleMemberCall= ruleMemberCall EOF
            {
             newCompositeNode(grammarAccess.getMemberCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberCall=ruleMemberCall();

            state._fsp--;

             current =iv_ruleMemberCall; 
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
    // $ANTLR end "entryRuleMemberCall"


    // $ANTLR start "ruleMemberCall"
    // InternalBurst.g:1037:1: ruleMemberCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBurst.g:1043:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBurst.g:1044:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBurst.g:1044:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalBurst.g:1045:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            // InternalBurst.g:1045:3: ()
            // InternalBurst.g:1046:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberCallAccess().getMemberCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1052:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:1053:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:1053:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:1054:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getMemberCallAccess().getVariableVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberCallAccess().getFullStopKeyword_2());
            		
            // InternalBurst.g:1069:3: ( (otherlv_3= RULE_ID ) )
            // InternalBurst.g:1070:4: (otherlv_3= RULE_ID )
            {
            // InternalBurst.g:1070:4: (otherlv_3= RULE_ID )
            // InternalBurst.g:1071:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberCallRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMemberCallAccess().getNameMemberCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMemberCall"


    // $ANTLR start "entryRuleVariableCall"
    // InternalBurst.g:1086:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalBurst.g:1086:53: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalBurst.g:1087:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
             newCompositeNode(grammarAccess.getVariableCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;

             current =iv_ruleVariableCall; 
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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalBurst.g:1093:1: ruleVariableCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBurst.g:1099:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBurst.g:1100:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBurst.g:1100:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBurst.g:1101:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBurst.g:1101:3: ()
            // InternalBurst.g:1102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableCallAccess().getVariableCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:1108:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:1109:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:1109:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:1110:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getNameVariableCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:1125:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:1125:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:1126:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBurst.g:1132:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:1138:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:1139:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:1139:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:1140:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:1147:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBurst.g:1148:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\22\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\11\uffff\3\3\1\2\1\3",
            "\1\1\12\uffff\2\3\1\2\1\3",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "366:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000058010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000058030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000184010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});

}