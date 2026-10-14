class animal{

void dog()
{
String a="hay i am dogs";

System.out.println(a);
}

void cat()
{
String a="hay i am cat";
System.out.println(a);
}
}

class Any
{
public static void main(String []args)
{
System.out.println("this is main class ");
animal m1=new animal();
m1.dog();
m1.cat();
}
}