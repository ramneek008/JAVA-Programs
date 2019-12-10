/*
Write a program to accept user name and password from the user.

If the password has less than 6 characters then throw an exception as character 's'
If the password does not contain a digit then throw an exception as character 'd'.

For handling exception implement necessary catch blocks and print the messages accordingly.
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    String username = sc.next();
    String password = sc.next();
    int i,m=0,c=0;
    
      try{
        if(password.length()<6)
      i =5/0;
      }
      catch(ArithmeticException e)
      {
        c++;
        System.out.println("Too short!");
      }
    try
    {
      for(int j=0;j<password.length();j++)
      {
        if(password.charAt(j)>=48 && password.charAt(j)<=57)
        {
          m++;
        }
      }
      if(m==0)
        i=5/0;
    }
    catch(ArithmeticException e)
    {
      c++;
      System.out.println("No digit!");
    }
    
    if(c==0)
      System.out.println("Correct");
    
  }
}