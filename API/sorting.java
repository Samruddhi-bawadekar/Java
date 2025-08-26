import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
    public static void main(String args[])
    {
        List<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(10);
        nums.add(1);
        nums.add(7);

        Collections.sort(nums);
        System.out.println(nums);

        
    }
}
