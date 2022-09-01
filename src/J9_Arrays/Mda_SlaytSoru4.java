package J9_Arrays;

import java.util.Arrays;

public class Mda_SlaytSoru4 {
    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array’in
        ic array’lerindeki tum elemanlarin toplamini
        birer birer bulan ve herbir sonucu yeni bir array’in
        elemani yapan ve yeni array’i ekrana
        yazdiran bir program yaziniz
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==>
        1+2+3=6 4+5=9 6+7=13 ==>
        output: {6, 9, 13}
         */

        int [] [] arr1={ {1,2,3}, {4,5}, {6,7} };

        int toplam=0;
        int [] arr2=new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                toplam+=arr1[i] [j];
            }
            arr2[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
