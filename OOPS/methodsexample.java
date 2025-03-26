class Computer
{
    public void PlayMusic()
    {
        System.out.println("Music Playing....");
    }

    public String getPen(int cost)
    {
        if(cost>=10)
       return "Pen";
       else
       return"Nothing";
    }
}




public class methodsexample
{
    public static void main(String args[])
    {
       Computer obj=new Computer();
       obj.PlayMusic();
       String str=obj.getPen(2);
       System.out.println(str);
    }
}