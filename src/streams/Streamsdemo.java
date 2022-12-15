// in a given list of element find the maximum value using Stream function

package streams;

import java.util.Arrays;
import java.util.List;

public class Streamsdemo {

    public static void main(String[] args) {
        List< Integer > list = Arrays.asList(1,2,4,5,3,7,44,55,88,99,100,200,500);
        System.out.println(" given element = " +list);

        Integer max = list.stream().max(Integer:: compare).get();   //  stream.max()  -->  stream function for maximum value
        Integer min = list.stream().min(Integer:: compare).get();   // stream.min()  -->  stream function for minium value
        System.out.println("max value = "+max);
        System.out.println("min value = "+min);

    }

}
