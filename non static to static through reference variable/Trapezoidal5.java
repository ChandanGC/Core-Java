class Trapezoidal5
{
  void area()
  {
    final double t=0.5;
          int a=2;
	  int b=3;
	  int h=4;
	double result=t*(a+b)*h;
   System.out.println(result);
   }
   public static void main(String [] args)
   {
     Trapezoidal5 T=new Trapezoidal5();
      T.area();
    }
   }