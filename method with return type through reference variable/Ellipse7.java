class Ellipse7
{
  static double area()
  {
    double pi=3.142;
    int a=5;
    int b=10;
    double result=pi*b*a;
  return result;
}
public static void main(String [] args)
{
  Ellipse7 E=new Ellipse7();
  double x=E.area();
  System.out.println(x);
}
}