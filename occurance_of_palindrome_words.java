/*
Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).
*/


static int countPalindrome(String str)
{
  String s;
  int c=0,m=0;
  StringTokenizer st1 = new StringTokenizer(str);
  while(st1.hasMoreTokens())
  {m=0;
    s = st1.nextToken();
    for(int i=0;i<s.length()/2;i++)
    {
      if(s.charAt(i)==s.charAt(s.length()-1-i))
        m++;
    }
    if(m==s.length()/2)
      c++;
  }
  return c;

}
