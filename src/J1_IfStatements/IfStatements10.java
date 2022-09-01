package J1_IfStatements;

import java.util.Scanner;

public class IfStatements10 {
    public static void main(String[] args) {
        /*iki sayi iste. ikisi de pozitif ise topla
        ikisi de negatif ise carp biri pozitif digeri negatif ise
        "farkli isaretlerde sayilarla islem yapamazsin" yazdir
        sayilardan 0'a esit olan varsa "sifir carpmaya gore yutan elemandir" yazdir.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        int sayi2= scan.nextInt();

        if (sayi1>0 && sayi2>0) {
            System.out.println("İki sayinin toplami = "+(sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0) {
            System.out.println("İki sayinin carpimi = "+ (sayi1*sayi2));
        } else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        } else if (sayi1==0 || sayi2==0) {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        } else {
            System.out.println("Gecerli bir sayi giriniz");
        }


    }
}
