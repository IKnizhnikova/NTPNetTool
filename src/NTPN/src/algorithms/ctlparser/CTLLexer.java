// Generated from CTL.g4 by ANTLR 4.2.1

  package algorithms.ctlparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CTLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, WS=15, AP=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'E'", "')'", "'=>'", "'('", "'X'", "'A'", "'G'", "'F'", "'U'", 
		"'1'", "'|'", "'0'", "'!'", "WS", "AP"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "WS", "AP"
	};


	public CTLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CTL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20B\n\20\r\20\16\20C"+
		"\3\20\3\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\4\5\2\13\f\17\17\"\"\4\2C\\c|"+
		"I\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2"+
		"\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3"+
		"\2\2\2\21\62\3\2\2\2\23\64\3\2\2\2\25\66\3\2\2\2\278\3\2\2\2\31:\3\2\2"+
		"\2\33<\3\2\2\2\35>\3\2\2\2\37A\3\2\2\2!G\3\2\2\2#$\7(\2\2$\4\3\2\2\2%"+
		"&\7G\2\2&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7?\2\2*+\7@\2\2+\n\3\2\2\2"+
		",-\7*\2\2-\f\3\2\2\2./\7Z\2\2/\16\3\2\2\2\60\61\7C\2\2\61\20\3\2\2\2\62"+
		"\63\7I\2\2\63\22\3\2\2\2\64\65\7H\2\2\65\24\3\2\2\2\66\67\7W\2\2\67\26"+
		"\3\2\2\289\7\63\2\29\30\3\2\2\2:;\7~\2\2;\32\3\2\2\2<=\7\62\2\2=\34\3"+
		"\2\2\2>?\7#\2\2?\36\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD"+
		"\3\2\2\2DE\3\2\2\2EF\b\20\2\2F \3\2\2\2GH\t\3\2\2H\"\3\2\2\2\4\2C\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}