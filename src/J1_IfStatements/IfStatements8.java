package J1_IfStatements;

import java.util.Scanner;

public class IfStatements8 {
    public static void main(String[] args) {
        //Kullanıcıdan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana eskenar ucgen yazdirin, degilse eskenar degil
        //yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("ucgenin a kenar uzunlugunu girin");
        int kenarA= scan.nextInt();
        System.out.println("ucgenin b kenar uzunlugunu girin");
        int kenarB= scan.nextInt();
        System.out.println("ucgenin c kenar uzunlugunu girin");
        int kenarC= scan.nextInt();

        if (kenarA==kenarB && kenarB==kenarC){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }

    }
}
