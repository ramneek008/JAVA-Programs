/*
Write a program to calculate the compound interest on a principle amount.

Input Format:
Each test case contains three floating numbers denoting principle amount, rate and time.

Output Format:
Print the compound interest amount upto 1(one) decimal point as shown below.
*/


import java.util.*;
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int n;
      float p,r,t,c=0,d=1;
        n =sc.nextInt();
      for(int i=0;i<n;i++)
      {
        p =sc.nextFloat();
        r =sc.nextFloat();
        t =sc.nextFloat();
        c=(float)(p*(Math.pow((1+r/100),t)));
        System.out.format("%.1f",c);
      }
    }
}