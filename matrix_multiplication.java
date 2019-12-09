/*
Given two matrices A and B in the form of two dimensional arrays, find the dot product of these two matrices.

Input:
First line of input will contain an integer T = no. of test cases. Each test case will follow in multiple lines. 
First line of each test case will contain two integers R1 = no. of rows in matrix A and C1 = no. of columns in matrix A. 
Next R1 lines will each contain C1 space separated integers. Next line again contain two integers R2 = no. of rows in B and C2 = no. columns in B. C1 will be equal to R2. 1 <= R1,R2,C1,C2 <= 50

Output:
For each test case print matrix of size R1*C2 in R1 lines with each line containing C2 space separated integers of corresponding row.
*/


import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
     int t,i,j,k,r1,c1,r2,c2;
     t = sc.nextInt();
  for(k=0;k<t;k++)
  {
    r1 = sc.nextInt();
    c1 = sc.nextInt();
    int a[][] = new int[r1][c1];
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
    r2=sc.nextInt();
    c2 = sc.nextInt();
    int b[][] = new int[r2][c2];
    int m[][] = new int[50][50];
    for(i=0;i<r2;i++)
    {
      for(j=0;j<c2;j++)
      {
        b[i][j] = sc.nextInt();
      }
    }
    
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c2;j++)
        {
          for(int d=0;d<c1;d++)
          m[i][j] = m[i][j] + (a[i][d])*(b[d][j]);
        }
      }
    
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
      {
        System.out.print(m[i][j] + " ");
      }
      System.out.println("");
    }
    
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
      {
        m[i][j]=0;
      }
    }
  }

    
  }
}