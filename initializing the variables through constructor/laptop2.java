class laptop2
{
  String name;
  int cost;
  String brand;
 
 laptop2(String a,int b,String c)
 {
   name=a;
   cost=b;
   brand=c;
 }
 public static void main(String [] args)
 {
   laptop2 l=new laptop2("gaming laptop",1000,"dell");
   System.out.println(l.name);
   System.out.println(l.cost);
   System.out.println(l.brand);
 }
}