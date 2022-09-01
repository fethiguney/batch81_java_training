package J1_IfStatements;

import java.util.Scanner;

public class IfStatements9 {
    public static void main(String[] args) {
        /*
    Kullanicidan gun ismi girmesini isteyiniz.Girilen isim gecerli gun ismi ise gun isminin 1.,2. ve 3.
    harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin. Gun ismi gecerli degilse
    "Gecerli gun ismi giriniz" yazdirin.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (!(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba")
            || gunIsmi.equals("persembe") || gunIsmi.equals("cuma") || gunIsmi.equals("cumartesi")
            || gunIsmi.equals("pazar"))) {
            System.out.println("Gecerli bir gun ismi giriniz");
        } else {
            String ilkUcHarf=gunIsmi.substring(0,3);
            System.out.println(ilkUcHarf.substring(0,1).toUpperCase()+ilkUcHarf.substring(1));
        }


    }
}
