class Trapezoidal11
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
}
class Demo27
{
public static void main(String [] args)
{
  Trapezoidal11 T=new Trapezoidal11(); 
  double x=T.area();
  System.out.println(x);
}
}