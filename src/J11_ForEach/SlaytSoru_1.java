package J11_ForEach;

public class SlaytSoru_1 {
    public static void main(String[] args) {

        /*
        Bir integer array olusturunuz ve bu array’deki
        tum sayilarin carpimini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */

        int [] sayilar={1,5,2};

        int toplam=0;

        for (int each:sayilar) {
            toplam+=each*each;
        }
        System.out.println("Array icindeki sayilarin kareleri toplami : "+toplam);
    }
}
