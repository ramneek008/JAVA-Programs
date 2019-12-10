/*
Define a class named TimeSpan. A TimeSpan object stores a span of time in hours and minutes (for example, the time span between 5:00am and 7:45am is 2 hours, 45 minutes). Each TimeSpan object should have the following public methods:

TimeSpan(hours, minutes)
Constructs a TimeSpan object storing the given time span of hours and minutes.

getHours()
Returns the number of hours in this time span.

getMinutes()
Returns the number of minutes in this time span, between 0 and 59.

add(hours, minutes)
Adds the given amount of time to the span. For example, (3 hours, 15 minutes) + (2 hour, 40 minutes) = (5 hours, 55 minutes). Assume that the parameters are valid: the hours are non-negative, and the minutes are between 0 and 59.

add(TimeSpan tp)
Adds the given amount of time (stored as a time span) to the current time span.

getTotalHours()
Returns the total time in this time span as the real number of hours, such as 9.75 for (9 hours, 45 min).

toString()
Returns a string representation of the time span of hours and minutes, such as "5 Hours, 38 Minutes".

The minutes should always be reported as being in the range of 0 to 59. That means that you may have to "carry" 60 minutes into a full hour.
*/


// Do NOT change the class name

class TimeSpan
{
  int h,m;
  public TimeSpan(int hour,int minute)
  {
    h=hour;
    m=minute;
    while(m>=60)
    {
      m=m-60;
      h=h+1;
    }
  }
  public int getHours()
  {
    return h;
  }
  public int getMinutes()
  {
    return m;
  }
  public void add(int hour,int minute)
  {
    h=h+hour;
    m=m+minute;
    while(m>=60)
    {
      m=m-60;
      h=h+1;
    }
  }
  public void add(TimeSpan tp)
  {
    h=h+tp.h;
    m=m+tp.m;
    while(m>=60)
    {
      m=m-60;
      h=h+1;
    }
  }
  public float getTotalHours()
  {
    float f= h+(float)m/60;
    return f;
  }
  public String toString()
  {
    String s = new String();
    s=h+" Hours, "+m+" Minutes";
    return s;
  }
  // Write your code here

}
