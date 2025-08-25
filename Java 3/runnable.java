class T implements Runnable
{
    public void run()
    {
        for(int i=1;i<5;i++)
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


class Th implements Runnable
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class runnable {
    public static void main(String args[])
    {
       Runnable obj1=new T();
       Runnable obj2=new Th();

       
        
      Thread t1=new Thread(obj1);
      Thread t2=new Thread(obj2);

      t1.start();
      t2.start();
    }
}
