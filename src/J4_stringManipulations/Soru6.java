package J4_stringManipulations;

public class Soru6 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir sifre girmesini isteyin
        Asagıdaki sartları saglıyorsa "sifre basari ile tamamlandı"
        saglamıyorsa "islem basarisiz lutfen yeni bir sifre yazin" yazdirin
        ilk harf buyuk olmalı
        son harf kucuk olmalı
        sifre bosluk icermemeli
        sifre uzunluğu en az sekiz karakter olmalı
         */

        String sifre = "Javajavaa";

        char sifreIlkharf=sifre.charAt(0);
        char sifreSonharf=sifre.charAt(sifre.length() - 1);

            if  ((sifreIlkharf >= 'A' && sifreIlkharf <= 'Z') &&
                (sifreSonharf >= 'a' && sifreSonharf <= 'z') &&
                (!sifre.contains(" ")) && (sifre.length()>=8)) {
                 System.out.println("sifre basari ile tamamlandı");
        }   else {
            System.out.println("islem basarisiz lutfen yeni bir sifre yazin");
        }




    }
}
