class home2
{
  String name;
  int cost;
  String colour;

  home2(String a,int b,String c)
  {
    name=a;
    cost=b;
    colour=c;
  }
 public static void main(String [] args)
 {
   home2 h=new home2("gc",1000,"blue");
   System.out.println(h.name);
   System.out.println(h.cost);
   System.out.println(h.colour);
 }
}