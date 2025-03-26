class A
{
   public A()
   {
    System.out.println("In A Constructor");
   }

   public A(int n)
   {
    System.out.println("In A's Para Constructor");
   }
}


class B extends A
{
    
    public B()
   {
    System.out.println("In B Constructor");
   }

   public B(int n)
   {

    this();
    System.out.println("In B's Para Constructor");
   }

}



public class super_this {
    public static void main (String args[])
    {
        B obj=new B(5);
    }
}
