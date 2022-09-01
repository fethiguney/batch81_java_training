package J1_IfStatements;

import java.util.Scanner;

public class IfStatements7 {
    public static void main(String[] args) {
        //Kullanıcıdan yasını girmesini isteyin 65'den büyükse emekli olabilirsin
        //kucukse emekli olamazsın yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0) {
            System.out.println("yas sifirdan kucuk olamaz");
        } else if (yas<65) {
            System.out.println("emekli olamazsin"+" "+(65-yas)+" "+"yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");
        }
    }
}
