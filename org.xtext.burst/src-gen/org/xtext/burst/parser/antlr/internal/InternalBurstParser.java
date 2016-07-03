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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'concern'", "'extends'", "'when'", "';'"
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

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||LA1_0==18) ) {
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
            case 18:
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

                if ( (LA3_0==11||(LA3_0>=15 && LA3_0<=16)||LA3_0==18) ) {
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
    // InternalBurst.g:312:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_members_6_0 = null;

        EObject lv_intersections_7_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:318:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )? ) )
            // InternalBurst.g:319:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )? )
            {
            // InternalBurst.g:319:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )? )
            // InternalBurst.g:320:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )?
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

            // InternalBurst.g:371:3: (otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBurst.g:372:4: otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalBurst.g:376:4: ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0==18) ) {
                            alt6=2;
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

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_4_2());
                    			

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


    // $ANTLR start "entryRuleMember"
    // InternalBurst.g:426:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:426:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:427:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:433:1: ruleMember returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:439:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:440:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:440:2: ( () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:441:3: () ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:441:3: ()
            // InternalBurst.g:442:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            // InternalBurst.g:448:3: ( ( ruleQualifiedName ) )
            // InternalBurst.g:449:4: ( ruleQualifiedName )
            {
            // InternalBurst.g:449:4: ( ruleQualifiedName )
            // InternalBurst.g:450:5: ruleQualifiedName
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

            // InternalBurst.g:464:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:465:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:465:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:466:5: lv_name_2_0= RULE_ID
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
    // InternalBurst.g:486:1: entryRuleIntersection returns [EObject current=null] : iv_ruleIntersection= ruleIntersection EOF ;
    public final EObject entryRuleIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersection = null;


        try {
            // InternalBurst.g:486:53: (iv_ruleIntersection= ruleIntersection EOF )
            // InternalBurst.g:487:2: iv_ruleIntersection= ruleIntersection EOF
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
    // InternalBurst.g:493:1: ruleIntersection returns [EObject current=null] : ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) ;
    public final EObject ruleIntersection() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_linesContent_4_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:499:2: ( ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) )
            // InternalBurst.g:500:2: ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            {
            // InternalBurst.g:500:2: ( () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            // InternalBurst.g:501:3: () ( (lv_name_1_0= 'when' ) ) ( (lv_members_2_0= ruleMember ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}'
            {
            // InternalBurst.g:501:3: ()
            // InternalBurst.g:502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntersectionAccess().getIntersectionAction_0(),
            					current);
            			

            }

            // InternalBurst.g:508:3: ( (lv_name_1_0= 'when' ) )
            // InternalBurst.g:509:4: (lv_name_1_0= 'when' )
            {
            // InternalBurst.g:509:4: (lv_name_1_0= 'when' )
            // InternalBurst.g:510:5: lv_name_1_0= 'when'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntersectionAccess().getNameWhenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntersectionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "when");
            				

            }


            }

            // InternalBurst.g:522:3: ( (lv_members_2_0= ruleMember ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:523:4: (lv_members_2_0= ruleMember )
            	    {
            	    // InternalBurst.g:523:4: (lv_members_2_0= ruleMember )
            	    // InternalBurst.g:524:5: lv_members_2_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getMembersMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBurst.g:545:3: ( (lv_linesContent_4_0= ruleLine ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBurst.g:546:4: (lv_linesContent_4_0= ruleLine )
            	    {
            	    // InternalBurst.g:546:4: (lv_linesContent_4_0= ruleLine )
            	    // InternalBurst.g:547:5: lv_linesContent_4_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop9;
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
    // InternalBurst.g:572:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:572:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:573:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:579:1: ruleLine returns [EObject current=null] : ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_called_0_0 = null;

        EObject lv_called2_1_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:585:2: ( ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) ) )
            // InternalBurst.g:586:2: ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) )
            {
            // InternalBurst.g:586:2: ( ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) ) )
            // InternalBurst.g:587:3: ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )* ( (lv_name_2_0= ';' ) )
            {
            // InternalBurst.g:587:3: ( ( (lv_called_0_0= ruleMemberCall ) ) | ( (lv_called2_1_0= ruleMemberInConcern ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID||LA10_2==19) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==14) ) {
                        alt10=2;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalBurst.g:588:4: ( (lv_called_0_0= ruleMemberCall ) )
            	    {
            	    // InternalBurst.g:588:4: ( (lv_called_0_0= ruleMemberCall ) )
            	    // InternalBurst.g:589:5: (lv_called_0_0= ruleMemberCall )
            	    {
            	    // InternalBurst.g:589:5: (lv_called_0_0= ruleMemberCall )
            	    // InternalBurst.g:590:6: lv_called_0_0= ruleMemberCall
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
            	    // InternalBurst.g:608:4: ( (lv_called2_1_0= ruleMemberInConcern ) )
            	    {
            	    // InternalBurst.g:608:4: ( (lv_called2_1_0= ruleMemberInConcern ) )
            	    // InternalBurst.g:609:5: (lv_called2_1_0= ruleMemberInConcern )
            	    {
            	    // InternalBurst.g:609:5: (lv_called2_1_0= ruleMemberInConcern )
            	    // InternalBurst.g:610:6: lv_called2_1_0= ruleMemberInConcern
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
            	    break loop10;
                }
            } while (true);

            // InternalBurst.g:628:3: ( (lv_name_2_0= ';' ) )
            // InternalBurst.g:629:4: (lv_name_2_0= ';' )
            {
            // InternalBurst.g:629:4: (lv_name_2_0= ';' )
            // InternalBurst.g:630:5: lv_name_2_0= ';'
            {
            lv_name_2_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalBurst.g:646:1: entryRuleMemberCall returns [EObject current=null] : iv_ruleMemberCall= ruleMemberCall EOF ;
    public final EObject entryRuleMemberCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberCall = null;


        try {
            // InternalBurst.g:646:51: (iv_ruleMemberCall= ruleMemberCall EOF )
            // InternalBurst.g:647:2: iv_ruleMemberCall= ruleMemberCall EOF
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
    // InternalBurst.g:653:1: ruleMemberCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMemberCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBurst.g:659:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBurst.g:660:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBurst.g:660:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalBurst.g:661:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalBurst.g:661:3: ()
            // InternalBurst.g:662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberCallAccess().getMemberCallAction_0(),
            					current);
            			

            }

            // InternalBurst.g:668:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:669:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:669:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:670:5: otherlv_1= RULE_ID
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
    // InternalBurst.g:685:1: entryRuleMemberInConcern returns [EObject current=null] : iv_ruleMemberInConcern= ruleMemberInConcern EOF ;
    public final EObject entryRuleMemberInConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberInConcern = null;


        try {
            // InternalBurst.g:685:56: (iv_ruleMemberInConcern= ruleMemberInConcern EOF )
            // InternalBurst.g:686:2: iv_ruleMemberInConcern= ruleMemberInConcern EOF
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
    // InternalBurst.g:692:1: ruleMemberInConcern returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMemberInConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalBurst.g:698:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalBurst.g:699:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalBurst.g:699:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalBurst.g:700:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalBurst.g:700:3: ()
            // InternalBurst.g:701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberInConcernAccess().getMemberInConcernAction_0(),
            					current);
            			

            }

            // InternalBurst.g:707:3: ( (otherlv_1= RULE_ID ) )
            // InternalBurst.g:708:4: (otherlv_1= RULE_ID )
            {
            // InternalBurst.g:708:4: (otherlv_1= RULE_ID )
            // InternalBurst.g:709:5: otherlv_1= RULE_ID
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
            		
            // InternalBurst.g:724:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBurst.g:725:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBurst.g:725:4: (lv_name_3_0= RULE_ID )
            // InternalBurst.g:726:5: lv_name_3_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000005A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});

}