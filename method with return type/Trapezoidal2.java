class Trapezoidal2
{
  static double area()
  {
    double t=0.5;
    int b=3;
    int a=2;
    int h=4;
    double result=t*(a+b)*h;
  return result;
}
public static void main(String [] args)
{
  double x=area();
  System.out.println(x);
}
}