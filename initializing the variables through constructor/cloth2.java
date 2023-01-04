class cloth2
{
  String colour;
  int cost;
  String size;
  cloth2(String a,int b,String c)
  {
    colour=a;
    cost=b;
    size=c;
  }
 public static void main(String [] args)
 {
   cloth2 c=new cloth2("white",1000,"M");
   System.out.println(c.colour);
   System.out.println(c.cost);
   System.out.println(c.size);
 }
}