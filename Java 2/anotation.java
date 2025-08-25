class A{
    public void showDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}


class B extends A{
    @Override
    public void showDataWhichBelongsToThisClass()
    {
        System.out.println("In B show");
    }
}

public class anotation {
    public static void main(String args[])
    {
       B obj =new B();
       obj.showDataWhichBelongsToThisClass();
    }
}
