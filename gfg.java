import java.io.FileWriter;
import java.io.IOException;
class gfg
{
 public static void main(String args[])
 {
  try
   {
     FileWriter fw= new FileWriter("gfg.txt");
	 fw.write("Hello I am Sana!!!");
	 fw.close();
	 System.out.println("\nFile write done");
   }
   catch(IOException e)
   {
     System.out.println("there are some IOException...");
   }
  }
 }
 
    