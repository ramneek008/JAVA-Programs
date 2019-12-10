/*
Write a function named balancedString() that accepts a string of source code and check whether the braces/parentheses are balanced.
Every ( or { must be closed by a } or ) in the opposite order. Return the index at which an imbalance occurs, or -1 if the string is balanced. If any ( or { are never closed, return the string's length.
*/


import java.util.Scanner;
import java.util.*;
// Other imports go here
// Do NOT change the class name and method signature
class Main
{
  static int balancedString(String s)
  {
    Stack<String> st = new Stack<String>();
    int i,cb=0,rb=0;
    for(i=0;i<s.length();i++)
    {
     if(s.charAt(i)=='(' || s.charAt(i)=='{')
     {
       if(s.charAt(i)=='{')
       {
         st.push("{");
         cb++;
       }
       else
       {
         st.push("(");
           rb++;
       }
     }
      else if(s.charAt(i)==')' && rb!=0)
      {
        st.pop();
        rb--;
      }
      else if(s.charAt(i)==')' && rb==0)
      {
        return i;
      }
      else if(s.charAt(i)=='}' && cb!=0)
      {
        st.pop();
        cb--;
      }
      else if(s.charAt(i)=='}' && cb==0)
      {
        return i;
      }
    }
    if(st.empty())
      return -1;
    else
      return i;

  }