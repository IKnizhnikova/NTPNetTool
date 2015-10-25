// Generated from CTL.g4 by ANTLR 4.2.1

  package algorithms.ctlparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CTLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, WS=15, AP=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'&'", "'E'", "')'", "'=>'", "'('", "'X'", "'A'", "'G'", 
		"'F'", "'U'", "'1'", "'|'", "'0'", "'!'", "WS", "AP"
	};
	public static final int
		RULE_start = 0, RULE_f = 1;
	public static final String[] ruleNames = {
		"start", "f"
	};

	@Override
	public String getGrammarFileName() { return "CTL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); f(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApContext extends FContext {
		public TerminalNode AP() { return getToken(CTLParser.AP, 0); }
		public ApContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitAp(this);
		}
	}
	public static class NOTContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NOTContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitNOT(this);
		}
	}
	public static class ANDContext extends FContext {
		public FContext first;
		public FContext second;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public ANDContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitAND(this);
		}
	}
	public static class TrueContext extends FContext {
		public TrueContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitTrue(this);
		}
	}
	public static class FalseContext extends FContext {
		public FalseContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitFalse(this);
		}
	}
	public static class ORorIMPLContext extends FContext {
		public FContext first;
		public FContext second;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public ORorIMPLContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterORorIMPL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitORorIMPL(this);
		}
	}
	public static class PareContext extends FContext {
		public FContext first;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public PareContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterPare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitPare(this);
		}
	}
	public static class AEXGFContext extends FContext {
		public FContext first;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public AEXGFContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterAEXGF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitAEXGF(this);
		}
	}
	public static class EAUContext extends FContext {
		public FContext first;
		public FContext second;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public EAUContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).enterEAU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CTLListener ) ((CTLListener)listener).exitEAU(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new NOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7); match(14);
				setState(8); f(6);
				}
				break;

			case 2:
				{
				_localctx = new AEXGFContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				_la = _input.LA(1);
				if ( !(_la==2 || _la==7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(10);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 8) | (1L << 9))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(11); ((AEXGFContext)_localctx).first = f(4);
				}
				break;

			case 3:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12); match(13);
				}
				break;

			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13); match(11);
				}
				break;

			case 5:
				{
				_localctx = new PareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14); match(5);
				setState(15); ((PareContext)_localctx).first = f(0);
				setState(16); match(3);
				}
				break;

			case 6:
				{
				_localctx = new EAUContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				_la = _input.LA(1);
				if ( !(_la==2 || _la==7) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(19); match(5);
				setState(20); ((EAUContext)_localctx).first = f(0);
				setState(21); match(10);
				setState(22); ((EAUContext)_localctx).second = f(0);
				setState(23); match(3);
				}
				break;

			case 7:
				{
				_localctx = new ApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25); match(AP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ANDContext(new FContext(_parentctx, _parentState));
						((ANDContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(28);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(29); match(1);
						setState(30); ((ANDContext)_localctx).second = f(6);
						}
						break;

					case 2:
						{
						_localctx = new ORorIMPLContext(new FContext(_parentctx, _parentState));
						((ORorIMPLContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(33); ((ORorIMPLContext)_localctx).second = f(3);
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22*\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3\f\3\16"+
		"\3(\13\3\3\3\2\3\4\4\2\4\2\5\4\2\4\4\t\t\4\2\b\b\n\13\4\2\6\6\16\16/\2"+
		"\6\3\2\2\2\4\34\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\b\3\1\2\t\n\7\20\2"+
		"\2\n\35\5\4\3\b\13\f\t\2\2\2\f\r\t\3\2\2\r\35\5\4\3\6\16\35\7\17\2\2\17"+
		"\35\7\r\2\2\20\21\7\7\2\2\21\22\5\4\3\2\22\23\7\5\2\2\23\35\3\2\2\2\24"+
		"\25\t\2\2\2\25\26\7\7\2\2\26\27\5\4\3\2\27\30\7\f\2\2\30\31\5\4\3\2\31"+
		"\32\7\5\2\2\32\35\3\2\2\2\33\35\7\22\2\2\34\b\3\2\2\2\34\13\3\2\2\2\34"+
		"\16\3\2\2\2\34\17\3\2\2\2\34\20\3\2\2\2\34\24\3\2\2\2\34\33\3\2\2\2\35"+
		"&\3\2\2\2\36\37\f\7\2\2\37 \7\3\2\2 %\5\4\3\b!\"\f\4\2\2\"#\t\4\2\2#%"+
		"\5\4\3\5$\36\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2"+
		"\2\2(&\3\2\2\2\5\34$&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}