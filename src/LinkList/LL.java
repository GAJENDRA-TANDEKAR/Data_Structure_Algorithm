package LinkList;

public class LL {
    private Node head;           // head is a reference variable pointing to the node         //every link list to have this
    private Node tail;            // tail  is a also reference variable pointing to the node  //every link list to have this
    private int size;

    public LL() {            // constructor

        this.size = 0;
    }

    public LL(int size) {        // constructor

        this.size = size;
    }

    public void insertfirst(int val) {      // creaded method for first position for head
        Node node = new Node(val);           // creaded new node
        node.next = head;                    //  this node pointed to the next node  that is head
        head = node;                         //  head is point to the node

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // display

    public void display() {
        Node temp = head ;   // Created temp variable for moving temp  node  not head

        while ( temp != null){
            System.out.println(" temp  is not null -> "+ temp.value + "  "+" -> ");
            temp = temp.next;
        }
        System.out.println(" end ");

    }

    private class Node {
        private int value;
        private Node next;        // reference  variable  that pointing to the next node   // next is nothing but point to the object that i provided

        public Node(int value) {       // constructor
            this.value = value;
            this.next = next;
        }
    }

}