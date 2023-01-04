class Cone11
{
  static double area()
  {
    double t=30.5;
    double z=0.5;
    int r=5;
    double result=t*z*r*r;
  return result;
}
}
class Demo32
{
public static void main(String [] args)
{
  Cone11 C=new Cone11();
  double x=C.area();
  System.out.println(x);
}
}