class Sample2
{
 int y=10;
}
class Demo2 extends Sample2
{
   void cool()
   {
     System.out.println("hey its cool");
   }
}
class Tester2 extends Demo2
{
  int x=90;
}
class Mainclass2
{
 public static void main(String [] args)
 {
  Tester2 t2=new Tester2();
  System.out.println(t2.y);
  System.out.println(t2.x);
  t2.cool();

 }
}