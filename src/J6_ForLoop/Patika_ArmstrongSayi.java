package J6_ForLoop;

public class Patika_ArmstrongSayi {
    public static void main(String[] args) {

        /*
        Tüm basamaklarındaki rakamların sayı değerlerinin küpleri toplamı,
         kendisine eşit olan sayılara "Armstrong sayı" denir.
         Diğer bir deyişle her bir basamağın o sayının basamak
         sayısı kadar üssü alınarak toplanmasıdır.
         Eğer toplam bu sayıyı veriyorsa o sayı Armstrong Sayıdır
         */

        int sayi=1634;
        int basamakSayisi=0;
        int tempNumber=sayi;
        int basamakDegeri;
        int sonuc=0;
        int basamakUssu;

        while(tempNumber!=0) {
            tempNumber/=10;
            basamakSayisi++;
        }
        tempNumber=sayi;
        while (tempNumber!=0) {
            basamakDegeri=tempNumber%10;
            tempNumber/=10;
            basamakUssu=1;
            for (int i = 1; i <=basamakSayisi ; i++) {
                basamakUssu*=basamakDegeri;
            }
            sonuc+=basamakUssu;

        }

        if(sayi==sonuc) {
            System.out.println(sayi+" sayisi Armstrong bir sayidir");
        } else {
            System.out.println(sayi+" sayisi Armstrong bir sayi degildir");
        }




    }
}
