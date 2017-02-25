package org.xtext.burst.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBurstLexer extends Lexer {
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

    public InternalBurstLexer() {;} 
    public InternalBurstLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBurstLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBurst.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:11:7: ( ',' )
            // InternalBurst.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:12:7: ( 'and' )
            // InternalBurst.g:12:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:13:7: ( '1' )
            // InternalBurst.g:13:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:14:7: ( '0' )
            // InternalBurst.g:14:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:15:7: ( 'import' )
            // InternalBurst.g:15:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:16:7: ( 'role' )
            // InternalBurst.g:16:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:17:7: ( 'package' )
            // InternalBurst.g:17:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:18:7: ( '{' )
            // InternalBurst.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:19:7: ( '}' )
            // InternalBurst.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:20:7: ( 'concern' )
            // InternalBurst.g:20:9: 'concern'
            {
            match("concern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:21:7: ( 'template' )
            // InternalBurst.g:21:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:22:7: ( '<' )
            // InternalBurst.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:23:7: ( '>' )
            // InternalBurst.g:23:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:24:7: ( 'with' )
            // InternalBurst.g:24:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:25:7: ( 'new' )
            // InternalBurst.g:25:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:26:7: ( ':' )
            // InternalBurst.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:27:7: ( '.' )
            // InternalBurst.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:28:7: ( '(' )
            // InternalBurst.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:29:7: ( ')' )
            // InternalBurst.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:30:7: ( 'as' )
            // InternalBurst.g:30:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:31:7: ( 'is' )
            // InternalBurst.g:31:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:32:7: ( 'when' )
            // InternalBurst.g:32:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:33:7: ( '=' )
            // InternalBurst.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4889:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBurst.g:4889:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBurst.g:4889:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBurst.g:4889:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBurst.g:4889:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBurst.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4891:10: ( ( '0' .. '9' )+ )
            // InternalBurst.g:4891:12: ( '0' .. '9' )+
            {
            // InternalBurst.g:4891:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBurst.g:4891:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4893:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBurst.g:4893:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBurst.g:4893:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBurst.g:4893:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBurst.g:4893:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBurst.g:4893:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBurst.g:4893:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBurst.g:4893:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBurst.g:4893:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBurst.g:4893:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBurst.g:4893:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4895:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBurst.g:4895:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBurst.g:4895:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBurst.g:4895:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4897:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBurst.g:4897:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBurst.g:4897:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBurst.g:4897:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalBurst.g:4897:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBurst.g:4897:41: ( '\\r' )? '\\n'
                    {
                    // InternalBurst.g:4897:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBurst.g:4897:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4899:9: ( ( ' ' | '\\t' )+ )
            // InternalBurst.g:4899:11: ( ' ' | '\\t' )+
            {
            // InternalBurst.g:4899:11: ( ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBurst.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ENDLINE"
    public final void mRULE_ENDLINE() throws RecognitionException {
        try {
            int _type = RULE_ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4901:14: ( ( '\\r' )? '\\n' )
            // InternalBurst.g:4901:16: ( '\\r' )? '\\n'
            {
            // InternalBurst.g:4901:16: ( '\\r' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBurst.g:4901:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDLINE"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBurst.g:4903:16: ( . )
            // InternalBurst.g:4903:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBurst.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ENDLINE | RULE_ANY_OTHER )
        int alt13=31;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalBurst.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalBurst.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalBurst.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalBurst.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalBurst.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalBurst.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalBurst.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalBurst.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalBurst.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalBurst.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalBurst.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalBurst.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalBurst.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalBurst.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalBurst.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalBurst.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalBurst.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalBurst.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalBurst.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalBurst.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalBurst.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalBurst.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalBurst.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalBurst.g:1:148: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalBurst.g:1:156: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalBurst.g:1:165: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalBurst.g:1:177: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalBurst.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalBurst.g:1:209: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalBurst.g:1:217: RULE_ENDLINE
                {
                mRULE_ENDLINE(); 

                }
                break;
            case 31 :
                // InternalBurst.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\1\42\1\43\1\45\3\42\2\uffff\2\42\2\uffff\2\42\5\uffff\1\36\2\uffff\3\36\1\uffff\1\36\3\uffff\1\42\1\76\4\uffff\1\42\1\100\2\42\2\uffff\2\42\2\uffff\3\42\12\uffff\1\110\1\uffff\1\42\1\uffff\6\42\1\120\1\uffff\1\42\1\122\3\42\1\126\1\127\1\uffff\1\42\1\uffff\3\42\2\uffff\1\134\3\42\1\uffff\1\140\1\141\1\42\2\uffff\1\143\1\uffff";
    static final String DFA13_eofS =
        "\144\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\156\2\60\1\155\1\157\1\141\2\uffff\1\157\1\145\2\uffff\1\150\1\145\5\uffff\1\101\2\uffff\2\0\1\52\1\uffff\1\12\3\uffff\1\144\1\60\4\uffff\1\160\1\60\1\154\1\143\2\uffff\1\156\1\155\2\uffff\1\164\1\145\1\167\12\uffff\1\60\1\uffff\1\157\1\uffff\1\145\1\153\1\143\1\160\1\150\1\156\1\60\1\uffff\1\162\1\60\1\141\1\145\1\154\2\60\1\uffff\1\164\1\uffff\1\147\1\162\1\141\2\uffff\1\60\1\145\1\156\1\164\1\uffff\2\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\163\2\71\1\163\1\157\1\141\2\uffff\1\157\1\145\2\uffff\1\151\1\145\5\uffff\1\172\2\uffff\2\uffff\1\57\1\uffff\1\12\3\uffff\1\144\1\172\4\uffff\1\160\1\172\1\154\1\143\2\uffff\1\156\1\155\2\uffff\1\164\1\145\1\167\12\uffff\1\172\1\uffff\1\157\1\uffff\1\145\1\153\1\143\1\160\1\150\1\156\1\172\1\uffff\1\162\1\172\1\141\1\145\1\154\2\172\1\uffff\1\164\1\uffff\1\147\1\162\1\141\2\uffff\1\172\1\145\1\156\1\164\1\uffff\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\6\uffff\1\10\1\11\2\uffff\1\14\1\15\2\uffff\1\20\1\21\1\22\1\23\1\27\1\uffff\1\30\1\31\3\uffff\1\35\1\uffff\1\36\1\37\1\1\2\uffff\1\30\1\3\1\31\1\4\4\uffff\1\10\1\11\2\uffff\1\14\1\15\3\uffff\1\20\1\21\1\22\1\23\1\27\1\32\1\33\1\34\1\35\1\36\1\uffff\1\24\1\uffff\1\25\7\uffff\1\2\7\uffff\1\17\1\uffff\1\6\3\uffff\1\16\1\26\4\uffff\1\5\3\uffff\1\7\1\12\1\uffff\1\13";
    static final String DFA13_specialS =
        "\1\2\27\uffff\1\0\1\1\112\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\36\1\33\1\35\2\36\1\34\22\36\1\33\1\36\1\30\4\36\1\31\1\22\1\23\2\36\1\1\1\36\1\21\1\32\1\4\1\3\10\27\1\20\1\36\1\14\1\24\1\15\2\36\32\26\3\36\1\25\1\26\1\36\1\2\1\26\1\12\5\26\1\5\4\26\1\17\1\26\1\7\1\26\1\6\1\26\1\13\2\26\1\16\3\26\1\10\1\36\1\11\uff82\36",
            "",
            "\1\40\4\uffff\1\41",
            "\12\44",
            "\12\44",
            "\1\46\5\uffff\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "\1\54",
            "\1\55",
            "",
            "",
            "\1\61\1\60",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\70",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\1\77",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\121",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\142",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ENDLINE | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 56;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 56;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==',') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='1') ) {s = 3;}

                        else if ( (LA13_0=='0') ) {s = 4;}

                        else if ( (LA13_0=='i') ) {s = 5;}

                        else if ( (LA13_0=='r') ) {s = 6;}

                        else if ( (LA13_0=='p') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='c') ) {s = 10;}

                        else if ( (LA13_0=='t') ) {s = 11;}

                        else if ( (LA13_0=='<') ) {s = 12;}

                        else if ( (LA13_0=='>') ) {s = 13;}

                        else if ( (LA13_0=='w') ) {s = 14;}

                        else if ( (LA13_0=='n') ) {s = 15;}

                        else if ( (LA13_0==':') ) {s = 16;}

                        else if ( (LA13_0=='.') ) {s = 17;}

                        else if ( (LA13_0=='(') ) {s = 18;}

                        else if ( (LA13_0==')') ) {s = 19;}

                        else if ( (LA13_0=='=') ) {s = 20;}

                        else if ( (LA13_0=='^') ) {s = 21;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='d' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||LA13_0=='s'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 22;}

                        else if ( ((LA13_0>='2' && LA13_0<='9')) ) {s = 23;}

                        else if ( (LA13_0=='\"') ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 27;}

                        else if ( (LA13_0=='\r') ) {s = 28;}

                        else if ( (LA13_0=='\n') ) {s = 29;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}