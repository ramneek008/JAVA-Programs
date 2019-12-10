/*
A histogram is a graphical way of displaying data by dividing the data into separate ranges and then indicating how many data values fall into each range.
Write a program that reads in a vector of integers from a data file and then displays a histogram of those numbers, divided into ranges 0-10, 11-19, 21-29 and so on till 91-100.
*/


import java.util.*;
import java.io.*;
import java.lang.Integer;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      	Scanner sc = new Scanner(System.in);
 		String name = sc.next();
      	try{
      	BufferedReader bf = new BufferedReader( new FileReader(name));
      	String line =  bf.readLine();
      	String[] num = line.split(", ");
        ArrayList<String> result = new ArrayList<String>();
          result.add("00-10:");
          result.add("11-20:");
          result.add("21-30:");
          result.add("31-40:");
          result.add("41-50:");
          result.add("51-60:");
          result.add("61-70:");
          result.add("71-80:");
          result.add("81-90:");
          result.add("91-100:");
          for(int i=0;i<num.length;i++)
          { 
			int a = Integer.valueOf(num[i]); 
            if(a>=0 && a<=10)
            {
              result.set(0,result.get(0).concat("#"));
            }
           else if(a>=11 && a<=20)
            {
              result.set(1,result.get(1).concat("#"));
            }
           else if(a>=21 && a<=30)
            {
              result.set(2,result.get(2).concat("#"));
            }
           else if(a>=31 && a<=40)
            {
              result.set(3,result.get(3).concat("#"));
            }
           else if(a>=41 && a<=50)
            {
              result.set(4,result.get(4).concat("#"));
            }
           else if(a>=51 && a<=60)
            {
              result.set(5,result.get(5).concat("#"));
            }
           else if(a>=61 && a<=70)
            {
              result.set(6,result.get(6).concat("#"));
            }
           else if(a>=71 && a<=80)
            {
              result.set(7,result.get(7).concat("#"));
            }
           else if(a>=81 && a<=90)
            {
              result.set(8,result.get(8).concat("#"));
            }
           
           else if(a>=91 && a<=100)
            {
              result.set(9,result.get(9).concat("#"));
            }
          }
          for(int i=0;i<10;i++)
          System.out.println(result.get(i));
                    bf.close();
        }
      catch(Exception e){}
    }
}