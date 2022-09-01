package J1_IfStatements;

import java.util.Scanner;

public class IfStatements2 {
    public static void main(String[] args) {
        //Kullanıcıdan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Gun isimlerinden birinin ilk harfini giriniz");
        String ilkHarf=scan.next().toUpperCase();

        if (ilkHarf.equals("P")) {
            System.out.println("Pazartesi, Persembe, Pazar");
        } else if (ilkHarf.equals("S")) {
            System.out.println("Salı");
        } else if (ilkHarf.equals("C")) {
            System.out.println("Carsamba, Cuma, Cumartesi");
        } else {
            System.out.println("gecerli bir harf girin");
        }


    }
}
