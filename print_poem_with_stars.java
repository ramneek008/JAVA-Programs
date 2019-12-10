/*
Write a function named printPoemWithStars() that accepts two parameters a string holding a file name, and an integer for a width.
Your function should open that file and reads its contents as a sequence of lines, and display the lines to the console with a 'box' border of * characters around them on all four sides.

The second parameter to your function indicates the total width of the box including its border.

You must also convert each line to "title case" by capitalizing the first letter of the line and lowercasing all subsequent letters. 
*/


import java.util.Scanner;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void printPoemWithStars(String name, int size) {
      try {
        for(int i=0;i<(size);i++)
          System.out.print("*");
        System.out.println();
        BufferedReader in = new BufferedReader(new FileReader(name));
        String s;
        while((s = in.readLine()) != null) {
          if(s.length()>1)
          	s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
          if(s.length()>(size-2))
            System.out.print("*"+s.substring(0,size-2));
          else
            System.out.print("*"+s);
          for(int i=0;i<(size - s.length() - 2);i++)
            System.out.print(" ");
          System.out.println("*");
        }
        for(int i=0;i<(size);i++)
          System.out.print("*");
      }
      catch(IOException e){}
    }
    public static void main(String[] args)
    {
        // Write your code here
      Scanner inn = new Scanner(System.in);
      String name = inn.nextLine();
      int size = inn.nextInt();
      printPoemWithStars(name,size);
    }
}