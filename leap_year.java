/*
Write a program to find whether the year is leap or not? 
A year is considered a leap year if it is perfectly divisible by 4. 
Years that are perfectly divisible by 100 (for example, 2000, 2100, 2200) are exceptions. 
Such a year is a leap year only if it is also perfectly divisible by 400.
*/

import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      if( (x%4==0)  && (x%100!=0 || x%400==0))
      {
        System.out.println("Leap Year");
      }
      else
        System.out.println("Not a Leap Year");
    }
}