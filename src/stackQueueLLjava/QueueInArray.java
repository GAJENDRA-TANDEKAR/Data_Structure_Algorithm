package stackQueueLLjava;

import java.util.Scanner;

public class QueueInArray {
    int f = -1 ;
    int r = -1 ;
    int n = 3 ;
    int q[] = new  int[n] ;   // array

    public  void enqueue (  ) {
        Scanner sc = new Scanner(System.in);
        if ( r == (n-1)){
            System.out.println(" over flow condition ");
        }else {
            System.out.println(" enter data ");
            int i = sc.nextInt();
            if (f == -1 && r == -1 ){
                f=0;
                r=0;
                q[r] = i ;
            }else {
                r = r+1;
                q[r]= i;
            }
        }

    }
    public  void  dequeue(){

        if (f == -1 && r == -1  ) {
            System.out.println(" undewrflof ");

        }else {
            f = f+1;
        }

    }
    void display (){
        System.out.print(" items are : ");
        for (int i = f ; i <=  r ; i++){
            System.out.print(q[i]+  " ");
        }

    }

    public static class queue_array{
        public static void main(String[] args) {
            int d ;
            Scanner sc = new Scanner(System.in);
            QueueInArray s = new  QueueInArray();
            int l;

            do {
                System.out.println("press 1 to enqueue ");
                System.out.println("press 2 to dequeue ");
                System.out.println("press 3 to display");
                System.out.println("enter your choice");
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
                System.out.println();
                System.out.println(" enter 0 to go back to the main MENU ");
                System.out.println(" enter any key to exit ");
                l = sc.nextInt();
            } while ( l == 0 );
            System.out.println(" exit sucessfully ");
        }
    }
}
