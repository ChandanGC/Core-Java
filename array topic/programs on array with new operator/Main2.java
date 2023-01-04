class Main2
{
public static void main(String[] args)
{
byte[] arr=new byte[4];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;

System.out.println("index \t values");

for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}