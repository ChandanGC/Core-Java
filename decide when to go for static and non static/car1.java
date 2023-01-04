class car1
{
  static String model_name="kia";
          double cost;
	  String car_type;
 public static void main(String[]args)
 {
   System.out.println("car model name is "+model_name);
     car1 c=new car1();
        c.cost=1500000.0;
  System.out.println("total cost of car is "+c.cost+" rs only ");
        car1 c1=new car1();
	c1.car_type="petrol";
  System.out.println("car type is "+c1.car_type);
  }
 }