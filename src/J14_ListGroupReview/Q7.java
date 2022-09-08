package J14_ListGroupReview;

import java.util.Arrays;
import java.util.TreeSet;

public class Q7 {
    public static void main(String[] args) {


        /* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };


        int sayac=0;
        for (int i = 0; i < arr.length/2 ; i++) {
            if (arr[i]==arr[arr.length-1-i]) {
                sayac++;
            }
        }
        if (arr.length/2==sayac) {
            System.out.println("verilen array simetriktir");
        } else {
            System.out.println("verilen array simetrik degildir");
        }


    }
}
