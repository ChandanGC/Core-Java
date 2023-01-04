class Circle555
{
 void area(int r)
 {
   final double pi=3.142;
        double result=pi*r*r;
	System.out.println(result);
  }
 }
class Demo555
{
 public static void main(String [] args)
 {
   Circle555 C=new Circle555();
           C.area(5);
  }
 }