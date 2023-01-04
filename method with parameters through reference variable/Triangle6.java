class Triangle6
{
  static void area (int b, int h)
  {
    final double t=0.5;
    double result=t*b*h;
    System.out.println(result);
   }
   public static void main(String [] args)
   {
     Triangle6 T=new Triangle6();
     T.area(5,10);
    }
  }