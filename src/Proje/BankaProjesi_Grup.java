package Proje;

import java.util.Scanner;

public class BankaProjesi_Grup {
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 500;
    static String kayitliKartNo = "123456";
    static String kayitliSifre = "team8";


    public static void main(String[] args) {
        /*
        Kullanicidan giris icin kart numarasi ve sifresini isteyin, eger birini yanlis girerse tekrar isteyin
        Kart numarasi aralarda bosluk ile girerse ve eger dogruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin

        Bakiye sorgula,para yatirma,para cekme,para gonderme,sifre degistirme ve cikis

        Para cekme ve para gonderme islemine mevcut bakiyeden buyuk para cekilemez.
        Para gonderme iselminde iban TR ile baslamali ve toplam 26 karakteri olmali, eger degilse menu ekranina geri donun
        Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali.

        */


        System.out.println("*****BANKAYA HOSGELDINIZ*****");
        System.out.println("Kart numaranizi girin");
        String kartNo = scan.nextLine().replaceAll(" ", "");
        System.out.println("Sifrenizi girin");
        String sifre = scan.nextLine();


        while (!kayitliKartNo.equals(kartNo) || !kayitliSifre.equals(sifre)) {
            System.out.println("Bilgileriniz eksik veya hatalidir tekrar deneyin");
            System.out.println("Kart numaranizi tekrar girin");
            kartNo = scan.nextLine();
            System.out.println("Sifrenizi tekrar girin");
            sifre = scan.nextLine();

        }

        sec();

    }


    static void sec() {

        System.out.println("Yapmak istediginiz islemi secin");
        System.out.println("Para yatirma 1\nPara cekme  2\nPara gonderme 3" +
                "\nSifre degistirme 4\nBakiye sorgulama 5\nCikis 0\nGiriniz...");
        int secim = scan.nextInt();

        if (secim == 0) {
            cik();
        }
        if (secim == 1) {
            paraYatir();
        }
        if (secim == 2) {
            paraCek();
        }
        if (secim == 3) {
            paraGonder();
        }
        if (secim == 4) {
            sifreDegis();
        }
        if (secim == 5) {
            bakiyeSorgu();
        }
        if (secim > 5) {
            System.out.println("Hatali giris!!!");
            cik();
        }


    }

    private static void cik() {
        System.out.println("Cikis yapildi yine bekleriz...");
    }


    private static void paraCek() {
        System.out.println("Cekmek istediginiz tutari girin");
        int cekilecekPara = scan.nextInt();
        if (cekilecekPara > bakiye) {
            System.out.println("Yetersiz bakiye");
            cik();
        } else {
            bakiye -= cekilecekPara;
            System.out.println("Para cekme isleminiz gerceklesti yapmak istediginiz islemi girin");
            sec();
        }
    }


    private static void paraYatir() {
        System.out.println("yatirmak istediginiz miktari giriniz");
        int yatirilanPara = scan.nextInt();
        bakiye += yatirilanPara;
        System.out.println("Para hesabiniza yatirildi devam etmek istiyorsaniz 1 istemiyorsaniz 2 giriniz ");
        int karar = scan.nextInt();
        if (karar == 1) {
            System.out.println("Yapmak istediginiz islemi giriniz");
            sec();
        } else if (karar == 2) {
            System.out.println("Cikis yapildi bb....");
        } else {
            System.out.println("Hatali giris yaptiniz tekrar giriniz");
            karar = scan.nextInt();
        }


    }

    private static void sifreDegis() {
        System.out.println("Mevcut sifrenizi girin");
        String ySifre = scan.nextLine();
        System.out.println("Yeni sifrenizi girin");
        String yeniSifre = scan.nextLine();
        if (ySifre.equals(yeniSifre)) {
            kayitliSifre = yeniSifre;
            System.out.println("Sifreniz degistirildi yapmak istediginiz islemi secin");
            sec();
        } else {
            System.out.println("Hatali giris yaptiniz bb...");
            cik();
        }


    }

    private static void bakiyeSorgu() {
        System.out.println("Bakiyeniz : " + bakiye + "\nBaska islem yapmak istiyorsaniz 1 istemiyorsaniz 2 girin");
        int karar = scan.nextInt();
        if (karar == 1) {
            System.out.println("Yapmak istediginiz islemi girin");
            sec();
        } else if (karar == 2) {
            cik();
        } else {
            System.out.println("Hatali giris!!!");
            cik();
        }
    }

    private static void paraGonder() {
        System.out.println("Gondermek istediginiz tutari girin");
        int gonderilecekPara = scan.nextInt();
        String iban = scan.nextLine();
        if (iban.startsWith("TR") && iban.length() == 26) {
            if (gonderilecekPara > bakiye) {
                System.out.println("Yetersiz bakiye");
                cik();
            } else {
                bakiye -= gonderilecekPara;
                System.out.println("Transfer islemi gerceklesti devam etmek istiyorsaniz 1 istemiyorsaniz 2 girin");
                int karar = scan.nextInt();
                if (karar == 1) {
                    System.out.println("Yapmak istediginiz islemi girin");
                    sec();
                } else if (karar == 2) {
                    cik();
                } else {
                    System.out.println("Hatali giris yaptiniz yapma istediginiz islemi girin");
                    sec();
                }
            }


        } else {
            System.out.println("Hatali iban girdiniz");
            cik();
        }
    }
}