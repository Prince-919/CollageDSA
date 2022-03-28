import java.util.Scanner;

class Node
{
    int data;
    Node left,right;

    Node(int data)
    {
        this.data=data;
        left = null;
    }
}

public class treeInsert {

    static Node Insert()
    {
        int data;
        Scanner Sc = new Scanner(System.in);
        Node root= null;
        System.out.print(" Enter Data : ");
         data = Sc.nextInt();
        if(data == -1)
            return null;
        root = new Node(data);
        System.out.print(" Enter left child of : " + root);
        root.left = Insert();
        System.out.print(" Enter right child of : " + root);
        root.right = Insert();
        return root;
    }
    public static void main(String[] args) {

        Node root = Insert();
    }
}
 
