package J14_ListGroupReview;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class Q7 {
    public static void main(String[] args) {


        /* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        /*int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


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
        }*/

        int arr[] = { 1, 2, 3, 4 ,5 ,4, 3, 2, 1 };

        int count=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if(arr.length%2==0){
            for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i] == arr[i+1]) {
                    count++;
                }

            }
        }else System.out.println("Çit elemanlı olmayan  array simetrik olamaz ");

        if(count==arr.length/2){
            System.out.println("Verilen Array simetriktir ");
        }else System.out.println("Verilen array simetrik değildir");



    }
}
