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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'concern'", "'extends'", "'when'", "','", "'and'", "'toto'", "'.'"
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
    // InternalBurst.g:197:1: ruleRulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' ( (lv_elements_5_0= rulePackageElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleRulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ENDLINE_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:203:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' ( (lv_elements_5_0= rulePackageElement ) )* otherlv_6= '}' ) )
            // InternalBurst.g:204:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' ( (lv_elements_5_0= rulePackageElement ) )* otherlv_6= '}' )
            {
            // InternalBurst.g:204:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' ( (lv_elements_5_0= rulePackageElement ) )* otherlv_6= '}' )
            // InternalBurst.g:205:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= '{' ( (lv_elements_5_0= rulePackageElement ) )* otherlv_6= '}'
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
            		
            // InternalBurst.g:245:3: ( (lv_elements_5_0= rulePackageElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ENDLINE||LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:246:4: (lv_elements_5_0= rulePackageElement )
            	    {
            	    // InternalBurst.g:246:4: (lv_elements_5_0= rulePackageElement )
            	    // InternalBurst.g:247:5: lv_elements_5_0= rulePackageElement
            	    {

            	    					newCompositeNode(grammarAccess.getRulePackageAccess().getElementsPackageElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_5_0=rulePackageElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulePackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.xtext.burst.Burst.PackageElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRulePackageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalBurst.g:272:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // InternalBurst.g:272:55: (iv_rulePackageElement= rulePackageElement EOF )
            // InternalBurst.g:273:2: iv_rulePackageElement= rulePackageElement EOF
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
    // InternalBurst.g:279:1: rulePackageElement returns [EObject current=null] : (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_2=null;
        EObject this_RuleConcern_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:285:2: ( (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE ) )
            // InternalBurst.g:286:2: (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE )
            {
            // InternalBurst.g:286:2: (this_RuleConcern_0= ruleRuleConcern | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case RULE_ENDLINE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBurst.g:287:3: this_RuleConcern_0= ruleRuleConcern
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
                    // InternalBurst.g:296:3: this_RuleIntersect_1= ruleRuleIntersect
                    {

                    			newCompositeNode(grammarAccess.getPackageElementAccess().getRuleIntersectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_1=ruleRuleIntersect();

                    state._fsp--;


                    			current = this_RuleIntersect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:305:3: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    			newLeafNode(this_ENDLINE_2, grammarAccess.getPackageElementAccess().getENDLINETerminalRuleCall_2());
                    		

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
    // InternalBurst.g:313:1: entryRuleRuleConcern returns [EObject current=null] : iv_ruleRuleConcern= ruleRuleConcern EOF ;
    public final EObject entryRuleRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleConcern = null;


        try {
            // InternalBurst.g:313:52: (iv_ruleRuleConcern= ruleRuleConcern EOF )
            // InternalBurst.g:314:2: iv_ruleRuleConcern= ruleRuleConcern EOF
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
    // InternalBurst.g:320:1: ruleRuleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleRuleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_ENDLINE_3=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:326:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )? ) )
            // InternalBurst.g:327:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )? )
            {
            // InternalBurst.g:327:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )? )
            // InternalBurst.g:328:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )? (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )?
            {
            // InternalBurst.g:328:3: ()
            // InternalBurst.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:339:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:340:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:340:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:341:5: lv_name_2_0= RULE_ID
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

            // InternalBurst.g:357:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:358:4: (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) )
                    {
                    // InternalBurst.g:358:4: (this_ENDLINE_3= RULE_ENDLINE )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ENDLINE) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBurst.g:359:5: this_ENDLINE_3= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_3=(Token)match(input,RULE_ENDLINE,FOLLOW_8); 

                    	    					newLeafNode(this_ENDLINE_3, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleConcernAccess().getExtendsKeyword_3_1());
                    			
                    // InternalBurst.g:368:4: (this_ENDLINE_5= RULE_ENDLINE )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ENDLINE) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBurst.g:369:5: this_ENDLINE_5= RULE_ENDLINE
                    	    {
                    	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

                    	    					newLeafNode(this_ENDLINE_5, grammarAccess.getRuleConcernAccess().getENDLINETerminalRuleCall_3_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalBurst.g:374:4: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:375:5: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:375:5: ( ruleQualifiedName )
                    // InternalBurst.g:376:6: ruleQualifiedName
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

            // InternalBurst.g:391:3: (otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:392:4: otherlv_7= '{' ( (lv_elements_8_0= ruleConcernElement ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleConcernAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBurst.g:396:4: ( (lv_elements_8_0= ruleConcernElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_ENDLINE && LA9_0<=RULE_ID)||LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBurst.g:397:5: (lv_elements_8_0= ruleConcernElement )
                    	    {
                    	    // InternalBurst.g:397:5: (lv_elements_8_0= ruleConcernElement )
                    	    // InternalBurst.g:398:6: lv_elements_8_0= ruleConcernElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleConcernAccess().getElementsConcernElementParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_elements_8_0=ruleConcernElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleConcernRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_8_0,
                    	    							"org.xtext.burst.Burst.ConcernElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleConcernAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // InternalBurst.g:424:1: entryRuleConcernElement returns [EObject current=null] : iv_ruleConcernElement= ruleConcernElement EOF ;
    public final EObject entryRuleConcernElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcernElement = null;


        try {
            // InternalBurst.g:424:55: (iv_ruleConcernElement= ruleConcernElement EOF )
            // InternalBurst.g:425:2: iv_ruleConcernElement= ruleConcernElement EOF
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
    // InternalBurst.g:431:1: ruleConcernElement returns [EObject current=null] : (this_DeclareMember_0= ruleDeclareMember | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE ) ;
    public final EObject ruleConcernElement() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_2=null;
        EObject this_DeclareMember_0 = null;

        EObject this_RuleIntersect_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:437:2: ( (this_DeclareMember_0= ruleDeclareMember | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE ) )
            // InternalBurst.g:438:2: (this_DeclareMember_0= ruleDeclareMember | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE )
            {
            // InternalBurst.g:438:2: (this_DeclareMember_0= ruleDeclareMember | this_RuleIntersect_1= ruleRuleIntersect | this_ENDLINE_2= RULE_ENDLINE )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case RULE_ENDLINE:
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
                    // InternalBurst.g:439:3: this_DeclareMember_0= ruleDeclareMember
                    {

                    			newCompositeNode(grammarAccess.getConcernElementAccess().getDeclareMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclareMember_0=ruleDeclareMember();

                    state._fsp--;


                    			current = this_DeclareMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:448:3: this_RuleIntersect_1= ruleRuleIntersect
                    {

                    			newCompositeNode(grammarAccess.getConcernElementAccess().getRuleIntersectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RuleIntersect_1=ruleRuleIntersect();

                    state._fsp--;


                    			current = this_RuleIntersect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:457:3: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    			newLeafNode(this_ENDLINE_2, grammarAccess.getConcernElementAccess().getENDLINETerminalRuleCall_2());
                    		

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


    // $ANTLR start "entryRuleDeclareMember"
    // InternalBurst.g:465:1: entryRuleDeclareMember returns [EObject current=null] : iv_ruleDeclareMember= ruleDeclareMember EOF ;
    public final EObject entryRuleDeclareMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareMember = null;


        try {
            // InternalBurst.g:465:54: (iv_ruleDeclareMember= ruleDeclareMember EOF )
            // InternalBurst.g:466:2: iv_ruleDeclareMember= ruleDeclareMember EOF
            {
             newCompositeNode(grammarAccess.getDeclareMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclareMember=ruleDeclareMember();

            state._fsp--;

             current =iv_ruleDeclareMember; 
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
    // $ANTLR end "entryRuleDeclareMember"


    // $ANTLR start "ruleDeclareMember"
    // InternalBurst.g:472:1: ruleDeclareMember returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclareMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:478:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:479:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:479:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:480:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:480:3: ()
            // InternalBurst.g:481:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclareMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:487:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:488:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:488:4: ( ruleQualifiedName )
            // InternalBurst.g:489:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclareMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeclareMemberAccess().getConcernConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:503:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:504:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:504:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:505:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclareMemberAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclareMemberRule());
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
    // $ANTLR end "ruleDeclareMember"


    // $ANTLR start "entryRuleRuleIntersect"
    // InternalBurst.g:525:1: entryRuleRuleIntersect returns [EObject current=null] : iv_ruleRuleIntersect= ruleRuleIntersect EOF ;
    public final EObject entryRuleRuleIntersect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIntersect = null;


        try {
            // InternalBurst.g:525:54: (iv_ruleRuleIntersect= ruleRuleIntersect EOF )
            // InternalBurst.g:526:2: iv_ruleRuleIntersect= ruleRuleIntersect EOF
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
    // InternalBurst.g:532:1: ruleRuleIntersect returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )* otherlv_6= '{' ( (lv_lines_7_0= ruleIntersectionElement ) )* otherlv_8= '}' ) ;
    public final EObject ruleRuleIntersect() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_ENDLINE_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_lines_7_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:538:2: ( ( () ( (lv_name_1_0= 'when' ) ) ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )* otherlv_6= '{' ( (lv_lines_7_0= ruleIntersectionElement ) )* otherlv_8= '}' ) )
            // InternalBurst.g:539:2: ( () ( (lv_name_1_0= 'when' ) ) ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )* otherlv_6= '{' ( (lv_lines_7_0= ruleIntersectionElement ) )* otherlv_8= '}' )
            {
            // InternalBurst.g:539:2: ( () ( (lv_name_1_0= 'when' ) ) ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )* otherlv_6= '{' ( (lv_lines_7_0= ruleIntersectionElement ) )* otherlv_8= '}' )
            // InternalBurst.g:540:3: () ( (lv_name_1_0= 'when' ) ) ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )* otherlv_6= '{' ( (lv_lines_7_0= ruleIntersectionElement ) )* otherlv_8= '}'
            {
            // InternalBurst.g:540:3: ()
            // InternalBurst.g:541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleIntersectAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:547:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:548:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:548:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:549:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleIntersectAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleIntersectRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:561:3: ( (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ENDLINE && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBurst.g:562:4: (this_ENDLINE_2= RULE_ENDLINE )* ( (lv_parameters_3_0= ruleDeclareParameter ) ) (otherlv_4= ',' | otherlv_5= 'and' )?
            	    {
            	    // InternalBurst.g:562:4: (this_ENDLINE_2= RULE_ENDLINE )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==RULE_ENDLINE) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalBurst.g:563:5: this_ENDLINE_2= RULE_ENDLINE
            	    	    {
            	    	    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_9); 

            	    	    					newLeafNode(this_ENDLINE_2, grammarAccess.getRuleIntersectAccess().getENDLINETerminalRuleCall_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    // InternalBurst.g:568:4: ( (lv_parameters_3_0= ruleDeclareParameter ) )
            	    // InternalBurst.g:569:5: (lv_parameters_3_0= ruleDeclareParameter )
            	    {
            	    // InternalBurst.g:569:5: (lv_parameters_3_0= ruleDeclareParameter )
            	    // InternalBurst.g:570:6: lv_parameters_3_0= ruleDeclareParameter
            	    {

            	    						newCompositeNode(grammarAccess.getRuleIntersectAccess().getParametersDeclareParameterParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_parameters_3_0=ruleDeclareParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.burst.Burst.DeclareParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBurst.g:587:4: (otherlv_4= ',' | otherlv_5= 'and' )?
            	    int alt13=3;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==19) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==20) ) {
            	        alt13=2;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalBurst.g:588:5: otherlv_4= ','
            	            {
            	            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            	            					newLeafNode(otherlv_4, grammarAccess.getRuleIntersectAccess().getCommaKeyword_2_2_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalBurst.g:593:5: otherlv_5= 'and'
            	            {
            	            otherlv_5=(Token)match(input,20,FOLLOW_12); 

            	            					newLeafNode(otherlv_5, grammarAccess.getRuleIntersectAccess().getAndKeyword_2_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleIntersectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBurst.g:603:3: ( (lv_lines_7_0= ruleIntersectionElement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ENDLINE && LA15_0<=RULE_ID)||LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBurst.g:604:4: (lv_lines_7_0= ruleIntersectionElement )
            	    {
            	    // InternalBurst.g:604:4: (lv_lines_7_0= ruleIntersectionElement )
            	    // InternalBurst.g:605:5: lv_lines_7_0= ruleIntersectionElement
            	    {

            	    					newCompositeNode(grammarAccess.getRuleIntersectAccess().getLinesIntersectionElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_lines_7_0=ruleIntersectionElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleIntersectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_7_0,
            	    						"org.xtext.burst.Burst.IntersectionElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleIntersectAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDeclareParameter"
    // InternalBurst.g:630:1: entryRuleDeclareParameter returns [EObject current=null] : iv_ruleDeclareParameter= ruleDeclareParameter EOF ;
    public final EObject entryRuleDeclareParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareParameter = null;


        try {
            // InternalBurst.g:630:57: (iv_ruleDeclareParameter= ruleDeclareParameter EOF )
            // InternalBurst.g:631:2: iv_ruleDeclareParameter= ruleDeclareParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclareParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclareParameter=ruleDeclareParameter();

            state._fsp--;

             current =iv_ruleDeclareParameter; 
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
    // $ANTLR end "entryRuleDeclareParameter"


    // $ANTLR start "ruleDeclareParameter"
    // InternalBurst.g:637:1: ruleDeclareParameter returns [EObject current=null] : this_RenamedParameter_0= ruleRenamedParameter ;
    public final EObject ruleDeclareParameter() throws RecognitionException {
        EObject current = null;

        EObject this_RenamedParameter_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:643:2: (this_RenamedParameter_0= ruleRenamedParameter )
            // InternalBurst.g:644:2: this_RenamedParameter_0= ruleRenamedParameter
            {

            		newCompositeNode(grammarAccess.getDeclareParameterAccess().getRenamedParameterParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RenamedParameter_0=ruleRenamedParameter();

            state._fsp--;


            		current = this_RenamedParameter_0;
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
    // $ANTLR end "ruleDeclareParameter"


    // $ANTLR start "entryRuleRenamedParameter"
    // InternalBurst.g:655:1: entryRuleRenamedParameter returns [EObject current=null] : iv_ruleRenamedParameter= ruleRenamedParameter EOF ;
    public final EObject entryRuleRenamedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenamedParameter = null;


        try {
            // InternalBurst.g:655:57: (iv_ruleRenamedParameter= ruleRenamedParameter EOF )
            // InternalBurst.g:656:2: iv_ruleRenamedParameter= ruleRenamedParameter EOF
            {
             newCompositeNode(grammarAccess.getRenamedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenamedParameter=ruleRenamedParameter();

            state._fsp--;

             current =iv_ruleRenamedParameter; 
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
    // $ANTLR end "entryRuleRenamedParameter"


    // $ANTLR start "ruleRenamedParameter"
    // InternalBurst.g:662:1: ruleRenamedParameter returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRenamedParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:668:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:669:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:669:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:670:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:670:3: ()
            // InternalBurst.g:671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRenamedParameterAccess().getRenamedParameterAction_0(),
            					current);
            			

            }

            // InternalBurst.g:677:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:678:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:678:4: ( ruleQualifiedName )
            // InternalBurst.g:679:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenamedParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenamedParameterAccess().getConcernConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:693:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:694:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:694:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:695:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRenamedParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenamedParameterRule());
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
    // $ANTLR end "ruleRenamedParameter"


    // $ANTLR start "entryRuleIntersectionElement"
    // InternalBurst.g:715:1: entryRuleIntersectionElement returns [EObject current=null] : iv_ruleIntersectionElement= ruleIntersectionElement EOF ;
    public final EObject entryRuleIntersectionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionElement = null;


        try {
            // InternalBurst.g:715:60: (iv_ruleIntersectionElement= ruleIntersectionElement EOF )
            // InternalBurst.g:716:2: iv_ruleIntersectionElement= ruleIntersectionElement EOF
            {
             newCompositeNode(grammarAccess.getIntersectionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntersectionElement=ruleIntersectionElement();

            state._fsp--;

             current =iv_ruleIntersectionElement; 
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
    // $ANTLR end "entryRuleIntersectionElement"


    // $ANTLR start "ruleIntersectionElement"
    // InternalBurst.g:722:1: ruleIntersectionElement returns [EObject current=null] : (this_Line_0= ruleLine | this_ENDLINE_1= RULE_ENDLINE ) ;
    public final EObject ruleIntersectionElement() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_1=null;
        EObject this_Line_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:728:2: ( (this_Line_0= ruleLine | this_ENDLINE_1= RULE_ENDLINE ) )
            // InternalBurst.g:729:2: (this_Line_0= ruleLine | this_ENDLINE_1= RULE_ENDLINE )
            {
            // InternalBurst.g:729:2: (this_Line_0= ruleLine | this_ENDLINE_1= RULE_ENDLINE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ENDLINE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:730:3: this_Line_0= ruleLine
                    {

                    			newCompositeNode(grammarAccess.getIntersectionElementAccess().getLineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Line_0=ruleLine();

                    state._fsp--;


                    			current = this_Line_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:739:3: this_ENDLINE_1= RULE_ENDLINE
                    {
                    this_ENDLINE_1=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    			newLeafNode(this_ENDLINE_1, grammarAccess.getIntersectionElementAccess().getENDLINETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleIntersectionElement"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:747:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:747:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:748:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:754:1: ruleLine returns [EObject current=null] : ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject lv_calls_1_0 = null;

        EObject lv_calls_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:760:2: ( ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* ) )
            // InternalBurst.g:761:2: ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* )
            {
            // InternalBurst.g:761:2: ( () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )* )
            // InternalBurst.g:762:3: () ( (lv_calls_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleCall ) )*
            {
            // InternalBurst.g:762:3: ()
            // InternalBurst.g:763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            // InternalBurst.g:769:3: ( (lv_calls_1_0= ruleCall ) )
            // InternalBurst.g:770:4: (lv_calls_1_0= ruleCall )
            {
            // InternalBurst.g:770:4: (lv_calls_1_0= ruleCall )
            // InternalBurst.g:771:5: lv_calls_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalBurst.g:788:3: ( (lv_calls_2_0= ruleCall ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }
                else if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:789:4: (lv_calls_2_0= ruleCall )
            	    {
            	    // InternalBurst.g:789:4: (lv_calls_2_0= ruleCall )
            	    // InternalBurst.g:790:5: lv_calls_2_0= ruleCall
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getCallsCallParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop17;
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
    // InternalBurst.g:811:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:811:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:812:2: iv_ruleCall= ruleCall EOF
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
    // InternalBurst.g:818:1: ruleCall returns [EObject current=null] : (this_toto_0= ruletoto | this_RenamedParameterCall_1= ruleRenamedParameterCall ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject this_toto_0 = null;

        EObject this_RenamedParameterCall_1 = null;



        	enterRule();

        try {
            // InternalBurst.g:824:2: ( (this_toto_0= ruletoto | this_RenamedParameterCall_1= ruleRenamedParameterCall ) )
            // InternalBurst.g:825:2: (this_toto_0= ruletoto | this_RenamedParameterCall_1= ruleRenamedParameterCall )
            {
            // InternalBurst.g:825:2: (this_toto_0= ruletoto | this_RenamedParameterCall_1= ruleRenamedParameterCall )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:826:3: this_toto_0= ruletoto
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getTotoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_toto_0=ruletoto();

                    state._fsp--;


                    			current = this_toto_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:835:3: this_RenamedParameterCall_1= ruleRenamedParameterCall
                    {

                    			newCompositeNode(grammarAccess.getCallAccess().getRenamedParameterCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenamedParameterCall_1=ruleRenamedParameterCall();

                    state._fsp--;


                    			current = this_RenamedParameterCall_1;
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


    // $ANTLR start "entryRuletoto"
    // InternalBurst.g:847:1: entryRuletoto returns [EObject current=null] : iv_ruletoto= ruletoto EOF ;
    public final EObject entryRuletoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletoto = null;


        try {
            // InternalBurst.g:847:45: (iv_ruletoto= ruletoto EOF )
            // InternalBurst.g:848:2: iv_ruletoto= ruletoto EOF
            {
             newCompositeNode(grammarAccess.getTotoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletoto=ruletoto();

            state._fsp--;

             current =iv_ruletoto; 
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
    // $ANTLR end "entryRuletoto"


    // $ANTLR start "ruletoto"
    // InternalBurst.g:854:1: ruletoto returns [EObject current=null] : ( () ( (lv_name_1_0= 'toto' ) ) ) ;
    public final EObject ruletoto() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBurst.g:860:2: ( ( () ( (lv_name_1_0= 'toto' ) ) ) )
            // InternalBurst.g:861:2: ( () ( (lv_name_1_0= 'toto' ) ) )
            {
            // InternalBurst.g:861:2: ( () ( (lv_name_1_0= 'toto' ) ) )
            // InternalBurst.g:862:3: () ( (lv_name_1_0= 'toto' ) )
            {
            // InternalBurst.g:862:3: ()
            // InternalBurst.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTotoAccess().getTotoAction_0(),
            					current);
            			

            }

            // InternalBurst.g:869:3: ( (lv_name_1_0= 'toto' ) )
            // InternalBurst.g:870:4: (lv_name_1_0= 'toto' )
            {
            // InternalBurst.g:870:4: (lv_name_1_0= 'toto' )
            // InternalBurst.g:871:5: lv_name_1_0= 'toto'
            {
            lv_name_1_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTotoAccess().getNameTotoKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTotoRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "toto");
            				

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
    // $ANTLR end "ruletoto"


    // $ANTLR start "entryRuleRenamedParameterCall"
    // InternalBurst.g:887:1: entryRuleRenamedParameterCall returns [EObject current=null] : iv_ruleRenamedParameterCall= ruleRenamedParameterCall EOF ;
    public final EObject entryRuleRenamedParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenamedParameterCall = null;


        try {
            // InternalBurst.g:887:61: (iv_ruleRenamedParameterCall= ruleRenamedParameterCall EOF )
            // InternalBurst.g:888:2: iv_ruleRenamedParameterCall= ruleRenamedParameterCall EOF
            {
             newCompositeNode(grammarAccess.getRenamedParameterCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenamedParameterCall=ruleRenamedParameterCall();

            state._fsp--;

             current =iv_ruleRenamedParameterCall; 
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
    // $ANTLR end "entryRuleRenamedParameterCall"


    // $ANTLR start "ruleRenamedParameterCall"
    // InternalBurst.g:894:1: ruleRenamedParameterCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRenamedParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBurst.g:900:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBurst.g:901:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBurst.g:901:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBurst.g:902:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBurst.g:902:3: ()
            // InternalBurst.g:903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRenamedParameterCallAccess().getRenamedParameterCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:909:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:910:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:910:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:911:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenamedParameterCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRenamedParameterCallAccess().getNameRenamedParameterCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRenamedParameterCall"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:926:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:926:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:927:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBurst.g:933:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:939:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:940:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:940:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:941:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:948:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:949:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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


    protected DFA8 dfa8 = new DFA8(this);
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "357:3: ( (this_ENDLINE_3= RULE_ENDLINE )* otherlv_4= 'extends' (this_ENDLINE_5= RULE_ENDLINE )* ( ( ruleQualifiedName ) ) )?";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000184030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});

}