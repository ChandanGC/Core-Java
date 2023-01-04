class Pharma
{
static void order(int qty)
{
System.out.println("order by qty "+qty);
}
static void order(String name)
{
System.out.println("order by tablet name "+name);
}
static void order(int qty,String name)
{
System.out.println("order by qty and tablet name "+qty+" "+name);
}
static void order(String name,int qty)
{
System.out.println("order by tablet name and qty "+name+" "+qty);
}
}
class Main5
{
public static void main(String [] args)
{
Pharma.order(5);
Pharma.order("dolo 650");
Pharma.order(5,"dolo 650");
Pharma.order("dolo 650",5);
}
}