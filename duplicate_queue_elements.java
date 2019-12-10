/*
Write a function named doubleQueue() that accepts a reference to a queue of integers as a parameter and replaces every element with two copies of itself.

For example, if a queue named q stores {11, 12, 13}, the call of doubleQueue(q); should change it to store {11, 11, 12, 12, 13, 13}.
*/


static void doubleQueue(Queue<Integer> q)
{
  Queue<Integer> q1 = new LinkedList<Integer>();
  int n=q.size();
  for(int i=0;i<n;i++)
  {
    int a=q.remove();
    q1.add(a);
  }
  int s= q1.size();
  for(int i=0;i<s;i++)
  {
    int a=q1.remove();
    q.add(a);
    q.add(a);
  }
  
}