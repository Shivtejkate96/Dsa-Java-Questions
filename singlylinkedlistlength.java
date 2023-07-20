import java.util.Scanner;

public class Main {

    class singlylinkedlist {
        public class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;

        public void creation() {
            Scanner sc = new Scanner(System.in);
            int n = 1; // Initialize n to 1 to enter the loop
            while (n == 1) {
                System.out.println("Enter data: ");
                int data = sc.nextInt();
                Node newnode = new Node(data);
                if (head == null) {
                    head = newnode;
                } else {
                    newnode.next = head;
                    head = newnode;
                }
                System.out.println("Press 1 to enter more, else any other number: ");
                n = sc.nextInt();
            }
        }
        
        public void length()
        {
            int count=0;
            Node temp=head;
            while(temp!=null)
            {
                temp=temp.next;
                count++;
            }
            System.out.println(count);
        }

        public void traverse() {
            Node temp = head;
            if (head == null) {
                System.out.println("List is empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println(); // Add a new line after printing all elements
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        singlylinkedlist ll = main.new singlylinkedlist();
        ll.creation();
        ll.traverse();
        ll.length();
    }
}
