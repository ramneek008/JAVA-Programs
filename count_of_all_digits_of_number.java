/*
Write a function to count and print the number of digits in a positive integer. 
*/


public int countDigits(int number)
{
  int m=0;
  while(number!=0)
  {
    m++;
    number=number/10;
  }
 return m;
}