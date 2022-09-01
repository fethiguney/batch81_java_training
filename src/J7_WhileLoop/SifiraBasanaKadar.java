package J7_WhileLoop;

import java.util.Scanner;

public class SifiraBasanaKadar {
    public static void main(String[] args) {
       /* Sayı giriliyor. Sıfır girilmediği sürece negatif olanları kendi arasında;
        pozitif olanları kendi arasında topluyor. Sıfır girilirse döngüden çıkıyor ve
        bulduğu sonuçları yazdırıyor.
        */
        Scanner scan = new Scanner(System.in);
        int pozitifToplam=0;
        int negatifToplam=0;
        int negatifSayac = 0;
        int pozitifSayac = 0;
        int sayi=1;

        while(sayi!=0){
            System.out.print("Sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi<0){
                negatifToplam+=sayi;
                negatifSayac++;
            }else if (sayi>0){
                pozitifToplam+=sayi;
                pozitifSayac++;
            }

        }
        System.out.println("negatifToplam = " + negatifToplam + "\n girilen negatif sayi adedi : " + negatifSayac );
        System.out.println("pozitifToplam = " + pozitifToplam + "\n girilen pozitif sayi adedi : " + pozitifSayac);







    }
}
