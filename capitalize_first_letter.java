/*
Write a program which given a string, Capitalize first letter of each word in it.
*/


static String capitalizeFirstChar(String str)
{
  char ch[] = str.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
    if(i==0 || ch[i-1]==' ')
    {
      if(ch[i]>=97 && ch[i]<=122)
      ch[i] = (char)(ch[i]-'a'+'A');
    }
  }
  String s = new String(ch);
  return s;

}
