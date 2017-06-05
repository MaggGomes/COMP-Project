/* FAOPS.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. FAOPS.java */
import java.io.FileReader;

import faops.*;

// código Java que invoca o parser
public class FAOPS/*@bgen(jjtree)*/implements FAOPSTreeConstants, FAOPSConstants {/*@bgen(jjtree)*/
  protected static JJTFAOPSState jjtree = new JJTFAOPSState();public static void main(String args[]) throws ParseException {
        // criação do objecto utilizando o constructor com argumento para
        FileReader fr = null;
        try {
            fr = new FileReader("test.faops");

        } catch (Throwable e) {
            System.out.println("File not found");
        }

        FAOPS parser = new FAOPS(fr);
        try {
            while(true)
                parser.start();
        } catch (Throwable e) {
            e.printStackTrace();
                System.out.println("Rejected.");
        }
    }

  static final public void start() throws ParseException {/*@bgen(jjtree) start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case FA:
      case FANAME:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case FA:{
          jj_consume_token(FA);
          jj_consume_token(FANAME);
          jj_consume_token(ASSIGN);
          stmt();
          break;
          }
        case FANAME:{
          dump();
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ENDLINE:{
          jj_consume_token(ENDLINE);
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          ;
        }
        jj_consume_token(LF);
jjtree.closeNodeScope(jjtn000, true);
                                    jjtc000 = false;
System.out.println("Line Accepted!");
        break;
        }
      case 0:{
        jj_consume_token(0);
jjtree.closeNodeScope(jjtn000, true);
              jjtc000 = false;
System.out.println("File Accepted");
        System.exit(0);
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void stmt() throws ParseException {/*@bgen(jjtree) stmt */
               SimpleNode jjtn000 = new SimpleNode(JJTSTMT);
               boolean jjtc000 = true;
               jjtree.openNodeScope(jjtn000);Token path;
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NEW:{
        jj_consume_token(NEW);
        jj_consume_token(QUOTES);
        path = jj_consume_token(FILENAME);
        jj_consume_token(QUOTES);
        jj_consume_token(ENDOPERATION);
jjtree.closeNodeScope(jjtn000, true);
                                                                   jjtc000 = false;

        break;
        }
      case FANAME:
      case COMPLEMENT:
      case REVERSE:
      case BEGINOPERATION:{
        expr();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case MULTIPLY:
        case CONCATENATE:
        case INTERSECTION:
        case UNION:{
          op1();
          expr();
          break;
          }
        default:
          jj_la1[3] = jj_gen;
          ;
        }
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void expr() throws ParseException {/*@bgen(jjtree) expr */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMPLEMENT:
      case REVERSE:{
        op2();
        stmt();
        jj_consume_token(ENDOPERATION);
        break;
        }
      case BEGINOPERATION:{
        jj_consume_token(BEGINOPERATION);
        stmt();
        jj_consume_token(ENDOPERATION);
        break;
        }
      case FANAME:{
        jj_consume_token(FANAME);
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
if (jjtc000) {
        jjtree.clearNodeScope(jjtn000);
        jjtc000 = false;
      } else {
        jjtree.popNode();
      }
      if (jjte000 instanceof RuntimeException) {
        {if (true) throw (RuntimeException)jjte000;}
      }
      if (jjte000 instanceof ParseException) {
        {if (true) throw (ParseException)jjte000;}
      }
      {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void op1() throws ParseException {/*@bgen(jjtree) op1 */
  SimpleNode jjtn000 = new SimpleNode(JJTOP1);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:{
        jj_consume_token(MULTIPLY);
        break;
        }
      case CONCATENATE:{
        jj_consume_token(CONCATENATE);
        break;
        }
      case INTERSECTION:{
        jj_consume_token(INTERSECTION);
        break;
        }
      case UNION:{
        jj_consume_token(UNION);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void op2() throws ParseException {/*@bgen(jjtree) op2 */
  SimpleNode jjtn000 = new SimpleNode(JJTOP2);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case COMPLEMENT:{
        jj_consume_token(COMPLEMENT);
        break;
        }
      case REVERSE:{
        jj_consume_token(REVERSE);
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static final public void dump() throws ParseException {/*@bgen(jjtree) dump */
  SimpleNode jjtn000 = new SimpleNode(JJTDUMP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FANAME);
      jj_consume_token(DUMP);
      jj_consume_token(QUOTES);
      jj_consume_token(FILENAME);
      jj_consume_token(QUOTES);
      jj_consume_token(ENDOPERATION);
    } finally {
if (jjtc000) {
        jjtree.closeNodeScope(jjtn000, true);
      }
    }
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public FAOPSTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x30,0x80000,0x31,0xf00,0x27020,0x23020,0xf00,0x3000,};
	}

  /** Constructor with InputStream. */
  public FAOPS(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public FAOPS(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new FAOPSTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public FAOPS(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new FAOPSTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new FAOPSTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public FAOPS(FAOPSTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(FAOPSTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[21];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 8; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 21; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private int trace_indent = 0;
  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}