import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;//

public class foreach {
    public static void main(String args[])
    {
        List<Integer>nums=Arrays.asList(4,6,9,1);
        
        nums.forEach(n->System.out.println(n));

    }
}
