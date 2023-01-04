class Trapezoida10
{
  void area(int a,int b,int h)
 {
   final double t=0.5;
    double result=t*(a+b)*h;
   System.out.println(result);
  }
 }
 class Demo19
 {
  public static void main(String [] args)
  {
    Trapezoida10 T=new Trapezoida10();
   T.area(2,3,4);
   }
  }