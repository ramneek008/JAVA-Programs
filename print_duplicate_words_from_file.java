/*
Write a method named printDuplicateWords() that accepts as its parameter a file name consisting a series of lines. 
Your method should examine each line looking for consecutive occurrences of the same token on the same line and print each duplicated token along how many times it appears consecutively. 
Non-repeated tokens are not printed.
*/


import java.util.*;
import java.io.*;
import java.util.Map.Entry;

// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      printDuplicateWords(name);
        // Write your code here
    }
  public static void printDuplicateWords(String input)
  {
    	HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
    	Set<Entry<String, Integer>> es = wordCountMap.entrySet();
        try
        {
            BufferedReader br  = new BufferedReader(new FileReader(input));
            String Line = br.readLine();
            while (Line != null)
            {   
                String[] words = Line.split(" ");
                for (String word : words)
                {
                    if(wordCountMap.containsKey(word) )
                    {   
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                
             es = wordCountMap.entrySet();
                  }
              for (Entry<String, Integer> entry : es) 
            {
                if (entry.getValue() > 1 && entry.getKey().length()>=1)
                {
                    System.out.print(entry.getKey() + "*"+ entry.getValue() + " ");
                }
            }
              System.out.println();
              wordCountMap.clear();
			  es.clear();
              Line = br.readLine();
            }
                          br.close();           
        } 
        catch (Exception e) {}
     }
}