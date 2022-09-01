package J8_DoWhileLoop;

import java.util.Scanner;

public class SlaytSoru_4 {
    public static void main(String[] args) {


        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse
        o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
        yazdirip basa donun Kullanici 0’a bastiginda
        -toplam kac pozitif sayi girdigini,
        -yanlislikla kac negative sayi girdigini
        -girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        int sayi;
        int pozitifSayiAdedi=0;
        int negatifSayiAdedi=0;
        int pozitifSayilarinToplami=0;

        do {
            System.out.println("toplamak icin sayi giriniz\nislemi bitirmek icin 0'a basin");
            sayi=scan.nextInt();

            if (sayi>0) {
                pozitifSayilarinToplami+=sayi;
                pozitifSayiAdedi++;
            } else if (sayi<0) {
                negatifSayiAdedi++;
            }

        } while (sayi!=0);
        System.out.println("Girdiginiz pozitif sayi adedi : "+ pozitifSayiAdedi);
        System.out.println("Girdiginiz pozitif sayilarin toplami : "+ pozitifSayilarinToplami);
        System.out.println("Girdiginiz negatif sayi adedi : "+ negatifSayiAdedi);



    }
}
