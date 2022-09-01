package J6_ForLoop;

public class HuseyinHocaSoru3 {
    //Soru 3 : Tabanı ve üssü giriyoruz. Sayının üssünü bulup hesaplıyor.

    public static void main(String[] args) {


        int taban = 2;
        int us = 4;

        int sonuc=1;

        for (int i = 1; i <=us; i++) {

          sonuc*=taban;
            System.out.print(sonuc+" ");
        }
        System.out.println("");
        System.out.println(taban+" uzeri "+us+" = "+sonuc);
    }
}
