package J7_WhileLoop;

public class SlaytSoru_7 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve
        bu sayinin rakamlari toplamini yazdirin
         */

        int input=12563;
        int rakamlarToplami=0;
        int basamakDegerleri=0;
        int temp=input;

        while (temp>0) {
            basamakDegerleri=temp%10;
            rakamlarToplami+=basamakDegerleri;
            temp/=10;


        }
        System.out.println(input+" sayisinin rakamlar toplami : "+rakamlarToplami);



    }
}
