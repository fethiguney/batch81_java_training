package J2_NestedIf;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("a sayisini girin :");
        int a=scan.nextInt();
        System.out.print("b sayisini girin :");
        int b=scan.nextInt();
        System.out.print("c sayisini girin :");
        int c=scan.nextInt();

        if (a>b && a>c) {
            if (b>c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }
        } else if (b>a && b>c) {
            if (a>c) {
                System.out.println("c<a<b");
            } else {
                System.out.println("a<c<b");
            }
        } else {
            if (b>a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<a<c");
            }
        }



    }
}

