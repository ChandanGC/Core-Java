class Main
{
public static void main(String [] args)
{
String[] arr=new String[4];
arr[0]="Idli";
arr[1]="Vada"; // \t tabspace
arr[2]="Poori"; // \n newline
System.out.println("**********");
System.out.println("index \t items");
System.out.println("**********");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}