class iphone_v1
{
void unlock()
{
System.out.println("unlock with Face id");
}
}
class iphone_v2 extends iphone_v1
{
void unlock()
{
System.out.println("unlock with faceid with mask");
super.unlock();
}
}
class Main1
{
public static void main(String [] args)
{
 iphone_v2 v2=new iphone_v2();
 v2.unlock();
}
}