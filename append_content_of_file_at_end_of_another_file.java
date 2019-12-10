/*
Write a function as below, which given three filenames in parameters, append the contents of first file followed by contents of second file in the third file.

void appendFiles(char f1[20], char f2[20], char f3[20])

The contents of files pointed by f1 and f2 must be written in file f3 in that order.
*/


static void appendFiles(String f1, String f2, String f3)
{
   try(BufferedReader brf1 = new BufferedReader(new FileReader(f1)))
  {
  	String line  = brf1.readLine();
   
   while(line != null)
   {
     
      try{    
           FileWriter fw=new FileWriter(f3,true);    
           fw.write(line + "\n" );    
           fw.close();    
          }catch(Exception e){}   
     line = brf1.readLine();
   }
}
   catch (IOException ex) {
    }
  try(BufferedReader brf2 = new BufferedReader(new FileReader(f2)))
  {
   String line2  = brf2.readLine();
   while(line2 != null)
   {
      try{    
           FileWriter fw=new FileWriter(f3,true);    
           fw.write(line2+ "\n");    
           fw.close();    
          }catch(Exception e){}   
     line2 = brf2.readLine();
   }
}
   catch (IOException ex) {
    }
}
