// Generated from /Users/germain/Documents/2A/GL/gl37/src/main/antlr4/fr/ensimag/deca/syntax/DecaLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecaLexer extends AbstractDecaLexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASM=1, CLASS=2, EXTENDS=3, ELSE=4, FALSE=5, IF=6, INSTANCEOF=7, NEW=8, 
		NULL=9, READINT=10, READFLOAT=11, PRINT=12, PRINTLN=13, PRINTLNX=14, PRINTX=15, 
		PROTECTED=16, RETURN=17, THIS=18, TRUE=19, WHILE=20, IDENT=21, LT=22, 
		GT=23, EQUALS=24, PLUS=25, MINUS=26, TIMES=27, SLASH=28, PERCENT=29, DOT=30, 
		COMMA=31, OPARENT=32, CPARENT=33, OBRACE=34, CBRACE=35, EXCLAM=36, SEMI=37, 
		EQEQ=38, NEQ=39, GEQ=40, LEQ=41, AND=42, OR=43, INT=44, FLOAT=45, STRING=46, 
		MULTI_LINE_STRING=47, COMMENT=48, SEPARATOR=49, INCLUDE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASM", "CLASS", "EXTENDS", "ELSE", "FALSE", "IF", "INSTANCEOF", "NEW", 
			"NULL", "READINT", "READFLOAT", "PRINT", "PRINTLN", "PRINTLNX", "PRINTX", 
			"PROTECTED", "RETURN", "THIS", "TRUE", "WHILE", "KEYWORDS", "LETTER", 
			"DIGIT", "IDENT", "LT", "GT", "EQUALS", "PLUS", "MINUS", "TIMES", "SLASH", 
			"PERCENT", "DOT", "COMMA", "OPARENT", "CPARENT", "OBRACE", "CBRACE", 
			"EXCLAM", "SEMI", "EQEQ", "NEQ", "GEQ", "LEQ", "AND", "OR", "POSITIVE_DIGIT", 
			"INT", "NUM", "SIGN", "EXP", "DEC", "FLOATDEC", "DIGITHEX", "NUMHEX", 
			"FLOATHEX", "FLOAT", "STRING_CAR", "STRING", "MULTI_LINE_STRING", "COMMENT", 
			"ESPACE", "SEPARATOR", "FILENAME", "INCLUDE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'asm'", "'class'", "'extends'", "'else'", "'false'", "'if'", "'instanceof'", 
			"'new'", "'null'", "'readInt'", "'readFloat'", "'print'", "'println'", 
			"'printlnx'", "'printx'", "'protected'", "'return'", "'this'", "'true'", 
			"'while'", null, "'<'", "'>'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'.'", "','", "'('", "')'", "'{'", "'}'", "'!'", "';'", "'=='", "'!='", 
			"'>='", "'<='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASM", "CLASS", "EXTENDS", "ELSE", "FALSE", "IF", "INSTANCEOF", 
			"NEW", "NULL", "READINT", "READFLOAT", "PRINT", "PRINTLN", "PRINTLNX", 
			"PRINTX", "PROTECTED", "RETURN", "THIS", "TRUE", "WHILE", "IDENT", "LT", 
			"GT", "EQUALS", "PLUS", "MINUS", "TIMES", "SLASH", "PERCENT", "DOT", 
			"COMMA", "OPARENT", "CPARENT", "OBRACE", "CBRACE", "EXCLAM", "SEMI", 
			"EQEQ", "NEQ", "GEQ", "LEQ", "AND", "OR", "INT", "FLOAT", "STRING", "MULTI_LINE_STRING", 
			"COMMENT", "SEPARATOR", "INCLUDE"
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




	public DecaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 60:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			SEPARATOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			INCLUDE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void SEPARATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    skip();
			    
			break;
		}
	}
	private void INCLUDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    doInclude(getText());
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u025d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u017c\n\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0184\n\31\3"+
		"\31\3\31\3\31\7\31\u0189\n\31\f\31\16\31\u018c\13\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\7\61\u01c5\n\61\f\61\16"+
		"\61\u01c8\13\61\5\61\u01ca\n\61\3\62\6\62\u01cd\n\62\r\62\16\62\u01ce"+
		"\3\63\3\63\5\63\u01d3\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\5\66\u01e1\n\66\3\66\3\66\5\66\u01e5\n\66\3\67\3\67\5"+
		"\67\u01e9\n\67\38\68\u01ec\n8\r8\168\u01ed\39\39\39\39\59\u01f4\n9\39"+
		"\39\39\39\39\39\39\39\59\u01fe\n9\3:\3:\5:\u0202\n:\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\7<\u020c\n<\f<\16<\u020f\13<\3<\3<\3=\3=\3=\3=\3=\7=\u0218\n=\f"+
		"=\16=\u021b\13=\3=\3=\3>\3>\3>\3>\7>\u0223\n>\f>\16>\u0226\13>\3>\5>\u0229"+
		"\n>\3>\3>\3>\3>\7>\u022f\n>\f>\16>\u0232\13>\3>\3>\5>\u0236\n>\3>\3>\3"+
		"?\3?\3@\3@\5@\u023e\n@\3@\3@\3A\3A\3A\6A\u0245\nA\rA\16A\u0246\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\7B\u0253\nB\fB\16B\u0256\13B\3B\3B\3B\3B\3B\3B"+
		"\4\u0224\u0230\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27\63\30\65\31"+
		"\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_\2a.c\2e\2g\2"+
		"i\2k\2m\2o\2q\2s/u\2w\60y\61{\62}\2\177\63\u0081\2\u0083\64\3\2\r\4\2"+
		"C\\c|\4\2&&aa\4\2GGgg\4\2HHhh\4\2CHch\4\2RRrr\5\2\f\f$$^^\4\2\f\f^^\3"+
		"\3\f\f\5\2\13\f\17\17\"\"\5\2--/\60aa\2\u027d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"a\3\2\2\2\2s\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0089\3\2\2\2\7\u008f\3\2\2\2\t\u0097"+
		"\3\2\2\2\13\u009c\3\2\2\2\r\u00a2\3\2\2\2\17\u00a5\3\2\2\2\21\u00b0\3"+
		"\2\2\2\23\u00b4\3\2\2\2\25\u00b9\3\2\2\2\27\u00c1\3\2\2\2\31\u00cb\3\2"+
		"\2\2\33\u00d1\3\2\2\2\35\u00d9\3\2\2\2\37\u00e2\3\2\2\2!\u00e9\3\2\2\2"+
		"#\u00f3\3\2\2\2%\u00fa\3\2\2\2\'\u00ff\3\2\2\2)\u0104\3\2\2\2+\u017b\3"+
		"\2\2\2-\u017d\3\2\2\2/\u017f\3\2\2\2\61\u0183\3\2\2\2\63\u018d\3\2\2\2"+
		"\65\u018f\3\2\2\2\67\u0191\3\2\2\29\u0193\3\2\2\2;\u0195\3\2\2\2=\u0197"+
		"\3\2\2\2?\u0199\3\2\2\2A\u019b\3\2\2\2C\u019d\3\2\2\2E\u019f\3\2\2\2G"+
		"\u01a1\3\2\2\2I\u01a3\3\2\2\2K\u01a5\3\2\2\2M\u01a7\3\2\2\2O\u01a9\3\2"+
		"\2\2Q\u01ab\3\2\2\2S\u01ad\3\2\2\2U\u01b0\3\2\2\2W\u01b3\3\2\2\2Y\u01b6"+
		"\3\2\2\2[\u01b9\3\2\2\2]\u01bc\3\2\2\2_\u01bf\3\2\2\2a\u01c9\3\2\2\2c"+
		"\u01cc\3\2\2\2e\u01d2\3\2\2\2g\u01d4\3\2\2\2i\u01d8\3\2\2\2k\u01e0\3\2"+
		"\2\2m\u01e8\3\2\2\2o\u01eb\3\2\2\2q\u01f3\3\2\2\2s\u0201\3\2\2\2u\u0203"+
		"\3\2\2\2w\u0205\3\2\2\2y\u0212\3\2\2\2{\u0235\3\2\2\2}\u0239\3\2\2\2\177"+
		"\u023d\3\2\2\2\u0081\u0244\3\2\2\2\u0083\u0248\3\2\2\2\u0085\u0086\7c"+
		"\2\2\u0086\u0087\7u\2\2\u0087\u0088\7o\2\2\u0088\4\3\2\2\2\u0089\u008a"+
		"\7e\2\2\u008a\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7u\2\2\u008e\6\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7z\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2"+
		"\u0095\u0096\7u\2\2\u0096\b\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n"+
		"\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\n\3\2\2\2\u009c\u009d"+
		"\7h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a4"+
		"\16\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7u\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7h\2\2\u00af\20\3\2"+
		"\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7y\2\2\u00b3\22"+
		"\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7n\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7v\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7"+
		"g\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7H\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\30\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2"+
		"\u00d6\u00d7\7n\2\2\u00d7\u00d8\7p\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7"+
		"r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de"+
		"\7v\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7z\2\2\u00e1"+
		"\36\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7z\2\2\u00e8 \3\2\2\2\u00e9"+
		"\u00ea\7r\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7f\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7j\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7u\2\2\u00fe&\3\2\2\2\u00ff\u0100\7v\2\2\u0100"+
		"\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102\u0103\7g\2\2\u0103(\3\2\2\2\u0104"+
		"\u0105\7y\2\2\u0105\u0106\7j\2\2\u0106\u0107\7k\2\2\u0107\u0108\7n\2\2"+
		"\u0108\u0109\7g\2\2\u0109*\3\2\2\2\u010a\u010b\7c\2\2\u010b\u010c\7u\2"+
		"\2\u010c\u017c\7o\2\2\u010d\u010e\7e\2\2\u010e\u010f\7n\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7u\2\2\u0111\u017c\7u\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7z\2\2\u0114\u0115\7v\2\2\u0115\u0116\7g\2\2\u0116\u0117\7p\2\2"+
		"\u0117\u0118\7f\2\2\u0118\u017c\7u\2\2\u0119\u011a\7g\2\2\u011a\u011b"+
		"\7n\2\2\u011b\u011c\7u\2\2\u011c\u017c\7g\2\2\u011d\u011e\7h\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u017c\7g\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u017c\7h\2\2\u0124\u0125\7k\2\2\u0125\u0126"+
		"\7p\2\2\u0126\u0127\7u\2\2\u0127\u0128\7v\2\2\u0128\u0129\7c\2\2\u0129"+
		"\u012a\7p\2\2\u012a\u012b\7e\2\2\u012b\u012c\7g\2\2\u012c\u012d\7q\2\2"+
		"\u012d\u017c\7h\2\2\u012e\u012f\7p\2\2\u012f\u0130\7g\2\2\u0130\u017c"+
		"\7y\2\2\u0131\u0132\7p\2\2\u0132\u0133\7w\2\2\u0133\u0134\7n\2\2\u0134"+
		"\u017c\7n\2\2\u0135\u0136\7t\2\2\u0136\u0137\7g\2\2\u0137\u0138\7c\2\2"+
		"\u0138\u0139\7f\2\2\u0139\u013a\7K\2\2\u013a\u013b\7p\2\2\u013b\u017c"+
		"\7v\2\2\u013c\u013d\7t\2\2\u013d\u013e\7g\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7f\2\2\u0140\u0141\7H\2\2\u0141\u0142\7n\2\2\u0142\u0143\7q\2\2"+
		"\u0143\u0144\7c\2\2\u0144\u017c\7v\2\2\u0145\u0146\7r\2\2\u0146\u0147"+
		"\7t\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u017c\7v\2\2\u014a"+
		"\u014b\7r\2\2\u014b\u014c\7t\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2"+
		"\u014e\u014f\7v\2\2\u014f\u0150\7n\2\2\u0150\u017c\7p\2\2\u0151\u0152"+
		"\7r\2\2\u0152\u0153\7t\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155"+
		"\u0156\7v\2\2\u0156\u0157\7n\2\2\u0157\u0158\7p\2\2\u0158\u017c\7z\2\2"+
		"\u0159\u015a\7r\2\2\u015a\u015b\7t\2\2\u015b\u015c\7k\2\2\u015c\u015d"+
		"\7p\2\2\u015d\u015e\7v\2\2\u015e\u017c\7z\2\2\u015f\u0160\7r\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7q\2\2\u0162\u0163\7v\2\2\u0163\u0164\7g\2\2"+
		"\u0164\u0165\7e\2\2\u0165\u0166\7v\2\2\u0166\u0167\7g\2\2\u0167\u017c"+
		"\7f\2\2\u0168\u0169\7t\2\2\u0169\u016a\7g\2\2\u016a\u016b\7v\2\2\u016b"+
		"\u016c\7w\2\2\u016c\u016d\7t\2\2\u016d\u017c\7p\2\2\u016e\u016f\7v\2\2"+
		"\u016f\u0170\7j\2\2\u0170\u0171\7k\2\2\u0171\u017c\7u\2\2\u0172\u0173"+
		"\7v\2\2\u0173\u0174\7t\2\2\u0174\u0175\7w\2\2\u0175\u017c\7g\2\2\u0176"+
		"\u0177\7y\2\2\u0177\u0178\7j\2\2\u0178\u0179\7k\2\2\u0179\u017a\7n\2\2"+
		"\u017a\u017c\7g\2\2\u017b\u010a\3\2\2\2\u017b\u010d\3\2\2\2\u017b\u0112"+
		"\3\2\2\2\u017b\u0119\3\2\2\2\u017b\u011d\3\2\2\2\u017b\u0122\3\2\2\2\u017b"+
		"\u0124\3\2\2\2\u017b\u012e\3\2\2\2\u017b\u0131\3\2\2\2\u017b\u0135\3\2"+
		"\2\2\u017b\u013c\3\2\2\2\u017b\u0145\3\2\2\2\u017b\u014a\3\2\2\2\u017b"+
		"\u0151\3\2\2\2\u017b\u0159\3\2\2\2\u017b\u015f\3\2\2\2\u017b\u0168\3\2"+
		"\2\2\u017b\u016e\3\2\2\2\u017b\u0172\3\2\2\2\u017b\u0176\3\2\2\2\u017c"+
		",\3\2\2\2\u017d\u017e\t\2\2\2\u017e.\3\2\2\2\u017f\u0180\4\62;\2\u0180"+
		"\60\3\2\2\2\u0181\u0184\5-\27\2\u0182\u0184\t\3\2\2\u0183\u0181\3\2\2"+
		"\2\u0183\u0182\3\2\2\2\u0184\u018a\3\2\2\2\u0185\u0189\5-\27\2\u0186\u0189"+
		"\5/\30\2\u0187\u0189\t\3\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\62\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7>\2\2\u018e\64"+
		"\3\2\2\2\u018f\u0190\7@\2\2\u0190\66\3\2\2\2\u0191\u0192\7?\2\2\u0192"+
		"8\3\2\2\2\u0193\u0194\7-\2\2\u0194:\3\2\2\2\u0195\u0196\7/\2\2\u0196<"+
		"\3\2\2\2\u0197\u0198\7,\2\2\u0198>\3\2\2\2\u0199\u019a\7\61\2\2\u019a"+
		"@\3\2\2\2\u019b\u019c\7\'\2\2\u019cB\3\2\2\2\u019d\u019e\7\60\2\2\u019e"+
		"D\3\2\2\2\u019f\u01a0\7.\2\2\u01a0F\3\2\2\2\u01a1\u01a2\7*\2\2\u01a2H"+
		"\3\2\2\2\u01a3\u01a4\7+\2\2\u01a4J\3\2\2\2\u01a5\u01a6\7}\2\2\u01a6L\3"+
		"\2\2\2\u01a7\u01a8\7\177\2\2\u01a8N\3\2\2\2\u01a9\u01aa\7#\2\2\u01aaP"+
		"\3\2\2\2\u01ab\u01ac\7=\2\2\u01acR\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae\u01af"+
		"\7?\2\2\u01afT\3\2\2\2\u01b0\u01b1\7#\2\2\u01b1\u01b2\7?\2\2\u01b2V\3"+
		"\2\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5\7?\2\2\u01b5X\3\2\2\2\u01b6\u01b7"+
		"\7>\2\2\u01b7\u01b8\7?\2\2\u01b8Z\3\2\2\2\u01b9\u01ba\7(\2\2\u01ba\u01bb"+
		"\7(\2\2\u01bb\\\3\2\2\2\u01bc\u01bd\7~\2\2\u01bd\u01be\7~\2\2\u01be^\3"+
		"\2\2\2\u01bf\u01c0\4\63;\2\u01c0`\3\2\2\2\u01c1\u01ca\7\62\2\2\u01c2\u01c6"+
		"\5_\60\2\u01c3\u01c5\5/\30\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01c1\3\2\2\2\u01c9\u01c2\3\2\2\2\u01cab\3\2\2\2\u01cb\u01cd"+
		"\5/\30\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfd\3\2\2\2\u01d0\u01d3\59\35\2\u01d1\u01d3\5;\36\2"+
		"\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3f\3\2\2\2\u01d4\u01d5\t"+
		"\4\2\2\u01d5\u01d6\5e\63\2\u01d6\u01d7\5c\62\2\u01d7h\3\2\2\2\u01d8\u01d9"+
		"\5c\62\2\u01d9\u01da\7\60\2\2\u01da\u01db\5c\62\2\u01dbj\3\2\2\2\u01dc"+
		"\u01e1\5i\65\2\u01dd\u01de\5i\65\2\u01de\u01df\5g\64\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e5\t\5\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2"+
		"\2\2\u01e5l\3\2\2\2\u01e6\u01e9\5/\30\2\u01e7\u01e9\t\6\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9n\3\2\2\2\u01ea\u01ec\5m\67\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01eep\3\2\2\2\u01ef\u01f0\7\62\2\2\u01f0\u01f4\7z\2\2\u01f1\u01f2"+
		"\7\62\2\2\u01f2\u01f4\7Z\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\5o8\2\u01f6\u01f7\7\60\2\2\u01f7\u01f8\5o8"+
		"\2\u01f8\u01f9\t\7\2\2\u01f9\u01fa\5e\63\2\u01fa\u01fd\5c\62\2\u01fb\u01fe"+
		"\t\5\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"r\3\2\2\2\u01ff\u0202\5k\66\2\u0200\u0202\5q9\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0200\3\2\2\2\u0202t\3\2\2\2\u0203\u0204\n\b\2\2\u0204v\3\2\2\2\u0205"+
		"\u020d\7$\2\2\u0206\u020c\5u;\2\u0207\u0208\7^\2\2\u0208\u020c\7$\2\2"+
		"\u0209\u020a\7^\2\2\u020a\u020c\7^\2\2\u020b\u0206\3\2\2\2\u020b\u0207"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7$"+
		"\2\2\u0211x\3\2\2\2\u0212\u0219\7$\2\2\u0213\u0218\5u;\2\u0214\u0218\t"+
		"\t\2\2\u0215\u0216\7^\2\2\u0216\u0218\7^\2\2\u0217\u0213\3\2\2\2\u0217"+
		"\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u021d\7$\2\2\u021dz\3\2\2\2\u021e\u021f\7\61\2\2\u021f\u0220\7\61\2\2"+
		"\u0220\u0224\3\2\2\2\u0221\u0223\13\2\2\2\u0222\u0221\3\2\2\2\u0223\u0226"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0229\t\n\2\2\u0228\u0227\3\2\2\2\u0229\u0236\3\2"+
		"\2\2\u022a\u022b\7\61\2\2\u022b\u022c\7,\2\2\u022c\u0230\3\2\2\2\u022d"+
		"\u022f\13\2\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0234\7,\2\2\u0234\u0236\7\61\2\2\u0235\u021e\3\2\2\2\u0235\u022a\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\b>\2\2\u0238|\3\2\2\2\u0239\u023a"+
		"\t\13\2\2\u023a~\3\2\2\2\u023b\u023e\5}?\2\u023c\u023e\5{>\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\b@\3\2\u0240"+
		"\u0080\3\2\2\2\u0241\u0245\5-\27\2\u0242\u0245\5/\30\2\u0243\u0245\t\f"+
		"\2\2\u0244\u0241\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0082\3\2"+
		"\2\2\u0248\u0249\7%\2\2\u0249\u024a\7k\2\2\u024a\u024b\7p\2\2\u024b\u024c"+
		"\7e\2\2\u024c\u024d\7n\2\2\u024d\u024e\7w\2\2\u024e\u024f\7f\2\2\u024f"+
		"\u0250\7g\2\2\u0250\u0254\3\2\2\2\u0251\u0253\7\"\2\2\u0252\u0251\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7$\2\2\u0258\u0259\5\u0081"+
		"A\2\u0259\u025a\7$\2\2\u025a\u025b\3\2\2\2\u025b\u025c\bB\4\2\u025c\u0084"+
		"\3\2\2\2\36\2\u017b\u0183\u0188\u018a\u01c6\u01c9\u01ce\u01d2\u01e0\u01e4"+
		"\u01e8\u01ed\u01f3\u01fd\u0201\u020b\u020d\u0217\u0219\u0224\u0228\u0230"+
		"\u0235\u023d\u0244\u0246\u0254\5\3>\2\3@\3\3B\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}