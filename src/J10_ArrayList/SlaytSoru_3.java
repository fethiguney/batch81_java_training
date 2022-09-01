package J10_ArrayList;

import java.util.*;

public class SlaytSoru_3 {
    public static void main(String[] args) {


    /*
    Kullanici Q'ya basincaya kadar girecegi isimleri alarak
    bir liste olusturup, bu isimleri bir list olarak bize donduren
    bir method olusturun
     */

       List<String> isimlerListesi=girilenIsimlerListeYap();
       System.out.println(isimlerListesi);

    }

    public static List girilenIsimlerListeYap() {
        Scanner scan=new Scanner(System.in);
        String isim="";
        List<String> isimlerListesi=new ArrayList<>();
        do {
            System.out.println("isim giriniz\nislemi sonlandirmak icin Q'ya basiniz");
            isim=scan.nextLine();
            if (!isim.equals("Q")) {
                isimlerListesi.add(isim);
            }
        } while (!isim.equals("Q"));
        return isimlerListesi;
    }
}
