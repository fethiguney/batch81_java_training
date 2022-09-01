package J3_Ternary_Switch;

import java.util.Scanner;

public class Switch_HesapMakinesi {
    public static void main(String[] args) {
        /*
        Basit Hesap Makinesi
        Kullanicidan iki tamsayi alin
        4 islemden hangisini yapmak istedigini sorun
        verilen cevaba gore istenilen islemi yaptırın
        eger hatalı islem secerse "Hatali Secim Yaptiniz" Yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("birinci sayiyi girin :");
        int sayi1=scan.nextInt();
        System.out.print("ikinci sayiyi girin  :");
        int sayi2= scan.nextInt();
        System.out.println(" toplama icin 1\n cıkarma icin 2\n" +
                " carpma icin 3\n bolme icin 4'e basin");
        int islem=scan.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("sayilarin toplami = "+ (sayi1+sayi2));
                break;
            case 2 :
                System.out.println("birinci sayinin ikinci sayidan cıkarma sonucu = "+ (sayi1-sayi2));
                break;
            case 3 :
                System.out.println("sayilarin carpimi = "+ (sayi1*sayi2));
                break;
            case 4 :
                if (sayi1==0 || sayi2==0) {
                    System.out.println("bolmede sifir kullanilmaz");
                } else {
                    System.out.println("sayilarin bolumu = "+ (sayi1/sayi2));
                }break;
            default:
                System.out.println("hatali secim yaptiniz");
        }




    }
}
