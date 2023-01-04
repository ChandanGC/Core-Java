class Triangle11
{
  static double area()
  {
    double t=0.5;
    int b=5;
    int h=10;
    double result=t*b*h;
  return result;
}
}
class Demo25
{
public static void main(String [] args)
{
  Triangle11 T=new Triangle11();
  double x=T.area();
  System.out.println(x);
}
}