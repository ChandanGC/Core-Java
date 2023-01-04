class emp2
{
  int id;
  double sal;
  char grade;

  emp2(int a,double b,char c)
  {
   id=a;
   sal=b;
   grade=c;
  }
 public static void main(String [] args)
 {
   emp2 e=new emp2(1234,1000.0,'A');
   System.out.println(e.id);
   System.out.println(e.sal);
   System.out.println(e.grade);
 }
}
 