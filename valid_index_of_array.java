/*
Write a program to raise an exception and print "Out of Bounds" if any attempt is made to refer to an element whose index is beyond the array size.
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int a[] = new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
  for(int i=0;i<2;i++)
  {
  int t = sc.nextInt();
  try{
    System.out.println(a[t]);
  }
  catch(IndexOutOfBoundsException e)
  {
    System.out.println("Out of Bounds");
  }
  }
    }
}