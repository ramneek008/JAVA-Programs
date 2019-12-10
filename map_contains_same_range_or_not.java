/*
Write a function named boolean hasDuplicateMappings() that accepts a Map from strings to strings as a parameter and returns true if any two keys map to the same value.

For example, if a map named map1 stores {Girdhar=Gopal, Code=Quotient, Hello=Hi, Mere=Gopal}, the call of hasDuplicateMappings(map1) would return true because both "Girdhar" and "Mere" map to the value "Gopal".
Return false if passed an empty or one-element map. Do not modify the map passed in.
*/


public static boolean hasDuplicateMappings(Map<String, String> map) 
{
	  Set<String> keys = map.keySet();
  Set<String> vals = new HashSet<String>();
  Iterator<String> list =  keys.iterator();
  int i = 0;
  while(list.hasNext())
  {
    String key = (String)list.next();
    String val = map.get(key);
    //System.out.println(key + ":"  + val);
	vals.add(val);
    i++;
  }
  
  return !(vals.size() == i);
}
    