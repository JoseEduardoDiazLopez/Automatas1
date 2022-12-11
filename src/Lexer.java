// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

    
  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\6\0\1\6\1\7\1\10\4\0\1\11\1\12"+
    "\1\13\10\14\2\0\1\15\1\0\1\16\1\0\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\2\32\1\46"+
    "\1\47\4\0\1\32\1\0\1\50\1\32\1\51\1\52"+
    "\1\53\1\54\2\32\1\55\2\32\1\56\1\32\1\57"+
    "\1\60\2\32\1\61\1\62\1\63\1\32\1\64\4\32"+
    "\12\0\1\3\73\0\1\32\7\0\1\32\3\0\1\32"+
    "\3\0\1\32\1\0\1\32\6\0\1\32\1\0\1\32"+
    "\4\0\1\32\7\0\1\32\3\0\1\32\3\0\1\32"+
    "\1\0\1\32\6\0\1\32\1\0\1\32\u012b\0\2\3"+
    "\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\1\2\3\4\1\2\4\7\1"+
    "\1\5\1\1\2\4\2\1\1\6\1\7\1\2\1\10"+
    "\1\0\1\11\1\12\2\13\1\14\34\0\1\15\6\0"+
    "\1\16\2\0\1\17\4\0\1\20\1\21\1\22\3\0"+
    "\1\23\4\0\1\2\1\0\1\24\3\0\1\25\3\0"+
    "\1\24\1\0\1\26\1\27\3\0\1\24\5\0\1\30"+
    "\1\0\1\31\1\0\1\32\1\33\4\0\1\34\6\0"+
    "\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\65\0\152\0\237\0\324\0\u0109\0\u013e"+
    "\0\u0173\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u03ba\0\u0459"+
    "\0\u03ba\0\u048e\0\u04c3\0\u04f8\0\u03ba\0\u03ba\0\u052d\0\65"+
    "\0\u0562\0\u013e\0\65\0\u0597\0\u05cc\0\u0601\0\u0636\0\u03ba"+
    "\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9\0\u07de"+
    "\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986"+
    "\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e"+
    "\0\u0b63\0\u0b98\0\65\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1"+
    "\0\u0cd6\0\u03ba\0\u0d0b\0\u0d40\0\u03ba\0\u0d75\0\u0daa\0\u0ddf"+
    "\0\u0e14\0\u0e49\0\u03ba\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u03ba"+
    "\0\u0f52\0\u0f87\0\u0fbc\0\u0ff1\0\u0b63\0\u1026\0\u105b\0\u1090"+
    "\0\u10c5\0\u10fa\0\u112f\0\u1164\0\u1199\0\u11ce\0\u1203\0\u1238"+
    "\0\u03ba\0\u03ba\0\u126d\0\u12a2\0\u12d7\0\u03ba\0\u130c\0\u1341"+
    "\0\u1376\0\u13ab\0\u13e0\0\u03ba\0\u1415\0\u03ba\0\u144a\0\u03ba"+
    "\0\u03ba\0\u147f\0\u14b4\0\u14e9\0\u151e\0\u03ba\0\u1553\0\u1588"+
    "\0\u15bd\0\u15f2\0\u1627\0\u165c\0\u03ba";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\2\1\6\1\2"+
    "\1\7\1\10\2\11\1\12\1\2\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\4\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\2\24\1\34"+
    "\1\35\1\31\4\24\1\36\7\24\1\36\67\0\1\3"+
    "\67\0\1\37\75\0\1\40\56\0\1\41\66\0\3\42"+
    "\62\0\3\11\56\0\1\43\70\0\1\44\2\45\3\0"+
    "\45\46\6\0\1\47\3\0\3\50\3\0\14\50\1\51"+
    "\12\50\1\52\15\50\6\0\1\47\3\0\3\50\3\0"+
    "\13\50\1\53\31\50\6\0\1\47\3\0\3\50\3\0"+
    "\1\54\6\50\1\55\25\50\1\56\2\50\1\57\4\50"+
    "\6\0\1\47\3\0\3\50\3\0\10\50\1\60\22\50"+
    "\1\61\11\50\6\0\1\47\3\0\3\50\3\0\15\50"+
    "\1\62\2\50\1\63\21\50\1\64\2\50\6\0\1\47"+
    "\3\0\3\50\3\0\24\50\1\65\20\50\6\0\1\47"+
    "\3\0\3\50\3\0\21\50\1\66\23\50\6\0\1\47"+
    "\3\0\3\50\3\0\30\50\1\67\14\50\6\0\1\47"+
    "\3\0\3\50\3\0\45\50\6\0\1\47\3\0\3\50"+
    "\3\0\1\70\3\50\1\71\30\50\1\72\7\50\6\0"+
    "\1\47\3\0\3\50\3\0\1\73\3\50\1\74\40\50"+
    "\6\0\1\47\3\0\3\50\3\0\16\50\1\75\26\50"+
    "\6\0\1\47\3\0\3\50\3\0\16\50\1\76\26\50"+
    "\6\0\1\47\3\0\3\50\3\0\27\50\1\31\15\50"+
    "\6\0\1\47\3\0\3\50\3\0\4\50\1\77\11\50"+
    "\1\100\26\50\2\37\1\3\1\37\1\4\60\37\10\101"+
    "\1\102\54\101\20\0\45\44\12\0\3\45\3\0\45\44"+
    "\12\0\3\46\3\0\45\46\7\0\1\103\63\0\1\47"+
    "\3\0\3\50\3\0\1\104\44\50\6\0\1\47\3\0"+
    "\3\50\3\0\24\50\1\105\20\50\6\0\1\47\3\0"+
    "\3\50\3\0\1\106\44\50\6\0\1\47\3\0\3\50"+
    "\3\0\3\50\1\31\41\50\6\0\1\47\3\0\3\50"+
    "\3\0\1\107\44\50\6\0\1\47\3\0\3\50\3\0"+
    "\31\50\1\110\13\50\6\0\1\47\3\0\3\50\3\0"+
    "\37\50\1\111\5\50\6\0\1\47\3\0\3\50\3\0"+
    "\5\50\1\112\37\50\6\0\1\47\3\0\3\50\3\0"+
    "\44\50\1\113\6\0\1\47\3\0\3\50\3\0\23\50"+
    "\1\114\21\50\6\0\1\47\3\0\3\50\3\0\24\50"+
    "\1\115\20\50\6\0\1\47\3\0\3\50\3\0\43\50"+
    "\1\116\1\50\6\0\1\47\3\0\3\50\3\0\22\50"+
    "\1\117\22\50\6\0\1\47\3\0\3\50\3\0\10\50"+
    "\1\120\34\50\6\0\1\47\3\0\3\50\3\0\31\50"+
    "\1\121\13\50\6\0\1\47\3\0\3\50\3\0\22\50"+
    "\1\122\3\50\1\123\16\50\6\0\1\47\3\0\3\50"+
    "\3\0\15\50\1\124\27\50\6\0\1\47\3\0\3\50"+
    "\3\0\33\50\1\125\11\50\6\0\1\47\3\0\3\50"+
    "\3\0\21\50\1\126\23\50\6\0\1\47\3\0\3\50"+
    "\3\0\6\50\1\127\36\50\6\0\1\47\3\0\3\50"+
    "\3\0\21\50\1\130\23\50\6\0\1\47\3\0\3\50"+
    "\3\0\11\50\1\131\10\50\1\132\22\50\6\0\1\47"+
    "\3\0\3\50\3\0\21\50\1\133\23\50\6\0\1\47"+
    "\3\0\3\50\3\0\5\50\1\31\37\50\10\101\1\134"+
    "\64\101\1\134\1\135\53\101\6\0\1\47\3\0\3\50"+
    "\3\0\21\50\1\136\23\50\6\0\1\47\3\0\3\50"+
    "\3\0\13\50\1\137\31\50\6\0\1\47\3\0\3\50"+
    "\3\0\15\50\1\140\27\50\6\0\1\47\3\0\3\50"+
    "\3\0\15\50\1\141\27\50\6\0\1\47\3\0\3\50"+
    "\3\0\36\50\1\142\6\50\6\0\1\47\3\0\3\50"+
    "\3\0\32\50\1\143\12\50\6\0\1\47\3\0\3\50"+
    "\3\0\40\50\1\144\4\50\6\0\1\47\3\0\3\50"+
    "\3\0\21\50\1\145\23\50\6\0\1\47\3\0\3\50"+
    "\3\0\33\50\1\36\11\50\6\0\1\47\3\0\3\50"+
    "\3\0\2\50\1\146\42\50\6\0\1\47\3\0\3\50"+
    "\3\0\22\50\1\147\22\50\6\0\1\47\3\0\3\50"+
    "\3\0\33\50\1\150\11\50\6\0\1\47\3\0\1\50"+
    "\1\151\1\50\3\0\45\50\6\0\1\47\3\0\1\50"+
    "\1\152\1\50\3\0\16\50\1\153\26\50\6\0\1\47"+
    "\3\0\3\50\3\0\37\50\1\154\5\50\6\0\1\47"+
    "\3\0\3\50\3\0\1\155\44\50\6\0\1\47\3\0"+
    "\3\50\3\0\21\50\1\131\23\50\6\0\1\47\3\0"+
    "\3\50\3\0\16\50\1\156\26\50\6\0\1\47\3\0"+
    "\3\50\3\0\1\156\44\50\6\0\1\47\3\0\3\50"+
    "\3\0\3\50\1\157\41\50\10\101\1\134\1\3\53\101"+
    "\6\0\1\47\3\0\3\50\3\0\10\50\1\160\34\50"+
    "\6\0\1\47\3\0\3\50\3\0\23\50\1\161\21\50"+
    "\6\0\1\47\3\0\3\50\3\0\2\50\1\131\42\50"+
    "\6\0\1\47\3\0\3\50\3\0\6\50\1\162\36\50"+
    "\6\0\1\47\3\0\3\50\3\0\30\50\1\163\14\50"+
    "\6\0\1\47\3\0\3\50\3\0\42\50\1\164\2\50"+
    "\6\0\1\47\3\0\3\50\3\0\36\50\1\165\6\50"+
    "\6\0\1\47\3\0\3\50\3\0\4\50\1\166\40\50"+
    "\6\0\1\47\3\0\3\50\3\0\10\50\1\132\34\50"+
    "\6\0\1\47\3\0\3\50\3\0\2\50\1\167\42\50"+
    "\6\0\1\47\3\0\3\50\3\0\41\50\1\170\3\50"+
    "\6\0\1\47\3\0\3\50\3\0\22\50\1\171\22\50"+
    "\6\0\1\47\3\0\3\50\3\0\43\50\1\172\1\50"+
    "\6\0\1\47\3\0\3\50\3\0\15\50\1\173\27\50"+
    "\6\0\1\47\3\0\3\50\3\0\4\50\1\156\40\50"+
    "\6\0\1\47\3\0\3\50\3\0\13\50\1\174\31\50"+
    "\6\0\1\47\3\0\3\50\3\0\24\50\1\175\20\50"+
    "\6\0\1\47\3\0\3\50\3\0\4\50\1\36\40\50"+
    "\6\0\1\47\3\0\3\50\3\0\41\50\1\176\3\50"+
    "\6\0\1\47\3\0\3\50\3\0\44\50\1\177\6\0"+
    "\1\47\3\0\3\50\3\0\13\50\1\200\31\50\6\0"+
    "\1\47\3\0\3\50\3\0\41\50\1\201\3\50\6\0"+
    "\1\47\3\0\3\50\3\0\11\50\1\132\33\50\6\0"+
    "\1\47\3\0\3\50\3\0\13\50\1\131\31\50\6\0"+
    "\1\47\3\0\3\50\3\0\21\50\1\202\23\50\6\0"+
    "\1\47\3\0\3\50\3\0\33\50\1\203\11\50\6\0"+
    "\1\47\3\0\3\50\3\0\1\127\44\50\6\0\1\47"+
    "\3\0\3\50\3\0\30\50\1\204\14\50\6\0\1\47"+
    "\3\0\3\50\3\0\20\50\1\156\24\50\6\0\1\47"+
    "\3\0\3\50\3\0\41\50\1\36\3\50\6\0\1\47"+
    "\3\0\3\50\3\0\42\50\1\205\2\50";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5777];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\34\1\1\11\1\0\1\1\1\11\3\1"+
    "\34\0\1\11\6\0\1\1\2\0\1\1\4\0\3\1"+
    "\3\0\1\1\4\0\1\1\1\0\1\1\3\0\1\1"+
    "\3\0\1\1\1\0\2\1\3\0\1\1\5\0\1\1"+
    "\1\0\1\1\1\0\2\1\4\0\1\1\6\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[133];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "Error", yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 31: break;
          case 3:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 32: break;
          case 4:
            { return token(yytext(), "Tipo_De_Dato", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 5:
            { return token(yytext(), "OPERADOR_OR", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 6:
            { return token(yytext(), "OPERADOR_AND", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 7:
            { return token(yytext(), "PALABRA_RESERVADA", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 8:
            { return token(yytext(), "LLAVE_CERRADA", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 9:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 10:
            { return token(yytext(), "LLAVE_ABIERTA", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 11:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 12:
            { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 13:
            { return token(yytext(), "FUNCION", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 14:
            { return token(yytext(), "OPERADOR_DIFERENTEQUE", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 15:
            { return token(yytext(), "OPERADOR_ASIGNACION", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 16:
            { return token(yytext(), "OPERADOR_MAS", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 17:
            { return token(yytext(), "OPERADOR_MAYORQUE", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 18:
            { return token(yytext(), "OPERADOR_MENORQUE", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 19:
            { return token(yytext(), "OPERADOR_MULTIPLICAR", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 20:
            { return token(yytext(), "COLOR", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 21:
            { return token(yytext(), "INICIO_CONDICIONAL", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 22:
            { return token(yytext(), "OPERADOR_INCREMENTO", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 23:
            { return token(yytext(), "OPERADOR_DECREMENTO", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 24:
            { return token(yytext(), "SEGUIR_CONDICIONAL", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 25:
            { return token(yytext(), "OPERADOR_DIVIDIR", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 26:
            { return token(yytext(), "CICLO_DOWHILE", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 27:
            { return token(yytext(), "OPERADOR_MENOS", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 28:
            { return token(yytext(), "CICLO_FOR", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 29:
            { return token(yytext(), "CICLO_WHILE", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
