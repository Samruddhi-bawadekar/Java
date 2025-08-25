 abstract class Aa{
     public  abstract void show();
     
}


public class abstnanonymous {
    public static void main(String args[])
    {                                                                                                                   
        Aa obj= new Aa()
        {
            public void show()
            {
                System.out.println("abstract & Anonymous inner class");
            }
        };

        obj.show();
    }
}
