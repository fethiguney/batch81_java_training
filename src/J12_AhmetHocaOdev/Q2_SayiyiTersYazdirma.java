package J12_AhmetHocaOdev;

public class Q2_SayiyiTersYazdirma {
    public static void main(String[] args) {

        /*
        .
        Kullanıcının girdiği integer sayıyı
        tersten yazdıran kod bloğu yazınız.
        123==>321 yada 1045==>5401 gibi.
         */

        int input=1045;
        String sayi=String.valueOf(input);
        String tersSayi="";
        for (int i = sayi.length()-1; i >=0 ; i--) {
            tersSayi+=sayi.substring(i, i+1);
        }
        System.out.println(tersSayi);








    }
}
