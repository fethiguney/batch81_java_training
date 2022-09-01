package J7_WhileLoop;

public class SlaytSoru_4 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis
        harfinde biten tum harfleri
        buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata
        yapmadigini farz edin.
         */

        char baslangic='a';
        char bitis='f';
        String buyukHarf="";
        while (baslangic<=bitis) {
            buyukHarf=String.valueOf(baslangic);
            System.out.println(buyukHarf.toUpperCase()+" ");
            baslangic++;
        }

    }
}
