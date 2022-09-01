package J12_AhmetHocaOdev;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        /*
        1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */



        istenilenKelimeyiCikar("merhaba dunya", "dunya");


    }

    public static String istenilenKelimeyiCikar(String str1, String str2) {

        String [] arr=str1.split(" ");
        List <String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equalsIgnoreCase(str2)) {
                list.remove(list.get(i));
            }
        }
        String yeniCumle="";
        for (int i = 0; i <list.size() ; i++) {
            yeniCumle+=list.get(i)+" ";
        }
        System.out.println(yeniCumle);
        return yeniCumle;
    }


}
