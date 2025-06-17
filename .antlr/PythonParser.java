// Generated from /Users/jfernandes/Documents/piaget/3 ano/2ºsemestre/teoria de automatos e compiladores/TAC REPO/python_compiler/PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, IN=2, RANGE=3, IF=4, ELSE=5, ELIF=6, WHILE=7, DEF=8, RETURN=9, 
		AND=10, OR=11, NOT=12, ASSIGN=13, COLON=14, SEMI=15, ADD=16, SUB=17, MULT=18, 
		POW=19, DIV=20, COMMA=21, BOOLOP=22, RELATION=23, GREATER=24, LOWER=25, 
		EQUAL=26, GREATER_EQUAL=27, LOWER_EQUAL=28, NEQ=29, LB=30, OB=31, CB=32, 
		LBRACE=33, RBRACE=34, LBRACK=35, RBRACK=36, INDENT=37, BOOL=38, INT=39, 
		FLOAT=40, REAL=41, COMPLEX=42, ID=43, STRING=44, WS=45, COMMENT=46;
	public static final int
		RULE_code = 0, RULE_stat = 1, RULE_conditional = 2, RULE_loop_for = 3, 
		RULE_loop_while = 4, RULE_if_elif_else = 5, RULE_func = 6, RULE_func_call = 7, 
		RULE_expr = 8, RULE_query = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "stat", "conditional", "loop_for", "loop_while", "if_elif_else", 
			"func", "func_call", "expr", "query"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'in'", "'range'", "'if'", "'else'", "'elif'", "'while'", 
			"'def'", "'return'", "'and'", "'or'", "'not'", null, "':'", "';'", "'+'", 
			"'-'", "'*'", "'**'", "'/'", "','", null, null, "'>'", "'<'", "'=='", 
			"'>='", "'<='", "'!='", "'\\n'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "IN", "RANGE", "IF", "ELSE", "ELIF", "WHILE", "DEF", "RETURN", 
			"AND", "OR", "NOT", "ASSIGN", "COLON", "SEMI", "ADD", "SUB", "MULT", 
			"POW", "DIV", "COMMA", "BOOLOP", "RELATION", "GREATER", "LOWER", "EQUAL", 
			"GREATER_EQUAL", "LOWER_EQUAL", "NEQ", "LB", "OB", "CB", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "INDENT", "BOOL", "INT", "FLOAT", "REAL", "COMPLEX", 
			"ID", "STRING", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public List<Loop_whileContext> loop_while() {
			return getRuleContexts(Loop_whileContext.class);
		}
		public Loop_whileContext loop_while(int i) {
			return getRuleContext(Loop_whileContext.class,i);
		}
		public List<Loop_forContext> loop_for() {
			return getRuleContexts(Loop_forContext.class);
		}
		public Loop_forContext loop_for(int i) {
			return getRuleContext(Loop_forContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15121506112402L) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					stat();
					}
					break;
				case 2:
					{
					setState(21);
					conditional();
					}
					break;
				case 3:
					{
					setState(22);
					func();
					}
					break;
				case 4:
					{
					setState(23);
					func_call();
					}
					break;
				case 5:
					{
					setState(24);
					loop_while();
					}
					break;
				case 6:
					{
					setState(25);
					loop_for();
					}
					break;
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode LB() { return getToken(PythonParser.LB, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(RETURN);
				setState(34);
				query(0);
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(35);
					match(LB);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				query(0);
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(39);
					match(LB);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(ID);
				setState(43);
				match(ASSIGN);
				setState(44);
				query(0);
				setState(45);
				match(LB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(LB);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public If_elif_elseContext if_elif_else() {
			return getRuleContext(If_elif_elseContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			if_elif_else();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(PythonParser.RANGE, 0); }
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode LB() { return getToken(PythonParser.LB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(FOR);
			setState(53);
			match(ID);
			setState(54);
			match(IN);
			setState(55);
			match(RANGE);
			setState(56);
			match(OB);
			setState(57);
			expr(0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(58);
				match(COMMA);
				setState(59);
				expr(0);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(60);
					match(COMMA);
					setState(61);
					expr(0);
					}
				}

				}
			}

			setState(66);
			match(CB);
			setState(67);
			match(COLON);
			setState(68);
			match(LB);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				match(INDENT);
				setState(70);
				stat();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode LB() { return getToken(PythonParser.LB, 0); }
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(WHILE);
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(76);
				match(OB);
				}
				break;
			}
			setState(79);
			query(0);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CB) {
				{
				setState(80);
				match(CB);
				}
			}

			setState(83);
			match(COLON);
			setState(84);
			match(LB);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				match(INDENT);
				setState(86);
				stat();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_elif_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> LB() { return getTokens(PythonParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(PythonParser.LB, i);
		}
		public List<TerminalNode> OB() { return getTokens(PythonParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(PythonParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(PythonParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(PythonParser.CB, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public If_elif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elif_else; }
	}

	public final If_elif_elseContext if_elif_else() throws RecognitionException {
		If_elif_elseContext _localctx = new If_elif_elseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_elif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(92);
				match(OB);
				}
				break;
			}
			setState(95);
			query(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CB) {
				{
				setState(96);
				match(CB);
				}
			}

			setState(99);
			match(COLON);
			setState(100);
			match(LB);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				match(INDENT);
				setState(102);
				stat();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDENT );
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(107);
				match(ELIF);
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(108);
					match(OB);
					}
					break;
				}
				setState(111);
				query(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CB) {
					{
					setState(112);
					match(CB);
					}
				}

				setState(115);
				match(COLON);
				setState(116);
				match(LB);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					match(INDENT);
					setState(118);
					stat();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INDENT );
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(128);
				match(ELSE);
				setState(129);
				match(COLON);
				setState(130);
				match(LB);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(INDENT);
					setState(132);
					stat();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INDENT );
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode LB() { return getToken(PythonParser.LB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DEF);
			setState(140);
			match(ID);
			setState(141);
			match(OB);
			setState(142);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				match(ID);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(CB);
			setState(151);
			match(COLON);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(152);
				match(RETURN);
				setState(153);
				query(0);
				}
				break;
			case LB:
				{
				setState(154);
				match(LB);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					match(INDENT);
					setState(156);
					stat();
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INDENT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(OB);
			setState(165);
			query(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				query(0);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PythonParser.FLOAT, 0); }
		public TerminalNode COMPLEX() { return getToken(PythonParser.COMPLEX, 0); }
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode ADD() { return getToken(PythonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PythonParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(PythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(176);
				match(ID);
				}
				break;
			case 2:
				{
				setState(177);
				match(INT);
				}
				break;
			case 3:
				{
				setState(178);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(179);
				match(COMPLEX);
				}
				break;
			case 5:
				{
				setState(180);
				match(OB);
				setState(181);
				expr(0);
				setState(182);
				match(CB);
				}
				break;
			case 6:
				{
				setState(184);
				func_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(187);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(188);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1507328L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(189);
					expr(4);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(PythonParser.BOOL, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode OB() { return getToken(PythonParser.OB, 0); }
		public TerminalNode CB() { return getToken(PythonParser.CB, 0); }
		public TerminalNode BOOLOP() { return getToken(PythonParser.BOOLOP, 0); }
		public List<TerminalNode> RELATION() { return getTokens(PythonParser.RELATION); }
		public TerminalNode RELATION(int i) {
			return getToken(PythonParser.RELATION, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_query, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(196);
				expr(0);
				}
				break;
			case 2:
				{
				setState(197);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(198);
				match(NOT);
				setState(199);
				query(3);
				}
				break;
			case 4:
				{
				setState(200);
				match(OB);
				setState(201);
				query(0);
				setState(202);
				match(CB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new QueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						match(BOOLOP);
						setState(208);
						query(5);
						}
						break;
					case 2:
						{
						_localctx = new QueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(212); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(210);
								match(RELATION);
								setState(211);
								query(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(214); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return query_sempred((QueryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"1\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003?\b\u0003\u0003\u0003A\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003H\b\u0003\u000b"+
		"\u0003\f\u0003I\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004X\b\u0004\u000b\u0004\f\u0004Y\u0001\u0005\u0001"+
		"\u0005\u0003\u0005^\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005h\b\u0005"+
		"\u000b\u0005\f\u0005i\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005x\b\u0005\u000b\u0005\f\u0005y\u0005\u0005"+
		"|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0086\b\u0005\u000b\u0005\f"+
		"\u0005\u0087\u0003\u0005\u008a\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0092\b\u0006\n\u0006"+
		"\f\u0006\u0095\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u009e\b\u0006\u000b\u0006"+
		"\f\u0006\u009f\u0003\u0006\u00a2\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a9\b\u0007\n\u0007\f\u0007"+
		"\u00ac\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ba\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00bf\b\b\n\b\f\b\u00c2\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00d5\b\t"+
		"\u000b\t\f\t\u00d6\u0005\t\u00d9\b\t\n\t\f\t\u00dc\t\t\u0001\t\u0000\u0002"+
		"\u0010\u0012\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001"+
		"\u0002\u0000\u0010\u0012\u0014\u0014\u00fd\u0000\u001c\u0001\u0000\u0000"+
		"\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006"+
		"4\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\f\u008b\u0001\u0000\u0000\u0000\u000e\u00a3\u0001\u0000\u0000\u0000"+
		"\u0010\u00b9\u0001\u0000\u0000\u0000\u0012\u00cc\u0001\u0000\u0000\u0000"+
		"\u0014\u001b\u0003\u0002\u0001\u0000\u0015\u001b\u0003\u0004\u0002\u0000"+
		"\u0016\u001b\u0003\f\u0006\u0000\u0017\u001b\u0003\u000e\u0007\u0000\u0018"+
		"\u001b\u0003\b\u0004\u0000\u0019\u001b\u0003\u0006\u0003\u0000\u001a\u0014"+
		"\u0001\u0000\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016"+
		"\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"+
		"\u0000\u0000!\"\u0005\t\u0000\u0000\"$\u0003\u0012\t\u0000#%\u0005\u001e"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%1\u0001"+
		"\u0000\u0000\u0000&(\u0003\u0012\t\u0000\')\u0005\u001e\u0000\u0000(\'"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)1\u0001\u0000\u0000"+
		"\u0000*+\u0005+\u0000\u0000+,\u0005\r\u0000\u0000,-\u0003\u0012\t\u0000"+
		"-.\u0005\u001e\u0000\u0000.1\u0001\u0000\u0000\u0000/1\u0005\u001e\u0000"+
		"\u00000!\u0001\u0000\u0000\u00000&\u0001\u0000\u0000\u00000*\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u0000"+
		"23\u0003\n\u0005\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0001\u0000"+
		"\u000056\u0005+\u0000\u000067\u0005\u0002\u0000\u000078\u0005\u0003\u0000"+
		"\u000089\u0005\u001f\u0000\u00009@\u0003\u0010\b\u0000:;\u0005\u0015\u0000"+
		"\u0000;>\u0003\u0010\b\u0000<=\u0005\u0015\u0000\u0000=?\u0003\u0010\b"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@:\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0005 \u0000\u0000CD\u0005\u000e\u0000\u0000DG\u0005"+
		"\u001e\u0000\u0000EF\u0005%\u0000\u0000FH\u0003\u0002\u0001\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KM\u0005\u0007"+
		"\u0000\u0000LN\u0005\u001f\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0003\u0012\t\u0000PR\u0005"+
		" \u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0005\u000e\u0000\u0000TW\u0005\u001e\u0000\u0000"+
		"UV\u0005%\u0000\u0000VX\u0003\u0002\u0001\u0000WU\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[]\u0005\u0004\u0000\u0000\\^\u0005\u001f"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_a\u0003\u0012\t\u0000`b\u0005 \u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0005\u000e\u0000\u0000dg\u0005\u001e\u0000\u0000ef\u0005%\u0000\u0000"+
		"fh\u0003\u0002\u0001\u0000ge\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j}\u0001\u0000"+
		"\u0000\u0000km\u0005\u0006\u0000\u0000ln\u0005\u001f\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0003\u0012\t\u0000pr\u0005 \u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u000e\u0000"+
		"\u0000tw\u0005\u001e\u0000\u0000uv\u0005%\u0000\u0000vx\u0003\u0002\u0001"+
		"\u0000wu\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{k\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0089\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0082"+
		"\u0005\u000e\u0000\u0000\u0082\u0085\u0005\u001e\u0000\u0000\u0083\u0084"+
		"\u0005%\u0000\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\b\u0000\u0000\u008c\u008d\u0005+\u0000\u0000\u008d\u008e\u0005\u001f"+
		"\u0000\u0000\u008e\u0093\u0005+\u0000\u0000\u008f\u0090\u0005\u0015\u0000"+
		"\u0000\u0090\u0092\u0005+\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005 \u0000\u0000\u0097"+
		"\u00a1\u0005\u000e\u0000\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u00a2"+
		"\u0003\u0012\t\u0000\u009a\u009d\u0005\u001e\u0000\u0000\u009b\u009c\u0005"+
		"%\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000"+
		"\u0000\u0000\u00a2\r\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005+\u0000"+
		"\u0000\u00a4\u00a5\u0005\u001f\u0000\u0000\u00a5\u00aa\u0003\u0012\t\u0000"+
		"\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00a9\u0003\u0012\t\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005 \u0000\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0006\b\uffff\uffff\u0000\u00b0\u00ba\u0005+\u0000\u0000\u00b1\u00ba"+
		"\u0005\'\u0000\u0000\u00b2\u00ba\u0005(\u0000\u0000\u00b3\u00ba\u0005"+
		"*\u0000\u0000\u00b4\u00b5\u0005\u001f\u0000\u0000\u00b5\u00b6\u0003\u0010"+
		"\b\u0000\u00b6\u00b7\u0005 \u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0003\u000e\u0007\u0000\u00b9\u00af\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\n\u0003\u0000\u0000\u00bc\u00bd\u0007\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0003\u0010\b\u0004\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u0011\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006\t\uffff\uffff\u0000\u00c4"+
		"\u00cd\u0003\u0010\b\u0000\u00c5\u00cd\u0005&\u0000\u0000\u00c6\u00c7"+
		"\u0005\f\u0000\u0000\u00c7\u00cd\u0003\u0012\t\u0003\u00c8\u00c9\u0005"+
		"\u001f\u0000\u0000\u00c9\u00ca\u0003\u0012\t\u0000\u00ca\u00cb\u0005 "+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cd\u00da\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\n\u0004\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000"+
		"\u0000\u00d0\u00d9\u0003\u0012\t\u0005\u00d1\u00d4\n\u0001\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0017\u0000\u0000\u00d3\u00d5\u0003\u0012\t\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u0013\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u001e"+
		"\u001a\u001c$(0>@IMQY]aimqy}\u0087\u0089\u0093\u009f\u00a1\u00aa\u00b9"+
		"\u00c0\u00cc\u00d6\u00d8\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}