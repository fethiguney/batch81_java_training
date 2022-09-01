package J4_stringManipulations;

public class Soru3 {
    public static void main(String[] args) {

        //Kullanıcıdan isim isteyin
        //isim a harfi iceriyorsa girdiğiniz isim a harfi iceriyor
        //isim Z harfi iceriyorsa girdiğiniz isim Z harfi iceriyor
        //ikisini de iceriyorsa girdiğiniz isim a ve Z harfi iceriyor
        //ikisi de yoksa isim a veya Z harfi icermiyor

        String isim="Ahmet Zan";

        if (isim.contains("a") && isim.contains("Z")) {
            System.out.println("isim a ve Z harfi iceriyor");
        } else if (isim.contains("a")) {
            System.out.println("isim a harfi iceriyor");
        } else if (isim.contains("Z")) {
            System.out.println("isim Z harfi iceriyor");
        } else  {
            System.out.println("isim a veya Z harfi icermiyor");
        }

    }
}
