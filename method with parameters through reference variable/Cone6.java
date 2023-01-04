class Cone6
{
 static void area(int r)
 {
   final double t=30.5;
   final double half=0.5;
   double result=t*half*r*r;
  System.out.println(result);
 }
 public static void main(String [] args)
 {
   Cone6 C=new Cone6();
  C.area(5);
  C.area(10);
 }
}