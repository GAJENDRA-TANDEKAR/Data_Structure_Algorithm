package stackQueueLLjava;

import java.util.Scanner;

class stack1 {
    static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push(Scanner sc) {
        System.out.println("enter the data");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

   public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            top = top.next;
        }
    }


    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        if (temp==null){
            System.out.println(" data is empty ");
        }
    }
}


public class Stack_LL {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        stack1 s = new stack1();
        int l ;
        do {
            System.out.println(" enter 1 to push  ");
            System.out.println(" enter 2 to pop ");
            System.out.println(" press 3 to display ");
            System.out.println("enter your choice ");
            d = sc.nextInt();
            switch (d) {
                case 1: {
                    //
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
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
