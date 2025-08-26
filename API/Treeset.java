import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String args[])
    {
       Set <Integer> nums= new TreeSet<Integer>();
       nums.add(61);
       nums.add(55);
       nums.add(77);

       for( int n:nums)
       {
          System.out.println(n);
       }
    }
}
