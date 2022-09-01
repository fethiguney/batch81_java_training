package J9_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_Ebay {
    public static void main(String[] args) {

        /*
        Ebay Interview Question
        Put all zeros to end in an integer array
        {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
         {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}

         */

        int [] arr={3, 0, 4, 2, 0};
        Arrays.sort(arr);
        int [] yeniArr=new int[arr.length];
        int sonIndeks= arr.length-1;
        int baslangicIndeks=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==0) {
                yeniArr[sonIndeks]=arr[i];
                sonIndeks--;
            } else {
                yeniArr[baslangicIndeks]=arr[i];
                baslangicIndeks++;
            }
        }

        System.out.println(Arrays.toString(yeniArr));



    }
}
