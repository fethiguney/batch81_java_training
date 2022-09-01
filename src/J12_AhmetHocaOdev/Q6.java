package J12_AhmetHocaOdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {

    /*
    Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
    input : String sehirler[] = {"Trabzon","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
    output: [Çanakkale, Şanlıurfa, İstanbul, Trabzon, Sinop, Hatay, Ordu, Van]
     */


        String sehirler[] = {"Van", "Ordu", "Sinop", "Trabzon", "Hatay", "Çanakkale", "Şanlıurfa", "İstanbul"};

        List<String> ListSehirler = new ArrayList<>();

        for (String each : sehirler) {
            ListSehirler.add(each);
        }
        System.out.println("Şehirler Listi  :" + ListSehirler);
        List<String> listsiralisehir = new ArrayList<>();
        int index = 0;
        int uzunkarakter;

        for (int i = 0; i < ListSehirler.size()-1; i++) {
            uzunkarakter = ListSehirler.get(0).length();
            for (int j = 0; j < ListSehirler.size(); j++) {
                if (ListSehirler.get(j).length() > uzunkarakter) {
                    uzunkarakter = ListSehirler.get(j).length();
                    index = j;
                }
            }
            listsiralisehir.add(ListSehirler.get(index));
            ListSehirler.set(index, "");
        }
        listsiralisehir.add(ListSehirler.get(0));
        System.out.println("Sıralı Şehirler :" + listsiralisehir);


    }
}
