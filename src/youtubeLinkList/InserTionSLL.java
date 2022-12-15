package youtubeLinkList;

import java.util.Scanner;

public class InserTionSLL {
    static class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;


    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the data");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {    //
                head = new_node;
            } else {
                System.out.println(" Enter 1 to insert the item at brginning ,");
                System.out.println(" Enter 2 to insert the item at END ,");
                System.out.println(" Enter 3 to insert the item at Position ,");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println(" Entered position of node to be inserted");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 1; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                }
//                new_node.next = head;  //
//                head = new_node;
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

        public static void main (String[]args){

            InserTionSLL ll = new InserTionSLL();
            ll.creation();
            ll.traverser();

        }
    }
