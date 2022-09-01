package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi girin");
        int sayi=scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {
            if(i%3==0 || i%5==0) {
                System.out.print(i+" ");
            }
        }





    }
}
