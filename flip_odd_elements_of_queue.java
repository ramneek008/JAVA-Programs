/*
Write a function named flipHalfQueue() that Takes an queue of integers as parameter and reverses the order of half of the elements of a Queue of integers,
Your function should reverse the order of all the elements in odd-numbered positions (position 1, 3, 5, etc.) assuming that the first value in the queue has position 0.
*/


static void flipHalfQueue(Queue<Integer> q)
{
  Stack<Integer> s = new Stack<Integer>();
  int size= q.size();
  for(int i=0;i<size;i++)
  {
    if(i%2!=0)
    {
      int a=q.remove();
      s.push(a);
    }
    else
    {
      int a=q.remove();
      q.add(a);
    }
  }
  for(int i=0;i<size;i++)
  {
    if(i%2!=0)
    {
      int a=s.pop();
      q.add(a);
    }
    else
    {
      int a=q.remove();
      q.add(a);
    }
  }
  
}
