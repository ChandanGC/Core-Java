class Mobile2
{
  static String model_name="iphone";
          int cost;
	  String colour;
   
   Mobile2(int a,String b)
   {
      cost=a;
      colour=b;
   }
 public static void main(String [] args)
 {
   Mobile2 M=new Mobile2(1000,"black");
   System.out.println("mobile model name is "+model_name);
   System.out.println(M.cost);
   System.out.println(M.colour);
 }
}