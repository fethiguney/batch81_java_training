package J8_DoWhileLoop;

import java.util.Scanner;

public class SlaytSoru_5_Sifre {
    public static void main(String[] args) {


        /*Soru 5 )
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karakter icermelidir
        -Sifre en az 8 karakter olmalidir.
        */

        Scanner scan=new Scanner(System.in);



        int kontrol=0, buyukKontrol=0, kucukKontrol=0, ozelKarakterKontrol=0, uzunlukKontrol=0;

        do {

            System.out.println("Bir sifre girin :");
            String sifre=scan.nextLine();

            for (int i = 0; i <sifre.length() ; i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                    kucukKontrol = 1;
                }
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    buyukKontrol = 1;
                }
                if (sifre.charAt(i) > 32 && sifre.charAt(i) < 48 ||
                    sifre.charAt(i) > 57 && sifre.charAt(i) < 65 ||
                    sifre.charAt(i) >91 && sifre.charAt(i) <97 || sifre.charAt(i) >122) {
                    ozelKarakterKontrol = 1;
                }
            }
            if(buyukKontrol==0) {
                System.out.println("Sifre buyuk karakter icermelidir");
            }
            if(kucukKontrol==0) {
                System.out.println("Sifre kucuk karakter icermelidir");
            }
            if(ozelKarakterKontrol==0) {
                System.out.println("Sifre ozel karakter icermelidir");
            }
            if (sifre.length()>=8) {
                uzunlukKontrol=1;
            } else {
                System.out.println("Sifre sekiz karakterden uzun olmalidir");
            }
            kontrol=uzunlukKontrol+kucukKontrol+buyukKontrol+ozelKarakterKontrol;
            if (kontrol==4) {
                System.out.println("Sifreniz kabul edilmistir");
            }
        } while (kontrol!=4);






    }
}
