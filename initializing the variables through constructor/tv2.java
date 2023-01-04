class tv2
{
   String brand;
   int cost;
   String type;
  
  tv2(String a,int b,String c)
  {  
      brand=a;
      cost=b;
      type=c;
  }
 public static void main(String [] args)
 {
   tv2 t=new tv2("samsung", 1000,"led");
   System.out.println(t.brand);
   System.out.println(t.cost);
   System.out.println(t.type);
 }
}