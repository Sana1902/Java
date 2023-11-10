
class static
{
  static String companyname="Infosys";
  String name;
  int em_id;
 static void change_name()
  {
   String companyname="microsoft";
  }
  void display()
  {
   System.out.println("Employee name:"+ name +"employee id:"+ em_id + "company name:" + companyname);
  }
  static 
  {
   System.out.println("this is a information of employee");
  }
 public static void main(String args[])
  {
   static e1= new static();
   e1.name="Sana_Mujawar";
   e1.emp_id=2346;
   e1.display();
   e1.change_name();
   e1.display();
  }
}
   
 
      