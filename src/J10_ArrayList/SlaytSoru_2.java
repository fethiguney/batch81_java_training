package J10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlaytSoru_2 {
    public static void main(String[] args) {
        /*
        Verilen bir array'deki unique elementleri yeni bir
        array olarak donduren bir method olusturun
         */


        String[] isimler = {"Mustafa", "Ayse", "Ahmet", "Alperen", "Ahmet", "Zehra", "Ayse", "Mustafa"};

        String [] tekIsimler=arrayUniqueKarakterler(isimler);
        System.out.println(Arrays.toString(tekIsimler));


    }

    public static String[] arrayUniqueKarakterler(String[] isimler) {
        List<String> isimler1 = new ArrayList<>();
        for (int i = 0; i < isimler.length; i++) {
            isimler1.add(isimler[i]);
        }
        List<String> listTekIsimler = new ArrayList<>();
        for (int i = 0; i < isimler1.size(); i++) {
            if (isimler1.indexOf(isimler1.get(i))==isimler1.lastIndexOf(isimler1.get(i))) {
                listTekIsimler.add(isimler1.get(i));
            }
        }
        String[] arrTekIsimler = new String[listTekIsimler.size()];
        arrTekIsimler = listTekIsimler.toArray(arrTekIsimler);

        return arrTekIsimler;
    }
}


