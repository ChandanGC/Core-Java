class Circle6
{
 static void area(int r)
 {
   final double pi=3.142;
         double result=pi*r*r;
   System.out.println(result);
 }
 public static void main(String [] args)
 {
  Circle6 C=new Circle6();
  C.area(5);
  C.area(10);
 }
}