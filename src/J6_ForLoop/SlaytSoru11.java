package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru11 {
    public static void main(String[] args) {

        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoriyel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("10'dan kucuk bir tamsayi girin");
        int sayi=scan.nextInt();

        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;
        }
        System.out.println("Girilen sayinin faktoriyeli : "+ faktoriyel);


    }
}
