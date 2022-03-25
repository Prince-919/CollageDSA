import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);   // [20,40,10,30]
        
        
        //remove
        //s.remove(40); // [20, 10,30]

        // clear
       // s.clear();  // []

        int d = s.size();

        System.out.println(d);

        System.out.println(s.contains(70));
    }
}
