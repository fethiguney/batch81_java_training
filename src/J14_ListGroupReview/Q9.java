package J14_ListGroupReview;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {

        /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */

        String input="Learning java is easy";

        String [] arr=input.toLowerCase().replaceAll("\\W", "").split("");

        System.out.println(Arrays.toString(arr));

        Map<String, Integer> harfSayilariMap=new HashMap<>();

        int harfKullanımSayiadedi;
        for (String each: arr) {
            if (!harfSayilariMap.containsKey(each)) {
                harfSayilariMap.put(each, 1);
            } else{
                harfKullanımSayiadedi=harfSayilariMap.get(each);
                harfSayilariMap.put(each, ++harfKullanımSayiadedi);
            }
        }
        System.out.println(harfSayilariMap);



        Set<Map.Entry<String,Integer>> harflerEntrySeti=harfSayilariMap.entrySet();

        
        int maxCount=0;
        String harf="";

        for (Map.Entry<String, Integer> each: harflerEntrySeti) {
            if (each.getValue()>maxCount) {
                maxCount=each.getValue();
                harf=each.getKey();
            }
        }
        System.out.println("Maksimum karakter ve sayisi : "+harf+"="+maxCount);







    }
}
