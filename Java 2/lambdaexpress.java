@FunctionalInterface

interface A{
    void show(int i);
}



public class lambdaexpress {
    public static void main(String args[])
    {
       A obj= i ->System.out.println("in show " +i);
       obj.show(1);
    }
}
