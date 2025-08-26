import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class iterator {
    public static void main(String args[])
    {
        Collection <Integer> nums=new TreeSet<Integer>();
        nums.add(67);
        nums.add(78);
        nums.add(69);
        nums.add(65);
        nums.add(44);

        Iterator<Integer>values= nums.iterator();
        
        while(values.hasNext())
        System.out.println(values.next());
    }
}
