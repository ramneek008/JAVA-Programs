/*
Traversing an array is an elementary operation on an array, in which each element will be processed for some operation.

Input Format:
Each test-case will begin with two number m and n where m = no. of rows and n = no. of columns. m rows will follow with n integers in each row separated by a space. Constraint : 1<=m<=50 and 1<=n<=50.

Output Format:
For each test case, print the elements of 2-d array in spiral form starting from index (0,0) or upper-left corner in clockwise direction.
*/


class Result
{
  static void printSpiral(int a[][], int r, int c)
  {
    
    int m,n,i,j,x=0,y;
    m=r;
    n=c;
    if(m%2==0)
    {
      y=m/2;
    }
    else
    {
      y=(m+1)/2;
    }
    i=0;
    j=0;
    while(x<y)
    {
      while(j<n)
      {
        System.out.println(a[i][j]);
        j++;
      }
      j--;
      i++;
      while(i<m)
      {
        System.out.println(a[i][j]);
        i++;
      }
      i--;j--;
      if((i!=x)&&(j!=x-1))
      {
        while(j>=x)
        {
          System.out.println(a[i][j]);
          j--;
        }
        j++;i--;
        while(i>=x+1)
        {
          System.out.println(a[i][j]);
          i--;
        }
      }
      n--;m--;
      x++;
      i=x;j=x;
    }

  }
}