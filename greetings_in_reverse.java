/*
Write a class called ReverseGreet that creates a thread say Thread1, Thread1 creates another thread say Thread2, Thread2 creates Thread3; and so on, up to a given number of input.

Each thread should print "CodeQuotient Thread<num>", but you should structure your program such that the threads print their greetings in reverse order.
*/


import java.util.Scanner;
// Complete the class below as sopecified above.
class ReverseGreet extends Thread
{
int n;
ReverseGreet(int a){
n=a;
}
public void run()
{
int i;
for(i=n;i>0;i--){
System.out.println("CodeQuotient Thread"+i);
}
}
}

class Main{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    ReverseGreet r=new ReverseGreet(n);
    r.start();

}

}