package stackQueueLLjava;

import java.util.Scanner;

class queue1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;   // front = f
    Node r = null;    // rear = r

    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the data ");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if (f == null) {
            f = new_node;
            r = new_node;
        } else {
            r.next = new_node;
            r = new_node;
        }

    }

    public void dequeue() {
        if (f == null) {
            System.out.println(" underflow condition");
        } else {
            f = f.next;
        }

    }


    public void display() {
        Node temp = f;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}


public class Queue_LL {
    public static void main(String args[]) {
        int d;
        Scanner sc = new Scanner(System.in);
        queue1 s = new queue1();

        int l ;
        do {
            System.out.println(" enter 1 to enqueue operation  ");
            System.out.println(" enter 2 to dequeue operation ");
            System.out.println(" press 3 to display ");
            System.out.println("enter your choice ");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    s.enqueue();
                    break;
                }
                case 2: {
                    s.dequeue();

                    break;
                }
                case 3: {
                    s.display();

                    break;
                }
            }
            System.out.println("  Entere  0 to go Back to the Menu ");
            System.out.println(" enter any key to exit ");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println(" exit sucessfully");
    }


}