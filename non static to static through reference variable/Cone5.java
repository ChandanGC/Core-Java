class Cone5
{
  void area()
  { 
    final double t=30.5;
    final double z=0.5;
     int r=5;
     double result=t*z*r*r;
   System.out.println(result);
   }
  public static void main(String [] args)
  {
    Cone5 C=new Cone5();
    C.area();
  }
 }