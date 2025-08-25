enum Status
{
    Running,Failed,Pending, Success;
}


public class enum1 {
    public static void main(String args[])
    {
       int i=5;
       Status s= Status.Running;
       Status[] s1= Status.values();
       System.out.println(s);
       System.out.println(s.ordinal());


       for(Status s2:s1)
       {
        System.out.println(s2+ ":" + s2.ordinal());
       }
       
    }
}
