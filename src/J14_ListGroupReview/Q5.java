package J14_ListGroupReview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        List<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(12);
        numbers.add(21);
        numbers.add(20);

        List<Integer> oddNumbers= numbers.stream().filter(t-> t%2==1).collect(Collectors.toList());
        System.out.println(oddNumbers);




    }
}
