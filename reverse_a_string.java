/*abstractWrite a function to reverse a string.

              void reverseString (char str[]);

reverseString (char str[]) will receive a string as input and reverse the string.
*/

static String reverseString(String str)
{
  char ch[] = str.toCharArray();
  char ch1[] = new char[ch.length];
  for(int i=0;i<ch.length;i++)
  {
    ch1[i]=ch[ch.length-1-i];
  }
  String s1 = new String(ch1);
  return s1;
  
}
