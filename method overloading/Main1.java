class Bookmyshow
{
void book(String name)
{
System.out.println("booking by movie name "+name); 
}
void book(int no)
{
System.out.println("booking by seat no "+no);
}
void book(String name,int no)
{
System.out.println("booking by movie name and seat no "+name+" "+no);
}
void book(int no,String name)
{
System.out.println("booking by seat no and movie name "+no+" "+name);
}
}
class Main1
{
public static void main(String [] args)
{
Bookmyshow b=new Bookmyshow();
b.book("kgf");
b.book(2);
b.book("kgf",2);
b.book(2,"kgf");
}
}