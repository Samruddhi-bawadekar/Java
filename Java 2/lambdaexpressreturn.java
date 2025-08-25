@FunctionalInterface
interface a{
   int add(int i,int j);
}


public class lambdaexpressreturn {
    public static void main(String args[])
    {
          a obj=( i,j)->i+j;

          int result=obj.add(5,6);
          System.out.println(result);
    }
}
