class pri
{
private static int x;
static void fun1()
{
x=5;
System.out.println(x);
}
}
class Static_class
{
public static void main(String []args)
{
System.out.println("hye");
//System.out.println(pri.x);
pri.fun1();
pri obj=new pri();
obj.fun1(); 
}
}