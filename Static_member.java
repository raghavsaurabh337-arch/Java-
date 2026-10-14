class sra
{
int x;
private static int y;
void fun1(){
y=22;
x=5;
}
void fun2(){
System.out.println("funcation 2:  "+y);
System.out.println("funcation 2:  "+x);
}
}
class Static_member
{
public static void main(String []args)
{
System.out.println("this is using static and private member access");
sra obj = new sra();
obj.fun1();
obj.fun2();
System.out.println("obj2 create");
sra obj2 = new sra();
obj2.fun1();
obj2.fun2();




}
}