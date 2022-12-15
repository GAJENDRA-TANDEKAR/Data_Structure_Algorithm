//package singlylinklist;
//
//import javax.imageio.stream.ImageInputStream;
//
//public class LinklistDemo {
//    class Node {     // nested class
//        int data;
//        Node nextNode;
//
//        public Node(int data) {   // constructor
//            this.data = data;
//            this.nextNode = nextNode;
//        }
//    }
//       public Node head = null;  // assine the  value of tail or head
//       public Node tail = null;
//
//
//    public void addNode(int data) {
//        Node newNode = new Node(data);  //  this is object creation
//
//
//if(head == null)
//        {
//            head = new Node;
//            tail = new Node;
//
//        }
//        else {
//            tail.nextNode=newNode;
//            tail=newNode;
//        }
//     public  void display() {
//            Node current = null;
//            if ( current == null){
//                System.out.println(" we are in single linklist ");
//            }
//            else{
//                System.out.println(" singly linklist ");
//
//                while( current!=null)
//                    System.out.println(current.data + " .. ");
//                    current = current.nextNode;
//
//                current.nextNode=null;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        LinklistDemo s = new LinklistDemo();
//        s.addNode(20);
//        s.addNode(50);
//        s.addNode(80);
//
//    }
//}
