package J4_stringManipulations;

public class ReplaceAll {
    public static void main(String[] args) {

        String isim= "Suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String nameFirstLetter=isim.substring(0,1).toUpperCase();
        String nameLasts=isim.substring(1).replaceAll("\\w", "*");

        String surNameFirstLetter=soyisim.substring(0,1).toUpperCase();
        String surNameLasts=soyisim.substring(1).replaceAll("\\w", "*");

        String cardNumber=kartNo.substring(0,3);
        String cardNumberLasts=" **** **** ****";

        System.out.println(nameFirstLetter+nameLasts+"\n"+
                           surNameFirstLetter+surNameLasts+"\n"+
                           cardNumber+cardNumberLasts);



    }
}
