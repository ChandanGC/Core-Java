class Trapezoidal1
{
  static void area(int b, int a,int h)
  {
    final double t=0.5;
          double result=t*(a+b)*h;
    System.out.println(result);
  }

 public static void main(String[]args)
 {
   area(10,5,20);
 }
}