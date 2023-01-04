class Iphone_v1
{
void unlock()
{
System.out.println("unlock with face id ");
}
}
class Iphone_v2 extends Iphone_v1
{
void unlock()
{
System.out.println("unlock with face id with mask ");
super.unlock();
}
}
class Main
{
public static void main(String [] args)
{
Iphone_v2 v2=new Iphone_v2();
v2.unlock();
}
}