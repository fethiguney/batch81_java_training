package J1_IfStatements;

import java.util.Scanner;

public class IfStatements12 {
    public static void main(String[] args) {
        //Kullanicidan maas icin bir teklif isteyin 80.000 uzerinde ise
        //Kabul ediyorum, 60-80.000 arası konusabiliriz, 60.000 altı kabul edemem

        Scanner scan=new Scanner(System.in);
        System.out.println("Maas teklifinizi giriniz");
        int maas= scan.nextInt();

        if (maas<60000) {
            System.out.println("Malasef kabul edemem");
        } else if (maas<80000) {
            System.out.println("Konusabiliriz");
        } else {
            System.out.println("Kabul ediyorum");
        }

    }
}
