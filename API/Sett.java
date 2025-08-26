import java.util.HashSet;
import java.util.Set;

public class Sett {
    public static void main(String args[])
    {
        Set<Integer> nums= new HashSet<Integer>();
        nums.add(62);
        nums.add(82);
        nums.add(65);
        nums.add(71);

        for(int n:nums)
        {
            System.out.println(n);
        }
    }
}
