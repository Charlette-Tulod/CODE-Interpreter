import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SimpleParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, INT = 8, FLOAT = 9,
			CHAR = 10, STRING = 11, BOOL = 12, BEGIN = 13, END = 14, IDENTIFIER = 15, NEWLINE = 16,
			WS = 17, COMMENT = 18;
	public static final int RULE_start = 0, RULE_line = 1, RULE_statement = 2, RULE_assignment = 3,
			RULE_datatype = 4, RULE_data = 5, RULE_expression = 6;

	private static String[] makeRuleNames() {
		return new String[] {
				"start", "line", "statement", "assignment", "datatype", "data", "expression"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'='", "';'", "'INT'", "'FLOAT'", "'CHAR'", "'STRING'", "'BOOL'",
				null, null, null, null, null, "'BEGIN'", "'END'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, "INT", "FLOAT", "CHAR",
				"STRING", "BOOL", "BEGIN", "END", "IDENTIFIER", "NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() {
		return "Simple.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode BEGIN() {
			return getToken(SimpleParser.BEGIN, 0);
		}

		public TerminalNode END() {
			return getToken(SimpleParser.END, 0);
		}

		public TerminalNode EOF() {
			return getToken(SimpleParser.EOF, 0);
		}

		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}

		public LineContext line(int i) {
			return getRuleContext(LineContext.class, i);
		}

		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitStart(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(14);
				match(BEGIN);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4)
						| (1L << T__5) | (1L << T__6) | (1L << NEWLINE))) != 0)) {
					{
						{
							setState(15);
							line();
						}
					}
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(21);
				match(END);
				setState(22);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() {
			return getToken(SimpleParser.NEWLINE, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_line;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitLine(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NEWLINE:
					enterOuterAlt(_localctx, 1); {
					setState(24);
					match(NEWLINE);
				}
					break;
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
					enterOuterAlt(_localctx, 2); {
					setState(25);
					statement();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitStatement(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(28);
				assignment();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(SimpleParser.IDENTIFIER, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitAssignment(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(30);
				datatype();
				setState(31);
				match(IDENTIFIER);
				setState(32);
				match(T__0);
				setState(33);
				expression();
				setState(34);
				match(T__1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_datatype;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitDatatype(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(36);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la)
						& ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode INT() {
			return getToken(SimpleParser.INT, 0);
		}

		public TerminalNode FLOAT() {
			return getToken(SimpleParser.FLOAT, 0);
		}

		public TerminalNode CHAR() {
			return getToken(SimpleParser.CHAR, 0);
		}

		public TerminalNode STRING() {
			return getToken(SimpleParser.STRING, 0);
		}

		public TerminalNode BOOL() {
			return getToken(SimpleParser.BOOL, 0);
		}

		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_data;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitData(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(38);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la)
						& ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() {
			return getToken(SimpleParser.IDENTIFIER, 0);
		}

		public DataContext data() {
			return getRuleContext(DataContext.class, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SimpleVisitor)
				return ((SimpleVisitor<? extends T>) visitor).visitExpression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1); {
					setState(40);
					match(IDENTIFIER);
				}
					break;
				case INT:
				case FLOAT:
				case CHAR:
				case STRING:
				case BOOL:
					enterOuterAlt(_localctx, 2); {
					setState(41);
					data();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24/\4\2\t\2\4\3\t"
			+
			"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2" +
			"\26\13\2\3\2\3\2\3\2\3\3\3\3\5\3\35\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3" +
			"\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b-\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\5" +
			"\t\3\2\n\16\2*\2\20\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n&\3" +
			"\2\2\2\f(\3\2\2\2\16,\3\2\2\2\20\24\7\17\2\2\21\23\5\4\3\2\22\21\3\2\2" +
			"\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2" +
			"\2\27\30\7\20\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\35\7\22\2\2\33\35\5\6" +
			"\4\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\5\b\5\2\37\7\3\2\2" +
			"\2 !\5\n\6\2!\"\7\21\2\2\"#\7\3\2\2#$\5\16\b\2$%\7\4\2\2%\t\3\2\2\2&\'" +
			"\t\2\2\2\'\13\3\2\2\2()\t\3\2\2)\r\3\2\2\2*-\7\21\2\2+-\5\f\7\2,*\3\2" +
			"\2\2,+\3\2\2\2-\17\3\2\2\2\5\24\34,";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}