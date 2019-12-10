/*
Write a class named Date that remembers information about a month and day. Ignore leap years and don't store the year in your object. You must include the following public methods:

Member-name      Description
Date(int m, int d)       constructs a new date representing the given month and day   
daysInMonth()    returns the number of days in the month stored by your date object   
getDay()         returns the day   
getMonth()       returns the month   
nextDay()        advances the Date to the next day, wrapping to the next month and/or year if necessary   
toString()       returns a string representation e.g. If date is 27 June then return "6/27"  
absoluteDay()    return the absolute day of a particular date e.g. January 1 is 1, February 1 is 32, March 1 is 60 and December 31 is 365.

You should define the entire class including the class heading, the private fields, and the declarations and definitions of all the public methods and constructor.
*/


class Date
{
        // Write your code here
  int month,day;
  int a[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
  public Date(int m,int d)
  {
    month=m;
    day=d;
  }
  public int daysInMonth()
  {
    return a[month-1];
  }
  public int getDay()
  {
    return day;
  }
  public int getMonth()
  {
    return month;
  }
  void nextDay()
  {
    if(day+1>a[month-1])
    {
      if(month!=12)
      {
        day=1;
        month++;
      }
      else
      {
        day=1;
      month=1;
      }
    }
    else
      day++;
  }
  public String toString()
  {
    String s = new String();
    s=month+"/"+day;
    return s;
  }
  public int absoluteDay()
  {
    int ab=day;
    for(int i=1;i<month;i++)
    {
      ab+=a[i-1];
    }
    return ab;
  }

}
