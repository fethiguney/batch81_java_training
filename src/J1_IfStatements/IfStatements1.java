package J1_IfStatements;

import java.util.Scanner;

public class IfStatements1 {

    public static void main(String[] args) {

        //Kullanıcıdan bir tam sayi isteyin ve tam sayinin tek mi çift mi olduğunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayi çift");
        } else {
            System.out.println("Girilen sayi tek");
        }






    }
}
