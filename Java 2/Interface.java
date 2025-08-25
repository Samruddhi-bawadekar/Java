interface A{
    int age=21;
    String area="Kolhapur";

    void show();
    void config();
}


class B implements A{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String args[])
    {
          B obj=new B();
          obj.show();
          obj.config();

          System.out.println(A.area);
    }
}
