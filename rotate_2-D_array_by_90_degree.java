/*
Given a two dimensional N*N array, print the output if the array is rotated by 90 degrees in clockwise direction.

Input Format:
First line of input will contain a number T = no. of test cases. 
Each test case will contain one line with number N (N*N is the size of the array). Next N lines will each contain N integers separated by space.

Output Format:
For each test-case, print the array rotated clockwise by 90 degrees. Each row of an array should be printed as m elements separated by exactly one space. 
There should be no space after last element in each row. Print an extra line after output for each test case.
*/


import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
  int t,n,i,j,k;
  t =sc.nextInt();
  for(k=0;k<t;k++)
  {
    n=sc.nextInt();
    int arr[][] = new int[n][n];
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=n-1;j>=0;j--)
      {
        if(j>0)
        System.out.print(arr[j][i] + " ");
        else
          System.out.print(arr[j][i]);
      }
      System.out.println("");
    }
     System.out.println("");
    
  }
  }
}