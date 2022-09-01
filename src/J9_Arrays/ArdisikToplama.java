package J9_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArdisikToplama {
    public static void main(String[] args) {

        /*
        if the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
        Type a program to create a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }
        verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp
        yeni bir array'a atayan bir program cretae ediniz..
        İnput : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
        Output : { 3, 5+1, 2+7+9, 2+3+5+7 }

        i 0->1->3->6->10
        j 2->4-5->3-5-7
  */

        int[] input = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int temp = 0;
        int i = 0;

        while (i<input.length) {
            for (int j = 0; j <=count ; j++) {
                temp+=input[i];
                i++;
            }
            list.add(temp);
            temp=0;
            count++;
        }
        System.out.println(list);






    }
}
