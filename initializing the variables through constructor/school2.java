class school2
{
   String name;
   char grade;
   int strength;

  school2(String a,char b,int c)
  {
    name=a;
    grade=b;
    strength=c;
  }
 public static void main(String [] args)
 {
   school2 s=new school2("gcs",'A',100);
   System.out.println(s.name);
   System.out.println(s.grade);
   System.out.println(s.strength);
 }
}