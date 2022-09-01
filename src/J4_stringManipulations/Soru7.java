package J4_stringManipulations;

public class Soru7 {
    public static void main(String[] args) {
        /*
        Kullanıcı ismini, soyismini ve kredi kartı bilgisini isteyin
        ve asagidaki gibi yazdirin
        isim-soyisim : M*** B***
        kart no : **** **** **** 1234
         */

        String isim="Fethi", soyIsim="Guney", kartNo="1234 1234 1234 1234";

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimKalan=isim.substring(1).replaceAll("\\w", "*");
        String soyIsimIlkHarf=soyIsim.substring(0,1).toUpperCase();
        String soyIsimKalan=soyIsim.substring(1).replaceAll("\\w", "*");
        String kartSon=kartNo.substring(15);
        String kartKalan="**** **** **** ";

        System.out.println("isim-soyisim : "+isimIlkHarf+isimKalan+
                            soyIsimIlkHarf+soyIsimKalan+ "\n"+
                            "kart no : "+kartKalan+kartSon);




    }
}
