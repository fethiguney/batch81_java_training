package J9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Mda_SlaytSoru6 {
    public static void main(String[] args) {

        /*
        Verilen bir array'den istenen degere esit olan elemanlari kaldırıp,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.
         */
        int [] arr={1,2,5,4,9,3,3,8};

     arraydenIstenenDegeriSilipYeniOlusturma(arr);




    }

    public static void arraydenIstenenDegeriSilipYeniOlusturma(int[] arr) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Silmek istediğiniz sayiyi girin :");
        int deger=scan.nextInt();
        int degerSayisi=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==deger) {
                degerSayisi++;
            }
        }
        int [] yeniArray=new int[arr.length-degerSayisi];
        int yeniArrayIndex=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=deger) {
                yeniArray[yeniArrayIndex]=arr[i];
                yeniArrayIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArray));

    }


}
