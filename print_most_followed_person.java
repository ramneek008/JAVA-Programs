/*
Write a program which reads a text file of information about Google+ followers, and prints the name of the person who is the most "popular" in the data set, according to the following rules.

Following a user is a one-directional relationship; if A follows B, it does not necessarily mean that B follows A. You might imagine that the most "popular" user is the one who has the most followers. But it is more impressive to be followed by people who have a lot of followers themselves. So we will define the "popularity" of a user to be the sum of the number of their followers' followers. For example, if user A has three followers named B, C, and D, then A's popularity is the sum of the number of followers that B, C, and D have. If B has 3 followers, C has 2, and D has 4, then A's popularity is 9. (It does not matter if there is any overlap between the groups of people who follow B, C, and D in our example.) One funny side effect of this popularity system is that you don't get any points for being followed by someone who has 0 followers.
In this problem, each line of the data file is in the format "name1 name2", to indicate that the user name1 follows the user name2. Your job is to read this data and return the name of the user with the highest popularity as described above.
For example, suppose a file named Google.txt contains the lines below. Given this data set, the call of printMostFollowed("Google.txt") would return "Girdhar" because Girdhar has the highest popularity score of 3 due to being followed by Amit(who has 1 follower) and by Himanshu(who has 2 followers).
*/


import java.util.*;
import java.io.*;
// Other imports go here
// Do NOT change the class name
@SuppressWarnings("unchecked")
class Main{
    public static void main(String[] args)
    {
      Scanner inn = new Scanner(System.in);
      String name = inn.nextLine();
      try {
        BufferedReader in = new BufferedReader(new FileReader(name));
        String S;
        LinkedHashMap<String,Vector> map = new LinkedHashMap<String,Vector>();
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<String,Integer>();
        while((S = in.readLine()) != null) {
          String s[] = S.split("\\s");
          if(!map.containsKey(s[1])){
            map.put(s[1], new Vector());
            map.get(s[1]).add((Integer)1);
            map.get(s[1]).add(s[0]);
            
            if(!map.containsKey(s[0])){
              map.put(s[0], new Vector());
              map.get(s[0]).add((Integer)0);
            }
          }
          else {
            int n = (Integer)map.get(s[1]).elementAt(0);
            map.get(s[1]).set(0,1+n);
            map.get(s[1]).add(s[0]);
          }
        }
        for(String s: map.keySet()) {
          map2.put(s,0);
        }
        for(String s: map2.keySet()) {
          int pop = 0;
          Vector v = map.get(s);
          for(int i=1;i<v.size();i++) {
            String element = (String)v.elementAt(i);
            int size = (Integer)map.get(element).elementAt(0);
            pop += size;
          }
          map2.put(s,pop);
        }
        int max=0;
        for(String s: map2.keySet()) {
          if(map2.get(s) > max){
            max = map2.get(s);
          }
        }
        for(String s: map2.keySet()) {
          if(map2.get(s) == max){
            System.out.println(s);
          }
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}