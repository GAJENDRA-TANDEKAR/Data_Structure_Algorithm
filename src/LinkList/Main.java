package LinkList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        LL list = new LL ();

        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(10);
        list.insertfirst(17);

        list.display();
        System.out.println("  "+ list);

    }
}
