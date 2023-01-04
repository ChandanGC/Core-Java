class Ellipse6
{
  void area(int a,int b)
  {
    final double pi=3.142;
    double result=pi*a*b;
    System.out.println(result);
  }
  public static void main(String [] args)
  {
    Ellipse6 E=new Ellipse6();
        E.area(5,10);
   }
  }