/* Generated By:JavaCC: Do not edit this line. NutchAnalysisTokenManager.java */
package org.apache.nutch.analysis;
import java.io.StringReader;
import org.apache.hadoop.conf.Configuration;
import org.apache.nutch.searcher.Query;
import org.apache.nutch.searcher.QueryFilters;
import org.apache.nutch.searcher.Query.Clause;
import org.apache.nutch.util.NutchConfiguration;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.StopFilter;
import org.apache.lucene.analysis.TokenStream;
import java.io.*;
import java.util.*;

/** Token Manager. */
public class NutchAnalysisTokenManager implements NutchAnalysisConstants
{
  /** Constructs a token manager for the provided Reader. */
  public NutchAnalysisTokenManager(Reader reader) {
    this(new FastCharStream(reader));
  }

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 9);
      case 39:
         return jjStopAtPos(0, 14);
      case 43:
         return jjStopAtPos(0, 7);
      case 45:
         return jjStopAtPos(0, 8);
      case 46:
         return jjStopAtPos(0, 12);
      case 47:
         return jjStopAtPos(0, 11);
      case 58:
         return jjStopAtPos(0, 10);
      case 64:
         return jjStopAtPos(0, 13);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static final long[] jjbitVec0 = {
   0xfffffffeL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec3 = {
   0x1ff0000000000000L, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec5 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec7 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff004000000000L & l) == 0L)
                     break;
                  kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if (curChar == 46)
                     jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar != 46)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(3);
                  break;
               case 7:
                  if (curChar == 35)
                     kind = 1;
                  break;
               case 8:
                  if (curChar == 43 && kind > 1)
                     kind = 1;
                  break;
               case 9:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  if ((0x800000008L & l) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if ((0x800000008L & l) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAdd(0);
                  }
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjstateSet[jjnewStateCnt++] = 2;
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 3)
                        kind = 3;
                     jjCheckNAdd(5);
                  }
                  break;
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAdd(0);
                  break;
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   7, 9, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 48:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec7[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\53", "\55", "\42", "\72", "\57", 
"\56", "\100", "\47", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
protected CharStream input_stream;
private final int[] jjrounds = new int[10];
private final int[] jjstateSet = new int[20];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public NutchAnalysisTokenManager(CharStream stream){
   input_stream = stream;
}

/** Constructor. */
public NutchAnalysisTokenManager(CharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 10; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 15)
   {
      jjmatchedKind = 15;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    matchedToken.image = matchedToken.image.toLowerCase();
         break;
      case 2 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                  // remove dots
      for (int i = 0; i < image.length(); i++) {
        if (image.charAt(i) == '.')
          image.deleteCharAt(i--);
      }
      matchedToken.image = image.toString().toLowerCase();
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
