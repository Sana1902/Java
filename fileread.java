import java.io.*;
public class fileread
{
 public static void main(String args[])
{
 int scount=0;
 String filepath="sana.txt";
 try(BufferedReader br= new BufferedReader(new FileReader(filepath)))
 {
 String line;
 while((line=br.readLine())!=null)
{
 for(char c: line.toLowerCase().toCharArray())
{
 if (c=='s')
{
 scount++;
 }
}
}
}
catch(IOException e)
{
 System.out.println("this is a exception");
}
System.out.println("the number of s in the file:"+ scount);
}
}