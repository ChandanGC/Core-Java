class Sample
{
int a;
String b;
Sample(int a,String b)
{
this.a=a;
this.b=b;
}
public static void main(String [] args)
{
Sample S=new Sample(10,"hi");
System.out.println(S.a);
System.out.println(S.b);
}
}