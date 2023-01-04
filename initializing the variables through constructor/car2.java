class car2
{
  static String name="kia";
          double cost;
	  String car_type;

    car2(double a,String b)
    {
       cost=a;
       car_type=b;
    }
   public static void main(String [] args)
   {
     car2 c=new car2(10000.0,"petrol");
     System.out.println("car model name is "+name);
     System.out.println(c.cost);
     System.out.println(c.car_type);
   }
  }