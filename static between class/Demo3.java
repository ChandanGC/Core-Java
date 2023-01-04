class Trapezoidal3
{
 static void area()
 {
   final double t=0.5;
         int a=2;
	 int b=3;
	 int h=4;
	 double result=t*(a+b)*h;
   System.out.println(result);
  }
 }
 class Demo3
 {
  public static void main(String [] args)
  {
   Trapezoidal3.area();
   }
  }