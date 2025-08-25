class a
{
     public void show()
     {
        System.out.println("By Samruddhi");
     }


     public void add(int i,int j)
     {
        System.out.println(i+j);
     }
}

/*class b extends a
{
   
} */


class b extends a
{
   public void show()
     {
        System.out.println("By Sana");
     }
}




public class finalkey {
    public static void main(String args[])
    {
        b obj=new b();
        obj.show();
        obj.add(4,9);
    }
}
