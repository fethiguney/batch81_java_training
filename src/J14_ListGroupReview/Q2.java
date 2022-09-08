package J14_ListGroupReview;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {

         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */
        String [][] arr={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        turnMultiDimensionArraytoNaturalList(arr);

    }

    private static void turnMultiDimensionArraytoNaturalList(String[][] arr) {
        TreeSet<String> isimler=new TreeSet<>();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                isimler.add(arr[i][j]);
            }
        }

        System.out.println(isimler);

    }


}
