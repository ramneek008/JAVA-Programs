/*
Write a method called stripHtmlTags() that accepts a filename containing an HTML web page as its parameter, then reads that file and prints the file's text with all HTML tags removed.
A tag is any text between the characters < and > . 
*/


import java.util.Scanner;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void stripHtmlTags(String name) {
      try {
        BufferedReader in = new BufferedReader(new FileReader(name));
        String S;
        while((S = in.readLine()) != null) {
          StringBuilder sb = new StringBuilder(S);
          while(sb.indexOf("<") != -1) {
            sb.delete(sb.indexOf("<"), 1+sb.indexOf(">"));
          }
          System.out.println(""+sb);
        }
      }
      catch(IOException e) {}
    }
    public static void main(String[] args)
    {
        // Write your code here
      Scanner inn = new Scanner(System.in);
      String name = inn.nextLine();
      stripHtmlTags(name);
    }
}