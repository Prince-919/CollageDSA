 import java.util.Scanner;
    public class CircularDeletion {

        static class Node
        {
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                next = null;
            }
        }
        Node head;
        Node tail;
        public void Insertion()
        {
            int data,m,n,p;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Enter data : ");
                data = sc.nextInt();
                Node newNode = new Node(data);
                if(head == null)
                {
                    head = newNode;
                    tail = newNode;
                    newNode.next = head;
                }
                else {
                    System.out.println("Enter 1 to insert to item at beginning : ");
                    System.out.println("Enter 2 to insert to item at end : ");
                    System.out.println("Enter 3 to insert to item at position : ");
                    m=sc.nextInt();
                    switch(m)
                    {
                        case 1:
                            newNode.next = head;
                            head = newNode;
                            tail.next = head;
                            break;
                        case 2:
                            tail.next = newNode;
                            tail = newNode;
                            newNode.next = head;
                            break;
                        case 3:
                            System.out.print("Enter position of node to be inserted : ");
                            p=sc.nextInt();
                            Node temp1 = head;
                            for(int i=0; i<p-1; p++)
                            {
                                temp1 = temp1.next;
                            }
                            newNode.next = temp1.next;
                            temp1.next = newNode;
                            break;
                    }
                }
                System.out.print("Do you want insert to more data . If Yes . Press : 1 : ");
                n= sc.nextInt();
            }
            while(n==1);
        }
        public void print()
        {
            Node temp = head;
            if(head == null)
            {
                System.out.println("LinkedList does not Exits : ");
    
            }
            else
            {
                do{
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                while(temp != head);
            }
        }
        public static void main(String[] args) {
    
            CircularInsertion obj = new CircularInsertion();
            obj.Insertion();
            obj.print();
        }
    }

