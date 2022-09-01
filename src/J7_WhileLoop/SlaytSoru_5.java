package J7_WhileLoop;

public class SlaytSoru_5 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
        yazdirin. Kullanicinin hata yapmadigini farz edin.
        Ornegin kullanici 3 girerse;
        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */

        int sayi=3;
        for (int i = 1; i <=10 ; i++) {
            System.out.print(sayi+"x"+i+"="+sayi*i+" ");
        }
        int baslangic=1;
        int bitis=10;

        System.out.println("");

        while (baslangic<=bitis) {
            System.out.print(sayi+"x"+baslangic+"="+sayi*baslangic+" ");
            baslangic++;
        }



    }
}
