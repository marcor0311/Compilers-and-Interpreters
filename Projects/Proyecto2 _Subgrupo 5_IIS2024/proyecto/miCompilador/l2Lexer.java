// Generated from l2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class l2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, WS=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "T__82", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
			"'for'", "'print'", "'='", "'-'", "'+'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'<>'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", 
			"'6'", "'7'", "'8'", "'9'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", 
			"'g'", "'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", 
			"'q'", "'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", 
			"'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", 
			"'K'", "'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", 
			"'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS"
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


	public l2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "l2.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000T\u0168\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007"+
		"S\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001"+
		"C\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001"+
		"H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001"+
		"M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001S\u0004S\u0163\bS\u000bS\fS\u0164\u0001S\u0001S\u0000\u0000T\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083"+
		"B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097"+
		"L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u0001\u0000"+
		"\u0001\u0003\u0000\t\n\r\r  \u0168\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000"+
		"\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000"+
		"e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001"+
		"\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000"+
		"\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000"+
		"s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001"+
		"\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000"+
		"\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000"+
		"\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000"+
		"\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000"+
		"\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000"+
		"\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000"+
		"\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000\u0000"+
		"\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001\u0000\u0000\u0000"+
		"\u0000\u0099\u0001\u0000\u0000\u0000\u0000\u009b\u0001\u0000\u0000\u0000"+
		"\u0000\u009d\u0001\u0000\u0000\u0000\u0000\u009f\u0001\u0000\u0000\u0000"+
		"\u0000\u00a1\u0001\u0000\u0000\u0000\u0000\u00a3\u0001\u0000\u0000\u0000"+
		"\u0000\u00a5\u0001\u0000\u0000\u0000\u0000\u00a7\u0001\u0000\u0000\u0000"+
		"\u0001\u00a9\u0001\u0000\u0000\u0000\u0003\u00ab\u0001\u0000\u0000\u0000"+
		"\u0005\u00ae\u0001\u0000\u0000\u0000\u0007\u00b0\u0001\u0000\u0000\u0000"+
		"\t\u00b2\u0001\u0000\u0000\u0000\u000b\u00b4\u0001\u0000\u0000\u0000\r"+
		"\u00b6\u0001\u0000\u0000\u0000\u000f\u00bb\u0001\u0000\u0000\u0000\u0011"+
		"\u00c1\u0001\u0000\u0000\u0000\u0013\u00c5\u0001\u0000\u0000\u0000\u0015"+
		"\u00cb\u0001\u0000\u0000\u0000\u0017\u00cd\u0001\u0000\u0000\u0000\u0019"+
		"\u00cf\u0001\u0000\u0000\u0000\u001b\u00d1\u0001\u0000\u0000\u0000\u001d"+
		"\u00d3\u0001\u0000\u0000\u0000\u001f\u00d5\u0001\u0000\u0000\u0000!\u00d7"+
		"\u0001\u0000\u0000\u0000#\u00d9\u0001\u0000\u0000\u0000%\u00dc\u0001\u0000"+
		"\u0000\u0000\'\u00df\u0001\u0000\u0000\u0000)\u00e2\u0001\u0000\u0000"+
		"\u0000+\u00e5\u0001\u0000\u0000\u0000-\u00e7\u0001\u0000\u0000\u0000/"+
		"\u00e9\u0001\u0000\u0000\u00001\u00eb\u0001\u0000\u0000\u00003\u00ed\u0001"+
		"\u0000\u0000\u00005\u00ef\u0001\u0000\u0000\u00007\u00f1\u0001\u0000\u0000"+
		"\u00009\u00f3\u0001\u0000\u0000\u0000;\u00f5\u0001\u0000\u0000\u0000="+
		"\u00f7\u0001\u0000\u0000\u0000?\u00f9\u0001\u0000\u0000\u0000A\u00fb\u0001"+
		"\u0000\u0000\u0000C\u00fd\u0001\u0000\u0000\u0000E\u00ff\u0001\u0000\u0000"+
		"\u0000G\u0101\u0001\u0000\u0000\u0000I\u0103\u0001\u0000\u0000\u0000K"+
		"\u0105\u0001\u0000\u0000\u0000M\u0107\u0001\u0000\u0000\u0000O\u0109\u0001"+
		"\u0000\u0000\u0000Q\u010b\u0001\u0000\u0000\u0000S\u010d\u0001\u0000\u0000"+
		"\u0000U\u010f\u0001\u0000\u0000\u0000W\u0111\u0001\u0000\u0000\u0000Y"+
		"\u0113\u0001\u0000\u0000\u0000[\u0115\u0001\u0000\u0000\u0000]\u0117\u0001"+
		"\u0000\u0000\u0000_\u0119\u0001\u0000\u0000\u0000a\u011b\u0001\u0000\u0000"+
		"\u0000c\u011d\u0001\u0000\u0000\u0000e\u011f\u0001\u0000\u0000\u0000g"+
		"\u0121\u0001\u0000\u0000\u0000i\u0123\u0001\u0000\u0000\u0000k\u0125\u0001"+
		"\u0000\u0000\u0000m\u0127\u0001\u0000\u0000\u0000o\u0129\u0001\u0000\u0000"+
		"\u0000q\u012b\u0001\u0000\u0000\u0000s\u012d\u0001\u0000\u0000\u0000u"+
		"\u012f\u0001\u0000\u0000\u0000w\u0131\u0001\u0000\u0000\u0000y\u0133\u0001"+
		"\u0000\u0000\u0000{\u0135\u0001\u0000\u0000\u0000}\u0137\u0001\u0000\u0000"+
		"\u0000\u007f\u0139\u0001\u0000\u0000\u0000\u0081\u013b\u0001\u0000\u0000"+
		"\u0000\u0083\u013d\u0001\u0000\u0000\u0000\u0085\u013f\u0001\u0000\u0000"+
		"\u0000\u0087\u0141\u0001\u0000\u0000\u0000\u0089\u0143\u0001\u0000\u0000"+
		"\u0000\u008b\u0145\u0001\u0000\u0000\u0000\u008d\u0147\u0001\u0000\u0000"+
		"\u0000\u008f\u0149\u0001\u0000\u0000\u0000\u0091\u014b\u0001\u0000\u0000"+
		"\u0000\u0093\u014d\u0001\u0000\u0000\u0000\u0095\u014f\u0001\u0000\u0000"+
		"\u0000\u0097\u0151\u0001\u0000\u0000\u0000\u0099\u0153\u0001\u0000\u0000"+
		"\u0000\u009b\u0155\u0001\u0000\u0000\u0000\u009d\u0157\u0001\u0000\u0000"+
		"\u0000\u009f\u0159\u0001\u0000\u0000\u0000\u00a1\u015b\u0001\u0000\u0000"+
		"\u0000\u00a3\u015d\u0001\u0000\u0000\u0000\u00a5\u015f\u0001\u0000\u0000"+
		"\u0000\u00a7\u0162\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005;\u0000\u0000"+
		"\u00aa\u0002\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005i\u0000\u0000\u00ac"+
		"\u00ad\u0005f\u0000\u0000\u00ad\u0004\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005(\u0000\u0000\u00af\u0006\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		")\u0000\u0000\u00b1\b\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005{\u0000"+
		"\u0000\u00b3\n\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005}\u0000\u0000"+
		"\u00b5\f\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7"+
		"\u00b8\u0005l\u0000\u0000\u00b8\u00b9\u0005s\u0000\u0000\u00b9\u00ba\u0005"+
		"e\u0000\u0000\u00ba\u000e\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005w\u0000"+
		"\u0000\u00bc\u00bd\u0005h\u0000\u0000\u00bd\u00be\u0005i\u0000\u0000\u00be"+
		"\u00bf\u0005l\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u0010\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005f\u0000\u0000\u00c2\u00c3\u0005o\u0000"+
		"\u0000\u00c3\u00c4\u0005r\u0000\u0000\u00c4\u0012\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005p\u0000\u0000\u00c6\u00c7\u0005r\u0000\u0000\u00c7\u00c8"+
		"\u0005i\u0000\u0000\u00c8\u00c9\u0005n\u0000\u0000\u00c9\u00ca\u0005t"+
		"\u0000\u0000\u00ca\u0014\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005=\u0000"+
		"\u0000\u00cc\u0016\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005-\u0000\u0000"+
		"\u00ce\u0018\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005+\u0000\u0000\u00d0"+
		"\u001a\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005*\u0000\u0000\u00d2\u001c"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005/\u0000\u0000\u00d4\u001e\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005<\u0000\u0000\u00d6 \u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005>\u0000\u0000\u00d8\"\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005<\u0000\u0000\u00da\u00db\u0005=\u0000\u0000\u00db$"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005>\u0000\u0000\u00dd\u00de\u0005"+
		"=\u0000\u0000\u00de&\u0001\u0000\u0000\u0000\u00df\u00e0\u0005=\u0000"+
		"\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e1(\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005<\u0000\u0000\u00e3\u00e4\u0005>\u0000\u0000\u00e4*\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u00050\u0000\u0000\u00e6,\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u00051\u0000\u0000\u00e8.\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u00052\u0000\u0000\u00ea0\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"3\u0000\u0000\u00ec2\u0001\u0000\u0000\u0000\u00ed\u00ee\u00054\u0000"+
		"\u0000\u00ee4\u0001\u0000\u0000\u0000\u00ef\u00f0\u00055\u0000\u0000\u00f0"+
		"6\u0001\u0000\u0000\u0000\u00f1\u00f2\u00056\u0000\u0000\u00f28\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u00057\u0000\u0000\u00f4:\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u00058\u0000\u0000\u00f6<\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u00059\u0000\u0000\u00f8>\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"a\u0000\u0000\u00fa@\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005b\u0000"+
		"\u0000\u00fcB\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005c\u0000\u0000\u00fe"+
		"D\u0001\u0000\u0000\u0000\u00ff\u0100\u0005d\u0000\u0000\u0100F\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005e\u0000\u0000\u0102H\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005f\u0000\u0000\u0104J\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005g\u0000\u0000\u0106L\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"h\u0000\u0000\u0108N\u0001\u0000\u0000\u0000\u0109\u010a\u0005i\u0000"+
		"\u0000\u010aP\u0001\u0000\u0000\u0000\u010b\u010c\u0005j\u0000\u0000\u010c"+
		"R\u0001\u0000\u0000\u0000\u010d\u010e\u0005k\u0000\u0000\u010eT\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005l\u0000\u0000\u0110V\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005m\u0000\u0000\u0112X\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005n\u0000\u0000\u0114Z\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"o\u0000\u0000\u0116\\\u0001\u0000\u0000\u0000\u0117\u0118\u0005p\u0000"+
		"\u0000\u0118^\u0001\u0000\u0000\u0000\u0119\u011a\u0005q\u0000\u0000\u011a"+
		"`\u0001\u0000\u0000\u0000\u011b\u011c\u0005r\u0000\u0000\u011cb\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005s\u0000\u0000\u011ed\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005t\u0000\u0000\u0120f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005u\u0000\u0000\u0122h\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"v\u0000\u0000\u0124j\u0001\u0000\u0000\u0000\u0125\u0126\u0005w\u0000"+
		"\u0000\u0126l\u0001\u0000\u0000\u0000\u0127\u0128\u0005x\u0000\u0000\u0128"+
		"n\u0001\u0000\u0000\u0000\u0129\u012a\u0005y\u0000\u0000\u012ap\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005z\u0000\u0000\u012cr\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005A\u0000\u0000\u012et\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005B\u0000\u0000\u0130v\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"C\u0000\u0000\u0132x\u0001\u0000\u0000\u0000\u0133\u0134\u0005D\u0000"+
		"\u0000\u0134z\u0001\u0000\u0000\u0000\u0135\u0136\u0005E\u0000\u0000\u0136"+
		"|\u0001\u0000\u0000\u0000\u0137\u0138\u0005F\u0000\u0000\u0138~\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005G\u0000\u0000\u013a\u0080\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005H\u0000\u0000\u013c\u0082\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005I\u0000\u0000\u013e\u0084\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0005J\u0000\u0000\u0140\u0086\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005K\u0000\u0000\u0142\u0088\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005L\u0000\u0000\u0144\u008a\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"M\u0000\u0000\u0146\u008c\u0001\u0000\u0000\u0000\u0147\u0148\u0005N\u0000"+
		"\u0000\u0148\u008e\u0001\u0000\u0000\u0000\u0149\u014a\u0005O\u0000\u0000"+
		"\u014a\u0090\u0001\u0000\u0000\u0000\u014b\u014c\u0005P\u0000\u0000\u014c"+
		"\u0092\u0001\u0000\u0000\u0000\u014d\u014e\u0005Q\u0000\u0000\u014e\u0094"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0005R\u0000\u0000\u0150\u0096\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005S\u0000\u0000\u0152\u0098\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0005T\u0000\u0000\u0154\u009a\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005U\u0000\u0000\u0156\u009c\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0005V\u0000\u0000\u0158\u009e\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005W\u0000\u0000\u015a\u00a0\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005X\u0000\u0000\u015c\u00a2\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"Y\u0000\u0000\u015e\u00a4\u0001\u0000\u0000\u0000\u015f\u0160\u0005Z\u0000"+
		"\u0000\u0160\u00a6\u0001\u0000\u0000\u0000\u0161\u0163\u0007\u0000\u0000"+
		"\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0006S\u0000\u0000"+
		"\u0167\u00a8\u0001\u0000\u0000\u0000\u0002\u0000\u0164\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}