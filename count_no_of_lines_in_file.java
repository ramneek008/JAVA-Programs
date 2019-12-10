/*
Write a function as below, which given a filename as parameter, count the total number of lines and total number of blank lines in it.
*/


static void countLines(String f1)
{
  int l=0,b=0;
  try(BufferedReader bf = new BufferedReader(new FileReader(f1)))
  {
 	String line = bf.readLine();
    while(line!=null)
    {
  if (line.trim().isEmpty())
        b++;
      l++;
      line = bf.readLine();
    }
  }
  catch(Exception e){}
  System.out.println(l + " " + b);
}
