package J11_ForEach;

import java.util.Arrays;

public class SlaytSoru_4 {
    public static void main(String[] args) {

        /*
        Bir String olusturunuz, bu String’deki character’leri
        for-each loop kullanarak yazdiriniz


        String input="Her gecen gun Java'yi daha iyi ogreniyorum.";
        String [] karakterler=input.split("");
        System.out.println(Arrays.toString(karakterler));
         */

        int [] sayilar={1232, 1134,2345,1022};
        String [] programlar={"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(sayilar);
        Arrays.sort(programlar);

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(programlar));



    }
}
