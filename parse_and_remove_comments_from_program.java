/*
Write a function removeComments() which will take two arguments as

an input file and
an output file
and it will copy the contents from input file to output file except the characters that appear inside C/C++ comments.

The function must be able to recognize both kind of comment styles: -

Single line comment, starting with //
Multi line comment, starting with /* and end with */


import java.util.*;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String input = sc.next();
      String output = sc.next();
      removeComments(input,output);
      
    }
  public static void removeComments(String input,String output)
      {
        try{BufferedReader br = new BufferedReader(new FileReader(input));
      BufferedWriter bw = new BufferedWriter(new FileWriter(output));
    String s;
    while ((s = br.readLine()) != null) {
		if(s.contains("//")){}        
        else if(s.contains("/*")){
          bw.write(s.substring(0,s.indexOf("/*")));
          while(!s.contains("*/")){
            s = br.readLine();
          }
          bw.write(s.substring(s.indexOf("*/")+2)+"\n");
        }
      else{
        bw.write(s+"\n");
      }
    }
    bw.flush();
      br.close();}
    catch(Exception e){}
    try(BufferedReader br = new BufferedReader(new FileReader(output)))
  {
 String line = null;
 while ((line = br.readLine()) != null) {
   System.out.println(line);
 }
  }
  catch(Exception e){}

      }
  }