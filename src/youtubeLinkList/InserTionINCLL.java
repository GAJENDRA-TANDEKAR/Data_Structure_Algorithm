package youtubeLinkList;

import java.util.Scanner;

public class InserTionINCLL {
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
            }
                else {
                    System.out.println(" Enter 1 to insert the item at brginning ,");
                    System.out.println(" Enter 2 to insert the item at END ,");
                    System.out.println(" Enter 3 to insert the item at Position ,");
                    m = sc.nextInt();
                    switch (m) {
                        case 1:
                            new_node.next = head;
                            head = new_node;
                            tail.next=head;  // Insertion in CLL
                            break;

                        case 2:    //Insertion in CLL
                            tail.next=new_node;
                            tail=new_node;
                            new_node.next=head;
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
//                tail.next=head;       //  circular LL

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

        InserTionINCLL ll = new InserTionINCLL();
        ll.creation();
        ll.traverser();

    }
}


