package J7_WhileLoop;

public class SlaytSoru_3 {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degeri ve bitis degeri
        dahil aradalarindaki tum cift tamsayilari
        while loop kullanarak ekrana yazdiriniz.
         */

        int baslangic=0;
        int bitis=20;

        while (baslangic<=bitis) {
            if(baslangic%2==0) {
                System.out.print(baslangic+" ");
            }
            baslangic++;
        }


    }
}
