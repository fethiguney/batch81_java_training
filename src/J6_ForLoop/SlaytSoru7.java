package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru7 {
    public static void main(String[] args) {


        //  String str1="Java";

        //  for (int i = str1.length()-1; i >=0 ; i--) {
        //      System.out.print(str1.charAt(i));
        //  }


        String kelime = "Javaisalsoeasy";
        int index=0;
        String tekOlmayanKarakterler="";
        for (int i = 0; i < kelime.length() ; i++) {
            if (kelime.indexOf(kelime.charAt(i)) != kelime.lastIndexOf(kelime.charAt(i))) {
                index=kelime.lastIndexOf(kelime.charAt(i));

            }

        }System.out.println(tekOlmayanKarakterler);





    }

}

