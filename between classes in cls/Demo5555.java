class Circle5555
{
  double area()
  {
    final double pi=3.142;
          int r=5;
	  double result=pi*r*r;
	  return result;
  }
 }
class Demo5555
{
 public static void main(String [] args)
 {
   Circle5555 C=new Circle5555();
     double x=C.area();
     System.out.println(x);
   }
  }