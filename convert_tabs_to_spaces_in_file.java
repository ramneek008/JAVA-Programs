/*
Some files use tab characters to align data in columns. But it may not be readable by all applications. So, your task is to convert tabs in a file to spaces.

Usually, tab stops are set to eight (8) characters. For example, let the input file contains a line as below: -

abc_____defghi__hello
where ____ represents the tab, then first tab must be replace by 5 spaces and the second tab must be replaced by 2 spaces.

Write a function that reads input file and save the content after replacing all tab characters by the appropriate number of spaces in output file.
*/


static void replaceTabs(String input, String output)
{
    try {
    BufferedReader in = new BufferedReader(new FileReader(input));
    BufferedWriter out = new BufferedWriter(new FileWriter(output));
    String s;
    while((s = in.readLine()) != null) {
      char c[] = new char[100];
      s.getChars(0,s.length(),c,0);
      int z= s.length();
      for(int i=0;i<z;i++) {
        if(c[i] == 9){
          c[i] = 32;
          z = z + (7 - i%8);
          for(int j =0;j<(7-(i%8));j++){
            for(int k = z;k>i;k--) {
              c[k] = c[k-1];
            }
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      for (char ch: c) {
        if(ch == 0)
          break;
        sb.append(ch);
      }
      s = new String(sb);
      System.out.println(s);
    }
  }
  catch(IOException e){}
}
