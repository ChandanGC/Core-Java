class Myntra
{
  void search(int code)
  {
   System.out.println("searching by product code "+code);
  }
  void search(String name)
  {
   System.out.println("searching by product name "+name);
  }
  void search(int code,String name)
  {
   System.out.println("searching by product code and name "+code+" "+name);
  }
  void search(String name,int code)
  {
   System.out.println("searching by product name and code "+name+" "+code);
  }
}
class Main
{
 public static void main(String [] args)
 {
  Myntra m=new Myntra();
  m.search(123);
  m.search("shirt");
  m.search(123,"shirt");
  m.search("shirt",123);
 }
}
  

  




