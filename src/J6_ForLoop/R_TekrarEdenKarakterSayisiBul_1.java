package J6_ForLoop;

import java.util.Scanner;

public class R_TekrarEdenKarakterSayisiBul_1 {
    public static void main(String[] args) {

        /*
        Interview sorusu...
        Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
        (Büyük harf-küçük harf ayrımına dikkat ediniz)
        Test data:
        Input = AAABBCDD
        output = A3B2C1D2
         */
        String input = "AAABBCDD", tekrarEdenHarfler="";
        int sayac=0;


        for (int i = 0; i <input.length() ; i++) {
            if(input.indexOf(input.charAt(i))!=input.lastIndexOf(input.charAt(i))) {
                sayac++;
                if(!tekrarEdenHarfler.contains(input.substring(i,i+1))) {
                    tekrarEdenHarfler+=input.substring(i,i+1);

                }
                tekrarEdenHarfler+=sayac;
            }

        sayac=0;
        }
        System.out.println(tekrarEdenHarfler);





    }
}

