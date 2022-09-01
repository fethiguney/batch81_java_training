package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin girin");
        String str=scan.nextLine();

        String strReverse=str.substring(str.length()-1);
        for (int i = str.length()-2; i >=0 ; i--) {
            strReverse+=str.substring(i, i+1);
        }
        if (str.equals(strReverse)) {
            System.out.println("Girdiginiz metin palindrome");
        } else System.out.println("Girdiginiz metin palindrome degil");





    }
}
