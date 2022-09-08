package J14_ListGroupReview;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */

        int [] arr={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };

        List<Integer> numbers=new ArrayList<>();

        int count=0;
        int temp=0;
        int i=0;

        while (i<arr.length) {
            for (int j = 0; j <=count ; j++) {
                temp =temp+ arr[i];
                i++;
            }
            numbers.add(temp);
            temp=0;
            count++;
        }
        System.out.println(numbers);




    }
}
