 import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class gfg1
{
 public static void main(String args[])
  {
    try
     {
		FileReader fr=new FileReader("gfg.txt");
		FileWriter fw= new FileWriter("gfgoutput.txt");
		String str="";
		int i;
		while((i= fr.read())!=-1)
		{
		 		 str+=(char)i;
		 
		}
		System.out.println("file reading and writing both done");
	}
	catch(IOException e)
	{
	  System.out.println("there are some IOException");
	 }
    }
}
