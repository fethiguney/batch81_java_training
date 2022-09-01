package J9_Arrays;

import java.util.Arrays;

public class EnYakinIkiElemaniBulma {
    public static void main(String[] args) {


        /*
        Bir tamsayi listesinde en yakin 2 tamsayiyi bulun
        Ornek=(12,31,15,13,54)
         */

        int [] arr={12,31,15,13,54};
        Arrays.sort(arr);
        int fark=arr[1]-arr[0];
        for (int i = arr.length-1; i >=1 ; i--) {
            if (arr[i]-arr[i-1]<=fark) {
                System.out.println("En yakin iki sayi :"+arr[i]+" ve "+arr[i-1]);
            }
        }






    }
}
