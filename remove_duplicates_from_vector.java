/*
Write a function named removeDuplicates() that accepts as a parameter a reference to a Vector of integers, and modifies it by removing any duplicates.

Note that the elements of the vector are not in any particular order, so the duplicates might not occur consecutively.

You should retain the original relative order of the elements.

Use a Set as auxiliary storage to help you solve this problem.

For example, if a vector named v stores {24, 10, 12, 19, 24, 17, 12, 10, 10, 19, 26, 26}, the call of removeDuplicates(v); should modify it to store {24, 10, 12, 19, 17, 26}.
*/


static void removeDuplicates(Vector<Integer> v)
{
  HashSet<Integer> h= new LinkedHashSet<Integer>();
    h.addAll(v);
  v.clear();
  v.addAll(h);

}