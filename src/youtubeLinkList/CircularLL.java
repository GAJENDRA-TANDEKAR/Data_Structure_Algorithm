package youtubeLinkList;

import java.util.Scanner;

public class CircularLL {
        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;    // initial value null
        Node tail = null;     // circular LL


        public void creation() {
            int data, n,m,p;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("enter the data");
                data = sc.nextInt();
                Node new_node = new Node(data);    // obj innner class

                if (head == null) {    //
                    head = new_node;
                    tail = new_node;             //  circular LL
                    new_node.next = head;    //  new_node.next = new_node; // circularLL
                } else {
                    new_node.next = head;  //
                    head = new_node;
                    tail.next=head;       //  circular LL

                }
                System.out.println(" do you want to continue yes press 1  ");
                n = sc.nextInt();
            }
            while (n == 1);
        }

        public void traverser() {
            Node temp = head;

            if (head == null) {
                System.out.println(" L L is does not exist  ");
            } else {
                                      // circular LL
                do {
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }while (temp != head);
            }                             // circular LL
        }

        public static void main(String[] args) {

            CircularLL ll = new CircularLL();
            ll.creation();
            ll.traverser();

        }
    }


