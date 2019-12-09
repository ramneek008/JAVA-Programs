/*
Write a program to find the given number is kaprekar or not. 
A number if kaprekar if the representation of its square can be split into two parts that add up to the original number. 
For instance, 45 is a Kaprekar number, because 45^2 = 2025 and 20 + 25 = 45. Whereas 13 is not as 13^2 = 169 which can be split in two ways (1+69) and (16+9), but any of them is not 13. 
The number 1 is Kaprekar, because 1^2 = 01, and  0 + 1 = 1.
*/


import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int x = sc.nextInt();
        int z=x*x;
        int sum = (z/10 + z%10);
        int sum1 = (z/100 +z%100);
        int sum2 = (z/1000 + z%1000);
        int sum3 = (z/10000 + z%10000);
        if(sum==x || sum1==x || sum2==x || sum3==x)
          System.out.println("1");
        else
          System.out.println("0");
      }
    }
}