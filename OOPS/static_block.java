class Mobile
{
    String brand;
    int price;
    static String name;


public Mobile()
{
brand="";
price=200;
System.out.println("constructor");

}

static
{
    name="Phone";
    System.out.println("static block");
}
}

public class static_block 
{
    public static void main(String[] args) 
    {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
    }


}
