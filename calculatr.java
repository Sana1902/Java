abstract class shape
{
 double dim1,dim2;
 abstract void area();
 void getdim(double a,double b)
  {
   dim1=a;
   dim2=b;
  }
}
class triangle extends shape
{
  void area()
  {
    double trarea=0.5*(super.dim1*super.dim2);
    System.out.println("the area of triangle is:" + trarea);
  }
}
class rectangle extends shape
{
  void area()
  {
    double rcarea=(super.dim1*super.dim2);
    System.out.println("the area of rectangle is:" + rcarea);
  }
}
class calculatr
{
 public static void main(String args[])
 {
  triangle s1=new triangle();
   s1.getdim(20,10);
  s1.area();
  rectangle s2= new rectangle();
  s.getdim(20,10);
  s2.area();
 }
  } 



 