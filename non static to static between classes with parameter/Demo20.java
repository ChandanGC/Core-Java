class Ellipse10
{
  void area(int a,int b)
 {
    final double pi=3.142;
     double result=pi*a*b;
   System.out.println(result);
   }
  }
 class Demo20
 {
  public static void main(String [] args)
  {
    Ellipse10 E=new Ellipse10();
    E.area(2,3);
  }
 }