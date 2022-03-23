
import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        // Stack Use to (push, peek, pop)
        Stack<Integer> c = new Stack<>();
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter the number : ");
            int value = sc.nextInt();
            c.push(value);
        }
        // push (add)
        c.push(100);
        c.push(200);
        c.push(300);
        c.push(400);

        // peek print top element
        int d = c.peek(); // [100, 200, 300, 400]

        // pop (deletion)
        // c.pop();
        System.out.println(c);
    }
}
