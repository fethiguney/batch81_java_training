package J14_ListGroupReview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {


        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        List<String> isimler=new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Omer");

        System.out.println("isimler listesi ilk hali : "+isimler);

        isimler.removeIf(t-> t.contains("a") || t.contains("A"));

        System.out.println("isimler listesi son hali : "+isimler);


    }
}
