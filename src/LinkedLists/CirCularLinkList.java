package LinkedLists;

import java.util.Scanner;

public class CirCularLinkList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;               // Circuler link list

    public void creationLL() {

        int user_Data;
        int n;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter user data ");
            user_Data = sc.nextInt();
            System.out.println("-->  " + user_Data);

            Node new_node = new Node(user_Data);
            if (head == null) {

                head = new_node;
                tail = new_node;   // Circuler link list
                new_node.next = head;  // Circuler link list

            } else {

                new_node.next = head;
                head = new_node;

            }
            System.out.println(" do you want to enter more data if yes press 1");
            n = sc.nextInt();
        } while (n == 1);


    }

    public void traverser() {

        Node temp = head;

        if (head == null) {
            System.out.println(" link list does not exit");
        } else {
            do {                                           // temp != head
                System.out.println("temp data = " + temp.data + " ");
                temp = temp.next;
            }while (temp != head);
        }


    }

    public static void main(String[] args) {

        CirCularLinkList cl = new CirCularLinkList();

        cl.creationLL();
        cl.traverser();

    }
}
