import java.util.List;
import java.util.ArrayList;

public class list {
    public static void main(String args[])
    {
        List <Integer> nums=new ArrayList<Integer>();
        nums.add(7);
        nums.add(1);
        nums.add(9);
        nums.add(5);
        nums.add(3);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(5));
    }
}
