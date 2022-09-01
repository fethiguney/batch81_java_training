package J1_IfStatements;

import java.util.Scanner;

public class IfStatements6 {
    public static void main(String[] args) {
        //Kullanıcıdan bir karakter girmesini isteyin karakterin harf olup olmadıgını yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='a' && karakter <='z') || (karakter>='A' && karakter<= 'Z')) {
            System.out.println("Girilen karakter bir harf");
        } else {
            System.out.println("Girilen karakter bir harf degil");
        }
    }
}
