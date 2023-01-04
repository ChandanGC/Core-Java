class Cone9
{
 void area()
	{
   final double t=30.5;
   final double z=0.5;
         int r=5;
   double result=t*z*r*r;
   System.out.println(result);
   }
  }
   class Demo16
   {
    public static void main(String [] args)
    { 
     Cone9 C=new Cone9();
     C.area();
     }
    }