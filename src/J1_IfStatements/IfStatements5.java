package J1_IfStatements;

import java.util.Scanner;

public class IfStatements5 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir gun alın eger gun Cuma ise Muslumanlar icin Kutsal Gun,
        Cumartesi ise Yahudiler icin kutsal gun, Pazar ise Hiristiyonlar icin kutsal
        gun yazdırın
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Kutsal bir gun girin");
        String gunIsmi=scan.next();

        if (gunIsmi.equalsIgnoreCase("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gunIsmi.equalsIgnoreCase("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        } else {
            System.out.println("Kutsal bir gun degil");
        }

    }
}
