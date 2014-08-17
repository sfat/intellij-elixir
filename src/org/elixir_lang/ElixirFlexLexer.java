/* The following code was generated by JFlex 1.4.3 on 8/16/14 10:23 PM */

package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.psi.ElixirTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/16/14 10:23 PM from the specification file
 * <tt>/Users/luke.imhoff/git/KronicDeth/intellij-elixir/src/org/elixir_lang/Elixir.flex</tt>
 */
class ElixirFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START = 30;
  public static final int INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_BODY = 16;
  public static final int LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_BODY = 28;
  public static final int CHAR_LIST_HEREDOC_END = 6;
  public static final int INTERPOLATION = 24;
  public static final int CHAR_LIST_HEREDOC_LINE_START = 10;
  public static final int CHAR_LIST_HEREDOC_START = 12;
  public static final int INTERPOLATING_SIGIL = 22;
  public static final int INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_END = 14;
  public static final int STRING = 38;
  public static final int INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START = 18;
  public static final int SIGIL = 36;
  public static final int INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_START = 20;
  public static final int CHAR_LIST_HEREDOC_LINE_BODY = 8;
  public static final int CHAR_LIST = 4;
  public static final int LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_START = 32;
  public static final int BODY = 2;
  public static final int STRING_HEREDOC_LINE_BODY = 42;
  public static final int LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_END = 26;
  public static final int STRING_HEREDOC_START = 46;
  public static final int STRING_HEREDOC_LINE_START = 44;
  public static final int YYINITIAL = 0;
  public static final int LITERAL_SIGIL = 34;
  public static final int STRING_HEREDOC_END = 40;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12,  7,  7, 13, 13, 14, 14, 
    15, 15, 16, 16, 17, 17, 18, 18,  7,  7, 19, 19, 20, 20, 21, 21
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\16"+
    "\1\4\3\0\1\17\10\0\1\5\1\7\6\13\2\11\7\0\1\26"+
    "\1\6\4\26\21\25\1\10\2\25\1\0\1\27\4\0\1\24\1\22"+
    "\4\24\10\21\1\12\10\21\1\23\2\21\1\14\1\0\1\15\1\20"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\26\0\1\1\1\2\4\1\1\3\1\4\1\5\1\6"+
    "\1\3\1\7\1\10\1\11\3\12\1\13\1\12\1\0"+
    "\2\14\3\15\2\16\1\0\1\17\2\20\2\17\3\21"+
    "\2\22\1\3\1\23\2\24\3\25\2\26\1\3\1\27"+
    "\1\30\3\31\1\32\1\31\2\33\3\34\2\35\2\1"+
    "\5\0\2\6\1\36\5\0\1\37\1\0\1\40\20\0"+
    "\2\1\2\36\1\41\1\42\1\43\1\0\1\44\1\45"+
    "\1\0\1\46\1\47\1\0\1\50\1\51\1\0\1\52"+
    "\1\53\1\54\1\55\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
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
    "\0\0\0\30\0\60\0\110\0\140\0\170\0\220\0\250"+
    "\0\300\0\330\0\360\0\u0108\0\u0120\0\u0138\0\u0150\0\u0168"+
    "\0\u0180\0\u0198\0\u01b0\0\u01c8\0\u01e0\0\u01f8\0\u0210\0\u0228"+
    "\0\u0240\0\u0258\0\u0270\0\u0288\0\u0210\0\u02a0\0\u02b8\0\u02d0"+
    "\0\u02e8\0\u0300\0\u0318\0\u0210\0\u0210\0\u0330\0\u0348\0\u0210"+
    "\0\u0360\0\u0378\0\u0210\0\u0390\0\u0210\0\u03a8\0\u03c0\0\u0210"+
    "\0\u03d8\0\u03f0\0\u0210\0\u0210\0\u0408\0\u0348\0\u0360\0\u0210"+
    "\0\u0420\0\u0438\0\u0210\0\u0450\0\u0468\0\u0210\0\u0210\0\u0480"+
    "\0\u0210\0\u0498\0\u04b0\0\u0210\0\u04c8\0\u04e0\0\u0210\0\u0210"+
    "\0\u0210\0\u04f8\0\u0348\0\u0210\0\u0360\0\u0210\0\u0510\0\u0210"+
    "\0\u0528\0\u0540\0\u0210\0\u0558\0\u0570\0\u0588\0\u05a0\0\u05b8"+
    "\0\u0588\0\u05d0\0\u05e8\0\u0210\0\u0600\0\u0618\0\u0630\0\u0648"+
    "\0\u0618\0\u0660\0\u0678\0\u0210\0\u0690\0\u0210\0\u06a8\0\u03a8"+
    "\0\u06c0\0\u06d8\0\u06f0\0\u0420\0\u0708\0\u0720\0\u0738\0\u0498"+
    "\0\u0750\0\u0768\0\u0780\0\u0528\0\u0798\0\u07b0\0\u05a0\0\u05b8"+
    "\0\u0630\0\u0648\0\u0210\0\u0210\0\u0210\0\u07c8\0\u0210\0\u0210"+
    "\0\u07e0\0\u0210\0\u0210\0\u07f8\0\u0210\0\u0210\0\u0810\0\u0210"+
    "\0\u0210\0\u0210\0\u0210\0\u0210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
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
    "\1\27\3\30\1\31\1\32\10\27\1\33\1\34\10\27"+
    "\1\35\2\36\1\37\1\40\1\41\10\35\1\42\1\43"+
    "\1\44\7\35\2\45\1\46\1\45\1\47\12\45\1\50"+
    "\7\45\1\51\17\0\1\52\10\0\1\45\1\53\1\54"+
    "\1\45\1\47\22\45\1\51\1\55\1\0\1\55\1\56"+
    "\12\55\1\57\11\55\1\35\1\60\1\61\25\35\16\0"+
    "\1\62\11\0\1\63\1\64\1\65\1\63\1\66\22\63"+
    "\1\67\1\70\1\0\1\70\1\71\12\70\1\72\11\70"+
    "\1\35\1\73\1\74\26\35\1\0\14\35\1\75\12\35"+
    "\2\36\1\37\1\40\1\41\7\35\1\76\1\42\1\43"+
    "\1\44\7\35\1\63\1\77\1\100\25\63\1\101\1\0"+
    "\1\101\1\102\12\101\1\103\11\101\1\35\1\104\1\105"+
    "\26\35\1\0\14\35\1\106\12\35\1\0\4\35\1\107"+
    "\1\35\1\107\1\35\1\110\6\35\4\110\2\107\1\35"+
    "\2\111\1\112\1\111\1\113\11\111\1\114\10\111\1\115"+
    "\1\111\1\116\1\117\1\111\1\113\22\111\1\115\1\120"+
    "\1\0\1\120\1\121\12\120\1\122\11\120\1\35\1\123"+
    "\1\124\25\35\31\0\3\30\24\0\1\31\1\27\1\125"+
    "\25\31\5\0\1\126\1\127\1\126\1\130\1\0\1\131"+
    "\1\126\6\0\1\127\1\130\22\0\1\132\30\0\1\133"+
    "\11\0\3\36\27\0\1\37\24\0\1\40\1\134\1\135"+
    "\25\40\5\0\1\136\1\137\1\136\1\140\1\0\1\141"+
    "\1\136\6\0\1\137\1\140\22\0\1\142\30\0\1\143"+
    "\11\0\1\45\42\0\1\144\17\0\1\145\11\0\2\146"+
    "\27\0\1\147\11\0\1\53\31\0\1\150\13\0\1\151"+
    "\26\0\1\152\12\0\1\60\44\0\1\153\12\0\1\64"+
    "\31\0\1\154\12\0\1\155\27\0\1\156\12\0\1\73"+
    "\44\0\1\157\12\0\1\77\31\0\1\160\12\0\1\161"+
    "\27\0\1\162\12\0\1\104\44\0\1\163\12\0\1\111"+
    "\27\0\1\116\31\0\1\164\12\0\1\165\27\0\1\166"+
    "\12\0\1\123\27\0\1\27\33\0\1\126\1\0\1\126"+
    "\3\0\1\126\21\0\1\167\1\0\1\167\25\0\3\170"+
    "\1\0\1\170\1\0\1\170\6\0\1\170\1\0\1\170"+
    "\1\0\1\170\17\0\1\27\30\0\1\27\11\0\1\134"+
    "\33\0\1\136\1\0\1\136\3\0\1\136\21\0\1\171"+
    "\1\0\1\171\25\0\3\172\1\0\1\172\1\0\1\172"+
    "\6\0\1\172\1\0\1\172\1\0\1\172\17\0\1\173"+
    "\30\0\1\174\24\0\1\146\32\0\1\175\27\0\1\176"+
    "\26\0\1\177\27\0\1\200\27\0\1\201\27\0\1\202"+
    "\27\0\1\203\27\0\1\204\27\0\1\205\27\0\1\206"+
    "\27\0\1\207\27\0\1\210\30\0\1\211\26\0\1\212"+
    "\27\0\1\213\27\0\1\214\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2088];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\26\0\1\11\5\1\1\11\6\1\2\11\2\1\1\11"+
    "\1\1\1\0\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\1\0\2\11\3\1\1\11\2\1\1\11\2\1\2\11"+
    "\1\1\1\11\2\1\1\11\2\1\3\11\2\1\1\11"+
    "\1\1\1\11\1\1\1\11\2\1\1\11\3\1\5\0"+
    "\1\11\2\1\5\0\1\11\1\0\1\11\20\0\4\1"+
    "\3\11\1\0\2\11\1\0\2\11\1\0\2\11\1\0"+
    "\5\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private java.util.Stack<Integer> lexicalStateStack = new java.util.Stack<Integer>();

  private void callState(int nextLexicalState) {
    lexicalStateStack.push(yystate());
    yybegin(nextLexicalState);
  }

  private void handleInState(int nextLexicalState) {
    yypushback(yylength());
    yybegin(nextLexicalState);
  }

  private void returnFromState() {
    int previousLexicalState = lexicalStateStack.pop();
    yybegin(previousLexicalState);
  }


  ElixirFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ElixirFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 82) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { yybegin(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START);
                            return ElixirTypes.SIGIL_FRAGMENT;
          }
        case 47: break;
        case 11: 
          { returnFromState();
                           return ElixirTypes.SINGLE_QUOTE;
          }
        case 48: break;
        case 42: 
          { handleInState(STRING_HEREDOC_END);
          }
        case 49: break;
        case 31: 
          { callState(INTERPOLATION);
                            return ElixirTypes.INTERPOLATION_START;
          }
        case 50: break;
        case 33: 
          { callState(STRING_HEREDOC_START);
                                return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 51: break;
        case 37: 
          { returnFromState();
                           return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 52: break;
        case 5: 
          { return TokenType.WHITE_SPACE;
          }
        case 53: break;
        case 19: 
          { returnFromState();
                                return ElixirTypes.INTERPOLATION_END;
          }
        case 54: break;
        case 1: 
          { handleInState(BODY);
          }
        case 55: break;
        case 25: 
          { return ElixirTypes.STRING_FRAGMENT;
          }
        case 56: break;
        case 21: 
          { handleInState(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_BODY);
          }
        case 57: break;
        case 10: 
          { return ElixirTypes.CHAR_LIST_FRAGMENT;
          }
        case 58: break;
        case 40: 
          { handleInState(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_END);
          }
        case 59: break;
        case 4: 
          { return ElixirTypes.EOL;
          }
        case 60: break;
        case 46: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(STRING_HEREDOC_END); return TokenType.WHITE_SPACE;
          }
        case 61: break;
        case 8: 
          { callState(CHAR_LIST);
                                return ElixirTypes.SINGLE_QUOTE;
          }
        case 62: break;
        case 36: 
          { handleInState(CHAR_LIST_HEREDOC_END);
          }
        case 63: break;
        case 13: 
          { handleInState(CHAR_LIST_HEREDOC_LINE_BODY);
          }
        case 64: break;
        case 43: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(CHAR_LIST_HEREDOC_END); return TokenType.WHITE_SPACE;
          }
        case 65: break;
        case 32: 
          { return ElixirTypes.VALID_ESCAPE_SEQUENCE;
          }
        case 66: break;
        case 3: 
          { return TokenType.BAD_CHARACTER;
          }
        case 67: break;
        case 39: 
          { yybegin(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_START);
                           return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 68: break;
        case 41: 
          { yybegin(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_START);
                           return ElixirTypes.TRIPLE_DOUBLE_QUOTES;
          }
        case 69: break;
        case 30: 
          { return ElixirTypes.NUMBER;
          }
        case 70: break;
        case 6: 
          { return ElixirTypes.COMMENT;
          }
        case 71: break;
        case 9: 
          { callState(SIGIL);
                                return ElixirTypes.TILDE;
          }
        case 72: break;
        case 23: 
          { yybegin(LITERAL_SIGIL);
                               return ElixirTypes.SIGIL_LITERAL_NAME;
          }
        case 73: break;
        case 7: 
          { callState(STRING);
                                return ElixirTypes.DOUBLE_QUOTES;
          }
        case 74: break;
        case 14: 
          { yybegin(CHAR_LIST_HEREDOC_LINE_START); return ElixirTypes.EOL;
          }
        case 75: break;
        case 38: 
          { handleInState(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_END);
          }
        case 76: break;
        case 24: 
          { yybegin(INTERPOLATING_SIGIL);
                               return ElixirTypes.SIGIL_INTERPOLATING_NAME;
          }
        case 77: break;
        case 15: 
          { return ElixirTypes.SIGIL_FRAGMENT;
          }
        case 78: break;
        case 12: 
          { yybegin(CHAR_LIST_HEREDOC_LINE_START); return ElixirTypes.CHAR_LIST_FRAGMENT;
          }
        case 79: break;
        case 17: 
          { handleInState(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_BODY);
          }
        case 80: break;
        case 35: 
          { returnFromState();
                          return ElixirTypes.TRIPLE_SINGLE_QUOTE;
          }
        case 81: break;
        case 27: 
          { yybegin(STRING_HEREDOC_LINE_START); return ElixirTypes.STRING_FRAGMENT;
          }
        case 82: break;
        case 45: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_END);
                                            return TokenType.WHITE_SPACE;
          }
        case 83: break;
        case 44: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_END);
                                            return TokenType.WHITE_SPACE;
          }
        case 84: break;
        case 22: 
          { yybegin(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START);
          return ElixirTypes.EOL;
          }
        case 85: break;
        case 28: 
          { handleInState(STRING_HEREDOC_LINE_BODY);
          }
        case 86: break;
        case 29: 
          { yybegin(STRING_HEREDOC_LINE_START); return ElixirTypes.EOL;
          }
        case 87: break;
        case 18: 
          { yybegin(INTERPOLATING_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START);
          return ElixirTypes.EOL;
          }
        case 88: break;
        case 34: 
          { callState(CHAR_LIST_HEREDOC_START);
                                return ElixirTypes.TRIPLE_SINGLE_QUOTE;
          }
        case 89: break;
        case 2: 
          { yybegin(BODY);
                           return TokenType.WHITE_SPACE;
          }
        case 90: break;
        case 26: 
          { returnFromState();
                    return ElixirTypes.DOUBLE_QUOTES;
          }
        case 91: break;
        case 20: 
          { yybegin(LITERAL_DOUBLE_QUOTED_HEREDOC_SIGIL_LINE_START);
                            return ElixirTypes.SIGIL_FRAGMENT;
          }
        case 92: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
