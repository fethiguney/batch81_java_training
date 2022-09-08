package J14_ListGroupReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {

        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        System.out.println(Arrays.toString(isimler));

        List<String> isimlerList=new ArrayList<>();
        for (String each: isimler) {
            isimlerList.add(each);
        }

        String eleman3=isimlerList.get(2);

        String eleman8=isimlerList.get(7);

        isimlerList.set(2, eleman8);
        isimlerList.set(7, eleman3);

        System.out.println(isimlerList);






    }
}
