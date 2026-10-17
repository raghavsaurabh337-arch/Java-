class Wrap
{
public static void main(String [] args)
{
int x=Integer.parseInt("123");
Integer x1=Integer.valueOf("101010",16);
int y=x1.intValue();
System.out.println(x);
System.out.println(x1);
System.out.println(y);
}
}