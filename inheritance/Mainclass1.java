class Sample1
{
  int c=10;
}

class Demo1 extends Sample1
{
   void test()
   {
    System.out.println("hey its test....");
   }
}
class Mainclass1
{
 public static void main(String [] args)
	{
 Demo1 d1=new Demo1();
 System.out.println(d1.c);
 d1.test();
	}
}