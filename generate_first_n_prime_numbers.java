/*
Write a program to generate and print first m primes in the first n positive integers. 
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
      int n = sc.nextInt();
      int m = sc.nextInt();
      int i,j;
      for(i=2;i<=n;i++)
  {
    if(m>=1)
      {
    for(j=2;j<=i;j++)
    {
      
      if(i%j==0)
        break;
    }
    if(i==j)
    {System.out.println(i);
     m--;
    }}
    else
      break;
  }

    }
}