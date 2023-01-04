class Circle10
{
  void area(int r)
  { 
    final double pi=3.142;
    double result=pi*r*r;
    System.out.println(result);
    }
   }
  class Demo22
  {
   public static void main(String [] args)
   {

     Circle10 C=new Circle10();
            C.area(5);
   }
 }