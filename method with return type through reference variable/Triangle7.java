class Triangle7
{
  static double area()
  {
    double t=0.5;
    int b=5;
    int h=10;
    double result=t*b*h;
  return result;
}
public static void main(String [] args)
{
  Triangle7 T=new Triangle7();
  double x=T.area();
  System.out.println(x);
}
}