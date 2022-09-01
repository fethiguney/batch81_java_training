package J1_IfStatements;

import java.util.Scanner;

public class IfStatements3 {
    public static void main(String[] args) {
        //Kullanıcıdan gun ismi alın haftaici veya haftasonu oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
            System.out.println("Girilen gun Haftasonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("carsamba")
                    || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("Girilen gun Haftaici");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }

    }
}
