package J5_MethodCreation;

import java.util.Scanner;

public class C5_MethodCreation {
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.print("1.Sayı : ");
        double s1 = al.nextDouble();
        System.out.print("2.Sayı : ");
        double s2 = al.nextDouble();
        t(s1, s2); // t methoduna atıf yapar, 36. satıra gider ve oradaki işlemi yapar.
        c(s1, s2); // c methoduna atıf yapar, 28. satıra gider ve oradaki işlemi yapar.
        b(s1, s2); // b methoduna atıf yapar, 32. satıra gider ve oradaki işlemi yapar.
        f(s1, s2); // f methoduna atıf yapar, 24. satıra gider ve oradaki işlemi yapar.
        System.out.println("................................"); // ekranı .... ile ayırmak için
        t(20,35); // bu şekilde de t methoduna direk değer göndererek te sayıları toplatabiliriz.
    }
    public static void f(double a, double b) {
        System.out.println("Sayıların Farkı: " + (a - b));
    }
    public static void c(double a, double b) {
        System.out.println("Sayıların Çarpımı: " + (a * b));
    }
    public static void b(double a, double b) {
        System.out.println("Sayıların Bölümü: " + (a / b));
    }
    public static void t(double a, double b) {
        System.out.println("Sayıların Toplamı: " + (a + b));
    }
}
