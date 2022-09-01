package J2_NestedIf;

import java.util.Scanner;

public class EksiArtiSoru {
    public static void main(String[] args) {
        // Sıfırdan Farklı Pozitif veya Negatif Bir Tam Sayı Girilmesi İsteniyor
        // Girilen sayı SIFIR ise "HATALI GİRİŞ" mesajı yazdırılıyor
        // Girilen sayı  Pozitif ise;
        // Bu Pozitif Sayı; 4 Basamağa kadar ise; Rakamları Toplamı Ekrana Yazdırılıyor
        // Bu Pozitif Sayı 4 ve yukarı Basamaklı İse 5'e bölümünden kalan Ekrana Yazdırılıyor.
        // Girilen sayı Eğer Negatif ise;
        // Eğer bu Negatif sayı; 4 Basamağa kadar ise;  3'e tam bölünüp bölünemediği Ekrana yazdırılıyor.
        // Eğer bu Negatif sayı;  4 ve yukarı basamaklı ise "ÇOK KÜÇÜK SAYI SEÇTİN" mesajı Ekrana Yazdırılıyor.


        Scanner scan=new Scanner(System.in);
        System.out.println("Sifirdan farkli bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if(sayi==0) {
            System.out.println("Hatali giris");
        } else if (sayi>0){
            if(sayi<1000) {
                int b1=(sayi/100)%10;
                int b2=(sayi/10)%10;
                int b3=sayi%10;
                int bt=b1+b2+b3;
                System.out.println("sayinin rakamları toplami = "+bt);
            } else {
                System.out.println("sayinin bese bolumunden kalan = "+ sayi%5);
            }

        } else {
            if (sayi>-1000){
                if (sayi%3==0) {
                    System.out.println("sayi uc ile bolunur");
                } else {
                    System.out.println("sayi uc ile bolunmez");
                }
            } else {
                System.out.println("cok kucuk sayi sectin");
            }

        }



    }
}
