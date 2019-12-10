/*
Write a function named isHappy() that returns whether a given integer is "happy" or not.
An integer is "happy" if repeatedly summing the squares of its digits eventually leads to the number 1.

For example, 139 is happy because:
12 + 32 + 92 = 91
92 + 12 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name and method signature
class Main
{
  static boolean isHappy(int n) 
  {
    
    // Write your code here
    
    while(n/10!=0)
    {int value =0;
    while(n>0)
    {
      value += Math.pow(n%10,2);
      n/=10;
    }
    n=value;
    }
    return n==1;
  }