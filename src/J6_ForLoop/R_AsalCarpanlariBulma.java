package J6_ForLoop;

public class R_AsalCarpanlariBulma {
    public static void main(String[] args) {

        int girilenSayi=30;
        for (int i = 2; i < girilenSayi; i++) {
            while (girilenSayi % i == 0) { //i ile bölümünden kalan 0 ise
                System.out.print(i + " ");
                girilenSayi = girilenSayi / i;
            }
        }
        if (girilenSayi > 2) {
            System.out.print(girilenSayi);
        }






    }
}
