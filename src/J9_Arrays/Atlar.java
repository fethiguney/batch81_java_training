package J9_Arrays;

import java.util.Arrays;

public class Atlar {
    public static void main(String[] args) {

        /*
        Farklı güçleri olan atlarla bir at yarışı düzenliyor.
        Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.
        For example :{3, 67, 9, 46, 55, 48}
        output : 46,48
         */

        int [] arr={3, 5, 9, 46, 55, 58};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minFark=arr[1]-arr[0];

        for (int i = arr.length-1; i >0 ; i--) {
            if (arr[i]-arr[i-1] <= minFark) {
                System.out.println(arr[i-1]+","+arr[i]);
            }

        }



    }
}
