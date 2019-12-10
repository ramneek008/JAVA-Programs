/*
Given a text file in current directory, print its contents backwards from last word of last line back to the first word of first line.
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      String name = sc.next();
      try(BufferedReader bf = new BufferedReader( new FileReader(name)))
      {
     	String line = bf.readLine();
      	while(line!=null)
      	 {
        	list.add(line);
          	line = bf.readLine();
      	 } 
      }
      catch(Exception e){}
        // Write your code here
      int I=0;
      int j=list.size();
      while(I<j)
      {
        String line = list.get(0);
        String[] tokens = line.split("\\s");
        StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < tokens.length; ++i) 
    	{
    	  sb.insert(0, tokens[i]);
      	  if (i < tokens.length - 1)
          sb.insert(0, " ");
    	}
       String strReverse = sb.toString();
        list.remove(0);
        I++;
        list.add(strReverse);
      }
      for(int l = list.size()-1;l>=0;l--)
      System.out.println(list.get(l));
      
    }
}