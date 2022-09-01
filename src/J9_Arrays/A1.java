package J9_Arrays;

import java.util.Arrays;

public class A1 {

    public static void main(String[] args) {

        /*
 Put all zeros to end in an integer array
 {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
 {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */


        int [] arr={3, 0, 4, 2, 0};
        int [] yeniArr=new int [arr.length];

        System.out.println(Arrays.toString(yeniArr));

        int sonIndeks=arr.length-1;
        int ilkIndeks=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0) {
                yeniArr [ilkIndeks]=arr[i];
                ilkIndeks++;
            } else {
                yeniArr[sonIndeks]=arr[i];
                sonIndeks--;
            }
        }
        System.out.println(Arrays.toString(yeniArr));




    }
}
