package J9_Arrays;

import java.util.Scanner;

public class Mda_Birlesim_Kesisim_Bulma {
    public static void main(String[] args) {

       /*
        iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
        kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.
        input : String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
                String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
        output:  Dizilerin Kesişim Kümesi : 2c
                 Dizilerin Birleşim Kümesi : a2c75kr1e8



    */
        String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};

        String kesisim="";
        String  birlesim="";

        for (String [] w: dizi1 ) {
            for (String w1: w) {
                for (String [] q : dizi2) {
                    for (String q1: q) {
                        if (w1.equals(q1)) {
                            kesisim+=w1;
                        }
                        else {
                            if (!birlesim.contains(w1)) {
                                birlesim+=w1;
                            }
                            if (!birlesim.contains(q1)) {
                                birlesim+=q1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Dizilerin kesisim kumesi : "+kesisim);
        System.out.println("Dizilerin birlesim kumesi : "+birlesim);



    }
}