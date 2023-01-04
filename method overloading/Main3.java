class Uber
{
static void book(int amt)
{
System.out.println("book by amt rs"+amt);
}
static void book(String place)
{
System.out.println("book by place "+place);
}
static void book(int amt,String place)
{
System.out.println("book by amt  and place "+amt+"rs "+place);
}
static void book(String place,int amt)
{
System.out.println("book by place and amt "+place+" "+amt+"rs");
}
}
class Main3
{
public static void main(String[] args)
{
Uber.book(50);
Uber.book("j p nagar");
Uber.book(50,"j p nagar");
Uber.book("j p nagar",50);
}
}