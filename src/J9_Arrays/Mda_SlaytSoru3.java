package J9_Arrays;

public class Mda_SlaytSoru3 {
    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional array’lerin
        ic array’lerinde ayni index’e sahip
        elemanlarin toplamini ekrana yazdiran
        bir program yaziniz.
        arr1 = { {1,2},{3,4,5}, {6} }
        arr2 =   arr1 = { {1,2},{3,4,5}, {6} }
        */


        int [] [] arr1 = { {1,2},{3,4,5}, {6} };
        int [] [] arr2={ {7,8,9}, {10,11}, {12} };

        int indexToplam=0;

        for (int i = 0; i <arr1.length && i<arr2.length  ; i++) {
            for (int j = 0; j <arr1[i].length && j<arr2[i].length; j++) {
                    indexToplam+=arr1 [i] [j] +arr2 [i] [j];

            }
        }
        System.out.println("Ayni indeks elemanlarinin toplami "+indexToplam);



    }
}
