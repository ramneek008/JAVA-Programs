/*
Write a function named mirrorQueue() that accepts a reference to a queue of strings as a parameter and appends the queue's contents to itself in reverse order.

For example, if a queue named q stores {"Code", "Quotient"}, the call of mirrorQueue(q); should change it to store {"Code", "Quotient", "Quotient", "Code"}.
*/


static void mirrorQueue(Queue<String> q)
{
  ArrayList<String> q1 = new ArrayList<String>(q);
  int s=q1.size();
  for(int i=0;i<s;i++)
  {
    q.add(q1.get(s-i-1));
  }
  
}