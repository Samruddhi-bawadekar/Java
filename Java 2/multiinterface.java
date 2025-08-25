interface A
{
    int age=44;
    String area="Kolhapur";


    void show();
    void config();
}


interface X
{
    void run();

}

class B implements A,X{
    public void show()
    {
        System.out.println("show");
    }

    public void config()
    {
        System.out.println("config");
    }


    public void run()
    {
        System.out.println("running");
    }
}
public class multiinterface {
    public static void main(String args[])
    {
        B obj=new B();
        obj.config();
        obj.show();
        obj.run();


        System.out.println(A.area);
    }
}
