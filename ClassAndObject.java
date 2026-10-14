class phone
{
private int mic;
private int cam;
void setValue()
{
mic=67;
cam=48;
}
void displye()
{
System.out.println(mic);
System.out.println(cam);
}
}

class ClassAndObject
{
public static void main(String [] args)
{
phone n1=new phone();
n1.displye();
n1.setValue();
n1.displye();
}
}