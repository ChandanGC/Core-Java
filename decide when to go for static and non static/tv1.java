class tv1
{
  static String brand="samsung";
          int cost;
	  String type;
  public static void main(String[]args)
  {
    System.out.println("tv brand is "+brand);
    tv1 t=new tv1();
      t.cost=20000;
     System.out.println("tv cost is "+t.cost);
     tv1 t1=new tv1();
      t1.type="led";
      System.out.println("tv type is "+t1.type);}}