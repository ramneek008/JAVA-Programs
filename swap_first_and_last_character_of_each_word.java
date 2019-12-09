/*
Write a program which given a string, swap first and last character of each word in it.
*/


import java.util.*;
class Result
{
  static String swapFirstLastChar(String str)
  {
    String s;
    String ready = "";
    char ch1;
    int i=0;
    StringTokenizer st1 = new StringTokenizer(str);
    while(st1.hasMoreTokens())
    {
      i++;
      s = st1.nextToken();
      char ch[] = s.toCharArray();
      ch1 = ch[0];
      ch[0] = ch[ch.length-1];
      ch[ch.length-1] = ch1;
      s = new String(ch);
      if(i==1)
      ready = s;
      else 
        ready = ready + " " +s;
    }
    return ready;
    

  }
}