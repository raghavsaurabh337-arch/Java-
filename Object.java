class Acount
{
void balance()
{
    System.out.println("this is balance");
}

void balance_check()
    {
    System.out.println("this is balance check");
    }
}

class Object
{
public static void main(String [] args)
    {
        System.out.println("hello i'm saurabh");
        Acount obj= new Acount();
        obj.balance();
        obj.balance_check();
    }   
}