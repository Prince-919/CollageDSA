
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
       
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(100);   // [10,20,30,40,100]

        // used peek
        System.out.println(q.peek());

        // used deletion (poll)
        q.poll();
        q.poll();
        System.out.println(q);
    }
}
