package J8_DoWhileLoop;

import java.util.Scanner;

public class SlaytSoru_3 {
    public static void main(String[] args) {

        /*
        Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);

        int sayi;
        int sayiToplam=0;
        int sayiAdedi=0;

        do {
            System.out.println("Toplamak icin pozitif sayilar girin\nToplama islemini sonlandirmak icin 0'a basin");
            sayi=scan.nextInt();
            if(sayi>0) {
                sayiToplam+=sayi;
                sayiAdedi++;
            } else if(sayi<0) {
                System.out.println("Sifirdan kucuk sayi girmeyin");
            }

        } while (sayi!=0);
        System.out.println("Girdiginiz pozitif sayilarin toplami : "+sayiToplam);
        System.out.println("Girdiginiz pozitif sayi adedi : "+sayiAdedi);



    }
}
