class Trapezoidal6
{
  static void area(int b, int a,int h)
  {
    final double t=0.5;
          double result=t*(a+b)*h;
    System.out.println(result);
  }

 public static void main(String[]args)
 {
    Trapezoidal6 T=new Trapezoidal6();
   T.area(10,5,20);
 }
}