package J9_Arrays;

import java.util.Scanner;

public class Mda_SlaytSoru5 {
    public static void main(String[] args) {


        //Kullanicidan bir cumle isteyin ve
        // cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle=scan.nextLine();

        String [] kelimeler=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi : "+kelimeler.length);





    }
}
