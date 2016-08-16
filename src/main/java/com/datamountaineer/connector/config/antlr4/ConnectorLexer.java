// Generated from ConnectorLexer.g4 by ANTLR 4.5.3
package com.datamountaineer.connector.config.antlr4;

 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSERT=1, UPSERT=2, INTO=3, SELECT=4, FROM=5, IGNORE=6, AS=7, AUTOCREATE=8, 
		AUTOEVOLVE=9, CLUSTERBY=10, BUCKETS=11, BATCH=12, CAPITALIZE=13, PARTITIONBY=14, 
		DISTRIBUTEBY=15, TIMESTAMP=16, STOREDAS=17, SYS_TIME=18, WITHGROUP=19, 
		WITHOFFSET=20, PK=21, EQUAL=22, INT=23, ASTERISK=24, COMMA=25, DOT=26, 
		LEFT_PARAN=27, RIGHT_PARAN=28, ID=29, TOPICNAME=30, NEWLINE=31, WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INSERT", "UPSERT", "INTO", "SELECT", "FROM", "IGNORE", "AS", "AUTOCREATE", 
		"AUTOEVOLVE", "CLUSTERBY", "BUCKETS", "BATCH", "CAPITALIZE", "PARTITIONBY", 
		"DISTRIBUTEBY", "TIMESTAMP", "STOREDAS", "SYS_TIME", "WITHGROUP", "WITHOFFSET", 
		"PK", "EQUAL", "INT", "ASTERISK", "COMMA", "DOT", "LEFT_PARAN", "RIGHT_PARAN", 
		"ID", "TOPICNAME", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'='", null, 
		"'*'", "','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INSERT", "UPSERT", "INTO", "SELECT", "FROM", "IGNORE", "AS", "AUTOCREATE", 
		"AUTOEVOLVE", "CLUSTERBY", "BUCKETS", "BATCH", "CAPITALIZE", "PARTITIONBY", 
		"DISTRIBUTEBY", "TIMESTAMP", "STOREDAS", "SYS_TIME", "WITHGROUP", "WITHOFFSET", 
		"PK", "EQUAL", "INT", "ASTERISK", "COMMA", "DOT", "LEFT_PARAN", "RIGHT_PARAN", 
		"ID", "TOPICNAME", "NEWLINE", "WS"
	};
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


	public ConnectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConnectorLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u01d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2P\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\5\b\u0094"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00e4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f0"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0106\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u011e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0138\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0154\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0166\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u017c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0190\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a6\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u01ac\n\26\3\27\3\27\3\30\6\30\u01b1\n\30\r\30\16\30\u01b2\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u01c0\n\36\r\36\16"+
		"\36\u01c1\3\37\6\37\u01c5\n\37\r\37\16\37\u01c6\3 \5 \u01ca\n \3 \3 \3"+
		" \3 \3!\6!\u01d1\n!\r!\16!\u01d2\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\5\6\2\62;C\\a"+
		"ac|\b\2--/\60\62;C\\aac|\5\2\13\f\17\17\"\"\u01ef\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\3O\3\2\2\2\5]\3\2\2\2\7g\3\2\2\2\tu\3\2\2\2\13\177\3"+
		"\2\2\2\r\u008d\3\2\2\2\17\u0093\3\2\2\2\21\u00a9\3\2\2\2\23\u00bf\3\2"+
		"\2\2\25\u00d3\3\2\2\2\27\u00e3\3\2\2\2\31\u00ef\3\2\2\2\33\u0105\3\2\2"+
		"\2\35\u011d\3\2\2\2\37\u0137\3\2\2\2!\u0153\3\2\2\2#\u0165\3\2\2\2%\u017b"+
		"\3\2\2\2\'\u018f\3\2\2\2)\u01a5\3\2\2\2+\u01ab\3\2\2\2-\u01ad\3\2\2\2"+
		"/\u01b0\3\2\2\2\61\u01b4\3\2\2\2\63\u01b6\3\2\2\2\65\u01b8\3\2\2\2\67"+
		"\u01ba\3\2\2\29\u01bc\3\2\2\2;\u01bf\3\2\2\2=\u01c4\3\2\2\2?\u01c9\3\2"+
		"\2\2A\u01d0\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7u\2\2FG\7g\2\2GH\7t\2\2HP\7v"+
		"\2\2IJ\7K\2\2JK\7P\2\2KL\7U\2\2LM\7G\2\2MN\7T\2\2NP\7V\2\2OC\3\2\2\2O"+
		"I\3\2\2\2P\4\3\2\2\2QR\7w\2\2RS\7r\2\2ST\7u\2\2TU\7g\2\2UV\7t\2\2V^\7"+
		"v\2\2WX\7W\2\2XY\7R\2\2YZ\7U\2\2Z[\7G\2\2[\\\7T\2\2\\^\7V\2\2]Q\3\2\2"+
		"\2]W\3\2\2\2^\6\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2bh\7q\2\2cd\7K\2\2d"+
		"e\7P\2\2ef\7V\2\2fh\7Q\2\2g_\3\2\2\2gc\3\2\2\2h\b\3\2\2\2ij\7u\2\2jk\7"+
		"g\2\2kl\7n\2\2lm\7g\2\2mn\7e\2\2nv\7v\2\2op\7U\2\2pq\7G\2\2qr\7N\2\2r"+
		"s\7G\2\2st\7E\2\2tv\7V\2\2ui\3\2\2\2uo\3\2\2\2v\n\3\2\2\2wx\7h\2\2xy\7"+
		"t\2\2yz\7q\2\2z\u0080\7o\2\2{|\7H\2\2|}\7T\2\2}~\7Q\2\2~\u0080\7O\2\2"+
		"\177w\3\2\2\2\177{\3\2\2\2\u0080\f\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7i\2\2\u0083\u0084\7p\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086"+
		"\u008e\7g\2\2\u0087\u0088\7K\2\2\u0088\u0089\7I\2\2\u0089\u008a\7P\2\2"+
		"\u008a\u008b\7Q\2\2\u008b\u008c\7T\2\2\u008c\u008e\7G\2\2\u008d\u0081"+
		"\3\2\2\2\u008d\u0087\3\2\2\2\u008e\16\3\2\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0094\7u\2\2\u0091\u0092\7C\2\2\u0092\u0094\7U\2\2\u0093\u008f\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\20\3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u0098\7v\2\2\u0098\u0099\7q\2\2\u0099\u009a\7e\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7v\2\2"+
		"\u009e\u00aa\7g\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7W\2\2\u00a1\u00a2"+
		"\7V\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7T\2\2\u00a5"+
		"\u00a6\7G\2\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7V\2\2\u00a8\u00aa\7G\2\2"+
		"\u00a9\u0095\3\2\2\2\u00a9\u009f\3\2\2\2\u00aa\22\3\2\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7n\2\2"+
		"\u00b3\u00b4\7x\2\2\u00b4\u00c0\7g\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7"+
		"\7W\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba\7G\2\2\u00ba"+
		"\u00bb\7X\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7N\2\2\u00bd\u00be\7X\2\2"+
		"\u00be\u00c0\7G\2\2\u00bf\u00ab\3\2\2\2\u00bf\u00b5\3\2\2\2\u00c0\24\3"+
		"\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7w\2\2\u00c4"+
		"\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\u00c9\7d\2\2\u00c9\u00d4\7{\2\2\u00ca\u00cb\7E\2\2\u00cb\u00cc"+
		"\7N\2\2\u00cc\u00cd\7W\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7V\2\2\u00cf"+
		"\u00d0\7G\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7D\2\2\u00d2\u00d4\7[\2\2"+
		"\u00d3\u00c1\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d4\26\3\2\2\2\u00d5\u00d6"+
		"\7d\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7m\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db\u00e4\7u\2\2\u00dc\u00dd\7D\2\2"+
		"\u00dd\u00de\7W\2\2\u00de\u00df\7E\2\2\u00df\u00e0\7M\2\2\u00e0\u00e1"+
		"\7G\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e4\7U\2\2\u00e3\u00d5\3\2\2\2\u00e3"+
		"\u00dc\3\2\2\2\u00e4\30\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7\u00e8\7v\2\2\u00e8\u00e9\7e\2\2\u00e9\u00f0\7j\2\2\u00ea\u00eb"+
		"\7D\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7E\2\2\u00ee"+
		"\u00f0\7J\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\32\3\2\2\2"+
		"\u00f1\u00f2\7e\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7|\2\2\u00fa\u0106\7g\2\2\u00fb\u00fc\7E\2\2"+
		"\u00fc\u00fd\7C\2\2\u00fd\u00fe\7R\2\2\u00fe\u00ff\7K\2\2\u00ff\u0100"+
		"\7V\2\2\u0100\u0101\7C\2\2\u0101\u0102\7N\2\2\u0102\u0103\7K\2\2\u0103"+
		"\u0104\7\\\2\2\u0104\u0106\7G\2\2\u0105\u00f1\3\2\2\2\u0105\u00fb\3\2"+
		"\2\2\u0106\34\3\2\2\2\u0107\u0108\7r\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7v\2\2\u010b\u010c\7k\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7d\2\2"+
		"\u0111\u011e\7{\2\2\u0112\u0113\7R\2\2\u0113\u0114\7C\2\2\u0114\u0115"+
		"\7T\2\2\u0115\u0116\7V\2\2\u0116\u0117\7K\2\2\u0117\u0118\7V\2\2\u0118"+
		"\u0119\7K\2\2\u0119\u011a\7Q\2\2\u011a\u011b\7P\2\2\u011b\u011c\7D\2\2"+
		"\u011c\u011e\7[\2\2\u011d\u0107\3\2\2\2\u011d\u0112\3\2\2\2\u011e\36\3"+
		"\2\2\2\u011f\u0120\7f\2\2\u0120\u0121\7k\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7v\2\2\u0123\u0124\7t\2\2\u0124\u0125\7k\2\2\u0125\u0126\7d\2\2"+
		"\u0126\u0127\7w\2\2\u0127\u0128\7v\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\7d\2\2\u012a\u0138\7{\2\2\u012b\u012c\7F\2\2\u012c\u012d\7K\2\2\u012d"+
		"\u012e\7U\2\2\u012e\u012f\7V\2\2\u012f\u0130\7T\2\2\u0130\u0131\7K\2\2"+
		"\u0131\u0132\7D\2\2\u0132\u0133\7W\2\2\u0133\u0134\7V\2\2\u0134\u0135"+
		"\7G\2\2\u0135\u0136\7D\2\2\u0136\u0138\7[\2\2\u0137\u011f\3\2\2\2\u0137"+
		"\u012b\3\2\2\2\u0138 \3\2\2\2\u0139\u013a\7y\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7v\2\2\u013c\u013d\7j\2\2\u013d\u013e\7v\2\2\u013e\u013f\7k\2\2"+
		"\u013f\u0140\7o\2\2\u0140\u0141\7g\2\2\u0141\u0142\7u\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7c\2\2\u0144\u0145\7o\2\2\u0145\u0154\7r\2\2\u0146"+
		"\u0147\7Y\2\2\u0147\u0148\7K\2\2\u0148\u0149\7V\2\2\u0149\u014a\7J\2\2"+
		"\u014a\u014b\7V\2\2\u014b\u014c\7K\2\2\u014c\u014d\7O\2\2\u014d\u014e"+
		"\7G\2\2\u014e\u014f\7U\2\2\u014f\u0150\7V\2\2\u0150\u0151\7C\2\2\u0151"+
		"\u0152\7O\2\2\u0152\u0154\7R\2\2\u0153\u0139\3\2\2\2\u0153\u0146\3\2\2"+
		"\2\u0154\"\3\2\2\2\u0155\u0156\7u\2\2\u0156\u0157\7v\2\2\u0157\u0158\7"+
		"q\2\2\u0158\u0159\7t\2\2\u0159\u015a\7g\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7c\2\2\u015c\u0166\7u\2\2\u015d\u015e\7U\2\2\u015e\u015f\7V\2\2\u015f"+
		"\u0160\7Q\2\2\u0160\u0161\7T\2\2\u0161\u0162\7G\2\2\u0162\u0163\7F\2\2"+
		"\u0163\u0164\7C\2\2\u0164\u0166\7U\2\2\u0165\u0155\3\2\2\2\u0165\u015d"+
		"\3\2\2\2\u0166$\3\2\2\2\u0167\u0168\7u\2\2\u0168\u0169\7{\2\2\u0169\u016a"+
		"\7u\2\2\u016a\u016b\7a\2\2\u016b\u016c\7v\2\2\u016c\u016d\7k\2\2\u016d"+
		"\u016e\7o\2\2\u016e\u016f\7g\2\2\u016f\u0170\7*\2\2\u0170\u017c\7+\2\2"+
		"\u0171\u0172\7U\2\2\u0172\u0173\7[\2\2\u0173\u0174\7U\2\2\u0174\u0175"+
		"\7a\2\2\u0175\u0176\7V\2\2\u0176\u0177\7K\2\2\u0177\u0178\7O\2\2\u0178"+
		"\u0179\7G\2\2\u0179\u017a\7*\2\2\u017a\u017c\7+\2\2\u017b\u0167\3\2\2"+
		"\2\u017b\u0171\3\2\2\2\u017c&\3\2\2\2\u017d\u017e\7y\2\2\u017e\u017f\7"+
		"k\2\2\u017f\u0180\7v\2\2\u0180\u0181\7j\2\2\u0181\u0182\7i\2\2\u0182\u0183"+
		"\7t\2\2\u0183\u0184\7q\2\2\u0184\u0185\7w\2\2\u0185\u0190\7r\2\2\u0186"+
		"\u0187\7Y\2\2\u0187\u0188\7K\2\2\u0188\u0189\7V\2\2\u0189\u018a\7J\2\2"+
		"\u018a\u018b\7I\2\2\u018b\u018c\7T\2\2\u018c\u018d\7Q\2\2\u018d\u018e"+
		"\7W\2\2\u018e\u0190\7R\2\2\u018f\u017d\3\2\2\2\u018f\u0186\3\2\2\2\u0190"+
		"(\3\2\2\2\u0191\u0192\7y\2\2\u0192\u0193\7k\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7j\2\2\u0195\u0196\7q\2\2\u0196\u0197\7h\2\2\u0197\u0198\7h\2\2"+
		"\u0198\u0199\7u\2\2\u0199\u019a\7g\2\2\u019a\u01a6\7v\2\2\u019b\u019c"+
		"\7Y\2\2\u019c\u019d\7K\2\2\u019d\u019e\7V\2\2\u019e\u019f\7J\2\2\u019f"+
		"\u01a0\7Q\2\2\u01a0\u01a1\7H\2\2\u01a1\u01a2\7H\2\2\u01a2\u01a3\7U\2\2"+
		"\u01a3\u01a4\7G\2\2\u01a4\u01a6\7V\2\2\u01a5\u0191\3\2\2\2\u01a5\u019b"+
		"\3\2\2\2\u01a6*\3\2\2\2\u01a7\u01a8\7r\2\2\u01a8\u01ac\7m\2\2\u01a9\u01aa"+
		"\7R\2\2\u01aa\u01ac\7M\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		",\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae.\3\2\2\2\u01af\u01b1\4\62;\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\60\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5\62\3\2\2\2\u01b6\u01b7"+
		"\7.\2\2\u01b7\64\3\2\2\2\u01b8\u01b9\7\60\2\2\u01b9\66\3\2\2\2\u01ba\u01bb"+
		"\7*\2\2\u01bb8\3\2\2\2\u01bc\u01bd\7+\2\2\u01bd:\3\2\2\2\u01be\u01c0\t"+
		"\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2<\3\2\2\2\u01c3\u01c5\t\3\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7>\3"+
		"\2\2\2\u01c8\u01ca\7\17\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\7\f\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\b "+
		"\2\2\u01ce@\3\2\2\2\u01cf\u01d1\t\4\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\b!\2\2\u01d5B\3\2\2\2\35\2O]gu\177\u008d\u0093\u00a9\u00bf\u00d3"+
		"\u00e3\u00ef\u0105\u011d\u0137\u0153\u0165\u017b\u018f\u01a5\u01ab\u01b2"+
		"\u01c1\u01c6\u01c9\u01d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}