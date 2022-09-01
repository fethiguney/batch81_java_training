package J10_ArrayList;

import java.util.Arrays;

public class Replit_Eng_Soru_1 {
    public static void main(String[] args) {


        String input="Learning java is easy";
        String aranan="";
        int say;
        int adet=0;
        for (int i = 0; i <input.length() ; i++) {
            say=0;
            for (int j = 0; j <input.length() ; j++) {
                String s1=input.substring(i, i+1);
                String s2=input.substring(j, j + 1);
                if (s1.toLowerCase().equals(s2.toLowerCase())) {
                   say++;
                }
                if (say>adet) {
                    adet=say;
                    aranan=s1;
                }

            }
        }
        System.out.println(aranan);











    }


}



