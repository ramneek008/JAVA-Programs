/*
Imagine a tollbooth at a bridge. Cars passing by the booth are expected to pay 50 Rupees toll. Mostly they do, but sometimes a car goes by without paying. The tollbooth keeps track of the number of cars that have gone by, and of the total amount of money collected.

Model this tollbooth with a class called TollBooth. The two data items are to hold the total number of cars, and to hold the total amount of money collected.

A constructor initializes both of these to 0.
A member function called payingCar() increments the car total and adds 50/- to the cash total.
Another function, called nopayCar(), increments the car total but adds nothing to the cash total.
Finally, a member function called display() displays the two totals.
Make appropriate member functions const.

The main function should allow the user to press 'p' to count a paying car, and 'n' to count a nonpaying car. Pushing the 'q' key should cause the program to print out the total cars and total cash and then exit.
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      String x = sc.next();
      int car=0,cash=0;
      while(x.charAt(0)!='q')
      {
        car++;
        if(x.charAt(0)=='p')
        {
          cash = cash +50;
        }
        x= sc.next();
      }
      System.out.println("Total Cash : "+cash+"/-");
      System.out.println("Total Cars : "+car);
    }
}