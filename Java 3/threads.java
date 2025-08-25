class T extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


class Th extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Hello");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class threads {
    public static void main(String args[])
    {
       T obj1=new T();
       Th obj2=new Th();
        
       //System.out.println(obj1.getPriority());//
       //obj2.setPriority(1);//
       obj2.setPriority(Thread.MAX_PRIORITY);
       obj1.start();

       try {
        Thread.sleep(2);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       obj2.start();
    }
}
