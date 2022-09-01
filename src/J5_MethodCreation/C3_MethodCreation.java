package J5_MethodCreation;

import static J5_MethodCreation.C1_MethodCreation.toplama;

public class C3_MethodCreation {
    public static void main(String[] args) {

         /*
        Email kontrolu yapan bir program yaziniz.Kullanicinin girdigi sifre
        -@ isareti icermiyorsa gecersiz email yazdirin
        -@gmail.com isareti icermiyorsa "Lutfen gmail adresinizi girin" yazdirin
        -@gmail.com ile bitmiyorsa ""Yazimda bir sorun var, maili kontrol ediniz" yazdirin.

         */

        int input=523;

        rakamlariTopla(input);
    }

    private static void rakamlariTopla(int input) {
        int birlerbasamagı=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerbasamagı=input%10;
        rakamlarToplami+=birlerbasamagı;
        input/=10;

        birlerbasamagı=input%10;
        rakamlarToplami+=birlerbasamagı;
        input/=10;

        birlerbasamagı=input%10;
        rakamlarToplami+=birlerbasamagı;
        input/=10;

        System.out.println("girilen "+temp+" sayisinin rakamlar toplami = "+rakamlarToplami);


    }
}
