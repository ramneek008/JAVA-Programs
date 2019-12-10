/*
Write a class to implement your own ArrayList class. It should contain add(), get(), remove(), size() methods.
Use dynamic array logic so that it should increase its size when it reaches threshold.
*/


import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class OwnArrayList<E>
{
  private static final int INITIAL_CAPACITY = 10;
  private int actSize = 0;
  private Object elementData[] = {};
  public OwnArrayList(){ 
  	elementData = new Object[INITIAL_CAPACITY];
  }
  // Dont remove the below Annotation, otherwise code will not work.
  @SuppressWarnings("unchecked")
  public E get(int index){
  if(index < actSize)
 return (E)elementData[index];
 else throw new ArrayIndexOutOfBoundsException();
 }
  public void add(E e){ 
  elementData[actSize++] = e;
  }
  // Dont remove the below Annotation, otherwise code will not work.
  @SuppressWarnings("unchecked")
  public Object remove(int index){ 
    if(index < actSize){
            Object obj = elementData[index];
            elementData[index] = null;
            int tmp = index;
            while(tmp < actSize){
                elementData[tmp] = elementData[tmp+1];
                elementData[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
  
  }
  public int size(){
  return actSize;
  }
  private void increaseListSize(){
  }
  public void display()
  {
	for (int i = 0; i < actSize; i++)
    	System.out.print(elementData[i] + " ");
        System.out.println();
  }
}