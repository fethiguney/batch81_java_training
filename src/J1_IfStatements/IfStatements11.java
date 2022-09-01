package J1_IfStatements;

import java.util.Scanner;

public class IfStatements11 {
    public static void main(String[] args) {
        //Kullanicidan 100 üzerinden not isteyin Not 50'den kucukse D,
        //50-60 arasi C, 60-80 arasi B, 80 üzeri A yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not=scan.nextInt();

        if (not<50) {
            System.out.println("Notunuz = D");
        } else if (not<60) {
            System.out.println("Notunuz = C");
        } else if (not<80) {
            System.out.println("Notunuz = B");
        } else {
            System.out.println("Notunuz = A");
        }


    }
}
