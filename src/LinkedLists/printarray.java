package LinkedLists;

    public class printarray<E> {
        E[] myArray;


        public printarray(E[] myArray) {

            this.myArray = myArray;
        }
        public static void main(String[] args) {


            Integer a[] = {1,2,3,4,5,6};
            Double[] b = {1.1,2.2,3.3,4.4,5.5};
            Character c[] = {'a','b','c'};
            printArray(a);
            printArray(b);
            printArray(c);
        }
        public static <E> void printArray(E[] elements) {
            for (E element : elements) {
                System.out.println(element);
            }
            System.out.println();
        }
    }

