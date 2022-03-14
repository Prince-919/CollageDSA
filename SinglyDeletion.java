import java.util.Scanner;

public class SinglyDeletion {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next =  null;
        }
    }
    Node head;
    public  void creation()
    {
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter data : ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }else{
                System.out.println("Enter 1 Deletion the item at beginning : ");
                System.out.println("Enter 2 Deletion the item at end : ");
                System.out.println("Enter 3 Deletion the item at position  : ");
            
                m=sc.nextInt();
                switch(m){
                    case 1:
                    newNode.next = head;
                    head=newNode;
                    break;
                    case 2:

                    Node temp = head;
                    while(temp.next != null)
                    {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    break;

                    case 3:
                    System.out.print("Enter Position of Node to be inserted :");
                    p=sc.nextInt();
                    Node temp1= head;
                    for(int i=0; i<(p-1); i++)
                    {
                        temp1 = temp1.next;
                    }
                    newNode.next = temp1.next;
                    temp1.next = newNode;
                    break;
                    
                }
            }
            System.out.print("Do u want to add more data. If yes, press : 1:");
            n = sc.nextInt();
        }
        while(n==1);
    }

    // Deletion
    
    public void deletion()
    {
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do{
            if(head == null)
            {
                System.out.print("LinkedList is Empty : ");
            }
            else{

                System.out.println("Enter 1 insert the item at beginning : ");
                System.out.println("Enter 2 insert the item at end : ");
                System.out.println("Enter 3 insert the item at position  : ");
            
                m=sc.nextInt();
                switch(m)
                {
                    // deleteion from beginning
                    case 1:
                    Node temp = head;
                    temp = temp.next;
                    head = temp;
                    break;
                    
                    // deletion from end
                    case 2:
                    Node temp2 = head;
                    Node ptr = temp2.next;
                    while(ptr.next != null)
                    {
                        temp2=ptr;
                        ptr=ptr.next;
                    }
                    temp2.next=null;
                    break;

                    //deletion from posotion 
                    case 3:
                    System.out.print("Enter position of node to be deleted : ");
                    p=sc.nextInt();
                    Node temp3 = head;
                    Node ptr2 = temp3.next;
                    for(int i=0; i<p-2; i++)
                    {
                        temp3 = ptr2;
                        ptr2 = ptr2.next;
                    }
                    temp3.next = ptr2.next;
                    break;
                }
            }
            System.out.print("Do you want to delete more data . If Yes , Press : 1:");
            n= sc.nextInt();
        }
        while(n==1);
    }

    // print
    public void print()
    {
        Node temp = head;
        // if(head == null)
        // {
        //     System.out.print("LinkedList does not exits : ");
        // }
        // else
        {
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
     }
    public static void main(String[] args) {
        
        SinglyDeletion obj = new SinglyDeletion();
        obj.creation();
        obj.print();
        obj.deletion();
    }
}


