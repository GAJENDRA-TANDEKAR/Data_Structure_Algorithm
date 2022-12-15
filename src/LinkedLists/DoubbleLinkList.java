package LinkedLists;

import java.util.Scanner;

public class DoubbleLinkList {
    static class Node {
        int data;
        Node next;

        Node prev ;  //  double link list

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;   // double link list
        }
    }
    Node head = null;
    Node tail = null;              //double link list


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
                tail  = new_node;   //double link list


            } else {
                head.prev = new_node;   //double link list
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
        DoubbleLinkList dl = new DoubbleLinkList();

        dl.creationLL();
        dl.traverser();
    }
}
