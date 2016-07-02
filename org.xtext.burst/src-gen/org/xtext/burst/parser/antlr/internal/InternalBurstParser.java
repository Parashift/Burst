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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LINE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'concern'", "'extends'", "'{'", "'}'", "'int'", "'when'", "'call'", "'none'"
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
    // InternalBurst.g:71:1: ruleFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_concerns_1_0 = null;

        EObject lv_externIntersections_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )* ) )
            // InternalBurst.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )* )
            {
            // InternalBurst.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )* )
            // InternalBurst.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )*
            {
            // InternalBurst.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBurst.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalBurst.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalBurst.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.xtext.burst.Burst.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBurst.g:98:3: ( ( (lv_concerns_1_0= ruleConcern ) ) | ( (lv_externIntersections_2_0= ruleIntersection ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }
                else if ( (LA2_0==18) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBurst.g:99:4: ( (lv_concerns_1_0= ruleConcern ) )
            	    {
            	    // InternalBurst.g:99:4: ( (lv_concerns_1_0= ruleConcern ) )
            	    // InternalBurst.g:100:5: (lv_concerns_1_0= ruleConcern )
            	    {
            	    // InternalBurst.g:100:5: (lv_concerns_1_0= ruleConcern )
            	    // InternalBurst.g:101:6: lv_concerns_1_0= ruleConcern
            	    {

            	    						newCompositeNode(grammarAccess.getFileAccess().getConcernsConcernParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_concerns_1_0=ruleConcern();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"concerns",
            	    							lv_concerns_1_0,
            	    							"org.xtext.burst.Burst.Concern");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBurst.g:119:4: ( (lv_externIntersections_2_0= ruleIntersection ) )
            	    {
            	    // InternalBurst.g:119:4: ( (lv_externIntersections_2_0= ruleIntersection ) )
            	    // InternalBurst.g:120:5: (lv_externIntersections_2_0= ruleIntersection )
            	    {
            	    // InternalBurst.g:120:5: (lv_externIntersections_2_0= ruleIntersection )
            	    // InternalBurst.g:121:6: lv_externIntersections_2_0= ruleIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getFileAccess().getExternIntersectionsIntersectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_externIntersections_2_0=ruleIntersection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFileRule());
            	    						}
            	    						add(
            	    							current,
            	    							"externIntersections",
            	    							lv_externIntersections_2_0,
            	    							"org.xtext.burst.Burst.Intersection");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleImport"
    // InternalBurst.g:143:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBurst.g:143:47: (iv_ruleImport= ruleImport EOF )
            // InternalBurst.g:144:2: iv_ruleImport= ruleImport EOF
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
    // InternalBurst.g:150:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:156:2: ( ( () otherlv_1= 'import' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:157:2: ( () otherlv_1= 'import' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:157:2: ( () otherlv_1= 'import' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:158:3: () otherlv_1= 'import' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:158:3: ()
            // InternalBurst.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
            		
            // InternalBurst.g:169:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:170:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:170:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:171:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleConcern"
    // InternalBurst.g:191:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalBurst.g:191:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalBurst.g:192:2: iv_ruleConcern= ruleConcern EOF
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
    // InternalBurst.g:198:1: ruleConcern returns [EObject current=null] : ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_members_6_0 = null;

        EObject lv_intersections_7_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:204:2: ( ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' ) )
            // InternalBurst.g:205:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )
            {
            // InternalBurst.g:205:2: ( () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}' )
            // InternalBurst.g:206:3: () otherlv_1= 'concern' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )* otherlv_8= '}'
            {
            // InternalBurst.g:206:3: ()
            // InternalBurst.g:207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcernAccess().getConcernAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConcernAccess().getConcernKeyword_1());
            		
            // InternalBurst.g:217:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:218:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:218:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:219:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalBurst.g:235:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBurst.g:236:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getConcernAccess().getExtendsKeyword_3_0());
                    			
                    // InternalBurst.g:240:4: ( (otherlv_4= RULE_ID ) )
                    // InternalBurst.g:241:5: (otherlv_4= RULE_ID )
                    {
                    // InternalBurst.g:241:5: (otherlv_4= RULE_ID )
                    // InternalBurst.g:242:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcernRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getConcernAccess().getSupertypeConcernCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBurst.g:258:3: ( ( (lv_members_6_0= ruleMember ) ) | ( (lv_intersections_7_0= ruleIntersection ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }
                else if ( (LA4_0==18) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBurst.g:259:4: ( (lv_members_6_0= ruleMember ) )
            	    {
            	    // InternalBurst.g:259:4: ( (lv_members_6_0= ruleMember ) )
            	    // InternalBurst.g:260:5: (lv_members_6_0= ruleMember )
            	    {
            	    // InternalBurst.g:260:5: (lv_members_6_0= ruleMember )
            	    // InternalBurst.g:261:6: lv_members_6_0= ruleMember
            	    {

            	    						newCompositeNode(grammarAccess.getConcernAccess().getMembersMemberParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    // InternalBurst.g:279:4: ( (lv_intersections_7_0= ruleIntersection ) )
            	    {
            	    // InternalBurst.g:279:4: ( (lv_intersections_7_0= ruleIntersection ) )
            	    // InternalBurst.g:280:5: (lv_intersections_7_0= ruleIntersection )
            	    {
            	    // InternalBurst.g:280:5: (lv_intersections_7_0= ruleIntersection )
            	    // InternalBurst.g:281:6: lv_intersections_7_0= ruleIntersection
            	    {

            	    						newCompositeNode(grammarAccess.getConcernAccess().getIntersectionsIntersectionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalBurst.g:307:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalBurst.g:307:47: (iv_ruleMember= ruleMember EOF )
            // InternalBurst.g:308:2: iv_ruleMember= ruleMember EOF
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
    // InternalBurst.g:314:1: ruleMember returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalBurst.g:320:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBurst.g:321:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBurst.g:321:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBurst.g:322:3: () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBurst.g:322:3: ()
            // InternalBurst.g:323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemberAccess().getMemberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getIntKeyword_1());
            		
            // InternalBurst.g:333:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBurst.g:334:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBurst.g:334:4: (lv_name_2_0= RULE_ID )
            // InternalBurst.g:335:5: lv_name_2_0= RULE_ID
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
    // InternalBurst.g:355:1: entryRuleIntersection returns [EObject current=null] : iv_ruleIntersection= ruleIntersection EOF ;
    public final EObject entryRuleIntersection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersection = null;


        try {
            // InternalBurst.g:355:53: (iv_ruleIntersection= ruleIntersection EOF )
            // InternalBurst.g:356:2: iv_ruleIntersection= ruleIntersection EOF
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
    // InternalBurst.g:362:1: ruleIntersection returns [EObject current=null] : ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) ;
    public final EObject ruleIntersection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_linesContent_4_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:368:2: ( ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' ) )
            // InternalBurst.g:369:2: ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            {
            // InternalBurst.g:369:2: ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}' )
            // InternalBurst.g:370:3: () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )* otherlv_3= '{' ( (lv_linesContent_4_0= ruleLine ) )* otherlv_5= '}'
            {
            // InternalBurst.g:370:3: ()
            // InternalBurst.g:371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntersectionAccess().getIntersectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIntersectionAccess().getWhenKeyword_1());
            		
            // InternalBurst.g:381:3: ( (otherlv_2= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBurst.g:382:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalBurst.g:382:4: (otherlv_2= RULE_ID )
            	    // InternalBurst.g:383:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIntersectionRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_2, grammarAccess.getIntersectionAccess().getQualifiersConcernCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIntersectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBurst.g:398:3: ( (lv_linesContent_4_0= ruleLine ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBurst.g:399:4: (lv_linesContent_4_0= ruleLine )
            	    {
            	    // InternalBurst.g:399:4: (lv_linesContent_4_0= ruleLine )
            	    // InternalBurst.g:400:5: lv_linesContent_4_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getIntersectionAccess().getLinesContentLineParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalBurst.g:425:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalBurst.g:425:45: (iv_ruleLine= ruleLine EOF )
            // InternalBurst.g:426:2: iv_ruleLine= ruleLine EOF
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
    // InternalBurst.g:432:1: ruleLine returns [EObject current=null] : ( () otherlv_1= 'call' ( (lv_called_2_0= ruleQualifier ) )* ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_called_2_0 = null;



        	enterRule();

        try {
            // InternalBurst.g:438:2: ( ( () otherlv_1= 'call' ( (lv_called_2_0= ruleQualifier ) )* ) )
            // InternalBurst.g:439:2: ( () otherlv_1= 'call' ( (lv_called_2_0= ruleQualifier ) )* )
            {
            // InternalBurst.g:439:2: ( () otherlv_1= 'call' ( (lv_called_2_0= ruleQualifier ) )* )
            // InternalBurst.g:440:3: () otherlv_1= 'call' ( (lv_called_2_0= ruleQualifier ) )*
            {
            // InternalBurst.g:440:3: ()
            // InternalBurst.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getCallKeyword_1());
            		
            // InternalBurst.g:451:3: ( (lv_called_2_0= ruleQualifier ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:452:4: (lv_called_2_0= ruleQualifier )
            	    {
            	    // InternalBurst.g:452:4: (lv_called_2_0= ruleQualifier )
            	    // InternalBurst.g:453:5: lv_called_2_0= ruleQualifier
            	    {

            	    					newCompositeNode(grammarAccess.getLineAccess().getCalledQualifierParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_called_2_0=ruleQualifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"called",
            	    						lv_called_2_0,
            	    						"org.xtext.burst.Burst.Qualifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "entryRuleQualifier"
    // InternalBurst.g:474:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalBurst.g:474:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalBurst.g:475:2: iv_ruleQualifier= ruleQualifier EOF
            {
             newCompositeNode(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;

             current =iv_ruleQualifier; 
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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalBurst.g:481:1: ruleQualifier returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | otherlv_2= 'none' ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBurst.g:487:2: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | otherlv_2= 'none' ) )
            // InternalBurst.g:488:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | otherlv_2= 'none' )
            {
            // InternalBurst.g:488:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | otherlv_2= 'none' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBurst.g:489:3: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalBurst.g:489:3: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalBurst.g:490:4: () ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalBurst.g:490:4: ()
                    // InternalBurst.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getQualifierAccess().getQualifierAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBurst.g:497:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalBurst.g:498:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalBurst.g:498:5: (lv_name_1_0= RULE_ID )
                    // InternalBurst.g:499:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getQualifierAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQualifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBurst.g:517:3: otherlv_2= 'none'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getQualifierAccess().getNoneKeyword_1());
                    		

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
    // $ANTLR end "ruleQualifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000043002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100012L});

}