package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru6 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir tam sayi girin");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%15==0) {
                System.out.print("Java Guzeldir"+" ");
            } else if (i%3==0) {
                System.out.print("Java"+" ");
            } else if (i%5==0) {
                System.out.print("Guzeldir"+" ");
            } else{
                System.out.print(i+" ");
            }
        }





    }
}
