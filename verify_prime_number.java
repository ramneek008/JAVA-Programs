/*
Write a function verifyPrime that accepts an integer parameter n (where 0<=n<=1000000000) and return 1 if number is prime and 0 if number is not prime.
*/


static int verifyPrime(int n)
{
  int m=0;
  if(n==0 || n==1)
    return 0;
  else if(n==2)
    return 1;
  else
  {
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {m++;}
    }
    if(m==0)
      return 1;
    else 
      return 0;
  }
  
}