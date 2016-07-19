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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'when'"
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
    public static final int RULE_ML_COMMENT=8;

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
    // InternalBurst.g:71:1: ruleFile returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalBurst.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalBurst.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENDLINE||LA1_0==12||(LA1_0>=16 && LA1_0<=17)||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalBurst.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalBurst.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getFileAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.burst.Burst.AbstractElement");
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalBurst.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalBurst.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalBurst.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalBurst.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage | this_ENDLINE_4= RULE_ENDLINE ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_4=null;
        EObject this_Import_0 = null;

        EObject this_Concern_1 = null;

        EObject this_Intersection_2 = null;

        EObject this_Package_3 = null;



        	enterRule();

        try {
            // InternalBurst.g:113:2: ( (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage | this_ENDLINE_4= RULE_ENDLINE ) )
            // InternalBurst.g:114:2: (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage | this_ENDLINE_4= RULE_ENDLINE )
            {
            // InternalBurst.g:114:2: (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage | this_ENDLINE_4= RULE_ENDLINE )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            case RULE_ENDLINE:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBurst.g:115:3: this_Import_0= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    			current = this_Import_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBurst.g:124:3: this_Concern_1= ruleConcern
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getConcernParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concern_1=ruleConcern();

                    state._fsp--;


                    			current = this_Concern_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBurst.g:133:3: this_Intersection_2= ruleIntersection
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getIntersectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intersection_2=ruleIntersection();

                    state._fsp--;


                    			current = this_Intersection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBurst.g:142:3: this_Package_3= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_3=rulePackage();

                    state._fsp--;


                    			current = this_Package_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBurst.g:151:3: this_ENDLINE_4= RULE_ENDLINE
                    {
                    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    			newLeafNode(this_ENDLINE_4, grammarAccess.getAbstractElementAccess().getENDLINETerminalRuleCall_4());
                    		

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // InternalBurst.g:159:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalBurst.g:159:48: (iv_rulePackage= rulePackage EOF )
            // InternalBurst.g:160:2: iv_rulePackage= rulePackage EOF
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
    // InternalBurst.g:166:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' this_ENDLINE_5= RULE_ENDLINE ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:172:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' this_ENDLINE_5= RULE_ENDLINE ) )
            // InternalBurst.g:173:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' this_ENDLINE_5= RULE_ENDLINE )
            {
            // InternalBurst.g:173:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' this_ENDLINE_5= RULE_ENDLINE )
            // InternalBurst.g:174:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' this_ENDLINE_5= RULE_ENDLINE
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalBurst.g:178:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalBurst.g:179:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalBurst.g:179:4: (lv_name_1_0= ruleQualifiedName )
            // InternalBurst.g:180:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.burst.Burst.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBurst.g:201:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ENDLINE||LA3_0==12||(LA3_0>=16 && LA3_0<=17)||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:202:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalBurst.g:202:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalBurst.g:203:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.burst.Burst.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
            		
            this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_5, grammarAccess.getPackageAccess().getENDLINETerminalRuleCall_5());
            		

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBurst.g:232:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:232:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:233:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBurst.g:239:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:245:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:246:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:246:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:247:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:254:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:255:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:272:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBurst.g:272:47: (iv_ruleImport= ruleImport EOF )
            // InternalBurst.g:273:2: iv_ruleImport= ruleImport EOF
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
    // InternalBurst.g:279:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) this_ENDLINE_2= RULE_ENDLINE ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ENDLINE_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:285:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) this_ENDLINE_2= RULE_ENDLINE ) )
            // InternalBurst.g:286:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) this_ENDLINE_2= RULE_ENDLINE )
            {
            // InternalBurst.g:286:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) this_ENDLINE_2= RULE_ENDLINE )
            // InternalBurst.g:287:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) this_ENDLINE_2= RULE_ENDLINE
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBurst.g:291:3: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // InternalBurst.g:292:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // InternalBurst.g:292:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            // InternalBurst.g:293:5: lv_importedNamespace_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.burst.Burst.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_2, grammarAccess.getImportAccess().getENDLINETerminalRuleCall_2());
            		

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


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:318:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalBurst.g:318:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalBurst.g:319:2: iv_ruleConcern= ruleConcern EOF
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
    // InternalBurst.g:325:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )? (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )? this_ENDLINE_15= RULE_ENDLINE ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ENDLINE_2=null;
        Token lv_name_3_0=null;
        Token this_ENDLINE_4=null;
        Token otherlv_5=null;
        Token this_ENDLINE_6=null;
        Token this_ENDLINE_8=null;
        Token otherlv_9=null;
        Token this_ENDLINE_10=null;
        Token this_ENDLINE_13=null;
        Token otherlv_14=null;
        Token this_ENDLINE_15=null;
        EObject lv_members_11_0 = null;

        EObject lv_intersections_12_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:331:2: ( ( () otherlv_1= 'concern' (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )? (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )? this_ENDLINE_15= RULE_ENDLINE ) )
            // InternalBurst.g:332:2: ( () otherlv_1= 'concern' (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )? (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )? this_ENDLINE_15= RULE_ENDLINE )
            {
            // InternalBurst.g:332:2: ( () otherlv_1= 'concern' (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )? (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )? this_ENDLINE_15= RULE_ENDLINE )
            // InternalBurst.g:333:3: () otherlv_1= 'concern' (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )? (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )? this_ENDLINE_15= RULE_ENDLINE
            {
            // InternalBurst.g:333:3: ()
            // InternalBurst.g:334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:344:3: (this_ENDLINE_2= RULE_ENDLINE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ENDLINE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBurst.g:345:4: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_4); 

                    				newLeafNode(this_ENDLINE_2, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalBurst.g:350:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:351:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:351:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:352:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_3_0, grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcernRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.burst.Burst.ID");
            				

            }


            }

            // InternalBurst.g:368:3: (this_ENDLINE_4= RULE_ENDLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ENDLINE) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==13||LA6_1==18) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_ENDLINE) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:369:4: this_ENDLINE_4= RULE_ENDLINE
                    {
                    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_10); 

                    				newLeafNode(this_ENDLINE_4, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_4());
                    			

                    }
                    break;

            }

            // InternalBurst.g:374:3: (otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBurst.g:375:4: otherlv_5= 'extends' (this_ENDLINE_6= RULE_ENDLINE )? ( ( ruleQualifiedName ) ) (this_ENDLINE_8= RULE_ENDLINE )?
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getConcernAccess().getExtendsKeyword_5_0());
                    			
                    // InternalBurst.g:379:4: (this_ENDLINE_6= RULE_ENDLINE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ENDLINE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalBurst.g:380:5: this_ENDLINE_6= RULE_ENDLINE
                            {
                            this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_4); 

                            					newLeafNode(this_ENDLINE_6, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_1());
                            				

                            }
                            break;

                    }

                    // InternalBurst.g:385:4: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:386:5: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:386:5: ( ruleQualifiedName )
                    // InternalBurst.g:387:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcernRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBurst.g:401:4: (this_ENDLINE_8= RULE_ENDLINE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ENDLINE) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==RULE_ENDLINE||LA8_1==13) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalBurst.g:402:5: this_ENDLINE_8= RULE_ENDLINE
                            {
                            this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_11); 

                            					newLeafNode(this_ENDLINE_8, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_5_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalBurst.g:408:3: (otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBurst.g:409:4: otherlv_9= '{' (this_ENDLINE_10= RULE_ENDLINE )? ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )* (this_ENDLINE_13= RULE_ENDLINE )? otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalBurst.g:413:4: (this_ENDLINE_10= RULE_ENDLINE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ENDLINE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBurst.g:414:5: this_ENDLINE_10= RULE_ENDLINE
                            {
                            this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_12); 

                            					newLeafNode(this_ENDLINE_10, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_1());
                            				

                            }
                            break;

                    }

                    // InternalBurst.g:419:4: ( ( (lv_members_11_0= ruleMember ) ) | ( (lv_intersections_12_0= ruleIntersection ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }
                        else if ( (LA11_0==19) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBurst.g:420:5: ( (lv_members_11_0= ruleMember ) )
                    	    {
                    	    // InternalBurst.g:420:5: ( (lv_members_11_0= ruleMember ) )
                    	    // InternalBurst.g:421:6: (lv_members_11_0= ruleMember )
                    	    {
                    	    // InternalBurst.g:421:6: (lv_members_11_0= ruleMember )
                    	    // InternalBurst.g:422:7: lv_members_11_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_members_11_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_11_0,
                    	    								"org.xtext.burst.Burst.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBurst.g:440:5: ( (lv_intersections_12_0= ruleIntersection ) )
                    	    {
                    	    // InternalBurst.g:440:5: ( (lv_intersections_12_0= ruleIntersection ) )
                    	    // InternalBurst.g:441:6: (lv_intersections_12_0= ruleIntersection )
                    	    {
                    	    // InternalBurst.g:441:6: (lv_intersections_12_0= ruleIntersection )
                    	    // InternalBurst.g:442:7: lv_intersections_12_0= ruleIntersection
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_intersections_12_0=ruleIntersection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intersections",
                    	    								lv_intersections_12_0,
                    	    								"org.xtext.burst.Burst.Intersection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalBurst.g:460:4: (this_ENDLINE_13= RULE_ENDLINE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ENDLINE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalBurst.g:461:5: this_ENDLINE_13= RULE_ENDLINE
                            {
                            this_ENDLINE_13=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

                            					newLeafNode(this_ENDLINE_13, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_6_3());
                            				

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            this_ENDLINE_15=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_15, grammarAccess.getConcernAccess().getENDLINETerminalRuleCall_7());
            		

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


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:479:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:479:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:480:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:486:1: ruleMember returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_2=null;
        Token lv_name_3_0=null;
        Token this_ENDLINE_4=null;


        	enterRule();

        try {
            // InternalBurst.g:492:2: ( ( () ( ( ruleQualifiedName ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? ) )
            // InternalBurst.g:493:2: ( () ( ( ruleQualifiedName ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? )
            {
            // InternalBurst.g:493:2: ( () ( ( ruleQualifiedName ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )? )
            // InternalBurst.g:494:3: () ( ( ruleQualifiedName ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_name_3_0= RULE_ID ) ) (this_ENDLINE_4= RULE_ENDLINE )?
            {
            // InternalBurst.g:494:3: ()
            // InternalBurst.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:501:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:502:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:502:4: ( ruleQualifiedName )
            // InternalBurst.g:503:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberAccess().getConcernConcernCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:517:3: (this_ENDLINE_2= RULE_ENDLINE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ENDLINE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBurst.g:518:4: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_4); 

                    				newLeafNode(this_ENDLINE_2, grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalBurst.g:523:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:524:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:524:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:525:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalBurst.g:541:3: (this_ENDLINE_4= RULE_ENDLINE )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ENDLINE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBurst.g:542:4: this_ENDLINE_4= RULE_ENDLINE
                    {
                    this_ENDLINE_4=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

                    				newLeafNode(this_ENDLINE_4, grammarAccess.getMemberAccess().getENDLINETerminalRuleCall_4());
                    			

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleIntersection"
    // InternalBurst.g:551:1: entryRuleIntersection returns [EObject current=null] : iv_ruleIntersection= ruleIntersection EOF ;
    public final EObject entryRuleIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersection = null;


        try {
            // InternalBurst.g:551:53: (iv_ruleIntersection= ruleIntersection EOF )
            // InternalBurst.g:552:2: iv_ruleIntersection= ruleIntersection EOF
            {
             newCompositeNode(grammarAccess.getIntersectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntersection=ruleIntersection();

            state._fsp--;

             current =iv_ruleIntersection; 
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
    // $ANTLR end "entryRuleIntersection"


    // $ANTLR start "ruleIntersection"
    // InternalBurst.g:558:1: ruleIntersection returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_members_3_0= ruleMember ) )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )? ( (lv_linesContent_6_0= ruleLine ) )* (this_ENDLINE_7= RULE_ENDLINE )? otherlv_8= '}' ) ;
    public final EObject ruleIntersection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_ENDLINE_2=null;
        Token otherlv_4=null;
        Token this_ENDLINE_5=null;
        Token this_ENDLINE_7=null;
        Token otherlv_8=null;
        EObject lv_members_3_0 = null;

        EObject lv_linesContent_6_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:564:2: ( ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_members_3_0= ruleMember ) )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )? ( (lv_linesContent_6_0= ruleLine ) )* (this_ENDLINE_7= RULE_ENDLINE )? otherlv_8= '}' ) )
            // InternalBurst.g:565:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_members_3_0= ruleMember ) )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )? ( (lv_linesContent_6_0= ruleLine ) )* (this_ENDLINE_7= RULE_ENDLINE )? otherlv_8= '}' )
            {
            // InternalBurst.g:565:2: ( () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_members_3_0= ruleMember ) )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )? ( (lv_linesContent_6_0= ruleLine ) )* (this_ENDLINE_7= RULE_ENDLINE )? otherlv_8= '}' )
            // InternalBurst.g:566:3: () ( (lv_name_1_0= 'when' ) ) (this_ENDLINE_2= RULE_ENDLINE )? ( (lv_members_3_0= ruleMember ) )* otherlv_4= '{' (this_ENDLINE_5= RULE_ENDLINE )? ( (lv_linesContent_6_0= ruleLine ) )* (this_ENDLINE_7= RULE_ENDLINE )? otherlv_8= '}'
            {
            // InternalBurst.g:566:3: ()
            // InternalBurst.g:567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntersectionAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:573:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:574:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:574:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:575:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,19,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntersectionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:587:3: (this_ENDLINE_2= RULE_ENDLINE )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ENDLINE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBurst.g:588:4: this_ENDLINE_2= RULE_ENDLINE
                    {
                    this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_16); 

                    				newLeafNode(this_ENDLINE_2, grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalBurst.g:593:3: ( (lv_members_3_0= ruleMember ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBurst.g:594:4: (lv_members_3_0= ruleMember )
            	    {
            	    // InternalBurst.g:594:4: (lv_members_3_0= ruleMember )
            	    // InternalBurst.g:595:5: lv_members_3_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_3_0,
            	    						"org.xtext.burst.Burst.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBurst.g:616:3: (this_ENDLINE_5= RULE_ENDLINE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ENDLINE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBurst.g:617:4: this_ENDLINE_5= RULE_ENDLINE
                    {
                    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_17); 

                    				newLeafNode(this_ENDLINE_5, grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_5());
                    			

                    }
                    break;

            }

            // InternalBurst.g:622:3: ( (lv_linesContent_6_0= ruleLine ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBurst.g:623:4: (lv_linesContent_6_0= ruleLine )
            	    {
            	    // InternalBurst.g:623:4: (lv_linesContent_6_0= ruleLine )
            	    // InternalBurst.g:624:5: lv_linesContent_6_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_linesContent_6_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linesContent",
            	    						lv_linesContent_6_0,
            	    						"org.xtext.burst.Burst.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalBurst.g:641:3: (this_ENDLINE_7= RULE_ENDLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ENDLINE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBurst.g:642:4: this_ENDLINE_7= RULE_ENDLINE
                    {
                    this_ENDLINE_7=(Token)match(input,RULE_ENDLINE,FOLLOW_13); 

                    				newLeafNode(this_ENDLINE_7, grammarAccess.getIntersectionAccess().getENDLINETerminalRuleCall_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleIntersection"


    // $ANTLR start "entryRuleLine"
    // InternalBurst.g:655:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:655:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:656:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:662:1: ruleLine returns [EObject current=null] : ( ( (lv_first_0_0= ruleCall ) ) ( (lv_list_1_0= ruleCall ) )* this_ENDLINE_2= RULE_ENDLINE ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token this_ENDLINE_2=null;
        EObject lv_first_0_0 = null;

        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:668:2: ( ( ( (lv_first_0_0= ruleCall ) ) ( (lv_list_1_0= ruleCall ) )* this_ENDLINE_2= RULE_ENDLINE ) )
            // InternalBurst.g:669:2: ( ( (lv_first_0_0= ruleCall ) ) ( (lv_list_1_0= ruleCall ) )* this_ENDLINE_2= RULE_ENDLINE )
            {
            // InternalBurst.g:669:2: ( ( (lv_first_0_0= ruleCall ) ) ( (lv_list_1_0= ruleCall ) )* this_ENDLINE_2= RULE_ENDLINE )
            // InternalBurst.g:670:3: ( (lv_first_0_0= ruleCall ) ) ( (lv_list_1_0= ruleCall ) )* this_ENDLINE_2= RULE_ENDLINE
            {
            // InternalBurst.g:670:3: ( (lv_first_0_0= ruleCall ) )
            // InternalBurst.g:671:4: (lv_first_0_0= ruleCall )
            {
            // InternalBurst.g:671:4: (lv_first_0_0= ruleCall )
            // InternalBurst.g:672:5: lv_first_0_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getLineAccess().getFirstCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_first_0_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_0_0,
            						"org.xtext.burst.Burst.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBurst.g:689:3: ( (lv_list_1_0= ruleCall ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBurst.g:690:4: (lv_list_1_0= ruleCall )
            	    {
            	    // InternalBurst.g:690:4: (lv_list_1_0= ruleCall )
            	    // InternalBurst.g:691:5: lv_list_1_0= ruleCall
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getListCallParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_list_1_0=ruleCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"list",
            	    						lv_list_1_0,
            	    						"org.xtext.burst.Burst.Call");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            this_ENDLINE_2=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_2, grammarAccess.getLineAccess().getENDLINETerminalRuleCall_2());
            		

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
    // InternalBurst.g:716:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalBurst.g:716:45: (iv_ruleCall= ruleCall EOF )
            // InternalBurst.g:717:2: iv_ruleCall= ruleCall EOF
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
    // InternalBurst.g:723:1: ruleCall returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleMemberCall ) ) ) | ( (lv_name_2_0= ruleMemberInConcern ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:729:2: ( ( ( () ( (lv_name_1_0= ruleMemberCall ) ) ) | ( (lv_name_2_0= ruleMemberInConcern ) ) ) )
            // InternalBurst.g:730:2: ( ( () ( (lv_name_1_0= ruleMemberCall ) ) ) | ( (lv_name_2_0= ruleMemberInConcern ) ) )
            {
            // InternalBurst.g:730:2: ( ( () ( (lv_name_1_0= ruleMemberCall ) ) ) | ( (lv_name_2_0= ruleMemberInConcern ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=RULE_ENDLINE && LA22_1<=RULE_ID)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==15) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBurst.g:731:3: ( () ( (lv_name_1_0= ruleMemberCall ) ) )
                    {
                    // InternalBurst.g:731:3: ( () ( (lv_name_1_0= ruleMemberCall ) ) )
                    // InternalBurst.g:732:4: () ( (lv_name_1_0= ruleMemberCall ) )
                    {
                    // InternalBurst.g:732:4: ()
                    // InternalBurst.g:733:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCallAccess().getCallAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBurst.g:739:4: ( (lv_name_1_0= ruleMemberCall ) )
                    // InternalBurst.g:740:5: (lv_name_1_0= ruleMemberCall )
                    {
                    // InternalBurst.g:740:5: (lv_name_1_0= ruleMemberCall )
                    // InternalBurst.g:741:6: lv_name_1_0= ruleMemberCall
                    {

                    						newCompositeNode(grammarAccess.getCallAccess().getNameMemberCallParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleMemberCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.xtext.burst.Burst.MemberCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:760:3: ( (lv_name_2_0= ruleMemberInConcern ) )
                    {
                    // InternalBurst.g:760:3: ( (lv_name_2_0= ruleMemberInConcern ) )
                    // InternalBurst.g:761:4: (lv_name_2_0= ruleMemberInConcern )
                    {
                    // InternalBurst.g:761:4: (lv_name_2_0= ruleMemberInConcern )
                    // InternalBurst.g:762:5: lv_name_2_0= ruleMemberInConcern
                    {

                    					newCompositeNode(grammarAccess.getCallAccess().getNameMemberInConcernParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleMemberInConcern();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCallRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.burst.Burst.MemberInConcern");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleMemberCall"
    // InternalBurst.g:783:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalBurst.g:783:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalBurst.g:784:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalBurst.g:790:1: ruleMemberCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBurst.g:796:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBurst.g:797:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBurst.g:797:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBurst.g:798:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBurst.g:798:3: ()
            // InternalBurst.g:799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberCallAccess().getMemberCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:805:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:806:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:806:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:807:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMemberCallAccess().getNameMemberCrossReference_1_0());
            				

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


    // $ANTLR start "entryRuleMemberInConcern"
    // InternalBurst.g:822:1: entryRuleMemberInConcern returns [EObject current=null] : iv_ruleMemberInConcern= ruleMemberInConcern EOF ;
    public final EObject entryRuleMemberInConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberInConcern = null;


        try {
            // InternalBurst.g:822:56: (iv_ruleMemberInConcern= ruleMemberInConcern EOF )
            // InternalBurst.g:823:2: iv_ruleMemberInConcern= ruleMemberInConcern EOF
            {
             newCompositeNode(grammarAccess.getMemberInConcernRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberInConcern=ruleMemberInConcern();

            state._fsp--;

             current =iv_ruleMemberInConcern; 
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
    // $ANTLR end "entryRuleMemberInConcern"


    // $ANTLR start "ruleMemberInConcern"
    // InternalBurst.g:829:1: ruleMemberInConcern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMemberInConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBurst.g:835:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBurst.g:836:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBurst.g:836:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalBurst.g:837:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            // InternalBurst.g:837:3: ()
            // InternalBurst.g:838:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0(),
            					current);
            			

            }

            // InternalBurst.g:844:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:845:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:845:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:846:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberInConcernRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberInConcernAccess().getFullStopKeyword_2());
            		
            // InternalBurst.g:861:3: ( (otherlv_3= RULE_ID ) )
            // InternalBurst.g:862:4: (otherlv_3= RULE_ID )
            {
            // InternalBurst.g:862:4: (otherlv_3= RULE_ID )
            // InternalBurst.g:863:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberInConcernRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getMemberInConcernAccess().getNameMemberCrossReference_3_0());
            				

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
    // $ANTLR end "ruleMemberInConcern"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000B1012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000B5010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});

}