package J11_ForEach;

import java.util.ArrayList;
import java.util.List;

public class SlaytSoru_2 {
    public static void main(String[] args) {

        /*
        Bir integer list olusturunuz ve bu list’deki
        tum sayilarin karesinin toplamini For-each
        loop kullanarak bulunuz. Sonucu ekrana yazdiriniz
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);

        int toplam=0;
        for (int each:sayilar) {
            toplam+=each*each;
        }
        System.out.println("Listedeki sayilarin karelerinin toplami : "+toplam);

    }
}
