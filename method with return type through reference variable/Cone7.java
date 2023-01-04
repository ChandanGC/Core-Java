class Cone7
{
  static double area()
  {
    double t=30.5;
    double z=0.5;
    int r=5;
    double result=t*z*r*r;
  return result;
}
public static void main(String [] args)
{
  Cone7 C=new Cone7();
  double x=C.area();
  System.out.println(x);
}
}