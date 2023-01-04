class Circle11
{
 static double area()
 {
  double pi=3.142;
  int r=5;
  double result=pi*r*r;
  return result;
 }
 }
 class Demo30
 {
 public static void main(String[] args)
 {
   Circle11 C=new Circle11 ();
   double x=C.area();
   System.out.println(x);
  }
 }