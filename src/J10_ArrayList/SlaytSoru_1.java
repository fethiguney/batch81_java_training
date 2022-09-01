package J10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlaytSoru_1 {
    public static void main(String[] args) {

        //Verilen bir array'deki tekrar eden elementleri yazdirin

        int [] arr={1,2,5,8,2,10,25,5,8,1};

        List <Integer> sayilar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }
       List <Integer> tekrarEdenElementler=new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.indexOf(sayilar.get(i))!=sayilar.lastIndexOf(sayilar.get(i))) {
                if (!tekrarEdenElementler.contains(sayilar.get(i))) {
                    tekrarEdenElementler.add(sayilar.get(i));
                }
            }
        }
        System.out.println("Verilen array icinde tekrar eden elementler : "+tekrarEdenElementler);



    }
}
