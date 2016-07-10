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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'dispose'", "'new'", "'when'", "';'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||LA1_0==20) ) {
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
    // InternalBurst.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_Concern_1 = null;

        EObject this_Intersection_2 = null;

        EObject this_Package_3 = null;



        	enterRule();

        try {
            // InternalBurst.g:113:2: ( (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage ) )
            // InternalBurst.g:114:2: (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage )
            {
            // InternalBurst.g:114:2: (this_Import_0= ruleImport | this_Concern_1= ruleConcern | this_Intersection_2= ruleIntersection | this_Package_3= rulePackage )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
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
    // InternalBurst.g:154:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalBurst.g:154:48: (iv_rulePackage= rulePackage EOF )
            // InternalBurst.g:155:2: iv_rulePackage= rulePackage EOF
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
    // InternalBurst.g:161:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:167:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalBurst.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalBurst.g:168:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalBurst.g:169:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalBurst.g:173:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalBurst.g:174:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalBurst.g:174:4: (lv_name_1_0= ruleQualifiedName )
            // InternalBurst.g:175:5: lv_name_1_0= ruleQualifiedName
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBurst.g:196:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=15 && LA3_0<=16)||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:197:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalBurst.g:197:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalBurst.g:198:5: lv_elements_3_0= ruleAbstractElement
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

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBurst.g:223:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBurst.g:223:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBurst.g:224:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalBurst.g:230:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBurst.g:236:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBurst.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBurst.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBurst.g:238:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBurst.g:245:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:246:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

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
    // InternalBurst.g:263:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBurst.g:263:47: (iv_ruleImport= ruleImport EOF )
            // InternalBurst.g:264:2: iv_ruleImport= ruleImport EOF
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
    // InternalBurst.g:270:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:276:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // InternalBurst.g:277:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // InternalBurst.g:277:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // InternalBurst.g:278:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBurst.g:282:3: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // InternalBurst.g:283:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // InternalBurst.g:283:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            // InternalBurst.g:284:5: lv_importedNamespace_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalBurst.g:305:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalBurst.g:305:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalBurst.g:306:2: iv_ruleConcern= ruleConcern EOF
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
    // InternalBurst.g:312:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_members_6_0 = null;

        EObject lv_intersections_7_0 = null;

        EObject lv_build_8_0 = null;

        EObject lv_destruct_9_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:318:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )? ) )
            // InternalBurst.g:319:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )? )
            {
            // InternalBurst.g:319:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )? )
            // InternalBurst.g:320:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )?
            {
            // InternalBurst.g:320:3: ()
            // InternalBurst.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:331:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:332:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:332:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:333:5: lv_name_2_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBurst.g:349:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBurst.g:350:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConcernAccess().getExtendsKeyword_3_0());
                    			
                    // InternalBurst.g:354:4: ( ( ruleQualifiedName ) )
                    // InternalBurst.g:355:5: ( ruleQualifiedName )
                    {
                    // InternalBurst.g:355:5: ( ruleQualifiedName )
                    // InternalBurst.g:356:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcernRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBurst.g:371:3: (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:372:4: otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBurst.g:376:4: ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) | ( (lv_build_8_0= ruleBuild ) ) | ( (lv_destruct_9_0= ruleDestruct ) ) )*
                    loop6:
                    do {
                        int alt6=5;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            alt6=1;
                            }
                            break;
                        case 20:
                            {
                            alt6=2;
                            }
                            break;
                        case 19:
                            {
                            alt6=3;
                            }
                            break;
                        case 18:
                            {
                            alt6=4;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // InternalBurst.g:377:5: ( (lv_members_6_0= ruleMember ) )
                    	    {
                    	    // InternalBurst.g:377:5: ( (lv_members_6_0= ruleMember ) )
                    	    // InternalBurst.g:378:6: (lv_members_6_0= ruleMember )
                    	    {
                    	    // InternalBurst.g:378:6: (lv_members_6_0= ruleMember )
                    	    // InternalBurst.g:379:7: lv_members_6_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_4_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_members_6_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_6_0,
                    	    								"org.xtext.burst.Burst.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBurst.g:397:5: ( (lv_intersections_7_0= ruleIntersection ) )
                    	    {
                    	    // InternalBurst.g:397:5: ( (lv_intersections_7_0= ruleIntersection ) )
                    	    // InternalBurst.g:398:6: (lv_intersections_7_0= ruleIntersection )
                    	    {
                    	    // InternalBurst.g:398:6: (lv_intersections_7_0= ruleIntersection )
                    	    // InternalBurst.g:399:7: lv_intersections_7_0= ruleIntersection
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_intersections_7_0=ruleIntersection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intersections",
                    	    								lv_intersections_7_0,
                    	    								"org.xtext.burst.Burst.Intersection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalBurst.g:417:5: ( (lv_build_8_0= ruleBuild ) )
                    	    {
                    	    // InternalBurst.g:417:5: ( (lv_build_8_0= ruleBuild ) )
                    	    // InternalBurst.g:418:6: (lv_build_8_0= ruleBuild )
                    	    {
                    	    // InternalBurst.g:418:6: (lv_build_8_0= ruleBuild )
                    	    // InternalBurst.g:419:7: lv_build_8_0= ruleBuild
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getBuildBuildParserRuleCall_4_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_build_8_0=ruleBuild();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"build",
                    	    								lv_build_8_0,
                    	    								"org.xtext.burst.Burst.Build");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalBurst.g:437:5: ( (lv_destruct_9_0= ruleDestruct ) )
                    	    {
                    	    // InternalBurst.g:437:5: ( (lv_destruct_9_0= ruleDestruct ) )
                    	    // InternalBurst.g:438:6: (lv_destruct_9_0= ruleDestruct )
                    	    {
                    	    // InternalBurst.g:438:6: (lv_destruct_9_0= ruleDestruct )
                    	    // InternalBurst.g:439:7: lv_destruct_9_0= ruleDestruct
                    	    {

                    	    							newCompositeNode(grammarAccess.getConcernAccess().getDestructDestructParserRuleCall_4_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_destruct_9_0=ruleDestruct();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConcernRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"destruct",
                    	    								lv_destruct_9_0,
                    	    								"org.xtext.burst.Burst.Destruct");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_4_2());
                    			

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


    // $ANTLR start "entryRuleDestruct"
    // InternalBurst.g:466:1: entryRuleDestruct returns [EObject current=null] : iv_ruleDestruct= ruleDestruct EOF ;
    public final EObject entryRuleDestruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestruct = null;


        try {
            // InternalBurst.g:466:49: (iv_ruleDestruct= ruleDestruct EOF )
            // InternalBurst.g:467:2: iv_ruleDestruct= ruleDestruct EOF
            {
             newCompositeNode(grammarAccess.getDestructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestruct=ruleDestruct();

            state._fsp--;

             current =iv_ruleDestruct; 
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
    // $ANTLR end "entryRuleDestruct"


    // $ANTLR start "ruleDestruct"
    // InternalBurst.g:473:1: ruleDestruct returns [EObject current=null] : ( () ( (lv_name_1_0= 'dispose' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' ) ;
    public final EObject ruleDestruct() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linesContent_3_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:479:2: ( ( () ( (lv_name_1_0= 'dispose' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' ) )
            // InternalBurst.g:480:2: ( () ( (lv_name_1_0= 'dispose' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' )
            {
            // InternalBurst.g:480:2: ( () ( (lv_name_1_0= 'dispose' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' )
            // InternalBurst.g:481:3: () ( (lv_name_1_0= 'dispose' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}'
            {
            // InternalBurst.g:481:3: ()
            // InternalBurst.g:482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDestructAccess().getDestructAction_0(),
            					current);
            			

            }

            // InternalBurst.g:488:3: ( (lv_name_1_0= 'dispose' ) )
            // InternalBurst.g:489:4: (lv_name_1_0= 'dispose' )
            {
            // InternalBurst.g:489:4: (lv_name_1_0= 'dispose' )
            // InternalBurst.g:490:5: lv_name_1_0= 'dispose'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDestructAccess().getNameDisposeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDestructRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "dispose");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDestructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBurst.g:506:3: ( (lv_linesContent_3_0= ruleLine ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:507:4: (lv_linesContent_3_0= ruleLine )
            	    {
            	    // InternalBurst.g:507:4: (lv_linesContent_3_0= ruleLine )
            	    // InternalBurst.g:508:5: lv_linesContent_3_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getDestructAccess().getLinesContentLineParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_linesContent_3_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDestructRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linesContent",
            	    						lv_linesContent_3_0,
            	    						"org.xtext.burst.Burst.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDestructAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDestruct"


    // $ANTLR start "entryRuleBuild"
    // InternalBurst.g:533:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalBurst.g:533:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalBurst.g:534:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalBurst.g:540:1: ruleBuild returns [EObject current=null] : ( () ( (lv_name_1_0= 'new' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linesContent_3_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:546:2: ( ( () ( (lv_name_1_0= 'new' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' ) )
            // InternalBurst.g:547:2: ( () ( (lv_name_1_0= 'new' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' )
            {
            // InternalBurst.g:547:2: ( () ( (lv_name_1_0= 'new' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}' )
            // InternalBurst.g:548:3: () ( (lv_name_1_0= 'new' ) ) otherlv_2= '{' ( (lv_linesContent_3_0= ruleLine ) )* otherlv_4= '}'
            {
            // InternalBurst.g:548:3: ()
            // InternalBurst.g:549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildAccess().getBuildAction_0(),
            					current);
            			

            }

            // InternalBurst.g:555:3: ( (lv_name_1_0= 'new' ) )
            // InternalBurst.g:556:4: (lv_name_1_0= 'new' )
            {
            // InternalBurst.g:556:4: (lv_name_1_0= 'new' )
            // InternalBurst.g:557:5: lv_name_1_0= 'new'
            {
            lv_name_1_0=(Token)match(input,19,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBuildAccess().getNameNewKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "new");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBurst.g:573:3: ( (lv_linesContent_3_0= ruleLine ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:574:4: (lv_linesContent_3_0= ruleLine )
            	    {
            	    // InternalBurst.g:574:4: (lv_linesContent_3_0= ruleLine )
            	    // InternalBurst.g:575:5: lv_linesContent_3_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getBuildAccess().getLinesContentLineParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_linesContent_3_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBuildRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linesContent",
            	    						lv_linesContent_3_0,
            	    						"org.xtext.burst.Burst.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBuildAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:600:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:600:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:601:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:607:1: ruleMember returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:613:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:614:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:614:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:615:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:615:3: ()
            // InternalBurst.g:616:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:622:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:623:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:623:4: ( ruleQualifiedName )
            // InternalBurst.g:624:5: ruleQualifiedName
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

            // InternalBurst.g:638:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:639:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:639:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:640:5: lv_name_2_0= RULE_ID
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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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


    // $ANTLR start "entryRuleIntersection"
    // InternalBurst.g:660:1: entryRuleIntersection returns [EObject current=null] : iv_ruleIntersection= ruleIntersection EOF ;
    public final EObject entryRuleIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersection = null;


        try {
            // InternalBurst.g:660:53: (iv_ruleIntersection= ruleIntersection EOF )
            // InternalBurst.g:661:2: iv_ruleIntersection= ruleIntersection EOF
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
    // InternalBurst.g:667:1: ruleIntersection returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) ;
    public final EObject ruleIntersection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_linesContent_4_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:673:2: ( ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) )
            // InternalBurst.g:674:2: ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            {
            // InternalBurst.g:674:2: ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            // InternalBurst.g:675:3: () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}'
            {
            // InternalBurst.g:675:3: ()
            // InternalBurst.g:676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntersectionAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:682:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:683:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:683:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:684:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,20,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntersectionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:696:3: ( (lv_members_2_0= ruleMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:697:4: (lv_members_2_0= ruleMember )
            	    {
            	    // InternalBurst.g:697:4: (lv_members_2_0= ruleMember )
            	    // InternalBurst.g:698:5: lv_members_2_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_members_2_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_2_0,
            	    						"org.xtext.burst.Burst.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBurst.g:719:3: ( (lv_linesContent_4_0= ruleLine ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:720:4: (lv_linesContent_4_0= ruleLine )
            	    {
            	    // InternalBurst.g:720:4: (lv_linesContent_4_0= ruleLine )
            	    // InternalBurst.g:721:5: lv_linesContent_4_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_linesContent_4_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntersectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"linesContent",
            	    						lv_linesContent_4_0,
            	    						"org.xtext.burst.Burst.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntersectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalBurst.g:746:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:746:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:747:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:753:1: ruleLine returns [EObject current=null] : ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_called_0_0 = null;

        EObject lv_called2_1_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:759:2: ( ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) ) )
            // InternalBurst.g:760:2: ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) )
            {
            // InternalBurst.g:760:2: ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) )
            // InternalBurst.g:761:3: ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) )
            {
            // InternalBurst.g:761:3: ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID||LA12_2==21) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==14) ) {
                        alt12=2;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalBurst.g:762:4: ( (lv_called_0_0= ruleMemberCall ) )
            	    {
            	    // InternalBurst.g:762:4: ( (lv_called_0_0= ruleMemberCall ) )
            	    // InternalBurst.g:763:5: (lv_called_0_0= ruleMemberCall )
            	    {
            	    // InternalBurst.g:763:5: (lv_called_0_0= ruleMemberCall )
            	    // InternalBurst.g:764:6: lv_called_0_0= ruleMemberCall
            	    {

            	    						newCompositeNode(grammarAccess.getLineAccess().getCalledMemberCallParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_called_0_0=ruleMemberCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"called",
            	    							lv_called_0_0,
            	    							"org.xtext.burst.Burst.MemberCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBurst.g:782:4: ( (lv_called2_1_0= ruleMemberInConcern ) )
            	    {
            	    // InternalBurst.g:782:4: ( (lv_called2_1_0= ruleMemberInConcern ) )
            	    // InternalBurst.g:783:5: (lv_called2_1_0= ruleMemberInConcern )
            	    {
            	    // InternalBurst.g:783:5: (lv_called2_1_0= ruleMemberInConcern )
            	    // InternalBurst.g:784:6: lv_called2_1_0= ruleMemberInConcern
            	    {

            	    						newCompositeNode(grammarAccess.getLineAccess().getCalled2MemberInConcernParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_called2_1_0=ruleMemberInConcern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"called2",
            	    							lv_called2_1_0,
            	    							"org.xtext.burst.Burst.MemberInConcern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalBurst.g:802:3: ( (lv_name_2_0= ';' ) )
            // InternalBurst.g:803:4: (lv_name_2_0= ';' )
            {
            // InternalBurst.g:803:4: (lv_name_2_0= ';' )
            // InternalBurst.g:804:5: lv_name_2_0= ';'
            {
            lv_name_2_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLineAccess().getNameSemicolonKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_2_0, ";");
            				

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleMemberCall"
    // InternalBurst.g:820:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalBurst.g:820:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalBurst.g:821:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalBurst.g:827:1: ruleMemberCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBurst.g:833:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBurst.g:834:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBurst.g:834:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBurst.g:835:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBurst.g:835:3: ()
            // InternalBurst.g:836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberCallAccess().getMemberCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:842:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:843:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:843:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:844:5: otherlv_1= RULE_ID
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
    // InternalBurst.g:859:1: entryRuleMemberInConcern returns [EObject current=null] : iv_ruleMemberInConcern= ruleMemberInConcern EOF ;
    public final EObject entryRuleMemberInConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberInConcern = null;


        try {
            // InternalBurst.g:859:56: (iv_ruleMemberInConcern= ruleMemberInConcern EOF )
            // InternalBurst.g:860:2: iv_ruleMemberInConcern= ruleMemberInConcern EOF
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
    // InternalBurst.g:866:1: ruleMemberInConcern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberInConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalBurst.g:872:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalBurst.g:873:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalBurst.g:873:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalBurst.g:874:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalBurst.g:874:3: ()
            // InternalBurst.g:875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0(),
            					current);
            			

            }

            // InternalBurst.g:881:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:882:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:882:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:883:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberInConcernRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getMemberInConcernAccess().getTargetConcernCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberInConcernAccess().getFullStopKeyword_2());
            		
            // InternalBurst.g:898:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:899:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:899:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:900:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMemberInConcernAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberInConcernRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000118802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000011A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C2010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});

}