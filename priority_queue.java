
import java.util.*;

public class priority_queue {
    public static void main(String[] args) {

        // Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());  // reverse order
        Queue<Integer> p = new PriorityQueue<>();
        // Adding method (offer)
        p.offer(1);
        p.offer(2);
        p.offer(3);
        p.offer(4);
        p.offer(10);
        System.out.println(p);
        
        // deletion method (poll)
        p.poll();
        System.out.println(p);
    }
}
