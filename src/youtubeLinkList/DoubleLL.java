package youtubeLinkList;

import java.util.Scanner;

public class DoubleLL {
    static class Node {
        int data;
        Node next;

        Node prev;      // double LL

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;  // double LL
        }
    }

    Node head = null;
    Node tail = null;        // double LL



    public void creation() {
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the data");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {    //
                head = new_node;
                tail = new_node; //  double LL
            } else {
                head.prev = new_node;  /// double LL
                new_node.next = head;  //
                head = new_node;
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
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        DoubleLL ll = new DoubleLL();
        ll.creation();
        ll.traverser();

    }
}

