/*
Design a class named Box whose dimensions are integers and private to the class.

The dimensions are labelled: length, breadth and height.

The default constructor of the class should initialize them to 0 (ZERO).
The parameterized constructor Box(int length, int breadth, int height) should initialize them to length, breadth and height respectively.
The copy constructor Box(Box b1) should set them to b1's length, breadth and height respectively.
Apart from the above, the class should have  functions:

int getLength() - Return box's length
int getBreadth() - Return box's breadth
int getHeight() - Return box's height
long long CalculateVolume() - Return the volume of the box
*/


class Box
{
  int length,breadth,height;
  Box()
  {
    length=breadth=height=0;
  }
  Box(int length,int breadth,int height)
  {
    this.length=length;
    this.breadth=breadth;
    this.height=height;
  }
  Box(Box b1)
  {
    length=b1.length;
    breadth=b1.breadth;
    height=b1.height;
  }
  int getLength()
  {
    return length;
  }
   int getBreadth()
  {
    return breadth;
  }
   int getHeight()
  {
    return height;
  }
  long CalculateVolume()
  {
    return length*breadth*height;
  }
  
}