/*
Write a class of objects named Circle that remembers information about a circle. You must include the following public members.

You can use the constant named Math.PI storing the value of π, roughly 3.14159.

Name	description
Circle(float r)	constructs a new circle with the given radius as a real number
area()	returns the area occupied by the circle (upto 2 decimal places)
circumference()	returns the distance around the circle (upto 2 decimal places)
getRadius()	returns the radius as a real number (upto 1 decimal places)
toString()	returns a string representation such as "Circle{radius=2.5}"

You should define the entire class including the class heading, the private fields, and the declarations and definitions of all the public methods and constructor.
*/


import java.text.DecimalFormat;
class Circle
{
  float rad;
  private static DecimalFormat d = new DecimalFormat(".##");
  public Circle(double r)
  {
     rad=(float)r;
  }
  public String area()
  {
    String ar;
    double ar1 = (Math.PI*rad*rad);
    ar = d.format(ar1);
    return ar;
  }
  public String circumference()
  {
    String c;
    double c1=(2*Math.PI*rad);
    c=d.format(c1);
    return c;
  }
  public double getRadius()
  {
    return rad;
  }
  public String toString()
  {
    String ans;
    ans = "Circle{radius="+rad+"}";
    return ans;
  }
}