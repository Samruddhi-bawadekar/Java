class Human
{
    private int  age;
    private String name;

    public  int getAge()
    {
          return age;
    }

    public void setAge(int a)
    {
        age=a;
    }

    public  String  getName()
    {
          return name;
    }
  
    public void setName(String n)
    {
        name=n;
    }


}

public class enccapsule {
    public static void main(String args[])
    {
        Human obj=new Human();
        obj.setAge(21);
        obj.setName("Samruddhi");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
