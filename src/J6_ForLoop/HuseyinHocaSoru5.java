package J6_ForLoop;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HuseyinHocaSoru5 {
    public static void main(String[] args) {
        /*
        Klavyeden tam sayi giriliyor
        girilen sayi sifir olmadigi surece, sizden tekrar sayi girmenizi istiyor
        sifir girildiginde sizden sayi istemekten vazgeciyor
        ve ekrana asagıda istenenleri yazdiriyor
        -kac adet negatif sayi girildiğini
        -kac adet pozitif sayi girildiğini
        -pozitif sayilarin toplamini
        -negatif sayilarin toplamini

        Ornek : -1,2,-6,-4,-5,12,0 >> sayilarini girdik
        4 adet negatif ; 2 adet pozitif
        Negatif Toplam :-16, Pozitif Toplam: 14
         */

        Scanner al = new Scanner(System.in);
        int pt, nt, pa, na, sayi, i;
        nt = 0;
        pt = 0;
        na = 0;
        pa = 0;
        sayi=600; // Döngüye girmeden Geçici bir değer atadık..
        for (i = 50; (sayi != 0); i+=10) {
            System.out.print(i+ ".Sayıyı Girin: ");
            sayi = al.nextInt();
            if (sayi > 0) {
                pa++;
                pt+=sayi;
            } else if (sayi < 0) {
                na++;
                nt+=sayi;
            }
        }
        System.out.println(" Pozitif Sayı Adeti : " + pa);
        System.out.println(" Negatif Sayı Adeti : " + na);
        System.out.println(" Negatif Sayıların Toplamı : " + nt);
        System.out.println(" Pozitif Sayıların Toplamı : " + pt);



    }
}
