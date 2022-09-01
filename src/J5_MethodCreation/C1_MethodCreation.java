package J5_MethodCreation;

import java.util.Scanner;

public class C1_MethodCreation {
    public static void main(String[] args) {
          /*

        Kullanicidan bir sayi alin.Bu sayinin
        tek mi cift mi oldugunu,
         sifirdan buyuk mu kucuk mu oldugunu,
         ayrica ve 100'den buyukse birler onlar ve yuzler basamagindaki rakamlarin toplamini,
        100'den kucukse sadece birler basamagini yazdiran
        3 methot olusturun

         */

        int sayi1=10;
        int sayi2=15;
       toplama(sayi1, sayi2);

        terstenYazdir("van");


    }

    private static void terstenYazdir(String input) {
        String tersInput=input.substring(2)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println("yazinin tersten yazilisi = "+tersInput);

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami : "+(sayi1+sayi2));
    }

}
