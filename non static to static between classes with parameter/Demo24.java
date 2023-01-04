class Cone10
{
 void area(int r)
	{
   final double t=30.5;
   final double z=0.5;
   double result=t*z*r*r;
   System.out.println(result);
   }
  }
   class Demo24
   {
    public static void main(String [] args)
    { 
     Cone10 C=new Cone10();
     C.area(5);
     }
    }