package J14_ListGroupReview;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);


       int kareToplamları= numbers.stream().map(t->t*t).reduce(0,(t,u)-> t+u);
        System.out.println(kareToplamları);



    }
}
