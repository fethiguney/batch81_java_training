package J4_stringManipulations;

public class Soru4 {
    public static void main(String[] args) {
        //Kullanıcıdan isim ve soyisim isteyin
        //hangisinin daha uzun olduğunu yazdirin

        String isim="Fethi";
        String soyIsim="Guney";

        if (isim.length()>soyIsim.length()) {
            System.out.println("isim soyisimden daha uzun");
        } else if (soyIsim.length()>isim.length()) {
            System.out.println("soyisim isimden daha uzun");
        } else {
            System.out.println("isim ve soyisim uzunlukları esit");
        }


    }

}
