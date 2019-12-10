/*
Write a function sumOfRange that accepts two integer parameters min and max and returns the sum of the integers from min through max inclusive.
For example, the call of sumOfRange(3, 7) returns 25 (3 + 4 + 5 + 6 + 7) . If min is greater than max, return 0.
*/


static int sumOfRange(int min, int max)
{
  int sum =0; 
  if(min>max)
  {
    return 0;
  }
  else
  {
    for(int i=min;i<=max;i++)
    {
      sum = sum +i;
    }
    return sum;
  }
}
