class Triangle9
{
  void area()
 {
   final double t=0.5;
         int b=5;
	 int h=10;
   double result=t*b*h;
   System.out.println(result);
  }
 }
 class Demo9
 {
  public static void main(String [] args)
  {
    Triangle9 T=new Triangle9();
    T.area();
  }
 }