package J2_NestedIf;

import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sicaklik degeri girin");
        int sicaklik = scan.nextInt();

        if (sicaklik<5) {
            System.out.println("Kayak");
        } else if (sicaklik<25) {
            if (sicaklik<15) {
                System.out.println("Sinema");
            } else {
                System.out.println("Piknik");
            }
        } else {
            System.out.println("Yuzme");
        }
    }
}
