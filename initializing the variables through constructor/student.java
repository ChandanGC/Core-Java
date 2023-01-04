class student
{
  int std_id;
  String std_name;
  double std_fees;
  student(int a,String b,double c)
  {
     std_id=a;
     std_name=b;
     std_fees=c;
  }
  public static void main(String[]args)
  {
     student s=new student(1234,"GC",5000.0);
     System.out.println(s.std_id);
     System.out.println(s.std_name);
     System.out.println(s.std_fees);
  }
 }