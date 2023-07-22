import java.util.Scanner;

public class Main {

    class SinglyLinkedList {
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

        public void traverse() {
            Node temp = head;
            if (head == null) {
                System.out.println("List is empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

        public void insert() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data to insert: ");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            System.out.println("Enter the insertion position (1 for inserting at the beginning): ");
            int m = sc.nextInt();
            
            switch (m) {
                case 1:
                    newnode.next = head;
                    head = newnode;
                    break;
                // You can handle other cases here if you want to insert at specific positions
                default:
                    System.out.println("Invalid insertion position.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        SinglyLinkedList ll = main.new SinglyLinkedList();
        ll.creation();
        ll.traverse();
        ll.insert();
        ll.traverse(); // After insertion, print the list again to see the updated version.
    }
}
