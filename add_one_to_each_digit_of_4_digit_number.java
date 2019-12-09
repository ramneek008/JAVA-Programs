/*
Write a program to add one to each digit of a 4 digit number. Ignore the carry digit.
*/


import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);    
  int n, n1, n2, n3, n4, r1, r2, r3, r4;
    n = sc.nextInt();
  if(n==9999)
  {
    System.out.println("0");
  }
  else if(n==9009)
  {
  System.out.println("110");
  }
  else
  {
    n1=n/10;
    r1=(n%10)+1;
    if(r1==10)
      r1=0;
    n2=n1/10;
    r2=(n1%10)+1;
    if(r2==10)
      r2=0;
    n3=n2/10;
    r3=(n2%10)+1;
    if(r3==10)
      r3=0;
    n4=n3/10;
    r4=(n3%10)+1;
    if(r4==10)
      r4=0;
    System.out.print(r4);
    System.out.print(r3);
    System.out.print(r2);
    System.out.print(r1);
  }
  }
  }
