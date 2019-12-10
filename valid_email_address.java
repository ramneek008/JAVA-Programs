/*
Check an email-id for following exceptions

if id does not contain '@' OR
if id does not contain '.' (dot) OR
if no '.' (dot) appears after '@'

catch the exception and print "Invalid" or "Valid" accordingly.
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    String id;
    int a=0,b=0,c=0;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    for(int j=0; j<id.length();j++)
    {
      if(id.charAt(j)=='@')
        a++;
      if(id.charAt(j)=='.')
        b++;
      if(id.charAt(j)=='@')
      {
        int i=j;
        for(int k=i;k<id.length();k++)
        {
          if(id.charAt(k)=='.')
            c++;
        }
      }
    }
    if(a==0 || b==0 || c==0)
      System.out.println("Invalid");
    else
      System.out.println("Valid");
      
  }
}