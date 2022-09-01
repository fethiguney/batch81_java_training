package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir sayi girin");
        int sayi1=scan.nextInt();

        for (int i = 1; i <=sayi1 ; i++) {
            if (i%3==0) {
                System.out.print(i+" ");
            }
        }




    }
}
