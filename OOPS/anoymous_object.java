class A
{
     public A()
     {
        System.out.println("object created");
     }

     public void show()
     {
        System.out.println("In a Show");
     }
}



public class anoymous_object {
    public static void main(String args[])
    {
        new A().show();
    }
}
