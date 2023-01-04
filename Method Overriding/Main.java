class Whatsapp_v1
{
void status()
{
System.out.println("status with text");
}
}
class Whatsapp_v2 extends Whatsapp_v1
{
void status()
{
System.out.println("status with text,images and videos");
}
}
class Main
{
public static void main(String [] args)
{
 Whatsapp_v2 v2=new Whatsapp_v2();
 v2.status();
}
}