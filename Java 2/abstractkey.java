abstract class Car{
    public  abstract void  drive();
    
public void playMusic()
{
    System.out.println("playing music");
}
}


class WagonR extends Car{
public   void  drive()
{
   System.out.println("driving a car");
}
}

public class abstractkey {
    public static void main(String args[])
    {
       Car obj=new WagonR();
       obj.drive();
       obj.playMusic();
    }
}
