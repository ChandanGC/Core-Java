class Ellipse11
{
  static double area()
  {
    double pi=3.142;
    int a=5;
    int b=10;
    double result=pi*b*a;
  return result;
}
}
class Demo28
{
public static void main(String [] args)
{
  Ellipse11 E=new Ellipse11();
  double x=E.area();
  System.out.println(x);
}
}