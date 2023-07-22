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

        public boolean search(int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    return true; // Element found in the linked list
                }
                current = current.next;
            }
            return false; // Element not found in the linked list
        }
        
        public void reverse() {
            Node temp = head;
            Node previous = null;
            Node next = null;
            while (temp != null) {
                next = temp.next;
                temp.next = previous;
                previous = temp;
                temp = next;
            }
            head = previous; // Update the head to the new first node (previously last node)
        }
    

    public static void main(String[] args) {
       Main main = new Main(); // Create an instance of the Main class
    
        SinglyLinkedList ll =main.new SinglyLinkedList();
        ll.creation();
        ll.traverse();

        System.out.println("Reversing the linked list...");
        ll.reverse();

        System.out.println("Reversed linked list:");
        ll.traverse();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = ll.search(key);
        if (found) {
            System.out.println(key + " found in the linked list.");
        } else {
            System.out.println(key + " not found in the linked list.");
        }
    }
}}
