class IRCTC
{
void book(int no)
{
System.out.println("booking by seat no "+no);
}
void book(String place)
{
System.out.println("booking by place "+place);
}
void book(int no,String place)
{
System.out.println("booking by seat no "+no+" and "+"place "+place);
}
void book(String place,int no)
{
System.out.println("booking by place "+place+" and "+"seat no "+no);
}
}
class Main2
{
public static void main(String[] args)
{
IRCTC i=new IRCTC();
i.book(5);
i.book("Bengaluru");
i.book(5,"Bengaluru");
i.book("Bengaluru",5);
}
}