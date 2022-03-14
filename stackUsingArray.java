import java.util.Scanner;
class Stack
{
    int top = -1;
    int n=10;
    int arr[] = new int[n];
    void push()
    {
        if(top == (n-1))
        {
            System.out.print("Overflow : ");
        }
        else{
            System.out.print("Enter  data : ");
            int data = sc.nextInt();
            top = top + 1;
            arr[top] = data;
            System.out.print("item inserted : ");
        }}
        void pop()
        {
            if(top == -1)
            {
                System.out.print("Underflow : ");
        }
            else{
                top=top-1;
                System.out.print("item deleted : ");
            }
    }
    void display()
    {
        System.out.print("items are : ");
        for(int j=top; j>=0; j--)
        {
            System.out.print(arr[j]);
        }
    }
}
public class stackUsingArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Stack obj = new Stack();

    }
}

