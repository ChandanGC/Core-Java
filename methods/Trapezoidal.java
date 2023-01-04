class Trapezoidal
{
  static void area ()
  {
   double t=0.5;
   int a=2;
   int b=3;
   int h=5;
   double result=t*(a+b)*h;
   System.out.println(result);
   }
   public static void main(String [] args)
   {
    System.out.println("-----main starts----");
    area();
    System.out.println("-----main ends----");
    }
    }