class base
{
 int n1,n2;
 void getdata(int a, int b)
  {
   n1=a;
   n2=b;
  }
}
class add extends base
{
 void addition()
 {
  System.out.println("Addition:" + (super.n1+super.n2));
 }
}
class subtract extends base
 {
  void subtraction()
{
  System.out.println("subtraction:" + (super.n1-super.n2));
}
}
class multiply extends base
 {
  void multiplication()
{
  System.out.println("multiplication" + (super.n1*super.n2));
}
}
class divide extends base
 {
  void division()
{
  System.out.println("division" + (super.n1/super.n2));
}
}
class calces
{
 public static void main(String args[])
 {
  base b1=new base();
  b1.getdata(10,2);
  add b2=new add();
  b2.addition();
  subtract b3=new subtract();
  b3.subtraction();
  divide b4 =new divide();
  b4.division();
 }
}
  

