class Swiggy
{
static void order(int qty)
{
System.out.println("order by qty "+qty);
}
static void order(String food)
{
System.out.println("order by food "+food);
}
static void order(int qty,String food)
{
System.out.println("order by qty and food "+qty+" "+food);
}
static void order(String food,int qty)
{
System.out.println("order by food and qty "+food+" "+qty); 
}
}
class Main4
{
public static void main(String[] args)
{
Swiggy.order(5);
Swiggy.order("Dosa");
Swiggy.order(5,"Dosa");
Swiggy.order("Dosa",5);
}
}