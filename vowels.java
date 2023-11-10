import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class vowels
  {
    public static void main(String args[])
	{
	   String file="gfg.txt";
	   int vcount=0;
	   int acount=0;
	   try(BufferedReader reader=new BufferedReader(new FileReader("gfg.txt")))
	    {
		 int c;
		 while((c=reader.read())!=-1)
		 {
		  char character=(char)c;
		  if(isvowel(character))
		  {
		   vcount++;
		  }
		  if(character=='a'||character=='A')
		  {
			  acount++;
		  }
		 }
		}
		catch(IOException e)
		{
		 System.out.println("there is some ioexception");
		 }
		 System.out.println("number of vowels in the file:"+ vcount);
		 System.out.println("number of character 'a' in the file:"+ acount);
		 }
		 private static boolean isvowel(char c)
		 {
		  c=Character.toLowerCase(c);
		  return c=='a'||c=='i'||c=='o'||c=='e'||c=='u';
		 }
   }
   
		 
		 
	   
       
	  
