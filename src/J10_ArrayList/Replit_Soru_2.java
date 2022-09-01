package J10_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Replit_Soru_2 {
    public static void main(String[] args) {

        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

        Array List: siyah,mavi,kirmizi,beyaz
        en başa: pembe
        mavi-kirmizi arasına yesil renk eklenecek.

        Beklenen Çıktı:
        [pembe,siyah,mavi,yesil,kirmizi,beyaz]
         */

        List <String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");

        list.add(0,"pembe");
        list.add(3, "yesil");

        System.out.println(list);




    }
}
