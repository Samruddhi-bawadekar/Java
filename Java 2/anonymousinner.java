class In{

    public void show3()
    {
        System.out.println("show3");
    }
}


public class anonymousinner {
    public static void main(String args[])
    {
         In obj=new In()
         {
              public void show3()
              {
                System.out.println("Anonymous Inner class");
              }
         };
         obj.show3();
    }
}
