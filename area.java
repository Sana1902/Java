import java.util.Scanner;
class area
{
 double len,bre,recarea;
 void setdim(double l,double b)
  {
   len=l;
   bre=b;
  }
  void getarea()
  {
   recarea=(len*bre);
  System.out.println("The area of rectangle:"+ recarea);
  }
public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the length of rectangle:");
    double len=sc.nextDouble(); 
   System.out.println("Enter the breadth of rectangle:");
    double bre=sc.nextDouble();
   area rc= new area();
   rc.setdim(len,bre);
   rc.getarea();
 }
}


   
   