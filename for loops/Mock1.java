class Mock1
{
  static double area()
  {
    final double pi=3.142;
    int r=5;
    double result=pi*r*r;
    return result;
  }
 public static void main(String [] args)
 {
	 Mock1 M=new Mock1();
    double x=M.area();
    System.out.println(x);
  }
 }