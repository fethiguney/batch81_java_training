package Proje;

import java.util.Scanner;

public class BankaProjesi {

    /*
    Kullanicidan giris icin kart numarasi ve sifresini isteyin, eger birini yanlis girerse tekrar isteyin
    Kart numarasi aralarda bosluk ile girerse ve eger dogruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabilecegi islemleri ekrana yazdirin

    Bakiye sorgula,para yatirma,para cekme,para gonderme,sifre degistirme ve cikis

    Para cekme ve para gonderme islemine mevcut bakiyeden buyuk para cekilemez.
    Para gonderme iselminde iban TR ile baslamali ve toplam 26 karakteri olmali, eger degilse menu ekranina geri donun
    Sifre degistirme isleminde mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali.
     */



    public static void main(String[] args) {

         String kartNumarasi="1111 2222 3333 4444";
         String cardNumber="";
         String sifre="1234";
         String password="";

       int bakiye=1000;

        Scanner scan=new Scanner(System.in);


       while (!cardNumber.equals(kartNumarasi)) {

           System.out.println("Kart numaranizi giriniz :");
           cardNumber=scan.nextLine();

           if (!cardNumber.equals(kartNumarasi)) {
               System.out.println("Kart numarasini yanlis girdiniz\nTekrar deneyiniz");
           }
       }
       while (!password.equals(sifre)) {
           System.out.println("Sifrenizi giriniz : ");
           password=scan.next();

           if (!password.equals(sifre)) {
               System.out.println("Sifreyi yanlis girdiniz\nTekrar deneyiniz");
           }
       }
       System.out.println("***HOSGELDİNİZ***");

       boolean islemDogruMu=false;

      do {
          System.out.println("Yapabileceginiz Islemler\nbakiye sorgula\npara yatirma\npara cekme\npara gonderme\nsifre degistirme\ncikis");
          System.out.println("Yapmak istediginiz islemi yazin :");
          String islem=scan.nextLine();

          if (islem.equalsIgnoreCase("bakiye sorgula")) {
              System.out.println("Bakiyeniz : "+bakiye);
              islemDogruMu=true;
          } else if (islem.equalsIgnoreCase("para yatirma")) {
              System.out.println("Yatirmak istediginiz tutari girin");
              int yatirilanTutar=scan.nextInt();
              System.out.println("Yatirdiginiz para tutari : "+yatirilanTutar);
              bakiye+=yatirilanTutar;
              System.out.println("Bakiyeniz : "+bakiye);
              islemDogruMu=true;
          } else if (islem.equalsIgnoreCase("para cekme")) {
              System.out.println("Cekmek istediginiz tutari girin");
              int cekilenTutar=scan.nextInt();
              if (cekilenTutar>bakiye) {
                  System.out.println("Cekmek istediginiz tutar bakiyeden kucuk olmali");
                  islemDogruMu=false;
              } else {
                  System.out.println("Cekilen para tutari : "+cekilenTutar);
                  bakiye-=cekilenTutar;
                  System.out.println("Bakiyeniz : "+bakiye);
                  islemDogruMu=true;
              }
          } else if (islem.equalsIgnoreCase("para gonderme")) {
              System.out.println("Gondermek istediginiz tutari girin");
              int gonderilenTutar=scan.nextInt();
              if (gonderilenTutar>bakiye) {
                  System.out.println("Gondermek istediginiz tutar bakiyeden kucuk olmali");
                  islemDogruMu=false;
              } else {
                  System.out.println("Gondermek istediginiz iban numarasini girin");
                  String iban=scan.next();
                  if (iban.startsWith("TR") && iban.length()==26) {
                      System.out.println("Gonderilen tutar : "+gonderilenTutar);
                      bakiye-=gonderilenTutar;
                      System.out.println("Bakiyeniz :"+bakiye);
                      islemDogruMu=true;
                  } else {
                      System.out.println("Iban numarasi TR ile baslamali ve 26 karakter olmali");
                      islemDogruMu=false;
                  }
              }

          } else if (islem.equalsIgnoreCase("sifre degistirme")) {
              System.out.println("Eski sifrenizi giriniz");
              String sifreDogrulama=scan.next();
              if (sifreDogrulama.equals(sifre)) {
                  sifre=sifreDogrulama;
                  System.out.println("Sifreniz degistirildi");
                  islemDogruMu=true;
              } else {
                  System.out.println("sifrenizi yanlis girdiniz");
                  islemDogruMu=false;
              }
          } else if (islem.equalsIgnoreCase("cikis")) {
              islemDogruMu=true;
          }

      } while (!islemDogruMu);
        System.out.println("***IYI GUNLER****");




    }

}









