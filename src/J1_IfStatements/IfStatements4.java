package J1_IfStatements;

import java.util.Scanner;

public class IfStatements4 {
    public static void main(String[] args) {
        //Kullanıcıdan dikdortgenin kenar uzunluklarını isteyin dikdortgenin
        //kare olup olmadıgını yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("A kenarının uzunlugunu girin");
        int kenarA= scan.nextInt();
        System.out.println("B kenarının uzunlugunu girin");
        int kenarB= scan.nextInt();

        if(kenarA==kenarB) {
            System.out.println("Bu bir kare");
        } else {
            System.out.println("Kare degil");
        }

    }
}
