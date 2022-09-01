package J6_ForLoop;

import java.util.Scanner;

public class SlaytSoru10 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("İki sayi girin");
        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();

        int toplam=0;

        if (sayi1<=sayi2) {
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;
            }
        }  else {
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;
            }
        }
        System.out.println("İki sayi arasindaki sayilarin toplami : "+toplam);





    }
}
