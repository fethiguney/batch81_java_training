package J6_ForLoop;

public class R_KarakterKacKezKullanilmis {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        String name =“John came late"
        Number of a = 2
         */

        String name="John came late";
        char c='a';
        int tekrarSayisi=0;

        for (int i = 0; i <name.length() ; i++) {
            if (c==name.charAt(i)) {
                tekrarSayisi++;
            }
        }
        System.out.println("Number of "+c+" = "+tekrarSayisi);







    }
}
