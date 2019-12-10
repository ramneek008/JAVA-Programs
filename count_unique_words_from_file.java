/*
Write a function named countUniqueWords() that accepts a file name as a parameter and returns a count of the number of unique words in the file.
*/


import java.util.Scanner;
import java.util.*;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
       Scanner sc = new Scanner(System.in);
      Set<String> s = new LinkedHashSet<String>();
      try(BufferedReader bf = new BufferedReader( new FileReader(sc.next())))
      {
      String l = bf.readLine();
      while(l != null)
      {
        String[] token = l.split("\\s");
        for(int i=0;i<token.length;i++)
        {
          s.add(token[i]);
        }
        l = bf.readLine();  
      }
      }
      catch(Exception e){}
      System.out.println(s.size());
    }
}