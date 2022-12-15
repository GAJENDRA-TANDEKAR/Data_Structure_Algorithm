package LinkedLists;

import java.util.Scanner;

public class SingleLinkList {


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
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
            while (temp != null) {
                System.out.println("temp data = " + temp.data + " ");
                temp = temp.next;
            }
        }


    }

    public static void main(String[] args) {

        SingleLinkList sl = new SingleLinkList();

        sl.creationLL();
        sl.traverser();

    }


}
