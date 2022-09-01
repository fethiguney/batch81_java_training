package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru8 {
    public static void main(String[] args) {


       String terstenYazdir=terstenYazdirma();
        System.out.println(terstenYazdir);



    }

    private static String  terstenYazdirma() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin girin");
        String str=scan.nextLine();

        String reverseStr=str.substring(str.length()-1);
        for (int i = str.length()-2; i >=0 ; i--) {
            reverseStr+=str.substring(i, i+1);
        }
      return reverseStr;
    }
}
