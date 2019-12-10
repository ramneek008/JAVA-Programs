/*
Write a function as below, which given two filenames in parameters, change the first letter of every word in first file to uppercase of that character if it is a lower case character and store it in the second file.
*/


static void capitalizeWords(String source, String dest)
{
    try(BufferedReader bf = new BufferedReader(new FileReader(source)))
  {
    String line = new String(bf.readLine());
    while(line!=null){
    char ch[] = line.toCharArray(); 
    for(int i=0;i<line.length();i++)
    {
          // if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') { 
       if (i == 0 || ch[i-1] == ' ') { 
      if (ch[i] >= 'a' && ch[i] <= 'z') { 
                  ch[i] = Character.toUpperCase(ch[i]);
                } 
            }  
    }
          try{    
           FileWriter fw=new FileWriter(dest,true);
           line = new String(ch); 
           fw.write(line + "\n" );    
           fw.close();    
          }catch(Exception e){}
      line = new String(bf.readLine());
    }
  }
  catch (Exception e){}
}
